import iconpath from "./uniicons.ttf";

  
const __sfc__ = defineComponent({
  __name: 'uni-navbar-lite',
  props: {
    title: { type: String, default: "" },
    isLeft: { type: Boolean, default: false },
    textColor: { type: String, default: "#000" },
    statusBar: { type: Boolean, default: false },
    stat: { type: Boolean, default: false }
  },
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;


  const props = __props

  let statusBarHeight = ref(0)

  const unicode = computed(() : string => "\ue600")

  onMounted(() => {

    uni.loadFontFace({
      global: false,
      family: "UniIconsFontFamily",
      source: `url("${iconpath}")`,
      success() { },
      fail(err) {
        console.log(err, " at components/uni-navbar-lite/uni-navbar-lite.uvue:56");
      },
    });


    uni.setNavigationBarColor({
      frontColor: "#000000",
      backgroundColor: "#ffffff",
    });





    if (props.stat && props.title != '') {
      uni.report({
        name: 'title',
        options: props.title
      })
    }
  })

  const back = () => {
    uni.navigateBack({});
  }

return (): any | null => {

  return _cE("view", _uM({ class: "uni-navbar" }), [
    isTrue(_ctx.statusBar)
      ? _cE("view", _uM({
          key: 0,
          class: "status-bar"
        }))
      : _cC("v-if", true),
    _cE("view", _uM({ class: "uni-navbar-inner" }), [
      _cE("view", _uM({
        class: "left-content",
        onClick: back
      }), [
        _cE("text", _uM({
          style: _nS(_uM({ color: _ctx.textColor })),
          class: "uni-icons"
        }), _tD(unref(unicode)), 5 /* TEXT, STYLE */)
      ]),
      _cE("view", _uM({
        class: _nC(["uni-navbar-content", _uM({ 'is-left': _ctx.isLeft })])
      }), [
        _cE("text", _uM({
          style: _nS(_uM({ color: _ctx.textColor }))
        }), [
          renderSlot(_ctx.$slots, "default", {}, (): any[] => [_tD(_ctx.title)])
        ], 4 /* STYLE */)
      ], 2 /* CLASS */),
      _cE("view", _uM({ class: "right-content" }), [
        renderSlot(_ctx.$slots, "right")
      ])
    ])
  ])
}
}

})
export default __sfc__
export type UniNavbarLiteComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsUniNavbarLiteUniNavbarLiteStyles = [_uM([["uni-icons", _pS(_uM([["!fontFamily", "UniIconsFontFamily"], ["fontSize", 26], ["fontStyle", "normal"], ["color", "#333333"]]))], ["status-bar", _pS(_uM([["height", CSS_VAR_STATUS_BAR_HEIGHT]]))], ["uni-navbar", _pS(_uM([["backgroundColor", "#007aff"]]))], ["uni-navbar-inner", _pS(_uM([["position", "relative"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["height", 45]]))], ["left-content", _pS(_uM([["justifyContent", "center"], ["alignItems", "center"], ["width", 40], ["height", "100%"]]))], ["right-content", _pS(_uM([["justifyContent", "center"], ["alignItems", "center"], ["width", 40], ["height", "100%"]]))], ["uni-navbar-content", _pS(_uM([["position", "absolute"], ["height", "100%"], ["top", 0], ["bottom", 0], ["left", 45], ["right", 45], ["flexDirection", "row"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["is-left", _pS(_uM([["justifyContent", "flex-start"]]))]])]
