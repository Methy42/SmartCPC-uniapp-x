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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage
open class GenPagesAPIDialogPageDialog2 : BasePage {
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
        onLoad(fun(options: OnLoadOptions) {
            console.log("dialog 2 onLoad", options)
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , __ins)
        onPageShow(fun() {
            console.log("dialog 2 onShow")
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , __ins)
        onReady(fun() {
            console.log("dialog 2 onReady")
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , __ins)
        onPageHide(fun() {
            console.log("dialog 2 onHide")
            setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , __ins)
        onUnload(fun() {
            console.log("dialog 2 onUnload")
            setLifeCycleNum(state.lifeCycleNum - 5)
        }
        , __ins)
        onBackPress(fun(options: OnBackPressOptions): Boolean? {
            setLifeCycleNum(state.lifeCycleNum + 1)
            return false
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("id" to "dialog2", "class" to "dialog-container"), _uA(
            _cE("view", _uM("class" to "dialog-content"), _uA(
                _cE("text", null, "title: " + _tD(_ctx.title), 1),
                _cE("text", _uM("class" to "mt-10"), "onBackPress return false"),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.goNextPage), "go next page", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.openDialog1), "openDialog1", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.closeDialog), "closeDialog", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.closeThisDialog), "closeThisDialog", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.back), "back", 8, _uA(
                    "onClick"
                ))
            ))
        ))
    }
    open var title: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "dialog 2")
    }
    open var goNextPage = ::gen_goNextPage_fn
    open fun gen_goNextPage_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/dialog-page/next-page"))
    }
    open var openDialog1 = ::gen_openDialog1_fn
    open fun gen_openDialog1_fn() {
        uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-1?name=dialog1", success = fun(res) {
            console.log("openDialog1 success", res)
        }
        , fail = fun(err) {
            console.log("openDialog1 fail", err)
        }
        , complete = fun(res) {
            console.log("openDialog1 complete", res)
        }
        ))
    }
    open var closeDialog = ::gen_closeDialog_fn
    open fun gen_closeDialog_fn() {
        uni_closeDialogPage(CloseDialogPageOptions(success = fun(res) {
            console.log("closeDialog success", res)
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(err) {
            console.log("closeDialog fail", err)
            setLifeCycleNum(state.lifeCycleNum - 4)
        }
        , complete = fun(res) {
            console.log("closeDialog complete", res)
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var closeThisDialog = ::gen_closeThisDialog_fn
    open fun gen_closeThisDialog_fn() {
        uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`, success = fun(res) {
            console.log("closeThisDialog success", res)
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(err) {
            console.log("closeThisDialog fail", err)
            setLifeCycleNum(state.lifeCycleNum - 4)
        }
        , complete = fun(res) {
            console.log("closeThisDialog complete", res)
            setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var back = ::gen_back_fn
    open fun gen_back_fn() {
        uni_navigateBack(null)
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
                return _uM("dialog-container" to _pS(_uM("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.3)", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "dialog-content" to _pS(_uM("width" to "80%", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 6, "borderTopRightRadius" to 6, "borderBottomRightRadius" to 6, "borderBottomLeftRadius" to 6)), "mt-10" to _pS(_uM("marginTop" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
