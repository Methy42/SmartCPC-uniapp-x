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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo
import io.dcloud.uniapp.extapi.hideToast as uni_hideToast
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIToastToast : BasePage {
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
            uni_showToast(ShowToastOptions(title = "onLoad 调用示例,2秒后消失"))
            setTimeout(fun() {
                uni_hideToast()
            }
            , 2000)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        val _component_switch = resolveComponent("switch")
        val _component_slider = resolveComponent("slider")
        return _cE("scroll-view", _uM("direction" to "vertical", "style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                    _cE("text", _uM("class" to "uni-title-text uni-common-mb"), "设置icon")
                )),
                _cE("view", _uM("class" to "uni-list uni-common-pl"), _uA(
                    _cV(_component_radio_group, _uM("onChange" to _ctx.radioChangeIcon), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.icon_enum, fun(icon, index, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to _nC(_uA(
                                    "uni-list-cell uni-list-cell-pd radio-icon",
                                    if (index < _ctx.icon_enum.length - 1) {
                                        "uni-list-cell-line"
                                    } else {
                                        ""
                                    }
                                )), "key" to icon.value, "value" to icon.value, "checked" to (index === _ctx.icon_current)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(icon.name)
                                    )
                                }
                                ), "_" to 2), 1032, _uA(
                                    "class",
                                    "value",
                                    "checked"
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell-db"), "是否显示自定义图标"),
                    _cV(_component_switch, _uM("checked" to _ctx.imageSelect, "onChange" to _ctx.change_image_boolean), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell-db"), "是否显示透明蒙层-屏蔽点击事件"),
                    _cV(_component_switch, _uM("checked" to _ctx.maskSelect, "onChange" to _ctx.change_mask_boolean), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-title uni-list-cell-padding"), "提示的延迟时间，默认：1500（单位毫秒）"),
                _cE("view", _uM("class" to "uni-list-cell-padding"), _uA(
                    _cV(_component_slider, _uM("onChange" to _ctx.sliderChange, "foreColor" to "#007AFF", "value" to _ctx.intervalSelect, "min" to 1500, "max" to 5000, "show-value" to true), null, 8, _uA(
                        "onChange",
                        "value"
                    ))
                )),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("class" to "uni-btn-v", "type" to "default", "onClick" to _ctx.toast1Tap, "id" to "btn-toast-default"), "点击弹出toast", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("class" to "uni-btn-v", "type" to "default", "onClick" to _ctx.hideToast, "id" to "btn-toast-hide"), "点击隐藏toast", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                    _cE("text", _uM("class" to "uni-title-text uni-common-mb"), " 设置position，仅App生效 ")
                )),
                _cE("view", _uM("class" to "uni-list uni-common-pl"), _uA(
                    _cV(_component_radio_group, _uM("onChange" to _ctx.radioChangePosition), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.position_enum, fun(position, index, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to _nC(_uA(
                                    "uni-list-cell uni-list-cell-pd radio-position",
                                    if (index < _ctx.position_enum.length - 1) {
                                        "uni-list-cell-line"
                                    } else {
                                        ""
                                    }
                                )), "key" to position.value, "value" to position.value, "checked" to (index === _ctx.position_current)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(position.name)
                                    )
                                }
                                ), "_" to 2), 1032, _uA(
                                    "class",
                                    "value",
                                    "checked"
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange"
                    ))
                )),
                _cE("button", _uM("class" to "uni-btn uni-btn-v uni-common-mb", "type" to "default", "onClick" to _ctx.toast2Tap), "点击弹出设置position的toast", 8, _uA(
                    "onClick"
                )),
                _cE("text", null, _tD(_ctx.exeRet), 1)
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var exeRet: String by `$data`
    open var imageSelect: Boolean by `$data`
    open var maskSelect: Boolean by `$data`
    open var intervalSelect: Number by `$data`
    open var position_current: Number by `$data`
    open var position_enum: UTSArray<PositionItemType> by `$data`
    open var icon_current: Number by `$data`
    open var icon_enum: UTSArray<IconItemType> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "toast", "exeRet" to "", "imageSelect" to false, "maskSelect" to false, "intervalSelect" to 1500, "position_current" to 0, "position_enum" to _uA<PositionItemType>(PositionItemType(value = "top", name = "top: 居上显示（Android 暂不支持）"), PositionItemType(value = "center", name = "center: 居中显示（Android 暂不支持）"), PositionItemType(value = "bottom", name = "bottom: 居底显示")), "icon_current" to 0, "icon_enum" to _uA<IconItemType>(IconItemType(value = "success", name = "显示成功图标"), IconItemType(value = "error", name = "显示错误图标"), IconItemType(value = "loading", name = "显示加载图标"), IconItemType(value = "none", name = "不显示图标")))
    }
    open var jest_getWindowInfo = ::gen_jest_getWindowInfo_fn
    open fun gen_jest_getWindowInfo_fn(): GetWindowInfoResult {
        return uni_getWindowInfo()
    }
    open var radioChangeIcon = ::gen_radioChangeIcon_fn
    open fun gen_radioChangeIcon_fn(e: UniRadioGroupChangeEvent) {
        run {
            var i: Number = 0
            while(i < this.icon_enum.length){
                if (this.icon_enum[i].value === e.detail.value) {
                    this.icon_current = i
                    break
                }
                i++
            }
        }
    }
    open var change_image_boolean = ::gen_change_image_boolean_fn
    open fun gen_change_image_boolean_fn(e: UniSwitchChangeEvent) {
        this.imageSelect = e.detail.value
    }
    open var change_mask_boolean = ::gen_change_mask_boolean_fn
    open fun gen_change_mask_boolean_fn(e: UniSwitchChangeEvent) {
        this.maskSelect = e.detail.value
    }
    open var sliderChange = ::gen_sliderChange_fn
    open fun gen_sliderChange_fn(e: UniSliderChangeEvent) {
        this.intervalSelect = e.detail.value
    }
    open var radioChangePosition = ::gen_radioChangePosition_fn
    open fun gen_radioChangePosition_fn(e: UniRadioGroupChangeEvent) {
        run {
            var i: Number = 0
            while(i < this.position_enum.length){
                if (this.position_enum[i].value === e.detail.value) {
                    this.position_current = i
                    break
                }
                i++
            }
        }
    }
    open var toast1Tap = ::gen_toast1Tap_fn
    open fun gen_toast1Tap_fn() {
        uni_showToast(ShowToastOptions(title = "默认", icon = this.icon_enum[this.icon_current].value, duration = this.intervalSelect, image = if (this.imageSelect) {
            "/static/uni.png"
        } else {
            null
        }
        , mask = this.maskSelect, success = fun(res){
            this.exeRet = "success:" + JSON.stringify(res)
        }
        , fail = fun(res){
            this.exeRet = "fail:" + JSON.stringify(res)
        }
        ))
    }
    open var toast3Tap = ::gen_toast3Tap_fn
    open fun gen_toast3Tap_fn() {
        uni_showToast(ShowToastOptions(title = "默认", icon = "none", duration = this.intervalSelect, image = if (this.imageSelect) {
            "/static/uni.png"
        } else {
            null
        }
        , mask = this.maskSelect, success = fun(res){
            this.exeRet = "success:" + JSON.stringify(res)
        }
        , fail = fun(res){
            this.exeRet = "fail:" + JSON.stringify(res)
        }
        ))
    }
    open var toast2Tap = ::gen_toast2Tap_fn
    open fun gen_toast2Tap_fn() {
        var positionValue = this.position_enum[this.position_current].value
        uni_showToast(ShowToastOptions(title = "显示一段轻提示,position:" + positionValue, position = positionValue, success = fun(res){
            this.exeRet = "success:" + JSON.stringify(res)
        }
        , fail = fun(res){
            this.exeRet = "fail:" + JSON.stringify(res)
        }
        ))
    }
    open var hideToast = ::gen_hideToast_fn
    open fun gen_hideToast_fn() {
        uni_hideToast()
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(), _uA(
                GenApp.styles
            ))
        }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
