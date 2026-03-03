
  const __sfc__ = defineComponent({
    data() {
      return {
        text: ['继续下拉执行刷新', '释放立即刷新', '刷新中', ""]
      }
    },
    props: {
      state: {
        type: Number,
        default: 0
      },
      methods: {

      }
    }
  })

export default __sfc__
function GenPagesTemplateCustomRefresherRefreshBoxRefreshBoxRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("list-item", _uM({
    slot: "refresher",
    class: "refresh-box"
  }), [
    _ctx.state == 2
      ? _cE("image", _uM({
          key: 0,
          class: "refresh-icon",
          src: "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/refresh-box-run.gif",
          mode: "widthFix"
        }))
      : _cC("v-if", true),
    _cE("text", _uM({ class: "tip-text" }), _tD(_ctx.text[_ctx.state]), 1 /* TEXT */)
  ])
}
const GenPagesTemplateCustomRefresherRefreshBoxRefreshBoxStyles = [_uM([["refresh-box", _pS(_uM([["justifyContent", "center"], ["alignItems", "center"], ["flexDirection", "row"], ["height", 30]]))], ["refresh-icon", _pS(_uM([["width", 20], ["height", 20], ["marginTop", 5], ["marginRight", 5], ["marginBottom", 5], ["marginLeft", 5]]))], ["tip-text", _pS(_uM([["color", "#888888"], ["fontSize", 12]]))]])]
