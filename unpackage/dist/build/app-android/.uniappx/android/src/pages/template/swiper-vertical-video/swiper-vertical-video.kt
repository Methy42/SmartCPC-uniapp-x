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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack
import io.dcloud.uniapp.framework.onShow
open class GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo : BasePage {
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
        onCreated(fun() {
            this.list = this.getData()
            this.visibleList = this.list.slice(0, 3)
        }
        , __ins)
        onReady(fun() {
            this.doPlay(0)
            var backElement = this.`$refs`["back"] as UniElement
            backElement.style.setProperty("top", uni_getWindowInfo().statusBarHeight + "px")
        }
        , __ins)
        onPageShow(fun() {
            currentPageIsShow = true
        }
        , __ins)
        onPageHide(fun() {
            currentPageIsShow = false
            console.log("pages-onHide")
            this.doPause(this.current)
        }
        , __ins)
        onUnload(fun() {
            this.doPause(this.current)
        }
        , __ins)
        this.`$watch`(fun(): Any? {
            return this.current
        }
        , fun(current: Number, oldCurrent: Number) {
            var changeNumber = current - oldCurrent
            if (changeNumber == 1 || changeNumber == -2) {
                this.index++
            } else {
                this.index--
            }
            if (Math.abs(changeNumber) == 2) {
                page = Math.floor(this.index / 3)
                if (this.list.length < 3 * page + 3) {
                    var list: UTSArray<ListItem__1> = this.getData()
                    this.list.push(*list.toTypedArray())
                }
                var visibleList = this.list.slice(3 * page, 3 * page + 3)
                this.visibleList = visibleList
            }
            this.state.forEach(fun(_: String, index: Number){
                if (index === current) {
                    this.doPlay(current)
                } else {
                    this.doStop(index)
                    console.log("index:" + index + "已被执行停止")
                }
            }
            )
        }
        )
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("class" to "page"), _uA(
            _cE("view", _uM("ref" to "back", "onClick" to _ctx.back, "class" to "nav-back"), _uA(
                _cE("image", _uM("class" to "back-img", "src" to "/static/template/scroll-fold-nav/back.png", "mode" to "widthFix"))
            ), 8, _uA(
                "onClick"
            )),
            _cE("swiper", _uM("class" to "swiper", "current" to _ctx.current, "circular" to (_ctx.index != 0), "vertical" to true, "onChange" to _ctx.onSwiperChange, "onTransition" to _ctx.onTransition), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.visibleList, fun(item, i, __index, _cached): Any {
                    return _cE("swiper-item", _uM("class" to "swiper-item", "key" to i), _uA(
                        _cE("video", _uM("onClick" to fun(){
                            _ctx.changeState(i)
                        }
                        , "ref_for" to true, "ref" to "video", "class" to "video-box", "id" to ("video-" + i), "onLoadstart" to fun(){
                            _ctx.onLoadstart(i)
                        }
                        , "src" to item.src, "poster" to item.poster_src, "autoplay" to false, "show-progress" to false, "show-fullscreen-btn" to false, "show-play-btn" to false, "show-center-play-btn" to false, "loop" to true, "onPlay" to fun(){
                            _ctx.onPlay(i)
                        }
                        , "onPause" to fun(){
                            _ctx.onPause(i)
                        }
                        , "http-cache" to "true"), null, 40, _uA(
                            "onClick",
                            "id",
                            "onLoadstart",
                            "src",
                            "poster",
                            "onPlay",
                            "onPause"
                        )),
                        _cE("view", _uM("class" to "video-cover", "onClick" to fun(){
                            _ctx.changeState(i)
                        }
                        ), _uA(
                            if (_ctx.state[i] === "pause") {
                                _cE("image", _uM("key" to 0, "class" to "play-btn", "src" to "/static/template/swiper-vertical-video/play.png", "mode" to "widthFix"))
                            } else {
                                _cC("v-if", true)
                            }
                        ), 8, _uA(
                            "onClick"
                        )),
                        if (isTrue(_ctx.showDebugInfo)) {
                            _cE("view", _uM("key" to 0, "class" to "video-info"), _uA(
                                _cE("text", _uM("class" to "video-info-text"), "容器：第 " + _tD(i) + " 个", 1),
                                _cE("text", _uM("class" to "video-info-text"), "内容：" + _tD(item.content), 1)
                            ))
                        } else {
                            _cC("v-if", true)
                        }
                    ))
                }
                ), 128)
            ), 40, _uA(
                "current",
                "circular",
                "onChange",
                "onTransition"
            )),
            if (isTrue(_ctx.showDebugInfo)) {
                _cE("view", _uM("key" to 0, "class" to "debug-info"), _uA(
                    _cE("text", _uM("class" to "status-text"), "debug-info 播放状态:"),
                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.state, fun(value, index, __index, _cached): Any {
                        return _cE("text", _uM("class" to "status-text"), "第" + _tD(index + 1) + "个:" + _tD(value), 1)
                    }), 256)
                ))
            } else {
                _cC("v-if", true)
            }
        ))
    }
    open var `$videoContextMap`: Map<String, VideoContext> by `$data`
    open var list: UTSArray<ListItem__1> by `$data`
    open var visibleList: UTSArray<ListItem__1> by `$data`
    open var current: Number by `$data`
    open var index: Number by `$data`
    open var state: UTSArray<String> by `$data`
    open var showDebugInfo: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("\$videoContextMap" to Map<String, VideoContext>(), "list" to _uA<ListItem__1>(), "visibleList" to _uA<ListItem__1>(), "current" to 0 as Number, "index" to 0, "state" to _uA<String>("pause", "unPlay", "unPlay"), "showDebugInfo" to false as Boolean)
    }
    open var changeState = ::gen_changeState_fn
    open fun gen_changeState_fn(index: Number) {
        if (this.state[index] === "play") {
            this.doPause(index)
        } else {
            this.doPlay(this.current)
        }
    }
    open var onLoadstart = ::gen_onLoadstart_fn
    open fun gen_onLoadstart_fn(index: Number) {
        console.error("onLoadstart  video" + index)
    }
    open var getVideoContext = ::gen_getVideoContext_fn
    open fun gen_getVideoContext_fn(index: Number): VideoContext {
        val videoContextMap = this.`$data`["\$videoContextMap"] as Map<String, VideoContext>
        var videoContext: VideoContext? = videoContextMap.get("video-" + index)
        if (videoContext == null) {
            videoContext = uni_createVideoContext("video-" + index, this) as VideoContext
            videoContextMap.set("video-" + index, videoContext)
        }
        return videoContext
    }
    open var doPlay = ::gen_doPlay_fn
    open fun gen_doPlay_fn(index: Number) {
        console.log("doPlay  video" + index)
        this.getVideoContext(index).play()
    }
    open var doStop = ::gen_doStop_fn
    open fun gen_doStop_fn(index: Number) {
        console.log("doStop  video-" + index)
        this.getVideoContext(index).stop()
        setTimeout(fun(){
            this.state[index] = "unPlay"
        }
        , 1000)
    }
    open var doPause = ::gen_doPause_fn
    open fun gen_doPause_fn(index: Number) {
        this.getVideoContext(index).pause()
        console.log("doPause  video-" + index)
    }
    open var onPause = ::gen_onPause_fn
    open fun gen_onPause_fn(index: Number) {
        this.state[index] = "pause"
        console.log("onPause", index)
    }
    open var onPlay = ::gen_onPlay_fn
    open fun gen_onPlay_fn(index: Number) {
        if (this.current != index || !currentPageIsShow) {
            this.onPause(index)
        } else {
            this.state[index] = "play"
            console.log("onPlay", index)
        }
    }
    open var getData = ::gen_getData_fn
    open fun gen_getData_fn(): UTSArray<ListItem__1> {
        var videoUrlList = if (uni.UNI2A1DFEF.state.netless) {
            _uA(
                "/static/test-video/10second-demo.mp4",
                "/static/test-video/10second-demo.mp4",
                "/static/test-video/10second-demo.mp4"
            )
        } else {
            _uA<String>("https://web-ext-storage.dcloud.net.cn/uni-app-x/video/uts-5-16.mp4", "https://web-ext-storage.dcloud.net.cn/uni-app-x/video/uni-ai-5-16.mp4", "https://web-ext-storage.dcloud.net.cn/uni-app-x/video/uni-verify-5-16.mp4")
        }
        var posterSrcList = if (uni.UNI2A1DFEF.state.netless) {
            _uA(
                "/static/shuijiao.jpg",
                "/static/logo.jpg",
                "/static/shuijiao.jpg"
            )
        } else {
            _uA<String>("https://web-ext-storage.dcloud.net.cn/uni-app-x/dark-uni-uts-01.png", "https://web-ext-storage.dcloud.net.cn/uni-app-x/dark-uni-ai-01.png", "https://web-ext-storage.dcloud.net.cn/uni-app-x/dark-uni-verify-01.jpg")
        }
        var list = _uA<ListItem__1>()
        run {
            var i: Number = 0
            while(i < 6){
                var index = this.list.length + i
                var listItem = ListItem__1(_id = "a00" + index, content = "这是第" + index + "条数据，url地址" + videoUrlList[i % 3], src = videoUrlList[i % 3], poster_src = posterSrcList[i % 3])
                list.push(listItem)
                i++
            }
        }
        return list
    }
    open var onSwiperChange = ::gen_onSwiperChange_fn
    open fun gen_onSwiperChange_fn(e: SwiperChangeEvent) {
        this.current = e.detail.current
    }
    open var onTransition = ::gen_onTransition_fn
    open fun gen_onTransition_fn() {}
    open var back = ::gen_back_fn
    open fun gen_back_fn() {
        uni_navigateBack(NavigateBackOptions(success = fun(result) {
            console.log("navigateBack success", result.errMsg)
        }
        , fail = fun(error) {
            console.log("navigateBack fail", error.errMsg)
        }
        , complete = fun(result) {
            console.log("navigateBack complete", result.errMsg)
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
                return _uM("page" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "swiper" to _pS(_uM("width" to "100%", "height" to "100%")), "swiper-item" to _pS(_uM("width" to "100%", "height" to "100%", "position" to "relative")), "video-box" to _pS(_uM("width" to "100%", "height" to "100%")), "video-cover" to _pS(_uM("width" to "100%", "height" to "100%", "position" to "absolute", "justifyContent" to "center", "alignItems" to "center", "alignContent" to "center")), "play-btn" to _pS(_uM("width" to 40, "height" to 40)), "video-info" to _pS(_uM("position" to "absolute", "bottom" to 0, "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "video-info-text" to _pS(_uM("fontSize" to 14, "color" to "#FF0000", "lineHeight" to "20px")), "debug-info" to _pS(_uM("position" to "fixed", "top" to 15, "width" to "100%", "backgroundColor" to "rgba(255,255,255,0.3)")), "status-text" to _pS(_uM("color" to "#FF0000", "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "nav-back" to _pS(_uM("position" to "absolute", "top" to 35, "backgroundColor" to "rgba(220,220,220,0.8)", "borderTopLeftRadius" to 100, "borderTopRightRadius" to 100, "borderBottomRightRadius" to 100, "borderBottomLeftRadius" to 100, "marginTop" to 6, "marginRight" to 6, "marginBottom" to 6, "marginLeft" to 6, "width" to 32, "height" to 32, "justifyContent" to "center", "alignItems" to "center", "zIndex" to 10)), "back-img" to _uM(".nav-back " to _uM("width" to 18, "height" to 18)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
