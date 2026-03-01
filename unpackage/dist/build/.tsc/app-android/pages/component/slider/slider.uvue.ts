
  const __sfc__ = defineComponent({
    data() {
      return {
        sliderValue: 50,
        sliderBlockSize: 20,
        sliderBackgroundColor: "#000000",
        sliderActiveColor: "#FFCC33",
        sliderBlockColor: "#8A6DE9",
        // 组件属性 autotest
        show_value_boolean: false,
        disabled_boolean: false,
        min_input: 0,
        max_input: 100,
        step_input: 1,
        value_input: 0,
        activeColor_input: "#007aff",
        backgroundColor_input: "#e9e9e9",
        block_size_input: 28,
        block_color_input: "#ffffff",
        valueColor: "#888888",
      };
    },
    methods: {
      sliderChange(e : UniSliderChangeEvent) {
        console.log("value 发生变化：" + e.detail.value);
      },
      slider_click() {
        console.log("组件被点击时触发");
      },
      slider_touchstart() {
        console.log("手指触摸动作开始");
      },
      slider_touchmove() {
        console.log("手指触摸后移动");
      },
      slider_touchcancel() {
        console.log("手指触摸动作被打断，如来电提醒，弹窗");
      },
      slider_touchend() {
        console.log("手指触摸动作结束");
      },
      slider_tap() {
        console.log("手指触摸后马上离开");
      },
      slider_longpress() {
        console.log(
          "如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。"
        );
      },
      slider_change() {
        console.log("完成一次拖动后触发的事件，event.detail = {value: value}");
      },
      slider_changing() {
        console.log("拖动过程中触发的事件，event.detail = {value: value}");
      },
      change_show_value_boolean(checked : boolean) {
        this.show_value_boolean = checked;
      },
      change_disabled_boolean(checked : boolean) {
        this.disabled_boolean = checked;
      },
      confirm_min_input(value : number) {
        this.min_input = value;
      },
      confirm_max_input(value : number) {
        this.max_input = value;
      },
      confirm_step_input(value : number) {
        this.step_input = value;
      },
      confirm_value_input(value : number) {
        this.value_input = value;
      },
      confirm_activeColor_input(value : string) {
        this.activeColor_input = value;
      },
      confirm_backgroundColor_input(value : string) {
        this.backgroundColor_input = value;
      },
      confirm_block_size_input(value : number) {
        this.block_size_input = value;
      },
      confirm_block_color_input(value : string) {
        this.block_color_input = value;
      },
      confirm_value_color_input(value : string) {
        this.valueColor = value;
      },
    },
  });

