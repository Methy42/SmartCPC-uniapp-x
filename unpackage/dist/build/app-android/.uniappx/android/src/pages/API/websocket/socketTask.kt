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
import io.dcloud.uniapp.extapi.connectSocket as uni_connectSocket
import io.dcloud.uniapp.extapi.getDeviceInfo as uni_getDeviceInfo
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIWebsocketSocketTask : BasePage {
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
            this.platform = uni_getDeviceInfo(null).platform as String
        }
        , __ins)
        onUnload(fun() {
            uni_hideLoading()
            var task = this.socketTask
            if (task != null) {
                task.close(CloseSocketOptions(code = 1000, reason = "close reason from client", success = fun(res: Any){
                    console.log("uni.closeSocket success", res)
                }
                , fail = fun(err: Any){
                    console.log("uni.closeSocket fail", err)
                }
                ))
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
            _cV(_component_page_head, _uM("title" to "websocket通讯示例")),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("view", _uM("class" to "uni-btn-v"), _uA(
                    _cE("text", _uM("class" to "websocket-msg"), _tD(_ctx.showMsg), 1),
                    _cE("button", _uM("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.connect), " 连接websocket服务 ", 8, _uA(
                        "onClick"
                    )),
                    withDirectives(_cE("button", _uM("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.send), " 发送一条消息 ", 8, _uA(
                        "onClick"
                    )), _uA(
                        _uA(
                            vShow,
                            _ctx.connected
                        )
                    )),
                    withDirectives(_cE("button", _uM("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.sendArrayBuffer), " 发送一条ArrayBuffer消息,返回也是ArrayBuffer ", 8, _uA(
                        "onClick"
                    )), _uA(
                        _uA(
                            vShow,
                            _ctx.connected
                        )
                    )),
                    _cE("button", _uM("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.close), " 断开websocket服务 ", 8, _uA(
                        "onClick"
                    )),
                    _cE("text", _uM("class" to "websocket-tips"), "发送消息后会收到一条服务器返回的消息（与发送的消息内容一致）")
                ))
            ))
        ), 64)
    }
    open var connected: Boolean by `$data`
    open var connecting: Boolean by `$data`
    open var socketTask: SocketTask? by `$data`
    open var msg: String by `$data`
    open var platform: String by `$data`
    open var jest_result: Number by `$data`
    open var showMsg: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("connected" to false, "connecting" to false, "socketTask" to null as SocketTask?, "msg" to "", "platform" to "", "jest_result" to 0, "showMsg" to computed<String>(fun(): String {
            if (this.connected) {
                if (this.msg.length > 0) {
                    return "收到消息：" + this.msg
                } else {
                    return "等待接收消息"
                }
            } else {
                return "尚未连接"
            }
        }
        ))
    }
    open var connect = ::gen_connect_fn
    open fun gen_connect_fn() {
        if (this.connected || this.connecting) {
            uni_showModal(ShowModalOptions(content = "正在连接或者已经连接，请勿重复连接", showCancel = false))
            return
        }
        this.connecting = true
        uni_showLoading(ShowLoadingOptions(title = "连接中..."))
        this.socketTask = uni_connectSocket(ConnectSocketOptions(url = "wss://websocket.dcloud.net.cn", success = fun(res: Any){
            console.log("uni.connectSocket success", res)
        }
        , fail = fun(err: Any){
            console.log("uni.connectSocket fail", err)
        }
        ))
        this.socketTask?.onOpen(fun(res: Any){
            this.connecting = false
            this.connected = true
            uni_hideLoading()
            uni_showToast(ShowToastOptions(icon = "none", title = "连接成功"))
            console.log("onOpen", res)
        }
        )
        this.socketTask?.onError(fun(err: Any){
            this.connecting = false
            this.connected = false
            uni_hideLoading()
            uni_showModal(ShowModalOptions(content = "连接失败，可能是websocket服务不可用，请稍后再试", showCancel = false))
            console.log("onError", err)
        }
        )
        this.socketTask?.onMessage(fun(res: OnSocketMessageCallbackResult){
            if (res.data is ArrayBuffer) {
                var int8 = Int8Array(res.data as ArrayBuffer)
                this.msg = int8.toString()
                console.log("onMessage", res)
            } else {
                this.msg = res.data as String
                console.log("onMessage", res)
            }
        }
        )
        this.socketTask?.onClose(fun(res: Any){
            this.connected = false
            this.socketTask = null
            this.msg = ""
            console.log("onClose", res)
        }
        )
    }
    open var send = ::gen_send_fn
    open fun gen_send_fn() {
        val data = "from " + this.platform + " : " + parseInt(Math.random() * 10000 + "").toString(10)
        this.socketTask?.send(SendSocketMessageOptions(data = data, success = fun(res: Any){
            console.log(res)
        }
        , fail = fun(err: Any){
            console.log(err)
        }
        ))
    }
    open var sendArrayBuffer = ::gen_sendArrayBuffer_fn
    open fun gen_sendArrayBuffer_fn() {
        val data = ArrayBuffer(2)
        var int8 = Int8Array(data)
        int8[0] = 1
        int8[1] = 2
        this.socketTask?.send(SendSocketMessageOptions(data = data, success = fun(res: Any){
            console.log(res)
        }
        , fail = fun(err: Any){
            console.log(err)
        }
        ))
    }
    open var close = ::gen_close_fn
    open fun gen_close_fn() {
        this.socketTask?.close(CloseSocketOptions(code = 1000, reason = "close reason from client", success = fun(res: Any){
            console.log("uni.closeSocket success", res)
        }
        , fail = fun(err: Any){
            console.log("uni.closeSocket fail", err)
        }
        ))
    }
    open var jest_connectSocket = ::gen_jest_connectSocket_fn
    open fun gen_jest_connectSocket_fn() {
        this.socketTask = uni_connectSocket(ConnectSocketOptions(url = "wss://websocket.dcloud.net.cn", success = fun(_){
            this.jest_result++
        }
        , fail = fun(_){
            this.jest_result = 0
        }
        ))
        this.socketTask?.onOpen(fun(_){
            val data = "from " + this.platform + " : " + parseInt(Math.random() * 10000 + "").toString(10)
            this.socketTask?.send(SendSocketMessageOptions(data = data, success = fun(_){
                this.jest_result++
            }
            , fail = fun(_){
                this.jest_result = 0
            }
            ))
        }
        )
        this.socketTask?.onError(fun(_){
            this.jest_result = 0
        }
        )
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
                return _uM("uni-btn-v" to _pS(_uM("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "marginTop" to 10, "marginRight" to 0, "marginBottom" to 10, "marginLeft" to 0)), "websocket-msg" to _pS(_uM("paddingTop" to 40, "paddingRight" to 0, "paddingBottom" to 40, "paddingLeft" to 0, "textAlign" to "center", "fontSize" to 14, "lineHeight" to "40px", "color" to "#666666")), "websocket-tips" to _pS(_uM("paddingTop" to 40, "paddingRight" to 0, "paddingBottom" to 40, "paddingLeft" to 0, "textAlign" to "center", "fontSize" to 14, "lineHeight" to "24px", "color" to "#666666")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
