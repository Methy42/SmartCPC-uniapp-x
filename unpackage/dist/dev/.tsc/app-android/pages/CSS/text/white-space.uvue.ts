
  import { ItemType } from '@/components/enum-data/enum-data-types'
  const __sfc__ = defineComponent({
    data() {
      return {
        textStyle: "white-space: normal;",
        white_space: [
          { "value": 0, "name": "normal" },
          { "value": 1, "name": "nowrap" },
          { "value": 2, "name": "pre" },
          { "value": 3, "name": "pre-wrap" },
          { "value": 4, "name": "pre-line" },
          { "value": 5, "name": "break-spaces" }] as ItemType[],
        multiLineText: `HBuilderX，
	轻巧、
		极速，
			极客编辑器；
				uni-app x，
					终极跨平台方案；
				uts，
			大一统语言

HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言`
      }
    },
    methods: {
      radio_change(checked : number) {
        this.textStyle = `white-space: ${this.white_space[checked].name};`
      }
    },
  })

export default __sfc__
function GenPagesCSSTextWhiteSpaceRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_enum_data = resolveEasyComponent("enum-data",_easycom_enum_data)

  return _cE("view", _uM({
    style: _nS(_uM({"flex-grow":"1"}))
  }), [
    _cE("scroll-view", _uM({
      style: _nS(_uM({"padding":"10px 0px","background-color":"gray","justify-content":"center"})),
      direction: "horizontal"
    }), [
      _cE("text", _uM({
        class: "text",
        style: _nS(_ctx.textStyle)
      }), _tD(_ctx.multiLineText), 5 /* TEXT, STYLE */)
    ], 4 /* STYLE */),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1"}))
    }), [
      _cE("view", _uM({ class: "content" }), [
        _cV(_component_enum_data, _uM({
          items: _ctx.white_space,
          title: "white-space",
          onChange: _ctx.radio_change
        }), null, 8 /* PROPS */, ["items", "onChange"])
      ])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSTextWhiteSpaceStyles = [_uM([["text", _pS(_uM([["fontSize", 20], ["alignSelf", "flex-start"]]))]])]

import _easycom_enum_data from '@/components/enum-data/enum-data.vue'
