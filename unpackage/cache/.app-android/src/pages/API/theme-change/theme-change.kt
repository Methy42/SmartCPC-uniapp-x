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
import io.dcloud.uniapp.extapi.getSystemInfo as uni_getSystemInfo
import io.dcloud.uniapp.extapi.offAppThemeChange as uni_offAppThemeChange
import io.dcloud.uniapp.extapi.offOsThemeChange as uni_offOsThemeChange
import io.dcloud.uniapp.extapi.onAppThemeChange as uni_onAppThemeChange
import io.dcloud.uniapp.extapi.onOsThemeChange as uni_onOsThemeChange
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.setAppTheme as uni_setAppTheme
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIThemeChangeThemeChange : BasePage {
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
        onReady(fun() {
            uni_getSystemInfo(GetSystemInfoOptions(success = fun(res: GetSystemInfoResult){
                this.osTheme = res.osTheme!!
                this.originalTheme = res.appTheme!!
                this.appTheme = if (res.appTheme == "auto") {
                    res.osTheme!!
                } else {
                    res.appTheme!!
                }
                this.current = this.items.indexOf(res.appTheme!!)
            }
            ))
            this.osThemeChangeId = this.bindOsThemeChange()
            this.appThemeChangeId = this.bindAppThemeChange()
        }
        , __ins)
        onUnload(fun() {
            uni_offAppThemeChange(this.appThemeChangeId)
            uni_offOsThemeChange(this.osThemeChangeId)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        return _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
            _cE("view", _uM("class" to "uni-common-mt item-box"), _uA(
                _cE("text", null, "osTheme:"),
                _cE("text", _uM("id" to "theme"), _tD(_ctx.osTheme), 1)
            )),
            _cE("view", _uM("class" to "uni-common-mt item-box"), _uA(
                _cE("text", null, "应用当前主题:"),
                _cE("text", _uM("id" to "theme"), _tD(_ctx.appTheme), 1)
            )),
            _cE("view", null, _uA(
                _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                    _cE("text", _uM("class" to "uni-title-text"), " 修改appTheme主题（此处仅为演示API，本应用并未完整适配暗黑模式） ")
                ))
            )),
            _cE("view", _uM("class" to "uni-list uni-common-pl"), _uA(
                _cV(_component_radio_group, _uM("onChange" to _ctx.radioChange, "class" to "radio-group"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                            return _cV(_component_radio, _uM("class" to _nC(_uA(
                                "uni-list-cell uni-list-cell-pd radio",
                                if (index < _ctx.items.length - 1) {
                                    "uni-list-cell-line"
                                } else {
                                    ""
                                }
                            )), "key" to item, "value" to item, "checked" to (index === _ctx.current)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _tD(item)
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
        ))
    }
    open var osThemeChangeId: Number by `$data`
    open var appThemeChangeId: Number by `$data`
    open var osTheme: String by `$data`
    open var appTheme: String by `$data`
    open var originalTheme: String by `$data`
    open var current: Number by `$data`
    open var items: UTSArray<String> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("osThemeChangeId" to 0, "appThemeChangeId" to 0, "osTheme" to "light" as String, "appTheme" to "light" as String, "originalTheme" to "light" as String, "current" to 0, "items" to _uA<String>("light", "dark", "auto"))
    }
    open var bindOsThemeChange = ::gen_bindOsThemeChange_fn
    open fun gen_bindOsThemeChange_fn(): Number {
        return uni_onOsThemeChange(fun(res: OsThemeChangeResult){
            this.osTheme = res.osTheme
        }
        )
    }
    open var bindAppThemeChange = ::gen_bindAppThemeChange_fn
    open fun gen_bindAppThemeChange_fn(): Number {
        return uni_onAppThemeChange(fun(res: AppThemeChangeResult){
            this.appTheme = res.appTheme
        }
        )
    }
    open var radioChange = ::gen_radioChange_fn
    open fun gen_radioChange_fn(e: UniRadioGroupChangeEvent) {
        val theme = e.detail.value
        this.setAppTheme(theme)
        uni_showToast(ShowToastOptions(icon = "none", title = "当前选中:" + theme))
    }
    open var setAppTheme = ::gen_setAppTheme_fn
    open fun gen_setAppTheme_fn(value: String) {
        uni_setAppTheme(SetAppThemeOptions(theme = value as String, success = fun(_) {
            console.log("设置appTheme为", value, "成功", " at pages/API/theme-change/theme-change.uvue:82")
        }
        , fail = fun(e: IAppThemeFail) {
            console.log("设置appTheme为", value, "失败,原因:", e.errMsg, " at pages/API/theme-change/theme-change.uvue:85")
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
                return _uM("item-box" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between")), "uni-list-cell" to _pS(_uM("justifyContent" to "flex-start")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
