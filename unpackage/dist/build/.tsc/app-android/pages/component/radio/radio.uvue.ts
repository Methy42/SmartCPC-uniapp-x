
  type ItemType = {
    value : string
    name : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        items: [
          {
            value: 'CHN',
            name: '中国',
          },
          {
            value: 'USA',
            name: '美国',
          },

          {
            value: 'BRA',
            name: '巴西',
          },
          {
            value: 'JPN',
            name: '日本',
          },
          {
            value: 'ENG',
            name: '英国',
          },
          {
            value: 'FRA',
            name: '法国',
          },
        ] as ItemType[],
        current: 0,
        eventTest: false,

        value: '',
        text: '未选中',
        wrapText: 'uni-app x，终极跨平台方案\nuts，大一统语言',
        disabled: true,
        checked: true,
        color: '#007aff',
        // 组件属性 autotest
        checked_boolean: false,
        disabled_boolean: false,
        color_input: "#007AFF",
        backgroundColor_input: "#ffffff",
        borderColor_input: "#d1d1d1",
        activeBackgroundColor_input: "#007AFF",
        activeBorderColor_input: "",
        iconColor_input: "#ffffff"
      }
    },

    methods: {
      radioChange(e : UniRadioGroupChangeEvent) {

        // 自动化测试
        console.log('test: radio event detail', e.target?.tagName, e.type)
        if ((e.target?.tagName ?? '') == 'RADIO-GROUP' && e.type == 'change') {
          this.eventTest = true
        }

        const selected = this.items.find((item) : boolean => {
          return item.value == e.detail.value
        })
        uni.showToast({
          icon: 'none',
          title: '当前选中:' + selected?.name,
        })
      },
      testChange(e : UniRadioGroupChangeEvent) {

        this.value = e.detail.value
      },
      radio_click() { console.log("组件被点击时触发") },
      radio_touchstart() { console.log("手指触摸动作开始") },
      radio_touchmove() { console.log("手指触摸后移动") },
      radio_touchcancel() { console.log("手指触摸动作被打断，如来电提醒，弹窗") },
      radio_touchend() { console.log("手指触摸动作结束") },
      radio_tap() { console.log("手指触摸后马上离开") },
      radio_longpress() { console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。") },
      change_checked_boolean(checked : boolean) { this.checked_boolean = checked },
      change_disabled_boolean(checked : boolean) { this.disabled_boolean = checked },
      confirm_color_input(value : string) { this.color_input = value },
      confirm_backgroundColor_input(value : string) { this.backgroundColor_input = value },
      confirm_borderColor_input(value : string) { this.borderColor_input = value },
      confirm_activeBackgroundColor_input(value : string) { this.activeBackgroundColor_input = value },
      confirm_activeBorderColor_input(value : string) { this.activeBorderColor_input = value },
      confirm_iconColor_input(value : string) { this.iconColor_input = value }
    }
  })

