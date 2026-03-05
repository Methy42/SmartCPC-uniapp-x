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
import io.dcloud.uniapp.extapi.redirectTo as uni_redirectTo
open class GenUniModulesUniPayXPagesPayDeskPayDesk : BasePage {
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
        onLoad(fun(options: OnLoadOptions) {
            var optionsStr = options["options"] as String?
            if (optionsStr != null && optionsStr != "") {
                var newOptions = UTSAndroid.consoleDebugError(JSON.parse(UTSAndroid.consoleDebugError(decodeURI(optionsStr), " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:69")!!), " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:69") as UTSJSONObject
                this.myOptions = newOptions as UTSJSONObject
            }
            console.log("myOptions: ", this.myOptions, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:72")
        }
        , __ins)
        onReady(fun() {}, __ins)
        onPageShow(fun() {}, __ins)
        onPageHide(fun() {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_uni_pay = resolveEasyComponent("uni-pay", GenUniModulesUniPayXComponentsUniPayUniPayClass)
        return _cE("view", _uM("class" to "uni-pay"), _uA(
            _cE("view", _uM("class" to "mobile-pay-popup"), _uA(
                _cE("view", _uM("class" to "mobile-pay-popup-amount-box"), _uA(
                    _cE("view", null, _uA(
                        _cE("text", _uM("class" to "text"), "待支付金额：")
                    )),
                    _cE("view", _uM("class" to "mobile-pay-popup-amount"), _uA(
                        _cE("text", _uM("class" to "text"), _tD(_ctx.amountFormat(_ctx.myOptions.getNumber("total_fee"))), 1)
                    ))
                )),
                _cE("view", _uM("class" to "mobile-pay-popup-provider-list"), _uA(
                    _cE("view", _uM("class" to "uni-list"), _uA(
                        if (isTrue(_ctx.checkProvider("wxpay"))) {
                            _cE("view", _uM("key" to 0, "class" to "uni-list-item", "onClick" to fun(){
                                _ctx.createOrderByProvider("wxpay")
                            }), _uA(
                                _cE("view", _uM("class" to "uni-list-item__container container--right"), _uA(
                                    _cE("view", _uM("class" to "uni-list-item__header"), _uA(
                                        _cE("image", _uM("src" to _ctx.insideData.getJSON("images")!!["wxpay"], "class" to "image"), null, 8, _uA(
                                            "src"
                                        ))
                                    )),
                                    _cE("view", _uM("class" to "uni-list-item__content uni-list-item__content--center"), _uA(
                                        _cE("text", _uM("class" to "text"), "微信支付")
                                    ))
                                )),
                                _cE("view", _uM("class" to "arrowright"))
                            ), 8, _uA(
                                "onClick"
                            ))
                        } else {
                            _cC("v-if", true)
                        }
                        ,
                        if (isTrue(_ctx.checkProvider("alipay"))) {
                            _cE("view", _uM("key" to 1, "class" to "uni-list-item", "onClick" to fun(){
                                _ctx.createOrderByProvider("alipay")
                            }), _uA(
                                _cE("view", _uM("class" to "uni-list-item__container container--right"), _uA(
                                    _cE("view", _uM("class" to "uni-list-item__header"), _uA(
                                        _cE("image", _uM("src" to _ctx.insideData.getJSON("images")!!["alipay"], "class" to "image"), null, 8, _uA(
                                            "src"
                                        ))
                                    )),
                                    _cE("view", _uM("class" to "uni-list-item__content uni-list-item__content--center"), _uA(
                                        _cE("text", _uM("class" to "text"), "支付宝")
                                    ))
                                )),
                                _cE("view", _uM("class" to "arrowright"))
                            ), 8, _uA(
                                "onClick"
                            ))
                        } else {
                            _cC("v-if", true)
                        }
                    ))
                ))
            )),
            _cV(_component_uni_pay, _uM("ref" to "payRef", "height" to "450px", "to-success-page" to false, "onMounted" to _ctx.onMounted, "onSuccess" to _ctx.onSuccess, "onFail" to _ctx.onFail, "onCancel" to _ctx.onCancel), null, 8, _uA(
                "onMounted",
                "onSuccess",
                "onFail",
                "onCancel"
            ))
        ))
    }
    open var myOptions: UTSJSONObject by `$data`
    open var insideData: UTSJSONObject by `$data`
    open var adpid: String by `$data`
    open var return_url: String by `$data`
    open var main_color: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("myOptions" to object : UTSJSONObject() {
            var total_fee = ""
        }, "insideData" to object : UTSJSONObject() {
            var currentProviders = _uA<String>()
            var images = object : UTSJSONObject() {
                var alipay = ""
                var wxpay = ""
            }
        }, "adpid" to "", "return_url" to "", "main_color" to "")
    }
    open var onMounted = ::gen_onMounted_fn
    open fun gen_onMounted_fn(insideData: UTSJSONObject) {
        this.insideData["currentProviders"] = insideData.getArray("currentProviders") as UTSArray<String>
        this.insideData["images"] = insideData.getJSON("images") as UTSJSONObject
    }
    open var createOrder = ::gen_createOrder_fn
    open fun gen_createOrder_fn(data: UTSJSONObject) {
        this.myOptions = objectAssign(this.myOptions, data)
        val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance
        payInstance.createOrder(this.myOptions)
    }
    open var createOrderByProvider = ::gen_createOrderByProvider_fn
    open fun gen_createOrderByProvider_fn(provider: String) {
        this.createOrder(_uO("provider" to provider))
    }
    open var onSuccess = ::gen_onSuccess_fn
    open fun gen_onSuccess_fn(res: UTSJSONObject) {
        var out_trade_no = res["out_trade_no"] as String
        var pay_order = res.getJSON("pay_order") as UTSJSONObject
        var order_no = pay_order["order_no"] as String
        var total_fee = pay_order.getNumber("total_fee")
        if (total_fee == null) {
            total_fee = 0
        }
        var return_url = this.return_url as String
        var adpid = this.adpid as String
        var main_color = this.main_color as String
        console.log("success: ", res, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:113")
        var user_order_success = res.getBoolean("user_order_success")
        if (user_order_success != null && user_order_success != true) {
            uni_redirectTo(RedirectToOptions(url = "/uni_modules/uni-pay-x/pages/success/success?out_trade_no=" + out_trade_no + "&order_no=" + order_no + "&total_fee=" + total_fee + "&adpid=" + adpid + "&return_url=" + return_url + "&main_color=" + main_color))
        }
    }
    open var onFail = ::gen_onFail_fn
    open fun gen_onFail_fn(err: RequestPaymentFail) {
        console.log("fail: ", err, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:127")
    }
    open var onCancel = ::gen_onCancel_fn
    open fun gen_onCancel_fn(err: RequestPaymentFail) {
        console.log("cancel: ", err, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:132")
    }
    open var amountFormat = ::gen_amountFormat_fn
    open fun gen_amountFormat_fn(totalFee: Number?): String {
        if (totalFee == null) {
            return "0"
        } else {
            return (totalFee / 100).toFixed(2)
        }
    }
    open var checkProvider = ::gen_checkProvider_fn
    open fun gen_checkProvider_fn(provider: String): Boolean {
        var currentProviders = this.insideData.getArray<String>("currentProviders")
        return if (currentProviders != null && currentProviders.indexOf(provider) > -1) {
            true
        } else {
            false
        }
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
                return _uM("uni-pay" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "display" to "flex", "flexDirection" to "column", "backgroundColor" to "#f3f3f3")), "mobile-pay-popup" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "mobile-pay-popup-amount-box" to _uM(".mobile-pay-popup " to _uM("backgroundColor" to "#ffffff", "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "mobile-pay-popup-amount" to _uM(".mobile-pay-popup .mobile-pay-popup-amount-box " to _uM("marginTop" to 10)), "text" to _uM(".mobile-pay-popup .mobile-pay-popup-amount-box .mobile-pay-popup-amount " to _uM("color" to "#e43d33", "fontSize" to 30), ".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__content " to _uM("color" to "#3b4144", "fontSize" to 14)), "mobile-pay-popup-provider-list" to _uM(".mobile-pay-popup " to _uM("backgroundColor" to "#ffffff", "marginTop" to 10)), "uni-list" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list " to _uM("display" to "flex", "backgroundColor" to "#ffffff", "position" to "relative", "flexDirection" to "column")), "uni-list-item" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list " to _uM("display" to "flex", "position" to "relative", "justifyContent" to "space-between", "alignItems" to "center", "backgroundColor" to "#ffffff", "flexDirection" to "row", "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#f8f8f8", "backgroundColor:hover" to "#f1f1f1")), "uni-list-item__container" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item " to _uM("position" to "relative", "display" to "flex", "flexDirection" to "row", "paddingTop" to 12, "paddingRight" to 15, "paddingBottom" to 12, "paddingLeft" to 15, "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "overflow" to "hidden")), "uni-list-item__header" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container " to _uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center")), "image" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container .uni-list-item__header " to _uM("width" to 26, "height" to 26, "marginRight" to 9)), "container--right" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item " to _uM("paddingRight" to 0)), "uni-list-item__content" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item " to _uM("display" to "flex", "paddingRight" to 8, "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "flexDirection" to "column", "justifyContent" to "space-between", "overflow" to "hidden")), "uni-list-item__content--center" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item " to _uM("justifyContent" to "center")), "arrowright" to _uM(".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item " to _uM("borderTopWidth" to 1, "borderTopStyle" to "solid", "borderTopColor" to "#bbbbbb", "borderRightWidth" to 1, "borderRightStyle" to "solid", "borderRightColor" to "#bbbbbb", "width" to 8, "height" to 8, "marginRight" to 15, "transform" to "rotate(45deg)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
