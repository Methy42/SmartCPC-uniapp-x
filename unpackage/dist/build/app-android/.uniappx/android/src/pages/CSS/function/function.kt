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
import io.dcloud.uniapp.framework.onShow
open class GenPagesCSSFunctionFunction : BasePage {
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
        onReady(fun() {
            this.safeareaInsetTop = this.`$page`.safeAreaInsets.top
            this.safeareaInsetLeft = this.`$page`.safeAreaInsets.left
            this.safeareaInsetRight = this.`$page`.safeAreaInsets.right
            this.safeareaInsetBottom = this.`$page`.safeAreaInsets.bottom
        }
        , __ins)
        onResize(fun(_: OnResizeOptions) {
            this.safeareaInsetTop = this.`$page`.safeAreaInsets.top
            this.safeareaInsetLeft = this.`$page`.safeAreaInsets.left
            this.safeareaInsetRight = this.`$page`.safeAreaInsets.right
            this.safeareaInsetBottom = this.`$page`.safeAreaInsets.bottom
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("class" to "padding-safe-area-inset"), _uA(
            _cE("view", _uM("class" to "text-background"), "我在状态栏下边"),
            _cE("view", _uM("class" to "content"), _uA(
                _cE("text", null, "此页面使用env()函数适配安全区域，仅在app平台生效。"),
                _cE("text", null, "safe-area-inset-top: " + _tD(_ctx.safeareaInsetTop) + "px", 1),
                _cE("text", null, "safe-area-inset-left: " + _tD(_ctx.safeareaInsetLeft) + "px", 1),
                _cE("text", null, "safe-area-inset-right: " + _tD(_ctx.safeareaInsetRight) + "px", 1),
                _cE("text", null, "safe-area-inset-bottom: " + _tD(_ctx.safeareaInsetBottom) + "px", 1)
            )),
            _cE("view", _uM("class" to "text-background"), "我在导航栏上边")
        ))
    }
    open var safeareaInsetTop: Number by `$data`
    open var safeareaInsetLeft: Number by `$data`
    open var safeareaInsetRight: Number by `$data`
    open var safeareaInsetBottom: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("safeareaInsetTop" to 0, "safeareaInsetLeft" to 0, "safeareaInsetRight" to 0, "safeareaInsetBottom" to 0)
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
                return _uM("text-background" to _pS(_uM("backgroundColor" to "#FF0000")), "padding-safe-area-inset" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "justifyContent" to "space-between", "paddingTop" to "env(safe-area-inset-top,0px)", "paddingLeft" to "env(safe-area-inset-left,0px)", "paddingRight" to "env(safe-area-inset-right,0px)", "paddingBottom" to "env(safe-area-inset-bottom,0px)")), "content" to _pS(_uM("paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