export default __sfc__
function GenPagesComponentSliderSliderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_slider = resolveComponent("slider", true)
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)
const _component_input_data = resolveEasyComponent("input-data",_easycom_input_data)
const _component_navigator = resolveComponent("navigator")

  return _cE(Fragment, null, [
    _cE("view", _uM({ class: "main" }), [
      _cV(_component_slider, _uM({
        disabled: _ctx.disabled_boolean,
        min: _ctx.min_input,
        max: _ctx.max_input,
        step: _ctx.step_input,
        value: _ctx.value_input,
        activeColor: _ctx.activeColor_input,
        backgroundColor: _ctx.backgroundColor_input,
        "block-size": _ctx.block_size_input,
        "block-color": _ctx.block_color_input,
        "show-value": _ctx.show_value_boolean,
        valueColor: _ctx.valueColor,
        onClick: [_ctx.slider_click, _ctx.slider_tap],
        onTouchstart: _ctx.slider_touchstart,
        onTouchmove: _ctx.slider_touchmove,
        onTouchcancel: _ctx.slider_touchcancel,
        onTouchend: _ctx.slider_touchend,
        onLongpress: _ctx.slider_longpress,
        onChange: _ctx.slider_change,
        onChanging: _ctx.slider_changing,
        style: _nS(_uM({"width":"90%"}))
      }), null, 8 /* PROPS */, ["disabled", "min", "max", "step", "value", "activeColor", "backgroundColor", "block-size", "block-color", "show-value", "valueColor", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "onChange", "onChanging", "style"])
    ]),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1"}))
    }), [
      _cE("view", _uM({ class: "content" }), [
        _cV(_component_page_head, _uM({ title: "组件属性" })),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "是否显示当前 value",
          onChange: _ctx.change_show_value_boolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "是否禁用",
          onChange: _ctx.change_disabled_boolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cV(_component_input_data, _uM({
          defaultValue: "0",
          title: "最小值(min)",
          type: "number",
          onConfirm: _ctx.confirm_min_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "100",
          title: "最大值(max)",
          type: "number",
          onConfirm: _ctx.confirm_max_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "1",
          title: "步长(step)，取值必须大于 0，并且可被(max - min)整除",
          type: "number",
          onConfirm: _ctx.confirm_step_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "0",
          title: "当前取值(value)",
          type: "number",
          onConfirm: _ctx.confirm_value_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#007aff",
          title: "滑块左侧已选择部分的线条颜色(active-color)",
          type: "text",
          onConfirm: _ctx.confirm_activeColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#e9e9e9",
          title: "背景条的颜色(background-color)",
          type: "text",
          onConfirm: _ctx.confirm_backgroundColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "28",
          title: "滑块的大小(block-size)，取值范围为 12 - 28",
          type: "number",
          onConfirm: _ctx.confirm_block_size_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#ffffff",
          title: "滑块颜色(block-color)",
          type: "text",
          onConfirm: _ctx.confirm_block_color_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        _cV(_component_input_data, _uM({
          defaultValue: "#888888",
          title: "Value颜色(value-color)",
          type: "text",
          onConfirm: _ctx.confirm_value_color_input
        }), null, 8 /* PROPS */, ["onConfirm"])
      ]),
      _cE("view", _uM({ class: "uni-padding-wrap" }), [
        _cV(_component_page_head, _uM({ title: "默认及使用" })),
        _cE("view", _uM({ class: "uni-title" }), "显示当前value"),
        _cE("view", null, [
          _cV(_component_slider, _uM({
            onChange: _ctx.sliderChange,
            value: 50,
            "show-value": true
          }), null, 8 /* PROPS */, ["onChange"])
        ]),
        _cE("view", _uM({ class: "uni-title" }), "设置步进:step=10跳动"),
        _cE("view", null, [
          _cE("view", _uM({ class: "uni-row" }), [
            _cE("text", null, "0"),
            _cE("text", _uM({ class: "m-l-a" }), "100")
          ]),
          _cV(_component_slider, _uM({
            onChange: _ctx.sliderChange,
            value: 60,
            step: 10
          }), null, 8 /* PROPS */, ["onChange"])
        ]),
        _cE("view", _uM({ class: "uni-title" }), "浮点步进:step=0.01跳动"),
        _cE("view", null, [
          _cV(_component_slider, _uM({
            value: 0.5,
            min: 0,
            max: 1,
            step: 0.01,
            "show-value": true
          }))
        ]),
        _cE("view", _uM({ class: "uni-title" }), "设置最小/最大值"),
        _cE("view", null, [
          _cV(_component_slider, _uM({
            onChange: _ctx.sliderChange,
            value: 100,
            min: 50,
            max: 200,
            "show-value": true
          }), null, 8 /* PROPS */, ["onChange"])
        ]),
        _cE("view", _uM({ class: "uni-title" }), "不同颜色和大小的滑块"),
        _cE("view", null, [
          _cV(_component_slider, _uM({
            id: "slider-custom-color-and-size",
            onChange: _ctx.sliderChange,
            value: _ctx.sliderValue,
            backgroundColor: _ctx.sliderBackgroundColor,
            activeColor: _ctx.sliderActiveColor,
            activeBackgroundColor: _ctx.sliderActiveColor,
            blockColor: _ctx.sliderBlockColor,
            foreColor: _ctx.sliderBlockColor,
            "block-size": _ctx.sliderBlockSize
          }), null, 8 /* PROPS */, ["onChange", "value", "backgroundColor", "activeColor", "activeBackgroundColor", "blockColor", "foreColor", "block-size"])
        ]),
        _cE("view", _uM({ class: "uni-title" }), "暗黑模式"),
        _cE("view", null, [
          _cV(_component_slider, _uM({
            "show-value": true,
            backgroundColor: "rgba(32,32,32,0.5)",
            valueColor: "#555"
          }))
        ]),
        _cV(_component_navigator, _uM({
          class: "uni-common-mb",
          url: "./slider-in-swiper"
        }), _uM({
          default: withSlotCtx((): any[] => [
            _cE("button", null, "slider in swiper")
          ]),
          _: 1 /* STABLE */
        })),
        _cV(_component_navigator, _uM({
          class: "uni-common-mb",
          url: "./slider-maxValue"
        }), _uM({
          default: withSlotCtx((): any[] => [
            _cE("button", null, "slider maxValue")
          ]),
          _: 1 /* STABLE */
        }))
      ])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentSliderSliderStyles = [_uM([["main", _pS(_uM([["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "rgba(0,0,0,0.06)"], ["flexDirection", "row"], ["justifyContent", "center"]]))], ["m-l-a", _pS(_uM([["marginLeft", "auto"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
import _easycom_input_data from '@/components/input-data/input-data.vue'
