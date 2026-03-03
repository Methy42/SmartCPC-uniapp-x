
	import { objectAssign } from "../../js_sdk/js_sdk"
	const __sfc__ = defineComponent({
		data() {
			return {
				myOptions: {
					total_fee: "",
				} as UTSJSONObject,
				insideData: {
					currentProviders: [] as Array<string>,
					images: {
						alipay: "",
						wxpay: ""
					} as UTSJSONObject
				} as UTSJSONObject, // uni-pay组件mounted事件获得的数据
				adpid: "", // 广告id
				return_url: "", // 支付成功后点击查看订单跳转的订单详情页面地址
				main_color: "", // 支付成功页面的主色调
			}
		},
		// 监听 - 页面每次【加载时】执行(如：前进)
		onLoad(options) {
			let optionsStr = options['options'] as string | null;
			if (optionsStr != null && optionsStr != "") {
				let newOptions = UTSAndroid.consoleDebugError(JSON.parse(UTSAndroid.consoleDebugError(decodeURI(optionsStr), " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:69")!), " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:69") as UTSJSONObject;
				this.myOptions = newOptions as UTSJSONObject;
			}
			console.log('myOptions: ', this.myOptions, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:72")
		},
		// 监听 - 页面【首次渲染完成时】执行。注意如果渲染速度快，会在页面进入动画完成前触发
		onReady() { },
		// 监听 - 页面每次【显示时】执行(如：前进和返回) (页面每次出现在屏幕上都触发，包括从下级页面点返回露出当前页面)
		onShow() { },
		// 监听 - 页面每次【隐藏时】执行(如：返回)
		onHide() { },
		// 函数
		methods: {
			// 监听 - 支付组件加载完毕事件
			onMounted(insideData : UTSJSONObject) {
				this.insideData['currentProviders'] = insideData.getArray('currentProviders') as Array<string>;
				this.insideData['images'] = insideData.getJSON('images') as UTSJSONObject;
			},
			// 发起支付
			createOrder(data : UTSJSONObject) {
				this.myOptions = objectAssign(this.myOptions, data);
				const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
				payInstance.createOrder(this.myOptions);
			},
			// 根据provider发起支付
			createOrderByProvider(provider : string) {
				this.createOrder({
					provider
				})
			},
			// 监听事件 - 支付成功
			onSuccess(res : UTSJSONObject) {
				let out_trade_no = res['out_trade_no'] as string;
				let pay_order = res.getJSON('pay_order') as UTSJSONObject;
				let order_no = pay_order['order_no'] as string;
				//let pay_date = pay_order['pay_date'] as string;
				let total_fee = pay_order.getNumber('total_fee');
				if (total_fee == null) {
					total_fee = 0;
				}
				let return_url = this.return_url as string;
				let adpid = this.adpid as string;
				let main_color = this.main_color as string;

				console.log('success: ', res, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:113");
				let user_order_success = res.getBoolean('user_order_success');
				if (user_order_success != null && user_order_success != true) {
					// 代表用户已付款，且你自己写的回调成功并正确执行了
					uni.redirectTo({
						url: `/uni_modules/uni-pay-x/pages/success/success?out_trade_no=${out_trade_no}&order_no=${order_no}&total_fee=${total_fee}&adpid=${adpid}&return_url=${return_url}&main_color=${main_color}`
					});
				} else {
					// 代表用户已付款，但你自己写的回调执行失败（通常是因为你的回调代码有问题）

				}
			},
			// 监听事件 - 支付失败
			onFail(err : RequestPaymentFail) {
				console.log('fail: ', err, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:127")

			},
			// 监听事件 - 取消支付
			onCancel(err : RequestPaymentFail) {
				console.log('cancel: ', err, " at uni_modules/uni-pay-x/pages/pay-desk/pay-desk.uvue:132")

			},
			amountFormat(totalFee : number | null) :string{
				if (totalFee == null) {
					return "0";
				} else {
					return (totalFee / 100).toFixed(2)
				}
			},
			// 检测provider
			checkProvider(provider : string) : boolean {
				let currentProviders = this.insideData.getArray<string>('currentProviders');
				return currentProviders != null && currentProviders.indexOf(provider) > -1 ? true : false;
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
function GenUniModulesUniPayXPagesPayDeskPayDeskRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_uni_pay = resolveEasyComponent("uni-pay",_easycom_uni_pay)

  return _cE("view", _uM({ class: "uni-pay" }), [
    _cE("view", _uM({ class: "mobile-pay-popup" }), [
      _cE("view", _uM({ class: "mobile-pay-popup-amount-box" }), [
        _cE("view", null, [
          _cE("text", _uM({ class: "text" }), "待支付金额：")
        ]),
        _cE("view", _uM({ class: "mobile-pay-popup-amount" }), [
          _cE("text", _uM({ class: "text" }), _tD(_ctx.amountFormat(_ctx.myOptions.getNumber('total_fee'))), 1 /* TEXT */)
        ])
      ]),
      _cE("view", _uM({ class: "mobile-pay-popup-provider-list" }), [
        _cE("view", _uM({ class: "uni-list" }), [
          isTrue(_ctx.checkProvider('wxpay'))
            ? _cE("view", _uM({
                key: 0,
                class: "uni-list-item",
                onClick: () => {_ctx.createOrderByProvider('wxpay')}
              }), [
                _cE("view", _uM({ class: "uni-list-item__container container--right" }), [
                  _cE("view", _uM({ class: "uni-list-item__header" }), [
                    _cE("image", _uM({
                      src: _ctx.insideData.getJSON('images')!['wxpay'],
                      class: "image"
                    }), null, 8 /* PROPS */, ["src"])
                  ]),
                  _cE("view", _uM({ class: "uni-list-item__content uni-list-item__content--center" }), [
                    _cE("text", _uM({ class: "text" }), "微信支付")
                  ])
                ]),
                _cE("view", _uM({ class: "arrowright" }))
              ], 8 /* PROPS */, ["onClick"])
            : _cC("v-if", true),
          isTrue(_ctx.checkProvider('alipay'))
            ? _cE("view", _uM({
                key: 1,
                class: "uni-list-item",
                onClick: () => {_ctx.createOrderByProvider('alipay')}
              }), [
                _cE("view", _uM({ class: "uni-list-item__container container--right" }), [
                  _cE("view", _uM({ class: "uni-list-item__header" }), [
                    _cE("image", _uM({
                      src: _ctx.insideData.getJSON('images')!['alipay'],
                      class: "image"
                    }), null, 8 /* PROPS */, ["src"])
                  ]),
                  _cE("view", _uM({ class: "uni-list-item__content uni-list-item__content--center" }), [
                    _cE("text", _uM({ class: "text" }), "支付宝")
                  ])
                ]),
                _cE("view", _uM({ class: "arrowright" }))
              ], 8 /* PROPS */, ["onClick"])
            : _cC("v-if", true)
        ])
      ])
    ]),
    _cV(_component_uni_pay, _uM({
      ref: "payRef",
      height: "450px",
      "to-success-page": false,
      onMounted: _ctx.onMounted,
      onSuccess: _ctx.onSuccess,
      onFail: _ctx.onFail,
      onCancel: _ctx.onCancel
    }), null, 8 /* PROPS */, ["onMounted", "onSuccess", "onFail", "onCancel"])
  ])
}
const GenUniModulesUniPayXPagesPayDeskPayDeskStyles = [_uM([["uni-pay", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["display", "flex"], ["flexDirection", "column"], ["backgroundColor", "#f3f3f3"]]))], ["mobile-pay-popup", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["mobile-pay-popup-amount-box", _uM([[".mobile-pay-popup ", _uM([["backgroundColor", "#ffffff"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]])]])], ["mobile-pay-popup-amount", _uM([[".mobile-pay-popup .mobile-pay-popup-amount-box ", _uM([["marginTop", 10]])]])], ["text", _uM([[".mobile-pay-popup .mobile-pay-popup-amount-box .mobile-pay-popup-amount ", _uM([["color", "#e43d33"], ["fontSize", 30]])], [".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__content ", _uM([["color", "#3b4144"], ["fontSize", 14]])]])], ["mobile-pay-popup-provider-list", _uM([[".mobile-pay-popup ", _uM([["backgroundColor", "#ffffff"], ["marginTop", 10]])]])], ["uni-list", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list ", _uM([["display", "flex"], ["backgroundColor", "#ffffff"], ["position", "relative"], ["flexDirection", "column"]])]])], ["uni-list-item", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list ", _uM([["display", "flex"], ["position", "relative"], ["justifyContent", "space-between"], ["alignItems", "center"], ["backgroundColor", "#ffffff"], ["flexDirection", "row"], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#f8f8f8"], ["backgroundColor:hover", "#f1f1f1"]])]])], ["uni-list-item__container", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", _uM([["position", "relative"], ["display", "flex"], ["flexDirection", "row"], ["paddingTop", 12], ["paddingRight", 15], ["paddingBottom", 12], ["paddingLeft", 15], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["overflow", "hidden"]])]])], ["uni-list-item__header", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container ", _uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"]])]])], ["image", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container .uni-list-item__header ", _uM([["width", 26], ["height", 26], ["marginRight", 9]])]])], ["container--right", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", _uM([["paddingRight", 0]])]])], ["uni-list-item__content", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", _uM([["display", "flex"], ["paddingRight", 8], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["flexDirection", "column"], ["justifyContent", "space-between"], ["overflow", "hidden"]])]])], ["uni-list-item__content--center", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", _uM([["justifyContent", "center"]])]])], ["arrowright", _uM([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", _uM([["borderTopWidth", 1], ["borderTopStyle", "solid"], ["borderTopColor", "#bbbbbb"], ["borderRightWidth", 1], ["borderRightStyle", "solid"], ["borderRightColor", "#bbbbbb"], ["width", 8], ["height", 8], ["marginRight", 15], ["transform", "rotate(45deg)"]])]])]])]

import _easycom_uni_pay from '@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue'

import { UniPayComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue"