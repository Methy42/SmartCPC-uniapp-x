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
import io.dcloud.uniapp.extapi.getBackgroundAudioManager as uni_getBackgroundAudioManager
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.setInnerAudioOption as uni_setInnerAudioOption
open class GenPagesAPISetInnerAudioOptionSetInnerAudioOption : BasePage {
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
        onUnload(fun() {
            this.backgroundManager?.stop()
            this.innerAudio?.stop()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to "setInnerAudioOption")),
            _cE("text", _uM("style" to _nS(_uM("margin-left" to "8px"))), "是否允许与其他音频同时播放", 4),
            _cV(_component_radio_group, _uM("class" to "uni-flex", "style" to _nS(_uM("margin" to "8px")), "onChange" to _ctx.onMixChanged), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                return _uA(
                    _cV(_component_radio, _uM("value" to "1", "checked" to true), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            "是"
                        )
                    }
                    ), "_" to 1)),
                    _cV(_component_radio, _uM("value" to "0", "style" to _nS(_uM("margin-left" to "16px"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            "否"
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "style"
                    ))
                )
            }
            ), "_" to 1), 8, _uA(
                "style",
                "onChange"
            )),
            _cE("view", _uM("style" to _nS(_uM("padding" to "8px 8px"))), _uA(
                _cE("button", _uM("onClick" to _ctx.playBackgroundMusic, "type" to "primary"), "播放背景音频", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("onClick" to _ctx.playInnerMusic, "style" to _nS(_uM("margin-top" to "8px"))), "播放音频", 12, _uA(
                    "onClick"
                ))
            ), 4),
            _cE("view", _uM("style" to _nS(_uM("padding" to "16px 8px"))), _uA(
                _cE("view", _uM("class" to "uni-row"), _uA(
                    _cE("view", null, "1. "),
                    "uni.setInnerAudioOption需要与uni.createInnerAudioContext搭配才会生效 "
                )),
                _cE("view", _uM("class" to "uni-row"), _uA(
                    _cE("view", null, "2. "),
                    "设置mixWithOther为true时，会暂停其他App的音频和背景音频 "
                ))
            ), 4)
        ), 4)
    }
    open var backgroundManager: BackgroundAudioManager? by `$data`
    open var innerAudio: InnerAudioContext? by `$data`
    open var isBackgroundAudioPaused: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("backgroundManager" to null as BackgroundAudioManager?, "innerAudio" to null as InnerAudioContext?, "isBackgroundAudioPaused" to false)
    }
    open var playBackgroundMusic = ::gen_playBackgroundMusic_fn
    open fun gen_playBackgroundMusic_fn() {
        if (this.backgroundManager == null) {
            this.backgroundManager = uni_getBackgroundAudioManager()
            this.backgroundManager!!.onPause(fun(_result){
                this.isBackgroundAudioPaused = true
            })
        } else {
            this.backgroundManager!!.stop()
        }
        this.backgroundManager!!.src = "https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3"
        this.backgroundManager!!.coverImgUrl = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/music-a.png"
        this.backgroundManager!!.play()
    }
    open var playInnerMusic = ::gen_playInnerMusic_fn
    open fun gen_playInnerMusic_fn() {
        if (this.innerAudio == null) {
            this.innerAudio = uni_createInnerAudioContext()
        } else {
            this.innerAudio!!.stop()
        }
        this.innerAudio!!.src = "https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3"
        this.innerAudio!!.play()
    }
    open var onMixChanged = ::gen_onMixChanged_fn
    open fun gen_onMixChanged_fn(event: UniRadioGroupChangeEvent) {
        uni_setInnerAudioOption(SetInnerAudioOptionOptions(mixWithOther = event.detail.value == "1"))
    }
    open var testInnerAudioOption = ::gen_testInnerAudioOption_fn
    open fun gen_testInnerAudioOption_fn() {
        uni_setInnerAudioOption(SetInnerAudioOptionOptions(mixWithOther = false))
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(), _uA(
                GenApp.styles
            ))
        }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
