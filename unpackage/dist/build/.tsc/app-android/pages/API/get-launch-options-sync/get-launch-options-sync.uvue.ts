
  const __sfc__ = defineComponent({
    data() {
      return {
        checked: false,
        homePagePath: 'pages/tabBar/component',
        launchOptionsPath: '',
        launchOptionsString: '',
        testResult: false
      }
    },
    onReady() {
      this.compareOnLaunchRes()
    },
    methods: {
      compareOnLaunchRes() {
        const launchOptions = uni.getLaunchOptionsSync();
        this.launchOptionsString = JSON.stringify(launchOptions, null, 2)

        const app = getApp()
        const appOnLaunch = app.globalData.launchOptions

        const isPathSame = launchOptions.path == appOnLaunch.path
        const isAppSchemeSame = launchOptions.appScheme == appOnLaunch.appScheme
        const isAppLinkSame = launchOptions.appLink == appOnLaunch.appLink
        this.testResult = isPathSame && isAppSchemeSame && isAppLinkSame
      },

      getLaunchOptionsSync() {
        const launchOptions = uni.getLaunchOptionsSync()
        this.launchOptionsPath = launchOptions.path
        if (launchOptions.path == this.homePagePath) {
          this.checked = true
        }
      }
    },
  })

export default __sfc__
function GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSyncRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: "getLaunchOptionsSync" })),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("button", _uM({ onClick: _ctx.getLaunchOptionsSync }), "getLaunchOptionsSync", 8 /* PROPS */, ["onClick"]),
      _cE("view", _uM({ class: "uni-common-mt" }), [
        _cE("text", null, "应用本次启动路径："),
        _cE("text", _uM({
          style: _nS(_uM({"margin-top":"5px"}))
        }), _tD(_ctx.launchOptionsPath), 5 /* TEXT, STYLE */)
      ]),
      _cE("view", _uM({ class: "uni-common-mt" }), [
        _cE("text", null, "应用本次启动："),
        _cE("text", _uM({
          style: _nS(_uM({"margin-top":"5px"}))
        }), _tD(_ctx.launchOptionsString), 5 /* TEXT, STYLE */)
      ])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSyncStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
