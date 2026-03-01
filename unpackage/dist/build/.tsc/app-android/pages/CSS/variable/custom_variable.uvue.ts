
  const __sfc__ = defineComponent({
    data() {
      return {
        statusbar: false,
        var_bind: "var_1_bind_1",
        var_v_if: false,
        text_style_var_def: "text_style_var_1",
        text_style_var_1_on: true,
      }
    },
    methods: {
      do_change_var() {
        let view_container = uni.getElementById("view_container")
        if (this.text_style_var_1_on) {
          this.text_style_var_def = "text_style_var_2"
          this.text_style_var_1_on = false
          view_container?.style?.setProperty("--var_flex_direction", "row");
          view_container?.style?.setProperty("--var_justify_content", "flex-end");
          view_container?.style?.setProperty("--var_margin", "");
          // 与 style 中的写法表现不一致，且可能与非简写属性存在冲突
          // view_container?.style?.setProperty("border", "var(--var_border)");
          view_container?.style?.setProperty("background-color", "var(--background-color)");
        } else {
          this.text_style_var_def = "text_style_var_1"
          this.text_style_var_1_on = true
          view_container?.style?.setProperty("--var_margin", "10px");
          view_container?.style?.setProperty("--var_flex_direction", "column");
          view_container?.style?.setProperty("--var_justify_content", "center");
          view_container?.style?.setProperty("background-color", "#FFF");
        }
        this.var_bind = (this.var_bind == "var_1_bind_2") ? "var_1_bind_1" : "var_1_bind_2"
      },
      do_vif() {
        this.var_v_if = !this.var_v_if

      }
    }
  })

export default __sfc__
function GenPagesCSSVariableCustomVariableRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    id: "var_1",
    style: _nS(_uM({"flex":"1","--var_margin":"2px"})),
    class: _nC(["var_1", _ctx.var_bind])
  }), [
    _cE("view", null, [
      _cE("view", _uM({ class: "var_1_1_1" }), [
        _cE("text", _uM({ class: "firstParagraph" }), "此段落应有蓝色背景和绿色文本。")
      ]),
      _cE("text", _uM({ class: "secondParagraph" }), "此段落应有黑色半透明背景和黄色文本。")
    ]),
    _cE("text", _uM({
      style: _nS(_uM({"width":"var(--var_width_invalid, 375rpx)","background-color":"yellowgreen"}))
    }), "无效值width应为375rpx", 4 /* STYLE */),
    _cE("view", _uM({
      id: "chanageVarBox",
      class: _nC(_ctx.text_style_var_def)
    }), [
      isTrue(_ctx.text_style_var_1_on)
        ? _cE("text", _uM({
            key: 0,
            class: "text_style"
          }), "font-size:26px;style:normal;color:#ccc;background-color:#488cff")
        : _cE("text", _uM({
            key: 1,
            class: "text_style"
          }), "font-size:16px;style:italic;color:#803390;background-color:#48ff32")
    ], 2 /* CLASS */),
    _cE("view", _uM({
      class: "view_layout_style_container",
      id: "view_container"
    }), [
      _cE("view", _uM({ class: "view_layout_style" })),
      _cE("view", _uM({
        class: "view_layout_style",
        style: _nS(_uM({"background-color":"blue","--var_align_self":"flex-start"}))
      }), null, 4 /* STYLE */)
    ]),
    _cE("button", _uM({
      id: "changeVarButton",
      onClick: () => {_ctx.do_change_var()}
    }), "修改自定义变量", 8 /* PROPS */, ["onClick"]),
    _cE("view", _uM({ class: "test-v-if" }), [
      isTrue(_ctx.var_v_if)
        ? _cE("view", _uM({
            key: 0,
            style: _nS(_uM({"height":"var(--var_height)","background-color":"var(--var_backgroundColor)"}))
          }), null, 4 /* STYLE */)
        : _cC("v-if", true)
    ]),
    _cE("button", _uM({
      class: "test-v-if-button",
      onClick: () => {_ctx.do_vif()}
    }), "v-if测试", 8 /* PROPS */, ["onClick"])
  ], 6 /* CLASS, STYLE */)
}
const GenPagesCSSVariableCustomVariableStyles = [_uM([["var_1", _pS(_uM([["paddingLeft", "env(safe-area-inset-left)"], ["paddingRight", "env(safe-area-inset-right)"], ["--font-color", "#00ff00"], ["--var_width", "375rpx"], ["--var_backgroundColor", "rgba(0, 0, 0, .5)"]]))], ["var_1_bind_1", _pS(_uM([["--var_height", "30px"]]))], ["var_1_bind_2", _pS(_uM([["--var_height", "60px"]]))], ["var_1_1_1", _pS(_uM([["--var_backgroundColor", "#0000ff"]]))], ["content", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["firstParagraph", _pS(_uM([["backgroundColor", "var(--var_backgroundColor)"], ["color", "var(--font-color)"]]))], ["secondParagraph", _pS(_uM([["--font-color", "yellow"], ["backgroundColor", "var(--var_backgroundColor)"], ["color", "var(--font-color)"]]))], ["text_style_var_1", _pS(_uM([["--text-font-size", "26px"], ["--text-font-style", "normal"], ["--text-color", "#ccc"], ["--text-background-color", "#488cff"]]))], ["text_style_var_2", _pS(_uM([["--text-font-size", "16px"], ["--text-font-style", "italic"], ["--text-color", "#803390"], ["--text-background-color", "#48ff32"]]))], ["text_style", _pS(_uM([["fontFamily", "var(--swiper-item-font-family)"], ["fontSize", "var(--text-font-size)"], ["fontStyle", "var(--text-font-style)"], ["color", "var(--text-color)"], ["backgroundColor", "var(--text-background-color)"]]))], ["view_layout_style_container", _pS(_uM([["--var_flex_direction", "column"], ["--var_align_self", "center"], ["--var_justify_content", "center"], ["--var_border", "2px red solid"], ["--var_border2", "2px green solid"], ["--background-color", "#CCC"], ["--var_height", "110px"], ["--var_margin", "10px"], ["height", "var(--var_height)"], ["flexDirection", "var(--var_flex_direction)"], ["justifyContent", "var(--var_justify_content)"], ["marginTop", "var(--var_margin)"], ["marginRight", "var(--var_margin)"], ["marginBottom", "var(--var_margin)"], ["marginLeft", "var(--var_margin)"]]))], ["view_layout_style", _pS(_uM([["width", 50], ["height", 50], ["backgroundColor", "#A52A2A"], ["alignSelf", "var(--var_align_self)"]]))]])]
