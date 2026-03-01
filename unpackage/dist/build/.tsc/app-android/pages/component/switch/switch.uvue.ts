
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'switch 开关',
        checked: true,
        color: '#FFCC33',
        clickCheckedValue: true,
        testVerifyEvent: false,
      }
    },
    methods: {
      switch1Change: function (e : UniSwitchChangeEvent) {
        this.clickCheckedValue = e.detail.value
        console.log('switch1 发生 change 事件，携带值为', e.detail.value)

        // 仅测试
        this.testVerifyEvent = (e.type == 'change' && (e.target?.tagName ?? '') == "SWITCH")
      },
      switch2Change: function (e : UniSwitchChangeEvent) {
        console.log('switch2 发生 change 事件，携带值为', e.detail.value)
      }
    }
  })

export default __sfc__
function GenPagesComponentSwitchSwitchRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_switch = resolveComponent("switch", true)

  return _cE("view", null, [
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-title" }), "默认样式"),
      _cE("view", _uM({ class: "flex-row" }), [
        _cV(_component_switch, _uM({
          class: "switch-checked",
          checked: _ctx.checked,
          onChange: _ctx.switch1Change
        }), null, 8 /* PROPS */, ["checked", "onChange"]),
        _cV(_component_switch, _uM({ onChange: _ctx.switch2Change }), null, 8 /* PROPS */, ["onChange"])
      ]),
      _cE("view", _uM({ class: "uni-title" }), "暗黑样式"),
      _cE("view", _uM({ class: "flex-row" }), [
        _cV(_component_switch, _uM({
          id: "darkChecked",
          "background-color": "#1f1f1f",
          activeBackgroundColor: "#007aff",
          foreColor: "#f0f0f0",
          activeForeColor: "#ffffff",
          checked: _ctx.checked
        }), null, 8 /* PROPS */, ["checked"]),
        _cV(_component_switch, _uM({
          id: "dark",
          "background-color": "#1f1f1f",
          activeBackgroundColor: "#007aff",
          foreColor: "#f0f0f0",
          activeForeColor: "#ffffff"
        }))
      ]),
      _cE("view", _uM({ class: "uni-title" }), "禁用样式"),
      _cE("view", _uM({ class: "flex-row" }), [
        _cV(_component_switch, _uM({
          class: "switch-checked",
          checked: _ctx.checked,
          disabled: true
        }), null, 8 /* PROPS */, ["checked"]),
        _cV(_component_switch, _uM({ disabled: true }))
      ]),
      _cE("view", _uM({ class: "uni-title" }), "不同颜色和尺寸的switch"),
      _cE("view", _uM({ class: "flex-row" }), [
        _cV(_component_switch, _uM({
          class: "switch-color-checked",
          color: _ctx.color,
          style: _nS(_uM({"transform":"scale(0.7)"})),
          checked: true
        }), null, 8 /* PROPS */, ["color", "style"]),
        _cV(_component_switch, _uM({
          class: "switch-color",
          color: _ctx.color,
          style: _nS(_uM({"transform":"scale(0.7)"}))
        }), null, 8 /* PROPS */, ["color", "style"])
      ]),
      _cE("view", _uM({ class: "uni-title" }), "推荐展示样式")
    ]),
    _cE("view", _uM({ class: "uni-list" }), [
      _cE("view", _uM({ class: "uni-list-cell uni-list-cell-padding" }), [
        _cE("view", _uM({ class: "uni-list-cell-db" }), "开启中"),
        _cV(_component_switch, _uM({ checked: true }))
      ]),
      _cE("view", _uM({ class: "uni-list-cell uni-list-cell-padding" }), [
        _cE("view", _uM({ class: "uni-list-cell-db" }), "关闭"),
        _cV(_component_switch)
      ])
    ])
  ])
}
const GenPagesComponentSwitchSwitchStyles = [_uM([["flex-row", _pS(_uM([["flexDirection", "row"]]))]])]
