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
open class GenPagesComponentScrollViewScrollViewProps : BasePage {
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
            run {
                var i: Number = 0
                while(i < 10){
                    val item = Item(id = "item" + i, label = "item" + i)
                    this.items.push(item)
                    i++
                }
            }
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_switch = resolveComponent("switch")
        val _component_slider = resolveComponent("slider")
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "非下拉刷新的scroll-view属性示例")),
            if (isTrue(_ctx.scrollX)) {
                _cE("scroll-view", _uM("key" to 0, "direction" to "horizontal", "scroll-top" to _ctx.scrollTop, "scroll-left" to _ctx.scrollLeft, "upper-threshold" to _ctx.upperThreshold, "lower-threshold" to _ctx.lowerThreshold, "scroll-into-view" to _ctx.scrollIntoView, "enable-back-to-top" to _ctx.enableBackToTop, "scroll-with-animation" to _ctx.scrollWithAnimation, "style" to _nS(_uM("flex-direction" to "row")), "class" to "uni-margin-wrap", "show-scrollbar" to _ctx.showScrollbar, "bounces" to _ctx.bounces, "onScrolltoupper" to _ctx.scrolltoupper, "onScrolltolower" to _ctx.scrolltolower, "onScroll" to _ctx.scroll, "onScrollend" to _ctx.scrollend, "ref" to "scrollViewX", "id" to "scrollViewX"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                        return _cE("view", _uM("class" to _nC(_uA(
                            "item",
                            if (index == 9) {
                                "h-margin-right"
                            } else {
                                ""
                            }
                        )), "id" to ("horizontal_" + item.id)), _uA(
                            _cE("text", _uM("class" to "uni-text"), _tD(item.label), 1)
                        ), 10, _uA(
                            "id"
                        ))
                    }), 256)
                ), 44, _uA(
                    "scroll-top",
                    "scroll-left",
                    "upper-threshold",
                    "lower-threshold",
                    "scroll-into-view",
                    "enable-back-to-top",
                    "scroll-with-animation",
                    "show-scrollbar",
                    "bounces",
                    "onScrolltoupper",
                    "onScrolltolower",
                    "onScroll",
                    "onScrollend"
                ))
            } else {
                _cE("scroll-view", _uM("key" to 1, "direction" to "vertical", "scroll-top" to _ctx.scrollTop, "scroll-left" to _ctx.scrollLeft, "upper-threshold" to _ctx.upperThreshold, "lower-threshold" to _ctx.lowerThreshold, "scroll-into-view" to _ctx.scrollIntoView, "enable-back-to-top" to _ctx.enableBackToTop, "scroll-with-animation" to _ctx.scrollWithAnimation, "show-scrollbar" to _ctx.showScrollbar, "bounces" to _ctx.bounces, "onScrolltoupper" to _ctx.scrolltoupper, "onTouchmove" to _ctx.onTouchMove, "onScrolltolower" to _ctx.scrolltolower, "onScroll" to _ctx.scroll, "onScrollend" to _ctx.scrollend, "ref" to "scrollViewY", "id" to "scrollViewY", "class" to "uni-margin-wrap"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                        return _cE("view", _uM("class" to _nC(_uA(
                            "item",
                            if (index == 9) {
                                "v-margin-bottom"
                            } else {
                                ""
                            }
                        )), "id" to item.id), _uA(
                            _cE("text", _uM("class" to "uni-text"), _tD(item.label), 1)
                        ), 10, _uA(
                            "id"
                        ))
                    }
                    ), 256)
                ), 40, _uA(
                    "scroll-top",
                    "scroll-left",
                    "upper-threshold",
                    "lower-threshold",
                    "scroll-into-view",
                    "enable-back-to-top",
                    "scroll-with-animation",
                    "show-scrollbar",
                    "bounces",
                    "onScrolltoupper",
                    "onTouchmove",
                    "onScrolltolower",
                    "onScroll",
                    "onScrollend"
                ))
            }
            ,
            _cE("scroll-view", _uM("class" to "uni-list", "showScrollbar" to true, "scroll-y" to true), _uA(
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "点击状态栏回到顶部（仅iOS）"),
                    _cV(_component_switch, _uM("checked" to _ctx.enableBackToTop, "onChange" to fun(){
                        _ctx.enableBackToTop = !_ctx.enableBackToTop
                    }
                    ), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "是否显示滚动条"),
                    _cV(_component_switch, _uM("checked" to _ctx.showScrollbar, "onChange" to fun(){
                        _ctx.showScrollbar = !_ctx.showScrollbar
                    }
                    ), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "是否有反弹效果"),
                    _cV(_component_switch, _uM("checked" to _ctx.bounces, "onChange" to fun(){
                        _ctx.bounces = !_ctx.bounces
                    }
                    ), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "是否开启滚动时使用动画过渡"),
                    _cV(_component_switch, _uM("checked" to _ctx.scrollWithAnimation, "onChange" to fun(){
                        _ctx.scrollWithAnimation = !_ctx.scrollWithAnimation
                    }
                    ), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "是否横向滚动"),
                    _cV(_component_switch, _uM("checked" to _ctx.scrollX, "onChange" to _ctx.changeDirectionX), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "是否竖向滚动"),
                    _cV(_component_switch, _uM("checked" to _ctx.scrollY, "onChange" to _ctx.changeDirectionY), null, 8, _uA(
                        "checked",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-slider uni-list-cell-padding"), _uA(
                    _cE("text", null, "拖动设置scroll-top")
                )),
                _cE("view", _uM("class" to "uni-slider uni-list-cell-padding"), _uA(
                    _cV(_component_slider, _uM("max" to 1000, "min" to 0, "step" to 10, "value" to _ctx.scrollTop, "show-value" to true, "onChange" to _ctx.handleChangeScrollTop), null, 8, _uA(
                        "value",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-slider uni-list-cell-padding"), _uA(
                    _cE("text", null, "拖动设置scroll-left")
                )),
                _cE("view", _uM("class" to "uni-slider uni-list-cell-padding"), _uA(
                    _cV(_component_slider, _uM("max" to 1000, "min" to 0, "step" to 10, "value" to _ctx.scrollLeft, "show-value" to true, "onChange" to _ctx.handleChangeScrollLeft), null, 8, _uA(
                        "value",
                        "onChange"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "设置触发scrolltoupper的距离"),
                    _cE("input", _uM("class" to "uni-list-cell-input", "type" to "number", "value" to _ctx.upperThreshold, "onInput" to _ctx.handleUpperThresholdInput), null, 40, _uA(
                        "value",
                        "onInput"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("text", null, "设置触发scrolltolower的距离"),
                    _cE("input", _uM("class" to "uni-list-cell-input", "type" to "number", "value" to _ctx.lowerThreshold, "onInput" to _ctx.handleLowerThresholdInput), null, 40, _uA(
                        "value",
                        "onInput"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"), _uA(
                    _cE("button", _uM("type" to "primary", "class" to "button", "onClick" to _ctx.handleScrollIntoView), " 滚动到id为`item3`的子视图 ", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", _uM("class" to "uni-list-cell uni-list-cell-padding"))
            ))
        ), 64)
    }
    open var items: UTSArray<Item> by `$data`
    open var scrollX: Boolean by `$data`
    open var scrollY: Boolean by `$data`
    open var bounces: Boolean by `$data`
    open var scrollTop: Number by `$data`
    open var scrollLeft: Number by `$data`
    open var scrollChangeTop: Number by `$data`
    open var scrollIntoView: String by `$data`
    open var enableBackToTop: Boolean by `$data`
    open var scrollWithAnimation: Boolean by `$data`
    open var showScrollbar: Boolean by `$data`
    open var upperThreshold: Number by `$data`
    open var lowerThreshold: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("items" to _uA<Item>(), "scrollX" to false, "scrollY" to true, "bounces" to false, "scrollTop" to 0, "scrollLeft" to 0, "scrollChangeTop" to 0, "scrollIntoView" to "", "enableBackToTop" to false, "scrollWithAnimation" to false, "showScrollbar" to true, "upperThreshold" to 50, "lowerThreshold" to 50)
    }
    open var handleChangeScrollLeft = ::gen_handleChangeScrollLeft_fn
    open fun gen_handleChangeScrollLeft_fn(e: UniSliderChangeEvent) {
        this.scrollLeft = e.detail.value
    }
    open var handleChangeScrollTop = ::gen_handleChangeScrollTop_fn
    open fun gen_handleChangeScrollTop_fn(e: UniSliderChangeEvent) {
        this.scrollTop = e.detail.value
    }
    open var changeDirectionX = ::gen_changeDirectionX_fn
    open fun gen_changeDirectionX_fn() {
        this.scrollX = !this.scrollX
        if (this.scrollX) {
            this.scrollY = false
        }
        this.scrollTop = 0
        this.scrollLeft = 0
    }
    open var changeDirectionY = ::gen_changeDirectionY_fn
    open fun gen_changeDirectionY_fn() {
        this.scrollY = !this.scrollY
        if (this.scrollY) {
            this.scrollX = false
        }
        this.scrollTop = 0
        this.scrollLeft = 0
    }
    open var handleScrollIntoView = ::gen_handleScrollIntoView_fn
    open fun gen_handleScrollIntoView_fn() {
        if (this.scrollX) {
            this.scrollIntoView = "horizontal_item3"
        } else {
            this.scrollIntoView = "item3"
        }
        setTimeout(fun(){
            this.scrollIntoView = ""
        }
        , 0)
    }
    open var handleUpperThresholdInput = ::gen_handleUpperThresholdInput_fn
    open fun gen_handleUpperThresholdInput_fn(e: InputEvent) {
        val value = e.detail.value
        if (value == "") {
            this.upperThreshold = 50
        } else {
            this.upperThreshold = parseInt(e.detail.value)
        }
    }
    open var handleLowerThresholdInput = ::gen_handleLowerThresholdInput_fn
    open fun gen_handleLowerThresholdInput_fn(e: InputEvent) {
        val value = e.detail.value
        if (value == "") {
            this.lowerThreshold = 50
        } else {
            this.lowerThreshold = parseInt(e.detail.value)
        }
    }
    open var scrolltoupper = ::gen_scrolltoupper_fn
    open fun gen_scrolltoupper_fn() {
        console.log("滚动到顶部", " at pages/component/scroll-view/scroll-view-props.uvue:170")
    }
    open var scrolltolower = ::gen_scrolltolower_fn
    open fun gen_scrolltolower_fn() {
        console.log("滚动到底部", " at pages/component/scroll-view/scroll-view-props.uvue:173")
    }
    open var scroll = ::gen_scroll_fn
    open fun gen_scroll_fn(e: ScrollEvent) {
        this.scrollChangeTop = e.detail.scrollTop
        console.log("scroll-top : " + e.detail.scrollTop + " scroll-left : " + e.detail.scrollLeft, " at pages/component/scroll-view/scroll-view-props.uvue:177")
    }
    open var scrollend = ::gen_scrollend_fn
    open fun gen_scrollend_fn() {
        console.log("滚动停止", " at pages/component/scroll-view/scroll-view-props.uvue:180")
    }
    open var onTouchMove = ::gen_onTouchMove_fn
    open fun gen_onTouchMove_fn() {
        console.log("TouchMove", " at pages/component/scroll-view/scroll-view-props.uvue:183")
    }
    open var checkScrollHeight = ::gen_checkScrollHeight_fn
    open fun gen_checkScrollHeight_fn(): Boolean {
        var element = this.`$refs`["scrollViewY"]
        if (element != null) {
            var scrollHeight = (element as UniElement).scrollHeight
            console.log("checkScrollHeight" + scrollHeight, " at pages/component/scroll-view/scroll-view-props.uvue:190")
            if (scrollHeight > 1900) {
                return true
            }
        }
        return false
    }
    open var checkScrollWidth = ::gen_checkScrollWidth_fn
    open fun gen_checkScrollWidth_fn(): Boolean {
        var element = this.`$refs`["scrollViewX"]
        if (element != null) {
            var scrollWidth = (element as UniElement).scrollWidth
            console.log("checkScrollWidth---" + scrollWidth, " at pages/component/scroll-view/scroll-view-props.uvue:202")
            if (scrollWidth > 1900) {
                return true
            }
        }
        return false
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
                return _uM("uni-margin-wrap" to _pS(_uM("height" to 250, "marginTop" to 0, "marginRight" to 25, "marginBottom" to 25, "marginLeft" to 25)), "item" to _pS(_uM("justifyContent" to "center", "alignItems" to "center", "height" to 250, "width" to "100%", "backgroundColor" to "#F0FFFF", "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#D2691E", "borderRightColor" to "#D2691E", "borderBottomColor" to "#D2691E", "borderLeftColor" to "#D2691E")), "uni-list" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "uni-text" to _pS(_uM("color" to "#000000", "fontSize" to 50)), "uni-slider" to _pS(_uM("justifyContent" to "center")), "uni-list-cell-input" to _pS(_uM("width" to 50, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#cccccc", "borderRightColor" to "#cccccc", "borderBottomColor" to "#cccccc", "borderLeftColor" to "#cccccc", "textAlign" to "center")), "button" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "v-margin-bottom" to _pS(_uM("marginBottom" to 50)), "h-margin-right" to _pS(_uM("marginRight" to 50)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
