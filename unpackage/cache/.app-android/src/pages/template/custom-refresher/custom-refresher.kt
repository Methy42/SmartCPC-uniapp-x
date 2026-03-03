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
open class GenPagesTemplateCustomRefresherCustomRefresher : BasePage {
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
        val _component_refresh_box = resolveComponent("refresh-box")
        return _cE("list-view", _uM("class" to "list-view", "refresher-enabled" to true, "refresher-triggered" to _ctx.refresherTriggered, "refresher-default-style" to "none", "onRefresherpulling" to _ctx.onRefresherpulling, "onRefresherrefresh" to _ctx.onRefresherrefresh, "onRefresherrestore" to _ctx.onRefreshrestore, "refresher-threshold" to _ctx.refresherThreshold, "refresher-max-drag-distance" to "200px"), _uA(
            _cE("sticky-header", null, _uA(
                _cE("view", _uM("class" to "header"), _uA(
                    _cE("text", null, "sticky header")
                ))
            )),
            _cE(Fragment, null, RenderHelpers.renderList(20, fun(i, __key, __index, _cached): Any {
                return _cE("list-item", _uM("class" to "content-item"), _uA(
                    _cE("text", _uM("class" to "text"), "item-" + _tD(i), 1)
                ))
            }
            ), 64),
            _cV(_component_refresh_box, _uM("slot" to "refresher", "state" to _ctx.state, "pullingDistance" to _ctx.pullingDistance), null, 8, _uA(
                "state",
                "pullingDistance"
            ))
        ), 40, _uA(
            "refresher-triggered",
            "onRefresherpulling",
            "onRefresherrefresh",
            "onRefresherrestore",
            "refresher-threshold"
        ))
    }
    open var refresherTriggered: Boolean by `$data`
    open var refresherThreshold: Number by `$data`
    open var pullingDistance: Number by `$data`
    open var resetting: Boolean by `$data`
    open var state: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("refresherTriggered" to false, "refresherThreshold" to 40, "pullingDistance" to 0, "resetting" to false, "state" to computed<Number>(fun(): Number {
            if (this.resetting) {
                return 3
            }
            if (this.refresherTriggered) {
                return 2
            }
            if (this.pullingDistance > this.refresherThreshold) {
                return 1
            } else {
                return 0
            }
        }
        ))
    }
    open var onRefresherpulling = ::gen_onRefresherpulling_fn
    open fun gen_onRefresherpulling_fn(e: RefresherEvent) {
        this.pullingDistance = e.detail.dy
    }
    open var onRefresherrefresh = ::gen_onRefresherrefresh_fn
    open fun gen_onRefresherrefresh_fn() {
        this.refresherTriggered = true
        setTimeout(fun(){
            this.refresherTriggered = false
            this.resetting = true
        }
        , 1500)
    }
    open var onRefreshrestore = ::gen_onRefreshrestore_fn
    open fun gen_onRefreshrestore_fn() {
        this.pullingDistance = 0
        this.resetting = false
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
                return _uM("list-view" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "backgroundColor" to "#f5f5f5")), "header" to _pS(_uM("justifyContent" to "center", "height" to 50, "backgroundColor" to "#f5f5f5", "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "content-item" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginTop" to 5, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5)), "text" to _pS(_uM("fontSize" to 14, "color" to "#666666", "lineHeight" to "20px")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM("refreshBox" to GenPagesTemplateCustomRefresherRefreshBoxRefreshBoxClass)
    }
}
