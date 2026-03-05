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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.reLaunch as uni_reLaunch
import io.dcloud.uniapp.extapi.redirectTo as uni_redirectTo
import io.dcloud.uniapp.extapi.showToast as uni_showToast
import io.dcloud.uniapp.extapi.switchTab as uni_switchTab
open class GenPagesAPINavigatorNavigator : BasePage {
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
            this.onLoadTime = Date.now()
            console.log("onLoad", this.onLoadTime, " at pages/API/navigator/navigator.uvue:91")
        }
        , __ins)
        onPageShow(fun() {
            this.onShowTime = Date.now()
            console.log("onShow", this.onShowTime, " at pages/API/navigator/navigator.uvue:95")
        }
        , __ins)
        onReady(fun() {
            this.onReadyTime = Date.now()
            console.log("onReady", this.onReadyTime, " at pages/API/navigator/navigator.uvue:99")
        }
        , __ins)
        onPageHide(fun() {
            this.onHideTime = Date.now()
            console.log("onHide", this.onHideTime, " at pages/API/navigator/navigator.uvue:103")
        }
        , __ins)
        onBackPress(fun(options: OnBackPressOptions): Boolean? {
            console.log("onBackPress", Date.now(), " at pages/API/navigator/navigator.uvue:106")
            console.log("onBackPress from", options.from, " at pages/API/navigator/navigator.uvue:107")
            return null
        }
        , __ins)
        onUnload(fun() {
            console.log("onUnload", Date.now(), " at pages/API/navigator/navigator.uvue:111")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_switch = resolveComponent("switch")
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to "navigate")),
                _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row"))), _uA(
                    _cV(_component_switch, _uM("onChange" to _ctx.onChange), null, 8, _uA(
                        "onChange"
                    )),
                    _cE("view", _uM("class" to "uni-title"), "是否启用共享元素动画")
                ), 4),
                _cE("share-element", _uM("share-key" to _ctx.shareElementKey), _uA(
                    _cE("image", _uM("style" to _nS(_uM("width" to "250px", "height" to "176px")), "src" to "/static/shuijiao.jpg", "mode" to "scaleToFill"), null, 4)
                ), 8, _uA(
                    "share-key"
                )),
                _cE("text", _uM("style" to _nS(_uM("font-size" to "13px"))), "注意：开启共享元素动画后仅支持slide-in-right和fade-in动画效果", 4),
                _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt uni-common-mb"), _uA(
                    _cE("view", _uM("class" to "direction-row"), _uA(
                        _cE("text", _uM("class" to "label"), "onLoad触发时间戳:"),
                        _cE("text", null, _tD(_ctx.onLoadTime), 1)
                    )),
                    _cE("view", _uM("class" to "direction-row"), _uA(
                        _cE("text", _uM("class" to "label"), "onShow触发时间戳:"),
                        _cE("text", null, _tD(_ctx.onShowTime), 1)
                    )),
                    _cE("view", _uM("class" to "direction-row"), _uA(
                        _cE("text", _uM("class" to "label"), "onReady触发时间戳:"),
                        _cE("text", null, _tD(_ctx.onReadyTime), 1)
                    )),
                    _cE("view", _uM("class" to "direction-row"), _uA(
                        _cE("text", _uM("class" to "label"), "onHide触发时间戳:"),
                        _cE("text", null, _tD(_ctx.onHideTime), 1)
                    )),
                    _cE("view", _uM("class" to "direction-row"), _uA(
                        _cE("text", _uM("class" to "label"), "onBackPress触发时间戳:"),
                        _cE("text", null, "见控制台")
                    )),
                    _cE("view", _uM("class" to "direction-row"), _uA(
                        _cE("text", _uM("class" to "label"), "onUnload触发时间戳:"),
                        _cE("text", null, "见控制台")
                    )),
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cE("button", _uM("onClick" to _ctx.navigateTo, "class" to "uni-btn"), " 跳转新页面，并传递数据 ", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("onClick" to _ctx.navigateBack, "class" to "uni-btn"), "返回上一页", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("onClick" to _ctx.redirectTo, "class" to "uni-btn"), "在当前页面打开", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("onClick" to _ctx.switchTab, "class" to "uni-btn"), "切换到模板选项卡", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("onClick" to _ctx.reLaunch, "class" to "uni-btn"), " 关闭所有页面，打开首页 ", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("onClick" to _ctx.navigateToErrorPage, "class" to "uni-btn"), " 打开不存在的页面 ", 8, _uA(
                            "onClick"
                        )),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.animationTypeList, fun(item, _, __index, _cached): Any {
                            return _cE("button", _uM("onClick" to fun(){
                                _ctx.navigateToAnimationType(item)
                            }
                            , "class" to "uni-btn"), "navigateTo动画(" + _tD(item) + ")", 9, _uA(
                                "onClick"
                            ))
                        }
                        ), 256),
                        _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.goOnLoadCallAPI), "测试 onLoad 调用 API", 8, _uA(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ), 4)
    }
    open var onLoadTime: Number by `$data`
    open var onShowTime: Number by `$data`
    open var onReadyTime: Number by `$data`
    open var onHideTime: Number by `$data`
    open var shareElementKey: String by `$data`
    open var animationTypeList: UTSArray<String> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("onLoadTime" to 0, "onShowTime" to 0, "onReadyTime" to 0, "onHideTime" to 0, "shareElementKey" to "", "animationTypeList" to _uA(
            "slide-in-right",
            "slide-in-left",
            "slide-in-top",
            "slide-in-bottom",
            "pop-in",
            "fade-in",
            "zoom-out",
            "zoom-fade-out",
            "none"
        ))
    }
    open var reLaunch = ::gen_reLaunch_fn
    open fun gen_reLaunch_fn() {
        uni_reLaunch(ReLaunchOptions(url = "/pages/tabBar/component", success = fun(result) {
            console.log("reLaunch success", result.errMsg, " at pages/API/navigator/navigator.uvue:118")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("reLaunch fail", error.errMsg, " at pages/API/navigator/navigator.uvue:123")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("reLaunch complete", result.errMsg, " at pages/API/navigator/navigator.uvue:128")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateTo = ::gen_navigateTo_fn
    open fun gen_navigateTo_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=Hello", success = fun(result) {
            console.log("navigateTo success", result.errMsg, " at pages/API/navigator/navigator.uvue:138")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("navigateTo fail", error.errMsg, " at pages/API/navigator/navigator.uvue:143")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("navigateTo complete", result.errMsg, " at pages/API/navigator/navigator.uvue:148")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateToAnimationType = ::gen_navigateToAnimationType_fn
    open fun gen_navigateToAnimationType_fn(animationType: AnimationType) {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=Hello", animationType = animationType, success = fun(result) {
            console.log("navigateTo success", result.errMsg, " at pages/API/navigator/navigator.uvue:159")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("navigateTo fail", error.errMsg, " at pages/API/navigator/navigator.uvue:164")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("navigateTo complete", result.errMsg, " at pages/API/navigator/navigator.uvue:169")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateToErrorPage = ::gen_navigateToErrorPage_fn
    open fun gen_navigateToErrorPage_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/error-page/error-page", success = fun(result) {
            console.log("navigateTo success", result.errMsg, " at pages/API/navigator/navigator.uvue:179")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , fail = fun(error) {
            console.log("navigateTo fail", error.errMsg, " at pages/API/navigator/navigator.uvue:184")
            uni_showToast(ShowToastOptions(title = error.errMsg, icon = "none"))
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , complete = fun(result) {
            console.log("navigateTo complete", result.errMsg, " at pages/API/navigator/navigator.uvue:193")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateToDebounce = ::gen_navigateToDebounce_fn
    open fun gen_navigateToDebounce_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=debounce", success = fun(result) {
            console.log("navigateTo success", result.errMsg, " at pages/API/navigator/navigator.uvue:203")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("navigateTo fail", error.errMsg, " at pages/API/navigator/navigator.uvue:208")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("navigateTo complete", result.errMsg, " at pages/API/navigator/navigator.uvue:213")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=debounce", success = fun(result) {
            console.log("navigateTo success", result.errMsg, " at pages/API/navigator/navigator.uvue:221")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , fail = fun(error) {
            console.log("navigateTo fail", error.errMsg, " at pages/API/navigator/navigator.uvue:226")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , complete = fun(result) {
            console.log("navigateTo complete", result.errMsg, " at pages/API/navigator/navigator.uvue:231")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateToRelativePath1 = ::gen_navigateToRelativePath1_fn
    open fun gen_navigateToRelativePath1_fn() {
        uni_navigateTo(NavigateToOptions(url = "new-page/new-page-1?data=new-page/new-page-1", success = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateToRelativePath2 = ::gen_navigateToRelativePath2_fn
    open fun gen_navigateToRelativePath2_fn() {
        uni_navigateTo(NavigateToOptions(url = "./new-page/new-page-1?data=./new-page/new-page-1", success = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateToRelativePath3 = ::gen_navigateToRelativePath3_fn
    open fun gen_navigateToRelativePath3_fn() {
        uni_navigateTo(NavigateToOptions(url = "../navigator/new-page/new-page-1?data=../navigator/new-page/new-page-1", success = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(_) {
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateBack = ::gen_navigateBack_fn
    open fun gen_navigateBack_fn() {
        uni_navigateBack(NavigateBackOptions(success = fun(result) {
            console.log("navigateBack success", result.errMsg, " at pages/API/navigator/navigator.uvue:285")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("navigateBack fail", error.errMsg, " at pages/API/navigator/navigator.uvue:290")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("navigateBack complete", result.errMsg, " at pages/API/navigator/navigator.uvue:295")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var navigateBackWithDelta1 = ::gen_navigateBackWithDelta1_fn
    open fun gen_navigateBackWithDelta1_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1", success = fun(_) {
            uni_navigateBack(NavigateBackOptions(delta = 1, success = fun(result) {
                console.log("navigateBack success", result.errMsg, " at pages/API/navigator/navigator.uvue:308")
                uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
            }
            , fail = fun(error) {
                console.log("navigateBack fail", error.errMsg, " at pages/API/navigator/navigator.uvue:313")
                uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
            }
            , complete = fun(result) {
                console.log("navigateBack complete", result.errMsg, " at pages/API/navigator/navigator.uvue:318")
                uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
            }
            ))
        }
        ))
    }
    open var navigateBackWithDelta100 = ::gen_navigateBackWithDelta100_fn
    open fun gen_navigateBackWithDelta100_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1", success = fun(_) {
            uni_navigateBack(NavigateBackOptions(delta = 100, success = fun(result) {
                console.log("navigateBack success", result.errMsg, " at pages/API/navigator/navigator.uvue:333")
                uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
            }
            , fail = fun(error) {
                console.log("navigateBack fail", error.errMsg, " at pages/API/navigator/navigator.uvue:338")
                uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
            }
            , complete = fun(result) {
                console.log("navigateBack complete", result.errMsg, " at pages/API/navigator/navigator.uvue:343")
                uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
            }
            ))
        }
        ))
    }
    open var redirectTo = ::gen_redirectTo_fn
    open fun gen_redirectTo_fn() {
        uni_redirectTo(RedirectToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=Hello", success = fun(result) {
            console.log("redirectTo success", result.errMsg, " at pages/API/navigator/navigator.uvue:355")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("redirectTo fail", error.errMsg, " at pages/API/navigator/navigator.uvue:360")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("redirectTo complete", result.errMsg, " at pages/API/navigator/navigator.uvue:365")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var switchTab = ::gen_switchTab_fn
    open fun gen_switchTab_fn() {
        uni_switchTab(SwitchTabOptions(url = "/pages/tabBar/template", success = fun(result) {
            console.log("switchTab success", result.errMsg, " at pages/API/navigator/navigator.uvue:375")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(error) {
            console.log("switchTab fail", error.errMsg, " at pages/API/navigator/navigator.uvue:380")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(result) {
            console.log("switchTab complete", result.errMsg, " at pages/API/navigator/navigator.uvue:385")
            uni.UNI2A1DFEF.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var getLifeCycleNum = ::gen_getLifeCycleNum_fn
    open fun gen_getLifeCycleNum_fn(): Number {
        return state.lifeCycleNum
    }
    open var setLifeCycleNum = ::gen_setLifeCycleNum_fn
    open fun gen_setLifeCycleNum_fn(num: Number) {
        uni.UNI2A1DFEF.setLifeCycleNum(num)
    }
    open var onChange = ::gen_onChange_fn
    open fun gen_onChange_fn(event: UniSwitchChangeEvent) {
        if (event.detail.value) {
            this.shareElementKey = "test-share-element-key"
        } else {
            this.shareElementKey = ""
        }
    }
    open var goOnLoadCallAPI = ::gen_goOnLoadCallAPI_fn
    open fun gen_goOnLoadCallAPI_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/onLoad-call-api"))
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
                return _uM("direction-row" to _pS(_uM("flexDirection" to "row")), "label" to _pS(_uM("width" to 190)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
