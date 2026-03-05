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
open class GenPagesCSSBorderBorderWidth : BasePage {
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
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
                _cE("view", null, _uA(
                    _cE("text", null, "border-width: 5px (without border-style)"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-width" to "5px"))), null, 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "border-width: 5px"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-width" to "5px", "border-style" to "solid"))), null, 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "border-left-width: 5px"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-left-width" to "5px", "border-left-style" to "solid"))), null, 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "border-top-width: 10px"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-top-width" to "10px", "border-top-style" to "solid"))), null, 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "border-right-width: 15px"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-right-width" to "15px", "border-right-style" to "solid"))), null, 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "border-bottom-width: 20px"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-bottom-width" to "20px", "border-bottom-style" to "solid"))), null, 4)
                ))
            ), 4)
        ), 4)
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
                return _uM("common" to _pS(_uM("width" to 250, "height" to 250, "backgroundColor" to "#808080")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
