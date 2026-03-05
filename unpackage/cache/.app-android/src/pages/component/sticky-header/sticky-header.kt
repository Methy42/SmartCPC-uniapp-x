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
open class GenPagesComponentStickyHeaderStickyHeader : BasePage {
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
            this.loadListData()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("list-view", _uM("scroll-y" to true, "class" to "page", "bounces" to "false", "show-scrollbar" to "false", "scroll-top" to _ctx.scroll_top_input, "refresher-enabled" to _ctx.refresher_enabled_boolean, "refresher-triggered" to _ctx.refresher_triggered_boolean, "onRefresherrefresh" to _ctx.list_view_refresherrefresh), _uA(
            _cE("list-item", _uM("type" to "1"), _uA(
                _cE("swiper", _uM("indicator-dots" to "true", "circular" to "true", "style" to _nS(_uM("height" to "240px"))), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(3, fun(i, __key, __index, _cached): Any {
                        return _cE("swiper-item", _uM("item-id" to (i + "")), _uA(
                            _cE("image", _uM("src" to "/static/shuijiao.jpg", "style" to _nS(_uM("height" to "240px", "width" to "100%"))), null, 4),
                            _cE("text", _uM("style" to _nS(_uM("position" to "absolute"))), _tD(i), 5)
                        ), 8, _uA(
                            "item-id"
                        ))
                    }
                    ), 64)
                ), 4)
            )),
            _cE("list-item", _uM("class" to "content-item", "type" to "2"), _uA(
                _cE("text", _uM("class" to "text"), "向上滑动页面，体验sticky-header吸顶效果。")
            )),
            _cE("sticky-section", null, _uA(
                _cE("sticky-header", null, _uA(
                    _cE("scroll-view", _uM("style" to _nS(_uM("background-color" to "#f5f5f5", "flex-direction" to "row")), "direction" to "horizontal", "show-scrollbar" to false), _uA(
                        _cE("view", _uM("style" to _nS(_uM("align-self" to "flex-start", "flex-direction" to "row"))), _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.sift_item, fun(name, index, __index, _cached): Any {
                                return _cE("text", _uM("ref_for" to true, "ref" to "swipertab", "class" to "sift-item", "onClick" to fun(){
                                    _ctx.clickTH(index)
                                }
                                ), _tD(name), 9, _uA(
                                    "onClick"
                                ))
                            }
                            ), 256)
                        ), 4)
                    ), 4)
                )),
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.list_item, fun(item, index, __index, _cached): Any {
                    return _cE("list-item", _uM("key" to index, "class" to "content-item", "type" to "3"), _uA(
                        _cE("text", _uM("class" to "text"), _tD(item), 1)
                    ))
                }
                ), 128)
            ))
        ), 40, _uA(
            "scroll-top",
            "refresher-enabled",
            "refresher-triggered",
            "onRefresherrefresh"
        ))
    }
    open var sift_item: UTSArray<String> by `$data`
    open var list_item: UTSArray<String> by `$data`
    open var refresher_enabled_boolean: Boolean by `$data`
    open var refresher_triggered_boolean: Boolean by `$data`
    open var scroll_top_input: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("sift_item" to _uA(
            "排序",
            "筛选"
        ), "list_item" to _uA<String>(), "refresher_enabled_boolean" to true, "refresher_triggered_boolean" to false, "scroll_top_input" to 0)
    }
    open var list_view_refresherrefresh = ::gen_list_view_refresherrefresh_fn
    open fun gen_list_view_refresherrefresh_fn() {
        console.log("下拉刷新被触发 ", " at pages/component/sticky-header/sticky-header.uvue:51")
        this.refresher_triggered_boolean = true
        setTimeout(fun(){
            this.refresher_triggered_boolean = false
        }
        , 1500)
    }
    open var confirm_scroll_top_input = ::gen_confirm_scroll_top_input_fn
    open fun gen_confirm_scroll_top_input_fn(value: Number) {
        this.scroll_top_input = value
    }
    open var clickTH = ::gen_clickTH_fn
    open fun gen_clickTH_fn(index: Number) {
        console.log("点击表头：" + index, " at pages/component/sticky-header/sticky-header.uvue:61")
    }
    open var loadListData = ::gen_loadListData_fn
    open fun gen_loadListData_fn() {
        var lists: UTSArray<String> = _uA()
        run {
            var i: Number = 0
            while(i < 40){
                lists.push("item---" + i)
                i++
            }
        }
        this.list_item = lists
    }
    open var clearListData = ::gen_clearListData_fn
    open fun gen_clearListData_fn() {
        this.list_item = _uA()
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
                return _uM("page" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "backgroundColor" to "#f5f5f5")), "content-item" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginBottom" to 10, "backgroundColor" to "#ffffff")), "text" to _pS(_uM("fontSize" to 14, "color" to "#666666", "lineHeight" to "20px")), "sift-item" to _pS(_uM("color" to "#555555", "fontSize" to 16, "paddingTop" to 12, "paddingRight" to 15, "paddingBottom" to 12, "paddingLeft" to 15)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
