import { ref } from 'vue'

// 年份选择
type XAxisConfig = { __$originalPosition?: UTSSourceMapPosition<"XAxisConfig", "pages/statistics/statistics.uvue", 73, 6>;
  disableGrid: boolean
}

type YAxisConfig = { __$originalPosition?: UTSSourceMapPosition<"YAxisConfig", "pages/statistics/statistics.uvue", 77, 6>;
  min: number
  max: number
}

type ColumnOpts = { __$originalPosition?: UTSSourceMapPosition<"ColumnOpts", "pages/statistics/statistics.uvue", 82, 6>;
  color: string[]
  padding: number[]
  xAxis: XAxisConfig
  yAxis: YAxisConfig
}

type SeriesItem = { __$originalPosition?: UTSSourceMapPosition<"SeriesItem", "pages/statistics/statistics.uvue", 89, 6>;
  name: string
  data: number[]
}

type ColumnData = { __$originalPosition?: UTSSourceMapPosition<"ColumnData", "pages/statistics/statistics.uvue", 94, 6>;
  categories: string[]
  series: SeriesItem[]
}

// 柱状图配置
type PieSeriesItem = { __$originalPosition?: UTSSourceMapPosition<"PieSeriesItem", "pages/statistics/statistics.uvue", 121, 6>;
  name: string
  data: number
}

type PieOpts = { __$originalPosition?: UTSSourceMapPosition<"PieOpts", "pages/statistics/statistics.uvue", 126, 6>;
  color: string[]
  padding: number[]
}

type PieData = { __$originalPosition?: UTSSourceMapPosition<"PieData", "pages/statistics/statistics.uvue", 131, 6>;
  series: PieSeriesItem[]
}

// 饼图配置
type RateItem = { __$originalPosition?: UTSSourceMapPosition<"RateItem", "pages/statistics/statistics.uvue", 153, 6>;
  rate: number
  name: string
  color: string
}

// 参会率数据
type TaskColumn = { __$originalPosition?: UTSSourceMapPosition<"TaskColumn", "pages/statistics/statistics.uvue", 170, 6>;
  title: string
  key: string
}

type TaskItem = { __$originalPosition?: UTSSourceMapPosition<"TaskItem", "pages/statistics/statistics.uvue", 175, 6>;
  id: number
  name: string
  status: string
}

// 任务清单数据

