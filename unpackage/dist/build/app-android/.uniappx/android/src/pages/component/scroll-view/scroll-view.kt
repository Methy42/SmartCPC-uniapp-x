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
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesComponentScrollViewScrollView : BasePage {
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
        val _component_navigator = resolveComponent("navigator")
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to "scroll-view,区域滚动视图")),
                _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                    _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                        _cE("text", _uM("class" to "uni-title-text"), "Vertical Scroll"),
                        _cE("text", _uM("class" to "uni-subtitle-text"), "纵向滚动")
                    )),
                    _cE("view", null, _uA(
                        _cE("scroll-view", _uM("scroll-top" to _ctx.scrollTop, "direction" to "vertical", "class" to "scroll-Y", "scroll-with-animation" to "true", "onScrolltoupper" to _ctx.upper, "onScrolltolower" to _ctx.lower, "onScroll" to _ctx.scroll, "onScrollend" to _ctx.end, "show-scrollbar" to _ctx.showScrollbar, "id" to "verticalScrollView"), _uA(
                            _cE("view", _uM("class" to "scroll-view-item uni-bg-red"), _uA(
                                _cE("text", _uM("class" to "text"), "A")
                            )),
                            _cE("view", _uM("class" to "scroll-view-item uni-bg-green"), _uA(
                                _cE("text", _uM("class" to "text"), "B")
                            )),
                            _cE("view", _uM("class" to "scroll-view-item uni-bg-blue"), _uA(
                                _cE("text", _uM("class" to "text"), "C")
                            ))
                        ), 40, _uA(
                            "scroll-top",
                            "onScrolltoupper",
                            "onScrolltolower",
                            "onScroll",
                            "onScrollend",
                            "show-scrollbar"
                        ))
                    )),
                    _cE("view", _uM("onClick" to _ctx.goTop, "class" to "uni-center uni-common-mt"), _uA(
                        _cE("text", _uM("class" to "uni-link"), "点击这里返回顶部")
                    ), 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                        _cE("text", _uM("class" to "uni-title-text"), "Horizontal Scroll"),
                        _cE("text", _uM("class" to "uni-subtitle-text"), "横向滚动")
                    )),
                    _cE("view", null, _uA(
                        _cE("scroll-view", _uM("class" to "scroll-view_H", "direction" to "horizontal", "onScroll" to _ctx.scroll, "onScrollend" to _ctx.end, "scroll-left" to _ctx.scrollLeft, "show-scrollbar" to _ctx.showScrollbar), _uA(
                            _cE("view", _uM("class" to "scroll-view-item_H uni-bg-red"), _uA(
                                _cE("text", _uM("class" to "text"), "A")
                            )),
                            _cE("view", _uM("class" to "scroll-view-item_H uni-bg-green"), _uA(
                                _cE("text", _uM("class" to "text"), "B")
                            )),
                            _cE("view", _uM("class" to "scroll-view-item_H uni-bg-blue"), _uA(
                                _cE("text", _uM("class" to "text"), "C")
                            ))
                        ), 40, _uA(
                            "onScroll",
                            "onScrollend",
                            "scroll-left",
                            "show-scrollbar"
                        ))
                    )),
                    _cV(_component_navigator, _uM("url" to "/pages/component/scroll-view/scroll-view-props", "hover-class" to "none"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE("button", _uM("type" to "primary", "class" to "button"), " 非下拉刷新的属性示例 ")
                        )
                    }
                    ), "_" to 1)),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cV(_component_navigator, _uM("url" to "/pages/component/scroll-view/scroll-view-refresher-props", "hover-class" to "none"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE("button", _uM("type" to "primary", "class" to "button"), " 下拉刷新的属性示例 ")
                        )
                    }
                    ), "_" to 1)),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cV(_component_navigator, _uM("url" to "/pages/component/scroll-view/scroll-view-refresher", "hover-class" to "none"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE("button", _uM("type" to "primary", "class" to "button"), " 默认下拉刷新示例 ")
                        )
                    }
                    ), "_" to 1)),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cV(_component_navigator, _uM("url" to "/pages/component/scroll-view/scroll-view-custom-refresher-props", "hover-class" to "none"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE("button", _uM("type" to "primary", "class" to "button"), " 自定义下拉刷新示例 ")
                        )
                    }
                    ), "_" to 1)),
                    _cE("view", _uM("class" to "uni-common-pb"))
                ))
            ))
        ))
    }
    open var scrollTop: Number by `$data`
    open var oldScrollTop: Number by `$data`
    open var scrollLeft: Number by `$data`
    open var showScrollbar: Boolean by `$data`
    open var isScrollTest: String by `$data`
    open var isScrolltolowerTest: String by `$data`
    open var isScrolltoupperTest: String by `$data`
    open var scrollDetailTest: UniScrollEventDetail? by `$data`
    open var scrollEndDetailTest: UniScrollEventDetail? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("scrollTop" to 0, "oldScrollTop" to 0, "scrollLeft" to 120, "showScrollbar" to true, "isScrollTest" to "", "isScrolltolowerTest" to "", "isScrolltoupperTest" to "", "scrollDetailTest" to null as UniScrollEventDetail?, "scrollEndDetailTest" to null as UniScrollEventDetail?)
    }
    open var upper = ::gen_upper_fn
    open fun gen_upper_fn(e: UniScrollToUpperEvent) {
        console.log("滚动到顶部/左边", e)
        this.checkEventTest(ScrollEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget, direction = e.detail.direction), "scrolltoupper")
    }
    open var lower = ::gen_lower_fn
    open fun gen_lower_fn(e: UniScrollToLowerEvent) {
        console.log("滚动到底部/右边", e)
        this.checkEventTest(ScrollEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget, direction = e.detail.direction), "scrolltolower")
    }
    open var scroll = ::gen_scroll_fn
    open fun gen_scroll_fn(e: UniScrollEvent) {
        this.scrollDetailTest = e.detail
        this.checkEventTest(ScrollEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget), "scroll")
        this.oldScrollTop = e.detail.scrollTop
    }
    open var end = ::gen_end_fn
    open fun gen_end_fn(e: UniScrollEvent) {
        console.log("滚动结束时触发", e)
        this.scrollEndDetailTest = e.detail
        this.checkEventTest(ScrollEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget), "scrollend")
    }
    open var goTop = ::gen_goTop_fn
    open fun gen_goTop_fn() {
        this.scrollTop = this.oldScrollTop
        this.`$nextTick`(fun(){
            this.scrollTop = 0
        }
        )
        uni_showToast(ShowToastOptions(icon = "none", title = "纵向滚动 scrollTop 值已被修改为 0"))
    }
    open var checkEventTest = ::gen_checkEventTest_fn
    open fun gen_checkEventTest_fn(e: ScrollEventTest, eventName: String) {
        val isPass = e.type === eventName && e.target is UniElement && e.currentTarget is UniElement
        val result = if (isPass) {
            "" + eventName + ":Success"
        } else {
            "" + eventName + ":Fail"
        }
        when (eventName) {
            "scroll" -> 
                this.isScrollTest = result
            "scrolltolower" -> 
                this.isScrolltolowerTest = result + ("-" + e.direction)
            "scrolltoupper" -> 
                this.isScrolltoupperTest = result + ("-" + e.direction)
            else -> 
                {}
        }
    }
    open var setVerticalScrollBy = ::gen_setVerticalScrollBy_fn
    open fun gen_setVerticalScrollBy_fn(y: Number) {
        val element = uni_getElementById("verticalScrollView")
        if (element != null) {
            element.scrollBy(0, y)
        }
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
                return _uM("scroll-Y" to _pS(_uM("height" to 150)), "scroll-view_H" to _pS(_uM("width" to "100%", "flexDirection" to "row")), "scroll-view-item" to _pS(_uM("height" to 150, "justifyContent" to "center", "alignItems" to "center")), "scroll-view-item_H" to _pS(_uM("width" to "100%", "height" to 150, "justifyContent" to "center", "alignItems" to "center")), "text" to _pS(_uM("fontSize" to 18, "color" to "#ffffff")), "button" to _pS(_uM("marginTop" to 15)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
