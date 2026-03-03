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
open class GenPagesComponentFormForm : BasePage {
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
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        val _component_checkbox = resolveComponent("checkbox")
        val _component_checkbox_group = resolveComponent("checkbox-group")
        val _component_slider = resolveComponent("slider")
        val _component_switch = resolveComponent("switch")
        val _component_picker_view_column = resolveComponent("picker-view-column")
        val _component_picker_view = resolveComponent("picker-view")
        val _component_form = resolveComponent("form", true)
        return _cE("scroll-view", _uM("class" to "scroll-view"), _uA(
            _cE("view", _uM("class" to "page"), _uA(
                _cV(_component_form, _uM("onSubmit" to _ctx.onFormSubmit, "onReset" to _ctx.onFormReset), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return _uA(
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "姓名"),
                            _cE("input", _uM("class" to "uni-input", "name" to "nickname", "value" to _ctx.nickname, "placeholder" to "请输入姓名", "maxlength" to "-1"), null, 8, _uA(
                                "value"
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "性别"),
                            _cV(_component_radio_group, _uM("name" to "gender", "class" to "flex-row"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cE("view", _uM("class" to "group-item"), _uA(
                                        _cV(_component_radio, _uM("value" to "0", "checked" to (_ctx.gender == "0")), null, 8, _uA(
                                            "checked"
                                        )),
                                        _cE("text", null, "男")
                                    )),
                                    _cE("view", _uM("class" to "group-item"), _uA(
                                        _cV(_component_radio, _uM("value" to "1", "checked" to (_ctx.gender == "1")), null, 8, _uA(
                                            "checked"
                                        )),
                                        _cE("text", null, "女")
                                    ))
                                )
                            }
                            ), "_" to 1))
                        )),
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "爱好"),
                            _cV(_component_checkbox_group, _uM("name" to "loves", "class" to "flex-row"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cE("view", _uM("class" to "group-item"), _uA(
                                        _cV(_component_checkbox, _uM("value" to "0", "checked" to (_ctx.loves.indexOf("0") > -1)), null, 8, _uA(
                                            "checked"
                                        )),
                                        _cE("text", null, "读书")
                                    )),
                                    _cE("view", _uM("class" to "group-item"), _uA(
                                        _cV(_component_checkbox, _uM("value" to "1", "checked" to (_ctx.loves.indexOf("1") > -1)), null, 8, _uA(
                                            "checked"
                                        )),
                                        _cE("text", null, "写字")
                                    ))
                                )
                            }
                            ), "_" to 1))
                        )),
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "年龄"),
                            _cV(_component_slider, _uM("name" to "age", "value" to _ctx.age, "show-value" to true), null, 8, _uA(
                                "value"
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "保留选项"),
                            _cE("view", null, _uA(
                                _cV(_component_switch, _uM("name" to "switch", "checked" to _ctx.`switch`), null, 8, _uA(
                                    "checked"
                                ))
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "备注"),
                            _cE("textarea", _uM("name" to "comment", "value" to _ctx.comment, "placeholder" to "请输入备注", "style" to _nS(_uM("background" to "#FFF"))), null, 12, _uA(
                                "value"
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-form-item"), _uA(
                            _cE("text", _uM("class" to "title"), "时间"),
                            _cV(_component_picker_view, _uM("class" to "picker-view", "name" to "time", "value" to _ctx.time, "indicator-style" to "height:50px"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cV(_component_picker_view_column, null, _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.hours, fun(item, index, __index, _cached): Any {
                                                return _cE("view", _uM("class" to "picker-view-item", "key" to index), _uA(
                                                    _cE("text", _uM("class" to "picker-view-text"), _tD(item) + "时", 1)
                                                ))
                                            }
                                            ), 128)
                                        )
                                    }
                                    ), "_" to 1)),
                                    _cV(_component_picker_view_column, null, _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.minutes, fun(item, index, __index, _cached): Any {
                                                return _cE("view", _uM("class" to "picker-view-item", "key" to index), _uA(
                                                    _cE("text", _uM("class" to "picker-view-text"), _tD(item) + "分", 1)
                                                ))
                                            }
                                            ), 128)
                                        )
                                    }
                                    ), "_" to 1))
                                )
                            }
                            ), "_" to 1), 8, _uA(
                                "value"
                            ))
                        )),
                        _cE("view", _uM("class" to "flex-row"), _uA(
                            _cE("button", _uM("class" to "btn btn-submit", "form-type" to "submit", "type" to "primary"), "Submit"),
                            _cE("button", _uM("class" to "btn btn-reset", "type" to "default", "form-type" to "reset"), "Reset")
                        ))
                    )
                }
                ), "_" to 1), 8, _uA(
                    "onSubmit",
                    "onReset"
                )),
                _cE("view", _uM("class" to "result"), "提交的表单数据"),
                _cE("textarea", _uM("class" to "textarea", "value" to _ctx.formDataText, "maxlength" to -1, "auto-height" to true), null, 8, _uA(
                    "value"
                ))
            ))
        ))
    }
    open var nickname: String by `$data`
    open var gender: String by `$data`
    open var age: Number by `$data`
    open var loves: UTSArray<String> by `$data`
    open var `switch`: Boolean by `$data`
    open var timeZoneIndex: Number by `$data`
    open var timeZoneList: UTSArray<String> by `$data`
    open var multiArray: UTSArray<UTSArray<String>> by `$data`
    open var multiIndex: UTSArray<Number> by `$data`
    open var datePickerValue: Any? by `$data`
    open var startDate: Any? by `$data`
    open var endDate: Any? by `$data`
    open var timePickerValue: String by `$data`
    open var time: UTSArray<Number> by `$data`
    open var hours: UTSArray<String> by `$data`
    open var minutes: UTSArray<String> by `$data`
    open var comment: String by `$data`
    open var formData: UTSJSONObject by `$data`
    open var testVerifySubmit: Boolean by `$data`
    open var testVerifyReset: Boolean by `$data`
    open var formDataText: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        var hours = UTSArray<String>()
        var minutes = UTSArray<String>()
        run {
            var i: Number = 1
            while(i <= 24){
                hours.push(i.toString(10))
                i++
            }
        }
        run {
            var i: Number = 1
            while(i <= 60){
                minutes.push(i.toString(10))
                i++
            }
        }
        val date = Date()
        return _uM("nickname" to "", "gender" to "0", "age" to 18, "loves" to _uA(
            "0"
        ), "switch" to true, "timeZoneIndex" to 0, "timeZoneList" to _uA<String>("中国", "美国", "巴西", "日本"), "multiArray" to _uA<UTSArray<String>>(_uA(
            "亚洲",
            "欧洲"
        ), _uA(
            "中国",
            "日本"
        ), _uA(
            "北京",
            "上海",
            "广州"
        )), "multiIndex" to _uA<Number>(0, 0, 0), "datePickerValue" to getDate(null), "startDate" to getDate("start"), "endDate" to getDate("end"), "timePickerValue" to "12:01", "time" to _uA<Number>(date.getHours() - 1, date.getMinutes() - 1), "hours" to hours as UTSArray<String>, "minutes" to minutes as UTSArray<String>, "comment" to "", "formData" to UTSJSONObject(), "testVerifySubmit" to false, "testVerifyReset" to false, "formDataText" to computed<String>(fun(): String {
            return JSON.stringify(this.formData)
        }
        ))
    }
    open var onFormSubmit = ::gen_onFormSubmit_fn
    open fun gen_onFormSubmit_fn(e: UniFormSubmitEvent) {
        this.formData = e.detail.value
        this.testVerifySubmit = (e.type == "submit" && (e.target?.tagName ?: "") == "FORM")
    }
    open var onFormReset = ::gen_onFormReset_fn
    open fun gen_onFormReset_fn(e: UniFormResetEvent) {
        this.formData = UTSJSONObject()
        this.timeZoneIndex = 0
        this.testVerifyReset = (e.type == "reset" && (e.target?.tagName ?: "") == "FORM")
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
                return _uM("scroll-view" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "page" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "flex-row" to _pS(_uM("flexDirection" to "row", "alignItems" to "center")), "uni-form-item" to _pS(_uM("paddingTop" to 15, "paddingRight" to 0, "paddingBottom" to 15, "paddingLeft" to 0)), "title" to _pS(_uM("marginBottom" to 10, "opacity" to 0.8)), "picker" to _pS(_uM("marginLeft" to 15)), "group-item" to _pS(_uM("flexDirection" to "row", "marginRight" to 20)), "picker-view" to _pS(_uM("width" to 200, "height" to 320, "marginTop" to 10)), "picker-view-item" to _pS(_uM("height" to 50)), "picker-view-text" to _pS(_uM("lineHeight" to "50px", "textAlign" to "center")), "btn" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "btn-submit" to _pS(_uM("marginRight" to 5)), "btn-reset" to _pS(_uM("marginLeft" to 5)), "result" to _pS(_uM("marginTop" to 30)), "textarea" to _pS(_uM("marginTop" to 5, "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5, "backgroundColor" to "#ffffff")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
