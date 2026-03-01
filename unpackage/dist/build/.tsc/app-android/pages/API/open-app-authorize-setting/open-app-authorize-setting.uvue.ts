
  const __sfc__ = defineComponent({
    data() {
      return {

      }
    },
    methods: {
      go() {
         uni.openAppAuthorizeSetting({
           success (res) {
             console.log(res)
           }
         })
      }
    }
  })

export default __sfc__
function GenPagesAPIOpenAppAuthorizeSettingOpenAppAuthorizeSettingRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("button", _uM({
      type: "primary",
      style: _nS(_uM({"margin":"20px"})),
      onClick: _ctx.go
    }), "跳转系统授权管理页", 12 /* STYLE, PROPS */, ["onClick"])
  ], 4 /* STYLE */)
}
const GenPagesAPIOpenAppAuthorizeSettingOpenAppAuthorizeSettingStyles = []
