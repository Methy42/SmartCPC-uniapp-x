

import { openSchema } from '@/uni_modules/uts-openSchema'

import { state } from '@/store/index.uts'
const __sfc__ = defineComponent({
  data() {
    return {
      version: '',
      arrowRightIcon: '/static/icons/arrow-right.png'
    }
  },
  onLoad() {
    this.version = uni.getAppBaseInfo().appVersion??''
  },
  computed: {
    isDarkMode() : boolean {
      return state.isDarkMode
    },
  },
  methods: {
    openUrl(url:string) {

      openSchema(url)









    }
  }
})

export default __sfc__
function GenPagesTemplateAboutAboutRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"})),
    class: _nC(_ctx.isDarkMode ? 'theme-dark' : 'theme-light')
  }), [
    _cE("view", _uM({ class: "content" }), [
      _cE("image", _uM({
        class: "qrcode",
        src: "https://web-ext-storage.dcloud.net.cn/uni-app-x/hello-uniappx-qrcode.png"
      })),
      _cE("text", _uM({ class: "tip" }), "扫码体验 uni-app x"),
      _cE("text", _uM({ class: "desc" }), [
        _cE("text", _uM({ class: "code" }), "uni-app x "),
        _cE("text", _uM({ class: "desc" }), "是下一代uni-app，基于uts的、兼容vue语法的跨平台开发框架。")
      ]),
      _cE("text", _uM({ class: "source desc" }), "本应用源码获取方式："),
      _cE("view", _uM({ class: "sourcelist" }), [
        _cE("text", _uM({
          class: "desc",
          space: "nbsp"
        }), "1. "),
        _cE("text", _uM({ class: "desc" }), [
          _cE("text", _uM({ class: "desc" }), "在 HBuilderX 中新建 uni-app 项目时选择 "),
          _cE("text", _uM({ class: "code" }), "Hello uni-app x"),
          _cE("text", _uM({ class: "desc" }), " 模板")
        ])
      ]),
      _cE("view", _uM({ class: "sourcelist" }), [
        _cE("text", _uM({
          class: "desc",
          space: "nbsp"
        }), "2. "),
        _cE("text", _uM({
          class: "desc link",
          onClick: () => {_ctx.openUrl('https://gitcode.com/dcloud/hello-uni-app-x')}
        }), "https://gitcode.com/dcloud/hello-uni-app-x", 8 /* PROPS */, ["onClick"])
      ])
    ]),
    _cE("view", _uM({ class: "panel" }), [
      _cE("text", _uM({ class: "uni-panel-text title" }), "服务协议"),
      _cE("view", _uM({ class: "item" }), [
        _cE("view", _uM({
          style: _nS(_uM({"padding-left":"18px","border-top-style":"none"})),
          class: "uni-navigate-item",
          "hover-class": "is--active",
          onClick: () => {_ctx.openUrl('https://dcloud.io/license/DCloud.html')}
        }), [
          _cE("text", _uM({ class: "uni-navigate-text" }), "用户协议"),
          _cE("image", _uM({
            src: _ctx.arrowRightIcon,
            class: "uni-icon-size"
          }), null, 8 /* PROPS */, ["src"])
        ], 12 /* STYLE, PROPS */, ["onClick"]),
        _cE("view", _uM({
          style: _nS(_uM({"padding-left":"18px"})),
          class: "uni-navigate-item",
          "hover-class": "is--active",
          onClick: () => {_ctx.openUrl('https://dcloud.io/license/hello-uni-app-x.html')}
        }), [
          _cE("text", _uM({ class: "uni-navigate-text" }), "隐私政策"),
          _cE("image", _uM({
            src: _ctx.arrowRightIcon,
            class: "uni-icon-size"
          }), null, 8 /* PROPS */, ["src"])
        ], 12 /* STYLE, PROPS */, ["onClick"])
      ])
    ]),
    _cE("text", _uM({ class: "version" }), "当前版本：" + _tD(_ctx.version), 1 /* TEXT */)
  ], 6 /* CLASS, STYLE */)
}
const GenPagesTemplateAboutAboutStyles = [_uM([["content", _pS(_uM([["width", "100%"], ["paddingTop", 16], ["paddingRight", 16], ["paddingBottom", 16], ["paddingLeft", 16], ["alignItems", "center"]]))], ["qrcode", _pS(_uM([["width", 160], ["height", 160]]))], ["tip", _pS(_uM([["marginTop", 12], ["marginRight", 12], ["marginBottom", 12], ["marginLeft", 12], ["fontSize", 14], ["color", "var(--text-color)"]]))], ["desc", _pS(_uM([["fontSize", 14], ["lineHeight", "18px"], ["color", "var(--text-color)"]]))], ["code", _pS(_uM([["fontSize", 14], ["color", "#e96900"]]))], ["source", _pS(_uM([["alignSelf", "flex-start"], ["marginTop", 18], ["color", "var(--text-color)"]]))], ["sourcelist", _pS(_uM([["flexDirection", "row"], ["alignSelf", "flex-start"], ["alignContent", "flex-start"]]))], ["link", _pS(_uM([["color", "#007AFF"], ["textDecorationLine", "underline"]]))], ["version", _pS(_uM([["width", "100%"], ["marginTop", 18], ["marginRight", 0], ["marginBottom", 18], ["marginLeft", 0], ["fontSize", 14], ["lineHeight", "18px"], ["textAlign", "center"], ["color", "#cccccc"]]))], ["panel", _pS(_uM([["marginTop", 18], ["marginRight", 18], ["marginBottom", 18], ["marginLeft", 18]]))], ["title", _pS(_uM([["marginTop", 8], ["marginRight", 8], ["marginBottom", 8], ["marginLeft", 8], ["fontSize", 14]]))], ["item", _pS(_uM([["borderTopLeftRadius", 6], ["borderTopRightRadius", 6], ["borderBottomRightRadius", 6], ["borderBottomLeftRadius", 6]]))]])]
