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
open class GenPagesComponentListViewIssue16126 : BasePage {
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
            this.listViewElement = this.`$refs`["listview"] as UniElement
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("list-view", _uM("ref" to "listview", "style" to _nS(_ctx.listViewStyle), "onScrolltolower" to _ctx.loadMore, "scroll-into-view" to _ctx.intoview, "scroll-top" to _ctx.scrolltop), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.dataList, fun(index, __key, __index, _cached): Any {
                    return _cE("list-item", _uM("class" to "listItem", "key" to index, "id" to ("item" + index), "onClick" to _ctx.changeSize, "type" to "1"), _uA(
                        _cE("text", null, _tD(index), 1)
                    ), 8, _uA(
                        "id",
                        "onClick"
                    ))
                }
                ), 128),
                _cE("list-item", _uM("class" to "listItem"), _uA(
                    _cE("text", null, "加载更多中...")
                ))
            ), 44, _uA(
                "onScrolltolower",
                "scroll-into-view",
                "scroll-top"
            ))
        ), 4)
    }
    open var listViewStyle: String by `$data`
    open var dataList: Number by `$data`
    open var intoview: String by `$data`
    open var scrolltop: Number by `$data`
    open var listViewElement: UniElement? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("listViewStyle" to "flex:1; width: 100%; heigth: 100%", "dataList" to 10, "intoview" to "", "scrolltop" to 0, "listViewElement" to null as UniElement?)
    }
    open var changeSize = ::gen_changeSize_fn
    open fun gen_changeSize_fn() {
        if (this.listViewStyle == "flex:1; width: 100%; heigth: 100%") {
            this.listViewStyle = "flex:1; width: 50%; heigth: 100%;"
        } else {
            this.listViewStyle = "flex:1; width: 100%; heigth: 100%"
        }
    }
    open var loadMore = ::gen_loadMore_fn
    open fun gen_loadMore_fn() {
        setTimeout(fun(){
            this.dataList += 10
        }
        , 1000)
    }
    open var setScrollTop = ::gen_setScrollTop_fn
    open fun gen_setScrollTop_fn(value: Number) {
        this.scrolltop = value
    }
    open var getScrollTop = ::gen_getScrollTop_fn
    open fun gen_getScrollTop_fn(): Number {
        var ret = this.listViewElement?.scrollTop ?: -1
        console.log(ret)
        return ret
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
                return _uM("listView" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "listItem" to _pS(_uM("width" to "100%", "height" to 100, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 0, "borderLeftWidth" to 1, "borderTopColor" to "#FF0000", "borderRightColor" to "#FF0000", "borderBottomColor" to "#FF0000", "borderLeftColor" to "#FF0000", "alignItems" to "center", "justifyContent" to "center")), "banner" to _pS(_uM("height" to 180, "overflow" to "hidden", "position" to "relative", "backgroundColor" to "#cccccc")), "banner-img" to _pS(_uM("width" to "100%")), "banner-title" to _pS(_uM("maxHeight" to 42, "overflow" to "hidden", "position" to "absolute", "left" to 15, "bottom" to 15, "width" to "90%", "fontSize" to 16, "fontWeight" to "400", "lineHeight" to "21px", "color" to "#FFFFFF")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
