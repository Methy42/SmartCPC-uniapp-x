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
import io.dcloud.uniapp.extapi.createWorker as uni_createWorker
import io.dcloud.uniapp.framework.onShow
import uts.sdk.modules.utsWorker.onWorkerError
import uts.sdk.modules.utsWorker.createWorkers
import uts.sdk.modules.utsWorker.sendWorkerMessage
import uts.sdk.modules.utsWorker.onWorkerMessage
import uts.sdk.modules.utsWorker.destroyWorker
import uts.sdk.modules.utsWorker.UTSWorkerAddListenerOptions
import uts.sdk.modules.utsWorker.UTSWorkerReceiveEventCallback
import uts.sdk.modules.utsWorker.UTSWorkerSendWorkerMessageOptions
import uts.sdk.modules.utsWorker.UTSWorkerErrorOptions
open class GenPagesAPICreateWorkerCreateWorker : BasePage {
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
            this.destory()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("class" to "container"), _uA(
            _cE("view", _uM("class" to "status-section"), _uA(
                _cE("text", _uM("class" to "status-label"), "Worker状态: "),
                _cE("text", _uM("class" to "status-text"), _tD(_ctx.statusText), 1)
            )),
            _cE("view", _uM("class" to "button-group"), _uA(
                _cE("text", _uM("class" to "description-text"), "操作步骤：1.创建Worker 2.添加消息监听 3.发送数据测试"),
                _cE("button", _uM("class" to "btn", "type" to "primary", "disabled" to _ctx.created_boolean, "onClick" to _ctx.create), "创建Worker", 8, _uA(
                    "disabled",
                    "onClick"
                )),
                _cE("button", _uM("class" to "btn", "type" to "primary", "onClick" to _ctx.onWorkerMsg), "添加消息监听", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btn", "type" to "primary", "onClick" to _ctx.onWorkerError), "添加错误监听", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btn", "onClick" to _ctx.destory, "disabled" to (_ctx.workerStatus != "created")), "销毁Worker", 8, _uA(
                    "onClick",
                    "disabled"
                ))
            )),
            _cE("view", _uM("class" to "input-section"), _uA(
                _cE("text", _uM("class" to "section-title"), "输入测试值:"),
                _cE("text", _uM("class" to "description-text"), "点击发送按钮后，会将输入值传给WorkerTask，在子线程执行+1操作后返回结果"),
                _cE("input", _uM("class" to "input-field", "modelValue" to _ctx.inputValue, "onInput" to fun(`$event`: UniInputEvent){
                    _ctx.inputValue = `$event`.detail.value
                }
                , "type" to "number", "placeholder" to "请输入数字"), null, 40, _uA(
                    "modelValue",
                    "onInput"
                )),
                _cE("button", _uM("class" to "btn", "type" to "primary", "onClick" to _ctx.sendMessage, "disabled" to (_ctx.workerStatus != "created")), "发送到WorkerTask (值+1)", 8, _uA(
                    "onClick",
                    "disabled"
                ))
            )),
            _cE("view", _uM("class" to "log-section"), _uA(
                _cE("text", _uM("class" to "section-title"), "通信日志:"),
                _cE("scroll-view", _uM("class" to "log-container", "scroll-y" to "true"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.logs, fun(log, index, __index, _cached): Any {
                        return _cE("view", _uM("key" to index, "class" to "log-item"), _uA(
                            _cE("text", _uM("class" to _nC(_uA(
                                "log-text",
                                log["type"]
                            ))), _tD(log["message"]), 3)
                        ))
                    }
                    ), 128)
                )),
                _cE("button", _uM("onClick" to _ctx.clearLogs, "class" to "btn clear-btn"), "清空日志", 8, _uA(
                    "onClick"
                ))
            ))
        ))
    }
    open var created_boolean: Boolean by `$data`
    open var workerStatus: String by `$data`
    open var isListening: Boolean by `$data`
    open var logs: UTSArray<UTSJSONObject> by `$data`
    open var inputValue: String by `$data`
    open var taskResult: String by `$data`
    open var worker: Worker? by `$data`
    open var statusText: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("created_boolean" to false, "workerStatus" to "none", "isListening" to false, "logs" to _uA<UTSJSONObject>(), "inputValue" to "1", "taskResult" to "", "worker" to null as Worker?, "statusText" to computed<String>(fun(): String {
            when (this.workerStatus) {
                "none" -> 
                    return "未创建"
                "created" -> 
                    return "已创建"
                "destroyed" -> 
                    return "已销毁"
                else -> 
                    return "未知"
            }
        }
        ))
    }
    open fun addLog(message: String, type: String = "info") {
        val now = Date()
        val timeStr = "" + now.getHours().toString(10).padStart(2, "0") + ":" + now.getMinutes().toString(10).padStart(2, "0") + ":" + now.getSeconds().toString(10).padStart(2, "0")
        val logItem: UTSJSONObject = _uO("__\$originalPosition" to UTSSourceMapPosition("logItem", "pages/API/create-worker/create-worker.uvue", 74, 15), "message" to ("[" + timeStr + "] " + message), "type" to type, "time" to timeStr)
        this.logs.unshift(logItem)
        if (this.logs.length > 50) {
            this.logs = this.logs.slice(0, 50)
        }
    }
    open var create = ::gen_create_fn
    open fun gen_create_fn() {
        this.worker = uni_createWorker(fun(): WorkerTaskImpl {
            return HelloWorkerTask()
        }
        )
        this.workerStatus = "created"
        this.addLog("Worker创建成功", "success")
        this.created_boolean = true
    }
    open var onWorkerMsg = ::gen_onWorkerMsg_fn
    open fun gen_onWorkerMsg_fn() {
        if (this.worker == null) {
            this.addLog("请先创建worker", "warning")
            return
        }
        this.worker!!.onMessage(fun(result){
            console.log("收到Worker消息:", result, " at pages/API/create-worker/create-worker.uvue:101")
            val res = result as UTSJSONObject
            val resultData = res["data"] as String
            this.taskResult = resultData
            this.inputValue = this.taskResult
            this.addLog("收到WorkerTask返回: " + resultData, "receive")
        }
        )
    }
    open var onWorkerError = ::gen_onWorkerError_fn
    open fun gen_onWorkerError_fn() {
        if (this.worker == null) {
            this.addLog("请先创建worker", "warning")
            return
        }
        this.worker!!.onError(fun(error){
            console.error("Worker发生错误:", error, " at pages/API/create-worker/create-worker.uvue:115")
        }
        )
    }
    open var sendMessage = ::gen_sendMessage_fn
    open fun gen_sendMessage_fn() {
        if (this.inputValue == "") {
            this.addLog("请输入有效的数字", "warning")
            return
        }
        val options: UTSJSONObject = _uO("__\$originalPosition" to UTSSourceMapPosition("options", "pages/API/create-worker/create-worker.uvue", 127, 15), "data" to this.inputValue, "needReply" to true)
        this.worker!!.postMessage(options, null)
        this.addLog("发送值到WorkerTask: " + this.inputValue, "send")
    }
    open var destory = ::gen_destory_fn
    open fun gen_destory_fn() {
        if (this.worker == null) {
            this.addLog("没有创建worker,无法销毁", "warning")
            return
        }
        this.worker!!.terminate()
        this.workerStatus = "destroyed"
        this.isListening = false
        this.addLog("Worker已销毁", "warning")
        this.created_boolean = false
    }
    open var clearLogs = ::gen_clearLogs_fn
    open fun gen_clearLogs_fn() {
        this.logs = _uA()
    }
    open var test_resetInputValue = ::gen_test_resetInputValue_fn
    open fun gen_test_resetInputValue_fn() {
        this.inputValue = "1"
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
                return _uM("container" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "status-section" to _pS(_uM("display" to "flex", "alignItems" to "center", "justifyContent" to "center", "marginBottom" to 20, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 8, "borderTopRightRadius" to 8, "borderBottomRightRadius" to 8, "borderBottomLeftRadius" to 8)), "status-label" to _pS(_uM("fontSize" to 16, "color" to "#666666")), "status-text" to _pS(_uM("fontSize" to 16, "fontWeight" to "bold", "marginLeft" to 8)), "button-group" to _pS(_uM("flexDirection" to "column", "marginBottom" to 10)), "input-section" to _pS(_uM("marginBottom" to 20, "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 8, "borderTopRightRadius" to 8, "borderBottomRightRadius" to 8, "borderBottomLeftRadius" to 8)), "input-field" to _pS(_uM("width" to "100%", "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#dddddd", "borderRightColor" to "#dddddd", "borderBottomColor" to "#dddddd", "borderLeftColor" to "#dddddd", "borderTopLeftRadius" to 6, "borderTopRightRadius" to 6, "borderBottomRightRadius" to 6, "borderBottomLeftRadius" to 6, "fontSize" to 16, "marginTop" to 10, "marginRight" to 0, "marginBottom" to 10, "marginLeft" to 0, "backgroundColor" to "#ffffff")), "btn" to _pS(_uM("marginBottom" to 10, "paddingTop" to 5, "paddingRight" to 10, "paddingBottom" to 5, "paddingLeft" to 10, "borderTopLeftRadius" to 6, "borderTopRightRadius" to 6, "borderBottomRightRadius" to 6, "borderBottomLeftRadius" to 6, "fontSize" to 14, "textAlign" to "center")), "log-section" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to 8, "borderTopRightRadius" to 8, "borderBottomRightRadius" to 8, "borderBottomLeftRadius" to 8, "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "section-title" to _pS(_uM("fontSize" to 18, "fontWeight" to "bold", "color" to "#333333", "marginBottom" to 10)), "log-container" to _pS(_uM("height" to 300, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#dddddd", "borderRightColor" to "#dddddd", "borderBottomColor" to "#dddddd", "borderLeftColor" to "#dddddd", "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "marginTop" to 10, "marginRight" to 0, "marginBottom" to 10, "marginLeft" to 0, "backgroundColor" to "#fafafa")), "log-item" to _pS(_uM("marginBottom" to 5)), "log-text" to _uM("" to _uM("fontSize" to 12, "lineHeight" to 1.4), ".info" to _uM("color" to "#2196F3"), ".success" to _uM("color" to "#4CAF50"), ".warning" to _uM("color" to "#ff9800"), ".error" to _uM("color" to "#f44336"), ".send" to _uM("color" to "#9C27B0"), ".receive" to _uM("color" to "#009688")), "clear-btn" to _pS(_uM("backgroundColor" to "#ff9800", "fontSize" to 12, "paddingTop" to 8, "paddingRight" to 12, "paddingBottom" to 8, "paddingLeft" to 12, "color" to "#ffffff", "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4, "textAlign" to "center")), "description-text" to _pS(_uM("fontSize" to 14, "color" to "#666666", "lineHeight" to 1.4, "marginBottom" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
