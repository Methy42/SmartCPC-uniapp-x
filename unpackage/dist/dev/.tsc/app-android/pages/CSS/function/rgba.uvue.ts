const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSFunctionRgbaRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "container" }), [
    _cE("text", _uM({ class: "intro-text" }), "RGBA 在 RGB 的基础上增加了透明度(Alpha)通道，取值范围为 0-1，0 表示完全透明，1 表示完全不透明。"),
    _cE("view", _uM({ class: "section" }), [
      _cE("text", _uM({ class: "section-title" }), "数值表示 (RGB: 0-255, A: 0-1)"),
      _cE("view", _uM({ class: "color-grid" }), [
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgba(255, 0, 0, 0.1)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "红色 10% 透明"),
          _cE("text", _uM({ class: "color-value" }), "rgba(255, 0, 0, 0.1)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgba(255, 0, 0, 0.5)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "红色 50% 透明"),
          _cE("text", _uM({ class: "color-value" }), "rgba(255, 0, 0, 0.5)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgba(255, 0, 0, 1)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "红色 不透明"),
          _cE("text", _uM({ class: "color-value" }), "rgba(255, 0, 0, 1)")
        ])
      ])
    ]),
    _cE("view", _uM({ class: "section" }), [
      _cE("view", _uM({ class: "color-grid" }), [
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgba(0, 0, 255, 0.1)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "蓝色 10% 透明"),
          _cE("text", _uM({ class: "color-value" }), "rgba(0, 0, 255, 0.1)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgba(0, 0, 255, 0.5)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "蓝色 50% 透明"),
          _cE("text", _uM({ class: "color-value" }), "rgba(0, 0, 255, 0.5)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgba(0, 0, 255, 1)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "蓝色 不透明"),
          _cE("text", _uM({ class: "color-value" }), "rgba(0, 0, 255, 1)")
        ])
      ])
    ])
  ])
}
const GenPagesCSSFunctionRgbaStyles = [_uM([["container", _pS(_uM([["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20]]))], ["intro-text", _pS(_uM([["fontSize", 14], ["color", "#333333"], ["marginBottom", 30], ["lineHeight", 1.4]]))], ["section", _pS(_uM([["marginBottom", 30]]))], ["section-title", _pS(_uM([["fontSize", 18], ["fontWeight", "bold"], ["marginBottom", 15]]))], ["color-grid", _pS(_uM([["flexDirection", "row"], ["flexWrap", "wrap"], ["justifyContent", "space-between"]]))], ["color-item", _pS(_uM([["width", "30%"], ["marginBottom", 20]]))], ["color-box", _pS(_uM([["width", "100%"], ["height", 100], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["marginBottom", 8]]))], ["color-name", _pS(_uM([["fontSize", 16], ["fontWeight", "bold"], ["marginBottom", 4]]))], ["color-value", _pS(_uM([["fontSize", 12], ["color", "#666666"]]))]])]
