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
import io.dcloud.uniapp.extapi.pageScrollTo as uni_pageScrollTo
open class GenPagesAPIPageScrollToPageScrollTo : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1")), "scroll-with-animation" to "true"), _uA(
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("button", _uM("type" to "default", "class" to "btn-scrollTo", "onClick" to _ctx.scrollTo), " scrollTo ", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("type" to "default", "class" to "btn-scrollToElement", "onClick" to _ctx.scrollToElement), " scrollToElement ", 8, _uA(
                    "onClick"
                )),
                _cE(Fragment, null, RenderHelpers.renderList(10, fun(_, index, __index, _cached): Any {
                    return _cE("view", _uM("class" to "uni-list", "key" to index), _uA(
                        _cE("view", _uM("class" to "uni-list-cell list-item"), _tD(index), 1)
                    ))
                }
                ), 64),
                _cE("view", _uM("class" to "custom-element"), "scrollTo-custom-element"),
                _cE(Fragment, null, RenderHelpers.renderList(10, fun(_, index2, __index, _cached): Any {
                    return _cE("view", _uM("class" to "uni-list", "key" to index2), _uA(
                        _cE("view", _uM("class" to "uni-list-cell list-item"), _tD(index2), 1)
                    ))
                }
                ), 64)
            ))
        ), 4)
    }
    open var title: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "pageScrollTo")
    }
    open var scrollTo = ::gen_scrollTo_fn
    open fun gen_scrollTo_fn() {
        uni_pageScrollTo(PageScrollToOptions(scrollTop = 100, duration = 300, success = fun(_){
            console.log("success")
        }
        ))
    }
    open var scrollToElement = ::gen_scrollToElement_fn
    open fun gen_scrollToElement_fn() {
        uni_pageScrollTo(PageScrollToOptions(selector = ".custom-element", duration = 300, success = fun(_){
            console.log("success")
        }
        ))
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
                return _uM("list-item" to _pS(_uM("height" to 100, "paddingLeft" to 30)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
