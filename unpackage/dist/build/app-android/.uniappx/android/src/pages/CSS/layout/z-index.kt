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
open class GenPagesCSSLayoutZIndex : BasePage {
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
        return _cE(Fragment, null, _uA(
            _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
                _cE("view", _uM("style" to _nS(_uM("position" to "absolute", "z-index" to "0"))), _uA(
                    _cE("view", _uM("class" to "common fixed default"), _uA(
                        _cE("text", null, "position: fixed"),
                        _cE("text", null, "z-index: 10")
                    )),
                    _cE("view", _uM("class" to "common fixed specified"), _uA(
                        _cE("text", null, "position: fixed"),
                        _cE("text", null, "z-index: 5")
                    )),
                    _cE("view", _uM("class" to "common fixed floor"), _uA(
                        _cE("text", null, "position: fixed"),
                        _cE("text", null, "z-index: -1")
                    ))
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("top" to "250px"))), _uA(
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "red", "z-index" to "10"))), _uA(
                        _cE("text", null, "z-index: 10")
                    ), 4),
                    _cE("view", _uM("ref" to "view", "class" to "common", "style" to _nS(_uM("background-color" to "green", "z-index" to "5", "top" to "-37px", "left" to "87px")), "onClick" to fun(){
                        _ctx.changeZIndex(20)
                    }
                    ), _uA(
                        _cE("text", null, "z-index: " + _tD(_ctx.zIndex), 1),
                        _cE("text", null, "点击修改z-index")
                    ), 12, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "common", "style" to _nS(_uM("background-color" to "blue", "top" to "-75px", "left" to "175px"))), _uA(
                        _cE("text", null, "z-index: 0")
                    ), 4)
                ), 4),
                _cE("view", null, _uA(
                    _cE("view", null, _uA(
                        _cE("view", _uM("class" to "common fixed popup", "style" to _nS(_uM("background-color" to "aqua", "z-index" to "5"))), _uA(
                            _cE("text", null, "position: fixed"),
                            _cE("text", null, "z-index: 5")
                        ), 4)
                    ))
                ))
            ), 4),
            if (isTrue(_ctx.autoTest)) {
                _cE("view", _uM("key" to 0), _uA(
                    _cE("view", _uM("style" to _nS(_uM("z-index" to "1", "position" to "fixed"))), "111", 4),
                    _cE("view", _uM("style" to _nS(_uM("width" to "750rpx"))), "222", 4)
                ))
            } else {
                _cC("v-if", true)
            }
        ), 64)
    }
    open var zIndex: Number by `$data`
    open var autoTest: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("zIndex" to 5, "autoTest" to false)
    }
    open var changeZIndex = ::gen_changeZIndex_fn
    open fun gen_changeZIndex_fn(zIndex: Number) {
        this.zIndex = 20
        (this.`$refs`["view"] as UniElement).style.setProperty("z-index", zIndex)
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
                return _uM("common" to _pS(_uM("width" to 125, "height" to 125, "justifyContent" to "center", "alignItems" to "center")), "fixed" to _pS(_uM("position" to "fixed")), "default" to _pS(_uM("backgroundColor" to "#FF0000", "zIndex" to 10, "top" to "var(--uni-safe-area-inset-top)", "left" to "var(--uni-safe-area-inset-left)")), "specified" to _pS(_uM("backgroundColor" to "#008000", "zIndex" to 5, "top" to 87, "left" to 87)), "floor" to _pS(_uM("backgroundColor" to "#D2691E", "top" to 250, "left" to 175, "zIndex" to -1)), "popup" to _pS(_uM("top" to 320, "left" to 87, "height" to 40)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
