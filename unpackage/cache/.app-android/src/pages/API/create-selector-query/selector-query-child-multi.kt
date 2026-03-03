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
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery
open class GenPagesAPICreateSelectorQuerySelectorQueryChildMulti : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onMounted(fun() {
            uni_createSelectorQuery().`in`(this).select(".selector-query-view").boundingClientRect().exec(fun(ret){
                this.text1 = JSON.stringify(ret, null, 2)
                if (ret.length == 1) {
                    this.selectCount = ret.length
                }
                this.testCounter++
                this._dispatchEvent()
            }
            )
            uni_createSelectorQuery().`in`(this).selectAll(".selector-query-view").boundingClientRect().exec(fun(ret){
                this.text2 = JSON.stringify(ret, null, 2)
                if (ret.length == 1) {
                    this.selectAllCount = (ret[0] as UTSArray<NodeInfo>).length
                }
                this.testCounter++
                this._dispatchEvent()
            }
            )
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE(Fragment, null, _uA(
            _cE("view", _uM("class" to "selector-query-view"), _uA(
                _cE("text", null, "selector-query"),
                _cE("text", _uM("class" to "text red"), _tD(_ctx.text1), 1)
            )),
            _cE("view", _uM("class" to "selector-query-view"), _uA(
                _cE("text", null, "selector-query"),
                _cE("text", _uM("class" to "text green"), _tD(_ctx.text2), 1)
            )),
            if (_ctx.text1.length > 0) {
                _cE("view", _uM("key" to 0), "1")
            } else {
                _cC("v-if", true)
            }
            ,
            _cE("text", null, _tD(_ctx.text3), 1)
        ), 64)
    }
    open var text1: String by `$data`
    open var text2: String by `$data`
    open var text3: String by `$data`
    open var viewCount: Number by `$data`
    open var selectCount: Number by `$data`
    open var selectAllCount: Number by `$data`
    open var show: Boolean by `$data`
    open var testCounter: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("text1" to "", "text2" to "", "text3" to "test-text-node", "viewCount" to 0, "selectCount" to 0, "selectAllCount" to 0, "show" to false, "testCounter" to 0)
    }
    open var _dispatchEvent = ::gen__dispatchEvent_fn
    open fun gen__dispatchEvent_fn() {
        if (this.testCounter == 2) {
            uni__emit("childReady", null)
        }
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("green" to _pS(_uM("borderTopWidth" to 3, "borderRightWidth" to 3, "borderBottomWidth" to 3, "borderLeftWidth" to 3, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#008000", "borderRightColor" to "#008000", "borderBottomColor" to "#008000", "borderLeftColor" to "#008000")), "red" to _pS(_uM("borderTopWidth" to 3, "borderRightWidth" to 3, "borderBottomWidth" to 3, "borderLeftWidth" to 3, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#FF0000", "borderRightColor" to "#FF0000", "borderBottomColor" to "#FF0000", "borderLeftColor" to "#FF0000")), "view" to _pS(_uM("borderTopWidth" to 3, "borderRightWidth" to 3, "borderBottomWidth" to 3, "borderLeftWidth" to 3, "borderTopStyle" to "dashed", "borderRightStyle" to "dashed", "borderBottomStyle" to "dashed", "borderLeftStyle" to "dashed", "borderTopColor" to "#00FF00", "borderRightColor" to "#00FF00", "borderBottomColor" to "#00FF00", "borderLeftColor" to "#00FF00", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "text" to _pS(_uM("marginTop" to 20, "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
