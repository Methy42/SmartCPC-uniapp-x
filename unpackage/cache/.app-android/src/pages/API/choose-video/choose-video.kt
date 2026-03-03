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
import io.dcloud.uniapp.extapi.getVideoInfo as uni_getVideoInfo
import io.dcloud.uniapp.extapi.showModal as uni_showModal
open class GenPagesAPIChooseVideoChooseVideo : BasePage {
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
        onPageHide(fun() {
            console.log("Page Hide", " at pages/API/choose-video/choose-video.uvue:63")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass)
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass)
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("video", _uM("class" to "video", "src" to _ctx.src, "controls" to true, "poster" to _ctx.videoCoverImage), null, 8, _uA(
                    "src",
                    "poster"
                )),
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-subtitle-text"), "视频信息")
                )),
                _cE("text", null, _tD(_ctx.videoInfo), 1),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.chooseVideo), "选取视频", 8, _uA(
                        "onClick"
                    ))
                )),
                _cV(_component_enum_data, _uM("title" to "视频来源", "items" to _ctx.sourceTypeItemTypes, "onChange" to _ctx.onSourceTypeChange), null, 8, _uA(
                    "items",
                    "onChange"
                )),
                _cV(_component_enum_data, _uM("title" to "屏幕方向", "items" to _ctx.orientationTypeItemTypes, "onChange" to _ctx.onOrientationTypeChange), null, 8, _uA(
                    "items",
                    "onChange"
                )),
                _cV(_component_enum_data, _uM("title" to "摄像头", "items" to _ctx.cameraItemTypes, "onChange" to _ctx.onCameraChange), null, 8, _uA(
                    "items",
                    "onChange"
                )),
                _cV(_component_enum_data, _uM("title" to "相册模式", "items" to _ctx.albumModeTypes, "onChange" to _ctx.onAlbumModeChange), null, 8, _uA(
                    "items",
                    "onChange"
                ))
            )),
            _cV(_component_input_data, _uM("title" to "最长拍摄时间，单位秒", "defaultValue" to "60", "type" to "number", "onConfirm" to _ctx.onMaxDurationConfirm), null, 8, _uA(
                "onConfirm"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cV(_component_boolean_data, _uM("title" to "是否压缩（HamonyOS 不支持，推荐使用 uni.compressVideo 进行压缩）", "defaultValue" to true, "onChange" to _ctx.onCompressedChange), null, 8, _uA(
                    "onChange"
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var src: String by `$data`
    open var orientationTypeItemTypes: UTSArray<ItemType> by `$data`
    open var sourceTypeItemTypes: UTSArray<ItemType> by `$data`
    open var sourceTypeItems: UTSArray<UTSArray<Source>> by `$data`
    open var cameraItemTypes: UTSArray<ItemType> by `$data`
    open var albumModeTypes: UTSArray<ItemType> by `$data`
    open var albumModeTypeItems: UTSArray<String> by `$data`
    open var cameraItems: UTSArray<Camera> by `$data`
    open var sourceType: UTSArray<Source> by `$data`
    open var orientationType: String by `$data`
    open var orientationTypeItems: UTSArray<String> by `$data`
    open var compressed: Boolean by `$data`
    open var maxDuration: Number by `$data`
    open var camera: Camera by `$data`
    open var videoInfo: String by `$data`
    open var videoCoverImage: String by `$data`
    open var albumMode: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "chooseVideo", "src" to "", "orientationTypeItemTypes" to _uA<ItemType>(ItemType(value = 0, name = "竖屏"), ItemType(value = 1, name = "横屏"), ItemType(value = 2, name = "自动")), "sourceTypeItemTypes" to _uA<ItemType>(ItemType(value = 0, name = "从相册中选择视频"), ItemType(value = 1, name = "拍摄视频"), ItemType(value = 2, name = "从相册中选择视频或拍摄视频")), "sourceTypeItems" to _uA<UTSArray<Source>>(_uA(
            "album"
        ), _uA(
            "camera"
        ), _uA(
            "album",
            "camera"
        )), "cameraItemTypes" to _uA<ItemType>(ItemType(value = 0, name = "后置摄像头"), ItemType(value = 1, name = "前置摄像头")), "albumModeTypes" to _uA<ItemType>(ItemType(value = 0, name = "自定义视频选择器"), ItemType(value = 1, name = "系统视频选择器")), "albumModeTypeItems" to _uA(
            "custom",
            "system"
        ), "cameraItems" to _uA<Camera>("back", "front"), "sourceType" to _uA<Source>("album", "camera"), "orientationType" to "portrait", "orientationTypeItems" to _uA(
            "portrait",
            "landscape",
            "auto"
        ), "compressed" to true, "maxDuration" to 60, "camera" to "back" as Camera, "videoInfo" to "", "videoCoverImage" to "", "albumMode" to "custom")
    }
    open var chooseVideo = ::gen_chooseVideo_fn
    open fun gen_chooseVideo_fn() {
        uni_chooseVideo(ChooseVideoOptions(sourceType = this.sourceType, compressed = this.compressed, pageOrientation = this.orientationType, maxDuration = this.maxDuration, albumMode = this.albumMode, camera = this.camera, success = fun(res){
            console.log("chooseVideo success", JSON.stringify(res), " at pages/API/choose-video/choose-video.uvue:79")
            this.src = res.tempFilePath
            this.videoInfo = "视频长度: " + res.duration + "s\n视频大小: " + Math.ceil(res.size) + "KB\n视频宽度: " + res.width + "\n视频高度: " + res.height + "\n"
            uni_getVideoInfo(GetVideoInfoOptions(src = res.tempFilePath, success = fun(_res){
                if (_res.thumbTempFilePath != null) {
                    this.videoCoverImage = _res.thumbTempFilePath!!
                }
            }
            ))
        }
        , fail = fun(err){
            uni_showModal(ShowModalOptions(title = "选择视频失败", content = JSON.stringify(err), showCancel = false))
        }
        ))
    }
    open var onOrientationTypeChange = ::gen_onOrientationTypeChange_fn
    open fun gen_onOrientationTypeChange_fn(value: Number) {
        this.orientationType = this.orientationTypeItems[value]
    }
    open var onSourceTypeChange = ::gen_onSourceTypeChange_fn
    open fun gen_onSourceTypeChange_fn(value: Number) {
        this.sourceType = this.sourceTypeItems[value]
    }
    open var onCompressedChange = ::gen_onCompressedChange_fn
    open fun gen_onCompressedChange_fn(value: Boolean) {
        this.compressed = value
    }
    open var onMaxDurationConfirm = ::gen_onMaxDurationConfirm_fn
    open fun gen_onMaxDurationConfirm_fn(value: Number) {
        this.maxDuration = value
    }
    open var onCameraChange = ::gen_onCameraChange_fn
    open fun gen_onCameraChange_fn(value: Number) {
        this.camera = this.cameraItems[value]
    }
    open var onAlbumModeChange = ::gen_onAlbumModeChange_fn
    open fun gen_onAlbumModeChange_fn(value: Number) {
        this.albumMode = this.albumModeTypeItems[value]
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
                return _uM("video" to _pS(_uM("alignSelf" to "center", "width" to 300, "height" to 225)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
