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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack
open class GenPagesComponentCameraCameraScanCode : BasePage {
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
        val _component_camera = resolveComponent("camera")
        return _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_camera, _uM("style" to _nS(_uM("width" to "100%", "height" to "300px")), "resolution" to "high", "mode" to "scanCode", "onScancode" to _ctx.handleScanCode), null, 8, _uA(
                "style",
                "onScancode"
            )),
            _cE("view", _uM("class" to "camera-scan-code-back-wrap"), _uA(
                _cE("button", _uM("type" to "default", "onClick" to _ctx.navigateBack), "返回正常模式", 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "camera-scan-code-table"), _uA(
                _cE("view", _uM("class" to "camera-scan-code-table-pair"), _uA(
                    _cE("view", _uM("class" to "camera-scan-code-table-pair-label"), _uA(
                        _cE("text", null, "类型")
                    )),
                    _cE("view", _uM("class" to "camera-scan-code-table-pair-value"), _uA(
                        _cE("text", null, _tD(_ctx.result?.type ?: ""), 1)
                    ))
                )),
                _cE("view", _uM("class" to "camera-scan-code-table-pair camera-scan-code-table-top-line"), _uA(
                    _cE("view", _uM("class" to "camera-scan-code-table-pair-label"), _uA(
                        _cE("text", null, "结果")
                    )),
                    _cE("view", _uM("class" to "camera-scan-code-table-pair-value"), _uA(
                        _cE("text", null, _tD(_ctx.result?.result ?: ""), 1)
                    ))
                ))
            ))
        ), 4)
    }
    open var result: CameraScanCodeResult? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("result" to null as CameraScanCodeResult?)
    }
    open var navigateBack = ::gen_navigateBack_fn
    open fun gen_navigateBack_fn() {
        uni_navigateBack(null)
    }
    open var handleScanCode = ::gen_handleScanCode_fn
    open fun gen_handleScanCode_fn(ev: UniCameraScanCodeEvent) {
        val deatil = ev.detail
        this.result = CameraScanCodeResult(type = deatil.type, result = deatil.result)
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
                return _uM("camera-scan-code-back-wrap" to _pS(_uM("display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "camera-scan-code-table" to _pS(_uM("backgroundColor" to "#FFFFFF", "marginTop" to 20)), "camera-scan-code-table-pair" to _pS(_uM("height" to 50, "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "camera-scan-code-table-pair-label" to _pS(_uM("flexGrow" to 1, "marginLeft" to 15)), "camera-scan-code-table-pair-value" to _pS(_uM("flexGrow" to 2)), "camera-scan-code-table-top-line" to _pS(_uM("borderTopWidth" to 1, "borderTopStyle" to "solid", "borderTopColor" to "#eeeeee")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
