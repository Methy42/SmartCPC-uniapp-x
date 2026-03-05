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
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage
import io.dcloud.uniapp.extapi.getImageInfo as uni_getImageInfo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showModal as uni_showModal
open class GenPagesAPIGetImageInfoGetImageInfo : BasePage {
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
            uni_getImageInfo(GetImageInfoOptions(src = this.relativeImagePath, success = fun(res){
                console.log("getImageInfo success", JSON.stringify(res), " at pages/API/get-image-info/get-image-info.uvue:74")
                this.absoluteImageInfo = "图片宽度: " + res.width + "\n图片高度: " + res.height + "\n图片路径: " + res.path + "\n图片方向: " + res.orientation + "\n图片格式: " + res.type
                this.imageInfoForTest = object : UTSJSONObject() {
                    var width = res.width
                    var height = res.height
                    var path = res.path.slice(res.path.indexOf("static/") + 7)
                    var orientation = res.orientation
                    var type = res.type
                }
            }
            , fail = fun(err){
                uni_showModal(ShowModalOptions(title = "获取图片信息失败", content = JSON.stringify(err), showCancel = false))
                this.imageInfoForTest = null
            }
            ))
            uni_getImageInfo(GetImageInfoOptions(src = this.remoteImagePath, success = fun(res){
                console.log("getImageInfo success", JSON.stringify(res), " at pages/API/get-image-info/get-image-info.uvue:96")
                this.remoteImageInfo = "图片宽度: " + res.width + "\n图片高度: " + res.height + "\n图片路径: " + res.path + "\n图片方向: " + res.orientation + "\n图片格式: " + res.type
            }
            , fail = fun(err){
                uni_showModal(ShowModalOptions(title = "获取图片信息失败", content = JSON.stringify(err), showCancel = false))
            }
            ))
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
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-subtitle-text"), "获取本地相对路径图片信息")
                )),
                _cE("image", _uM("class" to "image", "src" to _ctx.relativeImagePath, "mode" to "aspectFit"), null, 8, _uA(
                    "src"
                )),
                _cE("text", _uM("class" to "margin-top-10"), _tD(_ctx.absoluteImageInfo), 1),
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-subtitle-text"), "获取网络路径图片信息")
                )),
                _cE("image", _uM("class" to "image", "src" to _ctx.remoteImagePath, "mode" to "aspectFit"), null, 8, _uA(
                    "src"
                )),
                _cE("text", _uM("class" to "margin-top-10"), _tD(_ctx.remoteImageInfo), 1),
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-subtitle-text"), "获取本地绝对路径图片信息")
                )),
                _cE("image", _uM("class" to "image", "src" to _ctx.absoluteImagePath, "mode" to "aspectFit"), null, 8, _uA(
                    "src"
                )),
                _cE("text", _uM("class" to "margin-top-10"), _tD(_ctx.relativeImageInfo), 1),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.chooseImage), "拍摄照片或从相册中选择照片", 8, _uA(
                        "onClick"
                    ))
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var relativeImagePath: String by `$data`
    open var relativeImageInfo: String by `$data`
    open var absoluteImagePath: String by `$data`
    open var absoluteImageInfo: String by `$data`
    open var remoteImagePath: String by `$data`
    open var remoteImageInfo: String by `$data`
    open var imageInfoForTest: UTSJSONObject? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "getImageInfo", "relativeImagePath" to "/static/test-image/logo.png", "relativeImageInfo" to "", "absoluteImagePath" to "", "absoluteImageInfo" to "", "remoteImagePath" to "https://request.dcloud.net.cn/api/http/contentType/image/png", "remoteImageInfo" to "", "imageInfoForTest" to null as UTSJSONObject?)
    }
    open var chooseImage = ::gen_chooseImage_fn
    open fun gen_chooseImage_fn() {
        uni_chooseImage(ChooseImageOptions(count = 1, success = fun(res){
            this.absoluteImagePath = res.tempFilePaths[0]
            uni_getImageInfo(GetImageInfoOptions(src = res.tempFilePaths[0], success = fun(_res){
                console.log("getImageInfo success", JSON.stringify(_res), " at pages/API/get-image-info/get-image-info.uvue:55")
                this.relativeImageInfo = "图片宽度: " + _res.width + "\n图片高度: " + _res.height + "\n图片路径: " + _res.path + "\n图片方向: " + _res.orientation + "\n图片格式: " + _res.type
            }
            , fail = fun(err){
                uni_showModal(ShowModalOptions(title = "获取图片信息失败", content = JSON.stringify(err), showCancel = false))
            }
            ))
        }
        ))
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
                return _uM("image" to _pS(_uM("alignSelf" to "center")), "margin-top-10" to _pS(_uM("marginTop" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
