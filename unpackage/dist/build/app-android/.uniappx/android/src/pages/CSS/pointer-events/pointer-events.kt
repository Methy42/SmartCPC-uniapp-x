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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById
open class GenPagesCSSPointerEventsPointerEvents : BasePage {
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
            this.widthOrHeight = uni_getElementById("widthOrHeight")
            this.widthProgress = uni_getElementById("widthProgress")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_switch = resolveComponent("switch")
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", null, _uA(
                _cE("view", _uM("class" to "container1"), _uA(
                    _cE("text", null, "控制父视图pointer-events打开时可以点击"),
                    _cV(_component_switch, _uM("checked" to true, "onChange" to _ctx.onChange1), null, 8, _uA(
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "container", "style" to _nS(_uM("pointer-events" to _ctx.pointerEvents1))), _uA(
                    _cE("text", _uM("class" to "text"), "点击修改宽度"),
                    _cE("view", _uM("class" to "base-style transition-width", "id" to "widthOrHeight", "onClick" to _ctx.changeWidthOrHeight), null, 8, _uA(
                        "onClick"
                    ))
                ), 4),
                _cE("view", _uM("class" to "container1"), _uA(
                    _cE("text", null, "控制遮罩层pointer-events关闭时可以点击"),
                    _cV(_component_switch, _uM("checked" to true, "onChange" to _ctx.onChange2), null, 8, _uA(
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "container"), _uA(
                    _cE("text", _uM("class" to "text"), "点击修改宽度(递增)"),
                    _cE("view", _uM("class" to "width-progress transition-width", "id" to "widthProgress", "onClick" to _ctx.changeWidthProgress), null, 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "mask", "style" to _nS(_uM("pointer-events" to _ctx.pointerEvents2))), null, 4)
                ))
            ))
        ), 4)
    }
    open var isTranstionWidthOrHeight: Boolean by `$data`
    open var widthOrHeight: UniElement? by `$data`
    open var widthProgress: UniElement? by `$data`
    open var progressWidth: Number by `$data`
    open var pointerEvents1: String by `$data`
    open var pointerEvents2: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("isTranstionWidthOrHeight" to false, "widthOrHeight" to null as UniElement?, "widthProgress" to null as UniElement?, "progressWidth" to 200, "pointerEvents1" to "auto", "pointerEvents2" to "auto")
    }
    open var changeWidthOrHeight = ::gen_changeWidthOrHeight_fn
    open fun gen_changeWidthOrHeight_fn() {
        this.widthOrHeight?.style?.setProperty("width", if (this.isTranstionWidthOrHeight) {
            "200px"
        } else {
            "300px"
        }
        )
        this.isTranstionWidthOrHeight = !this.isTranstionWidthOrHeight
    }
    open var changeWidthProgress = ::gen_changeWidthProgress_fn
    open fun gen_changeWidthProgress_fn() {
        this.progressWidth += 20
        this.widthProgress?.style?.setProperty("width", this.progressWidth + "px")
    }
    open var onChange1 = ::gen_onChange1_fn
    open fun gen_onChange1_fn(e: UniSwitchChangeEvent) {
        this.pointerEvents1 = if (e.detail.value) {
            "auto"
        } else {
            "none"
        }
    }
    open var onChange2 = ::gen_onChange2_fn
    open fun gen_onChange2_fn(e: UniSwitchChangeEvent) {
        this.pointerEvents2 = if (e.detail.value) {
            "auto"
        } else {
            "none"
        }
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
                return _uM("container1" to _pS(_uM("marginTop" to 7, "marginRight" to 0, "marginBottom" to 7, "marginLeft" to 7, "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "container" to _pS(_uM("marginTop" to 7, "marginRight" to 7, "marginBottom" to 7, "marginLeft" to 7, "backgroundColor" to "#FFFFFF")), "text" to _pS(_uM("marginTop" to 10, "marginBottom" to 16)), "base-style" to _pS(_uM("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "width-progress" to _pS(_uM("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "transition-width" to _pS(_uM("transitionProperty" to "width", "transitionDuration" to "1s")), "mask" to _pS(_uM("position" to "absolute", "bottom" to 0, "left" to 0, "width" to "100%", "height" to 200, "backgroundColor" to "rgba(0,0,0,0.5)")), "@TRANSITION" to _uM("transition-width" to _uM("property" to "width", "duration" to "1s")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
