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
import io.dcloud.uniapp.extapi.chooseFile as uni_chooseFile
import io.dcloud.uniapp.extapi.createInnerAudioContext as uni_createInnerAudioContext
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage
open class GenPagesAPIChooseFileChooseFile : BasePage {
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
        onUnmounted(fun() {
            if (this._audioContext != null) {
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
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("button", _uM("size" to "mini", "onClick" to fun(){
                    _ctx.log = ""
                }
                ), "清空日志", 8, _uA(
                    "onClick"
                )),
                _cE("text", _uM("style" to _nS(_uM("margin" to "2px", "padding" to "2px", "border" to "1px solid #000000"))), _tD(_ctx.log), 5),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseVideo), "选择文件(video) 单选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseVideoMul), "选择文件(video) 多选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.playVideo), "选择文件(video)并播放", 8, _uA(
                    "onClick"
                )),
                _cE("video", _uM("class" to "video", "src" to _ctx.src, "controls" to true, "autoplay" to true, "loop" to true), "111", 8, _uA(
                    "src"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseImage), "选择文件(image) 单选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseImageMul), "选择文件(image) 多选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.viewImg), "选择文件(image) 并预览", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseAudio), "选择文件(audio) 单选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseAudioMul), "选择文件(audio) 多选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.playAudio), "选择文件(audio) 并播放", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseAll), "选择文件(all) 单选", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.chooseAllMul), "选择文件(all) 多选", 8, _uA(
                    "onClick"
                )),
                _cE("view", _uM("style" to _nS(_uM("height" to "4px"))), null, 4)
            ))
        ), 4)
    }
    open var log: String by `$data`
    open var title: String by `$data`
    open var src: String by `$data`
    open var _audioContext: InnerAudioContext? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("log" to "", "title" to "choose-file", "src" to "", "_audioContext" to null as InnerAudioContext?)
    }
    open var getPath = ::gen_getPath_fn
    open fun gen_getPath_fn(chooseFils: UTSArray<ChooseFileTempFile>): String {
        var urls = UTSArray<String>()
        chooseFils.forEach(fun(value){
            urls.push(value.path)
        }
        )
        return urls.join(", ")
    }
    open var chooseVideo = ::gen_chooseVideo_fn
    open fun gen_chooseVideo_fn() {
        uni_chooseFile(ChooseFileOptions(type = "video", count = 1, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseVideoMul = ::gen_chooseVideoMul_fn
    open fun gen_chooseVideoMul_fn() {
        uni_chooseFile(ChooseFileOptions(type = "video", success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var playVideo = ::gen_playVideo_fn
    open fun gen_playVideo_fn() {
        uni_chooseFile(ChooseFileOptions(type = "video", count = 1, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.src = res.tempFiles[0].path
                this._audioContext?.destroy()
                this._audioContext = null
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseImage = ::gen_chooseImage_fn
    open fun gen_chooseImage_fn() {
        uni_chooseFile(ChooseFileOptions(type = "image", count = 1, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseImageMul = ::gen_chooseImageMul_fn
    open fun gen_chooseImageMul_fn() {
        uni_chooseFile(ChooseFileOptions(type = "image", count = 90, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var viewImg = ::gen_viewImg_fn
    open fun gen_viewImg_fn() {
        uni_chooseFile(ChooseFileOptions(type = "image", success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                val tempFiles: UTSArray<String> = res.tempFiles.map(fun(value): String {
                    return value.path
                }
                )
                uni_previewImage(PreviewImageOptions(current = 0, urls = tempFiles, success = fun(res){
                    console.log(res)
                }
                , fail = fun(err){
                    console.log(err)
                }
                ))
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseAudio = ::gen_chooseAudio_fn
    open fun gen_chooseAudio_fn() {
        uni_chooseFile(ChooseFileOptions(type = "audio", count = 1, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseAudioMul = ::gen_chooseAudioMul_fn
    open fun gen_chooseAudioMul_fn() {
        uni_chooseFile(ChooseFileOptions(type = "audio", success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var playAudio = ::gen_playAudio_fn
    open fun gen_playAudio_fn() {
        uni_chooseFile(ChooseFileOptions(type = "audio", count = 1, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                if (this._audioContext == null) {
                    this.src = ""
                    this._audioContext = uni_createInnerAudioContext()
                    this._audioContext!!.autoplay = true
                } else if (!this._audioContext!!.paused) {
                    this._audioContext!!.stop()
                }
                this._audioContext!!.src = res.tempFiles[0].path
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseAll = ::gen_chooseAll_fn
    open fun gen_chooseAll_fn() {
        uni_chooseFile(ChooseFileOptions(type = "all", count = 1, success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
        }
        ))
    }
    open var chooseAllMul = ::gen_chooseAllMul_fn
    open fun gen_chooseAllMul_fn() {
        uni_chooseFile(ChooseFileOptions(type = "all", success = fun(res){
            console.log(res)
            if (res.tempFiles.length > 0) {
                this.log += this.getPath(res.tempFiles) + "\n\n"
            }
        }
        , complete = fun(res){
            console.log(res)
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
                return _uM("btnstyle" to _pS(_uM("marginTop" to 4, "marginRight" to 4, "marginBottom" to 4, "marginLeft" to 4)), "video" to _pS(_uM("width" to "100%", "height" to 225)), "uni-uploader__input-box" to _pS(_uM("marginTop" to 5, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 5, "width" to 104, "height" to 104, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#D9D9D9", "borderRightColor" to "#D9D9D9", "borderBottomColor" to "#D9D9D9", "borderLeftColor" to "#D9D9D9")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
