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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesComponentAdAd : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("view", null, _uA(
            _cV(_component_page_head, _uM("title" to "信息流广告")),
            _cE("ad", _uM("adpid" to "1111111111", "style" to _nS(_uM("width" to "100%")), "onLoad" to _ctx.loadFun, "onError" to _ctx.errorFun), null, 44, _uA(
                "onLoad",
                "onError"
            )),
            if (isTrue(_ctx.tips)) {
                _cE("view", _uM("key" to 0, "class" to "uni-center"), "信息流广告加载失败，请退出当前页面重试。")
            } else {
                _cC("v-if", true)
            }
            ,
            _cE("button", _uM("onClick" to _ctx.pushList), "列表-信息流", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.pushVideoAd), "视频贴片-非全屏", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.pushVideoAdL), "视频贴片-横向全屏", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to _ctx.pushVideoAdP), "视频贴片-竖向全屏", 8, _uA(
                "onClick"
            ))
        ))
    }
    open var tips: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("tips" to false)
    }
    open var pushList = ::gen_pushList_fn
    open fun gen_pushList_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/ad/list-view-ad"))
    }
    open var pushVideoAd = ::gen_pushVideoAd_fn
    open fun gen_pushVideoAd_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/ad/video-ad"))
    }
    open var pushVideoAdL = ::gen_pushVideoAdL_fn
    open fun gen_pushVideoAdL_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/ad/landscape-video-ad"))
    }
    open var pushVideoAdP = ::gen_pushVideoAdP_fn
    open fun gen_pushVideoAdP_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/component/ad/portrait-video-ad"))
    }
    open var loadFun = ::gen_loadFun_fn
    open fun gen_loadFun_fn() {
        uni_showToast(ShowToastOptions(position = "bottom", title = "信息流广告加载成功"))
    }
    open var errorFun = ::gen_errorFun_fn
    open fun gen_errorFun_fn() {
        this.tips = true
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
