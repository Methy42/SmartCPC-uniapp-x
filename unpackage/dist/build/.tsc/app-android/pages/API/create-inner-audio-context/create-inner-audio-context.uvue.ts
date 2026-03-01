
	const audioUrl = 'https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3'
	const __sfc__ = defineComponent({
		data() {
			return {
				title: "innerAudioContext",
				currentTime: 0,
				duration: 100,
				startTime: 0,
				buffered: 0,
				volume: 0.5,
				isCanplay: false,
				isPlaying: false,
				isPaused: true,
				isPlayEnd: false,
				_isChanging: false,
				_audioContext: null as InnerAudioContext | null,
				// 自动化测试
				onSeekingTest: false,
				onSeekedTest: false,
				onWaitingTest: false,
				playbackRateChecked: true,
				onTimeUpdateCb: (res : any) => { },
				onWaitingCb: (res : any) => { }
			}
		},
		computed: {
			position() {
				return this.isPlayEnd ? 0 : this.currentTime;
			},
		},
		onReady() {
			this._audioContext = uni.createInnerAudioContext();
			this._audioContext!.src = audioUrl;
			this.volume = this._audioContext!.volume;
			this.onCanplay()
			this._audioContext!.onPlay(() => {
				this.isPaused = false;
				this.isPlaying = true;
				console.log('开始播放', this.isPaused);
			});

			this.onTimeUpdateCb = (res : any) => {
				if (this._isChanging) { return; }
				this.currentTime = this._audioContext!.currentTime;
				this.buffered = this._audioContext!.buffered;
				console.log('onTimeUpdateCb', this.currentTime)








				if (this.currentTime > this.buffered) {
					console.log('缓冲不足');
				}
			};

			this.onWaitingCb = (res : any) => {
				console.log('音频加载中事件');
				this.onWaitingTest = true
			}

			this.onTimeUpdate()
			// this.onWaiting()
			this.onError()
			this.onEnded()
		},
		onUnload() {
			if (this._audioContext != null) {
				if (this.isPlaying) {
					this.stop();
				}
				this._audioContext!.destroy()
			}
		},
		methods: {
			onCanplay() {
				this._audioContext!.onCanplay(() => {
					console.log('音频进入可以播放状态事件');
					this.isCanplay = true;




					// 当音频可以播放时，获取缓冲信息
					this.buffered = this._audioContext!.buffered;
					this.duration = this._audioContext!.duration
				});
			},
			onchanging() {
				this._isChanging = true;
			},
			onchange(e : UniSliderChangeEvent) {
				let pos = e.detail.value;
				console.log('pos', pos);
				this.onSeeking()
				this.onSeeked()
				this._audioContext!.seek(pos);
				this._isChanging = false;
			},
			onchangeValue(pos : number) {
				this.onSeeking()
				this.onSeeked()
				this._audioContext!.seek(pos);
				this._isChanging = false;
			},
			startTimeInput(e : UniInputEvent) {
				let startTimeValue = parseInt(e.detail.value)
				this._audioContext!.startTime = startTimeValue;
				this.onchangeValue(startTimeValue)
			},
			setAutoplay() {
				this._audioContext!.autoplay = !this._audioContext!.autoplay;
				console.log(this._audioContext!.autoplay, 'autoplay');
			},
			setLoop() {
				this._audioContext!.loop = !this._audioContext!.loop;
				console.log(this._audioContext!.loop, 'loop');
			},
			play() {
				if (!this.isCanplay) {
					uni.showToast({
						title: '音频未进入可以播放状态，请稍后再试',
						icon: 'error'
					});
					return;
				}
				this.isPlaying = true;
				this._audioContext!.play();
				this.isPlayEnd = false;
				if (this._audioContext!.startTime > 0) {
					this.onchangeValue(this._audioContext!.startTime)
				}
			},
			onSeeking() {
				this._audioContext!.onSeeking(() => {
					console.log('音频进行 seek 操作事件');
					this.onSeekingTest = true
				});
			},
			onSeeked() {
				this._audioContext!.onSeeked(() => {
					console.log('音频完成 seek 操作事件');
					this.onSeekedTest = true
				});
			},
			onWaiting() {
				this._audioContext!.onWaiting(this.onWaitingCb);
			},
			offWaiting() {
				this._audioContext!.offWaiting(this.onWaitingCb);
			},
			onTimeUpdate() {
				this._audioContext!.onTimeUpdate(this.onTimeUpdateCb);
			},
			offTimeUpdate() {
				this._audioContext!.offTimeUpdate(this.onTimeUpdateCb);
			},
			increaseVolume() {
				this.volume = Math.min(this.volume + 0.1, 1);
				this.volume = parseFloat(this.volume.toFixed(1));
				this._audioContext!.volume = this.volume
				console.log('增加音量', this.volume);
			},
			decreaseVolume() {
				this.volume = Math.max(this.volume - 0.1, 0);
				this.volume = parseFloat(this.volume.toFixed(1));
				console.log('减少音量', this.volume);
				this._audioContext!.volume = this.volume
			},
			onEnded() {
				this._audioContext!.onEnded(() => {
					console.log('播放结束');
					this.currentTime = 0;
					this.startTime = 0
					this.isPlaying = false;
					this.isPaused = true;
					this.isPlayEnd = true;
					(this.$refs["slider"] as UniSliderElement).value = 0
				});
			},
			onError() {
				this._audioContext!.onError((err) => {
					console.log('err', err);
					this.isPlaying = false;
					this.isPaused = true;
				});
			},
			pause() {
				this._audioContext!.onPause(() => {
					console.log('音频暂停事件');
					this.isPaused = true;
				});
				this._audioContext!.pause();
				this.isPlaying = false;
			},
			stop() {
				console.log('stop');
				this._audioContext!.onStop(() => {
					// 第一次点停止时，不触发
					this.isPaused = true;
					console.log('音频停止事件');
				});
				this._audioContext!.stop();
				this.isPlaying = false;
				console.log('stop', this.isPaused);
			},
			destory() {
				if (this._audioContext != null) {
					this.isPlaying = false;
					this._audioContext!.destroy()
				}
			},
			playbackRateChange(e : UniRadioGroupChangeEvent) {
				// if (this._audioContext != null && this.isPlaying) {
					console.log(parseFloat(e.detail.value))
					this._audioContext!.playbackRate = parseFloat(e.detail.value)
				// }
			},
      //just for test
      setSrc(src:string){
        if(	this._audioContext!=null){
          this._audioContext!.src = src
        }
      }
		}
	})

