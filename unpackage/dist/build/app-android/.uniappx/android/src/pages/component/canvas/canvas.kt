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
import io.dcloud.uniapp.extapi.`$off` as uni__off
import io.dcloud.uniapp.extapi.`$on` as uni__on
import io.dcloud.uniapp.extapi.createCanvasContextAsync as uni_createCanvasContextAsync
open class GenPagesComponentCanvasCanvas : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            uni_createCanvasContextAsync(CreateCanvasContextAsyncOptions(id = "canvas", component = this, success = fun(context: CanvasContext){
                this.canvasContext = context
                this.renderingContext = context.getContext("2d")!!
                this.canvas = this.renderingContext!!.canvas
                hidpi(this.canvas!!)
                this.canvasWidth = this.canvas!!.width
                this.canvasHeight = this.canvas!!.height
                setTimeout(fun(){
                    this.testToDataURLResult = this.canvasContext!!.toDataURL().startsWith("data:image/png;base64")
                }
                , 50)
                this.testCanvasContext = true
            }
            ))
            uni__on("canvasChildReady", this.onChildReady)
        }
        , __ins)
        onReady(fun() {}, __ins)
        onUnload(fun() {
            uni__off("canvasChildReady", this.onChildReady)
            if (this.taskId > 0) {
                this.stopAnimationFrame()
            }
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_navigator = resolveComponent("navigator")
        val _component_canvas_child = resolveComponent("canvas-child")
        return _cE("view", _uM("class" to "page", "id" to "page-canvas"), _uA(
            _cE("canvas", _uM("id" to "canvas", "class" to "canvas-element")),
            _cE("scroll-view", _uM("class" to "scroll-view"), _uA(
                _cE("button", _uM("class" to "canvas-drawing-button", "id" to "toDataURL", "onClick" to _ctx.canvasToDataURL), "canvasToDataURL", 8, _uA(
                    "onClick"
                )),
                if (_ctx.dataBase64.length > 0) {
                    _cE("view", _uM("key" to 0, "class" to "text-group"), _uA(
                        _cE("text", null, "canvasToDataURL:"),
                        _cE("text", null, _tD(_ctx.dataBase64.slice(0, 22)) + "...", 1)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                _cE("button", _uM("onClick" to _ctx.onCreateImage), "createImage", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("onClick" to _ctx.onCreatePath2D), "createPath2D", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("onClick" to _ctx.startAnimationFrame), "requestAnimationFrame", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("onClick" to _ctx.stopAnimationFrame), "cancelAnimationFrame", 8, _uA(
                    "onClick"
                )),
                _cE("view", _uM("style" to _nS(_uM("padding" to "8px 10px"))), "CanvasContext API 演示", 4),
                _cV(_component_navigator, _uM("url" to "./canvas-context"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return _uA(
                        _cE("button", null, "CanvasContext API")
                    )
                }
                ), "_" to 1)),
                _cE("view", _uM("class" to "text-group"), _uA(
                    _cE("text", null, "获取 CanvasContext 结果："),
                    _cE("text", _uM("id" to "testCanvasContext"), _tD(_ctx.testCanvasContext), 1)
                )),
                _cE("view", _uM("class" to "text-group"), _uA(
                    _cE("text", null, "测试 ToDataURL 结果："),
                    _cE("text", _uM("id" to "testToDataURLResult"), _tD(_ctx.testToDataURLResult), 1)
                )),
                _cE("view", _uM("class" to "text-group"), _uA(
                    _cE("text", null, "测试 createImage 结果："),
                    _cE("text", _uM("id" to "testCreateImage"), _tD(_ctx.testCreateImage), 1)
                )),
                _cE("view", _uM("class" to "text-group"), _uA(
                    _cE("text", null, "测试 createPath2D 结果："),
                    _cE("text", _uM("id" to "testCreatePath2D"), _tD(_ctx.testCreatePath2D), 1)
                )),
                _cE("view", _uM("class" to "text-group"), _uA(
                    _cE("text", null, "测试 createCanvasContextAsync 结果："),
                    _cE("view", _uM("onClick" to _ctx.testCreateContextAsync, "id" to "createCanvasContextAsync"), _tD(_ctx.testCanvasCtx), 9, _uA(
                        "onClick"
                    ))
                )),
                _cV(_component_canvas_child, _uM("ref" to "canvas-child"), null, 512)
            ))
        ))
    }
    open var title: String by `$data`
    open var canvas: UniCanvasElement? by `$data`
    open var canvasContext: CanvasContext? by `$data`
    open var renderingContext: CanvasRenderingContext2D? by `$data`
    open var canvasWidth: Number by `$data`
    open var canvasHeight: Number by `$data`
    open var dataBase64: String by `$data`
    open var taskId: Number by `$data`
    open var lastTime: Number by `$data`
    open var frameCount: Number by `$data`
    open var testCanvasContext: Boolean by `$data`
    open var testToBlobResult: Boolean by `$data`
    open var testToDataURLResult: Boolean by `$data`
    open var testCreateImage: Boolean by `$data`
    open var testCreatePath2D: Boolean by `$data`
    open var testFrameCount: Number by `$data`
    open var testCanvasCtx1: Boolean by `$data`
    open var testCanvasCtx2: Boolean by `$data`
    open var testCounter: Number by `$data`
    open var testCanvasCtx: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "Context2D", "canvas" to null as UniCanvasElement?, "canvasContext" to null as CanvasContext?, "renderingContext" to null as CanvasRenderingContext2D?, "canvasWidth" to 0, "canvasHeight" to 0, "dataBase64" to "", "taskId" to 0, "lastTime" to 0, "frameCount" to 0, "testCanvasContext" to false, "testToBlobResult" to false, "testToDataURLResult" to false, "testCreateImage" to false, "testCreatePath2D" to false, "testFrameCount" to 0, "testCanvasCtx1" to false, "testCanvasCtx2" to false, "testCounter" to 0, "testCanvasCtx" to computed<Boolean>(fun(): Boolean {
            return this.testCanvasCtx1 && this.testCanvasCtx2
        }
        ))
    }
    open var canvasToDataURL = ::gen_canvasToDataURL_fn
    open fun gen_canvasToDataURL_fn() {
        this.dataBase64 = this.canvasContext!!.toDataURL()
    }
    open var onCreateImage = ::gen_onCreateImage_fn
    open fun gen_onCreateImage_fn() {
        this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight)
        var image = this.canvasContext!!.createImage()
        image.src = "/static/logo.png"
        image.onload = fun(){
            this.testCreateImage = true
            this.renderingContext?.drawImage(image, 0, 0, 100, 100)
        }
    }
    open var onCreatePath2D = ::gen_onCreatePath2D_fn
    open fun gen_onCreatePath2D_fn() {
        this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight)
        val context = this.renderingContext!!
        var path2D = this.canvasContext!!.createPath2D()
        this.testCreatePath2D = true
        val amplitude: Number = 64
        val wavelength: Number = 64
        run {
            var i: Number = 0
            while(i < 5){
                val x1 = 0 + (i * wavelength)
                val y1: Number = 128
                val x2 = x1 + wavelength / 4
                val y2 = y1 - amplitude
                val x3 = x1 + 3 * wavelength / 4
                val y3 = y1 + amplitude
                val x4 = x1 + wavelength
                val y4 = y1
                context.moveTo(x1, y1)
                path2D.bezierCurveTo(x2, y2, x3, y3, x4, y4)
                i++
            }
        }
        context.stroke(path2D)
    }
    open var startAnimationFrame = ::gen_startAnimationFrame_fn
    open fun gen_startAnimationFrame_fn() {
        this.taskId = this.canvasContext!!.requestAnimationFrame(fun(timestamp: Number){
            this.testFrameCount++
            this.updateFPS(timestamp)
            this.startAnimationFrame()
        }
        )
    }
    open var stopAnimationFrame = ::gen_stopAnimationFrame_fn
    open fun gen_stopAnimationFrame_fn() {
        this.canvasContext!!.cancelAnimationFrame(this.taskId)
        this.taskId = 0
    }
    open var updateFPS = ::gen_updateFPS_fn
    open fun gen_updateFPS_fn(timestamp: Number) {
        this.frameCount++
        if (timestamp - this.lastTime >= 1000) {
            val timeOfFrame = ((1000 as Number) / this.frameCount)
            this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight)
            this.renderingContext!!.fillText("" + this.frameCount + " / " + timeOfFrame.toFixed(3) + "ms", 10, 18)
            this.frameCount = 0
            this.lastTime = timestamp
        }
    }
    open var testCreateContextAsync = ::gen_testCreateContextAsync_fn
    open fun gen_testCreateContextAsync_fn() {
        uni_createCanvasContextAsync(CreateCanvasContextAsyncOptions(id = "canvas", component = this, success = fun(_){
            this.testCanvasCtx1 = true
        }
        ))
        uni_createCanvasContextAsync(CreateCanvasContextAsyncOptions(id = "canvas", success = fun(_){
            this.testCanvasCtx2 = true
        }
        ))
    }
    open var onChildReady = ::gen_onChildReady_fn
    open fun gen_onChildReady_fn() {
        val childInstance = (this.`$refs`["canvas-child"] as ComponentPublicInstance)
        this.testCounter = childInstance.`$data`["testCounter"] as Number
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
                return _uM("page" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "height" to "100%", "overflow" to "hidden")), "scroll-view" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "canvas-element" to _pS(_uM("width" to "100%", "height" to 250, "backgroundColor" to "#ffffff")), "btn-to-image" to _pS(_uM("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "text-group" to _pS(_uM("display" to "flex", "flexDirection" to "row", "flexWrap" to "nowrap", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to 8, "paddingRight" to 10, "paddingBottom" to 8, "paddingLeft" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM("CanvasChild" to GenPagesComponentCanvasCanvasChildClass)
    }
}
