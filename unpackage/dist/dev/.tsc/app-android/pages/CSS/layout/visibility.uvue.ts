
  const __sfc__ = defineComponent({
    data() {
      return {
        visibility: 'visible',
        flag: true
      }
    },
    methods: {
      changeVisibility() {
        this.flag = !this.flag;
        if (this.flag) {
          this.visibility = 'visible';
        } else {
          this.visibility = 'hidden';
        }
      }
    }
  })

export default __sfc__
function GenPagesCSSLayoutVisibilityRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    style: _nS(_uM({"flex-grow":"1"}))
  }), [
    _cE("view", _uM({ onClick: _ctx.changeVisibility }), [
      _cE("text", null, "visibility: " + _tD(_ctx.visibility) + "（点击切换）", 1 /* TEXT */),
      _cE("view", _uM({
        class: "common",
        style: _nS(_uM({'visibility': _ctx.visibility}))
      }), null, 4 /* STYLE */)
    ], 8 /* PROPS */, ["onClick"])
  ], 4 /* STYLE */)
}
const GenPagesCSSLayoutVisibilityStyles = [_uM([["common", _pS(_uM([["width", 250], ["height", 250], ["backgroundColor", "#FF0000"]]))]])]
