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
open class GenPagesCSSTransformTranslate : BasePage {
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
        val _component_navigator = resolveComponent("navigator")
        return _cE("scroll-view", _uM("class" to "page"), _uA(
            _cE("view", _uM("class" to "trace"), _uA(
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "translateX(80%)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "translateY(50px)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "translate(-50%,50%)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                ))
            )),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "translateX(80%)"))), _uA(
                _cE("text", null, "translateX(80%)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "translateY(50px)"))), _uA(
                _cE("text", null, "translateY(50px)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "translate(-50%, 50%)"))), _uA(
                _cE("text", null, "translate(-50%,50%)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cV(_component_navigator, _uM("style" to _nS(_uM("top" to "100px", "width" to "80%")), "url" to "/pages/CSS/transform/transform-origin"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                return _uA(
                    _cE("button", _uM("type" to "primary"), "transform-origin")
                )
            }
            ), "_" to 1), 8, _uA(
                "style"
            ))
        ))
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
                return _uM("page" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "alignItems" to "center")), "trace" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "alignItems" to "center")), "base" to _pS(_uM("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10, "width" to 150, "height" to 150, "alignItems" to "center", "justifyContent" to "center")), "reserve" to _pS(_uM("borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "dotted", "borderRightStyle" to "dotted", "borderBottomStyle" to "dotted", "borderLeftStyle" to "dotted", "borderTopColor" to "#558888", "borderRightColor" to "#558888", "borderBottomColor" to "#558888", "borderLeftColor" to "#558888", "backgroundColor" to "#DDDDDD")), "reserve-text" to _pS(_uM("color" to "#CCCCCC")), "transform" to _pS(_uM("borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#0000FF", "borderRightColor" to "#0000FF", "borderBottomColor" to "#0000FF", "borderLeftColor" to "#0000FF", "backgroundColor" to "rgba(0,255,255,0.5)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
