@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER", "NAME_SHADOWING", "UNNECESSARY_NOT_NULL_ASSERTION")
package uni.UNI2A1DFEF
import io.dcloud.uniapp.*
import io.dcloud.uniapp.extapi.*
import io.dcloud.uniapp.framework.*
import io.dcloud.uniapp.runtime.*
import io.dcloud.uniapp.vue.*
import io.dcloud.uniapp.vue.shared.*
import io.dcloud.unicloud.*
import io.dcloud.uts.*
import io.dcloud.uts.Map
import io.dcloud.uts.Set
import io.dcloud.uts.UTSAndroid
import kotlin.properties.Delegates
import uts.sdk.modules.utsGetNativeView.checkWebViewNativeView
import uts.sdk.modules.utsGetNativeView.checkInputNativeView
import uts.sdk.modules.utsGetNativeView.checkTextareaNativeView
import uts.sdk.modules.utsGetNativeView.checkViewNativeView
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIGetNativeViewElementGetnativeview : BasePage {
    constructor(__ins: ComponentInternalInstance, __renderer: String?) : super(__ins, __renderer) {
        onLoad(fun(_: OnLoadOptions) {
            stat_instance.onLoad(this)
        }
        , __ins)
        onPageShow(fun() {
            stat_instance.onShow(this)
        }
        , __ins)
        onPageHide(fun() {
            stat_instance.onHide(this)
        }
        , __ins)
        onUnload(fun() {
            stat_instance.onUnload(this)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("id" to "view", "style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("input", _uM("id" to "input", "value" to "input", "class" to "input")),
            _cE("textarea", _uM("id" to "textarea", "value" to "textarea", "class" to "textarea")),
            _cE("web-view", _uM("id" to "webview", "src" to "/hybrid/html/local.html", "class" to "web-view")),
            " // 注意：iOS平台真机运行时需要安装 Xcode 开发工具具备 UTS 开发环境，或提交自定基座打包后 checkNativeView 相关方法才会生效 ",
            _cE("button", _uM("class" to "button", "type" to "primary", "onClick" to _ctx.checkViewNativeView), "检测view标签原生View", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("class" to "button", "type" to "primary", "onClick" to _ctx.checkInputNativeView), "检测input标签原生View", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("class" to "button", "type" to "primary", "onClick" to _ctx.checkTextareaNativeView), "检测textarea标签原生View", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("class" to "button", "type" to "primary", "onClick" to _ctx.checkWebViewNativeView), "检测webview标签原生View", 8, _uA(
                "onClick"
            ))
        ), 4)
    }
    open var checkViewNativeView = ::gen_checkViewNativeView_fn
    open fun gen_checkViewNativeView_fn(): Boolean {
        var viewName = "ViewGroup"
        val msg = "检测view组件对应原生" + viewName
        if (checkViewNativeView("view")) {
            this.showTip(msg + "成功")
            return true
        }
        this.showTip(msg + "失败")
        return false
    }
    open var checkInputNativeView = ::gen_checkInputNativeView_fn
    open fun gen_checkInputNativeView_fn(): Boolean {
        var viewName = "AppCompatEditText"
        val msg = "检测input组件对应原生" + viewName
        if (checkInputNativeView("input")) {
            this.showTip(msg + "成功")
            return true
        }
        this.showTip(msg + "失败")
        return false
    }
    open var checkTextareaNativeView = ::gen_checkTextareaNativeView_fn
    open fun gen_checkTextareaNativeView_fn(): Boolean {
        var viewName = "AppCompatEditText"
        val msg = "检测textarea组件对应原生" + viewName
        if (checkTextareaNativeView("textarea")) {
            this.showTip(msg + "成功")
            return true
        }
        this.showTip(msg + "失败")
        return false
    }
    open var checkWebViewNativeView = ::gen_checkWebViewNativeView_fn
    open fun gen_checkWebViewNativeView_fn(): Boolean {
        var viewName = "WebView"
        val msg = "检测webview组件对应原生" + viewName
        if (checkWebViewNativeView("webview")) {
            this.showTip(msg + "成功")
            return true
        }
        this.showTip(msg + "失败")
        return false
    }
    open var showTip = ::gen_showTip_fn
    open fun gen_showTip_fn(title: String) {
        console.log("title===" + title, " at pages/API/get-native-view/element-getnativeview.uvue:76")
        uni_showToast(ShowToastOptions(title = title, icon = "none"))
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("input" to _pS(_uM("width" to 300, "height" to 40, "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto")), "textarea" to _pS(_uM("width" to 300, "height" to 80, "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto")), "web-view" to _pS(_uM("width" to 300, "height" to 120, "marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto", "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid")), "button" to _pS(_uM("marginTop" to 10, "marginRight" to 20, "marginBottom" to 10, "marginLeft" to 20)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