export default __sfc__
function GenPagesComponentRadioRadioRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio", true)
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)
const _component_input_data = resolveEasyComponent("input-data",_easycom_input_data)
const _component_radio_group = resolveComponent("radio-group")

  return _cE(Fragment, null, [
    _cE("view", _uM({ class: "main" }), [
      _cV(_component_radio, _uM({
        disabled: _ctx.disabled_boolean,
        checked: _ctx.checked_boolean,
        color: _ctx.color_input,
        backgroundColor: _ctx.backgroundColor_input,
        borderColor: _ctx.borderColor_input,
        activeBackgroundColor: _ctx.activeBackgroundColor_input,
        activeBorderColor: _ctx.activeBorderColor_input,
        iconColor: _ctx.iconColor_input,
        onClick: [_ctx.radio_click, _ctx.radio_tap],
        onTouchstart: _ctx.radio_touchstart,
        onTouchmove: _ctx.radio_touchmove,
        onTouchcancel: _ctx.radio_touchcancel,
        onTouchend: _ctx.radio_touchend,
        onLongpress: _ctx.radio_longpress
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE("text", null, "uni-app-x")
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["disabled", "checked", "color", "backgroundColor", "borderColor", "activeBackgroundColor", "activeBorderColor", "iconColor", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress"])
    ]),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1"}))
    }), [
      _cE("view", _uM({ class: "content" }), [
        _cV(_component_page_head, _uM({ title: "组件属性" })),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "<radio/> 当前是否选中",
          onChange: _ctx.change_checked_boolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "是否禁用",
          onChange: _ctx.change_disabled_boolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#007AFF",
          title: "radio的颜色",
          type: "text",
          onConfirm: _ctx.confirm_color_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#ffffff",
          title: "radio默认的背景颜色",
          type: "text",
          onConfirm: _ctx.confirm_backgroundColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#d1d1d1",
          title: "radio默认的边框颜色",
          type: "text",
          onConfirm: _ctx.confirm_borderColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#007AFF",
          title: "radio选中时的背景颜色，优先级大于color属性",
          type: "text",
          onConfirm: _ctx.confirm_activeBackgroundColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "",
          title: "radio选中时的边框颜色",
          type: "text",
          onConfirm: _ctx.confirm_activeBorderColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#ffffff",
          title: "radio的图标颜色",
          type: "text",
          onConfirm: _ctx.confirm_iconColor_input
        }), null, 8 /* PROPS */, ["onConfirm"])
      ]),
      _cE("view", null, [
        _cV(_component_page_head, _uM({ title: "默认及使用" })),
        _cE("view", _uM({ class: "uni-padding-wrap" }), [
          _cE("view", _uM({ class: "uni-title uni-common-mt" }), [
            _cE("text", _uM({ class: "uni-title-text" }), " 默认样式 ")
          ]),
          _cV(_component_radio_group, _uM({
            class: "uni-flex uni-row radio-group",
            onChange: _ctx.testChange,
            style: _nS(_uM({"flex-wrap":"wrap"}))
          }), _uM({
            default: withSlotCtx((): any[] => [
              _cV(_component_radio, _uM({
                id: "trigger-change",
                value: "r",
                checked: _ctx.checked,
                color: _ctx.color,
                style: _nS(_uM({"margin-right":"15px"})),
                class: "radio r"
              }), _uM({
                default: withSlotCtx((): any[] => ["选中 "]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["checked", "color", "style"]),
              _cV(_component_radio, _uM({
                value: "r1",
                style: _nS(_uM({"margin-right":"15px"})),
                class: "radio r1"
              }), _uM({
                default: withSlotCtx((): any[] => [_tD(_ctx.text)]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"]),
              _cV(_component_radio, _uM({
                value: "r2",
                disabled: _ctx.disabled,
                class: "radio r2"
              }), _uM({
                default: withSlotCtx((): any[] => ["禁用"]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["disabled"]),
              _cV(_component_radio, _uM({
                value: "r3",
                class: "radio r3",
                style: _nS(_uM({"margin-top":"10px"}))
              }), _uM({
                default: withSlotCtx((): any[] => [_tD(_ctx.wrapText)]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"])
            ]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["onChange", "style"])
        ]),
        _cE("view", _uM({ class: "uni-padding-wrap" }), [
          _cE("view", _uM({ class: "uni-title uni-common-mt" }), [
            _cE("text", _uM({ class: "uni-title-text" }), " 不同颜色和尺寸的radio ")
          ]),
          _cV(_component_radio_group, _uM({ class: "uni-flex uni-row radio-group" }), _uM({
            default: withSlotCtx((): any[] => [
              _cV(_component_radio, _uM({
                value: "r1",
                checked: true,
                color: "#FFCC33",
                style: _nS(_uM({"transform":"scale(0.7)","margin-right":"15px"})),
                class: "radio"
              }), _uM({
                default: withSlotCtx((): any[] => ["选中 "]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"]),
              _cV(_component_radio, _uM({
                value: "r2",
                color: "#FFCC33",
                style: _nS(_uM({"transform":"scale(0.7)"})),
                class: "radio"
              }), _uM({
                default: withSlotCtx((): any[] => ["未选中"]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"])
            ]),
            _: 1 /* STABLE */
          }))
        ]),
        _cE("view", _uM({ class: "uni-padding-wrap" }), [
          _cE("view", _uM({ class: "uni-title uni-common-mt" }), [
            _cE("text", _uM({ class: "uni-title-text" }), " 两端对齐样式测试 ")
          ]),
          _cV(_component_radio_group, _uM({ class: "uni-flex uni-row radio-group" }), _uM({
            default: withSlotCtx((): any[] => [
              _cV(_component_radio, _uM({ class: "justify-test" }), _uM({
                default: withSlotCtx((): any[] => ["justify-content样式测试"]),
                _: 1 /* STABLE */
              }))
            ]),
            _: 1 /* STABLE */
          }))
        ]),
        _cE("view", _uM({ class: "uni-padding-wrap" }), [
          _cE("view", _uM({ class: "uni-title uni-common-mt" }), [
            _cE("text", _uM({ class: "uni-title-text" }), " 推荐展示样式 ")
          ])
        ]),
        _cE("view", _uM({ class: "uni-list uni-common-pl" }), [
          _cV(_component_radio_group, _uM({
            onChange: _ctx.radioChange,
            class: "radio-group"
          }), _uM({
            default: withSlotCtx((): any[] => [
              _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
                return _cV(_component_radio, _uM({
                  class: _nC(["uni-list-cell uni-list-cell-pd radio recommand", index < _ctx.items.length - 1 ? 'uni-list-cell-line' : '']),
                  key: item.value,
                  value: item.value,
                  checked: index === _ctx.current
                }), _uM({
                  default: withSlotCtx((): any[] => [_tD(item.name)]),
                  _: 2 /* DYNAMIC */
                }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "checked"])
              }), 128 /* KEYED_FRAGMENT */)
            ]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["onChange"])
        ])
      ])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentRadioRadioStyles = [_uM([["main", _pS(_uM([["maxHeight", 250], ["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "rgba(0,0,0,0.06)"], ["flexDirection", "row"], ["justifyContent", "center"]]))], ["uni-list-cell", _pS(_uM([["justifyContent", "flex-start"]]))], ["justify-test", _pS(_uM([["width", "100%"], ["justifyContent", "space-between"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
import _easycom_input_data from '@/components/input-data/input-data.vue'
