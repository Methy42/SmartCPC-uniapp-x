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
open class GenPagesComponentSliderSliderMaxValue : BasePage {
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
        onReady(fun() {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_slider = resolveComponent("slider")
        return _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
            _cE("view", _uM("class" to "uni-title"), "最大值溢出测试（不能滑动到最右侧）"),
            _cE("view", null, _uA(
                _cV(_component_slider, _uM("id" to "slider", "value" to 0, "min" to 0, "max" to 10.5, "step" to 1, "show-value" to true, "onChange" to _ctx.valueChange), null, 8, _uA(
                    "onChange"
                ))
            ))
        ))
    }
    open var sliderX: Number by `$data`
    open var sliderY: Number by `$data`
    open var sliderHeight: Number by `$data`
    open var sliderValue: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("sliderX" to 0, "sliderY" to 0, "sliderHeight" to 0, "sliderValue" to 0)
    }
    open var valueChange = ::gen_valueChange_fn
    open fun gen_valueChange_fn(e: UniSliderChangeEvent) {
        console.log("valueChange", e.detail.value, " at pages/component/slider/slider-maxValue.uvue:36")
        this.sliderValue = e.detail.value
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
