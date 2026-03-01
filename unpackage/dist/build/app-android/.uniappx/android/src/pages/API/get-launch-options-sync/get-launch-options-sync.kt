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
import io.dcloud.uniapp.extapi.getLaunchOptionsSync as uni_getLaunchOptionsSync
open class GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync : BasePage {
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
            this.compareOnLaunchRes()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "getLaunchOptionsSync")),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("button", _uM("onClick" to _ctx.getLaunchOptionsSync), "getLaunchOptionsSync", 8, _uA(
                    "onClick"
                )),
                _cE("view", _uM("class" to "uni-common-mt"), _uA(
                    _cE("text", null, "应用本次启动路径："),
                    _cE("text", _uM("style" to _nS(_uM("margin-top" to "5px"))), _tD(_ctx.launchOptionsPath), 5)
                )),
                _cE("view", _uM("class" to "uni-common-mt"), _uA(
                    _cE("text", null, "应用本次启动："),
                    _cE("text", _uM("style" to _nS(_uM("margin-top" to "5px"))), _tD(_ctx.launchOptionsString), 5)
                ))
            ))
        ), 64)
    }
    open var checked: Boolean by `$data`
    open var homePagePath: String by `$data`
    open var launchOptionsPath: String by `$data`
    open var launchOptionsString: String by `$data`
    open var testResult: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("checked" to false, "homePagePath" to "pages/tabBar/component", "launchOptionsPath" to "", "launchOptionsString" to "", "testResult" to false)
    }
    open var compareOnLaunchRes = ::gen_compareOnLaunchRes_fn
    open fun gen_compareOnLaunchRes_fn() {
        val launchOptions = uni_getLaunchOptionsSync()
        this.launchOptionsString = JSON.stringify(launchOptions, null, 2)
        val app = getApp()
        val appOnLaunch = app.globalData.launchOptions
        val isPathSame = launchOptions.path == appOnLaunch.path
        val isAppSchemeSame = launchOptions.appScheme == appOnLaunch.appScheme
        val isAppLinkSame = launchOptions.appLink == appOnLaunch.appLink
        this.testResult = isPathSame && isAppSchemeSame && isAppLinkSame
    }
    open var getLaunchOptionsSync = ::gen_getLaunchOptionsSync_fn
    open fun gen_getLaunchOptionsSync_fn() {
        val launchOptions = uni_getLaunchOptionsSync()
        this.launchOptionsPath = launchOptions.path
        if (launchOptions.path == this.homePagePath) {
            this.checked = true
        }
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
