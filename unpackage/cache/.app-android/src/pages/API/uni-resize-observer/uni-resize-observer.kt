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
open class GenPagesAPIUniResizeObserverUniResizeObserver : BasePage {
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
        onBackPress(fun(_: OnBackPressOptions): Boolean {
            if (this.resizeObserver != null) {
                this.resizeObserver!!.disconnect()
            }
            return false
        }
        , __ins)
        onReady(fun() {
            if (this.resizeObserver == null) {
                this.resizeObserver = UniResizeObserver(fun(entries: UTSArray<UniResizeObserverEntry>){
                    entries.forEach(fun(entry){
                        if (entry.target == this.outBoxElement) {
                            this.outBoxSizeInfo = this.analysisResizeObserverEntry(entry)
                            this.outBoxElementOnResize = true
                        } else if (entry.target == this.innerBoxElement) {
                            this.innerBoxSizeInfo = this.analysisResizeObserverEntry(entry)
                        }
                    }
                    )
                }
                )
                this.outBoxElement = uni_getElementById("outBox")
                if (this.outBoxElement != null) {
                    this.resizeObserver!!.observe(this.outBoxElement!!)
                }
                this.innerBoxElement = uni_getElementById("innerBox")
                if (this.innerBoxElement != null) {
                    this.resizeObserver!!.observe(this.innerBoxElement!!)
                }
                this.boxDisplay = true
            }
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", null, _uA(
            _cE("text", null, "点击蓝色或红色方块区域会修改元素宽高"),
            withDirectives(_cE("view", _uM("style" to _nS(_uM("align-items" to "center", "justify-content" to "center", "margin" to "10px"))), _uA(
                _cE("view", _uM("style" to _nS(_uM("width" to "140px", "height" to "140px", "background-color" to "blue", "align-items" to "center", "justify-content" to "center", "padding" to "5px")), "id" to "outBox", "onClick" to _ctx.outBoxClick), _uA(
                    _cE("view", _uM("style" to _nS(_uM("width" to "80px", "height" to "80px", "background-color" to "red", "padding" to "5px")), "id" to "innerBox", "onClick" to _ctx.innerBoxClick), null, 12, _uA(
                        "onClick"
                    ))
                ), 12, _uA(
                    "onClick"
                ))
            ), 4), _uA(
                _uA(
                    vShow,
                    _ctx.boxDisplay
                )
            )),
            _cE("button", _uM("onClick" to _ctx.revertBoxSize), "还原修改前元素宽高", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.toggleDisplay), _tD(if (_ctx.boxDisplay) {
                "隐藏元素"
            } else {
                "显示元素"
            }
            ), 9, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.cancelListen), "停止监听", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.goOnListen), "恢复监听", 8, _uA(
                "onClick"
            )),
            _cE("view", null, _uA(
                _cE("text", _uM("class" to "info-text"), "蓝色方块元素:"),
                _cE("view", _uM("class" to "info-item"), _uA(
                    _cE("text", _uM("class" to "info-text"), _tD(_ctx.outBoxSizeInfo), 1)
                )),
                _cE("text", _uM("class" to "info-text", "style" to _nS(_uM("margin-top" to "20px"))), "红色方块元素:", 4),
                _cE("view", _uM("class" to "info-item"), _uA(
                    _cE("text", _uM("class" to "info-text"), _tD(_ctx.innerBoxSizeInfo), 1)
                ))
            ))
        ))
    }
    open var outBoxSizeInfo: String by `$data`
    open var innerBoxSizeInfo: String by `$data`
    open var offset: Number by `$data`
    open var boxDisplay: Boolean by `$data`
    open var outBoxElement: UniElement? by `$data`
    open var innerBoxElement: UniElement? by `$data`
    open var resizeObserver: UniResizeObserver? by `$data`
    open var outBoxElementOnResize: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("outBoxSizeInfo" to "", "innerBoxSizeInfo" to "", "offset" to 2, "boxDisplay" to false, "outBoxElement" to null as UniElement?, "innerBoxElement" to null as UniElement?, "resizeObserver" to null as UniResizeObserver?, "outBoxElementOnResize" to false)
    }
    open var innerBoxClick = ::gen_innerBoxClick_fn
    open fun gen_innerBoxClick_fn() {
        if (this.innerBoxElement != null) {
            this.innerBoxElement!!.style.setProperty("width", this.innerBoxElement!!.offsetWidth + this.offset + "px")
            this.innerBoxElement!!.style.setProperty("height", this.innerBoxElement!!.offsetWidth + this.offset + "px")
        }
    }
    open var outBoxClick = ::gen_outBoxClick_fn
    open fun gen_outBoxClick_fn() {
        if (this.outBoxElement != null) {
            this.outBoxElement!!.style.setProperty("width", this.outBoxElement!!.offsetWidth + this.offset + "px")
            this.outBoxElement!!.style.setProperty("height", this.outBoxElement!!.offsetWidth + this.offset + "px")
        }
    }
    open var revertBoxSize = ::gen_revertBoxSize_fn
    open fun gen_revertBoxSize_fn() {
        if (this.outBoxElement != null) {
            this.outBoxElement!!.style.setProperty("width", "140px")
            this.outBoxElement!!.style.setProperty("height", "140px")
        }
        if (this.innerBoxElement != null) {
            this.innerBoxElement!!.style.setProperty("width", "80px")
            this.innerBoxElement!!.style.setProperty("height", "80px")
        }
    }
    open var setOutBoxMarginLeft = ::gen_setOutBoxMarginLeft_fn
    open fun gen_setOutBoxMarginLeft_fn(value: String) {
        if (this.outBoxElement != null) {
            this.outBoxElementOnResize = false
            this.outBoxElement!!.style.setProperty("margin-left", value)
        }
    }
    open var toggleDisplay = ::gen_toggleDisplay_fn
    open fun gen_toggleDisplay_fn() {
        this.boxDisplay = !this.boxDisplay
    }
    open var analysisResizeObserverEntry = ::gen_analysisResizeObserverEntry_fn
    open fun gen_analysisResizeObserverEntry_fn(entry: UniResizeObserverEntry): String {
        val contentBoxSize = entry.contentBoxSize[0]
        val borderBoxSize = entry.borderBoxSize[0]
        val devicePixelContentBoxSize = entry.devicePixelContentBoxSize[0]
        return "borderBoxSize: \n{blockSize:" + borderBoxSize.blockSize + ", inlineSize:" + borderBoxSize.inlineSize + "}\n" + "contentBoxSize: \n{blockSize:" + contentBoxSize.blockSize + ", inlineSize:" + contentBoxSize.inlineSize + "}\n" + "devicePixelContentBoxSize: \n{blockSize:" + devicePixelContentBoxSize.blockSize + ", inlineSize:" + devicePixelContentBoxSize.inlineSize + "}\n" + "contentRect: \n{x:" + entry.contentRect.x + ", y:" + entry.contentRect.y + ", width:" + entry.contentRect.width + ", height:" + entry.contentRect.height + "}"
    }
    open var cancelListen = ::gen_cancelListen_fn
    open fun gen_cancelListen_fn() {
        this.resizeObserver!!.unobserve(this.outBoxElement!!)
        this.resizeObserver!!.unobserve(this.innerBoxElement!!)
    }
    open var goOnListen = ::gen_goOnListen_fn
    open fun gen_goOnListen_fn() {
        this.resizeObserver!!.observe(this.outBoxElement!!)
        this.resizeObserver!!.observe(this.innerBoxElement!!)
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
                return _uM("info-item" to _pS(_uM("flexDirection" to "row")), "info-text" to _pS(_uM("fontSize" to 14)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
