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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById
import io.dcloud.uniapp.framework.onShow
open class GenPagesAPIElementGetAttributeElementGetAttribute : BasePage {
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
            this.boxTarget = this.`$refs`["box"] as UniElement
            this.scrollViewTarget = this.`$refs`["scrollView"] as UniElement
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_child = resolveComponent("child")
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", _uM("style" to _nS(_uM("padding" to "15px"))), _uA(
                _cE("view", _uM("id" to "box", "ref" to "box"), _uA(
                    _cE("text", _uM("class" to "uni-title-text"), "元素的id：" + _tD(_ctx.attrId), 1),
                    _cE("text", _uM("class" to "uni-title-text"), "元素的背景色样式值：" + _tD(_ctx.propertyValue), 1),
                    _cE("text", _uM("class" to "uni-subtitle-text"), "小程序端：getAttribute 获取元素的属性值，目前仅支持id、style"),
                    _cE("text", _uM("class" to "uni-subtitle-text"), "App端：getAttribute 不支持获取 class、style 属性")
                ), 512),
                _cE("button", _uM("onClick" to _ctx.getAttributeId), "getAttribute获取元素的id", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("onClick" to _ctx.setStyle), "setProperty设置背景色", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("onClick" to _ctx.getPropertyValue), "getPropertyValue获取背景色值", 8, _uA(
                    "onClick"
                )),
                _cV(_component_child, _uM("id" to "child", "ref" to "child"), null, 512),
                _cE("button", _uM("onClick" to _ctx.getBoundingClientRectAsyncChild), "获取自定义组件child元素信息", 8, _uA(
                    "onClick"
                )),
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
                ,
                _cE("scroll-view", _uM("ref" to "scrollView", "class" to "scroll-view_H", "direction" to "horizontal"), _uA(
                    _cE("view", _uM("class" to "scroll-view-item_H uni-bg-red"), _uA(
                        _cE("text", _uM("class" to "text"), "A")
                    )),
                    _cE("view", _uM("class" to "scroll-view-item_H uni-bg-green"), _uA(
                        _cE("text", _uM("class" to "text"), "B")
                    )),
                    _cE("view", _uM("class" to "scroll-view-item_H uni-bg-blue"), _uA(
                        _cE("text", _uM("class" to "text"), "C")
                    ))
                ), 512),
                _cE("button", _uM("onClick" to _ctx.scrollTo), "scrollTo设置left滚动200px", 8, _uA(
                    "onClick"
                ))
            ), 4)
        ))
    }
    open var boxTarget: UniElement? by `$data`
    open var scrollViewTarget: UniElement? by `$data`
    open var attrId: String by `$data`
    open var attrStyle: String by `$data`
    open var propertyValue: String by `$data`
    open var rectInfo: DomRectType__1 by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("boxTarget" to null as UniElement?, "scrollViewTarget" to null as UniElement?, "attrId" to "", "attrStyle" to "", "propertyValue" to "", "rectInfo" to DomRectType__1(x = 0, y = 0, width = 0, height = 0, left = 0, top = 0, right = 0, bottom = 0))
    }
    open var getBoundingClientRectAsyncChild = ::gen_getBoundingClientRectAsyncChild_fn
    open fun gen_getBoundingClientRectAsyncChild_fn() {
        val childEl = uni_getElementById("child")!!
        childEl.getBoundingClientRectAsync()!!.then(fun(rect: DOMRect){
            console.log("rect: ", rect)
            this.rectInfo = DomRectType__1(x = rect.x, y = rect.y, width = rect.width, height = rect.height, left = rect.left, top = rect.top, right = rect.right, bottom = rect.bottom)
        }
        )
    }
    open var getAttributeId = ::gen_getAttributeId_fn
    open fun gen_getAttributeId_fn() {
        this.attrId = this.boxTarget!!.getAttribute("id") ?: ""
    }
    open var setStyle = ::gen_setStyle_fn
    open fun gen_setStyle_fn() {
        this.boxTarget!!.style.setProperty("background-color", "#FFF000")
    }
    open var getPropertyValue = ::gen_getPropertyValue_fn
    open fun gen_getPropertyValue_fn() {
        this.propertyValue = this.boxTarget!!.style.getPropertyValue("background-color")
    }
    open var getAttributeStyle = ::gen_getAttributeStyle_fn
    open fun gen_getAttributeStyle_fn() {
        this.attrStyle = this.boxTarget!!.getAttribute("style") ?: ""
    }
    open var scrollTo = ::gen_scrollTo_fn
    open fun gen_scrollTo_fn() {
        this.scrollViewTarget!!.scrollTo(200, 0)
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
                return _uM("scroll-view_H" to _pS(_uM("width" to "100%", "flexDirection" to "row", "marginTop" to 15)), "scroll-view-item_H" to _pS(_uM("width" to "100%", "height" to 150, "justifyContent" to "center", "alignItems" to "center")), "text" to _pS(_uM("fontSize" to 18, "color" to "#ffffff")), "rect-info" to _pS(_uM("marginTop" to 15, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "flexDirection" to "column")), "node-info-item" to _pS(_uM("flexDirection" to "row")), "node-info-item-k" to _pS(_uM("width" to 72, "lineHeight" to 2)), "node-info-item-v" to _pS(_uM("fontWeight" to "bold", "lineHeight" to 2)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM("child" to GenPagesAPIElementGetAttributeChildClass)
    }
}
