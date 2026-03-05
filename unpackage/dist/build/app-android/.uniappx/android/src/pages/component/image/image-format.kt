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
open class GenPagesComponentImageImageFormat : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.supportFormats, fun(item, index, __index, _cached): Any {
                    return _cE("view", _uM("key" to index), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), _tD(item.format), 1),
                        _cE("view", _uM("class" to "uni-center", "style" to _nS(_uM("background" to "#FFFFFF"))), _uA(
                            _cE("image", _uM("class" to "image", "mode" to "widthFix", "src" to if (item.errorImage == null) {
                                item.src
                            } else {
                                item.errorImage
                            }
                            , "onError" to fun(`$event`: Any){
                                _ctx.imageErrorEvent(index, `$event` as ImageErrorEvent)
                            }
                            ), null, 40, _uA(
                                "src",
                                "onError"
                            ))
                        ), 4)
                    ))
                }
                ), 128)
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var supportFormats: UTSArray<ImageFormat> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "image-format", "supportFormats" to _uA<ImageFormat>(ImageFormat(format = "bmp", src = "/static/test-image/logo.bmp"), ImageFormat(format = "gif", src = "/static/test-image/logo.gif"), ImageFormat(format = "ico", src = "/static/test-image/logo.ico"), ImageFormat(format = "jpg", src = "/static/test-image/logo.jpg"), ImageFormat(format = "png", src = "/static/test-image/logo.png"), ImageFormat(format = "webp", src = "/static/test-image/logo.webp"), ImageFormat(format = "heic（App-Android10+支持）", src = "/static/test-image/logo.heic"), ImageFormat(format = "avif（仅部分浏览器支持）", src = "/static/test-image/logo.avif"), ImageFormat(format = "tif（仅部分浏览器支持）", src = "/static/test-image/logo.tif"), ImageFormat(format = "svg", src = "/static/test-image/logo.svg"), ImageFormat(format = "svg网络路径", src = "https://dev.w3.org/SVG/tools/svgweb/samples/svg-files/w3c.svg")))
    }
    open var imageErrorEvent = ::gen_imageErrorEvent_fn
    open fun gen_imageErrorEvent_fn(index: Number, e: ImageErrorEvent) {
        console.log("图片加载错误", e.detail)
        this.supportFormats[index].errorImage = "/static/template/drop-card/dislike.png"
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
                return _uM("image" to _pS(_uM("marginTop" to 40, "marginRight" to "auto", "marginBottom" to 40, "marginLeft" to "auto", "width" to 100)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
