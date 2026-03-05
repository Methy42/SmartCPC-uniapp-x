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
open class GenPagesComponentPickerViewWrapPickerView : BasePage {
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
        val _component_MyPickerView = resolveComponent("MyPickerView")
        return _cE("view", null, _uA(
            if (isTrue(_ctx.visible)) {
                _cV(_component_MyPickerView, _uM("key" to 0, "ref" to "pickerViewRef"), null, 512)
            } else {
                _cC("v-if", true)
            }
            ,
            _cE("button", _uM("class" to "btn_toggle", "onClick" to _ctx.toggle), "btn", 8, _uA(
                "onClick"
            ))
        ))
    }
    open var visible: Boolean by `$data`
    open var pickerViewRef: Any? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("visible" to false, "pickerViewRef" to null)
    }
    open var setValue = ::gen_setValue_fn
    open fun gen_setValue_fn() {
        val instance = this.`$refs`["pickerViewRef"]
        if (instance != null) {
            (instance as ComponentPublicInstance).`$callMethod`("setValue")
        }
    }
    open var toggle = ::gen_toggle_fn
    open fun gen_toggle_fn() {
        this.visible = !this.visible
        if (this.visible) {
            nextTick(fun(){
                this.setValue()
            }
            )
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
        var components: Map<String, CreateVueComponent> = _uM("MyPickerView" to GenPagesComponentPickerViewPickerViewClass)
    }
}
