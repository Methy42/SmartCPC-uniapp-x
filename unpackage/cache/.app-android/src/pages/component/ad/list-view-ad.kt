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
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesComponentAdListViewAd : BasePage {
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
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("list-view", _uM("onScrolltolower" to _ctx.onScrollTolower, "style" to _nS(_uM("flex" to "1")), "show-scrollbar" to "false"), _uA(
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.listcount, fun(index, __key, __index, _cached): Any {
                return _cE("list-item", _uM("type" to if ((index != 0 && index % 10 == 6)) {
                    0
                } else {
                    1
                }
                ), _uA(
                    if (isTrue(index != 0 && index % 10 == 6)) {
                        _cE("ad", _uM("key" to 0, "adpid" to "1111111111", "onLoad" to _ctx.onAdLoad, "onError" to _ctx.onAdError, "onClose" to _ctx.onAdClose), null, 40, _uA(
                            "onLoad",
                            "onError",
                            "onClose"
                        ))
                    } else {
                        _cC("v-if", true)
                    }
                    ,
                    if (isTrue(index == 0 || index % 10 != 6)) {
                        _cE("text", _uM("key" to 1, "style" to _nS(_uM("width" to "100%", "height" to "200px", "background-color" to "aquamarine", "margin-top" to "10px"))), "这是一条占位的信息" + _tD(index), 5)
                    } else {
                        _cC("v-if", true)
                    }
                ), 8, _uA(
                    "type"
                ))
            }
            ), 256)
        ), 44, _uA(
            "onScrolltolower"
        ))
    }
    open var listcount: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("listcount" to 10)
    }
    open var onScrollTolower = ::gen_onScrollTolower_fn
    open fun gen_onScrollTolower_fn(_0: ScrollToLowerEvent) {
        setTimeout(fun(){
            this.listcount = this.listcount + 10
        }
        , 300)
    }
    open var onAdLoad = ::gen_onAdLoad_fn
    open fun gen_onAdLoad_fn() {
        console.log("广告加载成功", " at pages/component/ad/list-view-ad.uvue:30")
        uni_showToast(ShowToastOptions(position = "center", title = "广告加载成功"))
    }
    open var onAdError = ::gen_onAdError_fn
    open fun gen_onAdError_fn(e: UniAdErrorEvent) {
        console.log("广告加载失败" + e.detail, " at pages/component/ad/list-view-ad.uvue:37")
    }
    open var onAdClose = ::gen_onAdClose_fn
    open fun gen_onAdClose_fn() {
        console.log("广告关闭了", " at pages/component/ad/list-view-ad.uvue:40")
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
