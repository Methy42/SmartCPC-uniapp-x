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
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIDialogPageNextPage : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            console.log("dialogPage parent onLoad")
        }
        , __ins)
        onPageShow(fun() {
            console.log("dialogPage parent onShow")
        }
        , __ins)
        onReady(fun() {
            console.log("dialogPage parent onReady")
        }
        , __ins)
        onPageHide(fun() {
            console.log("dialogPage parent onHide")
        }
        , __ins)
        onUnload(fun() {
            console.log("dialogPage parent onUnload")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
            _cE("button", _uM("class" to "uni-common-mt", "onClick" to _ctx.openDialog1), "open dialog1", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("class" to "uni-common-mt", "onClick" to _ctx.openDialog2), "open dialog2", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("class" to "uni-common-mt", "onClick" to _ctx.openDialogPage1ToHomePage), "open dialog page 1 to home page", 8, _uA(
                "onClick"
            ))
        ))
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
    open var openDialog2 = ::gen_openDialog2_fn
    open fun gen_openDialog2_fn() {
        uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-2", disableEscBack = true, success = fun(res) {
            console.log("openDialog2 success", res)
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(err) {
            console.log("openDialog2 fail", err)
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 4)
        }
        , complete = fun(res) {
            console.log("openDialog2 complete", res)
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var closeDialog = ::gen_closeDialog_fn
    open fun gen_closeDialog_fn() {
        uni_closeDialogPage(CloseDialogPageOptions(success = fun(res) {
            console.log("closeDialog success", res)
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(err) {
            console.log("closeDialog fail", err)
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 4)
        }
        , complete = fun(res) {
            console.log("closeDialog complete", res)
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var openDialogPage1ToHomePage = ::gen_openDialogPage1ToHomePage_fn
    open fun gen_openDialogPage1ToHomePage_fn() {
        val pages = getCurrentPages()
        uni_openDialogPage(OpenDialogPageOptions(parentPage = pages[0], url = "/pages/API/dialog-page/dialog-1?name=dialog1", success = fun(res) {
            console.log("openDialogPage1ToHomePage success", res)
            uni_showToast(ShowToastOptions(title = "在首页打开了 dialogPage"))
        }
        , fail = fun(err) {
            console.log("openDialogPage1ToHomePage fail", err)
        }
        , complete = fun(res) {
            console.log("openDialogPage1ToHomePage complete", res)
        }
        ))
    }
    open var setLifeCycleNum = ::gen_setLifeCycleNum_fn
    open fun gen_setLifeCycleNum_fn(value: Number) {
        uni.UNI2A1DFEF.setLifeCycleNum(value)
    }
    open var getLifeCycleNum = ::gen_getLifeCycleNum_fn
    open fun gen_getLifeCycleNum_fn(): Number {
        return state.lifeCycleNum
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