export default __sfc__
function GenPagesAPICreateInnerAudioContextCreateInnerAudioContextRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_slider = resolveComponent("slider")
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_navigator = resolveComponent("navigator")

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cV(_component_page_head, _uM({ title: "audio" })),
      _cE("view", _uM({ class: "uni-common-mt" }), [
        _cV(_component_slider, _uM({
          ref: "slider",
          value: _ctx.position,
          min: 0,
          max: _ctx.duration,
          onChanging: _ctx.onchanging,
          onChange: _ctx.onchange
        }), null, 8 /* PROPS */, ["value", "max", "onChanging", "onChange"])
      ]),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "属性示例")
      ]),
      _cE("text", _uM({ class: "uni-text-box uni-common-mt" }), "当前音频播放位置（保留小数点后 3 位）：" + _tD(_ctx.currentTime) + " s", 1 /* TEXT */),
      _cE("text", _uM({ class: "uni-text-box" }), "音频的长度（单位:s）：" + _tD(_ctx.duration) + " s", 1 /* TEXT */),
      _cE("text", _uM({ class: "uni-text-box" }), "当前是否停止状态：" + _tD(_ctx.isPaused), 1 /* TEXT */),
      _cE("text", _uM({ class: "uni-text-box" }), "音频缓冲的时间点：" + _tD(_ctx.buffered) + " s", 1 /* TEXT */),
      _cE("text", _uM({ class: "uni-text-box" }), "当前音量：" + _tD(_ctx.volume), 1 /* TEXT */),
      _cE("button", _uM({
        plain: "",
        disabled: _ctx.volume == 1,
        onClick: _ctx.increaseVolume
      }), "增加音量", 8 /* PROPS */, ["disabled", "onClick"]),
      _cE("button", _uM({
        plain: "",
        disabled: _ctx.volume == 0,
        onClick: _ctx.decreaseVolume
      }), "减少音量", 8 /* PROPS */, ["disabled", "onClick"]),
      _cE("text", _uM({ class: "uni-subtitle-text uni-title" }), "开始播放的位置（单位：s）"),
      _cE("input", _uM({
        value: _ctx.startTime,
        type: "number",
        placeholder: "开始播放的位置（单位：s）",
        class: "uni-input",
        onInput: _ctx.startTimeInput
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onInput"]),
      _cV(_component_boolean_data, _uM({
        defaultValue: false,
        title: "是否自动开始播放",
        onChange: _ctx.setAutoplay
      }), null, 8 /* PROPS */, ["onChange"]),
      _cV(_component_boolean_data, _uM({
        defaultValue: false,
        title: "是否循环播放",
        onChange: _ctx.setLoop
      }), null, 8 /* PROPS */, ["onChange"]),
      _cE("text", _uM({
        class: "uni-subtitle-text uni-title",
        style: _nS(_uM({"padding-left":"10px","padding-top":"10px","padding-right":"10px"}))
      }), "播放倍率(Web/HarmonyOS 不支持)", 4 /* STYLE */),
      _cV(_component_radio_group, _uM({
        class: "uni-flex uni-row radio-group",
        onChange: _ctx.playbackRateChange,
        style: _nS(_uM({"flex-wrap":"wrap","padding":"10px"}))
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cV(_component_radio, _uM({
            value: "0.5",
            style: _nS(_uM({"margin-right":"3px"}))
          }), _uM({
            default: withSlotCtx((): any[] => ["0.5 "]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["style"]),
          _cV(_component_radio, _uM({
            value: "0.8",
            style: _nS(_uM({"margin-right":"3px"}))
          }), _uM({
            default: withSlotCtx((): any[] => ["0.8"]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["style"]),
          _cV(_component_radio, _uM({
            value: "1.0",
            style: _nS(_uM({"margin-right":"3px"})),
            checked: _ctx.playbackRateChecked
          }), _uM({
            default: withSlotCtx((): any[] => ["1.0"]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["style", "checked"]),
          _cV(_component_radio, _uM({
            value: "1.25",
            style: _nS(_uM({"margin-right":"3px"}))
          }), _uM({
            default: withSlotCtx((): any[] => ["1.25"]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["style"]),
          _cV(_component_radio, _uM({
            value: "1.5",
            style: _nS(_uM({"margin-right":"3px"}))
          }), _uM({
            default: withSlotCtx((): any[] => ["1.5"]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["style"]),
          _cV(_component_radio, _uM({ value: "2.0" }), _uM({
            default: withSlotCtx((): any[] => ["2.0"]),
            _: 1 /* STABLE */
          }))
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["onChange", "style"]),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "方法示例")
      ]),
      _cE("button", _uM({
        disabled: _ctx.isPlaying,
        onClick: _ctx.play,
        class: "uni-btn"
      }), "播放", 8 /* PROPS */, ["disabled", "onClick"]),
      _cE("button", _uM({
        disabled: !_ctx.isPlaying,
        onClick: _ctx.pause,
        class: "uni-btn"
      }), "暂停", 8 /* PROPS */, ["disabled", "onClick"]),
      _cE("button", _uM({
        disabled: !_ctx.isPlaying,
        onClick: _ctx.stop,
        class: "uni-btn"
      }), "停止", 8 /* PROPS */, ["disabled", "onClick"]),
      _cE("button", _uM({
        onClick: () => {_ctx.onchangeValue(20)},
        class: "uni-btn"
      }), "跳转到指定位置20", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        onClick: _ctx.onTimeUpdate,
        class: "uni-btn"
      }), "onTimeUpdate", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        onClick: _ctx.offTimeUpdate,
        class: "uni-btn"
      }), "offTimeUpdate", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        onClick: _ctx.onWaiting,
        class: "uni-btn"
      }), "onWaiting", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        onClick: _ctx.offWaiting,
        class: "uni-btn"
      }), "offWaiting", 8 /* PROPS */, ["onClick"]),
      _cE("text", _uM({
        style: _nS(_uM({"color":"red","font-size":"15px","margin-top":"10px"}))
      }), "tip:销毁后请重新进入此界面再播放", 4 /* STYLE */),
      _cE("button", _uM({
        onClick: _ctx.destory,
        class: "uni-btn"
      }), "销毁", 8 /* PROPS */, ["onClick"]),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "格式/路径示例")
      ]),
      _cV(_component_navigator, _uM({
        url: "/pages/API/create-inner-audio-context/inner-audio-format",
        class: "uni-btn"
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE("button", _uM({ onClick: _ctx.pause }), "音频格式示例", 8 /* PROPS */, ["onClick"])
        ]),
        _: 1 /* STABLE */
      })),
      _cV(_component_navigator, _uM({
        url: "/pages/API/create-inner-audio-context/inner-audio-path",
        class: "uni-btn"
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE("button", _uM({ onClick: _ctx.pause }), "音频路径示例", 8 /* PROPS */, ["onClick"])
        ]),
        _: 1 /* STABLE */
      })),
      _cV(_component_navigator, _uM({
        url: "/pages/API/create-inner-audio-context/inner-audio-mult",
        class: "uni-btn"
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE("button", _uM({ onClick: _ctx.pause }), "多音频同时播放", 8 /* PROPS */, ["onClick"])
        ]),
        _: 1 /* STABLE */
      }))
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPICreateInnerAudioContextCreateInnerAudioContextStyles = [_uM([["play-time-area", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["marginTop", 20]]))], ["duration", _pS(_uM([["marginLeft", "auto"]]))], ["play-button-area", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "center"], ["marginTop", 50], ["marginRight", 0], ["marginBottom", 50], ["marginLeft", 0]]))], ["icon-play", _pS(_uM([["width", 60], ["height", 60]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
