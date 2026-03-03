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
open class GenUniModulesUniLoadingComponentsUniLoadingUniLoading : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_LoadingCircle = resolveComponent("LoadingCircle")
        return _cE("view", _uM("class" to _nC(_uA(
            "uni-loading-main",
            _uM("load-inline" to (_ctx.`$slots`["default"] == null))
        ))), _uA(
            if (isTrue(_ctx.loading)) {
                _cE(Fragment, _uM("key" to 0), _uA(
                    renderSlot(_ctx.`$slots`, "default"),
                    if (_ctx.`$slots`["default"] == null) {
                        _cE(Fragment, _uM("key" to 0), _uA(
                            _cV(_component_LoadingCircle, _uM("speed" to 16, "size" to _ctx.loadWidth, "color" to _ctx.color), null, 8, _uA(
                                "size",
                                "color"
                            )),
                            if (isTrue(_ctx.text)) {
                                _cE("text", _uM("key" to 0, "class" to "inline-text", "style" to _nS(_uM("color" to _ctx.color))), _tD(_ctx.text), 5)
                            } else {
                                _cC("v-if", true)
                            }
                        ), 64)
                    } else {
                        _cE("view", _uM("key" to 1, "class" to "uni-loading-mask", "style" to _nS(_uM("backgroundColor" to _ctx.background))), _uA(
                            _cV(_component_LoadingCircle, _uM("speed" to 16, "size" to _ctx.loadWidth, "color" to _ctx.color), null, 8, _uA(
                                "size",
                                "color"
                            )),
                            if (isTrue(_ctx.text)) {
                                _cE("text", _uM("key" to 0, "class" to "block-text", "style" to _nS(_uM("color" to _ctx.color))), _tD(_ctx.text), 5)
                            } else {
                                _cC("v-if", true)
                            }
                        ), 4)
                    }
                ), 64)
            } else {
                renderSlot(_ctx.`$slots`, "default", _uM("key" to 1))
            }
        ), 2)
    }
    open var loading: Boolean by `$props`
    open var type: String by `$props`
    open var iconType: String by `$props`
    open var size: Number by `$props`
    open var text: String by `$props`
    open var background: String by `$props`
    open var color: String by `$props`
    open var loadWidth: Number by `$data`
    open var styles: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("loadWidth" to computed<Number>(fun(): Number {
            var width = this.size
            if (width == 0) {
                return 20
            }
            return width
        }
        ), "styles" to computed<String>(fun(): String {
            return "width:" + this.loadWidth + "px;height:" + this.loadWidth + "px;"
        }
        ))
    }
    companion object {
        var name = "uni-loading"
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("uni-loading-main" to _uM("" to _uM("position" to "relative"), ".load-inline" to _uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "block-text" to _pS(_uM("marginTop" to 8, "fontSize" to 14)), "inline-text" to _pS(_uM("marginLeft" to 8, "fontSize" to 14)), "uni-loading-mask" to _pS(_uM("position" to "absolute", "width" to "100%", "height" to "100%", "top" to 0, "left" to 0, "display" to "flex", "justifyContent" to "center", "alignItems" to "center", "backgroundColor" to "rgba(0,0,0,0.3)", "zIndex" to 2)), "uni-load" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center")), "load-text" to _pS(_uM("fontSize" to 14, "color" to "#ffffff", "marginTop" to 12)), "image" to _uM(".uni-load " to _uM("width" to "100%", "height" to "100%")), "load-image" to _pS(_uM("width" to "100%", "height" to "100%")), "load-ani" to _pS(_uM("transitionProperty" to "transform", "transitionDuration" to "0.1s", "transitionTimingFunction" to "linear", "transform" to "rotate(0deg)")), "@TRANSITION" to _uM("load-ani" to _uM("property" to "transform", "duration" to "0.1s", "timingFunction" to "linear")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM("loading" to _uM("type" to "Boolean", "default" to true), "type" to _uM("type" to "String", "default" to ""), "iconType" to _uM("type" to "String", "default" to "gear-filled"), "size" to _uM("type" to "Number", "default" to 0), "text" to _uM("type" to "String", "default" to ""), "background" to _uM("type" to "String", "default" to "rgba(255,255,255,0.6)"), "color" to _uM("type" to "String", "default" to "#333")))
        var propsNeedCastKeys = _uA(
            "loading",
            "type",
            "iconType",
            "size",
            "text",
            "background",
            "color"
        )
        var components: Map<String, CreateVueComponent> = _uM("LoadingCircle" to GenUniModulesUniLoadingComponentsUniLoadingLoadingCircleClass)
    }
}
