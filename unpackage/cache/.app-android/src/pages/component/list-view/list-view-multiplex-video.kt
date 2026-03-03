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
open class GenPagesComponentListViewListViewMultiplexVideo : BasePage {
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
        return _cE("list-view", _uM("class" to "list", "onScrolltolower" to _ctx.onScrollTolower), _uA(
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.item_count, fun(_, index, __index, _cached): Any {
                return _cE("list-item", _uM("class" to "list-item"), _uA(
                    _cE("text", null, "第" + _tD(index + 1) + "个视频", 1),
                    _cE("video", _uM("class" to "video", "src" to _ctx.src, "controls" to true, "onPause" to _ctx.onPause), null, 40, _uA(
                        "src",
                        "onPause"
                    ))
                ))
            }
            ), 256)
        ), 40, _uA(
            "onScrolltolower"
        ))
    }
    open var item_count: Number by `$data`
    open var src: String by `$data`
    open var isTesting: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("item_count" to 10, "src" to "https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4", "isTesting" to false)
    }
    open var onPause = ::gen_onPause_fn
    open fun gen_onPause_fn(e: UniEvent) {
        console.log(JSON.stringify(e), " at pages/component/list-view/list-view-multiplex-video.uvue:27")
    }
    open var onScrollTolower = ::gen_onScrollTolower_fn
    open fun gen_onScrollTolower_fn(_0: ScrollToLowerEvent) {
        setTimeout(fun(){
            if (this.isTesting && this.item_count >= 10) {
                return
            }
            this.item_count += 10
        }
        , 300)
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
                return _uM("list" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "list-item" to _pS(_uM("backgroundColor" to "#FFFFFF", "marginBottom" to 30)), "video" to _pS(_uM("width" to "100%", "height" to 200)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
