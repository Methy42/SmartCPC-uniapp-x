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
import io.dcloud.uniapp.extapi.switchTab as uni_switchTab
open class GenPagesIndexIndex : BasePage {
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
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexIndex) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesIndexIndex
            val _cache = __ins.renderCache
            val funcList = ref(_uA<FuncItem>(FuncItem(name = "支部党员大会", icon = "/static/icons/party_meeting.svg"), FuncItem(name = "支部委员会", icon = "/static/icons/branch_committee.svg"), FuncItem(name = "党小组会", icon = "/static/icons/party_cell.svg"), FuncItem(name = "党课", icon = "/static/icons/party_lecture.svg"), FuncItem(name = "理论学习", icon = "/static/icons/theory_study.svg"), FuncItem(name = "支部活动", icon = "/static/icons/branch_activity.svg")))
            val navigateToStatistics = fun(){
                uni_switchTab(SwitchTabOptions(url = "/pages/statistics/statistics"))
            }
            val onFuncClick = fun(name: String){
                var url = ""
                when (name) {
                    "支部党员大会", "支部委员会", "党小组会", "党课" -> 
                        url = "/pages/meeting/meetingList"
                    "理论学习" -> 
                        url = "/pages/meeting/meetingList"
                    "支部活动" -> 
                        url = "/pages/activity/activityList"
                }
                if (url.length > 0) {
                    uni_switchTab(SwitchTabOptions(url = url))
                }
            }
            return fun(): Any? {
                val _component_u_button = resolveComponent("u-button")
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("image", _uM("class" to "background-image", "src" to "/static/background/u2.jpg", "mode" to "aspectFill")),
                    _cE("view", _uM("class" to "custom-navbar"), _uA(
                        _cE("view", _uM("class" to "nav-avatar-container"), _uA(
                            _cE("image", _uM("class" to "nav-avatar", "src" to "/static/login-avatar.png", "mode" to "aspectFill")),
                            _cE("view", _uM("class" to "avatar-decoration"), _uA(
                                _cE("image", _uM("class" to "decoration-star", "src" to "/static/star.png", "mode" to "widthFix"))
                            ))
                        )),
                        _cE("view", _uM("class" to "nav-right-buttons"), _uA(
                            _cE("view", _uM("class" to "nav-dashboard-btn", "onClick" to navigateToStatistics), _uA(
                                _cE("image", _uM("class" to "dashboard-icon", "src" to "/static/icons/dashboard.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "dashboard-text"), "数据看板")
                            )),
                            _cE("view", _uM("class" to "nav-message-btn"), _uA(
                                _cE("text", _uM("class" to "message-text"), "消息"),
                                _cE("view", _uM("class" to "message-badge"), "4")
                            ))
                        ))
                    )),
                    _cE("view", _uM("class" to "func-grid"), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(funcList.value, fun(item, index, __index, _cached): Any {
                            return _cE("view", _uM("class" to _nC(_uA(
                                "func-item",
                                _uM("func-odd" to (index % 2 === 0))
                            )), "key" to index, "onClick" to fun(){
                                onFuncClick(item.name)
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to item.icon, "mode" to "widthFix"), null, 8, _uA(
                                    "src"
                                )),
                                _cE("text", _uM("class" to "func-text"), _tD(item.name), 1)
                            ), 10, _uA(
                                "onClick"
                            ))
                        }
                        ), 128)
                    )),
                    _cE("view", _uM("class" to "footer"), _uA(
                        _cE("text", _uM("class" to "copyright"), "技术支持：南水北调（江苏）数智科技有限公司"),
                        _cV(_component_u_button, _uM("class" to "share-btn", "shape" to "circle", "icon" to "share", "size" to "mini", "type" to "primary"))
                    ))
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("container" to _pS(_uM("display" to "flex", "flexDirection" to "column", "paddingBottom" to 0, "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "position" to "relative")), "background-image" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "zIndex" to -1)), "custom-navbar" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "var(--status-bar-height, 40rpx)", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "height" to "100rpx", "width" to "100%", "boxSizing" to "border-box", "flexWrap" to "nowrap", "whiteSpace" to "nowrap")), "nav-avatar-container" to _pS(_uM("position" to "relative", "width" to "70rpx", "height" to "70rpx", "flexShrink" to 0)), "nav-avatar" to _pS(_uM("width" to "100%", "height" to "100%", "borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#FFD700", "borderRightColor" to "#FFD700", "borderBottomColor" to "#FFD700", "borderLeftColor" to "#FFD700", "boxSizing" to "border-box")), "avatar-decoration" to _pS(_uM("position" to "absolute", "top" to "-5rpx", "right" to "-5rpx", "width" to "25rpx", "height" to "25rpx")), "decoration-star" to _pS(_uM("width" to "100%", "height" to "100%")), "nav-right-buttons" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "flexShrink" to 0, "flexWrap" to "nowrap")), "nav-dashboard-btn" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "color" to "#ffffff", "fontSize" to "26rpx", "fontFamily" to "sans-serif", "marginRight" to "20rpx", "whiteSpace" to "nowrap", "flexShrink" to 0)), "dashboard-icon" to _pS(_uM("width" to "32rpx", "height" to "32rpx", "marginRight" to "8rpx", "color" to "#ffffff", "flexShrink" to 0)), "dashboard-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "nav-message-btn" to _pS(_uM("position" to "relative", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to 0, "paddingRight" to "40rpx", "paddingBottom" to 0, "paddingLeft" to 0, "color" to "#ffffff", "fontSize" to "28rpx", "fontFamily" to "sans-serif", "whiteSpace" to "nowrap", "flexShrink" to 0)), "message-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "message-badge" to _pS(_uM("position" to "absolute", "right" to 0, "width" to "36rpx", "height" to "36rpx", "backgroundColor" to "#FF6B35", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "color" to "#ffffff", "fontSize" to "22rpx", "fontWeight" to "bold")), "func-grid" to _pS(_uM("display" to "flex", "flexWrap" to "wrap", "paddingTop" to "40rpx", "paddingRight" to "50rpx", "paddingBottom" to "40rpx", "paddingLeft" to "50rpx", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "func-item" to _pS(_uM("display" to "flex", "flexDirection" to "column", "alignItems" to "center", "justifyContent" to "center", "backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.2)", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "40rpx", "paddingRight" to "20rpx", "paddingBottom" to "40rpx", "paddingLeft" to "20rpx", "width" to "50%", "marginBottom" to "30rpx")), "func-odd" to _pS(_uM("marginRight" to "30rpx")), "func-icon" to _pS(_uM("width" to "80rpx", "height" to "80rpx", "marginBottom" to "20rpx")), "func-text" to _pS(_uM("fontSize" to "32rpx", "color" to "#ffffff")), "footer" to _pS(_uM("display" to "flex", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx")), "copyright" to _pS(_uM("fontSize" to "24rpx", "color" to "#ffffff")), "share-btn" to _pS(_uM("width" to "60rpx", "height" to "60rpx", "backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.3)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
