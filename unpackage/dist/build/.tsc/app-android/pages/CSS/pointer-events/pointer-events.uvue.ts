
  const __sfc__ = defineComponent({
    data() {
      return {
        isTranstionWidthOrHeight: false,
        widthOrHeight: null as UniElement | null,
        widthProgress: null as UniElement | null,
        progressWidth: 200,
        pointerEvents1: 'auto',
        pointerEvents2: 'auto',
      }
    },
    onReady() {
      this.widthOrHeight = uni.getElementById("widthOrHeight")
      this.widthProgress = uni.getElementById("widthProgress")
    },
    methods: {
      changeWidthOrHeight() {
        this.widthOrHeight?.style?.setProperty("width", this.isTranstionWidthOrHeight
          ? '200px'
          : '300px')
        this.isTranstionWidthOrHeight = !this.isTranstionWidthOrHeight
      },
      changeWidthProgress() {
        this.progressWidth += 20
        this.widthProgress?.style?.setProperty("width", this.progressWidth + 'px')
      },
      onChange1(e : UniSwitchChangeEvent) {
        this.pointerEvents1 = e.detail.value ? 'auto' : 'none'
      },
      onChange2(e : UniSwitchChangeEvent) {
        this.pointerEvents2 = e.detail.value ? 'auto' : 'none'
      }
    }
  })

export default __sfc__
function GenPagesCSSPointerEventsPointerEventsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_switch = resolveComponent("switch")

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", null, [
      _cE("view", _uM({ class: "container1" }), [
        _cE("text", null, "控制父视图pointer-events打开时可以点击"),
        _cV(_component_switch, _uM({
          checked: true,
          onChange: _ctx.onChange1
        }), null, 8 /* PROPS */, ["onChange"])
      ]),
      _cE("view", _uM({
        class: "container",
        style: _nS(_uM({ 'pointer-events': _ctx.pointerEvents1 }))
      }), [
        _cE("text", _uM({ class: "text" }), "点击修改宽度"),
        _cE("view", _uM({
          class: "base-style transition-width",
          id: "widthOrHeight",
          onClick: _ctx.changeWidthOrHeight
        }), null, 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      _cE("view", _uM({ class: "container1" }), [
        _cE("text", null, "控制遮罩层pointer-events关闭时可以点击"),
        _cV(_component_switch, _uM({
          checked: true,
          onChange: _ctx.onChange2
        }), null, 8 /* PROPS */, ["onChange"])
      ]),
      _cE("view", _uM({ class: "container" }), [
        _cE("text", _uM({ class: "text" }), "点击修改宽度(递增)"),
        _cE("view", _uM({
          class: "width-progress transition-width",
          id: "widthProgress",
          onClick: _ctx.changeWidthProgress
        }), null, 8 /* PROPS */, ["onClick"]),
        _cE("view", _uM({
          class: "mask",
          style: _nS(_uM({ 'pointer-events': _ctx.pointerEvents2 }))
        }), null, 4 /* STYLE */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesCSSPointerEventsPointerEventsStyles = [_uM([["container1", _pS(_uM([["marginTop", 7], ["marginRight", 0], ["marginBottom", 7], ["marginLeft", 7], ["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignItems", "center"]]))], ["container", _pS(_uM([["marginTop", 7], ["marginRight", 7], ["marginBottom", 7], ["marginLeft", 7], ["backgroundColor", "#FFFFFF"]]))], ["text", _pS(_uM([["marginTop", 10], ["marginBottom", 16]]))], ["base-style", _pS(_uM([["width", 200], ["height", 200], ["backgroundColor", "#A52A2A"]]))], ["width-progress", _pS(_uM([["width", 200], ["height", 200], ["backgroundColor", "#A52A2A"]]))], ["transition-width", _pS(_uM([["transitionProperty", "width"], ["transitionDuration", "1s"]]))], ["mask", _pS(_uM([["position", "absolute"], ["bottom", 0], ["left", 0], ["width", "100%"], ["height", 200], ["backgroundColor", "rgba(0,0,0,0.5)"]]))], ["@TRANSITION", _uM([["transition-width", _uM([["property", "width"], ["duration", "1s"]])]])]])]
