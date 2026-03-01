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
import io.dcloud.uniapp.extapi.closeDialogPage as uni_closeDialogPage
import io.dcloud.uniapp.extapi.createVideoContext as uni_createVideoContext
open class GenPagesComponentVideoVideoDialogPage : BasePage {
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
        onBackPress(fun(_: OnBackPressOptions): Boolean? {
            this.exitFullScreen()
            return true
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("class" to "dialog-container"), _uA(
            _cE("video", _uM("id" to "myVideo", "src" to "https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4", "title" to "这里是 dialogPage 中的 video")),
            _cE("view", _uM("class" to "dialog-content"), _uA(
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.requestFullScreen), " requestFullScreen ", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.exitFullScreen), " exitFullScreen ", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.closeThisPage), " closeThisPage ", 8, _uA(
                    "onClick"
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var backgroundColorContent: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "dialogPage Video", "backgroundColorContent" to "transparent")
    }
    open var requestFullScreen = ::gen_requestFullScreen_fn
    open fun gen_requestFullScreen_fn() {
        uni_createVideoContext("myVideo", null)?.requestFullScreen(null)
    }
    open var exitFullScreen = ::gen_exitFullScreen_fn
    open fun gen_exitFullScreen_fn() {
        uni_createVideoContext("myVideo", null)?.exitFullScreen()
    }
    open var closeThisPage = ::gen_closeThisPage_fn
    open fun gen_closeThisPage_fn() {
        uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`))
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
                return _uM("dialog-container" to _pS(_uM("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.3)", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "dialog-content" to _pS(_uM("width" to "80%", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 6, "borderTopRightRadius" to 6, "borderBottomRightRadius" to 6, "borderBottomLeftRadius" to 6)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
