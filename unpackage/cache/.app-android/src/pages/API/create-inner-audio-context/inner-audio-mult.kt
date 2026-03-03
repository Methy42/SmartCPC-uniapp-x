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
open class GenPagesAPICreateInnerAudioContextInnerAudioMult : BasePage {
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
            this._audioContext1 = uni_createInnerAudioContext()
            this._audioContext1!!.src = this.src
            this._audioContext1!!.onTimeUpdate(fun(res){
                this.currentTime1 = this._audioContext1!!.currentTime
            }
            )
            this._audioContext2 = uni_createInnerAudioContext()
            this._audioContext2!!.src = this.src
            this._audioContext2!!.onTimeUpdate(fun(res){
                this.currentTime2 = this._audioContext2!!.currentTime
            }
            )
        }
        , __ins)
        onUnload(fun() {
            if (this._audioContext1 != null) {
                this._audioContext1!!.stop()
                this._audioContext1!!.destroy()
            }
            if (this._audioContext2 != null) {
                this._audioContext2!!.stop()
                this._audioContext2!!.destroy()
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
                    _cE("text", _uM("class" to "uni-title-text"), "多音频同时播放")
                )),
                _cE("button", _uM("type" to "primary", "onClick" to fun(){
                    _ctx.play1()
                }
                , "class" to "uni-btn"), " 播放/停止(进度：" + _tD(_ctx.currentTime1) + ")", 9, _uA(
                    "onClick"
                )),
                _cE("button", _uM("type" to "primary", "onClick" to fun(){
                    _ctx.play2()
                }
                , "class" to "uni-btn"), " 播放/停止(进度：" + _tD(_ctx.currentTime2) + ")", 9, _uA(
                    "onClick"
                ))
            ))
        ), 64)
    }
    open var title: String by `$data`
    open var _audioContext1: InnerAudioContext? by `$data`
    open var src: String by `$data`
    open var _audioContext2: InnerAudioContext? by `$data`
    open var playing1: Boolean by `$data`
    open var playing2: Boolean by `$data`
    open var currentTime1: Number by `$data`
    open var currentTime2: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "多音频同时播放", "_audioContext1" to null as InnerAudioContext?, "src" to "https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3", "_audioContext2" to null as InnerAudioContext?, "playing1" to false, "playing2" to false, "currentTime1" to 0, "currentTime2" to 0)
    }
    open var play1 = ::gen_play1_fn
    open fun gen_play1_fn() {
        if (this._audioContext1 != null) {
            this.currentTime1 = 0
            if (this.playing1) {
                this._audioContext1!!.stop()
            } else {
                this._audioContext1!!.play()
            }
        }
        this.playing1 = !this.playing1
    }
    open var play2 = ::gen_play2_fn
    open fun gen_play2_fn() {
        if (this._audioContext2 != null) {
            this.currentTime2 = 0
            if (this.playing2) {
                this._audioContext2!!.stop()
            } else {
                this._audioContext2!!.play()
            }
        }
        this.playing2 = !this.playing2
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
