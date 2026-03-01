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
open class GenPagesIndexIndex : BasePage {
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
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexIndex) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesIndexIndex
            val _cache = __ins.renderCache
            val funcList = ref(_uA(
                object : UTSJSONObject() {
                    var name = "支部党员大会"
                    var icon = "/static/icons/meeting1.png"
                },
                object : UTSJSONObject() {
                    var name = "支部委员会"
                    var icon = "/static/icons/meeting2.png"
                },
                object : UTSJSONObject() {
                    var name = "党小组会"
                    var icon = "/static/icons/meeting3.png"
                },
                object : UTSJSONObject() {
                    var name = "党课"
                    var icon = "/static/icons/meeting4.png"
                },
                object : UTSJSONObject() {
                    var name = "理论学习"
                    var icon = "/static/icons/study.png"
                },
                object : UTSJSONObject() {
                    var name = "支部活动"
                    var icon = "/static/icons/activity.png"
                }
            ))
            return fun(): Any? {
                val _component_u_button = resolveComponent("u-button")
                val _component_u_badge = resolveComponent("u-badge")
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("view", _uM("class" to "header"), _uA(
                        _cE("image", _uM("class" to "avatar", "src" to "/static/avatar.png", "mode" to "aspectFill")),
                        _cE("view", _uM("class" to "title"), _uA(
                            _cE("image", _uM("class" to "party-icon", "src" to "/static/party-icon.png", "mode" to "widthFix")),
                            _cE("text", _uM("class" to "title-text"), "水源红·智慧党建")
                        )),
                        _cE("view", _uM("class" to "header-btns"), _uA(
                            _cV(_component_u_button, _uM("icon" to "column-chart", "text" to "数据看板", "size" to "mini", "type" to "text", "color" to "#fff")),
                            _cV(_component_u_badge, _uM("count" to 4, "type" to "danger", "dot" to false), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    _cV(_component_u_button, _uM("icon" to "message", "size" to "mini", "type" to "text", "color" to "#fff"))
                                )
                            }
                            ), "_" to 1))
                        ))
                    )),
                    _cE("view", _uM("class" to "func-grid"), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(funcList.value, fun(item, index, __index, _cached): Any {
                            return _cE("view", _uM("class" to "func-item", "key" to index), _uA(
                                _cE("image", _uM("class" to "func-icon", "src" to item.icon, "mode" to "widthFix"), null, 8, _uA(
                                    "src"
                                )),
                                _cE("text", _uM("class" to "func-text"), _tD(item.name), 1)
                            ))
                        }
                        ), 128)
                    )),
                    _cE("view", _uM("class" to "footer"), _uA(
                        _cE("text", _uM("class" to "copyright"), "技术支持：南水北调（江苏）数智科技有限公司"),
                        _cV(_component_u_button, _uM("class" to "share-btn", "shape" to "circle", "icon" to "share", "size" to "mini", "type" to "primary"))
                    ))
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("container" to _pS(_uM("backgroundImage" to "linear-gradient(#C8102E, #A80E26)", "backgroundColor" to "rgba(0,0,0,0)", "paddingBottom" to 0)), "header" to _pS(_uM("display" to "flex", "alignItems" to "center", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "color" to "#ffffff")), "avatar" to _pS(_uM("width" to "80rpx", "height" to "80rpx", "marginRight" to "20rpx")), "title" to _pS(_uM("display" to "flex", "alignItems" to "center", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "party-icon" to _pS(_uM("width" to "40rpx", "height" to "40rpx", "marginRight" to "10rpx")), "title-text" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold", "color" to "#FFD700")), "header-btns" to _pS(_uM("display" to "flex", "gap" to "15rpx")), "func-grid" to _pS(_uM("gridTemplateColumns" to "repeat(2, 1fr)", "gap" to "30rpx", "paddingTop" to "40rpx", "paddingRight" to "50rpx", "paddingBottom" to "40rpx", "paddingLeft" to "50rpx", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "func-item" to _pS(_uM("display" to "flex", "flexDirection" to "column", "alignItems" to "center", "justifyContent" to "center", "backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.2)", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "40rpx", "paddingRight" to "20rpx", "paddingBottom" to "40rpx", "paddingLeft" to "20rpx")), "func-icon" to _pS(_uM("width" to "80rpx", "height" to "80rpx", "marginBottom" to "20rpx")), "func-text" to _pS(_uM("fontSize" to "32rpx", "color" to "#ffffff")), "footer" to _pS(_uM("display" to "flex", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx")), "copyright" to _pS(_uM("fontSize" to "24rpx", "color" to "#ffffff")), "share-btn" to _pS(_uM("width" to "60rpx", "height" to "60rpx", "backgroundImage" to "none", "backgroundColor" to "rgba(255,255,255,0.3)")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
