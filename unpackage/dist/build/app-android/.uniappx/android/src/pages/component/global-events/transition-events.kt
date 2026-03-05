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
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentGlobalEventsTransitionEvents : BasePage {
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
            var that = this
            open class ThreadRunnable : Runnable {
                override fun run() {
                    that.isShow = true
                }
            }
            Thread(ThreadRunnable()).start()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return if (isTrue(_ctx.isShow)) {
            _cE("scroll-view", _uM("key" to 0, "style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("image", _uM("class" to "transition-transform", "id" to "transition-transform", "onTransitionend" to _ctx.onEnd, "src" to "/static/uni.png"), null, 40, _uA(
                    "onTransitionend"
                )),
                _cE("text", _uM("class" to "adjust"), "对图片设置transform进行旋转，在旋转完成的transitionend事件后，继续旋转"),
                _cE("button", _uM("class" to "adjust", "onClick" to _ctx.switchBtn), _tD(_ctx.buttonValue), 9, _uA(
                    "onClick"
                ))
            ), 4)
        } else {
            _cC("v-if", true)
        }
    }
    open var times: Number by `$data`
    open var element: UniElement? by `$data`
    open var isStart: Boolean by `$data`
    open var buttonValue: String by `$data`
    open var onTransitionEndTriggr: Boolean by `$data`
    open var isShow: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("times" to 0, "element" to null as UniElement?, "isStart" to false, "buttonValue" to "开启图片旋转", "onTransitionEndTriggr" to false, "isShow" to false)
    }
    open var switchBtn = ::gen_switchBtn_fn
    open fun gen_switchBtn_fn() {
        if (!this.isStart) {
            if (this.element == null) {
                this.element = uni_getElementById("transition-transform")
            }
            this.buttonValue = "关闭图片旋转"
            this.times = this.times + 1
            this.element!!.style.setProperty("transition-duration", "2000ms")
            this.element!!.style.setProperty("transform", "rotate(" + this.times * 360 + "deg)")
            this.isStart = true
        } else {
            this.isStart = false
            this.times = 0
            this.onTransitionEndTriggr = false
            this.buttonValue = "开启图片旋转"
            this.element!!.style.setProperty("transition-duration", "0ms")
            this.element!!.style.setProperty("transform", "rotate(0deg)")
        }
    }
    open var onEnd = ::gen_onEnd_fn
    open fun gen_onEnd_fn() {
        console.log("transform transitionend")
        if (this.isStart) {
            this.times = this.times + 1
            this.element!!.style.setProperty("transform", "rotate(" + this.times * 360 + "deg)")
            this.onTransitionEndTriggr = true
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
                return _uM("adjust" to _pS(_uM("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "transition-transform" to _pS(_uM("width" to 200, "height" to 200, "marginTop" to 25, "marginRight" to "auto", "marginBottom" to 25, "marginLeft" to "auto", "borderTopLeftRadius" to 100, "borderTopRightRadius" to 100, "borderBottomRightRadius" to 100, "borderBottomLeftRadius" to 100, "transitionProperty" to "transform", "transitionTimingFunction" to "linear", "transform" to "rotate(0deg)")), "@TRANSITION" to _uM("transition-transform" to _uM("property" to "transform", "timingFunction" to "linear")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
