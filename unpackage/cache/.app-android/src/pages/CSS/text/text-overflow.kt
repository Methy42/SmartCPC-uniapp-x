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
open class GenPagesCSSTextTextOverflow : BasePage {
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
        return _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
            _cE("view", _uM("style" to _nS(_uM("height" to "500px", "padding" to "0 30px", "background-color" to "gray", "justify-content" to "center"))), _uA(
                _cE("view", _uM("class" to "margin-bottom-10"), _uA(
                    _cE("text", _uM("class" to "font-weight-bold"), "text-overflow:clip white-space:nowrap"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "clip", "white-space" to "nowrap"))), _tD(_ctx.multiLineText), 5)
                )),
                _cE("view", _uM("class" to "margin-bottom-10"), _uA(
                    _cE("text", _uM("class" to "font-weight-bold"), "text-overflow:ellipsis white-space:nowrap"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "ellipsis", "white-space" to "nowrap"))), _tD(_ctx.singleLineText), 5),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "ellipsis", "white-space" to "nowrap"))), _tD(_ctx.multiLineText), 5)
                )),
                _cE("view", _uM("class" to "margin-bottom-10"), _uA(
                    _cE("text", _uM("class" to "font-weight-bold"), "white-space:normal"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("white-space" to "normal"))), _tD(_ctx.multiLineText), 5)
                )),
                _cE("view", _uM("class" to "margin-bottom-10", "style" to _nS(_uM("overflow" to "visible"))), _uA(
                    _cE("text", _uM("class" to "font-weight-bold"), "white-space: nowrap"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("white-space" to "nowrap", "align-self" to "flex-start"))), _tD(_ctx.multiLineText), 5)
                ), 4),
                _cE("view", _uM("class" to "margin-bottom-10"), _uA(
                    _cE("text", _uM("class" to "font-weight-bold"), "任意宽度截断（100px、200px、300px）"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "ellipsis", "white-space" to "nowrap", "width" to "100px"))), _tD(_ctx.multiLineText), 5),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "ellipsis", "white-space" to "nowrap", "width" to "200px"))), _tD(_ctx.multiLineText), 5),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "ellipsis", "white-space" to "nowrap", "width" to "300px"))), _tD(_ctx.multiLineText), 5)
                )),
                _cE("view", _uM("class" to "margin-bottom-10"), _uA(
                    _cE("text", _uM("class" to "font-weight-bold"), "lines:1 text-overflow:ellipsis"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("text-overflow" to "ellipsis", "lines" to "1"))), _tD(_ctx.multiLineText), 5)
                ))
            ), 4)
        ), 4)
    }
    open var multiLineText: String by `$data`
    open var singleLineText: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("multiLineText" to "HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言", "singleLineText" to "uts，大一统语言（单行文本）")
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
                return _uM("font-size-20" to _pS(_uM("fontSize" to 20)), "font-weight-bold" to _pS(_uM("fontWeight" to "bold")), "margin-bottom-10" to _pS(_uM("marginBottom" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
