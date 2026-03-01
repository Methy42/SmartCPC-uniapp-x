const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSTransformRotateRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({ class: "page" }), [
    _cE("view", _uM({ class: "trace" }), [
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "rotate(20deg)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "rotateX(50deg)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "rotateY(50deg)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "rotateZ(50deg)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "rotateX(180deg)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ]),
      _cE("view", _uM({ class: "base reserve" }), [
        _cE("text", _uM({ class: "reserve-text" }), "rotateY(180deg)"),
        _cE("text", _uM({ class: "reserve-text" }), "转变前位置")
      ])
    ]),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"rotate(20deg)"}))
    }), [
      _cE("text", null, "rotate(20deg)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"rotateX(50deg)"}))
    }), [
      _cE("text", null, "rotateX(50deg)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"rotateY(50deg)"}))
    }), [
      _cE("text", null, "rotateY(50deg)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"rotateZ(50deg)"}))
    }), [
      _cE("text", null, "rotateZ(50deg)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"rotateX(180deg)"}))
    }), [
      _cE("text", null, "rotateX(180deg)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */),
    _cE("view", _uM({
      class: "base transform",
      style: _nS(_uM({"transform":"rotateY(180deg)"}))
    }), [
      _cE("text", null, "rotateY(180deg)"),
      _cE("text", null, "转变后位置")
    ], 4 /* STYLE */)
  ])
}
const GenPagesCSSTransformRotateStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["alignItems", "center"]]))], ["trace", _pS(_uM([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["alignItems", "center"]]))], ["base", _pS(_uM([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10], ["width", 150], ["height", 150], ["alignItems", "center"], ["justifyContent", "center"]]))], ["reserve", _pS(_uM([["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "dotted"], ["borderRightStyle", "dotted"], ["borderBottomStyle", "dotted"], ["borderLeftStyle", "dotted"], ["borderTopColor", "#558888"], ["borderRightColor", "#558888"], ["borderBottomColor", "#558888"], ["borderLeftColor", "#558888"], ["backgroundColor", "#dddddd"]]))], ["reserve-text", _pS(_uM([["color", "#cccccc"]]))], ["transform", _pS(_uM([["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#0000ff"], ["borderRightColor", "#0000ff"], ["borderBottomColor", "#0000ff"], ["borderLeftColor", "#0000ff"], ["backgroundColor", "rgba(0,255,255,0.5)"]]))]])]
