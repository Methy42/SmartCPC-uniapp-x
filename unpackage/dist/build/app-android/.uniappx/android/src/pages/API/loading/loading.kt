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
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
open class GenPagesAPILoadingLoading : BasePage {
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
            uni_showLoading(ShowLoadingOptions(title = "onLoad 调用示例,2秒后消失"))
            setTimeout(fun() {
                uni_hideLoading()
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
        val _component_switch = resolveComponent("switch")
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        return _cE("view", null, _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-list"), _uA(
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-pd"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell-db"), "是否显示透明蒙层-屏蔽点击事件"),
                    _cV(_component_switch, _uM("checked" to _ctx.maskSelect, "onChange" to _ctx.maskChange), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                    _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                        _cE("text", _uM("class" to "uni-title-text"), " 设置标题 ")
                    ))
                )),
                _cE("view", _uM("class" to "uni-list uni-common-pl"), _uA(
                    _cV(_component_radio_group, _uM("onChange" to _ctx.radioChange), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to _nC(_uA(
                                    "uni-list-cell uni-list-cell-pd radio",
                                    if (index < _ctx.items.length - 1) {
                                        "uni-list-cell-line"
                                    } else {
                                        ""
                                    }
                                )), "key" to item.value, "value" to item.value, "checked" to (index === _ctx.current)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(item.name)
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
                ))
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.showLoading), "显示 loading 提示框", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("class" to "uni-btn-v", "onClick" to _ctx.hideLoading), "隐藏 loading 提示框", 8, _uA(
                        "onClick"
                    )),
                    _cE("text", null, "为方便演示，loading弹出3秒后自动关闭")
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var items: UTSArray<ItemType__5> by `$data`
    open var current: Number by `$data`
    open var maskSelect: Boolean by `$data`
    open var titleSelect: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "loading", "items" to _uA<ItemType__5>(ItemType__5(value = "null", name = "无标题"), ItemType__5(value = "三秒后自动关闭", name = "普通标题"), ItemType__5(value = "超长文本内容，测试超出范围-超长文本内容，测试超出范围-三秒后自动关闭", name = "长标题")), "current" to 0, "maskSelect" to false, "titleSelect" to "null")
    }
    open var jest_getWindowInfo = ::gen_jest_getWindowInfo_fn
    open fun gen_jest_getWindowInfo_fn(): GetWindowInfoResult {
        return uni_getWindowInfo()
    }
    open var radioChange = ::gen_radioChange_fn
    open fun gen_radioChange_fn(e: UniRadioGroupChangeEvent) {
        val selected = this.items.find(fun(item): Boolean {
            return item.value == e.detail.value
        }
        )
        if (selected != null) {
            this.titleSelect = selected.value
        }
    }
    open var maskChange = ::gen_maskChange_fn
    open fun gen_maskChange_fn(e: UniSwitchChangeEvent) {
        this.maskSelect = e.detail.value
    }
    open var showLoading = ::gen_showLoading_fn
    open fun gen_showLoading_fn() {
        console.log(this.titleSelect)
        if (this.titleSelect == "null") {
            uni_showLoading(ShowLoadingOptions(title = "", mask = this.maskSelect))
        } else {
            uni_showLoading(ShowLoadingOptions(title = this.titleSelect, mask = this.maskSelect))
        }
        setTimeout(fun(){
            this.hideLoading()
        }
        , 3000)
    }
    open var hideLoading = ::gen_hideLoading_fn
    open fun gen_hideLoading_fn() {
        uni_hideLoading()
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
