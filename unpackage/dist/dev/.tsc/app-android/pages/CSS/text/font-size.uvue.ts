
  const __sfc__ = defineComponent({
    data() {
      return {
        fontSize: '15px'
      }
    },
    methods: {
      // 自动化测试
      setFontSize() {
        this.fontSize = '30px';
      }
    }
  })

export default __sfc__
function GenPagesCSSTextFontSizeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    style: _nS(_uM({"flex-grow":"1"}))
  }), [
    _cE("view", _uM({
      style: _nS(_uM({"height":"250px","background-color":"gray","justify-content":"center","align-items":"center"}))
    }), [
      _cE("text", _uM({
        ref: "text",
        style: _nS(_uM({'font-size': _ctx.fontSize}))
      }), "font-size: " + _tD(_ctx.fontSize), 5 /* TEXT, STYLE */),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"30px"}))
      }), "font-size: 30px", 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSTextFontSizeStyles = []
