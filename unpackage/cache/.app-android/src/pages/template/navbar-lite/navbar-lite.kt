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
import io.dcloud.uniapp.extapi.setNavigationBarColor as uni_setNavigationBarColor
open class GenPagesTemplateNavbarLiteNavbarLite : BasePage {
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
        onReady(fun() {}, __ins)
        onResize(fun(_: OnResizeOptions) {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_uni_navbar_lite = resolveEasyComponent("uni-navbar-lite", GenComponentsUniNavbarLiteUniNavbarLiteClass)
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        return _cE("view", _uM("class" to "content"), _uA(
            _cV(_component_uni_navbar_lite, _uM("status-bar" to true, "stat" to "", "title" to _ctx.title, "is-left" to _ctx.isLeft, "text-color" to _ctx.navigationBarTextColor), null, 8, _uA(
                "title",
                "is-left",
                "text-color"
            )),
            _cE("view", _uM("class" to "content-item", "onClick" to _ctx.onClick), _uA(
                _cE("text", null, "点击此处，将标题切换为" + _tD(if (_ctx.isLeft) {
                    "居中"
                } else {
                    "左侧"
                }
                ) + "显示", 1)
            ), 8, _uA(
                "onClick"
            )),
            _cE("view", _uM("class" to "content-item", "onClick" to _ctx.setNavigationBarColor1), _uA(
                _cE("text", null, "设置自定义导航栏前景色白色")
            ), 8, _uA(
                "onClick"
            )),
            _cE("view", _uM("class" to "content-item", "onClick" to _ctx.setNavigationBarColor2), _uA(
                _cE("text", null, "设置自定义导航栏前景色黑色")
            ), 8, _uA(
                "onClick"
            )),
            _cE("view", _uM("style" to _nS(_uM("align-items" to "center", "height" to "60px"))), _uA(
                _cE("text", null, "测试输入框上推页面"),
                _cV(_component_radio_group, _uM("onChange" to _ctx.ChangeView, "style" to _nS(_uM("flex-direction" to "row"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return _uA(
                        _cV(_component_radio, _uM("value" to "0", "checked" to true), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE("text", null, "scroll-view")
                            )
                        }
                        ), "_" to 1)),
                        _cV(_component_radio, _uM("value" to "1"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE("text", null, "list-view")
                            )
                        }
                        ), "_" to 1)),
                        _cV(_component_radio, _uM("value" to "2"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE("text", null, "web-view")
                            )
                        }
                        ), "_" to 1))
                    )
                }
                ), "_" to 1), 8, _uA(
                    "onChange",
                    "style"
                ))
            ), 4),
            if (_ctx.indexView == 0) {
                _cE("scroll-view", _uM("key" to 0, "class" to "scroll-view", "scroll-y" to true, "refresher-enabled" to false), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(10, fun(item, __key, __index, _cached): Any {
                        return _cE("view", _uM("class" to "content-item"), _uA(
                            _cE("view", _uM("class" to "cell-item"), _uA(
                                _cE("text", _uM("class" to "text"), "内容：" + _tD(item), 1),
                                _cE("input", _uM("class" to "text", "style" to _nS(_uM("margin-top" to "8px")), "placeholder" to "备注输入框:"), null, 4)
                            ))
                        ))
                    }), 64)
                ))
            } else {
                _cC("v-if", true)
            }
            ,
            if (_ctx.indexView == 1) {
                _cE("list-view", _uM("key" to 1, "class" to "scroll-view"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(10, fun(item, __key, __index, _cached): Any {
                        return _cE("list-item", _uM("class" to "content-item"), _uA(
                            _cE("view", _uM("class" to "cell-item"), _uA(
                                _cE("text", _uM("class" to "text"), "列表项内容：" + _tD(item), 1),
                                _cE("input", _uM("class" to "text", "style" to _nS(_uM("margin-top" to "8px")), "placeholder" to "备注输入框:"), null, 4)
                            ))
                        ))
                    }), 64)
                ))
            } else {
                _cC("v-if", true)
            }
            ,
            if (_ctx.indexView == 2) {
                _cE("web-view", _uM("key" to 2, "src" to "/hybrid/html/local.html", "id" to "webv", "class" to "scroll-view"))
            } else {
                _cC("v-if", true)
            }
            ,
            _cE("view", _uM("class" to "bottomInput", "style" to _nS(_uM("bottom" to _ctx.inputBottom))), _uA(
                _cE("input", _uM("id" to "input", "style" to _nS(_uM("background-color" to "white")), "placeholder" to "滚动视图外底部输入框，焦点时手动控制显示位置", "adjust-position" to false, "onBlur" to _ctx.onInputBlur, "onKeyboardheightchange" to _ctx.onInputKeyboardChange), null, 44, _uA(
                    "onBlur",
                    "onKeyboardheightchange"
                ))
            ), 4)
        ))
    }
    open var title: String by `$data`
    open var isLeft: Boolean by `$data`
    open var navigationBarTextColor: String by `$data`
    open var indexView: Number by `$data`
    open var inputBottom: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "Hello uni-app", "isLeft" to false, "navigationBarTextColor" to "#000", "indexView" to 0, "inputBottom" to "0px")
    }
    open var onClick = ::gen_onClick_fn
    open fun gen_onClick_fn() {
        this.isLeft = !this.isLeft
    }
    open var setNavigationBarColor1 = ::gen_setNavigationBarColor1_fn
    open fun gen_setNavigationBarColor1_fn() {
        uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#ffffff", backgroundColor = "#0000", success = fun(_){
            this.navigationBarTextColor = "#fff"
            console.log("setNavigationBarColor success", " at pages/template/navbar-lite/navbar-lite.uvue:69")
            this.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(_){
            console.log("setNavigationBarColor fail", " at pages/template/navbar-lite/navbar-lite.uvue:73")
            this.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(_){
            console.log("setNavigationBarColor complete", " at pages/template/navbar-lite/navbar-lite.uvue:77")
            this.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var setNavigationBarColor2 = ::gen_setNavigationBarColor2_fn
    open fun gen_setNavigationBarColor2_fn() {
        uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#000000", backgroundColor = "#0000", success = fun(_){
            this.navigationBarTextColor = "#000"
            console.log("setNavigationBarColor success", " at pages/template/navbar-lite/navbar-lite.uvue:88")
            this.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        , fail = fun(_){
            console.log("setNavigationBarColor fail", " at pages/template/navbar-lite/navbar-lite.uvue:92")
            this.setLifeCycleNum(state.lifeCycleNum - 1)
        }
        , complete = fun(_){
            console.log("setNavigationBarColor complete", " at pages/template/navbar-lite/navbar-lite.uvue:96")
            this.setLifeCycleNum(state.lifeCycleNum + 1)
        }
        ))
    }
    open var ChangeView = ::gen_ChangeView_fn
    open fun gen_ChangeView_fn(e: UniRadioGroupChangeEvent) {
        this.indexView = parseInt(e.detail.value)
    }
    open var onInputBlur = ::gen_onInputBlur_fn
    open fun gen_onInputBlur_fn(_0: UniInputBlurEvent) {
        this.inputBottom = "0px"
    }
    open var onInputKeyboardChange = ::gen_onInputKeyboardChange_fn
    open fun gen_onInputKeyboardChange_fn(e: UniInputKeyboardHeightChangeEvent) {
        var height = e.detail.height
        this.inputBottom = "" + height + "px"
    }
    open var getLifeCycleNum = ::gen_getLifeCycleNum_fn
    open fun gen_getLifeCycleNum_fn(): Number {
        return state.lifeCycleNum
    }
    open var setLifeCycleNum = ::gen_setLifeCycleNum_fn
    open fun gen_setLifeCycleNum_fn(num: Number) {
        uni.UNI2A1DFEF.setLifeCycleNum(num)
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
                return _uM("content" to _pS(_uM("display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "scroll-view" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "backgroundColor" to "#f5f5f5", "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "content-item" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginTop" to 5, "marginRight" to 10, "marginBottom" to 5, "marginLeft" to 10, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5)), "cell-item" to _pS(_uM("display" to "flex", "flexDirection" to "column")), "text" to _pS(_uM("fontSize" to 14, "color" to "#666666")), "bottomInput" to _pS(_uM("position" to "relative", "zIndex" to 1000, "paddingTop" to 0, "paddingRight" to 5, "paddingBottom" to 0, "paddingLeft" to 5, "marginBottom" to "var(--uni-safe-area-inset-bottom)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
