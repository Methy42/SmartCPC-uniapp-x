
  type LocationType = 'wgs84' | 'gcj02'
  export type ItemType = { value : LocationType, name : LocationType }
  export type LocationItem = { id : string, name : string, provider ?: UniProvider }

  const __sfc__ = defineComponent({
    data() {
      return {
        log: "",
        logAble: true,
        providerList: [] as LocationItem[],
        types: [
          {
            value: 'wgs84',
            name: 'wgs84'
          },
          {
            value: 'gcj02',
            name: 'gcj02'
          }
        ] as ItemType[],
        currentSelectedProvider: 0,
        currentSelectedType: 0,
        startSuccess: false,
        stopSuccess: false,
        errCode: 0
      }
    },
    onLoad: function () {

      this.getProvider()

    },
    onUnload() {
      uni.stopLocationUpdate({})
      uni.offLocationChange(null)
      uni.offLocationChangeError(null)
    },
    methods: {
      getProvider() {


        let provider = uni.getProviderSync({
          service: "location",
        } as GetProviderSyncOptions)
        console.log(provider)
        provider.providerObjects.forEach((value : UniProvider) => {
          var currentProvider = value
          this.providerList.push({
            name: currentProvider.description,
            id: currentProvider.id,
            provider: currentProvider
          } as LocationItem);
        })

        this.providerList.forEach((value, index) => {
          if (value.id == "system") {
            this.currentSelectedProvider = index
          }
        })

      },
      providerChange(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.providerList.length; i++) {
          if (this.providerList[i].id === e.detail.value) {
            this.currentSelectedProvider = i;
            break;
          }
        }

        if (e.detail.value == "system") {
          this.currentSelectedType = 0
        } else if (e.detail.value == "tencent") {
          this.currentSelectedType = 1
        }
      },
      typeChange(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.types.length; i++) {
          if (this.types[i].value === e.detail.value) {
            this.currentSelectedType = i;
            break;
          }
        }
      },
      offLocationChangeError() {
        if (this.logAble) {
          this.log += "关闭offLocationChangeError监听" + '\n\n'
        }
        console.log("关闭onLocationChangeError监听")
        uni.offLocationChangeError(null)
      },
      onLocationChangeError() {
        uni.offLocationChangeError(null)
        if (this.logAble) {
          this.log += "开启onLocationChangeError监听" + '\n\n'
        }
        console.log("开启onLocationChangeError监听")
        uni.onLocationChangeError((e) => {
          console.log("onLocationChangeError回调: ", e)
          if (this.logAble) {
            this.log += JSON.stringify(e) + '\n\n'
          }
        })
      },
      onLocationChange() {
        uni.offLocationChange(null)
        console.log("开启onLocationChange监听")
        if (this.logAble) {
          this.log += "开启onLocationChange监听" + '\n\n'
        }
        uni.onLocationChange((e) => {
          console.log("onLocationChange持续监听回调: ", e)
          if (this.logAble) {
            this.log += "provider= " + this.providerList[this.currentSelectedProvider].id + '\n' + JSON.stringify(e) + '\n\n'
          }
        })
      },
      offLocationChange() {
        if (this.logAble) {
          this.log += "关闭offLocationChange监听" + '\n\n'
        }
        console.log("关闭offLocationChange监听")
        uni.offLocationChange(null)
      },
      startLocationUpdate() {

        if (this.providerList.length == 0) {
          uni.showToast({
            title: '未获取到provider，请确定基座中包含location功能',
            icon: "error"
          })
          console.log("未获取到provider，请确定基座中包含location功能")
          return
        }


        uni.startLocationUpdate({
          provider: this.providerList[this.currentSelectedProvider].id,
          type: this.types[this.currentSelectedType].value,
          success: () => {
            if (this.logAble) {
              this.log += "开启startLocationUpdate成功, provider= " + this.providerList[this.currentSelectedProvider].id + '\n\n'
            }
            console.log("持续定位启动成功")
            this.startSuccess = true
          },
          fail: (err) => {
            if (this.logAble) {
              this.log += "启动startLocationUpdate失败：erroCode=" + err.errCode + '\n\n'
            }

            console.log("持续定位启动失败")
            this.startSuccess = false
            this.errCode = err.errCode
          }

        })
      },
      startLocationUpdateBackground() {

        if (this.providerList.length == 0) {
          uni.showToast({
            title: '未获取到provider，请确定基座中包含location功能',
            icon: "error"
          })
          console.log("未获取到provider，请确定基座中包含location功能")
          return
        }

        uni.startLocationUpdateBackground({
          provider: this.providerList[this.currentSelectedProvider].id,
          type: this.types[this.currentSelectedType].value,
          success: () => {
            if (this.logAble) {
              this.log += "开启startLocationUpdateBackground成功, provider= " + this.providerList[this.currentSelectedProvider].id + '\n\n'
            }
            console.log("后台持续定位api启动成功")
            this.startSuccess = true
          }, fail: (err) => {
            if (this.logAble) {
              this.log += "启动startLocationUpdateBackground失败：erroCode=" + err.errCode + '\n\n'
            }
            console.log("后台持续定位启动失败")
            this.startSuccess = false
            this.errCode = err.errCode
          }

        })
      },
      stopLocationUpdate() {
        uni.stopLocationUpdate({
          success: () => {
            if (this.logAble) {
              this.log += "成功关闭stopLocationUpdate定位" + '\n\n'
            }
            console.log("成功关闭stopLocationUpdate定位")
            this.stopSuccess = true
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPILocationChangeLocationChangeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")

  return _cE(Fragment, null, [
    _cE("text", null, "显示简易操作日志(可滚动查看)"),
    _cE("button", _uM({
      size: "mini",
      onClick: () => {_ctx.log=''}
    }), "清空日志", 8 /* PROPS */, ["onClick"]),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"max-height":"300px"}))
    }), [
      _cE("text", _uM({
        style: _nS(_uM({"margin":"2px","padding":"2px","border":"1px solid #000000"}))
      }), _tD(_ctx.log), 5 /* TEXT, STYLE */)
    ], 4 /* STYLE */),
    _cE("view", _uM({ class: "uni-list" }), [
      _cE("text", _uM({
        style: _nS(_uM({"margin-bottom":"4px"}))
      }), " 请选择定位服务提供商：", 4 /* STYLE */),
      _cV(_component_radio_group, _uM({
        class: "uni-flex uni-row",
        onChange: _ctx.providerChange,
        style: _nS(_uM({"flex-wrap":"wrap"}))
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE(Fragment, null, RenderHelpers.renderList(_ctx.providerList, (item, index, __index, _cached): any => {
            return _cV(_component_radio, _uM({
              class: "uni-list-cell",
              style: _nS(_uM({"margin-right":"15px"})),
              key: item.id,
              value: item.id,
              checked: index === _ctx.currentSelectedProvider
            }), _uM({
              default: withSlotCtx((): any[] => [_tD(item.name)]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["style", "value", "checked"])
          }), 128 /* KEYED_FRAGMENT */)
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["onChange", "style"])
    ]),
    _cE("view", _uM({ class: "uni-list" }), [
      _cE("text", _uM({
        style: _nS(_uM({"margin-bottom":"4px"}))
      }), " 请选择坐标系：", 4 /* STYLE */),
      _cV(_component_radio_group, _uM({
        class: "uni-flex uni-row",
        onChange: _ctx.typeChange,
        style: _nS(_uM({"flex-wrap":"wrap"}))
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE(Fragment, null, RenderHelpers.renderList(_ctx.types, (item, index, __index, _cached): any => {
            return _cV(_component_radio, _uM({
              class: "uni-list-cell",
              style: _nS(_uM({"margin-right":"15px"})),
              key: item.value,
              value: item.value,
              checked: index === _ctx.currentSelectedType
            }), _uM({
              default: withSlotCtx((): any[] => [_tD(item.name)]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["style", "value", "checked"])
          }), 128 /* KEYED_FRAGMENT */)
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["onChange", "style"])
    ]),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1"}))
    }), [
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.startLocationUpdate,
        id: "startLocationUpdate"
      }), "点击连续定位", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.startLocationUpdateBackground,
        id: "startLocationUpdateBackground"
      }), "后台点击连续定位", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.stopLocationUpdate,
        id: "stopLocationUpdate"
      }), "点击关闭定位", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.onLocationChange,
        id: "onLocationChange"
      }), "onLocationChange", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.offLocationChange,
        id: "offLocationChange"
      }), "offLocationChange", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.onLocationChangeError,
        id: "onLocationChangeError"
      }), "onLocationChangeError", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btnstyle",
        type: "primary",
        onClick: _ctx.offLocationChangeError,
        id: "offLocationChangeError"
      }), "offLocationChangeError", 8 /* PROPS */, ["onClick"])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPILocationChangeLocationChangeStyles = [_uM([["uni-list", _pS(_uM([["borderBottomWidth", 0], ["borderBottomStyle", "none"], ["borderBottomColor", "#000000"], ["backgroundColor", "rgba(0,0,0,0)"], ["marginLeft", 10], ["marginRight", 10], ["marginTop", 4], ["marginBottom", 4]]))], ["uni-list-cell", _pS(_uM([["position", "relative"], ["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignItems", "center"]]))], ["btnstyle", _pS(_uM([["marginTop", 4], ["marginRight", 4], ["marginBottom", 4], ["marginLeft", 4]]))]])]
