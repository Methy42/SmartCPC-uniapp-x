
  const __sfc__ = defineComponent({
    data() {
      return {
        display: 'none'
      }
    },
    methods: {
      switchDisplay() {
        this.display = ('flex' == this.display) ? 'none' : 'flex';
      }
    }
  })

export default __sfc__
function GenPagesCSSDisplayNoneRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    class: "page",
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", _uM({ class: "head" }), [
      _cE("text", _uM({ class: "tip" }), "下面有一个灰色区域，display默认值为none"),
      _cE("text", _uM({ class: "tip" }), "当前display值：" + _tD(_ctx.display), 1 /* TEXT */)
    ]),
    _cE("view", _uM({
      class: "content",
      style: _nS(_uM({display:_ctx.display}))
    }), [
      _cE("text", _uM({
        style: _nS(_uM({"background-color":"aquamarine"}))
      }), "展示display区域", 4 /* STYLE */)
    ], 4 /* STYLE */),
    _cE("button", _uM({ onClick: _ctx.switchDisplay }), "切换display属性", 8 /* PROPS */, ["onClick"])
  ], 4 /* STYLE */)
}
const GenPagesCSSDisplayNoneStyles = [_uM([["page", _pS(_uM([["alignItems", "center"], ["height", "100%"]]))], ["head", _pS(_uM([["marginTop", 10], ["marginBottom", 10], ["alignItems", "center"]]))], ["tip", _pS(_uM([["color", "#FF0000"]]))], ["content", _pS(_uM([["borderTopWidth", 5], ["borderRightWidth", 5], ["borderBottomWidth", 5], ["borderLeftWidth", 5], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#0000FF"], ["borderRightColor", "#0000FF"], ["borderBottomColor", "#0000FF"], ["borderLeftColor", "#0000FF"], ["marginTop", 50], ["marginRight", 0], ["marginBottom", 50], ["marginLeft", 0], ["paddingTop", 50], ["paddingRight", 50], ["paddingBottom", 50], ["paddingLeft", 50], ["width", 200], ["height", 200], ["backgroundColor", "#808080"], ["alignItems", "center"], ["justifyContent", "center"]]))]])]
