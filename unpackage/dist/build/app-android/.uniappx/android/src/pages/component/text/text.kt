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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
open class GenPagesComponentTextText : BasePage {
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
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesComponentTextText) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesComponentTextText
            val _cache = __ins.renderCache
            val title = ref("text")
            val texts = ref(_uA<String>("HBuilderX，轻巧、极速，极客编辑器", "uni-app x，终极跨平台方案", "uniCloud，js serverless云服务", "uts，大一统语言", "uniMPSdk，让你的App具备小程序能力", "uni-admin，开源、现成的全端管理后台", "uni-id，开源、全端的账户中心", "uni-pay，开源、云端一体、全平台的支付", "uni-ai，聚合ai能力", "uni-cms，开源、云端一体、全平台的内容管理平台", "uni-im，开源、云端一体、全平台的im即时消息", "uni统计，开源、完善、全平台的统计报表", "......"))
            val text = ref("")
            val canAdd = ref(true)
            val canRemove = ref(false)
            val extraLine = ref(_uA<String>())
            val add = fun(){
                extraLine.value.push(texts.value[extraLine.value.length % 12])
                text.value = extraLine.value.join("\n")
                canAdd.value = extraLine.value.length < 12
                canRemove.value = extraLine.value.length > 0
            }
            val remove = fun(){
                if (extraLine.value.length > 0) {
                    extraLine.value.pop()
                    text.value = extraLine.value.join("\n")
                    canAdd.value = extraLine.value.length < 12
                    canRemove.value = extraLine.value.length > 0
                }
            }
            val textProps = fun(){
                uni_navigateTo(NavigateToOptions(url = "/pages/component/text/text-props"))
            }
            val textLayout = fun(){
                uni_navigateTo(NavigateToOptions(url = "/pages/component/text/text-layout"))
            }
            return fun(): Any? {
                val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
                return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                    _cV(_component_page_head, _uM("title" to unref(title)), null, 8, _uA(
                        "title"
                    )),
                    _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                        _cE("view", _uM("class" to "text-box"), _uA(
                            _cE("text", _uM("class" to "text"), _tD(unref(text)), 1)
                        )),
                        _cE("view", _uM("class" to "uni-btn-v"), _uA(
                            _cE("button", _uM("class" to "uni-btn", "type" to "primary", "disabled" to !unref(canAdd), "onClick" to add), " add line ", 8, _uA(
                                "disabled"
                            )),
                            _cE("button", _uM("class" to "uni-btn", "type" to "warn", "disabled" to !unref(canRemove), "onClick" to remove), " remove line ", 8, _uA(
                                "disabled"
                            )),
                            _cE("button", _uM("class" to "uni-btn", "type" to "primary", "onClick" to textProps), " 更多属性示例 "),
                            _cE("button", _uM("class" to "uni-btn", "type" to "primary", "onClick" to textLayout), " 文本测量 ")
                        ))
                    ))
                ), 4)
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("text-box" to _pS(_uM("marginBottom" to 20, "paddingTop" to 20, "paddingRight" to 0, "paddingBottom" to 20, "paddingLeft" to 0, "display" to "flex", "minHeight" to 150, "backgroundColor" to "#ffffff", "justifyContent" to "center", "alignItems" to "center")), "text" to _pS(_uM("fontSize" to 15, "color" to "#353535", "lineHeight" to "27px", "textAlign" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
