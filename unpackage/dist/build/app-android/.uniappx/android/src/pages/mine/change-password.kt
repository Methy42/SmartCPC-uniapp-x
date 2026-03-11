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
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesMineChangePassword : BasePage {
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
        var setup: (__props: GenPagesMineChangePassword) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesMineChangePassword
            val _cache = __ins.renderCache
            val oldPwd = ref<String>("")
            val newPwd = ref<String>("")
            val confirmPwd = ref<String>("")
            fun gen_submit_fn() {
                if (oldPwd.value.length === 0 || newPwd.value.length === 0 || confirmPwd.value.length === 0) {
                    uni_showToast(ShowToastOptions(title = "请完整填写", icon = "none"))
                    return
                }
                if (newPwd.value.length < 6) {
                    uni_showToast(ShowToastOptions(title = "新密码至少6位", icon = "none"))
                    return
                }
                if (newPwd.value !== confirmPwd.value) {
                    uni_showToast(ShowToastOptions(title = "两次密码不一致", icon = "none"))
                    return
                }
                uni_showToast(ShowToastOptions(title = "已提交", icon = "success"))
                setTimeout(fun(){
                    uni_navigateBack(null)
                }
                , 600)
            }
            val submit = ::gen_submit_fn
            return fun(): Any? {
                return _cE("view", _uM("class" to "page"), _uA(
                    _cE("view", _uM("class" to "header"), _uA(
                        _cE("text", _uM("class" to "title"), "修改密码")
                    )),
                    _cE("view", _uM("class" to "form"), _uA(
                        _cE("view", _uM("class" to "field"), _uA(
                            _cE("text", _uM("class" to "label"), "旧密码"),
                            _cE("input", _uM("class" to "input", "password" to true, "placeholder" to "请输入旧密码", "modelValue" to oldPwd.value, "onInput" to fun(`$event`: UniInputEvent){
                                oldPwd.value = `$event`.detail.value
                            }
                            ), null, 40, _uA(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        _cE("view", _uM("class" to "field"), _uA(
                            _cE("text", _uM("class" to "label"), "新密码"),
                            _cE("input", _uM("class" to "input", "password" to true, "placeholder" to "请输入新密码", "modelValue" to newPwd.value, "onInput" to fun(`$event`: UniInputEvent){
                                newPwd.value = `$event`.detail.value
                            }
                            ), null, 40, _uA(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        _cE("view", _uM("class" to "field"), _uA(
                            _cE("text", _uM("class" to "label"), "确认新密码"),
                            _cE("input", _uM("class" to "input", "password" to true, "placeholder" to "再次输入新密码", "modelValue" to confirmPwd.value, "onInput" to fun(`$event`: UniInputEvent){
                                confirmPwd.value = `$event`.detail.value
                            }
                            ), null, 40, _uA(
                                "modelValue",
                                "onInput"
                            ))
                        )),
                        _cE("button", _uM("class" to "submit", "onClick" to submit), "确认修改")
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
                return _uM("page" to _pS(_uM("paddingTop" to "40rpx", "paddingRight" to "30rpx", "paddingBottom" to "40rpx", "paddingLeft" to "30rpx")), "header" to _pS(_uM("alignItems" to "center", "marginBottom" to "20rpx")), "title" to _pS(_uM("fontSize" to "36rpx", "color" to "#333333")), "form" to _pS(_uM("backgroundImage" to "none", "backgroundColor" to "#ffffff", "borderTopLeftRadius" to "24rpx", "borderTopRightRadius" to "24rpx", "borderBottomRightRadius" to "24rpx", "borderBottomLeftRadius" to "24rpx", "paddingTop" to "20rpx", "paddingRight" to "24rpx", "paddingBottom" to "20rpx", "paddingLeft" to "24rpx")), "field" to _pS(_uM("marginTop" to "20rpx", "marginRight" to 0, "marginBottom" to "20rpx", "marginLeft" to 0)), "label" to _pS(_uM("marginBottom" to "12rpx", "fontSize" to "28rpx", "color" to "#666666")), "input" to _pS(_uM("height" to "88rpx", "borderTopWidth" to "1rpx", "borderRightWidth" to "1rpx", "borderBottomWidth" to "1rpx", "borderLeftWidth" to "1rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#eeeeee", "borderRightColor" to "#eeeeee", "borderBottomColor" to "#eeeeee", "borderLeftColor" to "#eeeeee", "paddingTop" to 0, "paddingRight" to "20rpx", "paddingBottom" to 0, "paddingLeft" to "20rpx", "borderTopLeftRadius" to "12rpx", "borderTopRightRadius" to "12rpx", "borderBottomRightRadius" to "12rpx", "borderBottomLeftRadius" to "12rpx", "backgroundImage" to "none", "backgroundColor" to "#fafafa")), "submit" to _pS(_uM("marginTop" to "30rpx", "height" to "88rpx", "backgroundColor" to "#C8102E", "color" to "#ffffff", "borderTopLeftRadius" to "100rpx", "borderTopRightRadius" to "100rpx", "borderBottomRightRadius" to "100rpx", "borderBottomLeftRadius" to "100rpx")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
