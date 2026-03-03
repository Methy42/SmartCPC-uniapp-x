
  const __sfc__ = defineComponent({
    data() {
      return {
        scrollData: [] as Array<string>,
        num: 0,
      }
    },
    onLoad() {
      let lists : Array<string> = []
      for (let i = 0; i < 30; i++) {
        lists.push("item---" + i)
      }
      this.scrollData = lists
    },
    onReady() {
      this.num = 3
    },
    methods: {
    }
  })

export default __sfc__
function GenPagesComponentNestedScrollHeaderNestedScrollHeaderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"})),
    type: "nested",
    direction: "vertical"
  }), [
    _cE("nested-scroll-header", null, [
      _cE("view", _uM({ class: "scroll-header-tiem1" }), [
        _cE("text", null, "会渲染的nested-scroll-header")
      ]),
      _cE("view", _uM({ class: "scroll-header-tiem1" }), [
        _cE("text", null, "不会渲染nested-scroll-header，因为 nested-scroll-header 只会渲染第一个子节点")
      ])
    ]),
    _cE("nested-scroll-header", null, [
      _cE("swiper", _uM({
        ref: "header",
        "indicator-dots": "true",
        circular: "true"
      }), [
        _cE(Fragment, null, RenderHelpers.renderList(_ctx.num, (i, __key, __index, _cached): any => {
          return _cE("swiper-item", _uM({ "item-id": i }), [
            _cE("view", _uM({ class: "scroll-header-tiem2" }), [
              _cE("text", null, "如果存在多个头部节点，那么就使用多个 nested-scroll-header 来将其包裹")
            ])
          ], 8 /* PROPS */, ["item-id"])
        }), 256 /* UNKEYED_FRAGMENT */)
      ], 512 /* NEED_PATCH */)
    ]),
    _cE("nested-scroll-body", null, [
      _cE("scroll-view", _uM({
        style: _nS(_uM({"flex":"1"})),
        "associative-container": "nested-scroll-view"
      }), [
        _cE(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, (key, __key, __index, _cached): any => {
          return _cE("view", null, [
            _cE("view", _uM({ class: "scroll-item" }), [
              _cE("text", _uM({ class: "scroll-item-title" }), _tD(key), 1 /* TEXT */)
            ])
          ])
        }), 256 /* UNKEYED_FRAGMENT */)
      ], 4 /* STYLE */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentNestedScrollHeaderNestedScrollHeaderStyles = [_uM([["scroll-item", _pS(_uM([["marginLeft", 6], ["marginRight", 6], ["marginTop", 6], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 4], ["borderTopRightRadius", 4], ["borderBottomRightRadius", 4], ["borderBottomLeftRadius", 4]]))], ["scroll-item-title", _pS(_uM([["width", "100%"], ["height", 60], ["lineHeight", "60px"], ["textAlign", "center"], ["color", "#555555"]]))], ["scroll-header-tiem1", _pS(_uM([["height", 200], ["backgroundColor", "#66ccff"], ["alignItems", "center"], ["justifyContent", "center"]]))], ["scroll-header-tiem2", _pS(_uM([["height", 100], ["backgroundColor", "#89ff8d"], ["alignItems", "center"], ["justifyContent", "center"]]))]])]
