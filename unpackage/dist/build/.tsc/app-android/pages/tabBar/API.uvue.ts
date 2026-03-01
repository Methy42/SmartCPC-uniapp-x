
  import { generateMenu, MenuItem } from './generateMenu.uts'
  const menu = generateMenu('pages/API')
  import { state } from '@/store/index.uts'
  const __sfc__ = defineComponent({
    data() {
      return {
        menu: menu as MenuItem[],
        arrowRightIcon: '/static/icons/arrow-right.png'
      }
    },
    computed: {
      hasLeftWin() : boolean {
        return !state.noMatchLeftWindow
      },
      leftWinActive() : string {
        return state.leftWinActive.slice(1)
      },
      windowWidth() : number {
        return uni.getWindowInfo().windowWidth
      },
      isDarkMode() : boolean {
        return state.isDarkMode
      },
      netless() : boolean {
        return state.netless
      }
    },














    methods: {
      goPage(url : string) {
        if (url == '/set-tab-bar') {
          this.showPop()
        }else {
          if (this.hasLeftWin) {
            uni.reLaunch({ url })
          } else {
            uni.navigateTo({ url })
          }
        }
      },
      showPop: function () {
        (this.$refs["pop"] as UniElement).style.setProperty("display", "flex")
      },
      hidePop: function () {
        (this.$refs["pop"] as UniElement).style.setProperty("display", "none")
      },
      stopClickPop: function (e : PointerEvent) {
        e.stopPropagation() //点击到pop的非灰色区域，拦截点击事件
      },
      stopPropagation() {

      }
    },

















  })

