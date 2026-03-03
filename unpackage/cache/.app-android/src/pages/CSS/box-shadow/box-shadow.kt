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
open class GenPagesCSSBoxShadowBoxShadow : BasePage {
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
            this.`$nextTick`(fun(){
                var element = uni_getElementById("dynamic-height-textarea")
                element?.style?.setProperty("height", "52px")
            }
            )
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("style" to _nS(_uM("flex-grow" to "1"))), _uA(
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px 5px #00FF00"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px 5px #00FF00"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px 5px rgb(0,0,255)"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px 5px rgb(0,0,255)"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px 5px rgba(0,255,255,0.5)"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px 5px rgba(0,255,255,0.5)"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px 5px rgba(0, 0, 0, 0.5)"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px 5px rgba(0, 0, 0, 0.5)"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 10px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 10px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 5px 5px 5px 5px black（harmony暂不支持阴影扩散半径）"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "5px 5px 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: -5px -5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "-5px -5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: inset 5px 5px black（harmony暂不支持inset）"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "inset 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: inset 5px 5px 5px black（harmony暂不支持inset）"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "inset 5px 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: inset 5px 10px 5px black（harmony暂不支持inset）"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "inset 5px 10px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: inset 5px 5px 5px 5px black（harmony暂不支持inset）"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "inset 5px 5px 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: inset -5px -5px 5px black（harmony暂不支持inset）"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "inset -5px -5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow: 0px 1px 3px rgba(0,0,0,0.4)"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("box-shadow" to "0px 1px 3px rgba(0, 0, 0, 0.4)"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "circle: box-shadow: 5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-radius" to "62px", "box-shadow" to "5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "circle: box-shadow: 5px 5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-radius" to "62px", "box-shadow" to "5px 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "circle: box-shadow: 5px 10px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-radius" to "62px", "box-shadow" to "5px 10px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "circle: box-shadow: 5px 5px 5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-radius" to "62px", "box-shadow" to "5px 5px 5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "circle: box-shadow: -5px -5px 5px black"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-radius" to "62px", "box-shadow" to "-5px -5px 5px black"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "circle: box-shadow: 0px 1px 3px rgba(0,0,0,0.4)"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("class" to "common", "style" to _nS(_uM("border-radius" to "62px", "box-shadow" to "0px 1px 3px rgba(0, 0, 0, 0.4)"))), null, 4)
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "点击动态切换 box-shadow: none"),
                    _cE("view", _uM("class" to "backgroundview", "onClick" to _ctx.changed), _uA(
                        _cE("view", _uM("class" to _nC(_uA(
                            "common",
                            if (_ctx.disabled) {
                                "disabledShadow"
                            } else {
                                "shadow"
                            }
                        ))), null, 2)
                    ), 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "点击动态切换 box-shadow: 非法值"),
                    _cE("view", _uM("class" to "backgroundview", "onClick" to _ctx.changed), _uA(
                        _cE("view", _uM("class" to _nC(_uA(
                            "common",
                            if (_ctx.disabled) {
                                "invalidShadow"
                            } else {
                                "shadow"
                            }
                        ))), null, 2)
                    ), 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "box-shadow父视图动态改变高度的渲染效果"),
                    _cE("view", _uM("class" to "backgroundview"), _uA(
                        _cE("view", _uM("style" to _nS(_uM("justify-content" to "center", "align-items" to "center", "width" to "150px", "background-color" to "red", "box-shadow" to "0 0 10px"))), _uA(
                            _cE("view", null, _uA(
                                _cE("textarea", _uM("id" to "dynamic-height-textarea", "style" to _nS(_uM("margin" to "20px", "background-color" to "aqua", "height" to "32px", "width" to "110px")), "value" to "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), null, 4)
                            ))
                        ), 4)
                    ))
                ))
            ), 4)
        ), 4)
    }
    open var disabled: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("disabled" to false)
    }
    open var changed = ::gen_changed_fn
    open fun gen_changed_fn() {
        this.disabled = !this.disabled
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
                return _uM("common" to _pS(_uM("width" to 125, "height" to 125, "backgroundColor" to "#A52A2A")), "backgroundview" to _pS(_uM("width" to 250, "height" to 250, "backgroundColor" to "#FFFFFF", "justifyContent" to "center", "alignItems" to "center")), "shadow" to _pS(_uM("boxShadow" to "5px 5px black")), "disabledShadow" to _pS(_uM("boxShadow" to "none")), "invalidShadow" to _pS(_uM("boxShadow" to "abcd")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
