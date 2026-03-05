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
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentNestedScrollBodyNestedScrollBody : BasePage {
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
            setTimeout(fun(){
                this.swiperList = _uA(
                    object : UTSJSONObject() {
                        var type = "list1"
                    },
                    object : UTSJSONObject() {
                        var type = "list2"
                    },
                    object : UTSJSONObject() {
                        var type = "list3"
                    }
                )
                var lists: UTSArray<String> = _uA()
                run {
                    var i: Number = 0
                    while(i < 30){
                        lists.push("item---" + i)
                        i++
                    }
                }
                this.scrollData = lists
            }
            , 500)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_refresh_box = resolveComponent("refresh-box")
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1")), "type" to "nested", "direction" to "vertical", "refresher-enabled" to "true", "refresher-default-style" to "none", "bounces" to "false", "refresher-triggered" to _ctx.refresherTriggered, "onRefresherpulling" to _ctx.onRefresherpulling, "onRefresherrefresh" to _ctx.onRefresherrefresh, "onRefresherrestore" to _ctx.onRefreshrestore, "onScrollend" to _ctx.scrollEnd), _uA(
            _cE("nested-scroll-header", null, _uA(
                _cE("swiper", _uM("ref" to "header", "indicator-dots" to "true", "circular" to "true"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(3, fun(i, __key, __index, _cached): Any {
                        return _cE("swiper-item", _uM("item-id" to i), _uA(
                            _cE("image", _uM("src" to "/static/shuijiao.jpg", "style" to _nS(_uM("width" to "100%", "height" to "240px"))), null, 4)
                        ), 8, _uA(
                            "item-id"
                        ))
                    }
                    ), 64)
                ), 512)
            )),
            _cE("nested-scroll-body", null, _uA(
                _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row"))), _uA(
                        _cE("text", _uM("style" to _nS(_uM("padding" to "12px 15px"))), "nested-scroll-body", 4)
                    ), 4),
                    _cE("swiper", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, fun(item, __key, __index, _cached): Any {
                            return _cE("swiper-item", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                                _cE("list-view", _uM("bounces" to "false", "id" to "body-list", "scroll-top" to _ctx.scrollTop, "style" to _nS(_uM("flex" to "1")), "key" to item["type"], "associative-container" to "nested-scroll-view", "refresher-enabled" to false), _uA(
                                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, fun(key, __key, __index, _cached): Any {
                                        return _cE("list-item", null, _uA(
                                            _cE("view", _uM("class" to "scroll-item"), _uA(
                                                _cE("text", _uM("class" to "scroll-item-title"), _tD(key), 1)
                                            ))
                                        ))
                                    }
                                    ), 256)
                                ), 12, _uA(
                                    "scroll-top"
                                ))
                            ), 4)
                        }
                        ), 256)
                    ), 4)
                ), 4),
                _cE("text", null, "不会渲染，因为 nested-scroll-body 只会渲染第一个子节点")
            )),
            _cV(_component_refresh_box, _uM("slot" to "refresher", "state" to _ctx.state), null, 8, _uA(
                "state"
            ))
        ), 44, _uA(
            "refresher-triggered",
            "onRefresherpulling",
            "onRefresherrefresh",
            "onRefresherrestore",
            "onScrollend"
        ))
    }
    open var scrollData: UTSArray<String> by `$data`
    open var swiperList: UTSArray<UTSJSONObject> by `$data`
    open var scrollTop: Number by `$data`
    open var refresherTriggered: Boolean by `$data`
    open var pullingDistance: Number by `$data`
    open var resetting: Boolean by `$data`
    open var testScrollTop: Number by `$data`
    open var state: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("scrollData" to _uA<String>(), "swiperList" to _uA<UTSJSONObject>(), "scrollTop" to 0, "refresherTriggered" to false, "pullingDistance" to 0, "resetting" to false, "testScrollTop" to 0, "state" to computed<Number>(fun(): Number {
            if (this.resetting) {
                return 3
            }
            if (this.refresherTriggered) {
                return 2
            }
            if (this.pullingDistance > 45) {
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
    open var testBodyScrollBy = ::gen_testBodyScrollBy_fn
    open fun gen_testBodyScrollBy_fn(y: Number) {
        this.scrollTop = y
    }
    open var scrollEnd = ::gen_scrollEnd_fn
    open fun gen_scrollEnd_fn(e: UniScrollEvent) {
        this.testScrollTop = e.detail.scrollTop
        console.log("testScrollTop:", this.testScrollTop)
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
                return _uM("scroll-item" to _pS(_uM("marginLeft" to 6, "marginRight" to 6, "marginTop" to 6, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4)), "scroll-item-title" to _pS(_uM("width" to "100%", "height" to 60, "lineHeight" to "60px", "textAlign" to "center", "color" to "#555555")), "scroll-header-tiem" to _pS(_uM("height" to 200, "backgroundColor" to "#66ccff", "alignItems" to "center", "justifyContent" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM("refreshBox" to GenPagesTemplateCustomRefresherRefreshBoxRefreshBoxClass)
    }
}
