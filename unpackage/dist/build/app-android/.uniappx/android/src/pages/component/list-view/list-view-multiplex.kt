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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentListViewListViewMultiplex : BasePage {
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
        onReady(fun() {
            this.listViewElement = uni_getElementById<UniListViewElement>("listview")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_switch = resolveComponent("switch")
        return _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("scroll-view", _uM("direction" to "horizontal", "style" to _nS(_uM("flex-direction" to "row"))), _uA(
                _cE("button", _uM("class" to "button_item", "onClick" to _ctx.delayShow), "测试延时显示", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "button_item", "onClick" to _ctx.switchItemContent), "修改item子元素", 8, _uA(
                    "onClick"
                ))
            ), 4),
            withDirectives(_cE("list-view", _uM("id" to "listview", "style" to _nS(_uM("flex" to "1")), "show-scrollbar" to "false", "onScrolltolower" to _ctx.onScrollTolower), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.item_count, fun(index, __key, __index, _cached): Any {
                    return _cE("list-item", _uM("id" to ("item_" + index), "class" to "item", "onClick" to fun(){
                        _ctx.itemClick(index)
                    }
                    ), _uA(
                        _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row"))), _uA(
                            _cE("text", null, _uA(
                                "item-------",
                                _cE("text", null, _tD(index), 1)
                            )),
                            _cE("scroll-view", _uM("direction" to "horizontal", "show-scrollbar" to "false", "class" to "scroll_item"), _uA(
                                _cE("text", null, "scroll-view" + _tD(index) + "：", 1),
                                _cE(Fragment, null, RenderHelpers.renderList(5, fun(tab, __key, __index, _cached): Any {
                                    return _cE("text", _uM("class" to "tip_text"), "元素" + _tD(tab), 1)
                                }
                                ), 64)
                            ))
                        ), 4),
                        withDirectives(_cE("text", null, _uA(
                            "item-------",
                            _cE("text", null, _tD(index), 1)
                        ), 512), _uA(
                            _uA(
                                vShow,
                                _ctx.displayArrow
                            )
                        )),
                        _cV(_component_switch, _uM("checked" to true))
                    ), 8, _uA(
                        "id",
                        "onClick"
                    ))
                }
                ), 256)
            ), 44, _uA(
                "onScrolltolower"
            )), _uA(
                _uA(
                    vShow,
                    _ctx.list_show
                )
            ))
        ), 4)
    }
    open var item_count: Number by `$data`
    open var list_show: Boolean by `$data`
    open var listViewElement: UniListViewElement? by `$data`
    open var displayArrow: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("item_count" to 20, "list_show" to true, "listViewElement" to null as UniListViewElement?, "displayArrow" to false)
    }
    open var onScrollTolower = ::gen_onScrollTolower_fn
    open fun gen_onScrollTolower_fn(_0: ScrollToLowerEvent) {
        setTimeout(fun(){
            this.item_count += 20
        }
        , 300)
    }
    open var listViewScrollByY = ::gen_listViewScrollByY_fn
    open fun gen_listViewScrollByY_fn(y: Number) {
        this.listViewElement?.scrollBy(0, y)
    }
    open var itemClick = ::gen_itemClick_fn
    open fun gen_itemClick_fn(index: Number) {
        console.log("itemTextClick---" + index)
    }
    open var delayShow = ::gen_delayShow_fn
    open fun gen_delayShow_fn() {
        this.list_show = !this.list_show
        this.item_count += 20
        setTimeout(fun(){
            this.list_show = !this.list_show
        }
        , 400)
    }
    open var switchItemContent = ::gen_switchItemContent_fn
    open fun gen_switchItemContent_fn() {
        this.displayArrow = !this.displayArrow
        this.modifyItemPadding(1)
    }
    open var modifyItemPadding = ::gen_modifyItemPadding_fn
    open fun gen_modifyItemPadding_fn(index: Number) {
        var element = uni_getElementById("item_" + index)
        element?.style?.setProperty("padding", "0px")
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
                return _uM("item" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginTop" to 0, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#000000", "borderRightColor" to "#000000", "borderBottomColor" to "#000000", "borderLeftColor" to "#000000", "backgroundColor" to "#fdfdfd", "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5)), "button_item" to _pS(_uM("width" to 200)), "scroll_item" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "flexDirection" to "row", "overflow" to "hidden", "marginLeft" to 10)), "tip_text" to _pS(_uM("borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopLeftRadius" to 3, "borderTopRightRadius" to 3, "borderBottomRightRadius" to 3, "borderBottomLeftRadius" to 3, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "marginTop" to 0, "marginRight" to 10, "marginBottom" to 0, "marginLeft" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
