const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSTextLetterSpacingRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    style: _nS(_uM({"flex-grow":"1"}))
  }), [
    _cE("view", _uM({
      style: _nS(_uM({"height":"250px","background-color":"gray","justify-content":"center","align-items":"center"}))
    }), [
      _cE("text", _uM({ class: "common" }), "letter-spacing"),
      _cE("text", _uM({
        class: "common",
        style: _nS(_uM({"letter-spacing":"5px"}))
      }), "letter-spacing: 5px", 4 /* STYLE */),
      _cE("text", _uM({
        class: "common",
        style: _nS(_uM({"letter-spacing":"-2px"}))
      }), "letter-spacing: -2px", 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSTextLetterSpacingStyles = [_uM([["common", _pS(_uM([["fontSize", 20]]))]])]
