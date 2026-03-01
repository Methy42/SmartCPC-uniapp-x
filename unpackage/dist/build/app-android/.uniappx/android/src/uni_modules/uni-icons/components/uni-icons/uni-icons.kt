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
open class GenUniModulesUniIconsComponentsUniIconsUniIcons : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("text", _uM("class" to "uni-icons", "style" to _nS(_ctx.styleObj)), _uA(
            renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                return _uA(
                    _tD(_ctx.unicode)
                )
            }
            )
        ), 4)
    }
    open var type: String by `$props`
    open var color: String by `$props`
    open var size: Number by `$props`
    open var fontFamily: String by `$props`
    open var unicode: String by `$data`
    open var iconSize: String by `$data`
    open var styleObj: UTSJSONObject by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("unicode" to computed<String>(fun(): String {
            var codes = fontData.find(fun(item: IconsDataItem): Boolean {
                return item.font_class == this.type
            }
            )
            if (codes != null) {
                return codes.unicode
            }
            return ""
        }
        ), "iconSize" to computed<String>(fun(): String {
            val size = this.size
            return this.getFontSize(size as Number)
        }
        ), "styleObj" to computed<UTSJSONObject>(fun(): UTSJSONObject {
            if (this.fontFamily !== "") {
                return _uO("color" to this.color, "fontSize" to this.iconSize, "fontFamily" to this.fontFamily)
            }
            return _uO("color" to this.color, "fontSize" to this.iconSize)
        }
        ))
    }
    open var getFontSize = ::gen_getFontSize_fn
    open fun gen_getFontSize_fn(size: Number): String {
        return size + "px"
    }
    companion object {
        var name = "uni-icons"
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("uni-icons" to _pS(_uM("fontFamily" to "UniIconsFontFamily", "fontSize" to 18, "fontStyle" to "normal", "color" to "#333333")), "@FONT-FACE" to _uM("0" to _uM("fontFamily" to "UniIconsFontFamily", "src" to "url('/assets/uniicons.32e978a5.ttf')")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM("type" to _uM("type" to "String", "default" to ""), "color" to _uM("type" to "String", "default" to "#333333"), "size" to _uM("type" to "Number", "default" to 16), "fontFamily" to _uM("type" to "String", "default" to "")))
        var propsNeedCastKeys = _uA(
            "type",
            "color",
            "size",
            "fontFamily"
        )
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
