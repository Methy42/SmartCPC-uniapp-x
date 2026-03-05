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
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentSwitchSwitch : BasePage {
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
        val _component_switch = resolveComponent("switch", true)
        return _cE("view", null, _uA(
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE("view", _uM("class" to "uni-title"), "默认样式"),
                _cE("view", _uM("class" to "flex-row"), _uA(
                    _cV(_component_switch, _uM("class" to "switch-checked", "checked" to _ctx.checked, "onChange" to _ctx.switch1Change), null, 8, _uA(
                        "checked",
                        "onChange"
                    )),
                    _cV(_component_switch, _uM("onChange" to _ctx.switch2Change), null, 8, _uA(
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-title"), "暗黑样式"),
                _cE("view", _uM("class" to "flex-row"), _uA(
                    _cV(_component_switch, _uM("id" to "darkChecked", "background-color" to "#1f1f1f", "activeBackgroundColor" to "#007aff", "foreColor" to "#f0f0f0", "activeForeColor" to "#ffffff", "checked" to _ctx.checked), null, 8, _uA(
                        "checked"
                    )),
                    _cV(_component_switch, _uM("id" to "dark", "background-color" to "#1f1f1f", "activeBackgroundColor" to "#007aff", "foreColor" to "#f0f0f0", "activeForeColor" to "#ffffff"))
                )),
                _cE("view", _uM("class" to "uni-title"), "禁用样式"),
                _cE("view", _uM("class" to "flex-row"), _uA(
                    _cV(_component_switch, _uM("class" to "switch-checked", "checked" to _ctx.checked, "disabled" to true), null, 8, _uA(
                        "checked"
                    )),
                    _cV(_component_switch, _uM("disabled" to true))
                )),
                _cE("view", _uM("class" to "uni-title"), "不同颜色和尺寸的switch"),
                _cE("view", _uM("class" to "flex-row"), _uA(
                    _cV(_component_switch, _uM("class" to "switch-color-checked", "color" to _ctx.color, "style" to _nS(_uM("transform" to "scale(0.7)")), "checked" to true), null, 8, _uA(
                        "color",
                        "style"
                    )),
                    _cV(_component_switch, _uM("class" to "switch-color", "color" to _ctx.color, "style" to _nS(_uM("transform" to "scale(0.7)"))), null, 8, _uA(
                        "color",
                        "style"
                    ))
                )),
                _cE("view", _uM("class" to "uni-title"), "推荐展示样式")
            )),
            _cE("view", _uM("class" to "uni-list"), _uA(
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell-db"), "开启中"),
                    _cV(_component_switch, _uM("checked" to true))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell-db"), "关闭"),
                    _cV(_component_switch)
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var checked: Boolean by `$data`
    open var color: String by `$data`
    open var clickCheckedValue: Boolean by `$data`
    open var testVerifyEvent: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "switch 开关", "checked" to true, "color" to "#FFCC33", "clickCheckedValue" to true, "testVerifyEvent" to false)
    }
    open var switch1Change = ::gen_switch1Change_fn
    open fun gen_switch1Change_fn(e: UniSwitchChangeEvent) {
        this.clickCheckedValue = e.detail.value
        console.log("switch1 发生 change 事件，携带值为", e.detail.value)
        this.testVerifyEvent = (e.type == "change" && (e.target?.tagName ?: "") == "SWITCH")
    }
    open var switch2Change = ::gen_switch2Change_fn
    open fun gen_switch2Change_fn(e: UniSwitchChangeEvent) {
        console.log("switch2 发生 change 事件，携带值为", e.detail.value)
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
                return _uM("flex-row" to _pS(_uM("flexDirection" to "row")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
