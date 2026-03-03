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
open class GenPagesStatisticsStatistics : BasePage {
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
        var setup: (__props: GenPagesStatisticsStatistics) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesStatisticsStatistics
            val _cache = __ins.renderCache
            val yearList = ref(_uA<String>("2023", "2024", "2025", "2026"))
            val selectedYear = ref("2025")
            val onYearChange = fun(kVal: Any){
                console.log("选择年份：", kVal, " at pages/statistics/statistics.uvue:69")
            }
            val columnOpts = ref<ColumnOpts>(ColumnOpts(color = _uA(
                "#C8102E"
            ), padding = _uA(
                15,
                15,
                0,
                15
            ), xAxis = XAxisConfig(disableGrid = true), yAxis = YAxisConfig(min = 0, max = 8)))
            val columnData = ref<ColumnData>(ColumnData(categories = _uA(
                "1月",
                "2月",
                "3月",
                "4月",
                "5月",
                "6月",
                "7月",
                "8月",
                "9月",
                "10月",
                "11月",
                "12月"
            ), series = _uA(
                SeriesItem(name = "开展次数", data = _uA(
                    3,
                    2,
                    4,
                    5,
                    3,
                    6,
                    4,
                    7,
                    5,
                    4,
                    3,
                    6
                ))
            )))
            val pieOpts = ref<PieOpts>(PieOpts(color = _uA(
                "#C8102E",
                "#FF8C00",
                "#1E90FF",
                "#9370DB",
                "#D3D3D3",
                "#F0E68C"
            ), padding = _uA(
                15,
                15,
                0,
                15
            )))
            val pieData = ref<PieData>(PieData(series = _uA(
                PieSeriesItem(name = "支部党员大会", data = 16),
                PieSeriesItem(name = "支部委员会", data = 12),
                PieSeriesItem(name = "党小组会", data = 10),
                PieSeriesItem(name = "党课", data = 8),
                PieSeriesItem(name = "理论学习", data = 0),
                PieSeriesItem(name = "支部活动", data = 0)
            )))
            val rateList = ref(_uA<RateItem>(RateItem(rate = 98, name = "支部党员大会 参会率", color = "#C8102E"), RateItem(rate = 96, name = "支部委员会 参会率", color = "#FF8C00"), RateItem(rate = 95, name = "党小组会 参会率", color = "#1E90FF"), RateItem(rate = 95, name = "理论学习 参会率", color = "#9370DB"), RateItem(rate = 95, name = "党课 参会率", color = "#48D1CC"), RateItem(rate = 95, name = "支部活动 参会率", color = "#32CD32")))
            val taskColumns = ref(_uA<TaskColumn>(TaskColumn(title = "序号", key = "id"), TaskColumn(title = "任务名称", key = "name"), TaskColumn(title = "完成状态", key = "status")))
            val taskData = ref(_uA<TaskItem>(TaskItem(id = 1, name = "党风廉政建设", status = "进行中"), TaskItem(id = 2, name = "主题党日活动", status = "已完成"), TaskItem(id = 3, name = "党员教育培训", status = "进行中")))
            return fun(): Any? {
                val _component_u_picker = resolveComponent("u-picker")
                val _component_qiun_data_charts = resolveComponent("qiun-data-charts")
                val _component_u_circle_progress = resolveComponent("u-circle-progress")
                val _component_u_table = resolveComponent("u-table")
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("view", _uM("class" to "page-header"), _uA(
                        _cE("image", _uM("class" to "star-icon", "src" to "/static/star.png", "mode" to "widthFix")),
                        _cE("text", _uM("class" to "page-title"), "数据看板"),
                        _cV(_component_u_picker, _uM("mode" to "selector", "range" to yearList.value, "modelValue" to selectedYear.value, "onUpdate:modelValue" to fun(`$event`: String){
                            selectedYear.value = `$event`
                        }
                        , "onChange" to onYearChange, "class" to "year-picker"), null, 8, _uA(
                            "range",
                            "modelValue",
                            "onUpdate:modelValue"
                        ))
                    )),
                    _cE("view", _uM("class" to "data-card"), _uA(
                        _cE("view", _uM("class" to "card-header"), _uA(
                            _cE("image", _uM("class" to "party-icon", "src" to "/static/party-icon.png", "mode" to "widthFix")),
                            _cE("text", _uM("class" to "card-title"), "中共南水北调（江苏）数智科技有限公司支部")
                        )),
                        _cE("view", _uM("class" to "data-grid"), _uA(
                            _cE("view", _uM("class" to "data-item red"), _uA(
                                _cE("text", _uM("class" to "data-num"), "25名"),
                                _cE("text", _uM("class" to "data-label"), "党员总数")
                            )),
                            _cE("view", _uM("class" to "data-item blue"), _uA(
                                _cE("text", _uM("class" to "data-num"), "38次"),
                                _cE("text", _uM("class" to "data-label"), "三会一课")
                            )),
                            _cE("view", _uM("class" to "data-item purple"), _uA(
                                _cE("text", _uM("class" to "data-num"), "15次"),
                                _cE("text", _uM("class" to "data-label"), "支部活动")
                            ))
                        ))
                    )),
                    _cE("view", _uM("class" to "chart-card"), _uA(
                        _cE("text", _uM("class" to "chart-title"), "三会一课"),
                        _cV(_component_qiun_data_charts, _uM("type" to "column", "opts" to columnOpts.value, "chartData" to columnData.value), null, 8, _uA(
                            "opts",
                            "chartData"
                        )),
                        _cE("text", _uM("class" to "chart-subtitle"), "组织生活 51次"),
                        _cV(_component_qiun_data_charts, _uM("type" to "pie", "opts" to pieOpts.value, "chartData" to pieData.value), null, 8, _uA(
                            "opts",
                            "chartData"
                        ))
                    )),
                    _cE("view", _uM("class" to "rate-card"), _uA(
                        _cE("view", _uM("class" to "rate-grid"), _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(rateList.value, fun(item, index, __index, _cached): Any {
                                return _cE("view", _uM("class" to "rate-item", "key" to index), _uA(
                                    _cV(_component_u_circle_progress, _uM("percentage" to item.rate, "strokeWidth" to 10, "color" to item.color), null, 8, _uA(
                                        "percentage",
                                        "color"
                                    )),
                                    _cE("text", _uM("class" to "rate-num"), _tD(item.rate) + "%", 1),
                                    _cE("text", _uM("class" to "rate-text"), _tD(item.name), 1)
                                ))
                            }
                            ), 128)
                        ))
                    )),
                    _cE("view", _uM("class" to "task-card"), _uA(
                        _cE("text", _uM("class" to "task-title"), "党支部2025年度党建工作任务清单"),
                        _cV(_component_u_table, _uM("columns" to taskColumns.value, "data" to taskData.value, "border" to ""), null, 8, _uA(
                            "columns",
                            "data"
                        ))
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
                return _uM("container" to _pS(_uM("backgroundColor" to "#F5F5F5", "display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingBottom" to "100rpx")), "page-header" to _pS(_uM("display" to "flex", "alignItems" to "center", "justifyContent" to "space-between", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "backgroundColor" to "#ffffff")), "star-icon" to _pS(_uM("width" to "40rpx", "height" to "40rpx", "marginRight" to "10rpx")), "page-title" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold", "color" to "#333333")), "year-picker" to _pS(_uM("width" to "120rpx")), "data-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "marginTop" to "20rpx", "marginRight" to "30rpx", "marginBottom" to "20rpx", "marginLeft" to "30rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx")), "card-header" to _pS(_uM("display" to "flex", "alignItems" to "center", "marginBottom" to "30rpx")), "party-icon" to _pS(_uM("width" to "40rpx", "height" to "40rpx", "marginRight" to "10rpx")), "card-title" to _pS(_uM("fontSize" to "28rpx", "color" to "#333333")), "data-grid" to _pS(_uM("display" to "flex", "flexWrap" to "wrap", "marginLeft" to "-10rpx", "marginRight" to "-10rpx")), "data-item" to _uM("" to _uM("borderTopLeftRadius" to "12rpx", "borderTopRightRadius" to "12rpx", "borderBottomRightRadius" to "12rpx", "borderBottomLeftRadius" to "12rpx", "paddingTop" to "20rpx", "paddingRight" to "20rpx", "paddingBottom" to "20rpx", "paddingLeft" to "20rpx", "textAlign" to "center", "color" to "#ffffff", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "marginTop" to 0, "marginRight" to "10rpx", "marginBottom" to "20rpx", "marginLeft" to "10rpx"), ".red" to _uM("backgroundColor" to "#C8102E"), ".blue" to _uM("backgroundColor" to "#1E90FF"), ".purple" to _uM("backgroundColor" to "#9370DB")), "data-num" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold")), "data-label" to _pS(_uM("fontSize" to "24rpx", "marginTop" to "10rpx")), "chart-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "marginTop" to "20rpx", "marginRight" to "30rpx", "marginBottom" to "20rpx", "marginLeft" to "30rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx")), "chart-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "textAlign" to "center", "marginBottom" to "20rpx")), "chart-subtitle" to _pS(_uM("fontSize" to "28rpx", "color" to "#666666", "marginTop" to "20rpx", "marginRight" to 0, "marginBottom" to "20rpx", "marginLeft" to 0)), "rate-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "marginTop" to "20rpx", "marginRight" to "30rpx", "marginBottom" to "20rpx", "marginLeft" to "30rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx")), "rate-grid" to _pS(_uM("display" to "flex", "flexWrap" to "wrap", "marginLeft" to "-10rpx", "marginRight" to "-10rpx")), "rate-item" to _pS(_uM("textAlign" to "center", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "marginTop" to 0, "marginRight" to "10rpx", "marginBottom" to "20rpx", "marginLeft" to "10rpx")), "rate-num" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "marginTop" to "10rpx", "marginRight" to 0, "marginBottom" to "10rpx", "marginLeft" to 0)), "rate-text" to _pS(_uM("fontSize" to "24rpx", "color" to "#666666")), "task-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "marginTop" to "20rpx", "marginRight" to "30rpx", "marginBottom" to "20rpx", "marginLeft" to "30rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx")), "task-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "marginBottom" to "20rpx")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
