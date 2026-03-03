import { ref } from 'vue'

// 功能项类型
type FuncItem = { __$originalPosition?: UTSSourceMapPosition<"FuncItem", "pages/index/index.uvue", 52, 6>;
  name: string
  icon: string
}

// 功能列表数据

const __sfc__ = defineComponent({
  __name: 'index',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const funcList = ref<FuncItem[]>([
  { name: '支部党员大会', icon: '/static/icons/party_meeting.svg' },
  { name: '支部委员会', icon: '/static/icons/branch_committee.svg' },
  { name: '党小组会', icon: '/static/icons/party_cell.svg' },
  { name: '党课', icon: '/static/icons/party_lecture.svg' },
  { name: '理论学习', icon: '/static/icons/theory_study.svg' },
  { name: '支部活动', icon: '/static/icons/branch_activity.svg' }
])

// 导航到统计页面
const navigateToStatistics = () => {
  uni.switchTab({
    url: '/pages/statistics/statistics'
  })
}

// 功能项点击事件
const onFuncClick = (name: string) => {
  let url = ''
  switch (name) {
    case '支部党员大会':
    case '支部委员会':
    case '党小组会':
    case '党课':
      url = '/pages/meeting/meetingList'
      break
    case '理论学习':
      // 可以跳转到理论学习页面，暂时用三会一课
      url = '/pages/meeting/meetingList'
      break
    case '支部活动':
      url = '/pages/activity/activityList'
      break
  }
  
  if (url.length > 0) {
    uni.switchTab({
      url: url
    })
  }
}

return (): any | null => {

const _component_u_button = resolveComponent("u-button")

  return _cE("view", _uM({ class: "container" }), [
    _cE("image", _uM({
      class: "background-image",
      src: "/static/background/u2.jpg",
      mode: "aspectFill"
    })),
    _cE("view", _uM({ class: "custom-navbar" }), [
      _cE("view", _uM({ class: "nav-avatar-container" }), [
        _cE("image", _uM({
          class: "nav-avatar",
          src: "/static/login-avatar.png",
          mode: "aspectFill"
        })),
        _cE("view", _uM({ class: "avatar-decoration" }), [
          _cE("image", _uM({
            class: "decoration-star",
            src: "/static/star.png",
            mode: "widthFix"
          }))
        ])
      ]),
      _cE("view", _uM({ class: "nav-right-buttons" }), [
        _cE("view", _uM({
          class: "nav-dashboard-btn",
          onClick: navigateToStatistics
        }), [
          _cE("image", _uM({
            class: "dashboard-icon",
            src: "/static/icons/dashboard.svg",
            mode: "widthFix"
          })),
          _cE("text", _uM({ class: "dashboard-text" }), "数据看板")
        ]),
        _cE("view", _uM({ class: "nav-message-btn" }), [
          _cE("text", _uM({ class: "message-text" }), "消息"),
          _cE("view", _uM({ class: "message-badge" }), "4")
        ])
      ])
    ]),
    _cE("view", _uM({ class: "func-grid" }), [
      _cE(Fragment, null, RenderHelpers.renderList(funcList.value, (item, index, __index, _cached): any => {
        return _cE("view", _uM({
          class: _nC(["func-item", _uM({'func-odd': index % 2 === 0})]),
          key: index,
          onClick: () => {onFuncClick(item.name)}
        }), [
          _cE("image", _uM({
            class: "func-icon",
            src: item.icon,
            mode: "widthFix"
          }), null, 8 /* PROPS */, ["src"]),
          _cE("text", _uM({ class: "func-text" }), _tD(item.name), 1 /* TEXT */)
        ], 10 /* CLASS, PROPS */, ["onClick"])
      }), 128 /* KEYED_FRAGMENT */)
    ]),
    _cE("view", _uM({ class: "footer" }), [
      _cE("text", _uM({ class: "copyright" }), "技术支持：南水北调（江苏）数智科技有限公司"),
      _cV(_component_u_button, _uM({
        class: "share-btn",
        shape: "circle",
        icon: "share",
        size: "mini",
        type: "primary"
      }))
    ])
  ])
}
}

})
export default __sfc__
const GenPagesIndexIndexStyles = [_uM([["container", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["paddingBottom", 0], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["position", "relative"]]))], ["background-image", _pS(_uM([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["height", "100%"], ["zIndex", -1]]))], ["custom-navbar", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignItems", "center"], ["paddingTop", "var(--status-bar-height, 40rpx)"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"], ["height", "100rpx"], ["width", "100%"], ["boxSizing", "border-box"], ["flexWrap", "nowrap"], ["whiteSpace", "nowrap"]]))], ["nav-avatar-container", _pS(_uM([["position", "relative"], ["width", "70rpx"], ["height", "70rpx"], ["flexShrink", 0]]))], ["nav-avatar", _pS(_uM([["width", "100%"], ["height", "100%"], ["borderTopWidth", "2rpx"], ["borderRightWidth", "2rpx"], ["borderBottomWidth", "2rpx"], ["borderLeftWidth", "2rpx"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#FFD700"], ["borderRightColor", "#FFD700"], ["borderBottomColor", "#FFD700"], ["borderLeftColor", "#FFD700"], ["boxSizing", "border-box"]]))], ["avatar-decoration", _pS(_uM([["position", "absolute"], ["top", "-5rpx"], ["right", "-5rpx"], ["width", "25rpx"], ["height", "25rpx"]]))], ["decoration-star", _pS(_uM([["width", "100%"], ["height", "100%"]]))], ["nav-right-buttons", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["flexShrink", 0], ["flexWrap", "nowrap"]]))], ["nav-dashboard-btn", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["color", "#ffffff"], ["fontSize", "26rpx"], ["fontFamily", "sans-serif"], ["marginRight", "20rpx"], ["whiteSpace", "nowrap"], ["flexShrink", 0]]))], ["dashboard-icon", _pS(_uM([["width", "32rpx"], ["height", "32rpx"], ["marginRight", "8rpx"], ["color", "#ffffff"], ["flexShrink", 0]]))], ["dashboard-text", _pS(_uM([["color", "#ffffff"], ["fontSize", "28rpx"], ["whiteSpace", "nowrap"]]))], ["nav-message-btn", _pS(_uM([["position", "relative"], ["borderTopLeftRadius", "20rpx"], ["borderTopRightRadius", "20rpx"], ["borderBottomRightRadius", "20rpx"], ["borderBottomLeftRadius", "20rpx"], ["paddingTop", 0], ["paddingRight", "40rpx"], ["paddingBottom", 0], ["paddingLeft", 0], ["color", "#ffffff"], ["fontSize", "28rpx"], ["fontFamily", "sans-serif"], ["whiteSpace", "nowrap"], ["flexShrink", 0]]))], ["message-text", _pS(_uM([["color", "#ffffff"], ["fontSize", "28rpx"], ["whiteSpace", "nowrap"]]))], ["message-badge", _pS(_uM([["position", "absolute"], ["right", 0], ["width", "36rpx"], ["height", "36rpx"], ["backgroundColor", "#FF6B35"], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"], ["color", "#ffffff"], ["fontSize", "22rpx"], ["fontWeight", "bold"]]))], ["func-grid", _pS(_uM([["display", "flex"], ["flexWrap", "wrap"], ["paddingTop", "40rpx"], ["paddingRight", "50rpx"], ["paddingBottom", "40rpx"], ["paddingLeft", "50rpx"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["func-item", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["justifyContent", "center"], ["backgroundImage", "none"], ["backgroundColor", "rgba(255,255,255,0.2)"], ["borderTopLeftRadius", "20rpx"], ["borderTopRightRadius", "20rpx"], ["borderBottomRightRadius", "20rpx"], ["borderBottomLeftRadius", "20rpx"], ["paddingTop", "40rpx"], ["paddingRight", "20rpx"], ["paddingBottom", "40rpx"], ["paddingLeft", "20rpx"], ["width", "50%"], ["marginBottom", "30rpx"]]))], ["func-odd", _pS(_uM([["marginRight", "30rpx"]]))], ["func-icon", _pS(_uM([["width", "80rpx"], ["height", "80rpx"], ["marginBottom", "20rpx"]]))], ["func-text", _pS(_uM([["fontSize", "32rpx"], ["color", "#ffffff"]]))], ["footer", _pS(_uM([["display", "flex"], ["justifyContent", "space-between"], ["alignItems", "center"], ["paddingTop", "20rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"]]))], ["copyright", _pS(_uM([["fontSize", "24rpx"], ["color", "#ffffff"]]))], ["share-btn", _pS(_uM([["width", "60rpx"], ["height", "60rpx"], ["backgroundImage", "none"], ["backgroundColor", "rgba(255,255,255,0.3)"]]))]])]
