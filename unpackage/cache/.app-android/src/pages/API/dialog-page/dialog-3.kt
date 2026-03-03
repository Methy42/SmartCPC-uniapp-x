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
import io.dcloud.uniapp.extapi.closeDialogPage as uni_closeDialogPage
open class GenPagesAPIDialogPageDialog3 : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            this.getPageStyle()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_switch = resolveComponent("switch")
        val _component_slider = resolveComponent("slider")
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        return _cE("view", _uM("id" to "dialog3", "class" to "dialog-container"), _uA(
            _cE("scroll-view", _uM("class" to "dialog-content"), _uA(
                _cE("text", null, "title: " + _tD(_ctx.title), 1),
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.PageStyleArray, fun(item, index, __index, _cached): Any {
                    return _cE(Fragment, null, _uA(
                        if (_ctx.currentPageStyle[item.key] != null) {
                            _cE("view", _uM("class" to "page-style-item", "key" to index), _uA(
                                _cE("view", _uM("class" to "item-text"), _uA(
                                    _cE("text", _uM("class" to "item-text-key"), _tD(item.key) + ":", 1),
                                    _cE("text", _uM("class" to "item-text-value"), _tD(_ctx.currentPageStyle[item.key]), 1)
                                )),
                                if (item.type == "boolean") {
                                    _cE("view", _uM("key" to 0, "class" to "mt-10"), _uA(
                                        _cV(_component_switch, _uM("checked" to _ctx.currentPageStyle.getBoolean(item.key), "onChange" to fun(`$event`: Any){
                                            _ctx.switchChange(item.key, `$event` as UniSwitchChangeEvent)
                                        }), null, 8, _uA(
                                            "checked",
                                            "onChange"
                                        ))
                                    ))
                                } else {
                                    if (item.type == "number") {
                                        _cE("view", _uM("key" to 1, "class" to "mt-10"), _uA(
                                            _cV(_component_slider, _uM("value" to _ctx.currentPageStyle.getNumber(item.key), "show-value" to true, "onChange" to fun(`$event`: Any){
                                                _ctx.sliderChange(item.key, `$event` as UniSliderChangeEvent)
                                            }), null, 8, _uA(
                                                "value",
                                                "onChange"
                                            ))
                                        ))
                                    } else {
                                        if (item.type == "string") {
                                            _cE("view", _uM("key" to 2, "class" to "mt-10"), _uA(
                                                _cV(_component_radio_group, _uM("class" to "radio-set-value", "onChange" to fun(`$event`: Any){
                                                    _ctx.radioChange(item.key, `$event` as RadioGroupChangeEvent)
                                                }), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return _uA(
                                                        _cE(Fragment, null, RenderHelpers.renderList(item.value, fun(item2, index2, __index, _cached): Any {
                                                            return _cV(_component_radio, _uM("class" to "ml-10", "key" to index2, "value" to item2, "checked" to (_ctx.currentPageStyle[item.key] == item2)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                                return _uA(
                                                                    _tD(item2)
                                                                )
                                                            }), "_" to 2), 1032, _uA(
                                                                "value",
                                                                "checked"
                                                            ))
                                                        }), 128)
                                                    )
                                                }), "_" to 2), 1032, _uA(
                                                    "onChange"
                                                ))
                                            ))
                                        } else {
                                            _cC("v-if", true)
                                        }
                                    }
                                }
                            ))
                        } else {
                            _cC("v-if", true)
                        }
                    ), 64)
                }
                ), 256),
                _cE("text", _uM("class" to "mt-10 choose-close-animation-type-title"), "choose close dialogPage animationType"),
                _cV(_component_radio_group, _uM("class" to "choose-close-animation-type-radio-group", "onChange" to _ctx.handleChooseAnimationType), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.closeAnimationTypeList, fun(item, __key, __index, _cached): Any {
                            return _cV(_component_radio, _uM("class" to "ml-10 mt-10", "key" to item, "value" to item, "checked" to (_ctx.closeAnimationType == item)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _tD(item)
                                )
                            }
                            ), "_" to 2), 1032, _uA(
                                "value",
                                "checked"
                            ))
                        }
                        ), 128)
                    )
                }
                ), "_" to 1), 8, _uA(
                    "onChange"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.closeThisDialog), " closeThisDialog ", 8, _uA(
                    "onClick"
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var PageStyleArray: UTSArray<PageStyleItem__1> by `$data`
    open var currentPageStyle: UTSJSONObject by `$data`
    open var closeAnimationType: CloseAnimationType by `$data`
    open var closeAnimationTypeList: UTSArray<String> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "dialog 3", "PageStyleArray" to PageStyleArray__1 as UTSArray<PageStyleItem__1>, "currentPageStyle" to UTSJSONObject(), "closeAnimationType" to "auto" as CloseAnimationType, "closeAnimationTypeList" to _uA(
            "auto",
            "none",
            "slide-out-right",
            "slide-out-left",
            "slide-out-top",
            "slide-out-bottom",
            "fade-out",
            "zoom-in",
            "zoom-fade-in"
        ))
    }
    open var getPageStyle = ::gen_getPageStyle_fn
    open fun gen_getPageStyle_fn() {
        this.currentPageStyle = this.`$page`.getPageStyle()
    }
    open var radioChange = ::gen_radioChange_fn
    open fun gen_radioChange_fn(key: String, e: RadioGroupChangeEvent) {
        this.setStyleValue(key, e.detail.value)
    }
    open var sliderChange = ::gen_sliderChange_fn
    open fun gen_sliderChange_fn(key: String, e: UniSliderChangeEvent) {
        this.setStyleValue(key, e.detail.value)
    }
    open var switchChange = ::gen_switchChange_fn
    open fun gen_switchChange_fn(key: String, e: UniSwitchChangeEvent) {
        this.setStyleValue(key, e.detail.value)
    }
    open var setStyleValue = ::gen_setStyleValue_fn
    open fun gen_setStyleValue_fn(key: String, value: Any) {
        val style: UTSJSONObject = object : UTSJSONObject(UTSSourceMapPosition("style", "pages/API/dialog-page/dialog-3.uvue", 94, 15)) {
        }
        style[key] = value
        this.setPageStyle(style)
        this.getPageStyle()
    }
    open var setPageStyle = ::gen_setPageStyle_fn
    open fun gen_setPageStyle_fn(style: UTSJSONObject) {
        this.`$page`.setPageStyle(style)
    }
    open var handleChooseAnimationType = ::gen_handleChooseAnimationType_fn
    open fun gen_handleChooseAnimationType_fn(e: RadioGroupChangeEvent) {
        this.closeAnimationType = e.detail.value as CloseAnimationType
    }
    open var closeThisDialog = ::gen_closeThisDialog_fn
    open fun gen_closeThisDialog_fn() {
        uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`, animationType = this.closeAnimationType, success = fun(res) {
            console.log("closeDialog success", res, " at pages/API/dialog-page/dialog-3.uvue:110")
        }
        , fail = fun(err) {
            console.log("closeDialog fail", err, " at pages/API/dialog-page/dialog-3.uvue:113")
        }
        , complete = fun(res) {
            console.log("closeDialog complete", res, " at pages/API/dialog-page/dialog-3.uvue:116")
        }
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
                return _uM("dialog-container" to _pS(_uM("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.3)", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "dialog-content" to _pS(_uM("width" to "90%", "height" to 500, "paddingTop" to 10, "paddingRight" to 6, "paddingBottom" to 10, "paddingLeft" to 6, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 6, "borderTopRightRadius" to 6, "borderBottomRightRadius" to 6, "borderBottomLeftRadius" to 6)), "mt-10" to _pS(_uM("marginTop" to 10)), "ml-10" to _pS(_uM("marginLeft" to 10)), "page-style-item" to _pS(_uM("paddingTop" to 6, "paddingRight" to 0, "paddingBottom" to 6, "paddingLeft" to 0, "marginTop" to 10, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5)), "item-text" to _pS(_uM("flexDirection" to "row")), "item-text-key" to _pS(_uM("fontWeight" to "bold")), "item-text-value" to _pS(_uM("marginLeft" to 5)), "radio-set-value" to _pS(_uM("flexDirection" to "row")), "choose-close-animation-type-title" to _pS(_uM("fontWeight" to "bold")), "choose-close-animation-type-radio-group" to _pS(_uM("flexDirection" to "row", "flexWrap" to "wrap")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
