
	const __sfc__ = defineComponent({
		data() {
			return {
				devicePosition: "back",
				flash: "off",
				frameSize: "medium",
				listener: null as CameraContextCameraFrameListener | null,
				maxZoom: 0,
				imageSrc: "",
				quality: "normal",
				timeout: 30,
				compressed: false,
				videoSrc: "",
				startRecordStatus: false,
				remain: 0,
				intervalId: -1,
				timeoutStr: '30'
			}
		},
		onLoad() {

		},

		methods: {
			handleScanCode() {
        		uni.navigateTo({
          			url:"/pages/component/camera/camera-scan-code"
        		})
      		},
			switchDevicePosition() {
				this.devicePosition = this.devicePosition == "back" ? "front" : "back"
			},

			switchFlash() {
				this.flash = this.flash == "torch" ? "off" : "torch"
			},

			handleStop(e : UniCameraStopEvent) {
				console.log("stop", e.detail, " at pages/component/camera/camera.uvue:111");
			},
			handleError(e : UniCameraErrorEvent) {
				console.log("error", e.detail, " at pages/component/camera/camera.uvue:114");
			},
			handleInitDone(e : UniCameraInitDoneEvent) {
				console.log("initdone", e.detail, " at pages/component/camera/camera.uvue:117");
				this.maxZoom = e.detail.maxZoom ?? 0
			},
			zoomSliderChange(event : UniSliderChangeEvent) {
				const value = event.detail.value
				const context = uni.createCameraContext();
				context?.setZoom({
					zoom: value,
					success: (e : any) => {
						console.log(e, " at pages/component/camera/camera.uvue:126");
					}
				} as CameraContextSetZoomOptions)
			},
			handleTakePhoto() {
				const context = uni.createCameraContext();
				context?.takePhoto({
					quality: this.quality,
					selfieMirror: false,
					success: (res : CameraContextTakePhotoResult) => {
						console.log("res.tempImagePath", res.tempImagePath, " at pages/component/camera/camera.uvue:136");
						this.imageSrc = res.tempImagePath ?? ''
					},
					fail: (e : any) => {
						console.log("take photo", e, " at pages/component/camera/camera.uvue:140");
					}
				} as CameraContextTakePhotoOptions)
			},
			takePhotoQualityChange(event : UniRadioGroupChangeEvent) {
				this.quality = event.detail.value
				console.log("quality", this.quality, " at pages/component/camera/camera.uvue:146");
			},

			setOnFrameListener() {
				const context = uni.createCameraContext();
				this.listener = context?.onCameraFrame((frame : CameraContextOnCameraFrame) => {
					console.log("OnFrame :", frame, " at pages/component/camera/camera.uvue:152");
				})
			},
			startFrameListener() {
				this.listener?.start({
					success: (res : any) => {
						console.log("startFrameListener success", res, " at pages/component/camera/camera.uvue:158");
					}
				} as CameraContextCameraFrameListenerStartOptions)

			},
			stopFrameListener() {
				this.listener?.stop({
					success: (res : any) => {
						console.log("stopFrameListener success", res, " at pages/component/camera/camera.uvue:166");
					}
				} as CameraContextCameraFrameListenerStopOptions)
			},
			startRecord() {
				const context = uni.createCameraContext();
				let timeout = this.getTimeout()
				this.timeout = timeout
				context?.startRecord({
					timeout: timeout,
					selfieMirror: false,
					timeoutCallback: (res : any) => {
						console.log("timeoutCallback", res, " at pages/component/camera/camera.uvue:178");
						this.startRecordStatus = false
						if (typeof res != "string") {
							const result = res as CameraContextStartRecordTimeoutResult
							this.videoSrc = result.tempVideoPath ?? ''
						}
						clearInterval(this.intervalId)
					},
					success: (res : any) => {
						this.startRecordStatus = true
						console.log("start record success", res, " at pages/component/camera/camera.uvue:188");
						this.remain = timeout
						this.intervalId = setInterval(() => {
							if (this.remain <= 0) {
								clearInterval(this.intervalId)
							} else {
								this.remain--
							}
						}, 1000)
					},
					fail: (res : any) => {
						console.log("start record fail", res, " at pages/component/camera/camera.uvue:199");
						this.startRecordStatus = false
						this.remain = 0
						clearInterval(this.intervalId)
					}
				} as CameraContextStartRecordOptions)
			},
			stopRecord() {
				this.startRecordStatus = false
				const context = uni.createCameraContext();
				context?.stopRecord({
					compressed: this.compressed,
					success: (res : CameraContextStopRecordResult) => {
						console.log("stop record success", res, " at pages/component/camera/camera.uvue:212");
						this.videoSrc = res.tempVideoPath ?? ''
					},
					fail: (res : any) => {
						console.log("stop record fail", res, " at pages/component/camera/camera.uvue:216");
					}
				} as CameraContextStopRecordOptions)
        clearInterval(this.intervalId)
        this.remain = 0
			},
			startRecordCompressChange(event : UniRadioGroupChangeEvent) {
				this.compressed = parseInt(event.detail.value) == 1
			},
			timeoutInput(event : UniInputEvent) {
				this.timeoutStr = event.detail.value
			},
			getTimeout() : number {
				let value = parseInt(this.timeoutStr)
				if (Number.isNaN(value)) {
					return 30
				} else {
					if (value < 1) {
						return 1
					} else if (value > 60 * 5) {
						return 60 * 5
					} else {
						return value
					}
				}
			}
		}
	})