export default __sfc__
function GenPagesTabBarAPIRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_u_link = resolveEasyComponent("u-link",_easycom_u_link)
const _component_uni_collapse_item = resolveEasyComponent("uni-collapse-item",_easycom_uni_collapse_item)
const _component_uni_collapse = resolveEasyComponent("uni-collapse",_easycom_uni_collapse)
const _component_api_set_tabbar = resolveEasyComponent("api-set-tabbar",_easycom_api_set_tabbar)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"})),
    "enable-back-to-top": "true"
  }), [
    _cE("view", _uM({
      class: _nC(["uni-container", _ctx.isDarkMode ? 'theme-dark' : 'theme-light'])
    }), [
      isTrue(!_ctx.hasLeftWin)
        ? _cE("view", _uM({
            key: 0,
            class: "uni-header-logo"
          }), [
            _cE("image", _uM({
              class: "uni-header-image",
              src: "/static/apiIndex.png"
            }))
          ])
        : _cC("v-if", true),
      isTrue(!_ctx.hasLeftWin)
        ? _cE("view", _uM({
            key: 1,
            class: "uni-text-box"
          }), [
            _cE("text", _uM({ class: "hello-text" }), "以下将演示uni-app x接口能力，详细文档见："),
            _cV(_component_u_link, _uM({
              href: 'https://uniapp.dcloud.io/uni-app-x/api/',
              text: 'https://uniapp.dcloud.io/uni-app-x/api/',
              inWhiteList: true
            }), null, 8 /* PROPS */, ["href", "text"])
          ])
        : _cC("v-if", true),
      _cV(_component_uni_collapse, null, _uM({
        default: withSlotCtx((): any[] => [
          _cE(Fragment, null, RenderHelpers.renderList(_ctx.menu, (menuItem, __key, __index, _cached): any => {
            return _cV(_component_uni_collapse_item, _uM({
              ref_for: true,
              ref: "category",
              key: menuItem.id,
              title: menuItem.name,
              class: "uni-panel"
            }), _uM({
              default: withSlotCtx((): any[] => [
                _cE(Fragment, null, RenderHelpers.renderList(menuItem.items, (childMenuItem, __key, __index, _cached): any => {
                  return _cE(Fragment, _uM({
                    key: childMenuItem.id
                  }), [
                    childMenuItem.items.length==0
                      ? _cE("view", _uM({
                          key: 0,
                          class: _nC(["pl", _uM({'uni-navigate-item':childMenuItem.path !== 'set-tab-bar' || _ctx.windowWidth <= 768})]),
                          "hover-class": "is--active",
                          onClick: () => {_ctx.goPage(`/${childMenuItem.path}`)}
                        }), [
                          isTrue(childMenuItem.path !== 'set-tab-bar' || _ctx.windowWidth <= 768)
                            ? _cE(Fragment, _uM({ key: 0 }), [
                                _cE("text", _uM({
                                  class: _nC(["uni-navigate-text", _uM({'left-win-active': _ctx.leftWinActive === childMenuItem.path && _ctx.hasLeftWin})])
                                }), _tD(childMenuItem.style["navigationBarTitleText"]), 3 /* TEXT, CLASS */),
                                _cE("image", _uM({
                                  src: _ctx.arrowRightIcon,
                                  class: "uni-icon-size"
                                }), null, 8 /* PROPS */, ["src"])
                              ], 64 /* STABLE_FRAGMENT */)
                            : _cC("v-if", true)
                        ], 10 /* CLASS, PROPS */, ["onClick"])
                      : _cV(_component_uni_collapse, _uM({
                          key: 1,
                          style: _nS(_uM({"width":"100%","border-top":"1px solid #f0f0f0"}))
                        }), _uM({
                          default: withSlotCtx((): any[] => [
                            _cV(_component_uni_collapse_item, _uM({
                              title: childMenuItem.name,
                              class: "uni-panel",
                              style: _nS(_uM({"margin-bottom":"0"}))
                            }), _uM({
                              default: withSlotCtx((): any[] => [
                                _cE(Fragment, null, RenderHelpers.renderList(childMenuItem.items, (grandChildMenuItem, __key, __index, _cached): any => {
                                  return _cE("view", _uM({
                                    class: "uni-navigate-item pl",
                                    "hover-class": "is--active",
                                    key: grandChildMenuItem.path,
                                    onClick: () => {_ctx.goPage(`/${grandChildMenuItem.path}`)}
                                  }), [
                                    _cE("text", _uM({
                                      class: _nC(["uni-navigate-text", _uM({
                      'left-win-active':
                        _ctx.leftWinActive === grandChildMenuItem.path && _ctx.hasLeftWin,
                    })])
                                    }), _tD(grandChildMenuItem.style["navigationBarTitleText"]), 3 /* TEXT, CLASS */),
                                    _cE("image", _uM({
                                      src: _ctx.arrowRightIcon,
                                      class: "uni-icon-size"
                                    }), null, 8 /* PROPS */, ["src"])
                                  ], 8 /* PROPS */, ["onClick"])
                                }), 128 /* KEYED_FRAGMENT */)
                              ]),
                              _: 2 /* DYNAMIC */
                            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["title", "style"])
                          ]),
                          _: 2 /* DYNAMIC */
                        }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["style"])
                  ], 64 /* STABLE_FRAGMENT */)
                }), 128 /* KEYED_FRAGMENT */)
              ]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["title"])
          }), 128 /* KEYED_FRAGMENT */)
        ]),
        _: 1 /* STABLE */
      })),
      isTrue(!_ctx.hasLeftWin)
        ? _cE("view", _uM({
            key: 2,
            ref: "pop",
            onClick: () => {_ctx.hidePop()},
            class: "popup"
          }), [
            _cE("view", _uM({
              style: _nS(_uM({"width":"90%","background-color":"white"})),
              onClick: withModifiers(_ctx.stopClickPop, ["stop"])
            }), [
              _cV(_component_api_set_tabbar)
            ], 12 /* STYLE, PROPS */, ["onClick"])
          ], 8 /* PROPS */, ["onClick"])
        : _cC("v-if", true)
    ], 2 /* CLASS */)
  ], 4 /* STYLE */)
}
const GenPagesTabBarAPIStyles = [_uM([["pl", _pS(_uM([["paddingLeft", 18]]))], ["popup", _pS(_uM([["position", "fixed"], ["top", 0], ["bottom", 0], ["left", 0], ["right", 0], ["alignItems", "center"], ["justifyContent", "center"], ["display", "none"], ["backgroundColor", "rgba(16,16,16,0.5)"]]))]])]

import _easycom_u_link from '@/components/u-link/u-link.vue'
import _easycom_uni_collapse_item from '@/components/uni-collapse-item/uni-collapse-item.vue'
import _easycom_uni_collapse from '@/components/uni-collapse/uni-collapse.vue'
import _easycom_api_set_tabbar from '@/components/api-set-tabbar/api-set-tabbar.vue'
