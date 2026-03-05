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
            onShow(fun(){})
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
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("image", _uM("class" to "background-image", "src" to "/static/background/u2.jpg", "mode" to "aspectFill")),
                    _cE("view", _uM("class" to "custom-navbar"), _uA(
                        _cE("view", _uM("class" to "nav-avatar-container"), _uA(
                            _cE("image", _uM("class" to "nav-avatar", "src" to "/static/login-avatar.png", "mode" to "aspectFill"))
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
                    _cE("view", _uM("class" to "index-logo-container"), _uA(
                        _cE("image", _uM("class" to "index-logo", "src" to "/static/index-logo.png", "mode" to "aspectFit"))
                    )),
                    _cE("view", _uM("class" to "func-grid"), _uA(
                        _cE("view", _uM("class" to "func-row"), _uA(
                            _cE("view", _uM("class" to "func-item", "onClick" to fun(){
                                onFuncClick("支部党员大会")
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to "/static/icons/party_meeting.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "func-text"), "支部党员大会")
                            ), 8, _uA(
                                "onClick"
                            )),
                            _cE("view", _uM("class" to "func-item", "onClick" to fun(){
                                onFuncClick("支部委员会")
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to "/static/icons/branch_committee.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "func-text"), "支部委员会")
                            ), 8, _uA(
                                "onClick"
                            ))
                        )),
                        _cE("view", _uM("class" to "func-row"), _uA(
                            _cE("view", _uM("class" to "func-item", "onClick" to fun(){
                                onFuncClick("党小组会")
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to "/static/icons/party_cell.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "func-text"), "党小组会")
                            ), 8, _uA(
                                "onClick"
                            )),
                            _cE("view", _uM("class" to "func-item", "onClick" to fun(){
                                onFuncClick("党课")
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to "/static/icons/party_lecture.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "func-text"), "党课")
                            ), 8, _uA(
                                "onClick"
                            ))
                        )),
                        _cE("view", _uM("class" to "func-row"), _uA(
                            _cE("view", _uM("class" to "func-item", "onClick" to fun(){
                                onFuncClick("理论学习")
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to "/static/icons/theory_study.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "func-text"), "理论学习")
                            ), 8, _uA(
                                "onClick"
                            )),
                            _cE("view", _uM("class" to "func-item", "onClick" to fun(){
                                onFuncClick("支部活动")
                            }
                            ), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to "/static/icons/branch_activity.svg", "mode" to "widthFix")),
                                _cE("text", _uM("class" to "func-text"), "支部活动")
                            ), 8, _uA(
                                "onClick"
                            ))
                        ))
                    )),
                    _cE("view", _uM("class" to "footer"), _uA(
                        _cE("view", _uM("class" to "footer-content"), _uA(
                            _cE("text", _uM("class" to "copyright"), "技术支持：南水北调（江苏）数智科技有限公司"),
                            _cE("view", _uM("class" to "share-icon-container"), _uA(
                                _cE("image", _uM("class" to "share-icon", "src" to "/static/icons/link_icon.svg", "mode" to "widthFix"))
                            ))
                        ))
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
                return _uM("container" to _pS(_uM("display" to "flex", "flexDirection" to "column", "paddingBottom" to 0, "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "position" to "relative")), "background-image" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "zIndex" to -1)), "custom-navbar" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "var(--status-bar-height, 40rpx)", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "height" to "100rpx", "width" to "100%", "boxSizing" to "border-box", "flexWrap" to "nowrap", "whiteSpace" to "nowrap")), "nav-avatar-container" to _pS(_uM("position" to "relative", "width" to "70rpx", "height" to "70rpx", "flexShrink" to 0)), "nav-avatar" to _pS(_uM("width" to "100%", "height" to "100%", "boxSizing" to "border-box")), "avatar-decoration" to _pS(_uM("position" to "absolute", "top" to "-5rpx", "right" to "-5rpx", "width" to "25rpx", "height" to "25rpx")), "decoration-star" to _pS(_uM("width" to "100%", "height" to "100%")), "nav-right-buttons" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "flexShrink" to 0, "flexWrap" to "nowrap")), "nav-dashboard-btn" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "color" to "#ffffff", "fontSize" to "26rpx", "fontFamily" to "sans-serif", "marginRight" to "20rpx", "whiteSpace" to "nowrap", "flexShrink" to 0)), "dashboard-icon" to _pS(_uM("width" to "32rpx", "height" to "32rpx", "marginRight" to "8rpx", "color" to "#ffffff", "flexShrink" to 0)), "dashboard-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "nav-message-btn" to _pS(_uM("position" to "relative", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to 0, "paddingRight" to "40rpx", "paddingBottom" to 0, "paddingLeft" to 0, "color" to "#ffffff", "fontSize" to "28rpx", "fontFamily" to "sans-serif", "whiteSpace" to "nowrap", "flexShrink" to 0)), "message-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "message-badge" to _pS(_uM("position" to "absolute", "right" to 0, "width" to "36rpx", "height" to "36rpx", "backgroundColor" to "#FF6B35", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "color" to "#ffffff", "fontSize" to "22rpx", "fontWeight" to "bold")), "func-grid" to _pS(_uM("display" to "flex", "flexDirection" to "column", "paddingTop" to "20rpx", "paddingRight" to "50rpx", "paddingBottom" to "20rpx", "paddingLeft" to "50rpx", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "func-row" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "marginBottom" to "30rpx")), "func-item" to _pS(_uM("display" to "flex", "flexDirection" to "column", "alignItems" to "center", "justifyContent" to "center", "backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.2)", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "40rpx", "paddingRight" to "20rpx", "paddingBottom" to "40rpx", "paddingLeft" to "20rpx", "width" to "48%", "minHeight" to "200rpx", "boxSizing" to "border-box")), "func-icon" to _pS(_uM("width" to "80rpx", "height" to "80rpx", "marginBottom" to "20rpx")), "func-text" to _pS(_uM("fontSize" to "32rpx", "color" to "#ffffff")), "footer" to _pS(_uM("display" to "flex", "justifyContent" to "center", "alignItems" to "center", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "width" to "100%", "boxSizing" to "border-box")), "footer-content" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "center", "flexWrap" to "nowrap")), "copyright" to _pS(_uM("fontSize" to "24rpx", "color" to "#ffffff", "whiteSpace" to "nowrap", "flexShrink" to 0)), "share-icon-container" to _pS(_uM("display" to "flex", "alignItems" to "center", "justifyContent" to "center", "width" to "48rpx", "height" to "48rpx", "backgroundColor" to "#d38c54", "marginLeft" to "10rpx", "flexShrink" to 0)), "share-icon" to _pS(_uM("width" to "24rpx", "height" to "24rpx")), "index-logo-container" to _pS(_uM("display" to "flex", "justifyContent" to "center", "alignItems" to "center")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
