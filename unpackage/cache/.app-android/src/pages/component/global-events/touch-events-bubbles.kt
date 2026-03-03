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
open class GenPagesComponentGlobalEventsTouchEventsBubbles : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to "事件冒泡测试")),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("view", _uM("class" to "view-box", "id" to "view1", "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), _uA(
                    _cE("view", _uM("class" to "mid-view", "id" to "view1-2", "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), _uA(
                        _cE("image", _uM("class" to "icon", "id" to "view1-3", "src" to default__2, "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), null, 40, _uA(
                            "onTouchstart",
                            "onTouchmove",
                            "onTouchend"
                        ))
                    ), 40, _uA(
                        "onTouchstart",
                        "onTouchmove",
                        "onTouchend"
                    ))
                ), 40, _uA(
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchend"
                )),
                _cE("view", _uM("class" to "view-box", "id" to "view2", "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), _uA(
                    _cE("view", _uM("class" to "mid-view", "id" to "view2-2", "onTouchend" to _ctx.onTouchEnd), _uA(
                        _cE("view", _uM("style" to _nS(_uM("background-color" to "beige")), "class" to "icon", "id" to "view2-3", "onTouchstart" to _ctx.onTouchStart, "onTouchend" to _ctx.onTouchEnd), null, 44, _uA(
                            "onTouchstart",
                            "onTouchend"
                        ))
                    ), 40, _uA(
                        "onTouchend"
                    ))
                ), 40, _uA(
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchend"
                ))
            ))
        ), 4)
    }
    open var iconRect: DOMRect? by `$data`
    open var viewEleRect: DOMRect? by `$data`
    open var touchstartValue: UTSArray<String> by `$data`
    open var touchmoveValue: UTSArray<String> by `$data`
    open var touchendValue: UTSArray<String> by `$data`
    open var ret1: Boolean by `$data`
    open var ret2: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("iconRect" to null as DOMRect?, "viewEleRect" to null as DOMRect?, "touchstartValue" to _uA<String>(), "touchmoveValue" to _uA<String>(), "touchendValue" to _uA<String>(), "ret1" to false, "ret2" to false)
    }
    open var clearValue = ::gen_clearValue_fn
    open fun gen_clearValue_fn() {
        this.touchstartValue = _uA()
        this.touchmoveValue = _uA()
        this.touchendValue = _uA()
    }
    open var isPassTest1 = ::gen_isPassTest1_fn
    open fun gen_isPassTest1_fn() {
        var touchStart = this.touchstartValue.join("")
        var touchMove = this.touchmoveValue.join("")
        var touchEnd = this.touchendValue.join("")
        console.log("touchStart: ", touchStart, " at pages/component/global-events/touch-events-bubbles.uvue:58")
        console.log("touchMove: ", touchMove, " at pages/component/global-events/touch-events-bubbles.uvue:59")
        console.log("touchEnd: ", touchEnd, " at pages/component/global-events/touch-events-bubbles.uvue:60")
        var result = touchStart == "view1-3view1-2view1" && touchMove == "view1-3view1-2view1" && touchEnd == "view1-3view1-2view1"
        console.log("isPassTest1", result, " at pages/component/global-events/touch-events-bubbles.uvue:65")
        this.ret1 = result
        this.clearValue()
    }
    open var isPassTest2 = ::gen_isPassTest2_fn
    open fun gen_isPassTest2_fn() {
        var touchStart = this.touchstartValue.join("")
        var touchMove = this.touchmoveValue.join("")
        var touchEnd = this.touchendValue.join("")
        console.log("touchStart: ", touchStart, " at pages/component/global-events/touch-events-bubbles.uvue:73")
        console.log("touchMove: ", touchMove, " at pages/component/global-events/touch-events-bubbles.uvue:74")
        console.log("touchEnd: ", touchEnd, " at pages/component/global-events/touch-events-bubbles.uvue:75")
        var result = touchStart == "view2-3view2" && touchMove == "view2" && touchEnd == "view2-3view2-2view2"
        console.log("isPassTest2", result, " at pages/component/global-events/touch-events-bubbles.uvue:80")
        this.ret2 = result
        this.clearValue()
    }
    open var onTouchStart = ::gen_onTouchStart_fn
    open fun gen_onTouchStart_fn(e: TouchEvent) {
        var _id = e.currentTarget!!.attributes.get("id") as String
        if (!this.touchstartValue.includes(_id)) {
            this.touchstartValue.push(_id)
        }
        console.log("onTouchStart", e.currentTarget!!.attributes.get("id"), " at pages/component/global-events/touch-events-bubbles.uvue:89")
    }
    open var onTouchMove = ::gen_onTouchMove_fn
    open fun gen_onTouchMove_fn(e: TouchEvent) {
        var _id = e.currentTarget!!.attributes.get("id") as String
        if (!this.touchmoveValue.includes(_id)) {
            this.touchmoveValue.push(_id)
        }
        console.log("onTouchMove", e.currentTarget!!.attributes.get("id"), " at pages/component/global-events/touch-events-bubbles.uvue:96")
    }
    open var onTouchEnd = ::gen_onTouchEnd_fn
    open fun gen_onTouchEnd_fn(e: TouchEvent) {
        var _id = e.currentTarget!!.attributes.get("id") as String
        if (!this.touchendValue.includes(_id)) {
            this.touchendValue.push(_id)
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
                return _uM("container" to _pS(_uM("width" to "100%", "height" to "80%", "flexDirection" to "column", "alignItems" to "center", "justifyContent" to "space-between")), "view-box" to _pS(_uM("width" to 200, "height" to 200, "alignItems" to "center", "justifyContent" to "center", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid")), "mid-view" to _pS(_uM("width" to 150, "height" to 150, "alignItems" to "center", "justifyContent" to "center", "backgroundColor" to "#00FFFF")), "icon" to _pS(_uM("width" to 100, "height" to 100)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
