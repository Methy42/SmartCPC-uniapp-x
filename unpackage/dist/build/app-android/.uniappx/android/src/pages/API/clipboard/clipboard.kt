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
import io.dcloud.uniapp.extapi.getClipboardData as uni_getClipboardData
import io.dcloud.uniapp.extapi.setClipboardData as uni_setClipboardData
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIClipboardClipboard : BasePage {
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
        onUnload(fun() {
            uni_setClipboardData(SetClipboardDataOptions(data = ""))
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("view", null, _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("view", _uM("class" to "uni-title"), "请输入剪贴板内容"),
                _cE("view", _uM("class" to "uni-list"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                        _cE("input", _uM("class" to "uni-input", "type" to "text", "placeholder" to "请输入剪贴板内容", "value" to _ctx.data, "onInput" to _ctx.dataChange), null, 40, _uA(
                            "value",
                            "onInput"
                        ))
                    ))
                )),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.setClipboard), "存储数据", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("onClick" to _ctx.getClipboard), "读取数据", 8, _uA(
                        "onClick"
                    ))
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var data: String by `$data`
    open var getDataTest: String by `$data`
    open var setClipboardTest: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "get/setClipboardData", "data" to "", "getDataTest" to "", "setClipboardTest" to false)
    }
    open var dataChange = ::gen_dataChange_fn
    open fun gen_dataChange_fn(e: UniInputEvent) {
        this.data = e.detail.value
    }
    open var getClipboard = ::gen_getClipboard_fn
    open fun gen_getClipboard_fn() {
        uni_getClipboardData(GetClipboardDataOptions(success = fun(res){
            console.log(res.data)
            this.getDataTest = res.data
            val content = if (res.data != "") {
                "剪贴板内容为:" + res.data
            } else {
                "剪贴板暂无内容"
            }
            uni_showModal(ShowModalOptions(content = content, title = "读取剪贴板", showCancel = false))
        }
        , fail = fun(err){
            uni_showModal(ShowModalOptions(content = "读取剪贴板失败: " + err.errMsg, showCancel = false))
        }
        ))
    }
    open var setClipboard = ::gen_setClipboard_fn
    open fun gen_setClipboard_fn() {
        if (this.data.length == 0) {
            uni_showModal(ShowModalOptions(title = "设置剪贴板失败", content = "内容不能为空", showCancel = false))
        } else {
            uni_setClipboardData(SetClipboardDataOptions(data = this.data, success = fun(_){
                this.setClipboardTest = true
                uni_showToast(ShowToastOptions(title = "设置剪贴板成功", icon = "success"))
            }
            , fail = fun(_){
                this.setClipboardTest = false
                uni_showToast(ShowToastOptions(title = "储存数据失败!", icon = "none"))
            }
            ))
        }
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
