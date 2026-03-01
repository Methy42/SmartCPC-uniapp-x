
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'installApk'
      }
    },
    onUnload: function () {
    },
    methods: {
      installApk: function () {
        uni.installApk({
          filePath: "/static/test-apk/test.apk",
          complete(res : any) {
            console.log(res);
          }
        })
      },
    }
  })

export default __sfc__
function GenPagesAPIInstallApkInstallApkRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      _cE("view", _uM({ class: "uni-common-mt" }), [
        _cE("view", _uM({ class: "uni-padding-wrap" }), [
          _cE("view", _uM({ class: "uni-btn-v" }), [
            _cE("button", _uM({
              type: "primary",
              onClick: _ctx.installApk
            }), " installApk ", 8 /* PROPS */, ["onClick"])
          ])
        ])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIInstallApkInstallApkStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