export default __sfc__
function GenPagesComponentCameraCameraRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_camera = resolveComponent("camera", true)
const _component_slider = resolveComponent("slider")
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")

  return _cE("view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_camera, _uM({
      style: _nS(_uM({"width":"100%","height":"300px"})),
      resolution: 'medium',
      "device-position": _ctx.devicePosition,
      "photo-resolution": "high",
      flash: _ctx.flash,
      "frame-size": _ctx.frameSize,
      onStop: _ctx.handleStop,
      onError: _ctx.handleError,
      onInitdone: _ctx.handleInitDone
    }), null, 8 /* PROPS */, ["style", "device-position", "flash", "frame-size", "onStop", "onError", "onInitdone"]),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1"}))
    }), [
      _cE("view", null, [
        _cE("button", _uM({
          type: "default",
          onClick: _ctx.handleScanCode
        }), "扫码", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          type: "default",
          onClick: _ctx.switchDevicePosition
        }), "切换前后摄像头", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          type: "default",
          onClick: _ctx.switchFlash
        }), "闪光灯", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          type: "default",
          onClick: _ctx.setOnFrameListener
        }), "设置帧数据监听", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          type: "default",
          onClick: _ctx.startFrameListener
        }), "开始捕捉帧数据", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          type: "default",
          onClick: _ctx.stopFrameListener
        }), "停止捕捉帧数据", 8 /* PROPS */, ["onClick"]),
        _cE("view", null, [
          _cE("view", _uM({ class: "uni-title" }), [
            _cE("text", _uM({ class: "uni-title-text" }), "设置预览缩放")
          ]),
          _cE("view", _uM({ class: "uni-camera-wrapper" }), [
            _cV(_component_slider, _uM({
              class: "uni-camera-test-host",
              disabled: _ctx.maxZoom == 0,
              "show-value": true,
              min: 1,
              max: _ctx.maxZoom,
              value: 1,
              onChange: _ctx.zoomSliderChange
            }), null, 8 /* PROPS */, ["disabled", "max", "onChange"])
          ])
        ]),
        _cE("view", null, [
          _cE("view", _uM({ class: "uni-title" }), [
            _cE("text", _uM({ class: "uni-title-text" }), "拍摄照片示例"),
            _cE("button", _uM({
              type: "default",
              onClick: _ctx.handleTakePhoto
            }), "拍摄照片", 8 /* PROPS */, ["onClick"]),
            _cV(_component_radio_group, _uM({
              style: _nS(_uM({"flex-direction":"row"})),
              name: "成像质量",
              onChange: _ctx.takePhotoQualityChange
            }), _uM({
              default: withSlotCtx((): any[] => [
                _cV(_component_radio, _uM({
                  value: "normal",
                  checked: true
                }), _uM({
                  default: withSlotCtx((): any[] => ["普通质量"]),
                  _: 1 /* STABLE */
                })),
                _cV(_component_radio, _uM({ value: "low" }), _uM({
                  default: withSlotCtx((): any[] => ["低质量"]),
                  _: 1 /* STABLE */
                })),
                _cV(_component_radio, _uM({ value: "high" }), _uM({
                  default: withSlotCtx((): any[] => ["高质量"]),
                  _: 1 /* STABLE */
                })),
                _cV(_component_radio, _uM({ value: "original" }), _uM({
                  default: withSlotCtx((): any[] => ["原图"]),
                  _: 1 /* STABLE */
                }))
              ]),
              _: 1 /* STABLE */
            }), 8 /* PROPS */, ["style", "onChange"])
          ]),
          _cE("view", _uM({ class: "uni-camera-wrapper" }), [
            _ctx.imageSrc != ''
              ? _cE("image", _uM({
                  key: 0,
                  class: "uni-camera-test-host-without-flex",
                  style: _nS(_uM({"width":"150px","height":"150px"})),
                  src: _ctx.imageSrc
                }), null, 12 /* STYLE, PROPS */, ["src"])
              : _cC("v-if", true)
          ])
        ]),
        _cE("view", null, [
          _cE("view", _uM({ class: "uni-title" }), [
            _cE("text", _uM({ class: "uni-title-text" }), "录制视频示例"),
            _cE("view", _uM({
              style: _nS(_uM({"flex-direction":"row","margin-top":"8px"}))
            }), [
              _cE("text", _uM({ class: "uni-title-size" }), "录制时长："),
              _cE("input", _uM({
                class: "uni-title-size",
                style: _nS(_uM({"width":"50px","margin-left":"10px","border":"0.5px solid grey","text-align":"right"})),
                type: "number",
                onInput: _ctx.timeoutInput,
                value: _ctx.timeout
              }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onInput", "value"]),
              _cE("text", _uM({
                class: "uni-title-size",
                style: _nS(_uM({"margin-left":"8px"}))
              }), "秒", 4 /* STYLE */)
            ], 4 /* STYLE */),
            _cE("button", _uM({
              type: "default",
              style: _nS(_uM({"font-family":"monospace","margin-top":"8px"})),
              onClick: _ctx.startRecord,
              disabled: _ctx.startRecordStatus
            }), _tD(_ctx.startRecordStatus ? `${_ctx.remain}秒` : "录制视频"), 13 /* TEXT, STYLE, PROPS */, ["onClick", "disabled"]),
            _cE("button", _uM({
              type: "default",
              onClick: _ctx.stopRecord
            }), "停止录制", 8 /* PROPS */, ["onClick"]),
            _cV(_component_radio_group, _uM({
              style: _nS(_uM({"flex-direction":"row","margin-top":"8px"})),
              name: "是否压缩",
              onChange: _ctx.startRecordCompressChange
            }), _uM({
              default: withSlotCtx((): any[] => [
                _cV(_component_radio, _uM({
                  value: "0",
                  checked: true
                }), _uM({
                  default: withSlotCtx((): any[] => ["未启动视频压缩"]),
                  _: 1 /* STABLE */
                })),
                _cV(_component_radio, _uM({ value: "1" }), _uM({
                  default: withSlotCtx((): any[] => ["启动视频压缩"]),
                  _: 1 /* STABLE */
                }))
              ]),
              _: 1 /* STABLE */
            }), 8 /* PROPS */, ["style", "onChange"])
          ]),
          _cE("view", _uM({ class: "uni-camera-wrapper" }), [
            _ctx.videoSrc != ''
              ? _cE("video", _uM({
                  key: 0,
                  class: "uni-camera-test-host-without-flex",
                  style: _nS(_uM({"width":"300px","height":"300px"})),
                  src: _ctx.videoSrc,
                  controls: true
                }), null, 12 /* STYLE, PROPS */, ["src"])
              : _cC("v-if", true)
          ])
        ])
      ])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesComponentCameraCameraStyles = [_uM([["uni-title", _pS(_uM([["paddingTop", 10], ["paddingRight", 0], ["paddingBottom", 10], ["paddingLeft", 0]]))], ["uni-title-text", _pS(_uM([["fontSize", 15], ["fontWeight", "bold"]]))], ["uni-camera-wrapper", _pS(_uM([["display", "flex"], ["paddingTop", 8], ["paddingRight", 13], ["paddingBottom", 8], ["paddingLeft", 13], ["marginTop", 5], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0], ["flexDirection", "row"], ["flexWrap", "nowrap"], ["backgroundColor", "#ffffff"]]))], ["uni-camera-test-host", _pS(_uM([["height", 28], ["paddingTop", 0], ["paddingRight", 0], ["paddingBottom", 0], ["paddingLeft", 0], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["backgroundColor", "#ffffff"]]))], ["uni-camera-test-host-without-flex", _pS(_uM([["height", 28], ["paddingTop", 0], ["paddingRight", 0], ["paddingBottom", 0], ["paddingLeft", 0], ["backgroundColor", "#ffffff"]]))], ["uni-title-size", _pS(_uM([["fontSize", 22]]))]])]
