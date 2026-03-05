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
open class GenPagesCSSTransitionTransitionDuration : BasePage {
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
        return _cE("view", null, _uA(
            _cE("view", _uM("class" to _nC(_ctx.`class`)), null, 2),
            _cE("button", _uM("onClick" to _ctx.start), "start", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.reset), "reset", 8, _uA(
                "onClick"
            ))
        ))
    }
    open var `class`: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("class" to "box")
    }
    open var start = ::gen_start_fn
    open fun gen_start_fn() {
        this.`class` = "box ani"
    }
    open var reset = ::gen_reset_fn
    open fun gen_reset_fn() {
        this.`class` = "box"
    }
    open var jest_start = ::gen_jest_start_fn
    open fun gen_jest_start_fn() {
        this.start()
    }
    open var jest_reset = ::gen_jest_reset_fn
    open fun gen_jest_reset_fn() {
        this.reset()
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
                return _uM("box" to _pS(_uM("width" to 100, "height" to 100, "backgroundColor" to "#0000FF")), "ani" to _pS(_uM("transitionDuration" to "5s", "width" to 200)), "@TRANSITION" to _uM("ani" to _uM("duration" to "5s")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
