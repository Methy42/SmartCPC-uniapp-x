
  import { checkWebViewNativeView, checkInputNativeView, checkTextareaNativeView, checkViewNativeView } from '@/uni_modules/uts-get-native-view';
  const __sfc__ = defineComponent({
    data() {
      return {

      }
    },
    methods: {
      checkViewNativeView() : boolean {
        var viewName = "ViewGroup"



        const msg = "检测view组件对应原生" + viewName
        if (checkViewNativeView("view")) {
          this.showTip(msg + "成功")
          return true
        }
        this.showTip(msg + "失败")
        return false
      },
      checkInputNativeView() : boolean {
        var viewName = "AppCompatEditText"



        const msg = "检测input组件对应原生" + viewName
        if (checkInputNativeView("input")) {
          this.showTip(msg + "成功")
          return true
        }
        this.showTip(msg + "失败")
        return false
      },
      checkTextareaNativeView() : boolean {
        var viewName = "AppCompatEditText"



        const msg = "检测textarea组件对应原生" + viewName
        if (checkTextareaNativeView("textarea")) {
          this.showTip(msg + "成功")
          return true
        }
        this.showTip(msg + "失败")
        return false
      },
      checkWebViewNativeView() : boolean {
        var viewName = "WebView"



        const msg = "检测webview组件对应原生" + viewName
        if (checkWebViewNativeView("webview")) {
          this.showTip(msg + "成功")
          return true
        }
        this.showTip(msg + "失败")
        return false
      },
      showTip(title : string) {
        console.log("title===" + title)
        uni.showToast({
          title: title,
          icon: "none"
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIGetNativeViewElementGetnativeviewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    id: "view",
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("input", _uM({
      id: "input",
      value: "input",
      class: "input"
    })),
    _cE("textarea", _uM({
      id: "textarea",
      value: "textarea",
      class: "textarea"
    })),
    _cE("web-view", _uM({
      id: "webview",
      src: "/hybrid/html/local.html",
      class: "web-view"
    })),
    " // 注意：iOS平台真机运行时需要安装 Xcode 开发工具具备 UTS 开发环境，或提交自定基座打包后 checkNativeView 相关方法才会生效 ",
    _cE("button", _uM({
      class: "button",
      type: "primary",
      onClick: _ctx.checkViewNativeView
    }), "检测view标签原生View", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      type: "primary",
      onClick: _ctx.checkInputNativeView
    }), "检测input标签原生View", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      type: "primary",
      onClick: _ctx.checkTextareaNativeView
    }), "检测textarea标签原生View", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      type: "primary",
      onClick: _ctx.checkWebViewNativeView
    }), "检测webview标签原生View", 8 /* PROPS */, ["onClick"])
  ], 4 /* STYLE */)
}
const GenPagesAPIGetNativeViewElementGetnativeviewStyles = [_uM([["input", _pS(_uM([["width", 300], ["height", 40], ["borderTopLeftRadius", 4], ["borderTopRightRadius", 4], ["borderBottomRightRadius", 4], ["borderBottomLeftRadius", 4], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopColor", "#000000"], ["borderRightColor", "#000000"], ["borderBottomColor", "#000000"], ["borderLeftColor", "#000000"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"]]))], ["textarea", _pS(_uM([["width", 300], ["height", 80], ["borderTopLeftRadius", 4], ["borderTopRightRadius", 4], ["borderBottomRightRadius", 4], ["borderBottomLeftRadius", 4], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopColor", "#000000"], ["borderRightColor", "#000000"], ["borderBottomColor", "#000000"], ["borderLeftColor", "#000000"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"]]))], ["web-view", _pS(_uM([["width", 300], ["height", 120], ["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"], ["borderTopLeftRadius", 4], ["borderTopRightRadius", 4], ["borderBottomRightRadius", 4], ["borderBottomLeftRadius", 4], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopColor", "#000000"], ["borderRightColor", "#000000"], ["borderBottomColor", "#000000"], ["borderLeftColor", "#000000"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"]]))], ["button", _pS(_uM([["marginTop", 10], ["marginRight", 20], ["marginBottom", 10], ["marginLeft", 20]]))]])]
