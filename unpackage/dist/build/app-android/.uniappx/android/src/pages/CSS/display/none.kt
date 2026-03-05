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
open class GenPagesCSSDisplayNone : BasePage {
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
        return _cE("view", _uM("class" to "page", "style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("class" to "head"), _uA(
                _cE("text", _uM("class" to "tip"), "下面有一个灰色区域，display默认值为none"),
                _cE("text", _uM("class" to "tip"), "当前display值：" + _tD(_ctx.display), 1)
            )),
            _cE("view", _uM("class" to "content", "style" to _nS(_uM("display" to _ctx.display))), _uA(
                _cE("text", _uM("style" to _nS(_uM("background-color" to "aquamarine"))), "展示display区域", 4)
            ), 4),
            _cE("button", _uM("onClick" to _ctx.switchDisplay), "切换display属性", 8, _uA(
                "onClick"
            ))
        ), 4)
    }
    open var display: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("display" to "none")
    }
    open var switchDisplay = ::gen_switchDisplay_fn
    open fun gen_switchDisplay_fn() {
        this.display = if (("flex" == this.display)) {
            "none"
        } else {
            "flex"
        }
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
                return _uM("page" to _pS(_uM("alignItems" to "center", "height" to "100%")), "head" to _pS(_uM("marginTop" to 10, "marginBottom" to 10, "alignItems" to "center")), "tip" to _pS(_uM("color" to "#FF0000")), "content" to _pS(_uM("borderTopWidth" to 5, "borderRightWidth" to 5, "borderBottomWidth" to 5, "borderLeftWidth" to 5, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#0000FF", "borderRightColor" to "#0000FF", "borderBottomColor" to "#0000FF", "borderLeftColor" to "#0000FF", "marginTop" to 50, "marginRight" to 0, "marginBottom" to 50, "marginLeft" to 0, "paddingTop" to 50, "paddingRight" to 50, "paddingBottom" to 50, "paddingLeft" to 50, "width" to 200, "height" to 200, "backgroundColor" to "#808080", "alignItems" to "center", "justifyContent" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
