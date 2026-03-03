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
open class GenPagesAPINavigatorNewPageOnLoadCallApi : BasePage {
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
        return _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("adjustData")
            }
            ), "onLoad adjust data", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("navigateTo")
            }
            ), "onLoad navigateTo", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("navigateBack")
            }
            ), "onLoad navigateBack", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("redirectTo")
            }
            ), "onLoad redirectTo", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("reLaunch")
            }
            ), "onLoad reLaunch", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("switchTab")
            }
            ), "onLoad switchTab", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("showToast")
            }
            ), "onLoad showToast", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("showLoading")
            }
            ), "onLoad showLoading", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("showModal")
            }
            ), "onLoad showModal", 8, _uA(
                "onClick"
            )),
            _cE("button", _uM("onClick" to fun(){
                _ctx.goOnLoad("showActionSheet")
            }
            ), "onLoad showActionSheet", 8, _uA(
                "onClick"
            ))
        ))
    }
    open var goOnLoad = ::gen_goOnLoad_fn
    open fun gen_goOnLoad_fn(type: String) {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/onLoad?type=" + type))
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
