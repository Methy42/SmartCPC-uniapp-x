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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
open class GenPagesAPIGetElementByIdGetElementById : BasePage {
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
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("id" to "page-head", "title" to "getElementById")),
            _cE("view", _uM("style" to _nS(_uM("margin" to "0 15px"))), _uA(
                _cE("text", _uM("id" to "text"), "this is text"),
                _cE("view", _uM("id" to "view", "class" to "uni-common-mt", "style" to _nS(_uM("border" to "1px solid red"))), "this is view", 4),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.changePageHeadBackgroundColor), " 修改 page-head 背景色 ", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.changeTextColor), " 修改 text 字体颜色 ", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.changeViewStyle), " 修改 view 宽高及背景色 ", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.goMultipleRootNode), " 跳转多根节点示例 ", 8, _uA(
                    "onClick"
                ))
            ), 4)
        ), 64)
    }
    open var checked: Boolean by `$data`
    open var homePagePath: String by `$data`
    open var launchOptionsPath: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("checked" to false, "homePagePath" to "/pages/tabBar/component", "launchOptionsPath" to "")
    }
    open var getElementByNotExistId = ::gen_getElementByNotExistId_fn
    open fun gen_getElementByNotExistId_fn(): Element? {
        return uni_getElementById("not-exist-id")
    }
    open var changePageHeadBackgroundColor = ::gen_changePageHeadBackgroundColor_fn
    open fun gen_changePageHeadBackgroundColor_fn() {
        val pageHead = uni_getElementById("page-head")!!
        pageHead.style.setProperty("background-color", "red")
    }
    open var changeTextColor = ::gen_changeTextColor_fn
    open fun gen_changeTextColor_fn() {
        val text = uni_getElementById("text")!!
        text.style.setProperty("color", "red")
    }
    open var changeViewStyle = ::gen_changeViewStyle_fn
    open fun gen_changeViewStyle_fn() {
        val view = uni_getElementById<UniViewElement>("view")
        if (view != null) {
            view.style.setProperty("width", "90%")
            view.style.setProperty("height", "50px")
            view.style.setProperty("background-color", "#007AFF")
        }
    }
    open var goMultipleRootNode = ::gen_goMultipleRootNode_fn
    open fun gen_goMultipleRootNode_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/get-element-by-id/get-element-by-id-multiple-root-node"))
    }
    open var getTextOffsetLeft = ::gen_getTextOffsetLeft_fn
    open fun gen_getTextOffsetLeft_fn(): Number {
        val text = uni_getElementById("text")!!
        return text.offsetLeft
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
