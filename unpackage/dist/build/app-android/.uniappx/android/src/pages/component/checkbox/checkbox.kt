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
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesComponentCheckboxCheckbox : BasePage {
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
        val _component_checkbox = resolveComponent("checkbox", true)
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass)
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass)
        val _component_checkbox_group = resolveComponent("checkbox-group")
        return _cE(Fragment, null, _uA(
            _cE("view", _uM("class" to "main"), _uA(
                _cV(_component_checkbox, _uM("disabled" to _ctx.disabled_boolean, "checked" to _ctx.checked_boolean, "color" to _ctx.color_input, "iconColor" to _ctx.iconColor_input, "foreColor" to _ctx.foreColor_input, "backgroundColor" to _ctx.backgroundColor_input, "borderColor" to _ctx.borderColor_input, "activeBackgroundColor" to _ctx.activeBackgroundColor_input, "activeBorderColor" to _ctx.activeBorderColor_input, "onClick" to _uA(
                    _ctx.checkbox_click,
                    _ctx.checkbox_tap
                ), "onTouchstart" to _ctx.checkbox_touchstart, "onTouchmove" to _ctx.checkbox_touchmove, "onTouchcancel" to _ctx.checkbox_touchcancel, "onTouchend" to _ctx.checkbox_touchend, "onLongpress" to _ctx.checkbox_longpress), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return _uA(
                        _cE("text", null, "uni-app-x")
                    )
                }
                ), "_" to 1), 8, _uA(
                    "disabled",
                    "checked",
                    "color",
                    "iconColor",
                    "foreColor",
                    "backgroundColor",
                    "borderColor",
                    "activeBackgroundColor",
                    "activeBorderColor",
                    "onClick",
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchcancel",
                    "onTouchend",
                    "onLongpress"
                ))
            )),
            _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("view", _uM("class" to "content"), _uA(
                    _cV(_component_page_head, _uM("title" to "组件属性")),
                    _cV(_component_boolean_data, _uM("defaultValue" to false, "title" to "当前是否选中，可用来设置默认选中", "onChange" to _ctx.change_checked_boolean), null, 8, _uA(
                        "onChange"
                    )),
                    _cV(_component_boolean_data, _uM("defaultValue" to false, "title" to "是否禁用", "onChange" to _ctx.change_disabled_boolean), null, 8, _uA(
                        "onChange"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#007aff", "title" to "checkbox的颜色", "type" to "text", "onConfirm" to _ctx.confirm_color_input), null, 8, _uA(
                        "onConfirm"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#ffffff", "title" to "checkbox默认的背景颜色", "type" to "text", "onConfirm" to _ctx.confirm_backgroundColor_input), null, 8, _uA(
                        "onConfirm"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#d1d1d1", "title" to "checkbox默认的边框颜色", "type" to "text", "onConfirm" to _ctx.confirm_borderColor_input), null, 8, _uA(
                        "onConfirm"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#ffffff", "title" to "checkbox选中时的背景颜色", "type" to "text", "onConfirm" to _ctx.confirm_activeBackgroundColor_input), null, 8, _uA(
                        "onConfirm"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#d1d1d1", "title" to "checkbox选中时的边框颜色", "type" to "text", "onConfirm" to _ctx.confirm_activeBorderColor_input), null, 8, _uA(
                        "onConfirm"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#007aff", "title" to "iconColor: checkbox的图标颜色，优先级大于color属性", "type" to "text", "onConfirm" to _ctx.confirm_iconColor_input), null, 8, _uA(
                        "onConfirm"
                    )),
                    _cV(_component_input_data, _uM("defaultValue" to "#ff0000", "title" to "foreColor: checkbox的图标颜色，优先级大于color属性", "type" to "text", "onConfirm" to _ctx.confirm_foreColor_input), null, 8, _uA(
                        "onConfirm"
                    ))
                )),
                _cE("view", null, _uA(
                    _cV(_component_page_head, _uM("title" to "默认及使用")),
                    _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                        _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                            _cE("text", _uM("class" to "uni-title-text"), " 默认样式 ")
                        )),
                        _cE("view", null, _uA(
                            _cV(_component_checkbox_group, _uM("class" to "uni-flex uni-row checkbox-group", "onChange" to _ctx.testChange, "style" to _nS(_uM("flex-wrap" to "wrap"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cV(_component_checkbox, _uM("value" to "cb", "checked" to _ctx.checked, "color" to _ctx.color, "iconColor" to _ctx.iconColor, "foreColor" to _ctx.foreColor, "style" to _nS(_uM("margin-right" to "15px")), "class" to "checkbox cb"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            "选中 "
                                        )
                                    }
                                    ), "_" to 1), 8, _uA(
                                        "checked",
                                        "color",
                                        "iconColor",
                                        "foreColor",
                                        "style"
                                    )),
                                    _cV(_component_checkbox, _uM("value" to "cb1", "style" to _nS(_uM("margin-right" to "15px")), "class" to "checkbox cb1"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _tD(_ctx.text)
                                        )
                                    }
                                    ), "_" to 1), 8, _uA(
                                        "style"
                                    )),
                                    _cV(_component_checkbox, _uM("value" to "cb2", "disabled" to _ctx.disabled, "class" to "checkbox cb2"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            "禁用"
                                        )
                                    }
                                    ), "_" to 1), 8, _uA(
                                        "disabled"
                                    )),
                                    _cV(_component_checkbox, _uM("value" to "cb3", "style" to _nS(_uM("margin-top" to "10px")), "class" to "checkbox cb3"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _tD(_ctx.wrapText)
                                        )
                                    }
                                    ), "_" to 1), 8, _uA(
                                        "style"
                                    ))
                                )
                            }
                            ), "_" to 1), 8, _uA(
                                "onChange",
                                "style"
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                            _cE("text", _uM("class" to "uni-title-text"), " 不同颜色和尺寸的checkbox ")
                        )),
                        _cE("view", null, _uA(
                            _cV(_component_checkbox_group, _uM("class" to "uni-flex uni-row checkbox-group"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cV(_component_checkbox, _uM("value" to "cb1", "checked" to true, "color" to "#FFCC33", "style" to _nS(_uM("transform" to "scale(0.7)", "margin-right" to "15px")), "class" to "checkbox"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            "选中 "
                                        )
                                    }
                                    ), "_" to 1), 8, _uA(
                                        "style"
                                    )),
                                    _cV(_component_checkbox, _uM("value" to "cb", "color" to "#FFCC33", "style" to _nS(_uM("transform" to "scale(0.7)")), "class" to "checkbox"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            "未选中"
                                        )
                                    }
                                    ), "_" to 1), 8, _uA(
                                        "style"
                                    ))
                                )
                            }
                            ), "_" to 1))
                        )),
                        _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                            _cE("text", _uM("class" to "uni-title-text"), " 两端对齐样式测试 ")
                        )),
                        _cE("view", null, _uA(
                            _cV(_component_checkbox_group, _uM("class" to "uni-flex uni-row checkbox-group"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cV(_component_checkbox, _uM("class" to "justify-test"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            "justify-content样式测试"
                                        )
                                    }
                                    ), "_" to 1))
                                )
                            }
                            ), "_" to 1))
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                        _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                            _cE("text", _uM("class" to "uni-title-text"), " 推荐展示样式 ")
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-list uni-common-pl"), _uA(
                        _cV(_component_checkbox_group, _uM("onChange" to _ctx.checkboxChange, "class" to "checkbox-group", "id" to "trigger-change"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                                    return _cV(_component_checkbox, _uM("class" to _nC(_uA(
                                        "uni-list-cell uni-list-cell-pd checkbox",
                                        _uA(
                                            if (index < _ctx.items.length - 1) {
                                                "uni-list-cell-line"
                                            } else {
                                                ""
                                            }
                                            ,
                                            "checkbox-item-" + index
                                        )
                                    )), "key" to item.value, "value" to item.value, "checked" to item.checked), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _tD(item.name)
                                        )
                                    }
                                    ), "_" to 2), 1032, _uA(
                                        "value",
                                        "checked",
                                        "class"
                                    ))
                                }
                                ), 128)
                            )
                        }
                        ), "_" to 1), 8, _uA(
                            "onChange"
                        ))
                    ))
                ))
            ), 4)
        ), 64)
    }
    open var items: UTSArray<ItemType__2> by `$data`
    open var testEvent: Boolean by `$data`
    open var text: String by `$data`
    open var wrapText: String by `$data`
    open var value: UTSArray<String> by `$data`
    open var disabled: Boolean by `$data`
    open var checked: Boolean by `$data`
    open var color: String by `$data`
    open var iconColor: String by `$data`
    open var foreColor: String by `$data`
    open var checked_boolean: Boolean by `$data`
    open var disabled_boolean: Boolean by `$data`
    open var color_input: String by `$data`
    open var backgroundColor_input: String by `$data`
    open var borderColor_input: String by `$data`
    open var activeBackgroundColor_input: String by `$data`
    open var activeBorderColor_input: String by `$data`
    open var iconColor_input: String by `$data`
    open var foreColor_input: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("items" to _uA<ItemType__2>(ItemType__2(value = "CHN", name = "中国", checked = true), ItemType__2(value = "USA", name = "美国", checked = false), ItemType__2(value = "BRA", name = "巴西", checked = false), ItemType__2(value = "JPN", name = "日本", checked = false), ItemType__2(value = "ENG", name = "英国", checked = false), ItemType__2(value = "FRA", name = "法国", checked = false)), "testEvent" to false, "text" to "未选中", "wrapText" to "uni-app x，终极跨平台方案\nuts，大一统语言", "value" to _uA<String>(), "disabled" to true, "checked" to true, "color" to "#007aff", "iconColor" to "#211cfe", "foreColor" to "#ff0000", "checked_boolean" to false, "disabled_boolean" to false, "color_input" to "#007aff", "backgroundColor_input" to "#ffffff", "borderColor_input" to "#d1d1d1", "activeBackgroundColor_input" to "#ffffff", "activeBorderColor_input" to "#d1d1d1", "iconColor_input" to "#007aff", "foreColor_input" to "#ff0000")
    }
    open var checkboxChange = ::gen_checkboxChange_fn
    open fun gen_checkboxChange_fn(e: UniCheckboxGroupChangeEvent) {
        if ((e.target?.tagName ?: "") == "CHECKBOX-GROUP" && e.type === "change") {
            this.testEvent = true
        }
        val selectedNames: UTSArray<String> = _uA()
        this.items.forEach(fun(item){
            if (e.detail.value.includes(item.value)) {
                selectedNames.push(item.name)
            }
        }
        )
        uni_showToast(ShowToastOptions(icon = "none", title = "当前选中:" + selectedNames.join(",")))
    }
    open var testChange = ::gen_testChange_fn
    open fun gen_testChange_fn(e: UniCheckboxGroupChangeEvent) {
        this.value = e.detail.value
    }
    open var checkbox_click = ::gen_checkbox_click_fn
    open fun gen_checkbox_click_fn() {
        console.log("组件被点击时触发")
    }
    open var checkbox_touchstart = ::gen_checkbox_touchstart_fn
    open fun gen_checkbox_touchstart_fn() {
        console.log("手指触摸动作开始")
    }
    open var checkbox_touchmove = ::gen_checkbox_touchmove_fn
    open fun gen_checkbox_touchmove_fn() {
        console.log("手指触摸后移动")
    }
    open var checkbox_touchcancel = ::gen_checkbox_touchcancel_fn
    open fun gen_checkbox_touchcancel_fn() {
        console.log("手指触摸动作被打断，如来电提醒，弹窗")
    }
    open var checkbox_touchend = ::gen_checkbox_touchend_fn
    open fun gen_checkbox_touchend_fn() {
        console.log("手指触摸动作结束")
    }
    open var checkbox_tap = ::gen_checkbox_tap_fn
    open fun gen_checkbox_tap_fn() {
        console.log("手指触摸后马上离开")
    }
    open var checkbox_longpress = ::gen_checkbox_longpress_fn
    open fun gen_checkbox_longpress_fn() {
        console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。")
    }
    open var change_checked_boolean = ::gen_change_checked_boolean_fn
    open fun gen_change_checked_boolean_fn(checked: Boolean) {
        this.checked_boolean = checked
    }
    open var change_disabled_boolean = ::gen_change_disabled_boolean_fn
    open fun gen_change_disabled_boolean_fn(checked: Boolean) {
        this.disabled_boolean = checked
    }
    open var confirm_color_input = ::gen_confirm_color_input_fn
    open fun gen_confirm_color_input_fn(value: String) {
        this.color_input = value
    }
    open var confirm_backgroundColor_input = ::gen_confirm_backgroundColor_input_fn
    open fun gen_confirm_backgroundColor_input_fn(value: String) {
        this.backgroundColor_input = value
    }
    open var confirm_borderColor_input = ::gen_confirm_borderColor_input_fn
    open fun gen_confirm_borderColor_input_fn(value: String) {
        this.borderColor_input = value
    }
    open var confirm_activeBackgroundColor_input = ::gen_confirm_activeBackgroundColor_input_fn
    open fun gen_confirm_activeBackgroundColor_input_fn(value: String) {
        this.activeBackgroundColor_input = value
    }
    open var confirm_activeBorderColor_input = ::gen_confirm_activeBorderColor_input_fn
    open fun gen_confirm_activeBorderColor_input_fn(value: String) {
        this.activeBorderColor_input = value
    }
    open var confirm_iconColor_input = ::gen_confirm_iconColor_input_fn
    open fun gen_confirm_iconColor_input_fn(value: String) {
        this.iconColor_input = value
    }
    open var confirm_foreColor_input = ::gen_confirm_foreColor_input_fn
    open fun gen_confirm_foreColor_input_fn(value: String) {
        this.foreColor_input = value
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
                return _uM("main" to _pS(_uM("maxHeight" to 250, "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "row", "justifyContent" to "center")), "list-item" to _uM(".main " to _uM("width" to "100%", "height" to 100, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#666666", "borderRightColor" to "#666666", "borderBottomColor" to "#666666", "borderLeftColor" to "#666666")), "uni-list-cell" to _pS(_uM("justifyContent" to "flex-start")), "justify-test" to _pS(_uM("width" to "100%", "justifyContent" to "space-between")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
