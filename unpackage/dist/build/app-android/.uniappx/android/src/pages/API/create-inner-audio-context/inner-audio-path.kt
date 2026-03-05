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
import io.dcloud.uniapp.extapi.createInnerAudioContext as uni_createInnerAudioContext
import io.dcloud.uniapp.extapi.env as uni_env
import io.dcloud.uniapp.extapi.getFileSystemManager as uni_getFileSystemManager
import io.dcloud.uniapp.framework.onShow
open class GenPagesAPICreateInnerAudioContextInnerAudioPath : BasePage {
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
            this._audioContext = uni_createInnerAudioContext()
            this._audioContext!!.onPlay(fun(_result){
                console.log("开始播放")
            }
            )
            this._audioContext!!.onEnded(fun(_result){
                console.log("播放结束")
                this.isPlaying = false
            }
            )
            this._audioContext!!.onError(fun(err){
                this.isPlaying = false
                console.log("err", err)
            }
            )
            val fileManager = uni_getFileSystemManager()
            fileManager.mkdir(MkDirOptions(dirPath = uni_env.CACHE_PATH + "uni-audio/test", recursive = true, success = fun(res){
                fileManager.copyFile(CopyFileOptions(srcPath = "/static/test-audio/ForElise.mp3", destPath = this.nativePath, success = fun(_res){
                    console.log("copy成功： ", res)
                }
                ))
            }
            , fail = fun(err){
                console.log("创建路径失败： ", err.errMsg)
                if (err.errMsg.includes("file already exists")) {
                    console.log("已经包含该路径")
                    fileManager.copyFile(CopyFileOptions(srcPath = "/static/test-audio/ForElise.mp3", destPath = this.nativePath, success = fun(res){
                        console.log("copy成功： ", res)
                    }
                    , fail = fun(err){
                        console.log("copy失败： ", err)
                    }
                    ))
                }
            }
            ))
        }
        , __ins)
        onUnload(fun() {
            if (this._audioContext != null) {
                this.pause()
                this._audioContext!!.destroy()
            }
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-title-text"), "音频路径示例")
                )),
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.supportPaths, fun(item, index, __index, _cached): Any {
                    return _cE("view", _uM("class" to "formats", "key" to index), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), _tD(item.description), 1),
                        _cE("image", _uM("class" to "icon-play", "src" to if ((_ctx.isPlaying && _ctx.playIndex == index)) {
                            "/static/pause.png"
                        } else {
                            "/static/play.png"
                        }
                        , "onClick" to fun(){
                            _ctx.play(item.src, index)
                        }
                        ), null, 8, _uA(
                            "src",
                            "onClick"
                        ))
                    ))
                }
                ), 128)
            ))
        ), 64)
    }
    open var title: String by `$data`
    open var playIndex: Number by `$data`
    open var isPlaying: Boolean by `$data`
    open var nativePath: String by `$data`
    open var _audioContext: InnerAudioContext? by `$data`
    open var supportPaths: UTSArray<AudioPath> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "audio-path", "playIndex" to 0, "isPlaying" to false, "nativePath" to uni_env.CACHE_PATH + "uni-audio/test/test.mp3" as String, "_audioContext" to null as InnerAudioContext?, "supportPaths" to _uA<AudioPath>(AudioPath(description = "本地路径：/static方式", src = "/static/test-audio/ForElise.mp3"), AudioPath(description = "本地路径：../static/", src = "../../../static/test-audio/ForElise.mp3"), AudioPath(description = "本地路径：env方式", src = "env"), AudioPath(description = "网络路径", src = "https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.mp3"), AudioPath(description = "不存在的音频", src = "https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/invalid_url.mp3"), AudioPath(description = "错误路径", src = "../static/test-audio/ForElise22.mp3")))
    }
    open var pause = ::gen_pause_fn
    open fun gen_pause_fn() {
        this._audioContext!!.pause()
        this.isPlaying = false
    }
    open var play = ::gen_play_fn
    open fun gen_play_fn(reassignedAudioUrl: String, index: Number) {
        var audioUrl = reassignedAudioUrl
        console.log(index, audioUrl)
        if (this.isPlaying && this.playIndex == index) {
            this.pause()
            return
        }
        if (audioUrl == "env") {
            audioUrl = this.nativePath
        }
        this.playIndex = index
        this._audioContext!!.src = audioUrl
        this._audioContext!!.play()
        this.isPlaying = true
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
                return _uM("formats" to _pS(_uM("alignItems" to "center")), "icon-play" to _pS(_uM("width" to 60, "height" to 60, "marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
