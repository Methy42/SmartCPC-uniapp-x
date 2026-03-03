
  const __sfc__ = defineComponent({
    data() {
      return {
        isSolid: false,
        borderStyle: "border-style: none; border-width: 5px;",
      }
    },
    methods: {
      changeBorderStyle() {
        this.isSolid = !this.isSolid;
        const solid = "border-style: solid; border-width: 5px;";
        const none = "";
        this.borderStyle = this.isSolid ? solid : none;
      }
    }
  })

export default __sfc__
function GenPagesCSSBorderBorderStyleRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", _uM({
      style: _nS(_uM({"flex-grow":"1"}))
    }), [
      _cE("view", null, [
        _cE("text", null, "border-style: dashed"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-width":"5px","border-style":"dashed"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "border-left-style: dashed"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-left-width":"5px","border-left-style":"dashed"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "border-top-style: dashed"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-top-width":"5px","border-top-style":"dashed"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "border-right-style: dotted"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-right-width":"5px","border-right-style":"dotted"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "border-bottom-style: dotted"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-bottom-width":"5px","border-bottom-style":"dotted"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "border-style: solid (缺省 border-width)"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-style":"solid"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "border-style: none"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"border-style":"none","border-width":"5px"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", _uM({ onClick: _ctx.changeBorderStyle }), [
        _cE("text", null, "border-style: 点击切换"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_ctx.borderStyle)
        }), null, 4 /* STYLE */)
      ], 8 /* PROPS */, ["onClick"])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSBorderBorderStyleStyles = [_uM([["common", _pS(_uM([["width", 250], ["height", 250], ["backgroundColor", "#808080"]]))]])]
