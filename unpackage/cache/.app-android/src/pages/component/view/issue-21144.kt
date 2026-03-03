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
open class GenPagesComponentViewIssue21144 : BasePage {
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
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1")), "scroll-top" to _ctx.scrollTop), _uA(
            _cE("view", _uM("id" to "testView", "class" to "btn-plus")),
            _cE("view", _uM("style" to _nS(_uM("width" to "100%", "height" to "2000px")), "onClick" to _ctx.checkTestView), null, 12, _uA(
                "onClick"
            ))
        ), 12, _uA(
            "scroll-top"
        ))
    }
    open var scrollTop: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("scrollTop" to 0)
    }
    open var checkTestView = ::gen_checkTestView_fn
    open fun gen_checkTestView_fn(): Boolean {
        var ele = uni_getElementById("testView") as UniElement
        console.log(ele.getBoundingClientRect().y, " at pages/component/view/issue-21144.uvue:19")
        return ele.getBoundingClientRect().y > 98
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
                return _uM("btn-plus" to _pS(_uM("position" to "fixed", "top" to 100, "left" to 10, "width" to 50, "height" to 50, "backgroundColor" to "#FF0000", "boxShadow" to "0px 0px 0px rgba(0, 0, 0, 1)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
