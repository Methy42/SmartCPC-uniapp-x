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
import io.dcloud.uniapp.extapi.createVideoContext as uni_createVideoContext
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentAdLandscapeVideoAd : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("class" to "container"), _uA(
            _cE("video", _uM("id" to "myVideo2", "src" to _ctx.src, "controls" to true, "autoplay" to "false", "class" to "video", "onPlay" to _ctx.onVideoPlay), _uA(
                if (isTrue(_ctx.adVisible)) {
                    _cE("view", _uM("key" to 0, "class" to "ad-container"), _uA(
                        _cE("ad", _uM("adpid" to "1597617406", "class" to "ad-class", "onLoad" to _ctx.loadFun, "onError" to _ctx.errorFun, "onClose" to _ctx.closeAd), null, 40, _uA(
                            "onLoad",
                            "onError",
                            "onClose"
                        ))
                    ))
                } else {
                    _cC("v-if", true)
                }
            ), 40, _uA(
                "src",
                "onPlay"
            ))
        ))
    }
    open var title: String by `$data`
    open var src: String by `$data`
    open var showAd: Boolean by `$data`
    open var adVisible: Boolean by `$data`
    open var countdown: Number by `$data`
    open var adTimer: Any? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "广告演示", "src" to "https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4", "showAd" to false, "adVisible" to false, "countdown" to 10, "adTimer" to null)
    }
    open var setfs = ::gen_setfs_fn
    open fun gen_setfs_fn() {
        val videoContext = uni_createVideoContext("myVideo2", null)
        val direction: RequestFullScreenOptions = RequestFullScreenOptions(direction = -90)
        videoContext!!.requestFullScreen(direction)
    }
    open var onVideoPlay = ::gen_onVideoPlay_fn
    open fun gen_onVideoPlay_fn() {
        if (!this.showAd) {
            val videoContext = uni_createVideoContext("myVideo2", null)
            videoContext!!.stop()
            this.showAd = true
            val direction: RequestFullScreenOptions = RequestFullScreenOptions(direction = 90)
            videoContext!!.requestFullScreen(direction)
            this.adVisible = true
        }
    }
    open var closeAd = ::gen_closeAd_fn
    open fun gen_closeAd_fn() {
        console.log("执行了关闭", " at pages/component/ad/landscape-video-ad.uvue:48")
        this.adVisible = false
        val videoContext = uni_createVideoContext("myVideo2", null)
        videoContext!!.play()
    }
    open var loadFun = ::gen_loadFun_fn
    open fun gen_loadFun_fn() {
        console.log("加载成功", " at pages/component/ad/landscape-video-ad.uvue:56")
    }
    open var errorFun = ::gen_errorFun_fn
    open fun gen_errorFun_fn(e: UniAdErrorEvent) {
        console.log(e.detail, " at pages/component/ad/landscape-video-ad.uvue:59")
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
                return _uM("container" to _pS(_uM("position" to "relative", "width" to "100%", "height" to "100%", "display" to "flex", "flexDirection" to "column")), "video" to _pS(_uM("width" to "100%", "height" to "420rpx", "display" to "flex", "alignItems" to "center", "justifyContent" to "center")), "ad-class" to _pS(_uM("width" to "100%", "height" to "100%", "display" to "flex", "alignItems" to "center", "justifyContent" to "center")), "ad-container" to _pS(_uM("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.7)", "display" to "flex", "alignItems" to "center", "justifyContent" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
