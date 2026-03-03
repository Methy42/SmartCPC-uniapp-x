
  import { createNativeButtonContext } from "@/uni_modules/native-button";
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'Hello',
        buttonText: "native-button",
        isLoad: false,
        clickCount: 0
      }
    },
    onLoad() {

    },
    methods: {
      ontap(e : UniNativeViewEvent) {
        uni.showToast({
          title: "按钮被点击了"
        })
        this.clickCount ++
        this.buttonText = "native-button"+this.clickCount
      },
      onload() {
        //标记已初始化 用于自动化测试
        this.isLoad = true
      },
      testCallMethod: function () {
      	let context = createNativeButtonContext("helloView")
      	context?.updateText("test code")
      },
      gotoTimePicker() {
        uni.openDialogPage({
          url: "/pages/component/native-view/native-view-time-picker-dialog",
          animationType: "fade-in"
        })
      }
    }
  })

export default __sfc__
function GenPagesComponentNativeViewNativeViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_native_button = resolveEasyComponent("native-button",_easycom_native_button)
const _component_native_button_container = resolveEasyComponent("native-button-container",_easycom_native_button_container)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", _uM({
      style: _nS(_uM({"padding-bottom":"50px"}))
    }), [
      _cE("text", _uM({ class: "tips" }), "说明：如果本地无 uts 插件编译环境请提交打包自定义基座查看效果"),
      _cE("button", _uM({
        type: "primary",
        onClick: _ctx.testCallMethod
      }), "调用组件方法", 8 /* PROPS */, ["onClick"]),
      _cV(_component_native_button, _uM({
        id: "helloView",
        class: "native-button",
        style: _nS(_uM({"width":"200px","height":"100px"})),
        text: _ctx.buttonText,
        onButtonTap: _ctx.ontap,
        onLoad: _ctx.onload
      }), null, 8 /* PROPS */, ["style", "text", "onButtonTap", "onLoad"]),
      _cV(_component_native_button_container),
      _cE("button", _uM({
        type: "primary",
        onClick: _ctx.gotoTimePicker
      }), "调用native-time-picker", 8 /* PROPS */, ["onClick"])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesComponentNativeViewNativeViewStyles = [_uM([["tips", _pS(_uM([["fontSize", 14], ["color", "#BEBEBE"], ["marginTop", 25], ["marginRight", "auto"], ["marginBottom", 25], ["marginLeft", "auto"], ["textAlign", "center"]]))], ["native-button", _pS(_uM([["height", 100], ["width", 100], ["marginTop", 25], ["marginRight", "auto"], ["marginBottom", 25], ["marginLeft", "auto"]]))]])]

import _easycom_native_button from '@/uni_modules/native-button/components/native-button/native-button.uvue'
import _easycom_native_button_container from '@/components/native-button-container/native-button-container.uvue'
