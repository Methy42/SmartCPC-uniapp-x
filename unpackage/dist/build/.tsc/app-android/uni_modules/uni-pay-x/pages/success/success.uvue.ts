
	const __sfc__ = defineComponent({
		data() {
			return {
				myOptions: {
					adpid: "",
					order_no: "",
					out_trade_no: "",
					total_fee: 0,
					pay_date: "",
					return_url: ""
				} as UTSJSONObject,
				successImages: "data:image/png;base64,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",
				// 默认颜色
				color: {
					wxpay: "#01be6e",
					alipay: "#108ee9"
				}
			}
		},
		// 监听 - 页面每次【加载时】执行(如：前进)
		onLoad(options) {
			this.myOptions['adpid'] = options['adpid'];
			this.myOptions['order_no'] = options['order_no'] != null ? options['order_no'] : "-";
			this.myOptions['out_trade_no'] = options['out_trade_no'];
			if (options['total_fee'] != null) {
				this.myOptions['total_fee'] = parseFloat(options['total_fee'] as string);
			}
			this.myOptions['pay_date'] = options['pay_date'];
			this.myOptions['return_url'] = options['return_url'];
		},
		// 监听 - 页面【首次渲染完成时】执行。注意如果渲染速度快，会在页面进入动画完成前触发
		onReady() { },
		// 监听 - 页面每次【显示时】执行(如：前进和返回) (页面每次出现在屏幕上都触发，包括从下级页面点返回露出当前页面)
		onShow() { },
		// 监听 - 页面每次【隐藏时】执行(如：返回)
		onHide() { },
		// 函数
		methods: {
			queryOrder() {
				let return_url = this.myOptions['return_url'] as string;
				let out_trade_no = this.myOptions['out_trade_no'] as string;
				let order_no = this.myOptions['order_no'] as string;
				let url = return_url + `?out_trade_no=${out_trade_no}&order_no=${order_no}`;
				if (url.indexOf("/") != 0) url = `/${url}`;
				uni.navigateTo({
					url,
				});
			},
			// 广告加载失败事件
			onaderror(e : any) {
				console.log("ad-error", e);
			},
			amountFormat(totalFee : number | null) :string{
				if (totalFee == null || totalFee == 0) {
					return "0";
				} else {
					return (totalFee / 100).toFixed(2)
				}
			}
		},
		// 监听器
		watch: {

		},
		// 计算属性
		computed: {

		}
	})

