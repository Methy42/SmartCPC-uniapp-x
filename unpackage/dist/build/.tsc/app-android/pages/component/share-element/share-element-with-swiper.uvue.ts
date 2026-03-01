
  type ShareElementOpenAnimationType =
    'auto' |
    'none' |
    'slide-in-right' |
    'slide-in-left' |
    'slide-in-top' |
    'slide-in-bottom' |
    'fade-in' |
    'pop-in' |
    'zoom-out' |
    'zoom-fade-out'

  type ShareElementEasingFunctionType =
    'ease' |
    'ease-in' |
    'ease-out' |
    'ease-in-out' |
    'linear'

  type ShuttleOnType =
    'from' |
    'to'

  import { ItemType } from '@/components/enum-data/enum-data-types'
  const __sfc__ = defineComponent({
    data() {
      return {
        transitionOnGesture: true,
        shuttleOnPopType: 'to' as ShuttleOnType,
        shuttleOnPushType: 'to' as ShuttleOnType,
        shuttleOnTypeList: [
          'from',
          'to'
        ],
        openAnimationType: 'slide-in-right' as ShareElementOpenAnimationType,
        openAnimationTypeList: [
          'auto',
          'none',
          'slide-in-right',
          'slide-in-left',
          'slide-in-top',
          'slide-in-bottom',
          'fade-in',
          'pop-in',
          'zoom-out',
          'zoom-fade-out'
        ],
        easingFunctionType: 'ease' as ShareElementEasingFunctionType,
        easingFunctionTypeList: [
          'ease',
          'ease-in',
          'ease-out',
          'ease-in-out',
          'linear'
        ]
      }
    },
    methods: {
      openPage() {
        uni.navigateTo({
          animationType: this.openAnimationType,
          url: "/pages/component/share-element/share-element-to?shuttleOnPush=" + this.shuttleOnPushType + "&transitionOnGesture=" + this.transitionOnGesture
        })
      }
    }
  })

export default __sfc__
function GenPagesComponentShareElementShareElementWithSwiperRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: "share-element" })),
    _cE("view", _uM({ class: "main" }), [
      _cE("swiper", _uM({ circular: "true" }), [
        _cE("swiper-item", null, [
          _cE("share-element", _uM({
            class: "share-element",
            "share-key": "left",
            "shuttle-on-pop": _ctx.shuttleOnPopType,
            "transition-on-gesture": _ctx.transitionOnGesture,
            "shuttle-on-push": _ctx.shuttleOnPushType,
            "easing-function": _ctx.easingFunctionType,
            onClick: () => {_ctx.openPage()}
          }), [
            _cE("image", _uM({
              style: _nS(_uM({"width":"100px","height":"150px"})),
              src: "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/drop-card-1.jpg"
            }), null, 4 /* STYLE */)
          ], 8 /* PROPS */, ["shuttle-on-pop", "transition-on-gesture", "shuttle-on-push", "easing-function", "onClick"])
        ])
      ])
    ]),
    _cE("button", _uM({
      type: "primary",
      onClick: _ctx.openPage,
      class: "button"
    }), " 打开share-element页面 ", 8 /* PROPS */, ["onClick"])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentShareElementShareElementWithSwiperStyles = [_uM([["ml-10", _pS(_uM([["marginLeft", 10]]))], ["choose-property-title", _pS(_uM([["fontWeight", "bold"]]))], ["choose-property-type-radio-group", _pS(_uM([["flexDirection", "row"], ["flexWrap", "wrap"]]))], ["bottomWrap", _pS(_uM([["width", "100%"], ["bottom", 0], ["height", 80], ["position", "fixed"]]))], ["bottom", _pS(_uM([["width", "100%"], ["height", "100%"], ["alignItems", "center"], ["justifyContent", "center"], ["backgroundColor", "#007aff"]]))], ["main", _pS(_uM([["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0], ["alignItems", "center"], ["justifyContent", "center"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
