
  const __sfc__ = defineComponent({
    data() {
      return {
        text1: "",
        text2: "",
        text3: "test-text-node",
        viewCount: 0,
        selectCount: 0,
        selectAllCount: 0,
        show: false,
        testCounter: 0
      }
    },
    mounted() {
      uni.createSelectorQuery().in(this).select('.selector-query-view').boundingClientRect().exec((ret) => {
        this.text1 = JSON.stringify(ret, null, 2)
        if (ret.length == 1) {
          this.selectCount = ret.length
        }
        this.testCounter++
        this._dispatchEvent()
      })
      uni.createSelectorQuery().in(this).selectAll('.selector-query-view').boundingClientRect().exec((ret) => {
        this.text2 = JSON.stringify(ret, null, 2)
        if (ret.length == 1) {
          this.selectAllCount = (ret[0] as NodeInfo[]).length
        }
        this.testCounter++
        this._dispatchEvent()
      })
    },
    methods: {
      _dispatchEvent() {
        if (this.testCounter == 2) {
          uni.$emit('childReady')
        }
      }
    }
  })

export default __sfc__
function GenPagesAPICreateSelectorQuerySelectorQueryChildMultiRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE(Fragment, null, [
    _cE("view", _uM({ class: "selector-query-view" }), [
      _cE("text", null, "selector-query"),
      _cE("text", _uM({ class: "text red" }), _tD(_ctx.text1), 1 /* TEXT */)
    ]),
    _cE("view", _uM({ class: "selector-query-view" }), [
      _cE("text", null, "selector-query"),
      _cE("text", _uM({ class: "text green" }), _tD(_ctx.text2), 1 /* TEXT */)
    ]),
    _ctx.text1.length>0
      ? _cE("view", _uM({ key: 0 }), "1")
      : _cC("v-if", true),
    _cE("text", null, _tD(_ctx.text3), 1 /* TEXT */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPICreateSelectorQuerySelectorQueryChildMultiStyles = [_uM([["green", _pS(_uM([["borderTopWidth", 3], ["borderRightWidth", 3], ["borderBottomWidth", 3], ["borderLeftWidth", 3], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#008000"], ["borderRightColor", "#008000"], ["borderBottomColor", "#008000"], ["borderLeftColor", "#008000"]]))], ["red", _pS(_uM([["borderTopWidth", 3], ["borderRightWidth", 3], ["borderBottomWidth", 3], ["borderLeftWidth", 3], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#FF0000"], ["borderRightColor", "#FF0000"], ["borderBottomColor", "#FF0000"], ["borderLeftColor", "#FF0000"]]))], ["view", _pS(_uM([["borderTopWidth", 3], ["borderRightWidth", 3], ["borderBottomWidth", 3], ["borderLeftWidth", 3], ["borderTopStyle", "dashed"], ["borderRightStyle", "dashed"], ["borderBottomStyle", "dashed"], ["borderLeftStyle", "dashed"], ["borderTopColor", "#00FF00"], ["borderRightColor", "#00FF00"], ["borderBottomColor", "#00FF00"], ["borderLeftColor", "#00FF00"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["text", _pS(_uM([["marginTop", 20], ["paddingTop", 5], ["paddingRight", 5], ["paddingBottom", 5], ["paddingLeft", 5]]))]])]
