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
import io.dcloud.uniapp.extapi.getProviderSync as uni_getProviderSync
open class GenPagesAPIProviderProvider : BasePage {
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
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", _uM("class" to "page"), _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.serviceList, fun(item, index, __index, _cached): Any {
                    return _cE("view", _uM("class" to "service-item", "key" to index), _uA(
                        _cE("text", _uM("class" to "service-name"), _tD(item.name) + ":", 1),
                        _cE("view", _uM("class" to "provider-list"), _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(item.provider, fun(item2, index2, __index, _cached): Any {
                                return _cE("text", _uM("class" to "provider-item", "key" to index2), _tD(item2) + " " + _tD(if (item.providerObj.length > 0) {
                                    ":" + JSON.stringify(item.providerObj[index2])
                                } else {
                                    ""
                                }
                                ), 1)
                            }
                            ), 128)
                        ))
                    ))
                }
                ), 128),
                _cE("button", _uM("class" to "btn-get-provider", "type" to "primary", "onClick" to _ctx.getProvider), "getProviderSync", 8, _uA(
                    "onClick"
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var flag: Boolean by `$data`
    open var serviceList: UTSArray<ProviderItem> by `$data`
    open var providerIds: UTSArray<String> by `$data`
    open var providerObjects: UTSArray<String> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "provider", "flag" to false, "serviceList" to _uA<ProviderItem>(ProviderItem(service = "payment", name = "支付", provider = _uA(), providerObj = _uA()), ProviderItem(service = "location", name = "定位", provider = _uA(), providerObj = _uA())), "providerIds" to _uA<String>(), "providerObjects" to _uA<String>())
    }
    open var getProvider = ::gen_getProvider_fn
    open fun gen_getProvider_fn() {
        this.providerObjects = _uA()
        this.serviceList.forEach(fun(item: ProviderItem){
            var provider = uni_getProviderSync(GetProviderSyncOptions(service = item.service))
            provider.providerIds.forEach(fun(value){
                this.providerIds.push(value)
            }
            )
            this.updateProvider(item.service, provider.providerIds, provider.providerObjects)
        }
        )
    }
    open var updateProvider = ::gen_updateProvider_fn
    open fun gen_updateProvider_fn(service: String, provider: UTSArray<String>?, uniProvider: UTSArray<UniProvider>) {
        val item: ProviderItem? = this.serviceList.find(fun(item: ProviderItem): Boolean {
            return item.service == service
        }
        )
        if (item != null && provider != null) {
            item.provider = provider
            item.providerObj = uniProvider
            item.providerObj.forEach(fun(obj){
                this.providerObjects.push(obj.description)
            }
            )
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
                return _uM("page" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "service-item" to _pS(_uM("marginTop" to 10)), "service-name" to _pS(_uM("fontWeight" to "bold")), "provider-list" to _pS(_uM("marginLeft" to 32)), "provider-item" to _pS(_uM("lineHeight" to 1.5)), "btn-get-provider" to _pS(_uM("marginTop" to 30)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
