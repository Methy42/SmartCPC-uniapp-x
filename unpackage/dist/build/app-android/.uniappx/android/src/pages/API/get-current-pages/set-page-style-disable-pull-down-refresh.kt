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
import io.dcloud.uniapp.extapi.startPullDownRefresh as uni_startPullDownRefresh
import io.dcloud.uniapp.extapi.stopPullDownRefresh as uni_stopPullDownRefresh
open class GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh : BasePage {
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
            val pages = getCurrentPages()
            val currentPage = pages[pages.length - 1]
            this.currentPageStyle = currentPage.getPageStyle()
            this.enablePullDownRefreshStatus = this.currentPageStyle["enablePullDownRefresh"] as Boolean
        }
        , __ins)
        onPullDownRefresh(fun() {
            setTimeout(fun(){
                uni_stopPullDownRefresh()
            }
            , 3000)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "getCurrentPages")),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("button", _uM("class" to "btn btn-get-page-style", "type" to "default", "onClick" to _ctx.getPageStyle), "getPageStyle", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btn btn-set-page-style-1", "type" to "default", "onClick" to fun(){
                    _ctx.setPageStyle(true)
                }
                ), "setPageStyle(true)", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btn btn-set-page-style-0", "type" to "default", "onClick" to fun(){
                    _ctx.setPageStyle(false)
                }
                ), "setPageStyle(false)", 8, _uA(
                    "onClick"
                )),
                _cE("text", _uM("class" to "page-style"), "当前 PageStyle"),
                _cE("text", _uM("class" to "page-style-value"), _tD(_ctx.pageStyleText), 1),
                _cE("text", _uM("class" to "status"), "状态："),
                _cE("view", _uM("class" to "status-list"), _uA(
                    _cE("text", null, "enablePullDownRefresh: " + _tD(_ctx.enablePullDownRefreshStatus), 1)
                )),
                _cE("text", _uM("class" to "tips"), "当前版本仅支持设置属性 enablePullDownRefresh")
            ))
        ), 64)
    }
    open var checked: Boolean by `$data`
    open var pages: UTSArray<Page__2> by `$data`
    open var currentPageStyle: UTSJSONObject by `$data`
    open var enablePullDownRefreshStatus: Boolean by `$data`
    open var pageStyleText: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("checked" to false, "pages" to _uA<Page__2>(), "currentPageStyle" to UTSJSONObject(), "enablePullDownRefreshStatus" to true, "pageStyleText" to computed<String>(fun(): String {
            return JSON.stringify(this.currentPageStyle)
        }
        ))
    }
    open var getPageStyle = ::gen_getPageStyle_fn
    open fun gen_getPageStyle_fn() {
        val pages = getCurrentPages()
        val currentPage = pages[pages.length - 1]
        this.currentPageStyle = currentPage.getPageStyle()
    }
    open var setPageStyle = ::gen_setPageStyle_fn
    open fun gen_setPageStyle_fn(enable: Boolean) {
        val pages = getCurrentPages()
        val currentPage = pages[pages.length - 1]
        currentPage.setPageStyle(object : UTSJSONObject() {
            var enablePullDownRefresh = enable
        })
        this.enablePullDownRefreshStatus = enable
    }
    open var startPullDownRefresh = ::gen_startPullDownRefresh_fn
    open fun gen_startPullDownRefresh_fn() {
        uni_startPullDownRefresh(null)
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
                return _uM("btn" to _pS(_uM("marginTop" to 10)), "page-style" to _pS(_uM("marginTop" to 15)), "page-style-value" to _pS(_uM("marginTop" to 5, "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5, "backgroundColor" to "#ffffff", "width" to "100%")), "status" to _pS(_uM("marginTop" to 20)), "status-list" to _pS(_uM("marginTop" to 5)), "tips" to _pS(_uM("fontSize" to 12, "marginTop" to 15, "opacity" to 0.8)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
