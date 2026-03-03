const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSTransformTranslateRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_navigator = resolveComponent("navigator")

  return _cE("scroll-view", _uM({ class: "page" }), [
    _cE("view", _uM({ class: "trace" }), [
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "translateX(80%)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "translateY(50px)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "translate(-50%,50%)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ])
    ]),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"translateX(80%)"}))
    }), [
      _cE("text", null, "translateX(80%)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"translateY(50px)"}))
    }), [
      _cE("text", null, "translateY(50px)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"translate(-50%, 50%)"}))
    }), [
      _cE("text", null, "translate(-50%,50%)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cV(_component_navigator, _uM({
      style: _nS(_uM({"top":"100px","width":"80%"})),
      url: "/pages/CSS/transform/transform-origin"
    }), _uM({
      default: withSlotCtx((): any[] => [
        _cE("button", _uM({ type: "primary" }), "transform-origin")
      ]),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["style"])
  ])
}
const GenPagesCSSTransformTranslateStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["alignItems", "center"]]))], ["trace", _pS(_uM([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["alignItems", "center"]]))], ["base", _pS(_uM([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10], ["width", 150], ["height", 150], ["alignItems", "center"], ["justifyContent", "center"]]))], ["reserve", _pS(_uM([["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "dotted"], ["borderRightStyle", "dotted"], ["borderBottomStyle", "dotted"], ["borderLeftStyle", "dotted"], ["borderTopColor", "#558888"], ["borderRightColor", "#558888"], ["borderBottomColor", "#558888"], ["borderLeftColor", "#558888"], ["backgroundColor", "#DDDDDD"]]))], ["reserve-text", _pS(_uM([["color", "#CCCCCC"]]))], ["transform", _pS(_uM([["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#0000FF"], ["borderRightColor", "#0000FF"], ["borderBottomColor", "#0000FF"], ["borderLeftColor", "#0000FF"], ["backgroundColor", "rgba(0,255,255,0.5)"]]))]])]
