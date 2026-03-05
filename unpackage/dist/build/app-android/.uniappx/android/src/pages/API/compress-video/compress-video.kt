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
import io.dcloud.uniapp.extapi.chooseVideo as uni_chooseVideo
import io.dcloud.uniapp.extapi.compressVideo as uni_compressVideo
import io.dcloud.uniapp.extapi.getVideoInfo as uni_getVideoInfo
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPICompressVideoCompressVideo : BasePage {
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
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass)
        val _component_slider = resolveComponent("slider")
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", null, _uA(
                _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                    _cE("video", _uM("class" to "video", "src" to _ctx.beforeCompressPath, "controls" to true, "poster" to _ctx.beforeCoverImagePath), null, 8, _uA(
                        "src",
                        "poster"
                    )),
                    _cE("view", _uM("class" to "uni-title"), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), "压缩前视频信息")
                    )),
                    _cE("text", null, _tD(_ctx.beforeCompressVideoInfo), 1),
                    _cE("video", _uM("class" to "video", "src" to _ctx.afterCompressPath, "controls" to true, "poster" to _ctx.afterCoverImagePath), null, 8, _uA(
                        "src",
                        "poster"
                    )),
                    _cE("view", _uM("class" to "uni-title"), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), "压缩后视频信息")
                    )),
                    _cE("text", null, _tD(_ctx.afterCompressVideoInfo), 1),
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.chooseVideo), "从相册中选取待压缩的视频", 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.compressVideo), "压缩视频", 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cV(_component_enum_data, _uM("title" to "压缩质量", "items" to _ctx.qualityItemTypes, "onChange" to _ctx.onQualityChange), null, 8, _uA(
                        "items",
                        "onChange"
                    )),
                    _cE("view", _uM("class" to "uni-common-mt"), _uA(
                        _cE("text", _uM("class" to "uni-title uni-title-text"), "相对于原视频的分辨率比例，取值范围(0, 1]"),
                        _cV(_component_slider, _uM("min" to 0.1, "max" to 1, "step" to 0.1, "show-value" to true, "onChange" to _ctx.onResolutionChange), null, 8, _uA(
                            "onChange"
                        ))
                    ))
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var beforeCompressVideoInfo: String by `$data`
    open var afterCompressVideoInfo: String by `$data`
    open var beforeCompressPath: String by `$data`
    open var afterCompressPath: String by `$data`
    open var beforeCoverImagePath: String by `$data`
    open var afterCoverImagePath: String by `$data`
    open var quality: String? by `$data`
    open var bitrate: Number? by `$data`
    open var fps: Number? by `$data`
    open var resolution: Number? by `$data`
    open var qualityItemTypes: UTSArray<ItemType> by `$data`
    open var qualityItems: UTSArray<String> by `$data`
    open var videoInfoForTest: VideoInfoForTest? by `$data`
    open var videoSrcForTest: String by `$data`
    open var videoSrcForTestWidth: Number by `$data`
    open var videoSrcForTestHeight: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "compressVideo", "beforeCompressVideoInfo" to "", "afterCompressVideoInfo" to "", "beforeCompressPath" to "", "afterCompressPath" to "", "beforeCoverImagePath" to "", "afterCoverImagePath" to "", "quality" to null as String?, "bitrate" to null as Number?, "fps" to null as Number?, "resolution" to null as Number?, "qualityItemTypes" to _uA<ItemType>(ItemType(value = 0, name = "low(低)"), ItemType(value = 1, name = "medium(中)"), ItemType(value = 2, name = "high(高)")), "qualityItems" to _uA(
            "low",
            "medium",
            "high"
        ), "videoInfoForTest" to null as VideoInfoForTest?, "videoSrcForTest" to "/static/test-video/10second-demo.mp4", "videoSrcForTestWidth" to 0, "videoSrcForTestHeight" to 0)
    }
    open var compressVideo = ::gen_compressVideo_fn
    open fun gen_compressVideo_fn() {
        if (this.beforeCompressPath == "") {
            uni_showToast(ShowToastOptions(title = "请先选择视频", icon = "error"))
            return
        }
        uni_showLoading(ShowLoadingOptions(title = "视频压缩中"))
        uni_compressVideo(CompressVideoOptions(src = this.beforeCompressPath, quality = this.quality, resolution = this.resolution, success = fun(res){
            console.log("compressVideo success", JSON.stringify(res))
            this.afterCompressPath = res.tempFilePath
            uni_showToast(ShowToastOptions(title = "压缩成功", icon = null))
            uni_getVideoInfo(GetVideoInfoOptions(src = res.tempFilePath, success = fun(_res){
                this.afterCompressVideoInfo = "视频画面方向: " + _res.orientation + "\n视频格式: " + _res.type + "\n视频长度: " + _res.duration + "s\n视频大小: " + _res.size + "KB\n视频宽度: " + _res.width + "\n视频高度: " + _res.height + "\n视频帧率: " + _res.fps + "fps\n视频码率: " + _res.bitrate + "kbps"
                this.afterCompressVideoInfo = this.afterCompressVideoInfo + ("\n视频字节大小: " + _res.byteSize + "B\n视频首帧图片路径: " + _res.thumbTempFilePath)
                if (_res.thumbTempFilePath != null) {
                    this.afterCoverImagePath = _res.thumbTempFilePath!!
                }
            }
            ))
        }
        , fail = fun(err){
            uni_showModal(ShowModalOptions(title = "压缩视频失败", content = JSON.stringify(err), showCancel = false))
        }
        , complete = fun(_){
            uni_hideLoading()
        }
        ))
    }
    open var chooseVideo = ::gen_chooseVideo_fn
    open fun gen_chooseVideo_fn() {
        uni_chooseVideo(ChooseVideoOptions(sourceType = _uA(
            "album"
        ), compressed = false, success = fun(res){
            this.beforeCompressPath = res.tempFilePath
            uni_getVideoInfo(GetVideoInfoOptions(src = res.tempFilePath, success = fun(_res){
                this.beforeCompressVideoInfo = "视频画面方向: " + _res.orientation + "\n视频格式: " + _res.type + "\n视频长度: " + _res.duration + "s\n视频大小: " + _res.size + "KB\n视频宽度: " + _res.width + "\n视频高度: " + _res.height + "\n视频帧率: " + _res.fps + "fps\n视频码率: " + _res.bitrate + "kbps"
                this.beforeCompressVideoInfo = this.beforeCompressVideoInfo + ("\n视频字节大小: " + _res.byteSize + "B\n视频首帧图片路径: " + _res.thumbTempFilePath)
                if (_res.thumbTempFilePath != null) {
                    this.beforeCoverImagePath = _res.thumbTempFilePath!!
                }
            }
            ))
        }
        ))
    }
    open var onQualityChange = ::gen_onQualityChange_fn
    open fun gen_onQualityChange_fn(value: Number) {
        this.quality = this.qualityItems[value]
    }
    open var onResolutionChange = ::gen_onResolutionChange_fn
    open fun gen_onResolutionChange_fn(event: UniSliderChangeEvent) {
        this.resolution = event.detail.value
    }
    open var testCompressVideo = ::gen_testCompressVideo_fn
    open fun gen_testCompressVideo_fn() {
        var beforeCompressSize: Number
        var afterComoressSize: Number
        uni_compressVideo(CompressVideoOptions(src = this.videoSrcForTest, quality = "medium", success = fun(res){
            uni_getVideoInfo(GetVideoInfoOptions(src = this.videoSrcForTest, success = fun(_res){
                beforeCompressSize = Math.trunc(_res.size)
                this.videoSrcForTestWidth = _res.width
                this.videoSrcForTestHeight = _res.height
                uni_getVideoInfo(GetVideoInfoOptions(src = res.tempFilePath, success = fun(__res){
                    afterComoressSize = Math.trunc(__res.size)
                    this.videoInfoForTest = VideoInfoForTest(width = __res.width, height = __res.height, isSizeReduce = afterComoressSize < beforeCompressSize)
                }
                , fail = fun(err) {
                    console.log(">>>>>> 压缩失败", err.errMsg)
                }
                ))
            }
            ))
        }
        , fail = fun(_){
            this.videoInfoForTest = null
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
                return _uM("video" to _pS(_uM("alignSelf" to "center")), "image-container" to _pS(_uM("flexDirection" to "row")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
