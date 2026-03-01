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
open class GenPagesCSSTransformRotate : BasePage {
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
        return _cE("scroll-view", _uM("class" to "page"), _uA(
            _cE("view", _uM("class" to "trace"), _uA(
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "rotate(20deg)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "rotateX(50deg)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "rotateY(50deg)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "rotateZ(50deg)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "rotateX(180deg)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                )),
                _cE("view", _uM("class" to "base reserve"), _uA(
                    _cE("text", _uM("class" to "reserve-text"), "rotateY(180deg)"),
                    _cE("text", _uM("class" to "reserve-text"), "转变前位置")
                ))
            )),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "rotate(20deg)"))), _uA(
                _cE("text", null, "rotate(20deg)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "rotateX(50deg)"))), _uA(
                _cE("text", null, "rotateX(50deg)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "rotateY(50deg)"))), _uA(
                _cE("text", null, "rotateY(50deg)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "rotateZ(50deg)"))), _uA(
                _cE("text", null, "rotateZ(50deg)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "rotateX(180deg)"))), _uA(
                _cE("text", null, "rotateX(180deg)"),
                _cE("text", null, "转变后位置")
            ), 4),
            _cE("view", _uM("class" to "base transform", "style" to _nS(_uM("transform" to "rotateY(180deg)"))), _uA(
                _cE("text", null, "rotateY(180deg)"),
                _cE("text", null, "转变后位置")
            ), 4)
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
                return _uM("page" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "alignItems" to "center")), "trace" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "alignItems" to "center")), "base" to _pS(_uM("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10, "width" to 150, "height" to 150, "alignItems" to "center", "justifyContent" to "center")), "reserve" to _pS(_uM("borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "dotted", "borderRightStyle" to "dotted", "borderBottomStyle" to "dotted", "borderLeftStyle" to "dotted", "borderTopColor" to "#558888", "borderRightColor" to "#558888", "borderBottomColor" to "#558888", "borderLeftColor" to "#558888", "backgroundColor" to "#dddddd")), "reserve-text" to _pS(_uM("color" to "#cccccc")), "transform" to _pS(_uM("borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#0000ff", "borderRightColor" to "#0000ff", "borderBottomColor" to "#0000ff", "borderLeftColor" to "#0000ff", "backgroundColor" to "rgba(0,255,255,0.5)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
