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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentShareElementShareElement : BasePage {
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
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass)
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "share-element")),
            _cE("view", _uM("class" to "main"), _uA(
                _cE("share-element", _uM("class" to "share-element", "share-key" to "left", "shuttle-on-pop" to _ctx.shuttleOnPopType, "transition-on-gesture" to _ctx.transitionOnGesture, "shuttle-on-push" to _ctx.shuttleOnPushType, "easing-function" to _ctx.easingFunctionType, "onClick" to fun(){
                    _ctx.openPage()
                }
                ), _uA(
                    _cE("image", _uM("style" to _nS(_uM("width" to "100px", "height" to "150px")), "src" to "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/drop-card-1.jpg"), null, 4)
                ), 8, _uA(
                    "shuttle-on-pop",
                    "transition-on-gesture",
                    "shuttle-on-push",
                    "easing-function",
                    "onClick"
                ))
            )),
            _cE("button", _uM("type" to "primary", "onClick" to _ctx.openPage, "class" to "button"), " 打开share-element页面 ", 8, _uA(
                "onClick"
            )),
            _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("view", _uM("class" to "content"), _uA(
                    _cV(_component_boolean_data, _uM("defaultValue" to _ctx.transitionOnGesture, "title" to "transition-on-gesture= true(仅iOS生效)", "onChange" to _ctx.changeTransitionOnGesture), null, 8, _uA(
                        "defaultValue",
                        "onChange"
                    )),
                    _cE("text", _uM("class" to "uni-common-mt choose-property-title"), "easing-function:"),
                    _cV(_component_radio_group, _uM("class" to "choose-property-type-radio-group", "onChange" to _ctx.handleEasingFunction), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.easingFunctionTypeList, fun(item, __key, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to "ml-10 uni-common-mt", "key" to item, "value" to item, "checked" to (_ctx.easingFunctionType == item)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(item)
                                    )
                                }
                                ), "_" to 2), 1032, _uA(
                                    "value",
                                    "checked"
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange"
                    )),
                    _cE("text", _uM("class" to "uni-common-mt choose-property-title"), "shuttle-on-push(仅iOS生效):"),
                    _cV(_component_radio_group, _uM("class" to "choose-property-type-radio-group", "onChange" to _ctx.handleShuttleOnPushType), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.shuttleOnTypeList, fun(item, __key, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to "ml-10 uni-common-mt", "key" to item, "value" to item, "checked" to (_ctx.shuttleOnPushType == item)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(item)
                                    )
                                }
                                ), "_" to 2), 1032, _uA(
                                    "value",
                                    "checked"
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange"
                    )),
                    _cE("text", _uM("class" to "uni-common-mt choose-property-title"), "shuttle-on-pop(仅iOS生效):"),
                    _cV(_component_radio_group, _uM("class" to "choose-property-type-radio-group", "onChange" to _ctx.handleShuttleOnPopType), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.shuttleOnTypeList, fun(item, __key, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to "ml-10 uni-common-mt", "key" to item, "value" to item, "checked" to (_ctx.shuttleOnPopType == item)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(item)
                                    )
                                }
                                ), "_" to 2), 1032, _uA(
                                    "value",
                                    "checked"
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange"
                    )),
                    _cE("text", _uM("class" to "uni-common-mt choose-property-title"), "animationType(页面动画降级):"),
                    _cV(_component_radio_group, _uM("class" to "choose-property-type-radio-group", "onChange" to _ctx.handleOpenAnimationType), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.openAnimationTypeList, fun(item, __key, __index, _cached): Any {
                                return _cV(_component_radio, _uM("class" to "ml-10 uni-common-mt", "key" to item, "value" to item, "checked" to (_ctx.openAnimationType == item)), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return _uA(
                                        _tD(item)
                                    )
                                }
                                ), "_" to 2), 1032, _uA(
                                    "value",
                                    "checked"
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange"
                    ))
                ))
            ), 4),
            _cE("button", _uM("onClick" to _ctx.gotoShareElementWithSwiper, "class" to "button"), " 打开share-element-with-swiper页面 ", 8, _uA(
                "onClick"
            )),
            _cE("view", _uM("style" to _nS(_uM("height" to "80px"))), null, 4),
            _cE("share-element", _uM("class" to "bottomWrap", "share-key" to "bottom", "onClick" to fun(){
                _ctx.openPage()
            }
            , "transitionOnGesture" to "true"), _uA(
                _cE("view", _uM("class" to "bottom"), _uA(
                    _cE("text", _uM("style" to _nS(_uM("color" to "white"))), "share-element(底部固定)", 4)
                ))
            ), 8, _uA(
                "onClick"
            ))
        ), 64)
    }
    open var transitionOnGesture: Boolean by `$data`
    open var shuttleOnPopType: ShuttleOnType by `$data`
    open var shuttleOnPushType: ShuttleOnType by `$data`
    open var shuttleOnTypeList: UTSArray<String> by `$data`
    open var openAnimationType: ShareElementOpenAnimationType by `$data`
    open var openAnimationTypeList: UTSArray<String> by `$data`
    open var easingFunctionType: ShareElementEasingFunctionType by `$data`
    open var easingFunctionTypeList: UTSArray<String> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("transitionOnGesture" to true, "shuttleOnPopType" to "to" as ShuttleOnType, "shuttleOnPushType" to "to" as ShuttleOnType, "shuttleOnTypeList" to _uA(
            "from",
            "to"
        ), "openAnimationType" to "slide-in-right" as ShareElementOpenAnimationType, "openAnimationTypeList" to _uA(
            "auto",
            "none",
            "slide-in-right",
            "slide-in-left",
            "slide-in-top",
            "slide-in-bottom",
            "fade-in",
            "pop-in",
            "zoom-out",
            "zoom-fade-out"
        ), "easingFunctionType" to "ease" as ShareElementEasingFunctionType, "easingFunctionTypeList" to _uA(
            "ease",
            "ease-in",
            "ease-out",
            "ease-in-out",
            "linear"
        ))
    }
    open var openPage = ::gen_openPage_fn
    open fun gen_openPage_fn() {
        uni_navigateTo(NavigateToOptions(animationType = this.openAnimationType, url = "/pages/component/share-element/share-element-to?shuttleOnPush=" + this.shuttleOnPushType + "&transitionOnGesture=" + this.transitionOnGesture))
    }
    open var gotoShareElementWithSwiper = ::gen_gotoShareElementWithSwiper_fn
    open fun gen_gotoShareElementWithSwiper_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/share-element/share-element-with-swiper"))
    }
    open var changeTransitionOnGesture = ::gen_changeTransitionOnGesture_fn
    open fun gen_changeTransitionOnGesture_fn(checked: Boolean) {
        console.log("changeTransitionOnGesture:" + checked, " at pages/component/share-element/share-element.uvue:130")
        this.transitionOnGesture = checked
    }
    open var handleOpenAnimationType = ::gen_handleOpenAnimationType_fn
    open fun gen_handleOpenAnimationType_fn(e: RadioGroupChangeEvent) {
        this.openAnimationType = e.detail.value as ShareElementOpenAnimationType
    }
    open var handleEasingFunction = ::gen_handleEasingFunction_fn
    open fun gen_handleEasingFunction_fn(e: RadioGroupChangeEvent) {
        this.easingFunctionType = e.detail.value as ShareElementEasingFunctionType
    }
    open var handleShuttleOnPopType = ::gen_handleShuttleOnPopType_fn
    open fun gen_handleShuttleOnPopType_fn(e: RadioGroupChangeEvent) {
        this.shuttleOnPopType = e.detail.value as ShuttleOnType
    }
    open var handleShuttleOnPushType = ::gen_handleShuttleOnPushType_fn
    open fun gen_handleShuttleOnPushType_fn(e: RadioGroupChangeEvent) {
        this.shuttleOnPushType = e.detail.value as ShuttleOnType
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
                return _uM("ml-10" to _pS(_uM("marginLeft" to 10)), "choose-property-title" to _pS(_uM("fontWeight" to "bold")), "choose-property-type-radio-group" to _pS(_uM("flexDirection" to "row", "flexWrap" to "wrap")), "bottomWrap" to _pS(_uM("width" to "100%", "bottom" to 0, "height" to 80, "position" to "fixed")), "bottom" to _pS(_uM("width" to "100%", "height" to "100%", "alignItems" to "center", "justifyContent" to "center", "backgroundColor" to "#007aff")), "main" to _pS(_uM("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "alignItems" to "center", "justifyContent" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
