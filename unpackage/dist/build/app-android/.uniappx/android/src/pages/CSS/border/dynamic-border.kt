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
open class GenPagesCSSBorderDynamicBorder : BasePage {
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
            _cE("view", _uM("style" to _nS(_uM("margin" to "15px", "border-radius" to "10px", "background-color" to "white"))), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_uA(
                    0,
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8,
                    9
                ), fun(index, __key, __index, _cached): Any {
                    return _cE("view", _uM("key" to index, "class" to _nC((if (index < 9) {
                        "bb1"
                    } else {
                        ""
                    }
                    ) + " " + (if (_ctx.currentIndex == 0) {
                        "btlr10 btrr10"
                    } else {
                        if (_ctx.currentIndex == 9) {
                            "bblr10 bbrr10"
                        } else {
                            ""
                        }
                    }
                    )), "style" to _nS(_uA(
                        _uM("flex-direction" to "row", "align-items" to "center", "padding" to "15px"),
                        if (index == _ctx.currentIndex) {
                            "background-color :#57BE6A;"
                        } else {
                            ""
                        }
                    )), "onClick" to fun(){
                        _ctx.changeIndex(index)
                    }
                    ), _uA(
                        _cE("view", null, _uA(
                            _cE("text", _uM("style" to _nS(_uA(
                                _uM("font-size" to "14px"),
                                if (index == _ctx.currentIndex) {
                                    "color: #FFFFFF;"
                                } else {
                                    ""
                                }
                            ))), _tD(index), 5)
                        ))
                    ), 14, _uA(
                        "onClick"
                    ))
                }
                ), 64)
            ), 4),
            _cE("view", _uM("style" to _nS(_uM("margin" to "15px", "margin-top" to "20px"))), _uA(
                _cE("text", null, "动态切换 border 为空值"),
                _cE("text", _uM("onClick" to _ctx.setBorderBlank, "class" to "common", "style" to _nS(_ctx.style)), _tD(if (_ctx.isSelect) {
                    "选中"
                } else {
                    "未选中"
                }
                ), 13, _uA(
                    "onClick"
                ))
            ), 4)
        ), 4)
    }
    open var currentIndex: Number by `$data`
    open var style: String by `$data`
    open var isSelect: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("currentIndex" to 0, "style" to "" as String, "isSelect" to computed<Boolean>(fun(): Boolean {
            return this.style == defaultStyle
        }
        ))
    }
    open var changeIndex = ::gen_changeIndex_fn
    open fun gen_changeIndex_fn(index: Number) {
        this.currentIndex = index
    }
    open var setBorderBlank = ::gen_setBorderBlank_fn
    open fun gen_setBorderBlank_fn() {
        this.style = if (this.style == "") {
            defaultStyle
        } else {
            ""
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
                return _uM("common" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4, "width" to 120, "textAlign" to "center", "marginTop" to 10)), "bb1" to _pS(_uM("borderBottomWidth" to "1rpx", "borderBottomStyle" to "solid", "borderBottomColor" to "#EEEEEE")), "btlr10" to _pS(_uM("borderTopLeftRadius" to "10rpx")), "btrr10" to _pS(_uM("borderTopRightRadius" to "10rpx")), "bblr10" to _pS(_uM("borderBottomLeftRadius" to "10rpx")), "bbrr10" to _pS(_uM("borderBottomRightRadius" to "10rpx")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
