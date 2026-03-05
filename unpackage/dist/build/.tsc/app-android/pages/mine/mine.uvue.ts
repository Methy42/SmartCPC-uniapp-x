
const __sfc__ = defineComponent({
  __name: 'mine',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

// 暂无业务逻辑

return (): any | null => {

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
        }))
      ]),
      _cE("view", _uM({ class: "nav-logo-container" }), [
        _cE("image", _uM({
          class: "nav-logo",
          src: "/static/index-logo.png",
          mode: "aspectFit"
        }))
      ]),
      _cE("view", _uM({ class: "nav-right-buttons" }), [
        _cE("view", _uM({ class: "nav-message-btn" }), [
          _cE("text", _uM({ class: "message-text" }), "消息"),
          _cE("view", _uM({ class: "message-badge" }), "4")
        ])
      ])
    ]),
    _cE("view", _uM({ class: "content-container" }), [
      _cE("view", _uM({ class: "content-title-container" }), [
        _cE("image", _uM({
          class: "content-title-background",
          src: "/static/mine-title-background.png",
          mode: "aspectFit"
        })),
        _cE("text", _uM({ class: "content-title-text" }), "个人中心")
      ]),
      _cE("view", _uM({ class: "info-container" }), [
        _cE("view", _uM({ class: "user-avatar-container" }), [
          _cE("image", _uM({
            class: "user-avatar",
            src: "/static/user-avatar.jpg",
            mode: "aspectFit"
          }))
        ]),
        _cE("view", _uM({ class: "user-name-container" }))
      ])
    ])
  ])
}
}

})
export default __sfc__
const GenPagesMineMineStyles = [_uM([["container", _pS(_uM([["backgroundColor", "#F5F5F5"], ["display", "flex"], ["flexDirection", "column"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingBottom", "100rpx"]]))], ["background-image", _pS(_uM([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["height", "100%"], ["zIndex", -1]]))], ["custom-navbar", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignItems", "center"], ["paddingTop", "var(--status-bar-height, 40rpx)"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"], ["height", "100rpx"], ["width", "100%"], ["boxSizing", "border-box"], ["flexWrap", "nowrap"], ["whiteSpace", "nowrap"]]))], ["nav-avatar-container", _pS(_uM([["position", "relative"], ["width", "70rpx"], ["height", "70rpx"], ["flexShrink", 0]]))], ["nav-avatar", _pS(_uM([["width", "100%"], ["height", "100%"], ["boxSizing", "border-box"]]))], ["avatar-decoration", _pS(_uM([["position", "absolute"], ["top", "-5rpx"], ["right", "-5rpx"], ["width", "25rpx"], ["height", "25rpx"]]))], ["decoration-star", _pS(_uM([["width", "100%"], ["height", "100%"]]))], ["nav-logo-container", _pS(_uM([["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["nav-right-buttons", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["flexShrink", 0], ["flexWrap", "nowrap"]]))], ["nav-dashboard-btn", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["color", "#ffffff"], ["fontSize", "26rpx"], ["fontFamily", "sans-serif"], ["marginRight", "20rpx"], ["whiteSpace", "nowrap"], ["flexShrink", 0]]))], ["dashboard-icon", _pS(_uM([["width", "32rpx"], ["height", "32rpx"], ["marginRight", "8rpx"], ["color", "#ffffff"], ["flexShrink", 0]]))], ["nav-message-btn", _pS(_uM([["position", "relative"], ["borderTopLeftRadius", "20rpx"], ["borderTopRightRadius", "20rpx"], ["borderBottomRightRadius", "20rpx"], ["borderBottomLeftRadius", "20rpx"], ["paddingTop", 0], ["paddingRight", "40rpx"], ["paddingBottom", 0], ["paddingLeft", 0], ["color", "#ffffff"], ["fontSize", "28rpx"], ["fontFamily", "sans-serif"], ["whiteSpace", "nowrap"], ["flexShrink", 0]]))], ["message-text", _pS(_uM([["color", "#ffffff"], ["fontSize", "28rpx"], ["whiteSpace", "nowrap"]]))], ["message-badge", _pS(_uM([["position", "absolute"], ["right", 0], ["width", "36rpx"], ["height", "36rpx"], ["backgroundColor", "#FF6B35"], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"], ["color", "#ffffff"], ["fontSize", "22rpx"], ["fontWeight", "bold"]]))], ["content-container", _pS(_uM([["width", "90%"], ["marginTop", "20rpx"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["paddingTop", "20rpx"], ["paddingRight", "0rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "0rpx"], ["backgroundColor", "#f9e1ce"]]))], ["content-title-container", _pS(_uM([["position", "relative"], ["width", "70%"], ["height", "80rpx"], ["display", "flex"], ["justifyContent", "center"], ["overflow", "visible"]]))], ["content-title-background", _pS(_uM([["position", "absolute"], ["top", 0], ["left", "-60rpx"], ["width", "100%"], ["height", "100%"], ["zIndex", 1], ["overflow", "visible"]]))], ["content-title-text", _pS(_uM([["position", "relative"], ["zIndex", 2], ["fontSize", "28rpx"], ["color", "#FFEAD2"], ["fontWeight", "bold"], ["textAlign", "left"], ["paddingTop", "10rpx"], ["paddingRight", "60rpx"], ["paddingBottom", "10rpx"], ["paddingLeft", "60rpx"]]))], ["info-container", _pS(_uM([["width", "90%"], ["height", "400rpx"], ["marginTop", "auto"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "25rpx"], ["borderTopRightRadius", "25rpx"], ["borderBottomRightRadius", "25rpx"], ["borderBottomLeftRadius", "25rpx"], ["position", "relative"]]))], ["user-avatar-container", _pS(_uM([["width", 120], ["height", 160], ["position", "absolute"], ["top", "40rpx"], ["left", "40rpx"]]))], ["user-avatar", _pS(_uM([["width", "100%"], ["height", "100%"]]))]])]
