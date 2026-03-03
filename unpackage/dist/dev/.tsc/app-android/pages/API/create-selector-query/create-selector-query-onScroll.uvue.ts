
  const __sfc__ = defineComponent({
    data() {
      return {
        count: 0,
        ret: true
      }
    },
    onLoad() {

    },
    methods: {
      onScroll() {
        this.count++
        console.log("scroll: ", this.count, " at pages/API/create-selector-query/create-selector-query-onScroll.uvue:23")
        uni.createSelectorQuery()
          .in(this)
          .selectAll('content-item')
          .boundingClientRect()
          .exec((result) => {
            this.count--
          })
        console.log("scroll: ", this.count, " at pages/API/create-selector-query/create-selector-query-onScroll.uvue:31")

        if (this.count > 0) {
          this.ret = false
        }
      }
    }
  })

export default __sfc__
function GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScrollRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    onScroll: _ctx.onScroll,
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE(Fragment, null, RenderHelpers.renderList(60, (i, __key, __index, _cached): any => {
      return _cE("view", _uM({ class: "content-item" }), [
        _cE("text", _uM({ class: "text" }), "item-" + _tD(i), 1 /* TEXT */)
      ])
    }), 64 /* STABLE_FRAGMENT */)
  ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onScroll"])
}
const GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScrollStyles = []
