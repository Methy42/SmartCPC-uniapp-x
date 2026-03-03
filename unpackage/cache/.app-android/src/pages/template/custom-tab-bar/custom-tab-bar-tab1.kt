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
open class GenPagesTemplateCustomTabBarCustomTabBarTab1 : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {
            this.loadData()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("ref" to "listView", "class" to "list", "bounces" to false, "scroll-with-animation" to true, "scroll-y" to true, "scroll-top" to _ctx.newScrollTop, "onScrolltolower" to fun(){
            _ctx.loadData()
        }
        , "onScroll" to _ctx.onScroll), _uA(
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.dataList, fun(item, index, __index, _cached): Any {
                return _cE("view", _uM("class" to "list-item", "key" to index), _uA(
                    _cE("view", _uM("class" to "cell-item"), _uA(
                        _cE("text", _uM("class" to "title"), "内容：" + _tD(item.title), 1),
                        _cE("input", _uM("class" to "title", "style" to _nS(_uM("margin-top" to "8px")), "placeholder" to "备注:"), null, 4)
                    ))
                ))
            }
            ), 128)
        ), 40, _uA(
            "scroll-top",
            "onScrolltolower",
            "onScroll"
        ))
    }
    open var dataList: UTSArray<ListItem__3> by `$data`
    open var oldScrollTop: Number by `$data`
    open var newScrollTop: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("dataList" to _uA<ListItem__3>(), "oldScrollTop" to 0, "newScrollTop" to 0)
    }
    open var loadData = ::gen_loadData_fn
    open fun gen_loadData_fn() {
        var index = this.dataList.length
        run {
            var i: Number = 0
            while(i < 20){
                this.dataList.push(ListItem__3(title = index.toString(10)))
                index++
                i++
            }
        }
    }
    open var onScroll = ::gen_onScroll_fn
    open fun gen_onScroll_fn(e: ScrollEvent) {
        uni__emit("tabchange", e.detail.scrollTop)
        this.oldScrollTop = e.detail.scrollTop
    }
    open var scrollTop = ::gen_scrollTop_fn
    open fun gen_scrollTop_fn(top: Number) {
        this.newScrollTop = this.oldScrollTop
        this.`$nextTick`(fun(){
            this.newScrollTop = top
        }
        )
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("list" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "backgroundColor" to "#ffffff")), "list-item" to _pS(_uM("flexDirection" to "row", "paddingTop" to 30, "paddingRight" to 30, "paddingBottom" to 30, "paddingLeft" to 30, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#dbdbdb")), "title" to _pS(_uM("fontSize" to 16, "textAlign" to "left")), "cell-item" to _pS(_uM("display" to "flex", "flexDirection" to "column")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
