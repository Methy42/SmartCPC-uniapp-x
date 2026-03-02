import { ref } from 'vue'

// 选项卡
type HistoryItem = {
  title: string
  subtitle: string
  time: string
}

// 往期活动数据

const __sfc__ = defineComponent({
  __name: 'activityList',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const tabList = ref([
  { name: '待办活动' },
  { name: '往期活动' }
])
const activeTab = ref(0)

// 往期活动数据类型
const historyList = ref<HistoryItem[]>([
  {
    title: '党支部主题党日活动（共建）',
    subtitle: '南水北调江苏水源公司赴淮阴区调研乡村振兴工作 慰问驻村干部',
    time: '活动时间：2025年10月23日，时间半天'
  },
  {
    title: '“廉洁家风”主题党日活动',
    subtitle: '清风浸润数智心 廉韵筑牢发展基——数智科技公司廉洁文化宣传教育月活动走深走实',
    time: '活动时间：2025年9月23日，10:30 - 11:30'
  },
  {
    title: '党支部主题党日活动',
    subtitle: '数智科技公司党支部开展"深学讲话凝斗志 砥砺初心强信念"主题党日活动',
    time: '活动时间：2025年9月12日，时间半天'
  }
])

return (): any | null => {

const _component_u_tabs = resolveComponent("u-tabs")
const _component_u_icon = resolveComponent("u-icon")
const _component_u_button = resolveComponent("u-button")

  return _cE("view", _uM({ class: "container" }), [
    _cE("view", _uM({ class: "page-header" }), [
      _cE("image", _uM({
        class: "star-icon",
        src: "/static/star.png",
        mode: "widthFix"
      })),
      _cE("text", _uM({ class: "page-title" }), "支部活动")
    ]),
    _cV(_component_u_tabs, _uM({
      list: tabList.value,
      modelValue: activeTab.value,
      "onUpdate:modelValue": $event => {(activeTab).value = $event},
      "active-color": "#FF8C00",
      "inactive-color": "#666",
      "bg-color": "#F5F5F5"
    }), null, 8 /* PROPS */, ["list", "modelValue", "onUpdate:modelValue"]),
    activeTab.value === 0
      ? _cE("view", _uM({
          key: 0,
          class: "activity-list"
        }), [
          _cE("view", _uM({ class: "activity-card" }), [
            _cE("text", _uM({ class: "activity-title" }), "“廉洁家风”主题党日活动"),
            _cE("text", _uM({ class: "activity-subtitle" }), "清风浸润数智心 廉韵筑牢发展基——数智科技公司廉洁文化宣传教育月活动走深走实"),
            _cE("view", _uM({ class: "activity-info" }), [
              _cV(_component_u_icon, _uM({
                name: "calendar",
                size: "24",
                color: "#666"
              })),
              _cE("text", _uM({ class: "info-text" }), "会议时间：2025年11月10日 星期三 9:30 ~ 11:30")
            ]),
            _cE("view", _uM({ class: "activity-info" }), [
              _cV(_component_u_icon, _uM({
                name: "people",
                size: "24",
                color: "#666"
              })),
              _cE("text", _uM({ class: "info-text" }), "会议组织：数智公司党支部")
            ]),
            _cE("view", _uM({ class: "activity-info" }), [
              _cV(_component_u_icon, _uM({
                name: "location",
                size: "24",
                color: "#666"
              })),
              _cE("text", _uM({ class: "info-text" }), "会议地点：311室")
            ]),
            _cE("view", _uM({ class: "btn-group" }), [
              _cV(_component_u_button, _uM({
                class: "btn-group-btn",
                text: "参加",
                type: "primary",
                size: "mini",
                "bg-color": "#FF8C00"
              })),
              _cV(_component_u_button, _uM({
                text: "请假",
                type: "default",
                size: "mini",
                "border-color": "#FF8C00",
                color: "#FF8C00"
              }))
            ])
          ])
        ])
      : _cE("view", _uM({
          key: 1,
          class: "activity-list"
        }), [
          _cE(Fragment, null, RenderHelpers.renderList(historyList.value, (item, index, __index, _cached): any => {
            return _cE("view", _uM({
              class: "activity-card",
              key: index
            }), [
              _cE("text", _uM({ class: "activity-title" }), _tD(item.title), 1 /* TEXT */),
              _cE("text", _uM({ class: "activity-subtitle" }), _tD(item.subtitle), 1 /* TEXT */),
              _cE("view", _uM({ class: "activity-time" }), [
                _cV(_component_u_icon, _uM({
                  name: "calendar",
                  size: "24",
                  color: "#666"
                })),
                _cE("text", _uM({ class: "time-text" }), _tD(item.time), 1 /* TEXT */)
              ])
            ])
          }), 128 /* KEYED_FRAGMENT */)
        ])
  ])
}
}

})
export default __sfc__
const GenPagesActivityActivityListStyles = [_uM([["container", _pS(_uM([["backgroundColor", "#F5F5F5"], ["display", "flex"], ["flexDirection", "column"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingBottom", "100rpx"]]))], ["page-header", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["paddingTop", "20rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"], ["backgroundColor", "#ffffff"]]))], ["star-icon", _pS(_uM([["width", "40rpx"], ["height", "40rpx"], ["marginRight", "10rpx"]]))], ["page-title", _pS(_uM([["fontSize", "36rpx"], ["fontWeight", "bold"], ["color", "#333333"]]))], ["activity-list", _pS(_uM([["paddingTop", "20rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"]]))], ["activity-card", _pS(_uM([["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "16rpx"], ["borderTopRightRadius", "16rpx"], ["borderBottomRightRadius", "16rpx"], ["borderBottomLeftRadius", "16rpx"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"], ["marginBottom", "20rpx"]]))], ["activity-title", _pS(_uM([["fontSize", "32rpx"], ["fontWeight", "bold"], ["color", "#333333"], ["marginBottom", "10rpx"]]))], ["activity-subtitle", _pS(_uM([["fontSize", "24rpx"], ["color", "#666666"], ["marginBottom", "20rpx"], ["lineHeight", 1.5]]))], ["activity-info", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["marginBottom", "15rpx"]]))], ["activity-time", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["marginBottom", "15rpx"]]))], ["info-text", _pS(_uM([["fontSize", "28rpx"], ["color", "#666666"], ["marginLeft", "10rpx"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["time-text", _pS(_uM([["fontSize", "28rpx"], ["color", "#666666"], ["marginLeft", "10rpx"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["btn-group", _pS(_uM([["display", "flex"], ["justifyContent", "flex-end"], ["marginTop", "20rpx"]]))], ["btn-group-btn", _pS(_uM([["marginRight:first-child", "20rpx"]]))]])]
