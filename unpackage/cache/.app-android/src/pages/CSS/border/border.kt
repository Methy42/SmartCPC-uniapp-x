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
open class GenPagesCSSBorderBorder : BasePage {
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
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesCSSBorderBorder) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesCSSBorderBorder
            val _cache = __ins.renderCache
            val shown = ref(false)
            setTimeout(fun(){
                shown.value = true
            }
            , 1000)
            return fun(): Any? {
                return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                    _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
                        _cE("view", null, _uA(
                            _cE("text", null, "border: 5px dotted blue"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("border" to "5px dotted blue"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "border与background-image同时设置"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-style" to "solid", "border-color" to "rgba(0, 0, 255, 0.1)", "background-image" to "linear-gradient(to right, #00ff00, #00bc79)"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "设置border的view，通过v-show控制显示"),
                            withDirectives(_cE("view", null, _uA(
                                _cE("view", _uM("class" to "common", "style" to _nS(_uM("border" to "5px dotted blue"))), null, 4)
                            ), 512), _uA(
                                _uA(
                                    vShow,
                                    unref(shown)
                                )
                            ))
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "设置border 多次赋值的场景"),
                            _cE("view", null, _uA(
                                _cE("view", _uM("class" to "common multi-times-border")),
                                _cE("view", _uM("class" to "multi-times-border", "style" to _nS(_uM("width" to "250px", "height" to "250px"))), null, 4),
                                _cE("view", _uM("class" to "multi-times-border", "style" to _nS(_uM("border-right" to "6px solid blue", "width" to "250px", "height" to "250px"))), null, 4),
                                _cE("view", _uM("class" to "common multi-times-border", "style" to _nS(_uM("border" to "dashed"))), null, 4)
                            ))
                        ))
                    ), 4)
                ), 4)
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("common" to _uM("" to _uM("width" to 250, "height" to 250, "backgroundColor" to "#808080"), ".multi-times-border" to _uM("borderRightColor" to "#008000")), "multi-times-border" to _pS(_uM("borderTopWidth" to 3, "borderRightWidth" to 6, "borderBottomWidth" to 3, "borderLeftWidth" to 3, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#FF0000", "borderRightColor" to "#008000", "borderBottomColor" to "#FF0000", "borderLeftColor" to "#FF0000")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
