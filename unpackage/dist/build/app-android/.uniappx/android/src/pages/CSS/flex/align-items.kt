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
open class GenPagesCSSFlexAlignItems : BasePage {
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
                    _cE("text", null, "align-items: center"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("align-items" to "center"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "align-items: flex-start"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("align-items" to "flex-start"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "align-items: flex-end"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("align-items" to "flex-end"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "align-items: stretch"),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("align-items" to "stretch"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "background-color" to "red"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "background-color" to "green"))), null, 4),
                        _cE("view", _uM("style" to _nS(_uM("width" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
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
                return _uM("common" to _pS(_uM("width" to 250, "height" to 250, "backgroundColor" to "#808080", "flexDirection" to "row")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
