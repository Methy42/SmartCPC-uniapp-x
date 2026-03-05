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
open class GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync : BasePage {
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
            _cE("view", _uM("class" to "page", "id" to "page"), _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("button", _uM("class" to "btn btn-get-all-node-info", "onClick" to _ctx.getBoundingClientRectAsync), "getBoundingClientRectAsync", 8, _uA(
                    "onClick"
                )),
                _cE("view", _uM("id" to "rect-test", "ref" to "rect-test", "class" to "rect-test"), null, 512),
                if (isTrue(_ctx.rectInfo)) {
                    _cE("view", _uM("key" to 0, "class" to "rect-info"), _uA(
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "x: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.x), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "y: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.y), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "width: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.width), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "height: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.height), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "left: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.left), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "top: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.top), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "right: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.right), 1)
                        )),
                        _cE("view", _uM("class" to "node-info-item"), _uA(
                            _cE("text", _uM("class" to "node-info-item-k"), "bottom: "),
                            _cE("text", _uM("class" to "node-info-item-v"), _tD(_ctx.rectInfo.bottom), 1)
                        ))
                    ))
                } else {
                    _cC("v-if", true)
                }
            ))
        ))
    }
    open var title: String by `$data`
    open var rectInfo: DomRectType by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "getBoundingClientRectAsync", "rectInfo" to DomRectType(x = 0, y = 0, width = 0, height = 0, left = 0, top = 0, right = 0, bottom = 0))
    }
    open var getBoundingClientRectAsync = ::gen_getBoundingClientRectAsync_fn
    open fun gen_getBoundingClientRectAsync_fn() {
        (this.`$refs`["rect-test"] as UniElement).getBoundingClientRectAsync()!!.then(fun(rect: DOMRect){
            this.rectInfo = DomRectType(x = rect.x, y = rect.y, width = rect.width, height = rect.height, left = rect.left, top = rect.top, right = rect.right, bottom = rect.bottom)
        }
        )
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
                return _uM("page" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "btn" to _pS(_uM("marginTop" to 15)), "rect-test" to _pS(_uM("marginTop" to 15, "height" to 100, "backgroundColor" to "#1E90FF")), "rect-info" to _pS(_uM("marginTop" to 15, "flexDirection" to "column")), "node-info-item" to _pS(_uM("flexDirection" to "row")), "node-info-item-k" to _pS(_uM("width" to 72, "lineHeight" to 2)), "node-info-item-v" to _pS(_uM("fontWeight" to "bold", "lineHeight" to 2)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
