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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
open class GenPagesComponentImageImage : BasePage {
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
        return _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE("view", _uM("class" to "uni-center", "style" to _nS(_uM("background" to "#FFFFFF"))), _uA(
                    _cE("image", _uM("class" to "image", "fade-show" to true, "mode" to "widthFix", "src" to _ctx.imageSrc, "onError" to _ctx.error, "onLoad" to _ctx.load), null, 40, _uA(
                        "src",
                        "onError",
                        "onLoad"
                    ))
                ), 4),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.imageFormat), "图片格式示例", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.imageMode), "图片缩放模式示例", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.imagePath), "图片路径示例", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.imageLarge), "大图示例", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.imageLong), "长图示例", 8, _uA(
                        "onClick"
                    ))
                ))
            )),
            if (isTrue(_ctx.autoTest)) {
                _cE("view", _uM("key" to 0), _uA(
                    _cE("image", _uM("src" to _ctx.setCookieImage), null, 8, _uA(
                        "src"
                    )),
                    _cE("image", _uM("src" to _ctx.verifyCookieImage, "onError" to _ctx.error), null, 40, _uA(
                        "src",
                        "onError"
                    ))
                ))
            } else {
                _cC("v-if", true)
            }
        ), 4)
    }
    open var title: String by `$data`
    open var imageSrc: String by `$data`
    open var loadError: Boolean by `$data`
    open var autoTest: Boolean by `$data`
    open var setCookieImage: String by `$data`
    open var verifyCookieImage: String by `$data`
    open var eventLoad: UTSJSONObject? by `$data`
    open var eventError: UTSJSONObject? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "image", "imageSrc" to "/static/test-image/logo.png" as String, "loadError" to false, "autoTest" to false, "setCookieImage" to "", "verifyCookieImage" to "", "eventLoad" to null as UTSJSONObject?, "eventError" to null as UTSJSONObject?)
    }
    open var error = ::gen_error_fn
    open fun gen_error_fn(event: ImageErrorEvent) {
        this.loadError = true
        console.log(event.type, event.detail)
        if (this.autoTest) {
            this.eventError = object : UTSJSONObject() {
                var tagName = event.target?.tagName
                var type = event.type
            }
        }
    }
    open var load = ::gen_load_fn
    open fun gen_load_fn(event: ImageLoadEvent) {
        console.log(event.type, event.detail)
        if (this.autoTest) {
            this.eventLoad = object : UTSJSONObject() {
                var tagName = event.target?.tagName
                var type = event.type
                var width = event.detail.width
                var height = event.detail.height
            }
        }
    }
    open var imageFormat = ::gen_imageFormat_fn
    open fun gen_imageFormat_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/image/image-format"))
    }
    open var imageMode = ::gen_imageMode_fn
    open fun gen_imageMode_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/image/image-mode"))
    }
    open var imagePath = ::gen_imagePath_fn
    open fun gen_imagePath_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/image/image-path"))
    }
    open var imageLarge = ::gen_imageLarge_fn
    open fun gen_imageLarge_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/image/image-large"))
    }
    open var imageLong = ::gen_imageLong_fn
    open fun gen_imageLong_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/image/image-long"))
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
                return _uM("image" to _pS(_uM("marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto", "width" to 100)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
