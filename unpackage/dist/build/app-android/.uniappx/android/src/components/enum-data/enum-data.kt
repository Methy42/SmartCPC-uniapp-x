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
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenComponentsEnumDataEnumData : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var title: String by `$props`
    open var items: UTSArray<ItemType> by `$props`
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsEnumDataEnumData) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenComponentsEnumDataEnumData
            val _cache = __ins.renderCache
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread)
            }
            val props = __props
            val isDarkMode = computed(fun(): Boolean {
                return state.isDarkMode
            }
            )
            val current = ref(0)
            fun gen__change_fn(e: RadioGroupChangeEvent) {
                val selected = props.items.find(fun(item: ItemType): Boolean {
                    return item.value.toString(10) == e.detail.value
                }
                )
                if (selected != null) {
                    emit("change", selected.value)
                    uni_showToast(ShowToastOptions(icon = "none", title = "当前选中:" + selected.name))
                }
            }
            val _change = ::gen__change_fn
            return fun(): Any? {
                val _component_radio = resolveComponent("radio")
                val _component_radio_group = resolveComponent("radio-group")
                return _cE(Fragment, null, _uA(
                    _cE("view", _uM("class" to _nC(_uA(
                        "uni-padding-wrap",
                        if (unref(isDarkMode)) {
                            "theme-dark"
                        } else {
                            "theme-light"
                        }
                    ))), _uA(
                        _cE("view", _uM("class" to "uni-title uni-common-mt"), _uA(
                            _cE("text", _uM("class" to "uni-title-text"), _tD(_ctx.title), 1)
                        ))
                    ), 2),
                    _cE("view", _uM("class" to _nC(_uA(
                        "uni-list uni-common-pl",
                        if (unref(isDarkMode)) {
                            "theme-dark"
                        } else {
                            "theme-light"
                        }
                    ))), _uA(
                        _cV(_component_radio_group, _uM("onChange" to _change), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                                    return _cV(_component_radio, _uM("class" to _nC(_uA(
                                        "uni-list-cell uni-list-cell-pd",
                                        if (index < _ctx.items.length - 1) {
                                            "uni-list-cell-line"
                                        } else {
                                            ""
                                        }
                                    )), "key" to item.name, "value" to (item.value + ""), "color" to if (unref(isDarkMode)) {
                                        "#a8a8b7"
                                    } else {
                                        "#007AFF"
                                    }
                                    ), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _cE("text", _uM("class" to "radio-text"), _tD(item.name), 1)
                                        )
                                    }
                                    ), "_" to 2), 1032, _uA(
                                        "class",
                                        "value",
                                        "color"
                                    ))
                                }
                                ), 128)
                            )
                        }
                        ), "_" to 1))
                    ), 2)
                ), 64)
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("radio-text" to _uM(".uni-list " to _uM("color" to "var(--text-color, #333333)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM("change" to null)
        var props = _nP(_uM("title" to _uM("type" to "String", "default" to ""), "items" to _uM("type" to "Array", "required" to true)))
        var propsNeedCastKeys = _uA(
            "title"
        )
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
