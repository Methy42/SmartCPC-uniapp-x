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
import java.io.FileInputStream
import kotlin.properties.Delegates
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage
import io.dcloud.uniapp.extapi.compressImage as uni_compressImage
import io.dcloud.uniapp.extapi.getFileSystemManager as uni_getFileSystemManager
import io.dcloud.uniapp.extapi.getImageInfo as uni_getImageInfo
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPICompressImageCompressImage : BasePage {
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
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                    _cE("view", _uM("class" to "image-container"), _uA(
                        _cE("image", _uM("class" to "image", "src" to _ctx.beforeCompressPath, "mode" to "aspectFit"), null, 8, _uA(
                            "src"
                        )),
                        _cE("image", _uM("class" to "image", "src" to _ctx.afterCompressPath, "mode" to "aspectFit"), null, 8, _uA(
                            "src"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-title"), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), "压缩前图片信息")
                    )),
                    _cE("text", null, _tD(_ctx.beforeCompressImageInfo), 1),
                    _cE("view", _uM("class" to "uni-title"), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), "压缩后图片信息")
                    )),
                    _cE("text", null, _tD(_ctx.afterCompressImageInfo), 1),
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.chooseImage), "从相册中选取待压缩的图片", 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.compressImage), "压缩图片", 8, _uA(
                            "onClick"
                        ))
                    ))
                )),
                _cV(_component_input_data, _uM("defaultValue" to "80", "title" to "压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）", "type" to "number", "onConfirm" to _ctx.onQualityConfirm), null, 8, _uA(
                    "onConfirm"
                )),
                _cV(_component_input_data, _uM("title" to "压缩后图片的宽度，单位px", "type" to "string", "onConfirm" to _ctx.onCompressedWidthConfirm), null, 8, _uA(
                    "onConfirm"
                )),
                _cV(_component_input_data, _uM("title" to "压缩后图片的高度，单位px", "type" to "string", "onConfirm" to _ctx.onCompressedHeightConfirm), null, 8, _uA(
                    "onConfirm"
                )),
                _cV(_component_input_data, _uM("defaultValue" to "0", "title" to "旋转度数，范围0～360", "type" to "number", "onConfirm" to _ctx.onRotateConfirm), null, 8, _uA(
                    "onConfirm"
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var beforeCompressImageInfo: String by `$data`
    open var afterCompressImageInfo: String by `$data`
    open var beforeCompressPath: String by `$data`
    open var afterCompressPath: String by `$data`
    open var quality: Number by `$data`
    open var compressedWidth: Number? by `$data`
    open var compressedHeight: Number? by `$data`
    open var rotate: Number by `$data`
    open var imageInfoForTest: UTSJSONObject? by `$data`
    open var imageSrcForTest: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "compressImage", "beforeCompressImageInfo" to "", "afterCompressImageInfo" to "", "beforeCompressPath" to "", "afterCompressPath" to "", "quality" to 80, "compressedWidth" to null as Number?, "compressedHeight" to null as Number?, "rotate" to 0, "imageInfoForTest" to null as UTSJSONObject?, "imageSrcForTest" to "/static/test-image/logo.png")
    }
    open var compressImage = ::gen_compressImage_fn
    open fun gen_compressImage_fn() {
        if (this.beforeCompressPath == "") {
            uni_showToast(ShowToastOptions(title = "请先选择图片", icon = "error"))
            return
        }
        uni_showLoading(ShowLoadingOptions(title = "图片压缩中"))
        uni_compressImage(CompressImageOptions(src = this.beforeCompressPath, quality = this.quality, compressedWidth = this.compressedWidth, compressedHeight = this.compressedHeight, rotate = this.rotate, success = fun(res){
            console.log("compressImage success", JSON.stringify(res))
            this.afterCompressPath = res.tempFilePath
            uni_showToast(ShowToastOptions(title = "压缩成功", icon = null))
            uni_getImageInfo(GetImageInfoOptions(src = res.tempFilePath, success = fun(_res){
                this.afterCompressImageInfo = "图片宽度: " + _res.width + "\n图片高度: " + _res.height + "\n"
                val size = FileInputStream(res.tempFilePath.substring(7)).available() / 1024
                this.afterCompressImageInfo = this.afterCompressImageInfo.concat("图片大小: " + size + "KB")
            }
            ))
        }
        , fail = fun(err){
            uni_showModal(ShowModalOptions(title = "压缩图片失败", content = JSON.stringify(err), showCancel = false))
        }
        , complete = fun(_){
            uni_hideLoading()
        }
        ))
    }
    open var chooseImage = ::gen_chooseImage_fn
    open fun gen_chooseImage_fn() {
        uni_chooseImage(ChooseImageOptions(count = 1, sizeType = _uA(
            "original"
        ), sourceType = _uA(
            "album"
        ), success = fun(res){
            this.beforeCompressPath = res.tempFilePaths[0]
            uni_getImageInfo(GetImageInfoOptions(src = res.tempFilePaths[0], success = fun(_res){
                this.beforeCompressImageInfo = "图片宽度: " + _res.width + "\n图片高度: " + _res.height + "\n"
                val size = FileInputStream(res.tempFilePaths[0].substring(7)).available() / 1024
                this.beforeCompressImageInfo = this.beforeCompressImageInfo.concat("图片大小: " + size + "KB")
            }
            ))
        }
        ))
    }
    open var onQualityConfirm = ::gen_onQualityConfirm_fn
    open fun gen_onQualityConfirm_fn(value: Number) {
        this.quality = value
    }
    open var onCompressedWidthConfirm = ::gen_onCompressedWidthConfirm_fn
    open fun gen_onCompressedWidthConfirm_fn(value: String) {
        this.compressedWidth = parseInt(value)
    }
    open var onCompressedHeightConfirm = ::gen_onCompressedHeightConfirm_fn
    open fun gen_onCompressedHeightConfirm_fn(value: String) {
        this.compressedHeight = parseInt(value)
    }
    open var onRotateConfirm = ::gen_onRotateConfirm_fn
    open fun gen_onRotateConfirm_fn(value: Number) {
        this.rotate = value
    }
    open var testCompressImage = ::gen_testCompressImage_fn
    open fun gen_testCompressImage_fn() {
        uni_compressImage(CompressImageOptions(src = this.imageSrcForTest, quality = 50, compressedWidth = 100, compressedHeight = 100, success = fun(res){
            uni_getImageInfo(GetImageInfoOptions(src = res.tempFilePath, success = fun(_res){
                val fsm = uni_getFileSystemManager()
                fsm.getFileInfo(GetFileInfoOptions(filePath = this.imageSrcForTest, digestAlgorithm = null, success = fun(imageInfo){
                    fsm.getFileInfo(GetFileInfoOptions(filePath = res.tempFilePath, digestAlgorithm = null, success = fun(res){
                        this.imageInfoForTest = object : UTSJSONObject() {
                            var width = _res.width
                            var height = _res.height
                            var isSizeReduce = res.size < imageInfo.size
                        }
                    }
                    ))
                }
                ))
            }
            ))
        }
        , fail = fun(_){
            this.imageInfoForTest = null
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
                return _uM("image" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "image-container" to _pS(_uM("flexDirection" to "row")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
