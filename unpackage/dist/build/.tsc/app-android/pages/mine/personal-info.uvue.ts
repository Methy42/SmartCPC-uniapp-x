type TableItem = {
  label: string
  value: string | null
  colspan: number
}


const __sfc__ = defineComponent({
  __name: 'personal-info',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const tableData: TableItem[] = [
  { label: '性别', value: '女', colspan: 1 },
  { label: '出生年月', value: '1993-06-01', colspan: 1 },
  { label: '民族', value: '汉族', colspan: 1 },
  { label: '婚姻状况', value: '已婚', colspan: 1 },
  { label: '学历学位', value: '研究生', colspan: 1 },
  { label: '籍贯', value: '山西平遥', colspan: 1 },
  { label: '政治面貌', value: '正式党员', colspan: 1 },
  { label: '入党时间', value: '2012-11-01', colspan: 1 },
  { label: '党龄', value: '13年3月', colspan: 1 },
  { label: '党内职务', value: '党员', colspan: 1 },
  { label: '所在单位', value: '南水北调（江苏）数智科技公司', colspan: 3 },
  { label: '所在部门', value: '综合部', colspan: 1 },
  { label: '参加工作时间', value: '2018-07-01', colspan: 1 },
  { label: '岗位', value: '行政管理', colspan: 3 },
  { label: '参加培训时间', value: '2012-11-01', colspan: 1 },
  { label: '培训机构', value: null, colspan: 1 },
  { label: '家庭住址', value: '山西平遥', colspan: 3 },
]

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
        _cE("text", _uM({ class: "content-title-text" }), "个人资料")
      ]),
      _cE("view", _uM({ class: "info-container" }), [
        _cE("view", _uM({ class: "user-avatar-container" }), [
          _cE("image", _uM({
            class: "user-avatar",
            src: "/static/user-avatar.jpg",
            mode: "aspectFit"
          }))
        ]),
        _cE("view", _uM({ class: "user-name-container" }), [
          _cE("view", _uM({ class: "name-id-row" }), [
            _cE("text", _uM({ class: "name" }), "李绍丽"),
            _cE("view", _uM({ class: "id-container" }), [
              _cE("text", _uM({ class: "id" }), "党员")
            ])
          ]),
          _cE("view", _uM({ class: "party-branch-row" }), [
            _cE("text", null, "所在党组织：数智公司党支部")
          ])
        ])
      ]),
      _cE("view", _uM({ class: "divider" })),
      _cE("view", _uM({ class: "info-table-container" }), [
        _cE("view", _uM({ class: "info-table" }), [
          _cE(Fragment, null, RenderHelpers.renderList(tableData, (item, index, __index, _cached): any => {
            return _cE("view", _uM({
              class: "info-table-row",
              key: index,
              style: _nS(_uM({ width: `${ 25 * (item.colspan + 1) }%` }))
            }), [
              _cE("view", _uM({
                class: "table-label",
                style: _nS(_uM({ width: `${ 100 / (item.colspan + 1) }%` }))
              }), [
                _cE("text", null, _tD(item.label), 1 /* TEXT */)
              ], 4 /* STYLE */),
              _cE("view", _uM({
                class: "table-value",
                style: _nS(_uM({ width: `${ 100 - (100 / (item.colspan + 1)) }%` }))
              }), [
                _cE("text", null, _tD(item.value != null ? item.value : '-'), 1 /* TEXT */)
              ], 4 /* STYLE */)
            ], 4 /* STYLE */)
          }), 64 /* STABLE_FRAGMENT */)
        ])
      ])
    ])
  ])
}
}

})
export default __sfc__
const GenPagesMinePersonalInfoStyles = [_uM([["container", _pS(_uM([["backgroundColor", "#F5F5F5"], ["display", "flex"], ["flexDirection", "column"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingBottom", "100rpx"]]))], ["background-image", _pS(_uM([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["height", "100%"], ["zIndex", -1]]))], ["custom-navbar", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignItems", "center"], ["paddingTop", "var(--status-bar-height, 40rpx)"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"], ["height", "100rpx"], ["width", "100%"], ["boxSizing", "border-box"], ["flexWrap", "nowrap"], ["whiteSpace", "nowrap"]]))], ["nav-avatar-container", _pS(_uM([["position", "relative"], ["width", "70rpx"], ["height", "70rpx"], ["flexShrink", 0]]))], ["nav-avatar", _pS(_uM([["width", "100%"], ["height", "100%"], ["boxSizing", "border-box"]]))], ["nav-logo-container", _pS(_uM([["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["nav-right-buttons", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["flexShrink", 0], ["flexWrap", "nowrap"]]))], ["nav-message-btn", _pS(_uM([["position", "relative"], ["borderTopLeftRadius", "20rpx"], ["borderTopRightRadius", "20rpx"], ["borderBottomRightRadius", "20rpx"], ["borderBottomLeftRadius", "20rpx"], ["paddingTop", 0], ["paddingRight", "40rpx"], ["paddingBottom", 0], ["paddingLeft", 0], ["color", "#ffffff"], ["fontSize", "28rpx"], ["fontFamily", "sans-serif"], ["whiteSpace", "nowrap"], ["flexShrink", 0]]))], ["message-text", _pS(_uM([["color", "#ffffff"], ["fontSize", "28rpx"], ["whiteSpace", "nowrap"]]))], ["message-badge", _pS(_uM([["position", "absolute"], ["right", 0], ["width", "36rpx"], ["height", "36rpx"], ["backgroundColor", "#FF6B35"], ["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"], ["color", "#ffffff"], ["fontSize", "22rpx"], ["fontWeight", "bold"]]))], ["content-container", _pS(_uM([["width", "90%"], ["marginTop", "20rpx"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["paddingTop", "20rpx"], ["paddingRight", "0rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "0rpx"], ["backgroundColor", "#f9e1ce"], ["overflow", "visible"]]))], ["content-title-container", _pS(_uM([["position", "relative"], ["width", "70%"], ["height", "80rpx"], ["display", "flex"], ["justifyContent", "center"], ["overflow", "visible"]]))], ["content-title-background", _pS(_uM([["position", "absolute"], ["top", 0], ["left", "-60rpx"], ["width", "100%"], ["height", "100%"], ["zIndex", 1], ["overflow", "visible"]]))], ["content-title-text", _pS(_uM([["position", "relative"], ["zIndex", 2], ["fontSize", "28rpx"], ["color", "#FFEAD2"], ["fontWeight", "bold"], ["textAlign", "left"], ["paddingTop", "10rpx"], ["paddingRight", "60rpx"], ["paddingBottom", "10rpx"], ["paddingLeft", "60rpx"]]))], ["info-container", _pS(_uM([["width", "90%"], ["height", "900rpx"], ["marginTop", "auto"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", "25rpx"], ["borderTopRightRadius", "25rpx"], ["borderBottomRightRadius", "25rpx"], ["borderBottomLeftRadius", "25rpx"], ["position", "relative"]]))], ["user-avatar-container", _pS(_uM([["width", 120], ["height", 160], ["position", "absolute"], ["top", "40rpx"], ["left", "40rpx"]]))], ["user-avatar", _pS(_uM([["width", "100%"], ["height", "100%"]]))], ["user-name-container", _pS(_uM([["position", "absolute"], ["overflow", "visible"], ["left", "220rpx"], ["top", "100rpx"]]))], ["name-id-row", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["gap", "10rpx"]]))], ["name", _uM([[".name-id-row ", _uM([["fontSize", "36rpx"], ["fontWeight", "bold"]])]])], ["id-container", _uM([[".name-id-row ", _uM([["width", "100rpx"], ["height", "40rpx"], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#b66161"], ["borderRightColor", "#b66161"], ["borderBottomColor", "#b66161"], ["borderLeftColor", "#b66161"], ["borderTopLeftRadius", "38rpx"], ["borderTopRightRadius", "38rpx"], ["borderBottomRightRadius", "38rpx"], ["borderBottomLeftRadius", "38rpx"], ["backgroundColor", "#fff1f1"], ["textAlign", "center"], ["marginLeft", "10rpx"]])]])], ["id", _uM([[".name-id-row .id-container ", _uM([["fontSize", "20rpx"], ["color", "#BA3131"], ["marginTop", "8rpx"], ["marginLeft", "auto"], ["marginRight", "auto"]])]])], ["divider", _pS(_uM([["position", "absolute"], ["height", "1rpx"], ["backgroundColor", "#766756"], ["top", "360rpx"], ["left", "80rpx"], ["right", "80rpx"]]))], ["info-table-container", _pS(_uM([["position", "absolute"], ["overflow", "visible"], ["top", "360rpx"], ["left", "80rpx"], ["right", "80rpx"]]))], ["info-table", _pS(_uM([["width", "100%"], ["display", "flex"], ["flexDirection", "row"], ["flexWrap", "wrap"], ["boxSizing", "border-box"], ["borderTopWidth", "1rpx"], ["borderRightWidth", "medium"], ["borderBottomWidth", "medium"], ["borderLeftWidth", "1rpx"], ["borderTopStyle", "solid"], ["borderRightStyle", "none"], ["borderBottomStyle", "none"], ["borderLeftStyle", "solid"], ["borderTopColor", "#e8e4d9"], ["borderRightColor", "#000000"], ["borderBottomColor", "#000000"], ["borderLeftColor", "#e8e4d9"], ["marginTop", "20rpx"], ["marginRight", 0], ["marginBottom", "20rpx"], ["marginLeft", 0]]))], ["info-table-row", _pS(_uM([["display", "flex"], ["flexDirection", "row"]]))], ["table-label", _pS(_uM([["width", "50%"], ["minHeight", "50rpx"], ["alignItems", "center"], ["paddingTop", "10rpx"], ["paddingRight", "24rpx"], ["paddingBottom", "10rpx"], ["paddingLeft", "24rpx"], ["boxSizing", "border-box"], ["backgroundColor", "#f9f6f0"], ["borderRightWidth", "1rpx"], ["borderRightStyle", "solid"], ["borderRightColor", "#e8e4d9"], ["borderBottomWidth", "1rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#e8e4d9"], ["fontSize", "30rpx"], ["color", "#333333"]]))], ["table-value", _pS(_uM([["minHeight", "50rpx"], ["alignItems", "center"], ["paddingTop", "10rpx"], ["paddingRight", "24rpx"], ["paddingBottom", "10rpx"], ["paddingLeft", "24rpx"], ["boxSizing", "border-box"], ["backgroundColor", "#ffffff"], ["borderRightWidth", "1rpx"], ["borderRightStyle", "solid"], ["borderRightColor", "#e8e4d9"], ["borderBottomWidth", "1rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#e8e4d9"], ["fontSize", "30rpx"], ["color", "#333333"], ["whiteSpace", "normal"], ["wordBreak", "break-all"]]))]])]