export default __sfc__
function GenUniModulesUniPayXPagesSuccessSuccessRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "app" }), [
    _cE("view", _uM({ class: "header" }), [
      _cE("image", _uM({
        src: _ctx.successImages,
        class: "success-image"
      }), null, 8 /* PROPS */, ["src"]),
      _cE("view", null, [
        _cE("text", _uM({ class: "success-title-text" }), "支付成功")
      ]),
      _cE("view", _uM({ class: "hr" }))
    ]),
    _cE("view", _uM({ class: "info-box" }), [
      _cE("view", _uM({ class: "info-amount" }), [
        _cE("text", _uM({ class: "text" }), "¥ " + _tD(_ctx.amountFormat(_ctx.myOptions.getNumber('total_fee'))), 1 /* TEXT */)
      ]),
      _cE("view", _uM({ class: "left-circle" })),
      _cE("view", _uM({ class: "right-circle" })),
      _cE("view", _uM({ class: "info-main" }), [
        _cE("view", _uM({ class: "info-cell" }), [
          _cE("view", _uM({ class: "left" }), [
            _cE("text", _uM({ class: "text" }), "订单编号")
          ]),
          _cE("view", _uM({ class: "right" }), [
            _cE("text", _uM({ class: "text" }), _tD(_ctx.myOptions['order_no']), 1 /* TEXT */)
          ])
        ])
      ])
    ]),
    _cE("view", _uM({ class: "uni-ad" })),
    isTrue(_ctx.myOptions['return_url'])
      ? _cE("view", _uM({
          key: 0,
          class: "button-query",
          onClick: _ctx.queryOrder
        }), [
          _cE("text", _uM({ class: "text" }), "查看订单")
        ], 8 /* PROPS */, ["onClick"])
      : _cC("v-if", true),
    _cE("view", _uM({ class: "footer-hr" }))
  ])
}
const GenUniModulesUniPayXPagesSuccessSuccessStyles = [_uM([["app", _pS(_uM([["backgroundColor", "#f3f3f3"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["header", _pS(_uM([["backgroundColor", "#007aff"], ["display", "flex"], ["alignItems", "center"], ["paddingTop", 40], ["paddingRight", 15], ["paddingBottom", 25], ["paddingLeft", 15]]))], ["success-image", _uM([[".header ", _uM([["width", 60], ["height", 60]])]])], ["success-title-text", _uM([[".header ", _uM([["color", "#ffffff"], ["fontSize", 17], ["marginTop", 20], ["fontWeight", "bold"]])]])], ["hr", _uM([[".header ", _uM([["marginTop", 20], ["width", "100%"], ["height", 15], ["borderTopLeftRadius", 10], ["borderTopRightRadius", 10], ["borderBottomRightRadius", 10], ["borderBottomLeftRadius", 10], ["opacity", 0.1], ["backgroundColor", "#000000"]])]])], ["info-box", _pS(_uM([["marginTop", -32], ["marginRight", 25], ["marginBottom", 0], ["marginLeft", 25], ["position", "relative"], ["backgroundColor", "#ffffff"]]))], ["info-amount", _uM([[".info-box ", _uM([["height", 75], ["borderBottomWidth", 2], ["borderBottomStyle", "dashed"], ["borderBottomColor", "#f3f3f3"]])]])], ["text", _uM([[".info-box .info-amount ", _uM([["lineHeight", "75px"], ["color", "#007aff"], ["fontWeight", "bold"], ["fontSize", 30], ["textAlign", "center"]])], [".info-box .info-main .info-cell .left ", _uM([["textAlign", "left"], ["fontSize", 13], ["color", "#333333"]])], [".info-box .info-main .info-cell .right ", _uM([["textAlign", "right"], ["fontSize", 13], ["color", "#333333"]])], [".button-query ", _uM([["color", "#ffffff"], ["textAlign", "center"]])]])], ["left-circle", _uM([[".info-box ", _uM([["backgroundColor", "#f3f3f3"], ["position", "absolute"], ["width", 20], ["height", 20], ["borderTopLeftRadius", 10], ["borderTopRightRadius", 10], ["borderBottomRightRadius", 10], ["borderBottomLeftRadius", 10], ["top", 65], ["left", -10]])]])], ["right-circle", _uM([[".info-box ", _uM([["backgroundColor", "#f3f3f3"], ["position", "absolute"], ["width", 20], ["height", 20], ["borderTopLeftRadius", 10], ["borderTopRightRadius", 10], ["borderBottomRightRadius", 10], ["borderBottomLeftRadius", 10], ["top", 65], ["right", -10]])]])], ["info-main", _uM([[".info-box ", _uM([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]])]])], ["info-cell", _uM([[".info-box .info-main ", _uM([["display", "flex"], ["flexDirection", "row"]])]])], ["left", _uM([[".info-box .info-main .info-cell ", _uM([["width", 100]])]])], ["right", _uM([[".info-box .info-main .info-cell ", _uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]])]])], ["uni-ad", _pS(_uM([["marginTop", 25], ["minHeight", 50]]))], ["ad-interactive", _uM([[".uni-ad ", _uM([["textAlign", "center"]])]])], ["button-query", _pS(_uM([["backgroundColor", "#007aff"], ["marginTop", 25], ["marginRight", 30], ["marginBottom", 0], ["marginLeft", 30], ["paddingTop", 10], ["paddingRight", 15], ["paddingBottom", 10], ["paddingLeft", 15], ["borderTopLeftRadius", 25], ["borderTopRightRadius", 25], ["borderBottomRightRadius", 25], ["borderBottomLeftRadius", 25], ["boxSizing", "border-box"], ["opacity:active", 0.7]]))], ["footer-hr", _pS(_uM([["height", 50]]))]])]
