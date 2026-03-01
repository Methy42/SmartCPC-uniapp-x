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
import io.dcloud.uniapp.extapi.`$emit` as uni__emit
import io.dcloud.uniapp.extapi.`$off` as uni__off
import io.dcloud.uniapp.extapi.`$on` as uni__on
import io.dcloud.uniapp.extapi.`$once` as uni__once
open class GenPagesAPIEventBusEventBus : BasePage {
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
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", _uM("class" to "box"), _uA(
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.on), "开始监听", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.once), "监听一次", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.off), "取消监听", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.emit), "触发监听", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.clear), "清空消息", 8, _uA(
                    "onClick"
                )),
                _cE("view", null, _uA(
                    _cE("view", _uM("class" to "uni-btn"), "收到的消息："),
                    _cE("view", _uM("class" to "uni-btn"), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.log, fun(item, index, __index, _cached): Any {
                            return _cE("view", _uM("key" to index), _tD(item), 1)
                        }
                        ), 128)
                    )),
                    _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.onObj), "开始监听 obj 参数", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.emitWithObj), "触发监听 obj 参数", 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "uni-btn"), _uA(
                        _cE("text", null, "接收到的 obj 参数："),
                        _cE("text", null, _tD(JSON.stringify(_ctx.objArg)), 1)
                    )),
                    _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.testReturnId), "测试返回 id", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.testEmitNoArgs), "测试 \$emit 无参", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.testEmitMultipleArgs), "测试 \$emit 多个参数", 8, _uA(
                        "onClick"
                    ))
                ))
            ))
        ))
    }
    open var log: UTSArray<String> by `$data`
    open var objArg: UTSJSONObject by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("log" to _uA<String>(), "objArg" to UTSJSONObject())
    }
    open var fn = ::gen_fn_fn
    open fun gen_fn_fn(res: String) {
        this.log.push(res)
    }
    open var fn2 = ::gen_fn2_fn
    open fun gen_fn2_fn(res: String) {
        this.log.push(res)
    }
    open var on = ::gen_on_fn
    open fun gen_on_fn() {
        uni__on("test", this.fn)
    }
    open var on2 = ::gen_on2_fn
    open fun gen_on2_fn() {
        uni__on("test", this.fn2)
    }
    open var onObj = ::gen_onObj_fn
    open fun gen_onObj_fn() {
        uni__on("test-obj", fun(res: UTSJSONObject){
            this.objArg = res
        }
        )
    }
    open var once = ::gen_once_fn
    open fun gen_once_fn() {
        uni__once("test", this.fn)
    }
    open var off = ::gen_off_fn
    open fun gen_off_fn() {
        uni__off("test", this.fn)
    }
    open var offAll = ::gen_offAll_fn
    open fun gen_offAll_fn() {
        uni__off("test", null)
    }
    open var emit = ::gen_emit_fn
    open fun gen_emit_fn() {
        uni__emit("test", "msg:" + Date.now())
    }
    open var emitWithObj = ::gen_emitWithObj_fn
    open fun gen_emitWithObj_fn() {
        uni__emit("test-obj", object : UTSJSONObject() {
            var a: Number = 1
            var b: Number = 2
        })
    }
    open var clear = ::gen_clear_fn
    open fun gen_clear_fn() {
        this.log.length = 0
    }
    open var testReturnId = ::gen_testReturnId_fn
    open fun gen_testReturnId_fn() {
        val id1 = uni__on("test-return-id", this.fn)
        uni__emit("test-return-id", "触发 test-return-id \$on fn")
        uni__off("test-return-id", id1)
        uni__emit("test-return-id", "触发 test-return-id \$on fn")
        uni__once("test-return-id", this.fn)
        uni__emit("test-return-id", "触发 test-return-id \$once fn")
        uni__emit("test-return-id", "触发 test-return-id \$once fn")
        val id2 = uni__once("test-id", this.fn)
        uni__off("test-return-id", id2)
        uni__emit("test-return-id", "触发 test-return-id \$once fn")
    }
    open var testEmitNoArgs = ::gen_testEmitNoArgs_fn
    open fun gen_testEmitNoArgs_fn() {
        uni__on("test-emit-no-args", fun(){
            this.log.push("test-emit-no-args")
        }
        )
        uni__emit("test-emit-no-args", null)
        uni__off("test-emit-no-args", null)
    }
    open var testEmitMultipleArgs = ::gen_testEmitMultipleArgs_fn
    open fun gen_testEmitMultipleArgs_fn() {
        uni__on("test-emit-multiple-args", fun(arg1: String, arg2: Number){
            this.log.push("" + arg1 + "_" + arg2)
        }
        )
        uni__emit("test-emit-multiple-args", "arg1", 2)
        uni__off("test-emit-multiple-args", null)
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
                return _uM("box" to _pS(_uM("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
