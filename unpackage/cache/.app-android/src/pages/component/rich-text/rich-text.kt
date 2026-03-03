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
open class GenPagesComponentRichTextRichText : BasePage {
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
            this.richTextElement = uni_getElementById("richtext") as UniElement
            setTimeout(fun(){
                this.updateRichTextHeight()
            }
            , 2500)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_navigator = resolveComponent("navigator")
        return _cE(Fragment, null, _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to "rich-text")),
                _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cV(_component_navigator, _uM("url" to "/pages/component/rich-text/rich-text-tags"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE("button", _uM("type" to "primary"), "rich-text渲染单个HTML标签示例")
                            )
                        }
                        ), "_" to 1))
                    )),
                    _cE("view", _uM("class" to "uni-btn-v"), _uA(
                        _cV(_component_navigator, _uM("url" to "/pages/component/rich-text/rich-text-complex"), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE("button", _uM("type" to "primary"), "rich-text渲染复杂HTML示例")
                            )
                        }
                        ), "_" to 1))
                    )),
                    _cE("view", _uM("class" to "uni-title"), _uA(
                        _cE("button", _uM("type" to "default", "onClick" to _ctx.changeText), "修改文本内容", 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "text-box", "id" to "rich-text-parent", "onClick" to _ctx.richTextParentClick), _uA(
                        _cE("rich-text", _uM("id" to "richtext", "style" to _nS(_uM("border" to "1px", "border-style" to "solid", "border-color" to "red")), "nodes" to _ctx.text), null, 12, _uA(
                            "nodes"
                        )),
                        _cE("view", null, _uA(
                            _cE("text", null, "rich-text-parent"),
                            _cE("text", _uM("id" to "rich-text-str"), _tD(_ctx.richTextStr), 1)
                        ))
                    ), 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "uni-title"), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), "selectable")
                    )),
                    _cE("view", _uM("class" to "text-box2"), _uA(
                        _cE("rich-text", _uM("style" to _nS(_uM("height" to "80px")), "selectable" to true, "nodes" to _ctx.text), null, 12, _uA(
                            "nodes"
                        ))
                    ))
                ))
            )),
            if (isTrue(_ctx.autoTest)) {
                _cE("rich-text", _uM("key" to 0, "id" to "test-rich-text", "nodes" to _ctx.testNodes, "selectable" to true, "onItemclick" to _ctx.itemClickForTest, "style" to _nS(_uM("position" to "fixed", "width" to "100px", "height" to "100px"))), null, 44, _uA(
                    "nodes",
                    "onItemclick"
                ))
            } else {
                _cC("v-if", true)
            }
        ), 64)
    }
    open var text: String by `$data`
    open var richTextHeight: Number by `$data`
    open var richTextElement: UniElement? by `$data`
    open var autoTest: Boolean by `$data`
    open var testNodes: String by `$data`
    open var isItemClickTrigger: Boolean by `$data`
    open var richTextStr: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("text" to "<span>hello uni-app x!</span><br/><span>uni-app x，终极跨平台方案</span>", "richTextHeight" to 0, "richTextElement" to null as UniElement?, "autoTest" to false, "testNodes" to "<img src=\"https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png\"></img>", "isItemClickTrigger" to false, "richTextStr" to false)
    }
    open var changeText = ::gen_changeText_fn
    open fun gen_changeText_fn() {
        if (this.text === "<span>hello uni-app x!</span><br/><span>uni-app x，终极跨平台方案</span>") {
            this.text = "<h1>hello uni-app x!</h1><br/><h2>uni-app x，终极跨平台方案</h2>"
        } else {
            this.text = "<span>hello uni-app x!</span><br/><span>uni-app x，终极跨平台方案</span>"
        }
        setTimeout(fun(){
            this.updateRichTextHeight()
        }
        , 200)
    }
    open var updateRichTextHeight = ::gen_updateRichTextHeight_fn
    open fun gen_updateRichTextHeight_fn() {
        if (this.richTextElement != null) {
            this.richTextElement!!.getBoundingClientRectAsync()!!.then(fun(elRect: DOMRect){
                this.richTextHeight = elRect.height
                console.log("richTextHeight:", this.richTextHeight, " at pages/component/rich-text/rich-text.uvue:72")
            }
            )
        }
    }
    open var itemClickForTest = ::gen_itemClickForTest_fn
    open fun gen_itemClickForTest_fn(_0: UniRichTextItemClickEvent) {
        this.isItemClickTrigger = true
    }
    open var getBoundingClientRectForTest = ::gen_getBoundingClientRectForTest_fn
    open fun gen_getBoundingClientRectForTest_fn(): DOMRect {
        return uni_getElementById("test-rich-text")?.getBoundingClientRect()!!
    }
    open var richTextParentClick = ::gen_richTextParentClick_fn
    open fun gen_richTextParentClick_fn() {
        this.richTextStr = true
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
                return _uM("text-box" to _pS(_uM("paddingTop" to 20, "paddingRight" to 0, "paddingBottom" to 20, "paddingLeft" to 0, "backgroundColor" to "#FFFFFF")), "text-box2" to _pS(_uM("top" to 20, "backgroundColor" to "#FFFFFF")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
