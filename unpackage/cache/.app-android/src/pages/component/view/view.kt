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
open class GenPagesComponentViewView : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass)
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass)
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "view")),
            _cE("view", _uM("id" to "view", "class" to "main", "hover-class" to if (_ctx.hover_class) {
                "is-parent-hover"
            } else {
                "none"
            }
            ), _uA(
                _cE("view", _uM("id" to "view-child1", "class" to _nC(_uA(
                    "test-view",
                    if (_ctx.isDarkMode) {
                        "theme-dark"
                    } else {
                        "theme-light"
                    }
                )), "hover-class" to if (_ctx.hover_class) {
                    "is-hover"
                } else {
                    "none"
                }
                , "hover-stop-propagation" to _ctx.stop_propagation, "hover-start-time" to _ctx.start_time, "hover-stay-time" to _ctx.stay_time), null, 10, _uA(
                    "hover-class",
                    "hover-stop-propagation",
                    "hover-start-time",
                    "hover-stay-time"
                ))
            ), 8, _uA(
                "hover-class"
            )),
            _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("view", _uM("class" to "content"), _uA(
                    _cV(_component_boolean_data, _uM("defaultValue" to false, "title" to "是否指定按下去的样式类", "onChange" to _ctx.change_hover_class_boolean), null, 8, _uA(
                        "onChange"
                    )),
                    _cV(_component_boolean_data, _uM("defaultValue" to false, "title" to "是否阻止本节点的祖先节点出现点击态", "onChange" to _ctx.change_stop_propagation_boolean), null, 8, _uA(
                        "onChange"
                    )),
                    _cV(_component_enum_data, _uM("items" to _ctx.start_time_enum, "title" to "按住后多久出现点击态", "onChange" to _ctx.radio_change_start_time_enum), null, 8, _uA(
                        "items",
                        "onChange"
                    )),
                    _cV(_component_enum_data, _uM("items" to _ctx.stay_time_enum, "title" to "手指松开后点击态保留时间", "onChange" to _ctx.radio_change_stay_time_enum), null, 8, _uA(
                        "items",
                        "onChange"
                    ))
                ))
            ), 4)
        ), 64)
    }
    open var hover_class: Boolean by `$data`
    open var stop_propagation: Boolean by `$data`
    open var start_time: Number by `$data`
    open var stay_time: Number by `$data`
    open var start_time_enum: UTSArray<ItemType> by `$data`
    open var stay_time_enum: UTSArray<ItemType> by `$data`
    open var isDarkMode: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("hover_class" to false, "stop_propagation" to false, "start_time" to 50, "stay_time" to 400, "start_time_enum" to _uA<ItemType>(ItemType(value = 50, name = "50毫秒"), ItemType(value = 200, name = "200毫秒")), "stay_time_enum" to _uA<ItemType>(ItemType(value = 400, name = "400毫秒"), ItemType(value = 200, name = "200毫秒")), "isDarkMode" to computed<Boolean>(fun(): Boolean {
            return state.isDarkMode
        }
        ))
    }
    open var change_hover_class_boolean = ::gen_change_hover_class_boolean_fn
    open fun gen_change_hover_class_boolean_fn(checked: Boolean) {
        this.hover_class = checked
    }
    open var change_stop_propagation_boolean = ::gen_change_stop_propagation_boolean_fn
    open fun gen_change_stop_propagation_boolean_fn(checked: Boolean) {
        this.stop_propagation = checked
    }
    open var radio_change_start_time_enum = ::gen_radio_change_start_time_enum_fn
    open fun gen_radio_change_start_time_enum_fn(time: Number) {
        this.start_time = time
    }
    open var radio_change_stay_time_enum = ::gen_radio_change_stay_time_enum_fn
    open fun gen_radio_change_stay_time_enum_fn(time: Number) {
        this.stay_time = time
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
                return _uM("main" to _pS(_uM("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "flexDirection" to "row", "justifyContent" to "center")), "test-view" to _pS(_uM("height" to 200, "width" to 200, "backgroundColor" to "var(--list-background-color,#ffffff)")), "is-hover" to _pS(_uM("backgroundColor" to "#179b16")), "is-parent-hover" to _pS(_uM("backgroundColor" to "#aa0000")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
