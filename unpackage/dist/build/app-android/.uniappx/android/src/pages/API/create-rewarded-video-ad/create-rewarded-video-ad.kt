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
import io.dcloud.uniapp.extapi.createRewardedVideoAd as uni_createRewardedVideoAd
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd : BasePage {
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
        onReady(fun() {
            this.loadAd()
        }
        , __ins)
        onPageHide(fun() {
            console.log("Page Hide")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "激励视频广告")),
            _cE("button", _uM("type" to _ctx.btnType, "style" to _nS(_uM("margin" to "10px")), "disabled" to _ctx.btnDisable, "onClick" to fun(){
                _ctx.showAd()
            }
            ), _tD(_ctx.btnText), 13, _uA(
                "type",
                "disabled",
                "onClick"
            )),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.errorDetails, fun(item, index, __index, _cached): Any {
                return _cE("view", null, _tD(item), 1)
            }
            ), 256)
        ), 64)
    }
    open var errorDetails: UTSArray<String> by `$data`
    open var btnText: String by `$data`
    open var btnType: String by `$data`
    open var btnDisable: Boolean by `$data`
    open var rewardAd: RewardedVideoAd? by `$data`
    open var isAdLoadSuccess: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("errorDetails" to _uA<String>(), "btnText" to "", "btnType" to "primary", "btnDisable" to false, "rewardAd" to null as RewardedVideoAd?, "isAdLoadSuccess" to false)
    }
    open var loadAd = ::gen_loadAd_fn
    open fun gen_loadAd_fn() {
        if (this.btnDisable) {
            return
        }
        this.btnDisable = true
        this.btnText = "正在加载广告"
        this.btnType = "primary"
        if (this.rewardAd == null) {
            this.rewardAd = uni_createRewardedVideoAd(CreateRewardedVideoAdOptions(adpid = "1507000689"))
            this.rewardAd!!.onError(fun(res){
                this.errorDetails.length = 0
                this.btnType = "warn"
                this.btnDisable = false
                this.btnText = res.errMsg
                val errors = (res.cause as UniAggregateError?)?.errors
                if (errors != null && errors.length > 0) {
                    run {
                        var a: Number = 0
                        while(a < errors.length){
                            var msg = JSON.stringify(errors[a])
                            this.errorDetails.push(msg)
                            a++
                        }
                    }
                }
            }
            )
            this.rewardAd!!.onLoad(fun(_){
                this.errorDetails.length = 0
                this.btnType = "primary"
                this.btnText = "广告加载成功，点击观看"
                this.btnDisable = false
                this.isAdLoadSuccess = true
            }
            )
            this.rewardAd!!.onClose(fun(e){
                this.isAdLoadSuccess = false
                uni_showToast(ShowToastOptions(title = "激励视频" + (if (e.isEnded) {
                    ""
                } else {
                    "未"
                }
                ) + "播放完毕", position = "bottom"))
                this.loadAd()
            }
            )
        }
        this.rewardAd!!.load().`catch`(fun(){})
    }
    open var showAd = ::gen_showAd_fn
    open fun gen_showAd_fn() {
        if (this.isAdLoadSuccess) {
            this.rewardAd!!.show().`catch`(fun(){})
        } else {
            this.loadAd()
        }
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(), _uA(
                GenApp.styles
            ))
        }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
