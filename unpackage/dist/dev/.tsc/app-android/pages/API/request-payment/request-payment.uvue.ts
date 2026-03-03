
  export type PayItem = { __$originalPosition?: UTSSourceMapPosition<"PayItem", "pages/API/request-payment/request-payment.uvue", 13, 15>; id : string, name : string, provider ?: UniProvider }
  const __sfc__ = defineComponent({
    data() {
      return {
        btnText: "支付宝支付",
        btnType: "primary",
        orderInfo: "",
        errorCode: 0,
        errorMsg: "",
        complete: false,
        fail: false,
        providerList: [] as PayItem[],
        outTradeNo: "",
        openid: ""
      }
    },
    onLoad: function () {

      // 暂时注释uni-pay-x相关代码，因为uni-app x中uni-pay-x插件不兼容
      // let provider = uni.getProviderSync({
      //   service: "payment",
      // } as GetProviderSyncOptions)
      // console.log(provider)
      // provider.providerObjects.forEach((value : UniProvider) => {
      //   switch (value.id) {
      //     case 'alipay':
      //       var aliPayProvider = value as UniPaymentAlipayProvider
      //       console.log('alipay', aliPayProvider)
      //       this.providerList.push({
      //         name: aliPayProvider.description,
      //         id: aliPayProvider.id,
      //         provider: aliPayProvider
      //       } as PayItem);
      //       break;
      //     case 'wxpay':
      //       var wxPayProvider = value as UniPaymentWxpayProvider
      //       console.log('wxpay', wxPayProvider)
      //       this.providerList.push({
      //         name: wxPayProvider.description,
      //         id: wxPayProvider.id,
      //         provider: wxPayProvider
      //       } as PayItem);
      //       break;
      //     default:
      //       break;
      //   }
      // })









    },
    methods: {
      requestPayment(e : PayItem) {
        const provider = e.id

        // 完全注释掉APP支付相关代码，避免编译错误
        uni.showToast({
          title: "支付功能暂不可用",
          icon: 'none'
        })





      },
      payAli(id : string) {
        uni.showLoading({
          title: "请求中..."
        })
        uni.request({
          url: 'https://demo.dcloud.net.cn/payment/alipay/?total=0.01',
          method: 'GET',
          timeout: 6000,
          success: (res) => {

            this.orderInfo = JSON.stringify(res.data);
            console.log("====" + this.orderInfo, " at pages/API/request-payment/request-payment.uvue:96")
            uni.hideLoading()
            uni.requestPayment({
              provider: id,
              orderInfo: res.data as string,
              fail: (res) => {
                console.log(JSON.stringify(res), " at pages/API/request-payment/request-payment.uvue:102")
                this.errorCode = res.errCode
                uni.showToast({
                  icon: 'error',
                  title: 'errorCode:' + this.errorCode
                });
              },
              success: (res) => {
                console.log(JSON.stringify(res), " at pages/API/request-payment/request-payment.uvue:110")
                uni.showToast({
                  icon: 'success',
                  title: '支付成功'
                });
              }
            })
          },
          fail: (e) => {
            console.log(e, " at pages/API/request-payment/request-payment.uvue:119")
            uni.hideLoading()
          },
        });
      },
      payWX(id : string) {
        uni.showLoading({
          title: "请求中..."
        })
        let url = 'https://demo.dcloud.net.cn/payment/wxpayv3.__UNI__uniappx/?total=0.01'
        const res = uni.getAppBaseInfo();
        let packageName : string | null


        packageName = res.packageName






        if (packageName == 'io.dcloud.hellouniappx') {//hello uniappx
          url = 'https://demo.dcloud.net.cn/payment/wxpayv3.__UNI__HelloUniAppX/?total=0.01'
        }
        uni.request({
          url: url,
          method: 'GET',
          timeout: 6000,
          header: {
            "Content-Type": "application/json"
          } as UTSJSONObject,
          success: (res) => {
            console.log(res.data, " at pages/API/request-payment/request-payment.uvue:151")
            uni.hideLoading()
            uni.requestPayment({
              provider: id,
              orderInfo: JSON.stringify(res.data),
              fail: (res) => {
                console.log(JSON.stringify(res), " at pages/API/request-payment/request-payment.uvue:157")
                this.errorCode = res.errCode
                uni.showToast({
                  duration: 5000,
                  icon: 'error',
                  title: 'errorCode:' + this.errorCode,
                });
              },
              success: (res) => {
                console.log(JSON.stringify(res), " at pages/API/request-payment/request-payment.uvue:166")
                uni.showToast({
                  duration: 5000,
                  icon: 'success',
                  title: '支付成功'
                });
              }
            })
          },
          fail: (res) => {
            uni.hideLoading()
            console.log(res, " at pages/API/request-payment/request-payment.uvue:177")
          },
        });
      },


























































































      //自动化测试使用
      jest_pay() {
        uni.requestPayment({
          provider: "alipay",
          orderInfo: this.orderInfo,
          fail: (res : RequestPaymentFail) => {
            this.errorCode = res.errCode
            this.complete = true
            this.fail = true
          },
          success: (res : RequestPaymentSuccess) => {
            console.log(JSON.stringify(res), " at pages/API/request-payment/request-payment.uvue:282")
            this.complete = true
            this.fail = false
          }
        } as RequestPaymentOptions)
      }
    }
  })

export default __sfc__
function GenPagesAPIRequestPaymentRequestPaymentRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: "发起支付" })),
    _cE("view", _uM({
      class: "uni-common-mt",
      style: _nS(_uM({"padding":"0 10px"}))
    }), [
      _cE("text", null, "如对当前页面的支付示例功能有任何疑问，通过电子邮件：service@dcloud.io 联系我们")
    ], 4 /* STYLE */),
    _ctx.providerList.length > 0
      ? _cE(Fragment, _uM({ key: 0 }), RenderHelpers.renderList(_ctx.providerList, (item, index, __index, _cached): any => {
          return _cE("button", _uM({
            style: _nS(_uM({"margin-top":"20px"})),
            type: "primary",
            key: index,
            onClick: () => {_ctx.requestPayment(item)}
          }), _tD(item.name), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
        }), 128 /* KEYED_FRAGMENT */)
      : _cC("v-if", true)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIRequestPaymentRequestPaymentStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