const __sfc__ = defineComponent({
  __name: 'statistics',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const yearList = ref<string[]>(['2023', '2024', '2025', '2026'])
const selectedYear = ref('2025')
const onYearChange = (val: any) => {
  console.log('选择年份：', val, " at pages/statistics/statistics.uvue:69")
}

// 柱状图配置类型 - 修复内联对象字面量类型
const columnOpts = ref<ColumnOpts>({
  color: ['#C8102E'],
  padding: [15, 15, 0, 15],
  xAxis: {
    disableGrid: true
  },
  yAxis: {
    min: 0,
    max: 8
  }
})

const columnData = ref<ColumnData>({
  categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月'],
  series: [{
    name: '开展次数',
    data: [3, 2, 4, 5, 3, 6, 4, 7, 5, 4, 3, 6]
  }]
})

// 饼图配置类型
const pieOpts = ref<PieOpts>({
  color: ['#C8102E', '#FF8C00', '#1E90FF', '#9370DB', '#D3D3D3', '#F0E68C'],
  padding: [15, 15, 0, 15]
})

const pieData = ref<PieData>({
  series: [
    { name: '支部党员大会', data: 16 },
    { name: '支部委员会', data: 12 },
    { name: '党小组会', data: 10 },
    { name: '党课', data: 8 },
    { name: '理论学习', data: 0 },
    { name: '支部活动', data: 0 }
  ]
})

// 参会率数据类型
const rateList = ref<RateItem[]>([
  { rate: 98, name: '支部党员大会 参会率', color: '#C8102E' },
  { rate: 96, name: '支部委员会 参会率', color: '#FF8C00' },
  { rate: 95, name: '党小组会 参会率', color: '#1E90FF' },
  { rate: 95, name: '理论学习 参会率', color: '#9370DB' },
  { rate: 95, name: '党课 参会率', color: '#48D1CC' },
  { rate: 95, name: '支部活动 参会率', color: '#32CD32' }
])

// 任务清单数据类型
const taskColumns = ref<TaskColumn[]>([
  { title: '序号', key: 'id' },
  { title: '任务名称', key: 'name' },
  { title: '完成状态', key: 'status' }
])

const taskData = ref<TaskItem[]>([
  { id: 1, name: '党风廉政建设', status: '进行中' },
  { id: 2, name: '主题党日活动', status: '已完成' },
  { id: 3, name: '党员教育培训', status: '进行中' }
])

return (): any | null => {

const _component_u_picker = resolveComponent("u-picker")
const _component_qiun_data_charts = resolveComponent("qiun-data-charts")
const _component_u_circle_progress = resolveComponent("u-circle-progress")
const _component_u_table = resolveComponent("u-table")

  return _cE("view", _uM({ class: "container" }), [
    _cE("view", _uM({ class: "page-header" }), [
      _cE("image", _uM({
        class: "star-icon",
        src: "/static/star.png",
        mode: "widthFix"
      })),
      _cE("text", _uM({ class: "page-title" }), "数据看板"),
      _cV(_component_u_picker, _uM({
        mode: "selector",
        range: yearList.value,
        modelValue: selectedYear.value,
        "onUpdate:modelValue": $event => {(selectedYear).value = $event},
        onChange: onYearChange,
        class: "year-picker"
      }), null, 8 /* PROPS */, ["range", "modelValue", "onUpdate:modelValue"])
    ]),
    _cE("view", _uM({ class: "data-card" }), [
      _cE("view", _uM({ class: "card-header" }), [
        _cE("image", _uM({
          class: "party-icon",
          src: "/static/party-icon.png",
          mode: "widthFix"
        })),
        _cE("text", _uM({ class: "card-title" }), "中共南水北调（江苏）数智科技有限公司支部")
      ]),
      _cE("view", _uM({ class: "data-grid" }), [
        _cE("view", _uM({ class: "data-item red" }), [
          _cE("text", _uM({ class: "data-num" }), "25名"),
          _cE("text", _uM({ class: "data-label" }), "党员总数")
        ]),
        _cE("view", _uM({ class: "data-item blue" }), [
          _cE("text", _uM({ class: "data-num" }), "38次"),
          _cE("text", _uM({ class: "data-label" }), "三会一课")
        ]),
        _cE("view", _uM({ class: "data-item purple" }), [
          _cE("text", _uM({ class: "data-num" }), "15次"),
          _cE("text", _uM({ class: "data-label" }), "支部活动")
        ])
      ])
    ]),
    _cE("view", _uM({ class: "chart-card" }), [
      _cE("text", _uM({ class: "chart-title" }), "三会一课"),
      _cV(_component_qiun_data_charts, _uM({
        type: "column",
        opts: columnOpts.value,
        chartData: columnData.value
      }), null, 8 /* PROPS */, ["opts", "chartData"]),
      _cE("text", _uM({ class: "chart-subtitle" }), "组织生活 51次"),
      _cV(_component_qiun_data_charts, _uM({
        type: "pie",
        opts: pieOpts.value,
        chartData: pieData.value
      }), null, 8 /* PROPS */, ["opts", "chartData"])
    ]),
    _cE("view", _uM({ class: "rate-card" }), [
      _cE("view", _uM({ class: "rate-grid" }), [
        _cE(Fragment, null, RenderHelpers.renderList(rateList.value, (item, index, __index, _cached): any => {
          return _cE("view", _uM({
            class: "rate-item",
            key: index
          }), [
            _cV(_component_u_circle_progress, _uM({
              percentage: item.rate,
              strokeWidth: 10,
              color: item.color
            }), null, 8 /* PROPS */, ["percentage", "color"]),
            _cE("text", _uM({ class: "rate-num" }), _tD(item.rate) + "%", 1 /* TEXT */),
            _cE("text", _uM({ class: "rate-text" }), _tD(item.name), 1 /* TEXT */)
          ])
        }), 128 /* KEYED_FRAGMENT */)
      ])
    ]),
    _cE("view", _uM({ class: "task-card" }), [
      _cE("text", _uM({ class: "task-title" }), "党支部2025年度党建工作任务清单"),
      _cV(_component_u_table, _uM({
        columns: taskColumns.value,
        data: taskData.value,
        border: ""
      }), null, 8 /* PROPS */, ["columns", "data"])
    ])
  ])
}
}

})
export default __sfc__
const GenPagesStatisticsStatisticsStyles = [_uM([["container", _pS(_uM([["backgroundColor", "#F5F5F5"], ["display", "flex"], ["flexDirection", "column"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingBottom", "100rpx"]]))], ["page-header", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["justifyContent", "space-between"], ["paddingTop", "20rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"], ["backgroundColor", "#ffffff"]]))], ["star-icon", _pS(_uM([["width", "40rpx"], ["height", "40rpx"], ["marginRight", "10rpx"]]))], ["page-title", _pS(_uM([["fontSize", "36rpx"], ["fontWeight", "bold"], ["color", "#333333"]]))], ["year-picker", _pS(_uM([["width", "120rpx"]]))], ["data-card", _pS(_uM([["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "16rpx"], ["borderTopRightRadius", "16rpx"], ["borderBottomRightRadius", "16rpx"], ["borderBottomLeftRadius", "16rpx"], ["marginTop", "20rpx"], ["marginRight", "30rpx"], ["marginBottom", "20rpx"], ["marginLeft", "30rpx"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]]))], ["card-header", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["marginBottom", "30rpx"]]))], ["party-icon", _pS(_uM([["width", "40rpx"], ["height", "40rpx"], ["marginRight", "10rpx"]]))], ["card-title", _pS(_uM([["fontSize", "28rpx"], ["color", "#333333"]]))], ["data-grid", _pS(_uM([["display", "flex"], ["flexWrap", "wrap"], ["marginLeft", "-10rpx"], ["marginRight", "-10rpx"]]))], ["data-item", _uM([["", _uM([["borderTopLeftRadius", "12rpx"], ["borderTopRightRadius", "12rpx"], ["borderBottomRightRadius", "12rpx"], ["borderBottomLeftRadius", "12rpx"], ["paddingTop", "20rpx"], ["paddingRight", "20rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "20rpx"], ["textAlign", "center"], ["color", "#ffffff"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["marginTop", 0], ["marginRight", "10rpx"], ["marginBottom", "20rpx"], ["marginLeft", "10rpx"]])], [".red", _uM([["backgroundColor", "#C8102E"]])], [".blue", _uM([["backgroundColor", "#1E90FF"]])], [".purple", _uM([["backgroundColor", "#9370DB"]])]])], ["data-num", _pS(_uM([["fontSize", "36rpx"], ["fontWeight", "bold"]]))], ["data-label", _pS(_uM([["fontSize", "24rpx"], ["marginTop", "10rpx"]]))], ["chart-card", _pS(_uM([["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "16rpx"], ["borderTopRightRadius", "16rpx"], ["borderBottomRightRadius", "16rpx"], ["borderBottomLeftRadius", "16rpx"], ["marginTop", "20rpx"], ["marginRight", "30rpx"], ["marginBottom", "20rpx"], ["marginLeft", "30rpx"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]]))], ["chart-title", _pS(_uM([["fontSize", "32rpx"], ["fontWeight", "bold"], ["color", "#333333"], ["textAlign", "center"], ["marginBottom", "20rpx"]]))], ["chart-subtitle", _pS(_uM([["fontSize", "28rpx"], ["color", "#666666"], ["marginTop", "20rpx"], ["marginRight", 0], ["marginBottom", "20rpx"], ["marginLeft", 0]]))], ["rate-card", _pS(_uM([["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "16rpx"], ["borderTopRightRadius", "16rpx"], ["borderBottomRightRadius", "16rpx"], ["borderBottomLeftRadius", "16rpx"], ["marginTop", "20rpx"], ["marginRight", "30rpx"], ["marginBottom", "20rpx"], ["marginLeft", "30rpx"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]]))], ["rate-grid", _pS(_uM([["display", "flex"], ["flexWrap", "wrap"], ["marginLeft", "-10rpx"], ["marginRight", "-10rpx"]]))], ["rate-item", _pS(_uM([["textAlign", "center"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["marginTop", 0], ["marginRight", "10rpx"], ["marginBottom", "20rpx"], ["marginLeft", "10rpx"]]))], ["rate-num", _pS(_uM([["fontSize", "32rpx"], ["fontWeight", "bold"], ["color", "#333333"], ["marginTop", "10rpx"], ["marginRight", 0], ["marginBottom", "10rpx"], ["marginLeft", 0]]))], ["rate-text", _pS(_uM([["fontSize", "24rpx"], ["color", "#666666"]]))], ["task-card", _pS(_uM([["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "16rpx"], ["borderTopRightRadius", "16rpx"], ["borderBottomRightRadius", "16rpx"], ["borderBottomLeftRadius", "16rpx"], ["marginTop", "20rpx"], ["marginRight", "30rpx"], ["marginBottom", "20rpx"], ["marginLeft", "30rpx"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]]))], ["task-title", _pS(_uM([["fontSize", "32rpx"], ["fontWeight", "bold"], ["color", "#333333"], ["marginBottom", "20rpx"]]))]])]
