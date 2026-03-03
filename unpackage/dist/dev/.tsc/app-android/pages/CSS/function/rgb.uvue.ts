const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSFunctionRgbRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "container" }), [
    _cE("text", _uM({ class: "intro-text" }), "RGB 是一种颜色表示方法，通过调整红(Red)、绿(Green)、蓝(Blue)三个通道的值（0-255）来产生不同的颜色。"),
    _cE("view", _uM({ class: "section" }), [
      _cE("text", _uM({ class: "section-title" }), "数值表示 (0-255)"),
      _cE("view", _uM({ class: "color-grid" }), [
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgb(255, 0, 0)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "红色"),
          _cE("text", _uM({ class: "color-value" }), "rgb(255, 0, 0)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgb(0, 255, 0)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "绿色"),
          _cE("text", _uM({ class: "color-value" }), "rgb(0, 255, 0)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgb(0, 0, 255)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "蓝色"),
          _cE("text", _uM({ class: "color-value" }), "rgb(0, 0, 255)")
        ])
      ])
    ]),
    _cE("view", _uM({ class: "section" }), [
      _cE("view", _uM({ class: "color-grid" }), [
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgb(255, 255, 0)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "黄色"),
          _cE("text", _uM({ class: "color-value" }), "rgb(255, 255, 0)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgb(255, 0, 255)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "品红"),
          _cE("text", _uM({ class: "color-value" }), "rgb(255, 0, 255)")
        ]),
        _cE("view", _uM({ class: "color-item" }), [
          _cE("view", _uM({
            class: "color-box",
            style: _nS(_uM({"background-color":"rgb(0, 255, 255)"}))
          }), null, 4 /* STYLE */),
          _cE("text", _uM({ class: "color-name" }), "青色"),
          _cE("text", _uM({ class: "color-value" }), "rgb(0, 255, 255)")
        ])
      ])
    ])
  ])
}
const GenPagesCSSFunctionRgbStyles = [_uM([["container", _pS(_uM([["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20]]))], ["intro-text", _pS(_uM([["fontSize", 14], ["color", "#333333"], ["marginBottom", 30], ["lineHeight", 1.4]]))], ["section", _pS(_uM([["marginBottom", 30]]))], ["section-title", _pS(_uM([["fontSize", 18], ["fontWeight", "bold"], ["marginBottom", 15]]))], ["color-grid", _pS(_uM([["flexDirection", "row"], ["flexWrap", "wrap"], ["justifyContent", "space-between"]]))], ["color-item", _pS(_uM([["width", "30%"], ["marginBottom", 20]]))], ["color-box", _pS(_uM([["width", "100%"], ["height", 100], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["marginBottom", 8]]))], ["color-name", _pS(_uM([["fontSize", 16], ["fontWeight", "bold"], ["marginBottom", 4]]))], ["color-value", _pS(_uM([["fontSize", 12], ["color", "#666666"]]))]])]
