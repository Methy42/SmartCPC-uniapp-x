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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
open class GenPagesCSSBackgroundBackgroundColor : BasePage {
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
        var setup: (__props: GenPagesCSSBackgroundBackgroundColor) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesCSSBackgroundBackgroundColor
            val _cache = __ins.renderCache
            val jumpToCheckBoxWithBackgroundColor = fun(){
                uni_navigateTo(NavigateToOptions(url = "/pages/CSS/background/background-color-check-box"))
            }
            return fun(): Any? {
                return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                    _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: red"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "red"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: #ff0000"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "#ff0000"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: #f00"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "#f00"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: #ff000080"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "#ff000080"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: #f008"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "#f008"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: rgb(255, 0, 0)"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "rgb(255, 0, 0)"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: rgba(255, 0, 0, 0.5)"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "rgba(255, 0, 0, 0.5)"))), null, 4)
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "background-color: #ff000080"),
                            _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "#ff000080"))), null, 4)
                        )),
                        _cE("view", _uM("style" to _nS(_uM("margin-left" to "30px", "margin-right" to "30px"))), _uA(
                            _cE("button", _uM("type" to "default", "onClick" to jumpToCheckBoxWithBackgroundColor), "应用background-color示例")
                        ), 4)
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
                return _uM("common" to _pS(_uM("width" to 250, "height" to 250)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
