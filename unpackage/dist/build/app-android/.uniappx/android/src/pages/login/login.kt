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
import io.dcloud.uniapp.extapi.getStorageSync as uni_getStorageSync
open class GenPagesLoginLogin : BasePage {
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
            this.initRememberPassword()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_checkbox = resolveComponent("checkbox")
        return _cE("view", _uM("class" to "container"), _uA(
            _cE("view", _uM("class" to "header"), _uA(
                _cE("image", _uM("class" to "logo", "src" to "/static/party-icon.png", "mode" to "aspectFit")),
                _cE("text", _uM("class" to "title"), "水源红·智慧党建"),
                _cE("text", _uM("class" to "subtitle"), "党员教育管理平台")
            )),
            _cE("view", _uM("class" to "form"), _uA(
                _cE("view", _uM("class" to "form-item"), _uA(
                    _cE("image", _uM("src" to "/static/avatar.png", "style" to _nS(_uM("width" to "24px", "height" to "24px", "margin-right" to "30rpx")), "mode" to "aspectFit"), null, 4),
                    _cE("input", _uM("class" to "input", "type" to "text", "value" to _ctx.username, "placeholder" to "请输入账号/手机号", "placeholder-class" to "placeholder"), null, 8, _uA(
                        "value"
                    ))
                )),
                _cE("view", _uM("class" to "form-item"), _uA(
                    _cE("image", _uM("src" to "/static/lock-icon.png", "style" to _nS(_uM("width" to "24px", "height" to "24px", "margin-right" to "30rpx")), "mode" to "aspectFit"), null, 4),
                    _cE("input", _uM("class" to "input", "type" to "password", "value" to _ctx.password, "placeholder" to "请输入密码", "placeholder-class" to "placeholder", "password" to ""), null, 8, _uA(
                        "value"
                    ))
                )),
                _cE("view", _uM("class" to "form-item"), _uA(
                    _cV(_component_checkbox, _uM("checked" to _ctx.remember, "onChange" to _ctx.onRememberChange, "style" to _nS(_uM("transform" to "scale(0.7)", "margin-right" to "10rpx"))), null, 8, _uA(
                        "checked",
                        "onChange",
                        "style"
                    )),
                    _cE("text", _uM("style" to _nS(_uM("font-size" to "28rpx", "color" to "#666"))), "记住密码", 4)
                )),
                _cE("button", _uM("class" to "login-btn", "onClick" to _ctx.handleLogin, "loading" to _ctx.loading, "style" to _nS(_uM("background-color" to "#C8102E", "color" to "white", "border-radius" to "100rpx", "height" to "100rpx", "font-size" to "36rpx", "font-weight" to "bold", "margin-top" to "40rpx"))), "登录", 12, _uA(
                    "onClick",
                    "loading"
                )),
                _cE("view", _uM("class" to "tips"), _uA(
                    _cE("text", _uM("class" to "tip-text"), "默认账号：党员账号/手机号"),
                    _cE("text", _uM("class" to "tip-text"), "默认密码：123456")
                ))
            )),
            _cE("view", _uM("class" to "footer"), _uA(
                _cE("text", _uM("class" to "footer-text"), "技术支持：南水北调（江苏）数智科技有限公司")
            ))
        ))
    }
    open var username: String
        get() {
            return this.`$setupState`["username"] as String
        }
        set(value) {
            this.`$setupState`["username"] = value
        }
    open var password: String
        get() {
            return this.`$setupState`["password"] as String
        }
        set(value) {
            this.`$setupState`["password"] = value
        }
    open var remember: Boolean
        get() {
            return this.`$setupState`["remember"] as Boolean
        }
        set(value) {
            this.`$setupState`["remember"] = value
        }
    open var loading: Boolean
        get() {
            return this.`$setupState`["loading"] as Boolean
        }
        set(value) {
            this.`$setupState`["loading"] = value
        }
    open var onRememberChange = ::gen_onRememberChange_fn
    open fun gen_onRememberChange_fn() {
        this.remember = !this.remember
    }
    open var isEmpty = ::gen_isEmpty_fn
    open fun gen_isEmpty_fn(str: String?): Boolean {
        if (str == null) {
            return true
        }
        val trimmed = str.trim()
        return trimmed.length === 0
    }
    open var initRememberPassword = ::gen_initRememberPassword_fn
    open fun gen_initRememberPassword_fn() {
        try {
            val rememberFlag = uni_getStorageSync("remember_password")
            if (rememberFlag === true) {
                this.remember = true
                val savedUsername = uni_getStorageSync("login_username")
                val savedPassword = uni_getStorageSync("login_password")
            }
        }
         catch (e: Throwable) {
            console.error("读取记住密码失败:", e)
        }
    }
    open var handleLogin = ::gen_handleLogin_fn
    open fun gen_handleLogin_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
        })
    }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: () -> Any? = fun(): Any? {
            val username = ref("")
            val password = ref("")
            val remember = ref(false)
            val loading = ref(false)
            return _uM("username" to username, "password" to password, "remember" to remember, "loading" to loading)
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
                return _uM("container" to _pS(_uM("display" to "flex", "flexDirection" to "column", "backgroundImage" to "linear-gradient(135deg, #C8102E 0%, #A80E26 100%)", "backgroundColor" to "rgba(0,0,0,0)", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingTop" to "80rpx", "paddingRight" to "60rpx", "paddingBottom" to "80rpx", "paddingLeft" to "60rpx")), "header" to _pS(_uM("display" to "flex", "flexDirection" to "column", "alignItems" to "center", "marginBottom" to "100rpx")), "logo" to _pS(_uM("width" to "120rpx", "height" to "120rpx", "marginBottom" to "30rpx")), "title" to _pS(_uM("fontSize" to "48rpx", "fontWeight" to "bold", "color" to "#FFD700", "marginBottom" to "20rpx")), "subtitle" to _pS(_uM("fontSize" to "32rpx", "color" to "rgba(255,255,255,0.8)")), "form" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.95)", "borderTopLeftRadius" to "30rpx", "borderTopRightRadius" to "30rpx", "borderBottomRightRadius" to "30rpx", "borderBottomLeftRadius" to "30rpx", "paddingTop" to "60rpx", "paddingRight" to "50rpx", "paddingBottom" to "60rpx", "paddingLeft" to "50rpx", "marginBottom" to "60rpx")), "form-item" to _pS(_uM("display" to "flex", "alignItems" to "center", "borderBottomWidth" to "2rpx", "borderBottomStyle" to "solid", "borderBottomColor" to "#eeeeee", "paddingTop" to "40rpx", "paddingRight" to 0, "paddingBottom" to "40rpx", "paddingLeft" to 0, "marginBottom" to "40rpx", "borderBottomWidth:last-child" to "medium", "borderBottomStyle:last-child" to "none", "borderBottomColor:last-child" to "#000000", "marginBottom:last-child" to 0)), "input" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "marginLeft" to "30rpx", "fontSize" to "32rpx", "color" to "#333333", "height" to "50rpx", "lineHeight" to "50rpx")), "placeholder" to _pS(_uM("color" to "#999999", "fontSize" to "30rpx")), "login-btn" to _pS(_uM("height" to "100rpx", "fontSize" to "36rpx", "fontWeight" to "bold", "marginTop" to "40rpx")), "tips" to _pS(_uM("display" to "flex", "flexDirection" to "column", "alignItems" to "center", "marginTop" to "50rpx")), "tip-text" to _pS(_uM("fontSize" to "26rpx", "color" to "#666666", "marginBottom" to "10rpx")), "footer" to _pS(_uM("textAlign" to "center", "marginTop" to "auto")), "footer-text" to _pS(_uM("fontSize" to "24rpx", "color" to "rgba(255,255,255,0.6)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
