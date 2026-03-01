
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'image-large',
        src: 'https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/img/building.jpg',
        width: 0,
        height: 0,
        memory: 0
      }
    },
    methods: {
      load(event : ImageLoadEvent) {
        this.width = event.detail.width;
        this.height = event.detail.height;
        this.memory = Math.round(this.width * this.height * 4 / 1024 / 1024 * 100) / 100;
      }
    }
  })

export default __sfc__
function GenPagesComponentImageImageLargeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "大图示例")
      ]),
      _cE(Fragment, null, RenderHelpers.renderList(10, (_, __key, __index, _cached): any => {
        return _cE("view", _uM({ class: "uni-common-mt" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "width=" + _tD(_ctx.width) + "px height=" + _tD(_ctx.height) + "px memory=" + _tD(_ctx.memory) + "MB", 1 /* TEXT */),
          _cE("image", _uM({
            class: "image",
            mode: "widthFix",
            src: _ctx.src,
            onLoad: _ctx.load
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onLoad"])
        ])
      }), 64 /* STABLE_FRAGMENT */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentImageImageLargeStyles = [_uM([["image", _pS(_uM([["width", "100%"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
