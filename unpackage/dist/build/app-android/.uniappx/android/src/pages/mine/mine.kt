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
                        _cE("view", _uM("class" to "info-container"), _uA(
                            _cE("view", _uM("class" to "user-avatar-container"), _uA(
                                _cE("image", _uM("class" to "user-avatar", "src" to "/static/user-avatar.jpg", "mode" to "aspectFit"))
                            )),
                            _cE("view", _uM("class" to "user-name-container"))
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
                return _uM("container" to _pS(_uM("backgroundColor" to "#F5F5F5", "display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingBottom" to "100rpx")), "background-image" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "zIndex" to -1)), "custom-navbar" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "var(--status-bar-height, 40rpx)", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "height" to "100rpx", "width" to "100%", "boxSizing" to "border-box", "flexWrap" to "nowrap", "whiteSpace" to "nowrap")), "nav-avatar-container" to _pS(_uM("position" to "relative", "width" to "70rpx", "height" to "70rpx", "flexShrink" to 0)), "nav-avatar" to _pS(_uM("width" to "100%", "height" to "100%", "boxSizing" to "border-box")), "avatar-decoration" to _pS(_uM("position" to "absolute", "top" to "-5rpx", "right" to "-5rpx", "width" to "25rpx", "height" to "25rpx")), "decoration-star" to _pS(_uM("width" to "100%", "height" to "100%")), "nav-logo-container" to _pS(_uM("display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "nav-right-buttons" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "flexShrink" to 0, "flexWrap" to "nowrap")), "nav-dashboard-btn" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "color" to "#ffffff", "fontSize" to "26rpx", "fontFamily" to "sans-serif", "marginRight" to "20rpx", "whiteSpace" to "nowrap", "flexShrink" to 0)), "dashboard-icon" to _pS(_uM("width" to "32rpx", "height" to "32rpx", "marginRight" to "8rpx", "color" to "#ffffff", "flexShrink" to 0)), "nav-message-btn" to _pS(_uM("position" to "relative", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to 0, "paddingRight" to "40rpx", "paddingBottom" to 0, "paddingLeft" to 0, "color" to "#ffffff", "fontSize" to "28rpx", "fontFamily" to "sans-serif", "whiteSpace" to "nowrap", "flexShrink" to 0)), "message-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "message-badge" to _pS(_uM("position" to "absolute", "right" to 0, "width" to "36rpx", "height" to "36rpx", "backgroundColor" to "#FF6B35", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "color" to "#ffffff", "fontSize" to "22rpx", "fontWeight" to "bold")), "content-container" to _pS(_uM("width" to "90%", "marginTop" to "20rpx", "marginRight" to "auto", "marginBottom" to "auto", "marginLeft" to "auto", "paddingTop" to "20rpx", "paddingRight" to "0rpx", "paddingBottom" to "20rpx", "paddingLeft" to "0rpx", "backgroundColor" to "#f9e1ce")), "content-title-container" to _pS(_uM("position" to "relative", "width" to "70%", "height" to "80rpx", "display" to "flex", "justifyContent" to "center", "overflow" to "visible")), "content-title-background" to _pS(_uM("position" to "absolute", "top" to 0, "left" to "-60rpx", "width" to "100%", "height" to "100%", "zIndex" to 1, "overflow" to "visible")), "content-title-text" to _pS(_uM("position" to "relative", "zIndex" to 2, "fontSize" to "28rpx", "color" to "#FFEAD2", "fontWeight" to "bold", "textAlign" to "left", "paddingTop" to "10rpx", "paddingRight" to "60rpx", "paddingBottom" to "10rpx", "paddingLeft" to "60rpx")), "info-container" to _pS(_uM("width" to "90%", "height" to "400rpx", "marginTop" to "auto", "marginRight" to "auto", "marginBottom" to "auto", "marginLeft" to "auto", "backgroundColor" to "#ffffff", "borderTopLeftRadius" to "25rpx", "borderTopRightRadius" to "25rpx", "borderBottomRightRadius" to "25rpx", "borderBottomLeftRadius" to "25rpx", "position" to "relative")), "user-avatar-container" to _pS(_uM("width" to 120, "height" to 160, "position" to "absolute", "top" to "40rpx", "left" to "40rpx")), "user-avatar" to _pS(_uM("width" to "100%", "height" to "100%")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
