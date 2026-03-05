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
open class GenPagesCSSTextWhiteSpace : BasePage {
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
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass)
        return _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
            _cE("scroll-view", _uM("style" to _nS(_uM("padding" to "10px 0px", "background-color" to "gray", "justify-content" to "center")), "direction" to "horizontal"), _uA(
                _cE("text", _uM("class" to "text", "style" to _nS(_ctx.textStyle)), _tD(_ctx.multiLineText), 5)
            ), 4),
            _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("view", _uM("class" to "content"), _uA(
                    _cV(_component_enum_data, _uM("items" to _ctx.white_space, "title" to "white-space", "onChange" to _ctx.radio_change), null, 8, _uA(
                        "items",
                        "onChange"
                    ))
                ))
            ), 4)
        ), 4)
    }
    open var textStyle: String by `$data`
    open var white_space: UTSArray<ItemType> by `$data`
    open var multiLineText: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("textStyle" to "white-space: normal;", "white_space" to _uA<ItemType>(ItemType(value = 0, name = "normal"), ItemType(value = 1, name = "nowrap"), ItemType(value = 2, name = "pre"), ItemType(value = 3, name = "pre-wrap"), ItemType(value = 4, name = "pre-line"), ItemType(value = 5, name = "break-spaces")), "multiLineText" to "HBuilderX，\n\t轻巧、\n\t\t极速，\n\t\t\t极客编辑器；\n\t\t\t\tuni-app x，\n\t\t\t\t\t终极跨平台方案；\n\t\t\t\tuts，\n\t\t\t大一统语言\n\nHBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言")
    }
    open var radio_change = ::gen_radio_change_fn
    open fun gen_radio_change_fn(checked: Number) {
        this.textStyle = "white-space: " + this.white_space[checked].name + ";"
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
                return _uM("text" to _pS(_uM("fontSize" to 20, "alignSelf" to "flex-start")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
