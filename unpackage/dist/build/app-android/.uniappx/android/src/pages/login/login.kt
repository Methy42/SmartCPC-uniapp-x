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
import io.dcloud.uniapp.extapi.removeStorageSync as uni_removeStorageSync
import io.dcloud.uniapp.extapi.setStorageSync as uni_setStorageSync
import io.dcloud.uniapp.extapi.showToast as uni_showToast
import io.dcloud.uniapp.extapi.switchTab as uni_switchTab
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
    }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesLoginLogin) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesLoginLogin
            val _cache = __ins.renderCache
            val form = reactive(LoginForm(username = "", password = ""))
            val remember = ref(false)
            val loading = ref(false)
            val handleLogin = fun(): UTSPromise<Unit> {
                return wrapUTSPromise(suspend w1@{
                        if (form.username.trim() == "") {
                            uni_showToast(ShowToastOptions(title = "请输入账号", icon = "none"))
                            return@w1
                        }
                        if (form.password.trim() == "") {
                            uni_showToast(ShowToastOptions(title = "请输入密码", icon = "none"))
                            return@w1
                        }
                        loading.value = true
                        try {
                            val res = await(uniCloud.callFunction(UniCloudCallFunctionOptions(name = "user-login", data = object : UTSJSONObject() {
                                var username = form.username
                                var password = form.password
                            })))
                            if (res.result["errCode"] !== 0) {
                                throw UTSError(res.result["errMsg"])
                            }
                            val userData = res.result["data"]
                            setUserInfo(UserInfo__1(id = userData.id, username = userData.username, name = userData.name, avatar = userData.avatar, role = userData.role, organization = userData.organization, token = userData.token))
                            uni_setStorageSync("user_token", userData.token)
                            uni_setStorageSync("user_info", JSON.stringify(userData))
                            if (remember.value) {
                                uni_setStorageSync("login_username", form.username)
                                uni_setStorageSync("login_password", form.password)
                                uni_setStorageSync("remember_password", true)
                            } else {
                                uni_removeStorageSync("login_username")
                                uni_removeStorageSync("login_password")
                                uni_removeStorageSync("remember_password")
                            }
                            uni_showToast(ShowToastOptions(title = "登录成功", icon = "success"))
                            uni_switchTab(SwitchTabOptions(url = "/pages/index/index"))
                        }
                         catch (error: Throwable) {
                            uni_showToast(ShowToastOptions(title = error.message || "登录失败", icon = "none"))
                        }
                         finally {
                            loading.value = false
                        }
                })
            }
            val initRememberPassword = fun(){}
            onMounted(fun(){
                initRememberPassword()
            }
            )
            return fun(): Any? {
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
                            _cE("input", _uM("class" to "input", "type" to "text", "modelValue" to form.username, "onInput" to fun(`$event`: UniInputEvent){
                                form.username = `$event`.detail.value
                            }
                            , "placeholder" to "请输入账号/手机号", "placeholder-class" to "placeholder"), null, 40, _uA(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        _cE("view", _uM("class" to "form-item"), _uA(
                            _cE("image", _uM("src" to "/static/lock-icon.png", "style" to _nS(_uM("width" to "24px", "height" to "24px", "margin-right" to "30rpx")), "mode" to "aspectFit"), null, 4),
                            _cE("input", _uM("class" to "input", "type" to "password", "modelValue" to form.password, "onInput" to fun(`$event`: UniInputEvent){
                                form.password = `$event`.detail.value
                            }
                            , "placeholder" to "请输入密码", "placeholder-class" to "placeholder", "password" to ""), null, 40, _uA(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        _cE("view", _uM("class" to "form-item"), _uA(
                            _cV(_component_checkbox, _uM("checked" to remember.value, "onChange" to fun(){
                                remember.value = !remember.value
                            }
                            , "style" to _nS(_uM("transform" to "scale(0.7)", "margin-right" to "10rpx"))), null, 8, _uA(
                                "checked",
                                "onChange",
                                "style"
                            )),
                            _cE("text", _uM("style" to _nS(_uM("font-size" to "28rpx", "color" to "#666"))), "记住密码", 4)
                        )),
                        _cE("button", _uM("class" to "login-btn", "onClick" to handleLogin, "loading" to loading.value, "style" to _nS(_uM("background-color" to "#C8102E", "color" to "white", "border-radius" to "100rpx", "height" to "100rpx", "font-size" to "36rpx", "font-weight" to "bold", "margin-top" to "40rpx"))), "登录", 12, _uA(
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
                return _uM("container" to _pS(_uM("backgroundImage" to "linear-gradient(135deg, #C8102E 0%, #A80E26 100%)", "backgroundColor" to "rgba(0,0,0,0)", "display" to "flex", "flexDirection" to "column", "paddingTop" to "80rpx", "paddingRight" to "60rpx", "paddingBottom" to "80rpx", "paddingLeft" to "60rpx")), "header" to _pS(_uM("textAlign" to "center", "marginBottom" to "100rpx")), "logo" to _pS(_uM("width" to "120rpx", "height" to "120rpx", "marginBottom" to "30rpx")), "title" to _pS(_uM("fontSize" to "48rpx", "fontWeight" to "bold", "color" to "#FFD700", "marginBottom" to "20rpx")), "subtitle" to _pS(_uM("fontSize" to "32rpx", "color" to "rgba(255,255,255,0.8)")), "form" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.95)", "borderTopLeftRadius" to "30rpx", "borderTopRightRadius" to "30rpx", "borderBottomRightRadius" to "30rpx", "borderBottomLeftRadius" to "30rpx", "paddingTop" to "60rpx", "paddingRight" to "50rpx", "paddingBottom" to "60rpx", "paddingLeft" to "50rpx", "marginBottom" to "60rpx")), "form-item" to _pS(_uM("display" to "flex", "alignItems" to "center", "borderBottomWidth" to "2rpx", "borderBottomStyle" to "solid", "borderBottomColor" to "#eeeeee", "paddingTop" to "40rpx", "paddingRight" to 0, "paddingBottom" to "40rpx", "paddingLeft" to 0, "marginBottom" to "40rpx", "borderBottomWidth:last-child" to "medium", "borderBottomStyle:last-child" to "none", "borderBottomColor:last-child" to "#000000", "marginBottom:last-child" to 0)), "input" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "marginLeft" to "30rpx", "fontSize" to "32rpx", "color" to "#333333", "height" to "50rpx", "lineHeight" to "50rpx")), "placeholder" to _pS(_uM("color" to "#999999", "fontSize" to "30rpx")), "login-btn" to _pS(_uM("height" to "100rpx", "fontSize" to "36rpx", "fontWeight" to "bold", "marginTop" to "40rpx")), "tips" to _pS(_uM("marginTop" to "50rpx", "textAlign" to "center")), "tip-text" to _pS(_uM("fontSize" to "26rpx", "color" to "#666666", "marginBottom" to "10rpx")), "footer" to _pS(_uM("textAlign" to "center", "marginTop" to "auto")), "footer-text" to _pS(_uM("fontSize" to "24rpx", "color" to "rgba(255,255,255,0.6)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
