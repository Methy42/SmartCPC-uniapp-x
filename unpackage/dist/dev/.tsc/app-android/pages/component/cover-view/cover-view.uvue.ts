
  const __sfc__ = defineComponent({
    data() {
      return {
        showMap: false,
        latitude: 39.909,
        longitude: 116.39742
      };
    },
    onLoad() {
      this.showMap = true
    }
  })

export default __sfc__
function GenPagesComponentCoverViewCoverViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_map = resolveComponent("map")

  return _cE("view", null, [
    _cV(_component_page_head, _uM({ title: "cover-view用于覆盖map、video等原生组件" })),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mb" }), [
      _cE("text", _uM({ class: "uni-subtitle-text" }), "注意：Web和App需正确配置地图SDK的Key才能正常显示地图组件")
    ]),
    _cE("view", _uM({ class: "cover-content" }), [
      _cV(_component_map, _uM({
        class: "map",
        latitude: _ctx.latitude,
        longitude: _ctx.longitude
      }), null, 8 /* PROPS */, ["latitude", "longitude"]),
      _cE("cover-view", _uM({ class: "cover-view" }), "简单的cover-view"),
      _cE("image", _uM({
        class: "cover-image",
        src: "/static/uni.png"
      }))
    ])
  ])
}
const GenPagesComponentCoverViewCoverViewStyles = [_uM([["map", _pS(_uM([["width", "100%"], ["height", 600]]))], ["cover-content", _pS(_uM([["position", "relative"]]))], ["cover-view", _pS(_uM([["position", "absolute"], ["left", 5], ["top", 5], ["width", 188], ["textAlign", "center"], ["backgroundColor", "#DDDDDD"]]))], ["cover-image", _pS(_uM([["position", "absolute"], ["left", 0], ["top", 0], ["right", 0], ["bottom", 0], ["marginTop", "auto"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["width", 96], ["height", 96]]))], ["tips", _pS(_uM([["fontSize", 12], ["marginTop", 15], ["opacity", 0.8]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
