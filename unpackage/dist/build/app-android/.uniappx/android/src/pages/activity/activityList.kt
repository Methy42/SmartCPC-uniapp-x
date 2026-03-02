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
open class GenPagesActivityActivityList : BasePage {
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
        var setup: (__props: GenPagesActivityActivityList) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesActivityActivityList
            val _cache = __ins.renderCache
            val tabList = ref(_uA(
                object : UTSJSONObject() {
                    var name = "待办活动"
                },
                object : UTSJSONObject() {
                    var name = "往期活动"
                }
            ))
            val activeTab = ref(0)
            val historyList = ref(_uA<HistoryItem>(HistoryItem(title = "党支部主题党日活动（共建）", subtitle = "南水北调江苏水源公司赴淮阴区调研乡村振兴工作 慰问驻村干部", time = "活动时间：2025年10月23日，时间半天"), HistoryItem(title = "“廉洁家风”主题党日活动", subtitle = "清风浸润数智心 廉韵筑牢发展基——数智科技公司廉洁文化宣传教育月活动走深走实", time = "活动时间：2025年9月23日，10:30 - 11:30"), HistoryItem(title = "党支部主题党日活动", subtitle = "数智科技公司党支部开展\"深学讲话凝斗志 砥砺初心强信念\"主题党日活动", time = "活动时间：2025年9月12日，时间半天")))
            return fun(): Any? {
                val _component_u_tabs = resolveComponent("u-tabs")
                val _component_u_icon = resolveComponent("u-icon")
                val _component_u_button = resolveComponent("u-button")
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("view", _uM("class" to "page-header"), _uA(
                        _cE("image", _uM("class" to "star-icon", "src" to "/static/star.png", "mode" to "widthFix")),
                        _cE("text", _uM("class" to "page-title"), "支部活动")
                    )),
                    _cV(_component_u_tabs, _uM("list" to tabList.value, "modelValue" to activeTab.value, "onUpdate:modelValue" to fun(`$event`: Number){
                        activeTab.value = `$event`
                    }
                    , "active-color" to "#FF8C00", "inactive-color" to "#666", "bg-color" to "#F5F5F5"), null, 8, _uA(
                        "list",
                        "modelValue",
                        "onUpdate:modelValue"
                    )),
                    if (activeTab.value === 0) {
                        _cE("view", _uM("key" to 0, "class" to "activity-list"), _uA(
                            _cE("view", _uM("class" to "activity-card"), _uA(
                                _cE("text", _uM("class" to "activity-title"), "“廉洁家风”主题党日活动"),
                                _cE("text", _uM("class" to "activity-subtitle"), "清风浸润数智心 廉韵筑牢发展基——数智科技公司廉洁文化宣传教育月活动走深走实"),
                                _cE("view", _uM("class" to "activity-info"), _uA(
                                    _cV(_component_u_icon, _uM("name" to "calendar", "size" to "24", "color" to "#666")),
                                    _cE("text", _uM("class" to "info-text"), "会议时间：2025年11月10日 星期三 9:30 ~ 11:30")
                                )),
                                _cE("view", _uM("class" to "activity-info"), _uA(
                                    _cV(_component_u_icon, _uM("name" to "people", "size" to "24", "color" to "#666")),
                                    _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                )),
                                _cE("view", _uM("class" to "activity-info"), _uA(
                                    _cV(_component_u_icon, _uM("name" to "location", "size" to "24", "color" to "#666")),
                                    _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                )),
                                _cE("view", _uM("class" to "btn-group"), _uA(
                                    _cV(_component_u_button, _uM("class" to "btn-group-btn", "text" to "参加", "type" to "primary", "size" to "mini", "bg-color" to "#FF8C00")),
                                    _cV(_component_u_button, _uM("text" to "请假", "type" to "default", "size" to "mini", "border-color" to "#FF8C00", "color" to "#FF8C00"))
                                ))
                            ))
                        ))
                    } else {
                        _cE("view", _uM("key" to 1, "class" to "activity-list"), _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(historyList.value, fun(item, index, __index, _cached): Any {
                                return _cE("view", _uM("class" to "activity-card", "key" to index), _uA(
                                    _cE("text", _uM("class" to "activity-title"), _tD(item.title), 1),
                                    _cE("text", _uM("class" to "activity-subtitle"), _tD(item.subtitle), 1),
                                    _cE("view", _uM("class" to "activity-time"), _uA(
                                        _cV(_component_u_icon, _uM("name" to "calendar", "size" to "24", "color" to "#666")),
                                        _cE("text", _uM("class" to "time-text"), _tD(item.time), 1)
                                    ))
                                ))
                            }
                            ), 128)
                        ))
                    }
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
                return _uM("container" to _pS(_uM("backgroundColor" to "#F5F5F5", "display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingBottom" to "100rpx")), "page-header" to _pS(_uM("display" to "flex", "alignItems" to "center", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "backgroundColor" to "#ffffff")), "star-icon" to _pS(_uM("width" to "40rpx", "height" to "40rpx", "marginRight" to "10rpx")), "page-title" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold", "color" to "#333333")), "activity-list" to _pS(_uM("paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx")), "activity-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx", "marginBottom" to "20rpx")), "activity-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "marginBottom" to "10rpx")), "activity-subtitle" to _pS(_uM("fontSize" to "24rpx", "color" to "#666666", "marginBottom" to "20rpx", "lineHeight" to 1.5)), "activity-info" to _pS(_uM("display" to "flex", "alignItems" to "center", "marginBottom" to "15rpx")), "activity-time" to _pS(_uM("display" to "flex", "alignItems" to "center", "marginBottom" to "15rpx")), "info-text" to _pS(_uM("fontSize" to "28rpx", "color" to "#666666", "marginLeft" to "10rpx", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "time-text" to _pS(_uM("fontSize" to "28rpx", "color" to "#666666", "marginLeft" to "10rpx", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "btn-group" to _pS(_uM("display" to "flex", "justifyContent" to "flex-end", "marginTop" to "20rpx")), "btn-group-btn" to _pS(_uM("marginRight:first-child" to "20rpx")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
