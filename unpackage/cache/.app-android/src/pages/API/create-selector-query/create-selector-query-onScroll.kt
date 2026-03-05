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
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery
import io.dcloud.uniapp.framework.onShow
open class GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("onScroll" to _ctx.onScroll, "style" to _nS(_uM("flex" to "1"))), _uA(
            _cE(Fragment, null, RenderHelpers.renderList(60, fun(i, __key, __index, _cached): Any {
                return _cE("view", _uM("class" to "content-item"), _uA(
                    _cE("text", _uM("class" to "text"), "item-" + _tD(i), 1)
                ))
            }
            ), 64)
        ), 44, _uA(
            "onScroll"
        ))
    }
    open var count: Number by `$data`
    open var ret: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("count" to 0, "ret" to true)
    }
    open var onScroll = ::gen_onScroll_fn
    open fun gen_onScroll_fn() {
        this.count++
        console.log("scroll: ", this.count, " at pages/API/create-selector-query/create-selector-query-onScroll.uvue:23")
        uni_createSelectorQuery().`in`(this).selectAll("content-item").boundingClientRect().exec(fun(result){
            this.count--
        }
        )
        console.log("scroll: ", this.count, " at pages/API/create-selector-query/create-selector-query-onScroll.uvue:31")
        if (this.count > 0) {
            this.ret = false
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
