
  import { PageStyleItem, PageStyleArray } from './page-style.uts';

  class Page {
    constructor(public route : string) {
    }
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        checked: false,
        pages: [] as Page[],
        PageStyleArray: PageStyleArray as PageStyleItem[],
        currentPageStyle: {} as UTSJSONObject,
        testing: false
      }
    },
    computed: {
      pageStyleText() : string {
        return JSON.stringify(this.currentPageStyle)
      }
    },

    onLoad() {
      this.getPageStyle();
    },

    onReady() {

      this.setPageStyle({
        'androidThreeButtonNavigationBackgroundColor': 'transparent',
        'androidThreeButtonNavigationStyle': 'black'
      });
      this.getPageStyle();

    },
    onPullDownRefresh() {
      setTimeout(() => {
        uni.stopPullDownRefresh()
      }, 2000)
    },
    methods: {
      startPullDownRefresh() {
        uni.startPullDownRefresh()
      },
      _getCurrentPages: function () {
        this.pages.length = 0
        const pages = getCurrentPages()
        this.pages.push(new Page(pages[0].route))
        if (this.pages[0].route.includes('/tabBar/') || this.pages[0].route == '/') {
          this.checked = true
        }
        for (let i = 1; i < pages.length; i++) {
          this.pages.push(new Page(pages[i].route))
          if (pages[i].route.includes('/tabBar/')) {
            this.checked = false
          }
        }
      },
      /// get-set-page-style
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
        const style = {}
        style[key] = value
        this.setPageStyle(style)
        this.getPageStyle()
      },
      getPageStyle() : UTSJSONObject {
        const pages = getCurrentPages();
        const currentPage = pages[pages.length - 1];
        this.currentPageStyle = currentPage.getPageStyle()
        console.log(this.currentPageStyle)
        return this.currentPageStyle;
      },
      setPageStyle(style : UTSJSONObject) {
        console.log('setPageStyle:', style);
        const pages = getCurrentPages();
        const currentPage = pages[pages.length - 1];
        currentPage.setPageStyle(style);
      },
      goSetDisablePullDownRefresh() {
        uni.navigateTo({
          url: '/pages/API/get-current-pages/set-page-style-disable-pull-down-refresh'
        });
      },
      getCurrentPage() : UniPage {
        const pages = getCurrentPages()
        return pages[pages.length - 1]
      },
      check$page() : boolean {
        const page = this.getCurrentPage()
        let res = this.$page === page
        if (this.testing && res) {
          res = page.options['test'] == '123'
          if (res) {
            res = page.route == 'pages/API/get-current-pages/get-current-pages'
          }
        }
        console.log('check $page', res)
        uni.showToast(res ? { title: 'check success' } : { title: 'check fail', icon: 'error' })
        return res
      },
      checkGetParentPage() : boolean {
        const page = this.getCurrentPage()
        const parentPage = page.getParentPage()
        const res = parentPage == null
        console.log('check getParentPage', res)
        uni.showToast(res ? { title: 'check success' } : { title: 'check fail', icon: 'error' })
        return res
      },
      checkGetDialogPages() : boolean {
        const page = this.getCurrentPage()
        const dialogPages = page.getDialogPages()
        const res = Array.isArray(dialogPages) && dialogPages.length == 0
        uni.showToast(res ? { title: 'check success' } : { title: 'check fail', icon: 'error' })
        console.log('check getDialogPages', res)
        return res
      },
      checkGetElementById() : boolean {
        const page = this.getCurrentPage()
        const element = page.getElementById('check-get-element-by-id-btn')
        let res = element != null







        console.log('check getElementById', res)
        uni.showToast(res ? { title: 'check success' } : { title: 'check fail', icon: 'error' })
        return res
      },
      checkGetAndroidView() : boolean {
        const page = this.getCurrentPage()
        const androidView = page.getAndroidView()
        const res = androidView != null
        console.log('check getAndroidView', res)
        uni.showToast(res ? { title: 'check success' } : { title: 'check fail', icon: 'error' })
        return res
      },
      checkGetIOSView() : boolean {
        const page = this.getCurrentPage()
        const IOSView = page.getIOSView()
        const res = IOSView != null
        console.log('check getIOSView', res)
        uni.showToast(res ? { title: 'check success' } : { title: '仅 IOS uts 插件环境支持', icon: 'error' })
        return res
      },
      checkGetHTMLElement() : boolean {
        const page = this.getCurrentPage()
        const HTMLView = page.getHTMLElement()
        const res = HTMLView != null
        console.log('check getHTMLElement', res)
        uni.showToast(res ? { title: 'check success' } : { title: 'check fail', icon: 'error' })
        return res
      },
      checkGetAndroidActivity() : boolean {
        const page = this.getCurrentPage()
        const activity = page.getAndroidActivity()
        const res = activity != null
        console.log('check getAndroidActivity', res)
        uni.showToast(res ? { title: 'check success' } : { title: 'check getAndroidActivity', icon: 'error' })
        return res
      }
    },
  })

