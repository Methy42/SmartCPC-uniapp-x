
const __sfc__ = defineComponent({
  __name: 'background-color',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;


  const jumpToCheckBoxWithBackgroundColor = () => {
    uni.navigateTo({
      url:"/pages/CSS/background/background-color-check-box"
    })
  }

return (): any | null => {

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", _uM({
      style: _nS(_uM({"flex-grow":"1"}))
    }), [
      _cE("view", null, [
        _cE("text", null, "background-color: red"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"red"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: #ff0000"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"#ff0000"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: #f00"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"#f00"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: #ff000080"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"#ff000080"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: #f008"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"#f008"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: rgb(255, 0, 0)"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"rgb(255, 0, 0)"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: rgba(255, 0, 0, 0.5)"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"rgba(255, 0, 0, 0.5)"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", null, "background-color: #ff000080"),
        _cE("view", _uM({
          class: "common",
          style: _nS(_uM({"background-color":"#ff000080"}))
        }), null, 4 /* STYLE */)
      ]),
      _cE("view", _uM({
        style: _nS(_uM({"margin-left":"30px","margin-right":"30px"}))
      }), [
        _cE("button", _uM({
          type: "default",
          onClick: jumpToCheckBoxWithBackgroundColor
        }), "应用background-color示例")
      ], 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
}

})
export default __sfc__
const GenPagesCSSBackgroundBackgroundColorStyles = [_uM([["common", _pS(_uM([["width", 250], ["height", 250]]))]])]
