

  import { openSchema } from '@/uni_modules/uts-openSchema'

  const __sfc__ = defineComponent({
    data() {
      return {
        number: 0,
        hrefLicense: 'https://dcloud.io/license/DCloud.html',
        hrefPrivacy: 'https://dcloud.io/license/hello-uni-app-x.html'
      }
    },
    unmounted() {
      uni.offPrivacyAuthorizationChange(this.number)
    },
    onLoad() {
      this.number = uni.onPrivacyAuthorizationChange((callback) => {
        uni.showToast({
          title: 'isPrivacyAgree:' + !callback.needAuthorization
        })
      })
    },
    methods: {
      agree() {
        uni.closeDialogPage({
          dialogPage: this.$page
        })
      },
      reject() {
        uni.resetPrivacyAuthorization()
        uni.closeDialogPage({
          dialogPage: this.$page
        })
      },
      hrefClick(href : string) {






        openSchema(href)

      },
    }
  })

export default __sfc__
function GenPagesComponentButtonPrivacyRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "dialog-container" }), [
    _cE("view", _uM({ class: "dialog-content" }), [
      _cE("view", _uM({
        style: _nS(_uM({"width":"100%","justify-content":"center","align-items":"center","background-color":"#fff"}))
      }), [
        _cE("image", _uM({
          src: _imports_0,
          style: _nS(_uM({"margin-top":"25px","width":"60px","height":"60px"}))
        }), null, 4 /* STYLE */)
      ], 4 /* STYLE */),
      _cE("text", _uM({
        style: _nS(_uM({"text-align":"center","padding-top":"20px","font-size":"20px","color":"black","background-color":"#fff"}))
      }), "个人信息保护指引", 4 /* STYLE */),
      _cE("scroll-view", _uM({
        style: _nS(_uM({"flex":"1","align-content":"center","padding-top":"10px","padding-left":"25px","padding-right":"25px","background-color":"#fff"})),
        "show-scrollbar": "false"
      }), [
        _cE("text", null, [
          _cE("text", _uM({ class: "privacy-text" }), "欢迎使用 Hello uni-app x 应用，我们将通过"),
          _cE("text", _uM({
            class: "privacy-href",
            onClick: () => {_ctx.hrefClick(_ctx.hrefLicense)}
          }), "《用户服务协议》", 8 /* PROPS */, ["onClick"]),
          _cE("text", _uM({ class: "privacy-text" }), "及"),
          _cE("text", _uM({ class: "privacy-text" }), "相关个人信息处理规则帮助你了解我们如何收集、处理个人信息。根据《常见类型移动互联网应用程序必要个人信息范围规定》，应用在演示 uni-app x 能力时仅收集、处理相关必要个人信息及数据。我们通过"),
          _cE("text", _uM({
            class: "privacy-href",
            onClick: () => {_ctx.hrefClick(_ctx.hrefPrivacy)}
          }), "《隐私政策》", 8 /* PROPS */, ["onClick"]),
          _cE("text", _uM({ class: "privacy-text" }), "帮助你全面了解我们的服务及收集、处理个人信息的详细情况。")
        ]),
        _cE("text", _uM({ class: "privacy-text" }), "如你同意请点击“同意”按钮接受我们的服务。")
      ], 4 /* STYLE */),
      _cE("button", _uM({
        class: "button",
        onClick: _ctx.reject
      }), "不同意", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "button",
        type: "primary",
        "open-type": "agreePrivacyAuthorization",
        onClick: _ctx.agree
      }), "同意", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesComponentButtonPrivacyStyles = [_uM([["dialog-container", _pS(_uM([["width", "100%"], ["height", "100%"], ["backgroundColor", "rgba(0,0,0,0.3)"], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["dialog-content", _pS(_uM([["height", "60%"], ["width", "80%"], ["borderTopLeftRadius", 12], ["borderTopRightRadius", 12], ["borderBottomRightRadius", 12], ["borderBottomLeftRadius", 12]]))], ["button", _pS(_uM([["borderTopLeftRadius", 0], ["borderTopRightRadius", 0], ["borderBottomRightRadius", 0], ["borderBottomLeftRadius", 0], ["borderTopWidth", 0], ["borderRightWidth", 0], ["borderBottomWidth", 0], ["borderLeftWidth", 0], ["borderTopStyle", "none"], ["borderRightStyle", "none"], ["borderBottomStyle", "none"], ["borderLeftStyle", "none"], ["borderTopColor", "#000000"], ["borderRightColor", "#000000"], ["borderBottomColor", "#000000"], ["borderLeftColor", "#000000"], ["fontSize", 15], ["color", "#D3D3D3"], ["textAlign", "center"], ["lineHeight", "40px"]]))], ["button-hover1", _pS(_uM([["color", "#000000"], ["backgroundColor", "#ffffff"]]))], ["button-hover2", _pS(_uM([["color", "#000000"], ["backgroundColor", "#4169E1"]]))], ["privacy-text", _pS(_uM([["color", "#808080"]]))], ["privacy-href", _pS(_uM([["color", "#5F9EA0"], ["fontWeight", "bold"], ["textDecorationLine", "underline"]]))]])]

import _imports_0 from '../image/logo.png'
