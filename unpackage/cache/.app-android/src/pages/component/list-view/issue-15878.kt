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
open class GenPagesComponentListViewIssue15878 : BasePage {
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
        return _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("list-view", _uM("style" to _nS(_uM("flex" to "1")), "refresher-enabled" to "true", "onRefresherrefresh" to _ctx.onRefresh, "refresher-triggered" to _ctx.refresherTriggered, "refresher-default-style" to "none"), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(1000, fun(item, __key, __index, _cached): Any {
                    return _cE("list-item", _uM("class" to "item"), _tD(item), 1)
                }
                ), 64),
                _cE("list-item", _uM("class" to "refresher", "slot" to "refresher"), _uA(
                    _cE("text", _uM("class" to "refresher-text"), "自定义下拉刷新")
                ))
            ), 44, _uA(
                "onRefresherrefresh",
                "refresher-triggered"
            ))
        ), 4)
    }
    open var refresherTriggered: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("refresherTriggered" to false)
    }
    open var onRefresh = ::gen_onRefresh_fn
    open fun gen_onRefresh_fn() {
        this.refresherTriggered = true
        setTimeout(fun(){
            this.refresherTriggered = false
        }
        , 5000)
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
                return _uM("item" to _pS(_uM("height" to 50)), "refresher" to _pS(_uM("height" to 45)), "refresher-text" to _pS(_uM("lineHeight" to "45px", "textAlign" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
