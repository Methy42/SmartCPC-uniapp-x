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
open class GenPagesAPIElementRequestFullscreenElementRequestFullscreenBugs : BasePage {
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
            this.fullscreenElement = uni_getElementById("fullscreen") as UniElement
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", null, _uA(
            _cE("view", _uM("style" to _nS(_uM("padding" to "8px"))), _uA(
                _cE("view", _uM("class" to "position-error", "id" to "fullscreen", "onClick" to _ctx.requestfullscreen), _uA(
                    _cE("text", _uM("style" to _nS(_uM("color" to "white"))), "测试position：fixed在安卓上的bug", 4)
                ), 8, _uA(
                    "onClick"
                ))
            ), 4)
        ))
    }
    open var fullscreenElement: UniElement? by `$data`
    open var isFullscreen: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("fullscreenElement" to null as UniElement?, "isFullscreen" to false)
    }
    open var getCurrentPage = ::gen_getCurrentPage_fn
    open fun gen_getCurrentPage_fn(): UniPage {
        val pages = getCurrentPages()
        return pages[pages.length - 1]
    }
    open var requestfullscreen = ::gen_requestfullscreen_fn
    open fun gen_requestfullscreen_fn() {
        if (this.isFullscreen) {
            val page = this.getCurrentPage()
            page.exitFullscreen(ExitFullscreenOptions(success = fun(){}, fail = fun(_error){}, complete = fun(_result){}))
        } else {
            this.fullscreenElement?.requestFullscreen(RequestFullscreenOptions(success = fun(){}, fail = fun(_error){}, complete = fun(_result){}))
        }
        this.isFullscreen = !this.isFullscreen
    }
    open var exitfullscreen = ::gen_exitfullscreen_fn
    open fun gen_exitfullscreen_fn() {}
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
                return _uM("position-error" to _pS(_uM("width" to 200, "height" to 200, "position" to "fixed", "backgroundColor" to "#A52A2A")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
