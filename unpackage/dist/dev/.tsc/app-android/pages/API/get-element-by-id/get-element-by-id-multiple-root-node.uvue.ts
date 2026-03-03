
  const __sfc__ = defineComponent({
    data() {
      return {
        checked: false,
        homePagePath: '/pages/tabBar/component',
        launchOptionsPath: '',
      }
    },
    methods: {
      getElementByNotExistId() : Element | null {
        return uni.getElementById('not-exist-id')
      },
      changePageHeadBackgroundColor() {
        const pageHead = uni.getElementById('page-head')!
        pageHead.style.setProperty('background-color', 'red')
      },
      changeTextColor() {
        const text = uni.getElementById('text')!
        text.style.setProperty('color', 'red')
      },
      changeViewStyle() {
        const view = uni.getElementById<UniViewElement>('view')
        if (view !== null) {
          view.style.setProperty('width', '90%')
          view.style.setProperty('height', '50px')
          view.style.setProperty('background-color', '#007AFF')
        }
      }
    }
  })

export default __sfc__
function GenPagesAPIGetElementByIdGetElementByIdMultipleRootNodeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({
      id: "page-head",
      title: "getElementById-multiple-root-node"
    })),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("text", _uM({ id: "text" }), "this is text"),
      _cE("view", _uM({
        id: "view",
        class: "uni-common-mt",
        style: _nS(_uM({"border":"1px solid red"}))
      }), "this is view", 4 /* STYLE */),
      _cE("button", _uM({
        class: "uni-btn",
        onClick: _ctx.changePageHeadBackgroundColor
      }), " 修改 page-head 背景色 ", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "uni-btn",
        onClick: _ctx.changeTextColor
      }), "修改 text 字体颜色", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "uni-btn",
        onClick: _ctx.changeViewStyle
      }), " 修改 view 宽高及背景色 ", 8 /* PROPS */, ["onClick"])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIGetElementByIdGetElementByIdMultipleRootNodeStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
