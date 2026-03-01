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
import io.dcloud.uniapp.extapi.connectEventSource as uni_connectEventSource
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
open class GenPagesAPIConnectEventSourceConnectEventSource : BasePage {
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
            if (this.eventSource != null) {
                this.eventSource?.close()
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
            _cE("button", _uM("class" to "button", "type" to "primary", "onClick" to _ctx.connect), "连接", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("class" to "button", "type" to "primary", "onClick" to _ctx.close), "关闭", 8, _uA(
                "onClick"
            )),
            _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("view", null, _uA(
                    _cE("text", _uM("style" to _nS(_uM("width" to "100%", "text-align" to "center", "margin-bottom" to "5px"))), " 显示简易操作日志(可滚动查看) ", 4),
                    _cE("button", _uM("size" to "mini", "onClick" to fun(){
                        _ctx.logList = _uA()
                    }
                    ), "清空日志", 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("style" to _nS(_uM("margin-top" to "10px"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.logList, fun(item, index, __index, _cached): Any {
                            return _cE("view", _uM("key" to index), _uA(
                                _cE("text", _uM("style" to _nS(_uM("margin-left" to "20px", "margin-right" to "20px"))), _tD(item), 5)
                            ))
                        }
                        ), 128)
                    ), 4)
                ))
            ), 4)
        ), 64)
    }
    open var logList: UTSArray<String> by `$data`
    open var title: String by `$data`
    open var url: String by `$data`
    open var eventSource: UniEventSource? by `$data`
    open var open: Boolean by `$data`
    open var receiveMessage: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("logList" to _uA<String>(), "title" to "sse", "url" to "https://request.dcloud.net.cn/api/sse/connect", "eventSource" to null as UniEventSource?, "open" to false, "receiveMessage" to false)
    }
    open var connect = ::gen_connect_fn
    open fun gen_connect_fn() {
        console.log("connect start")
        uni_showLoading(ShowLoadingOptions(title = "", mask = true))
        this.eventSource?.close()
        var headers: UTSJSONObject = UTSJSONObject()
        headers.set("header1", "value1")
        headers.set("header2", "value3")
        this.eventSource = uni_connectEventSource(ConnectEventSourceOptions(url = this.url, header = headers))
        this.eventSource?.onMessage(fun(ev){
            val log = "onMessage callback:\ntype: " + ev.type + "\n" + "data: " + ev.data + "\n\n"
            this.logList.push(log)
            this.receiveMessage = true
            uni_hideLoading()
        }
        )
        this.eventSource?.onOpen(fun(ev){
            val log = "onOpen callback: " + ev.type + "\n\n"
            this.logList.push(log)
            this.open = true
        }
        )
        this.eventSource?.onError(fun(err){
            val log = "onError callback: " + err + " \n\n"
            this.logList.push(log)
            uni_hideLoading()
        }
        )
    }
    open var close = ::gen_close_fn
    open fun gen_close_fn() {
        this.eventSource?.close()
        val log = "connect close\n\n"
        this.logList.push(log)
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
                return _uM("button" to _pS(_uM("marginLeft" to 30, "marginRight" to 30, "marginBottom" to 15)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
