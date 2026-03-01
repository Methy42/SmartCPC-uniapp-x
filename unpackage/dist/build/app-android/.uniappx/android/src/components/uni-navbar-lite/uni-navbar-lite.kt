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
import uts.sdk.modules.uniStat.ReportOptions as ReportOptions
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack
import uts.sdk.modules.uniStat.report as uni_report
import io.dcloud.uniapp.extapi.setNavigationBarColor as uni_setNavigationBarColor
open class GenComponentsUniNavbarLiteUniNavbarLite : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var title: String by `$props`
    open var isLeft: Boolean by `$props`
    open var textColor: String by `$props`
    open var statusBar: Boolean by `$props`
    open var stat: Boolean by `$props`
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsUniNavbarLiteUniNavbarLite) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenComponentsUniNavbarLiteUniNavbarLite
            val _cache = __ins.renderCache
            val props = __props
            var statusBarHeight = ref(0)
            val unicode = computed(fun(): String {
                return "\ue600"
            }
            )
            onMounted(fun(){
                uni_loadFontFace(LoadFontFaceOptions(global = false, family = "UniIconsFontFamily", source = "url(\"" + default__8 + "\")", success = fun(_) {}, fail = fun(err) {
                    console.log(err)
                }
                ))
                uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#000000", backgroundColor = "#ffffff"))
                if (props.stat && props.title != "") {
                    uni_report(ReportOptions(name = "title", options = props.title))
                }
            }
            )
            val back = fun(){
                uni_navigateBack(NavigateBackOptions())
            }
            return fun(): Any? {
                return _cE("view", _uM("class" to "uni-navbar"), _uA(
                    if (isTrue(_ctx.statusBar)) {
                        _cE("view", _uM("key" to 0, "class" to "status-bar"))
                    } else {
                        _cC("v-if", true)
                    }
                    ,
                    _cE("view", _uM("class" to "uni-navbar-inner"), _uA(
                        _cE("view", _uM("class" to "left-content", "onClick" to back), _uA(
                            _cE("text", _uM("style" to _nS(_uM("color" to _ctx.textColor)), "class" to "uni-icons"), _tD(unref(unicode)), 5)
                        )),
                        _cE("view", _uM("class" to _nC(_uA(
                            "uni-navbar-content",
                            _uM("is-left" to _ctx.isLeft)
                        ))), _uA(
                            _cE("text", _uM("style" to _nS(_uM("color" to _ctx.textColor))), _uA(
                                renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(_ctx.title)
                                    )
                                }
                                )
                            ), 4)
                        ), 2),
                        _cE("view", _uM("class" to "right-content"), _uA(
                            renderSlot(_ctx.`$slots`, "right")
                        ))
                    ))
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("uni-icons" to _pS(_uM("!fontFamily" to "UniIconsFontFamily", "fontSize" to 26, "fontStyle" to "normal", "color" to "#333333")), "status-bar" to _pS(_uM("height" to CSS_VAR_STATUS_BAR_HEIGHT)), "uni-navbar" to _pS(_uM("backgroundColor" to "#007aff")), "uni-navbar-inner" to _pS(_uM("position" to "relative", "flexDirection" to "row", "justifyContent" to "space-between", "height" to 45)), "left-content" to _pS(_uM("justifyContent" to "center", "alignItems" to "center", "width" to 40, "height" to "100%")), "right-content" to _pS(_uM("justifyContent" to "center", "alignItems" to "center", "width" to 40, "height" to "100%")), "uni-navbar-content" to _pS(_uM("position" to "absolute", "height" to "100%", "top" to 0, "bottom" to 0, "left" to 45, "right" to 45, "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center")), "is-left" to _pS(_uM("justifyContent" to "flex-start")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM("title" to _uM("type" to "String", "default" to ""), "isLeft" to _uM("type" to "Boolean", "default" to false), "textColor" to _uM("type" to "String", "default" to "#000"), "statusBar" to _uM("type" to "Boolean", "default" to false), "stat" to _uM("type" to "Boolean", "default" to false)))
        var propsNeedCastKeys = _uA(
            "title",
            "isLeft",
            "textColor",
            "statusBar",
            "stat"
        )
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
