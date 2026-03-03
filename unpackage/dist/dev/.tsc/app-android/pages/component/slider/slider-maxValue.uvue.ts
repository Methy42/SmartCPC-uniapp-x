
	const __sfc__ = defineComponent({
		data() {
			return {
        sliderX: 0,
        sliderY: 0,
        sliderHeight: 0,
        sliderValue: 0
			}
		},
    onReady() {












    },
		methods: {
      valueChange(e: UniSliderChangeEvent) {
				console.log('valueChange', e.detail.value, " at pages/component/slider/slider-maxValue.uvue:36")
        this.sliderValue = e.detail.value
			}
		}
	})

export default __sfc__
function GenPagesComponentSliderSliderMaxValueRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_slider = resolveComponent("slider")

  return _cE("view", _uM({ class: "uni-padding-wrap" }), [
    _cE("view", _uM({ class: "uni-title" }), "最大值溢出测试（不能滑动到最右侧）"),
    _cE("view", null, [
      _cV(_component_slider, _uM({
        id: "slider",
        value: 0,
        min: 0,
        max: 10.5,
        step: 1,
        "show-value": true,
        onChange: _ctx.valueChange
      }), null, 8 /* PROPS */, ["onChange"])
    ])
  ])
}
const GenPagesComponentSliderSliderMaxValueStyles = []
