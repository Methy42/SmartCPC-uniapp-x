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
open class GenPagesAPIAnimationFrameAnimationFrame : BasePage {
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
            if (this.taskId > 0) {
                this.stopRequestAnimationFrame()
            }
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("view", _uM("class" to "page"), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("button", _uM("onClick" to _ctx.startRequestAnimationFrame), "requestAnimationFrame", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.stopRequestAnimationFrame), "cancelAnimationFrame", 8, _uA(
                "onClick"
            )),
            _cE("text", _uM("class" to "frame-count"), "FPS: " + _tD(_ctx.FPSString), 1),
            _cE("text", _uM("class" to "frame-count"), "FrameCount: " + _tD(_ctx.testFrameCount), 1),
            _cE("text", _uM("class" to "tips"), "提示: 在当前测试例子中，每增加一次调用 requestAnimationFrame 帧率翻倍，cancelAnimationFrame 后恢复")
        ))
    }
    open var title: String by `$data`
    open var taskId: Number by `$data`
    open var FPSString: String by `$data`
    open var lastTime: Number by `$data`
    open var frameCount: Number by `$data`
    open var testFrameCount: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "AnimationFrame", "taskId" to 0, "FPSString" to "- / -ms", "lastTime" to 0, "frameCount" to 0, "testFrameCount" to 0)
    }
    open var startRequestAnimationFrame = ::gen_startRequestAnimationFrame_fn
    open fun gen_startRequestAnimationFrame_fn() {
        this.taskId = requestAnimationFrame(fun(timestamp: Number){
            this.updateFPS(timestamp)
            this.testFrameCount++
            this.startRequestAnimationFrame()
        }
        )
    }
    open var stopRequestAnimationFrame = ::gen_stopRequestAnimationFrame_fn
    open fun gen_stopRequestAnimationFrame_fn() {
        cancelAnimationFrame(this.taskId)
        this.lastTime = 0
        this.frameCount = 0
        this.FPSString = "- / -ms"
    }
    open var updateFPS = ::gen_updateFPS_fn
    open fun gen_updateFPS_fn(timestamp: Number) {
        this.frameCount++
        if (timestamp - this.lastTime >= 1000) {
            val timeOfFrame = ((1000 as Number) / this.frameCount)
            this.FPSString = "" + this.frameCount + " / " + timeOfFrame.toFixed(3) + "ms"
            this.frameCount = 0
            this.lastTime = timestamp
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
                return _uM("page" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "frame-count" to _pS(_uM("marginTop" to 15)), "tips" to _pS(_uM("fontSize" to 12, "marginTop" to 30, "opacity" to 0.7)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
