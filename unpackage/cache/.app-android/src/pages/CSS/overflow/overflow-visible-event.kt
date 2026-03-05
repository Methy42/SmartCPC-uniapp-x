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
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesCSSOverflowOverflowVisibleEvent : BasePage {
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
            this.moveEl = uni_getElementById("parent")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("id" to "scroll-view", "style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", null, _uA(
                _cE("text", _uM("style" to _nS(_uM("font-size" to "15px"))), "overflow=visible 父view（绿色），子view（红色），点击超出父view区域的部分也可触发事件。", 4),
                _cE("view", _uM("class" to "backgroundview"), _uA(
                    _cE("view", _uM("id" to "parent", "class" to "box-visible-border-radius"), _uA(
                        _cE("view", _uM("id" to "child", "style" to _nS(_uM("width" to "50px", "height" to "150px", "background-color" to "red")), "onClick" to _ctx.handleClickOverflowPart, "onTouchmove" to _ctx.handleTouchMoveOverflowPart, "onTouchstart" to _ctx.handleTouchStartOverflowPart, "onTouchend" to _ctx.handleTouchEndOverflowPart), null, 44, _uA(
                            "onClick",
                            "onTouchmove",
                            "onTouchstart",
                            "onTouchend"
                        ))
                    ))
                )),
                _cE("text", _uM("style" to _nS(_uM("font-size" to "15px"))), "overflow=visible组件的子view （绿色）被position: absolute的view（红色）遮挡时，点击事件测试。", 4),
                _cE("view", _uM("style" to _nS(_uM("width" to "300px", "height" to "300px", "background-color" to "white"))), _uA(
                    _cE("view", _uM("style" to _nS(_uM("overflow" to "visible", "height" to "100px", "width" to "100%"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("background-color" to "green", "height" to "100px", "width" to "100%")), "onClick" to fun(){
                            _ctx.handleClick("green")
                        }
                        ), null, 12, _uA(
                            "onClick"
                        ))
                    ), 4),
                    _cE("view", _uM("id" to "absolute-view", "style" to _nS(_uM("position" to "absolute", "background-color" to "red", "width" to "100px", "height" to "200px", "right" to "0px")), "onClick" to fun(){
                        _ctx.handleClick("red")
                    }
                    ), null, 12, _uA(
                        "onClick"
                    ))
                ), 4),
                _cE("text", _uM("style" to _nS(_uM("font-size" to "15px"))), "overflow=visible组件设置hover-class的测试", 4),
                _cE("view", _uM("class" to "backgroundview"), _uA(
                    _cE("view", _uM("class" to "box-visible-border-radius", "hover-class" to "hover-class"), _uA(
                        _cE("view", _uM("style" to _nS(_uM("background-color" to "red", "height" to "100px", "width" to "100px", "margin-left" to "20px", "margin-top" to "20px"))), null, 4)
                    ))
                )),
                _cE("text", _uM("style" to _nS(_uM("font-size" to "15px"))), "overflow=visible组件多层级设置测试", 4),
                _cE("view", _uM("class" to "backgroundview"), _uA(
                    _cE("view", _uM("id" to "deep-overflow", "style" to _nS(_uM("overflow" to "visible"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("overflow" to "visible", "background-color" to "red", "width" to "100px", "height" to "100px")), "onClick" to fun(){
                            _ctx.handleClick("red")
                        }
                        ), null, 12, _uA(
                            "onClick"
                        ))
                    ), 4),
                    _cE("view", _uM("style" to _nS(_uM("overflow" to "visible"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("overflow" to "visible", "background-color" to "green", "width" to "100px", "height" to "100px"))), null, 4)
                    ), 4)
                )),
                _cE("text", _uM("style" to _nS(_uM("font-size" to "15px"))), "同时设置overflow=visible、z-index的事件触发示例", 4),
                _cE("view", _uM("class" to "backgroundview"), _uA(
                    _cE("view", _uM("id" to "zindex-overflow", "style" to _nS(_uM("width" to "1px", "height" to "1px", "overflow" to "visible", "z-index" to "100")), "onClick" to fun(){
                        _ctx.handleClick("red")
                    }
                    ), _uA(
                        _cE("view", _uM("style" to _nS(_uM("width" to "100px", "height" to "100px", "background-color" to "red"))), null, 4)
                    ), 12, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("style" to _nS(_uM("width" to "1px", "height" to "1px", "overflow" to "visible"))), _uA(
                        _cE("view", _uM("style" to _nS(_uM("width" to "100px", "height" to "100px", "background-color" to "green"))), null, 4)
                    ), 4)
                ))
            ))
        ), 4)
    }
    open var jest_result: Boolean by `$data`
    open var jest_click_x: Number by `$data`
    open var jest_click_y: Number by `$data`
    open var jest_parent_top: Number by `$data`
    open var startX: Number by `$data`
    open var startY: Number by `$data`
    open var moveX: Number by `$data`
    open var moveY: Number by `$data`
    open var oldX: Number by `$data`
    open var oldY: Number by `$data`
    open var moveEl: UniElement? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("jest_result" to false, "jest_click_x" to -1, "jest_click_y" to -1, "jest_parent_top" to -1.0, "startX" to 0, "startY" to 0, "moveX" to 0, "moveY" to 0, "oldX" to 0, "oldY" to 0, "moveEl" to null as UniElement?)
    }
    open var handleClickOverflowPart = ::gen_handleClickOverflowPart_fn
    open fun gen_handleClickOverflowPart_fn() {
        console.log("click", " at pages/CSS/overflow/overflow-visible-event.uvue:81")
        this.jest_result = true
        uni_showToast(ShowToastOptions(title = "点击红色区域"))
    }
    open var handleTouchStartOverflowPart = ::gen_handleTouchStartOverflowPart_fn
    open fun gen_handleTouchStartOverflowPart_fn(e: UniTouchEvent) {
        this.startX = e.changedTouches[0].clientX
        this.startY = e.changedTouches[0].clientY
    }
    open var handleTouchMoveOverflowPart = ::gen_handleTouchMoveOverflowPart_fn
    open fun gen_handleTouchMoveOverflowPart_fn(e: UniTouchEvent) {
        console.log("touchmove:" + e.touches[0].clientX + "," + e.touches[0].clientY, " at pages/CSS/overflow/overflow-visible-event.uvue:90")
        e.preventDefault()
        e.stopPropagation()
        val difX = e.changedTouches[0].clientX
        val difY = e.changedTouches[0].clientY
        this.moveX = difX - this.startX + this.oldX
        this.moveY = difY - this.startY + this.oldY
        this.moveEl?.style?.setProperty("transform", "translate(" + this.moveX + "px," + this.moveY + "px)")
    }
    open var handleTouchEndOverflowPart = ::gen_handleTouchEndOverflowPart_fn
    open fun gen_handleTouchEndOverflowPart_fn(_0: UniTouchEvent) {
        this.oldX = this.moveX
        this.oldY = this.moveY
    }
    open var handleClick = ::gen_handleClick_fn
    open fun gen_handleClick_fn(str: String) {
        console.log("点击了 " + str + " view", " at pages/CSS/overflow/overflow-visible-event.uvue:104")
        if (str == "red") {
            this.jest_result = true
        }
    }
    open var jest_getRect = ::gen_jest_getRect_fn
    open fun gen_jest_getRect_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                val rect = await(uni_getElementById("child")!!.getBoundingClientRectAsync()!!)
                var ratio: Number = 1
                if (uni_getSystemInfoSync().platform == "android") {
                    ratio = uni_getSystemInfoSync().devicePixelRatio
                }
                this.jest_click_x = rect.x * ratio + 30
                this.jest_click_y = rect.bottom * ratio - 30
        })
    }
    open var jest_getParentRect = ::gen_jest_getParentRect_fn
    open fun gen_jest_getParentRect_fn() {
        val transform = uni_getElementById("parent")?.style?.getPropertyValue("transform")
        if (transform != null) {
            var value = transform as String
            value = value.split(",")[1].slice(0, -3)
            var ratio: Number = 1
            if (uni_getSystemInfoSync().platform == "android") {
                ratio = uni_getSystemInfoSync().devicePixelRatio
            }
            this.jest_parent_top = Math.round((parseFloat(value) * ratio))
        }
    }
    open var jest_getAbsoluteViewRect = ::gen_jest_getAbsoluteViewRect_fn
    open fun gen_jest_getAbsoluteViewRect_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                val rect = await(uni_getElementById("absolute-view")!!.getBoundingClientRectAsync()!!)
                val systemInfo = uni_getSystemInfoSync()
                val titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight
                var ratio: Number = 1
                if (uni_getSystemInfoSync().platform == "android") {
                    ratio = uni_getSystemInfoSync().devicePixelRatio
                }
                this.jest_click_x = rect.x * ratio + 30
                this.jest_click_y = (rect.top + titleBarHeight) * ratio + 30
        })
    }
    open var jest_restScorllView = ::gen_jest_restScorllView_fn
    open fun gen_jest_restScorllView_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                val scrollView = uni_getElementById("scroll-view") as UniScrollViewElement
                scrollView.scrollTo(0, 0)
        })
    }
    open var jest_scrollToDeepOverflow = ::gen_jest_scrollToDeepOverflow_fn
    open fun gen_jest_scrollToDeepOverflow_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                val scrollView = uni_getElementById("scroll-view") as UniScrollViewElement
                val rect = await(uni_getElementById("deep-overflow")!!.getBoundingClientRectAsync()!!)
                scrollView.scrollTo(0, rect.top)
                setTimeout(fun(){
                    val systemInfo = uni_getSystemInfoSync()
                    var ratio: Number = 1
                    if (uni_getSystemInfoSync().platform == "android") {
                        ratio = uni_getSystemInfoSync().devicePixelRatio
                    }
                    val titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight
                    uni_getElementById("deep-overflow")!!.getBoundingClientRectAsync()!!.then(fun(afterRect: DOMRect){
                        this.jest_click_x = afterRect.x * ratio + 30
                        this.jest_click_y = (afterRect.top + titleBarHeight) * ratio + 30
                    }
                    )
                }
                , 200)
        })
    }
    open var jest_scrollToZIndexOverflow = ::gen_jest_scrollToZIndexOverflow_fn
    open fun gen_jest_scrollToZIndexOverflow_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                val scrollView = uni_getElementById("scroll-view") as UniScrollViewElement
                val rect = await(uni_getElementById("zindex-overflow")!!.getBoundingClientRectAsync()!!)
                scrollView.scrollTo(0, rect.top)
                setTimeout(fun(){
                    val systemInfo = uni_getSystemInfoSync()
                    var ratio: Number = 1
                    if (uni_getSystemInfoSync().platform == "android") {
                        ratio = uni_getSystemInfoSync().devicePixelRatio
                    }
                    val titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight
                    uni_getElementById("zindex-overflow")!!.getBoundingClientRectAsync()!!.then(fun(afterRect: DOMRect){
                        this.jest_click_x = afterRect.x * ratio + 30
                        this.jest_click_y = (afterRect.top + titleBarHeight) * ratio + 30
                    }
                    )
                }
                , 200)
        })
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
                return _uM("backgroundview" to _pS(_uM("width" to 300, "height" to 300, "marginBottom" to 20, "backgroundColor" to "#FFFFFF", "justifyContent" to "center", "alignItems" to "center")), "box-visible-border-radius" to _pS(_uM("width" to 100, "height" to 100, "borderTopLeftRadius" to 20, "borderTopRightRadius" to 20, "borderBottomRightRadius" to 20, "borderBottomLeftRadius" to 20, "overflow" to "visible", "backgroundColor" to "#008000")), "hover-class" to _pS(_uM("backgroundColor" to "#00FFFF")), "box" to _pS(_uM("width" to 1, "height" to 1, "overflow" to "visible")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
