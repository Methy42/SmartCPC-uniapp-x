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
open class GenPagesComponentStickySectionIssues16118 : BasePage {
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
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("button", _uM("onClick" to _ctx.switchDisplay), "显示内容", 8, _uA(
                "onClick"
            )),
            withDirectives(_cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                _cE("list-view", _uM("style" to _nS(_uM("height" to "200px"))), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.groupItems, fun(group, _, __index, _cached): Any {
                        return _cE("sticky-section", null, _uA(
                            _cE("sticky-header", _uM("style" to _nS(_uM("background-color" to "antiquewhite"))), _uA(
                                _cE("text", _uM("class" to "group-title"), _tD(group.title), 1)
                            ), 4),
                            _cE("list-item", _uM("class" to "content-group"), _uA(
                                _cE("view", _uM("class" to "content-box"), _uA(
                                    _cE(Fragment, null, RenderHelpers.renderList(20, fun(index, __key, __index, _cached): Any {
                                        return _cE("text", _uM("class" to "item"), _tD(index) + " item信息", 1)
                                    }
                                    ), 64)
                                ))
                            ))
                        ))
                    }
                    ), 256)
                ), 4)
            ), 4), _uA(
                _uA(
                    vShow,
                    _ctx.contentVisible
                )
            ))
        ), 4)
    }
    open var groupItems: UTSArray<ItemGroup> by `$data`
    open var contentVisible: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("groupItems" to _uA<ItemGroup>(), "contentVisible" to false)
    }
    open var switchDisplay = ::gen_switchDisplay_fn
    open fun gen_switchDisplay_fn() {
        if (this.contentVisible) {
            this.contentVisible = false
        } else {
            this.contentVisible = true
        }
        if (this.contentVisible) {
            setTimeout(fun(){
                this.groupItems = _uA<ItemGroup>(ItemGroup(title = "sticky-header"))
            }, 200)
        } else {
            setTimeout(fun(){
                this.groupItems = _uA()
            }
            , 200)
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
                return _uM("group-title" to _pS(_uM("fontWeight" to "bold", "fontSize" to 14, "color" to "#4B515A", "paddingTop" to 8, "paddingRight" to 0, "paddingBottom" to 8, "paddingLeft" to 0, "backgroundColor" to "#FFFFFF")), "content-group" to _pS(_uM("flexDirection" to "row", "flexWrap" to "wrap")), "content-box" to _pS(_uM("width" to "100%", "position" to "relative")), "item" to _pS(_uM("paddingTop" to 10, "paddingRight" to 0, "paddingBottom" to 10, "paddingLeft" to 0, "backgroundColor" to "#efeda7")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
