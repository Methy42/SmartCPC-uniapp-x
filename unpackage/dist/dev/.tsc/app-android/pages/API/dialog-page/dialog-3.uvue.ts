
  import { PageStyleItem, PageStyleArray } from './page-style.uts';
  type CloseAnimationType =
    'auto' |
    'none' |
    'slide-out-right' |
    'slide-out-left' |
    'slide-out-top' |
    'slide-out-bottom' |
    'fade-out' |
    'zoom-in' |
    'zoom-fade-in'

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'dialog 3',
        PageStyleArray: PageStyleArray as PageStyleItem[],
        currentPageStyle: {} as UTSJSONObject,
        closeAnimationType: 'auto' as CloseAnimationType,
        closeAnimationTypeList: [
          'auto',
          'none',
          'slide-out-right',
          'slide-out-left',
          'slide-out-top',
          'slide-out-bottom',
          'fade-out',
          'zoom-in',
          'zoom-fade-in'
        ]
      }
    },
    onLoad(_ : OnLoadOptions) {
      this.getPageStyle()
    },
    methods: {
      getPageStyle() {
        this.currentPageStyle = this.$page.getPageStyle()
      },
      radioChange(key : string, e : RadioGroupChangeEvent) {
        this.setStyleValue(key, e.detail.value);
      },
      sliderChange(key : string, e : UniSliderChangeEvent) {
        this.setStyleValue(key, e.detail.value);
      },
      switchChange(key : string, e : UniSwitchChangeEvent) {
        this.setStyleValue(key, e.detail.value);
      },
      setStyleValue(key : string, value : any) {
        const style = {__$originalPosition: new UTSSourceMapPosition("style", "pages/API/dialog-page/dialog-3.uvue", 94, 15),}
        style[key] = value
        this.setPageStyle(style)
        this.getPageStyle()
      },
      setPageStyle(style : UTSJSONObject) {
        this.$page.setPageStyle(style);
      },
      handleChooseAnimationType(e : RadioGroupChangeEvent){
        this.closeAnimationType = e.detail.value as CloseAnimationType
      },
      closeThisDialog() {
        uni.closeDialogPage({
          dialogPage: this.$page,
          animationType: this.closeAnimationType,
          success(res) {
            console.log('closeDialog success', res, " at pages/API/dialog-page/dialog-3.uvue:110")
          },
          fail(err) {
            console.log('closeDialog fail', err, " at pages/API/dialog-page/dialog-3.uvue:113")
          },
          complete(res) {
            console.log('closeDialog complete', res, " at pages/API/dialog-page/dialog-3.uvue:116")
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIDialogPageDialog3Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_switch = resolveComponent("switch")
const _component_slider = resolveComponent("slider")
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")

  return _cE("view", _uM({
    id: "dialog3",
    class: "dialog-container"
  }), [
    _cE("scroll-view", _uM({ class: "dialog-content" }), [
      _cE("text", null, "title: " + _tD(_ctx.title), 1 /* TEXT */),
      _cE(Fragment, null, RenderHelpers.renderList(_ctx.PageStyleArray, (item, index, __index, _cached): any => {
        return _cE(Fragment, null, [
          _ctx.currentPageStyle[item.key] != null
            ? _cE("view", _uM({
                class: "page-style-item",
                key: index
              }), [
                _cE("view", _uM({ class: "item-text" }), [
                  _cE("text", _uM({ class: "item-text-key" }), _tD(item.key) + ":", 1 /* TEXT */),
                  _cE("text", _uM({ class: "item-text-value" }), _tD(_ctx.currentPageStyle[item.key]), 1 /* TEXT */)
                ]),
                item.type == 'boolean'
                  ? _cE("view", _uM({
                      key: 0,
                      class: "mt-10"
                    }), [
                      _cV(_component_switch, _uM({
                        checked: _ctx.currentPageStyle.getBoolean(item.key),
                        onChange: ($event: any) => {_ctx.switchChange(item.key, $event as UniSwitchChangeEvent)}
                      }), null, 8 /* PROPS */, ["checked", "onChange"])
                    ])
                  : item.type == 'number'
                    ? _cE("view", _uM({
                        key: 1,
                        class: "mt-10"
                      }), [
                        _cV(_component_slider, _uM({
                          value: _ctx.currentPageStyle.getNumber(item.key),
                          "show-value": true,
                          onChange: ($event: any) => {_ctx.sliderChange(item.key, $event as UniSliderChangeEvent)}
                        }), null, 8 /* PROPS */, ["value", "onChange"])
                      ])
                    : item.type == 'string'
                      ? _cE("view", _uM({
                          key: 2,
                          class: "mt-10"
                        }), [
                          _cV(_component_radio_group, _uM({
                            class: "radio-set-value",
                            onChange: ($event: any) => {_ctx.radioChange(item.key, $event as RadioGroupChangeEvent)}
                          }), _uM({
                            default: withSlotCtx((): any[] => [
                              _cE(Fragment, null, RenderHelpers.renderList(item.value, (item2, index2, __index, _cached): any => {
                                return _cV(_component_radio, _uM({
                                  class: "ml-10",
                                  key: index2,
                                  value: item2,
                                  checked: _ctx.currentPageStyle[item.key] == item2
                                }), _uM({
                                  default: withSlotCtx((): any[] => [_tD(item2)]),
                                  _: 2 /* DYNAMIC */
                                }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["value", "checked"])
                              }), 128 /* KEYED_FRAGMENT */)
                            ]),
                            _: 2 /* DYNAMIC */
                          }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["onChange"])
                        ])
                      : _cC("v-if", true)
              ])
            : _cC("v-if", true)
        ], 64 /* STABLE_FRAGMENT */)
      }), 256 /* UNKEYED_FRAGMENT */),
      _cE("text", _uM({ class: "mt-10 choose-close-animation-type-title" }), "choose close dialogPage animationType"),
      _cV(_component_radio_group, _uM({
        class: "choose-close-animation-type-radio-group",
        onChange: _ctx.handleChooseAnimationType
      }), _uM({
        default: withSlotCtx((): any[] => [
          _cE(Fragment, null, RenderHelpers.renderList(_ctx.closeAnimationTypeList, (item, __key, __index, _cached): any => {
            return _cV(_component_radio, _uM({
              class: "ml-10 mt-10",
              key: item,
              value: item,
              checked: _ctx.closeAnimationType == item
            }), _uM({
              default: withSlotCtx((): any[] => [_tD(item)]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["value", "checked"])
          }), 128 /* KEYED_FRAGMENT */)
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["onChange"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.closeThisDialog
      }), " closeThisDialog ", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIDialogPageDialog3Styles = [_uM([["dialog-container", _pS(_uM([["width", "100%"], ["height", "100%"], ["backgroundColor", "rgba(0,0,0,0.3)"], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["dialog-content", _pS(_uM([["width", "90%"], ["height", 500], ["paddingTop", 10], ["paddingRight", 6], ["paddingBottom", 10], ["paddingLeft", 6], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 6], ["borderTopRightRadius", 6], ["borderBottomRightRadius", 6], ["borderBottomLeftRadius", 6]]))], ["mt-10", _pS(_uM([["marginTop", 10]]))], ["ml-10", _pS(_uM([["marginLeft", 10]]))], ["page-style-item", _pS(_uM([["paddingTop", 6], ["paddingRight", 0], ["paddingBottom", 6], ["paddingLeft", 0], ["marginTop", 10], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5]]))], ["item-text", _pS(_uM([["flexDirection", "row"]]))], ["item-text-key", _pS(_uM([["fontWeight", "bold"]]))], ["item-text-value", _pS(_uM([["marginLeft", 5]]))], ["radio-set-value", _pS(_uM([["flexDirection", "row"]]))], ["choose-close-animation-type-title", _pS(_uM([["fontWeight", "bold"]]))], ["choose-close-animation-type-radio-group", _pS(_uM([["flexDirection", "row"], ["flexWrap", "wrap"]]))]])]
