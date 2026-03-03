
const __sfc__ = defineComponent({
  __name: 'issues-23230',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

	// 模拟加载网络
	const info = ref<string[] | null>(null);
	onMounted(() => {
		setTimeout(() => {
			const arr = new Array<string>()
			for (let i = 0; i < 15; i++) {
				arr.push(i.toString())
			}
			info.value = arr
		}, 500);
	});

return (): any | null => {

  return _cE("scroll-view", _uM({ class: "content" }), [
    unref(info) == null
      ? _cE("text", _uM({ key: 0 }), "正在加载数据")
      : _cE("view", _uM({
          key: 1,
          class: "vipView"
        }), [
          _cE("scroll-view", _uM({
            class: "functionVip",
            direction: "horizontal",
            "show-scrollbar": false
          }), [
            _cE("view", _uM({
              style: _nS(_uM({ height: '2rpx', width: '36rpx' }))
            }), null, 4 /* STYLE */),
            _cE(Fragment, null, RenderHelpers.renderList(unref(info), (index, __key, __index, _cached): any => {
              return _cE("view", _uM({ class: "item" }), [
                _cE("image", _uM({
                  src: "/static/logo.png",
                  mode: "aspectFill",
                  class: "icon"
                })),
                _cE("text", _uM({ class: "text ell" }), "按钮" + _tD(index + 1), 1 /* TEXT */)
              ])
            }), 256 /* UNKEYED_FRAGMENT */),
            _cE("view", _uM({
              style: _nS(_uM({ height: '2rpx', width: '20rpx' }))
            }), null, 4 /* STYLE */)
          ]),
          _cE("view", _uM({ class: "borderBtn" }), [
            _cE("text", _uM({ class: "text" }), "有圆角及边框")
          ])
        ])
  ])
}
}

})
export default __sfc__
const GenPagesCSSBorderIssues23230Styles = [_uM([["content", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", 0], ["paddingRight", "30rpx"], ["paddingBottom", 0], ["paddingLeft", "30rpx"], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"]]))], ["vipView", _uM([[".content ", _uM([["backgroundImage", "none"], ["backgroundColor", "#f6f7f9"], ["paddingTop", "20rpx"], ["paddingRight", 0], ["paddingBottom", "36rpx"], ["paddingLeft", 0], ["borderTopLeftRadius", "20rpx"], ["borderTopRightRadius", "20rpx"], ["borderBottomRightRadius", "20rpx"], ["borderBottomLeftRadius", "20rpx"], ["marginBottom", "22rpx"]])]])], ["head", _uM([[".content .vipView ", _uM([["flexDirection", "row"], ["alignItems", "center"], ["height", "60rpx"], ["paddingTop", 0], ["paddingRight", "36rpx"], ["paddingBottom", 0], ["paddingLeft", "36rpx"]])]])], ["text", _uM([[".content .vipView .head ", _uM([["fontSize", "28rpx"]])], [".content .vipView .functionVip .item ", _uM([["fontSize", "22rpx"], ["width", "100%"], ["textAlign", "center"], ["lineHeight", 1.1], ["marginTop", "15rpx"], ["color", "#7a90a8"]])], [".content .vipView .btn ", _uM([["color", "#FFFFFF"], ["fontSize", "28rpx"]])], [".content .vipView .borderBtn ", _uM([["color", "#1770d6"], ["fontSize", "28rpx"]])]])], ["functionVip", _uM([[".content .vipView ", _uM([["flexDirection", "row"], ["marginTop", "10rpx"]])]])], ["item", _uM([[".content .vipView .functionVip ", _uM([["flexDirection", "column"], ["alignItems", "center"], ["justifyContent", "center"], ["position", "relative"], ["width", "180rpx"], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"], ["paddingTop", "34rpx"], ["paddingRight", "10rpx"], ["paddingBottom", "34rpx"], ["paddingLeft", "10rpx"], ["borderTopLeftRadius", "20rpx"], ["borderTopRightRadius", "20rpx"], ["borderBottomRightRadius", "20rpx"], ["borderBottomLeftRadius", "20rpx"], ["marginRight", "16rpx"], ["overflow", "hidden"]])]])], ["icon", _uM([[".content .vipView .functionVip .item ", _uM([["width", "70rpx"], ["height", "70rpx"], ["borderTopLeftRadius", "70rpx"], ["borderTopRightRadius", "70rpx"], ["borderBottomRightRadius", "70rpx"], ["borderBottomLeftRadius", "70rpx"]])]])], ["btn", _uM([[".content .vipView ", _uM([["flexDirection", "row"], ["alignItems", "center"], ["justifyContent", "center"], ["borderTopLeftRadius", "100rpx"], ["borderTopRightRadius", "100rpx"], ["borderBottomRightRadius", "100rpx"], ["borderBottomLeftRadius", "100rpx"], ["backgroundImage", "none"], ["backgroundColor", "#1770d6"], ["marginTop", "30rpx"], ["marginRight", "36rpx"], ["marginBottom", 0], ["marginLeft", "36rpx"], ["height", "84rpx"]])]])], ["borderBtn", _uM([[".content .vipView ", _uM([["flexDirection", "row"], ["alignItems", "center"], ["justifyContent", "center"], ["borderTopWidth", "4rpx"], ["borderRightWidth", "4rpx"], ["borderBottomWidth", "4rpx"], ["borderLeftWidth", "4rpx"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#FF0000"], ["borderRightColor", "#FF0000"], ["borderBottomColor", "#FF0000"], ["borderLeftColor", "#FF0000"], ["borderTopLeftRadius", "100rpx"], ["borderTopRightRadius", "100rpx"], ["borderBottomRightRadius", "100rpx"], ["borderBottomLeftRadius", "100rpx"], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"], ["marginTop", "30rpx"], ["marginRight", "36rpx"], ["marginBottom", 0], ["marginLeft", "36rpx"], ["height", "84rpx"]])]])]])]
