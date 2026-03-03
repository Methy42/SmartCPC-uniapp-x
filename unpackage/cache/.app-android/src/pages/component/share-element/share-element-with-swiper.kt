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
open class GenPagesComponentShareElementShareElementWithSwiper : BasePage {
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
            _cV(_component_page_head, _uM("title" to "share-element")),
            _cE("view", _uM("class" to "main"), _uA(
                _cE("swiper", _uM("circular" to "true"), _uA(
                    _cE("swiper-item", null, _uA(
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
                    ))
                ))
            )),
            _cE("button", _uM("type" to "primary", "onClick" to _ctx.openPage, "class" to "button"), " 打开share-element页面 ", 8, _uA(
                "onClick"
            ))
        ), 64)
    }
    open var transitionOnGesture: Boolean by `$data`
    open var shuttleOnPopType: ShuttleOnType__1 by `$data`
    open var shuttleOnPushType: ShuttleOnType__1 by `$data`
    open var shuttleOnTypeList: UTSArray<String> by `$data`
    open var openAnimationType: ShareElementOpenAnimationType__1 by `$data`
    open var openAnimationTypeList: UTSArray<String> by `$data`
    open var easingFunctionType: ShareElementEasingFunctionType__1 by `$data`
    open var easingFunctionTypeList: UTSArray<String> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("transitionOnGesture" to true, "shuttleOnPopType" to "to" as ShuttleOnType__1, "shuttleOnPushType" to "to" as ShuttleOnType__1, "shuttleOnTypeList" to _uA(
            "from",
            "to"
        ), "openAnimationType" to "slide-in-right" as ShareElementOpenAnimationType__1, "openAnimationTypeList" to _uA(
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
        ), "easingFunctionType" to "ease" as ShareElementEasingFunctionType__1, "easingFunctionTypeList" to _uA(
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
