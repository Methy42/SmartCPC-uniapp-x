
  import { generateMenu, MenuItem } from './generateMenu.uts'
  const menu = generateMenu('pages/component')

  import checkUpdate from '@/uni_modules/uni-upgrade-center-app/utils/check-update'

  import { state } from '@/store/index.uts'
  const __sfc__ = defineComponent({
    data() {
      return {
        menu: menu as MenuItem[],
        arrowRightIcon: '/static/icons/arrow-right.png' as string.ImageURIString,
        pageHiden: false
      }
    },
    computed: {
      hasLeftWin() : boolean {
        return !state.noMatchLeftWindow
      },
      leftWinActive() : string {
        return state.leftWinActive.slice(1)
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
        if (this.hasLeftWin) {
          uni.reLaunch({ url })
        } else {
          uni.navigateTo({ url })
        }
      }
    },

















    onReady() {

      if (process.env.NODE_ENV !== 'development') {
        uni.getPrivacySetting({
          success(res) {
            if (res.needAuthorization) {
              let cbId: number = 0
              cbId = uni.onPrivacyAuthorizationChange(() => {
                checkUpdate()
                uni.offPrivacyAuthorizationChange(cbId)
              })
            } else {
              checkUpdate()
            }
          }
        })
      }

    },
    onShow() {
      this.pageHiden = false
    },
    onHide() {
      this.pageHiden = true
    },
    beforeUnmount() {
      uni.showTabBar()?.catch(_ => { })
    }
  })

export default __sfc__
function GenPagesTabBarComponentRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_u_link = resolveEasyComponent("u-link",_easycom_u_link)
const _component_uni_collapse_item = resolveEasyComponent("uni-collapse-item",_easycom_uni_collapse_item)
const _component_uni_collapse = resolveEasyComponent("uni-collapse",_easycom_uni_collapse)

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
              src: "/static/componentIndex.png"
            }))
          ])
        : _cC("v-if", true),
      isTrue(!_ctx.hasLeftWin)
        ? _cE("view", _uM({
            key: 1,
            class: "uni-text-box"
          }), [
            _cE("text", _uM({ class: "hello-text" }), "uni-app x内置组件，展示样式仅供参考，文档详见："),
            _cV(_component_u_link, _uM({
              href: 'https://uniapp.dcloud.io/uni-app-x/component/',
              text: 'https://uniapp.dcloud.io/uni-app-x/component/',
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
                          class: "uni-navigate-item pl",
                          "hover-class": "is--active",
                          onClick: () => {_ctx.goPage(`/${childMenuItem.path}`)}
                        }), [
                          _cE("text", _uM({
                            class: _nC(["uni-navigate-text", _uM({
                  'left-win-active': _ctx.leftWinActive === childMenuItem.path && _ctx.hasLeftWin,
                })])
                          }), _tD(childMenuItem.style["navigationBarTitleText"]), 3 /* TEXT, CLASS */),
                          _cE("image", _uM({
                            src: _ctx.arrowRightIcon,
                            class: "uni-icon-size"
                          }), null, 8 /* PROPS */, ["src"])
                        ], 8 /* PROPS */, ["onClick"])
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
      }))
    ], 2 /* CLASS */)
  ], 4 /* STYLE */)
}
const GenPagesTabBarComponentStyles = [_uM([["pl", _pS(_uM([["paddingLeft", 18]]))]])]

import _easycom_u_link from '@/components/u-link/u-link.vue'
import _easycom_uni_collapse_item from '@/components/uni-collapse-item/uni-collapse-item.vue'
import _easycom_uni_collapse from '@/components/uni-collapse/uni-collapse.vue'
