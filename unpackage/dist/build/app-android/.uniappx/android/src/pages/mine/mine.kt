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
import io.dcloud.uniapp.extapi.clearStorageSync as uni_clearStorageSync
import io.dcloud.uniapp.extapi.getStorageSync as uni_getStorageSync
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.reLaunch as uni_reLaunch
open class GenPagesMineMine : BasePage {
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
        var setup: (__props: GenPagesMineMine) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesMineMine
            val _cache = __ins.renderCache
            onShow(fun(){
                val t = uni_getStorageSync("user_token")
                val hasToken: Boolean = (t != null) && ((t as String).length > 0)
                if (hasToken === false) {
                    uni_reLaunch(ReLaunchOptions(url = "/pages/login/login"))
                }
            }
            )
            fun gen_goPersonalInfo_fn() {
                uni_navigateTo(NavigateToOptions(url = "/pages/mine/personal-info"))
            }
            val goPersonalInfo = ::gen_goPersonalInfo_fn
            fun gen_goChangePassword_fn() {
                uni_navigateTo(NavigateToOptions(url = "/pages/mine/change-password"))
            }
            val goChangePassword = ::gen_goChangePassword_fn
            fun gen_logout_fn() {
                uni_clearStorageSync()
                uni_reLaunch(ReLaunchOptions(url = "/pages/login/login"))
            }
            val logout = ::gen_logout_fn
            return fun(): Any? {
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("image", _uM("class" to "background-image", "src" to "/static/background/u2.jpg", "mode" to "aspectFill")),
                    _cE("view", _uM("class" to "custom-navbar"), _uA(
                        _cE("view", _uM("class" to "nav-avatar-container"), _uA(
                            _cE("image", _uM("class" to "nav-avatar", "src" to "/static/login-avatar.png", "mode" to "aspectFill"))
                        )),
                        _cE("view", _uM("class" to "nav-logo-container"), _uA(
                            _cE("image", _uM("class" to "nav-logo", "src" to "/static/index-logo.png", "mode" to "aspectFit"))
                        )),
                        _cE("view", _uM("class" to "nav-right-buttons"), _uA(
                            _cE("view", _uM("class" to "nav-message-btn"), _uA(
                                _cE("text", _uM("class" to "message-text"), "消息"),
                                _cE("view", _uM("class" to "message-badge"), "4")
                            ))
                        ))
                    )),
                    _cE("view", _uM("class" to "content-container"), _uA(
                        _cE("view", _uM("class" to "content-title-container"), _uA(
                            _cE("image", _uM("class" to "content-title-background", "src" to "/static/mine-title-background.png", "mode" to "aspectFit")),
                            _cE("text", _uM("class" to "content-title-text"), "个人中心")
                        )),
                        _cE("view", _uM("class" to "profile-card"), _uA(
                            _cE("view", _uM("class" to "avatar-circle"), _uA(
                                _cE("image", _uM("class" to "profile-avatar", "src" to "/static/avatar.png", "mode" to "aspectFill"))
                            )),
                            _cE("view", _uM("class" to "profile-info"), _uA(
                                _cE("view", _uM("class" to "name-id-row"), _uA(
                                    _cE("text", _uM("class" to "name"), "李绍丽"),
                                    _cE("view", _uM("class" to "id-chip"), _uA(
                                        _cE("text", _uM("class" to "id"), "党员")
                                    ))
                                )),
                                _cE("text", _uM("class" to "branch-text"), "所在党组织：数智公司党支部")
                            ))
                        )),
                        _cE("view", _uM("class" to "menu-card"), _uA(
                            _cE("view", _uM("class" to "menu-item", "onClick" to goPersonalInfo), _uA(
                                _cE("view", _uM("class" to "menu-left"), _uA(
                                    _cE("image", _uM("class" to "menu-icon", "src" to "/static/icons/user-info.svg", "mode" to "widthFix")),
                                    _cE("text", _uM("class" to "menu-text"), "个人资料")
                                )),
                                _cE("image", _uM("class" to "menu-arrow", "src" to "/static/icons/arrow-right.png", "mode" to "aspectFit"))
                            )),
                            _cE("view", _uM("class" to "menu-item", "onClick" to goChangePassword), _uA(
                                _cE("view", _uM("class" to "menu-left"), _uA(
                                    _cE("image", _uM("class" to "menu-icon", "src" to "/static/icons/changepassword.svg", "mode" to "widthFix")),
                                    _cE("text", _uM("class" to "menu-text"), "修改密码")
                                )),
                                _cE("image", _uM("class" to "menu-arrow", "src" to "/static/icons/arrow-right.png", "mode" to "aspectFit"))
                            )),
                            _cE("view", _uM("class" to "menu-item", "onClick" to logout, "style" to _nS(_uM("border-bottom" to "none"))), _uA(
                                _cE("view", _uM("class" to "menu-left"), _uA(
                                    _cE("image", _uM("class" to "menu-icon", "src" to "/static/icons/logout.svg", "mode" to "widthFix")),
                                    _cE("text", _uM("class" to "menu-text"), "退出登录")
                                )),
                                _cE("image", _uM("class" to "menu-arrow", "src" to "/static/icons/arrow-right.png", "mode" to "aspectFit"))
                            ), 4)
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
                return _uM("container" to _pS(_uM("backgroundColor" to "#F5F5F5", "display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingBottom" to "100rpx")), "background-image" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "zIndex" to -1)), "custom-navbar" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "var(--status-bar-height, 40rpx)", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "height" to "100rpx", "width" to "100%", "boxSizing" to "border-box", "flexWrap" to "nowrap", "whiteSpace" to "nowrap")), "nav-avatar-container" to _pS(_uM("position" to "relative", "width" to "70rpx", "height" to "70rpx", "flexShrink" to 0)), "nav-avatar" to _pS(_uM("width" to "100%", "height" to "100%", "boxSizing" to "border-box")), "avatar-decoration" to _pS(_uM("position" to "absolute", "top" to "-5rpx", "right" to "-5rpx", "width" to "25rpx", "height" to "25rpx")), "decoration-star" to _pS(_uM("width" to "100%", "height" to "100%")), "nav-logo-container" to _pS(_uM("display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "nav-right-buttons" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "flexShrink" to 0, "flexWrap" to "nowrap")), "nav-dashboard-btn" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "color" to "#ffffff", "fontSize" to "26rpx", "fontFamily" to "sans-serif", "marginRight" to "20rpx", "whiteSpace" to "nowrap", "flexShrink" to 0)), "dashboard-icon" to _pS(_uM("width" to "32rpx", "height" to "32rpx", "marginRight" to "8rpx", "color" to "#ffffff", "flexShrink" to 0)), "nav-message-btn" to _pS(_uM("position" to "relative", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to 0, "paddingRight" to "40rpx", "paddingBottom" to 0, "paddingLeft" to 0, "color" to "#ffffff", "fontSize" to "28rpx", "fontFamily" to "sans-serif", "whiteSpace" to "nowrap", "flexShrink" to 0)), "message-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "message-badge" to _pS(_uM("position" to "absolute", "right" to 0, "width" to "36rpx", "height" to "36rpx", "backgroundColor" to "#FF6B35", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "color" to "#ffffff", "fontSize" to "22rpx", "fontWeight" to "bold")), "content-container" to _pS(_uM("width" to "90%", "marginTop" to "20rpx", "marginRight" to "auto", "marginBottom" to "auto", "marginLeft" to "auto", "paddingTop" to "20rpx", "paddingRight" to "0rpx", "paddingBottom" to "20rpx", "paddingLeft" to "0rpx", "backgroundColor" to "#f9e1ce", "overflow" to "visible")), "content-title-container" to _pS(_uM("position" to "relative", "width" to "70%", "height" to "80rpx", "display" to "flex", "justifyContent" to "center", "overflow" to "visible")), "content-title-background" to _pS(_uM("position" to "absolute", "top" to 0, "left" to "-60rpx", "width" to "100%", "height" to "100%", "zIndex" to 1, "overflow" to "visible")), "content-title-text" to _pS(_uM("position" to "relative", "zIndex" to 2, "fontSize" to "28rpx", "color" to "#FFEAD2", "fontWeight" to "bold", "textAlign" to "left", "paddingTop" to "10rpx", "paddingRight" to "60rpx", "paddingBottom" to "10rpx", "paddingLeft" to "60rpx")), "profile-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "24rpx", "borderTopRightRadius" to "24rpx", "borderBottomRightRadius" to "24rpx", "borderBottomLeftRadius" to "24rpx", "marginTop" to "20rpx", "marginRight" to "40rpx", "marginBottom" to "20rpx", "marginLeft" to "40rpx", "paddingTop" to "32rpx", "paddingRight" to "28rpx", "paddingBottom" to "32rpx", "paddingLeft" to "28rpx", "display" to "flex", "flexDirection" to "row", "alignItems" to "center", "gap" to "28rpx")), "profile-avatar" to _pS(_uM("width" to "60rpx", "height" to "60rpx", "borderTopLeftRadius" to "60rpx", "borderTopRightRadius" to "60rpx", "borderBottomRightRadius" to "60rpx", "borderBottomLeftRadius" to "60rpx", "objectFit" to "cover")), "avatar-circle" to _pS(_uM("width" to "90rpx", "height" to "90rpx", "borderTopLeftRadius" to "75rpx", "borderTopRightRadius" to "75rpx", "borderBottomRightRadius" to "75rpx", "borderBottomLeftRadius" to "75rpx", "borderTopWidth" to "1rpx", "borderRightWidth" to "1rpx", "borderBottomWidth" to "1rpx", "borderLeftWidth" to "1rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#FF6B35", "borderRightColor" to "#FF6B35", "borderBottomColor" to "#FF6B35", "borderLeftColor" to "#FF6B35", "backgroundColor" to "#fde9d8", "alignItems" to "center", "justifyContent" to "center", "display" to "flex", "boxShadow" to "0 6rpx 16rpx rgba(0,0,0,0.08)", "marginRight" to "10rpx")), "profile-info" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "display" to "flex", "flexDirection" to "column", "gap" to "12rpx")), "name-id-row" to _pS(_uM("display" to "flex", "flexDirection" to "row", "gap" to "10rpx")), "name" to _uM(".name-id-row " to _uM("fontSize" to "36rpx", "fontWeight" to "bold")), "id-chip" to _uM(".name-id-row " to _uM("width" to "100rpx", "height" to "40rpx", "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#b66161", "borderRightColor" to "#b66161", "borderBottomColor" to "#b66161", "borderLeftColor" to "#b66161", "borderTopLeftRadius" to "38rpx", "borderTopRightRadius" to "38rpx", "borderBottomRightRadius" to "38rpx", "borderBottomLeftRadius" to "38rpx", "backgroundColor" to "#fff1f1", "textAlign" to "center", "marginLeft" to "10rpx")), "id" to _uM(".name-id-row .id-chip " to _uM("fontSize" to "20rpx", "color" to "#BA3131", "marginTop" to "8rpx", "marginLeft" to "auto", "marginRight" to "auto")), "branch-text" to _pS(_uM("fontSize" to "28rpx", "color" to "#444444")), "menu-card" to _pS(_uM("marginTop" to "20rpx", "marginRight" to "40rpx", "marginBottom" to "40rpx", "marginLeft" to "40rpx", "backgroundColor" to "#ffffff", "borderTopLeftRadius" to "24rpx", "borderTopRightRadius" to "24rpx", "borderBottomRightRadius" to "24rpx", "borderBottomLeftRadius" to "24rpx", "paddingTop" to "10rpx", "paddingRight" to 0, "paddingBottom" to "10rpx", "paddingLeft" to 0)), "menu-item" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "space-between", "paddingTop" to "28rpx", "paddingRight" to "24rpx", "paddingBottom" to "28rpx", "paddingLeft" to "24rpx", "borderBottomWidth" to "1rpx", "borderBottomStyle" to "solid", "borderBottomColor" to "#eee1d0", "borderBottomWidth:last-child" to "medium", "borderBottomStyle:last-child" to "none", "borderBottomColor:last-child" to "#000000")), "menu-left" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "gap" to "20rpx")), "menu-icon" to _pS(_uM("width" to "36rpx", "height" to "36rpx", "marginRight" to "15rpx", "borderTopLeftRadius" to 0, "borderTopRightRadius" to 0, "borderBottomRightRadius" to 0, "borderBottomLeftRadius" to 0)), "menu-text" to _pS(_uM("fontSize" to "32rpx", "color" to "#533f26")), "menu-arrow" to _pS(_uM("width" to "24rpx", "height" to "24rpx", "opacity" to 0.6)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
