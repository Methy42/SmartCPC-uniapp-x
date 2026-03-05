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
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showModal as uni_showModal
open class GenPagesAPIGetVideoInfoGetVideoInfo : BasePage {
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
            uni_getVideoInfo(GetVideoInfoOptions(src = this.relativeVideoPath, success = fun(res){
                console.log("getVideoInfo success", JSON.stringify(res))
                this.relativeVideoInfo = "视频画面方向: " + res.orientation + "\n视频格式: " + res.type + "\n视频长度: " + res.duration + "s\n视频大小: " + res.size + "KB\n视频宽度: " + res.width + "\n视频高度: " + res.height + "\n视频帧率: " + res.fps + "fps\n视频码率: " + res.bitrate + "kbps"
                this.relativeVideoInfo = this.relativeVideoInfo + ("\n视频字节大小: " + res.byteSize + "B\n视频首帧图片路径: " + res.thumbTempFilePath)
                if (res.thumbTempFilePath != null) {
                    this.relativeCoverImagePath = res.thumbTempFilePath!!
                }
            }
            , fail = fun(err){
                uni_showModal(ShowModalOptions(title = "获取视频信息失败", content = JSON.stringify(err), showCancel = false))
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
                    _cE("text", _uM("class" to "uni-subtitle-text"), "获取本地绝对路径视频信息")
                )),
                _cE("video", _uM("class" to "video", "src" to _ctx.absoluteVideoPath, "controls" to true, "poster" to _ctx.absoluteCoverImagePath), null, 8, _uA(
                    "src",
                    "poster"
                )),
                _cE("text", _uM("class" to "margin-top-10"), _tD(_ctx.absoluteVideoInfo), 1),
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.chooseVideo), "拍摄视频或从相册中选择视频", 8, _uA(
                        "onClick"
                    ))
                ))
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-subtitle-text"), "获取本地相对路径视频信息")
                )),
                _cE("video", _uM("class" to "video", "src" to _ctx.relativeVideoPath, "controls" to true, "poster" to _ctx.relativeCoverImagePath), null, 8, _uA(
                    "src",
                    "poster"
                )),
                _cE("text", _uM("class" to "margin-top-10"), _tD(_ctx.relativeVideoInfo), 1)
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var relativeVideoPath: String by `$data`
    open var relativeVideoInfo: String by `$data`
    open var relativeCoverImagePath: String by `$data`
    open var absoluteVideoPath: String by `$data`
    open var absoluteVideoInfo: String by `$data`
    open var absoluteCoverImagePath: String by `$data`
    open var videoInfoForTest: UTSJSONObject? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "getVideoInfo", "relativeVideoPath" to "/static/test-video/10second-demo.mp4", "relativeVideoInfo" to "", "relativeCoverImagePath" to "", "absoluteVideoPath" to "", "absoluteVideoInfo" to "", "absoluteCoverImagePath" to "", "videoInfoForTest" to null as UTSJSONObject?)
    }
    open var chooseVideo = ::gen_chooseVideo_fn
    open fun gen_chooseVideo_fn() {
        uni_chooseVideo(ChooseVideoOptions(compressed = false, success = fun(res){
            this.absoluteVideoPath = res.tempFilePath
            uni_getVideoInfo(GetVideoInfoOptions(src = res.tempFilePath, success = fun(_res){
                console.log("getVideoInfo success", JSON.stringify(_res))
                this.absoluteVideoInfo = "视频画面方向: " + _res.orientation + "\n视频格式: " + _res.type + "\n视频长度: " + _res.duration + "s\n视频大小: " + _res.size + "KB\n视频宽度: " + _res.width + "\n视频高度: " + _res.height + "\n视频帧率: " + _res.fps + "fps\n视频码率: " + _res.bitrate + "kbps"
                this.absoluteVideoInfo = this.absoluteVideoInfo + ("\n视频字节大小: " + _res.byteSize + "B\n视频首帧图片路径: " + _res.thumbTempFilePath)
                if (_res.thumbTempFilePath != null) {
                    this.absoluteCoverImagePath = _res.thumbTempFilePath!!
                }
            }
            , fail = fun(err){
                uni_showModal(ShowModalOptions(title = "获取视频信息失败", content = JSON.stringify(err), showCancel = false))
            }
            ))
        }
        ))
    }
    open var testGetVideoInfo = ::gen_testGetVideoInfo_fn
    open fun gen_testGetVideoInfo_fn() {
        uni_getVideoInfo(GetVideoInfoOptions(src = "/static/test-video/10second-demo.mp4", success = fun(res){
            this.videoInfoForTest = object : UTSJSONObject() {
                var orientation = res.orientation
                var type = res.type
                var duration = Math.trunc(res.duration)
                var size = res.size
                var width = res.width
                var height = res.height
                var fps = res.fps
                var bitrate = res.bitrate
            }
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
                return _uM("video" to _pS(_uM("width" to "100%")), "margin-top-10" to _pS(_uM("marginTop" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