export default __sfc__
function GenPagesAPIGetCurrentPagesGetCurrentPagesRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_switch = resolveComponent("switch")
const _component_slider = resolveComponent("slider")
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")

  return _cE("scroll-view", _uM({ class: "page-scroll-view" }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: "getCurrentPages" })),
      _cE("view", _uM({ class: "uni-padding-wrap" }), [
        _cE("button", _uM({ onClick: _ctx._getCurrentPages }), "getCurrentPages", 8 /* PROPS */, ["onClick"]),
        isTrue(_ctx.pages.length)
          ? _cE("view", _uM({
              key: 0,
              style: _nS(_uM({"padding":"15px 0px"}))
            }), [
              _cE("text", null, "当前页面栈中 " + _tD(_ctx.pages.length) + " 个页面，列表如下：", 1 /* TEXT */),
              _cE(Fragment, null, RenderHelpers.renderList(_ctx.pages, (page, index, __index, _cached): any => {
                return _cE("text", _uM({
                  key: page.route,
                  style: _nS(_uM({"margin-top":"5px"}))
                }), "index: " + _tD(index) + ", route: " + _tD(page.route), 5 /* TEXT, STYLE */)
              }), 128 /* KEYED_FRAGMENT */)
            ], 4 /* STYLE */)
          : _cC("v-if", true),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.check$page
        }), "check $page", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.checkGetParentPage
        }), " check getParentPage ", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.checkGetDialogPages
        }), " check getDialogPages ", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          id: "check-get-element-by-id-btn",
          class: "uni-common-mt",
          onClick: _ctx.checkGetElementById
        }), " check getElementById ", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.checkGetAndroidView
        }), " check getAndroidView ", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.checkGetIOSView
        }), " check getIOSView ", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.checkGetHTMLElement
        }), " check getHTMLElement ", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-common-mt",
          onClick: _ctx.checkGetAndroidActivity
        }), " check getAndroidActivity ", 8 /* PROPS */, ["onClick"])
      ]),
      _cV(_component_page_head, _uM({ title: "currentPageStyle" })),
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
                      class: "set-value"
                    }), [
                      _cV(_component_switch, _uM({
                        checked: _ctx.currentPageStyle.getBoolean(item.key),
                        onChange: ($event: any) => {_ctx.switchChange(item.key, $event as UniSwitchChangeEvent)}
                      }), null, 8 /* PROPS */, ["checked", "onChange"])
                    ])
                  : item.type == 'number'
                    ? _cE("view", _uM({
                        key: 1,
                        class: "set-value"
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
                          class: "set-value"
                        }), [
                          _cV(_component_radio_group, _uM({
                            class: "radio-set-value",
                            onChange: ($event: any) => {_ctx.radioChange(item.key, $event as RadioGroupChangeEvent)}
                          }), _uM({
                            default: withSlotCtx((): any[] => [
                              _cE(Fragment, null, RenderHelpers.renderList(item.value, (item2, index2, __index, _cached): any => {
                                return _cV(_component_radio, _uM({
                                  class: "radio-value",
                                  key: index2,
                                  value: item2
                                }), _uM({
                                  default: withSlotCtx((): any[] => [_tD(item2)]),
                                  _: 2 /* DYNAMIC */
                                }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["value"])
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
      _cE("button", _uM({
        style: _nS(_uM({"margin":"10px"})),
        onClick: _ctx.goSetDisablePullDownRefresh
      }), " go set disable pullDownRefresh ", 12 /* STYLE, PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIGetCurrentPagesGetCurrentPagesStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["page-style", _pS(_uM([["marginTop", 15]]))], ["page-style-item", _pS(_uM([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["marginTop", 10], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5]]))], ["item-text", _pS(_uM([["flexDirection", "row"]]))], ["item-text-key", _pS(_uM([["fontWeight", "bold"]]))], ["item-text-value", _pS(_uM([["marginLeft", 5]]))], ["set-value", _pS(_uM([["marginTop", 10]]))], ["radio-set-value", _pS(_uM([["flexDirection", "row"]]))], ["radio-value", _pS(_uM([["marginLeft", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
