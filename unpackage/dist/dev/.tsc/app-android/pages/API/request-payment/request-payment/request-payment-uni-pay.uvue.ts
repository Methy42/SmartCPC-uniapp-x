import _easycom_uni_pay_popup from '@/uni_modules/uni-pay-x/components/uni-pay-popup/uni-pay-popup.uvue'
import _easycom_uni_pay from '@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue'
import { ref, computed } from 'vue'

  // 响应式数据
  
const __sfc__ = defineComponent({
  __name: 'request-payment-uni-pay',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const total_fee = ref("1") // 支付金额，单位分 100 = 1元
  const order_no = ref("") // 业务系统订单号（即你自己业务系统的订单表的订单号）
  const out_trade_no = ref("") // 插件支付单号
  const description = ref("测试订单") // 支付描述
  const type = ref("test") // 支付回调类型 如 recharge 代表余额充值 goods 代表商品订单（可自定义，任意英文单词都可以，只要你在 uni-pay-co/notify/目录下创建对应的 xxx.js文件进行编写对应的回调逻辑即可）
  const openid = ref("") // 微信公众号需要
  const custom = ref({
    a: "a",
    b: 1
  } as UTSJSONObject)
  const adpid = ref("1000000001") // uni-ad的广告位id

  const transaction_id = ref("") // 查询订单接口的查询条件
  const getOrderRes = ref({} as UTSJSONObject) // 查询订单支付成功后的返回值
  const useUniCloud = ref(true)
  const errMsg = ref("")

  // 组件引用
  const payRef = ref<UniPayComponentPublicInstance | null>(null)
  const getOrderPopupRef = ref<UniPayPopupComponentPublicInstance | null>(null)

  // 计算属性
  // 计算当前H5环境
  const h5Env = computed(() => {




















    return "";
  })

  // 计算当前是否是ios app
  const isIosAppCom = computed(() => {
    let info = uni.getSystemInfoSync();
    return info.uniPlatform == 'app' && info.osName == 'ios' ? true : false;
  })

  // 计算当前是否是PC环境
  const isPcCom = computed(() => {
    let isPC = false;




    return isPC;
  })

  // 方法
  /**
   * 发起支付（唤起收银台，如果只有一种支付方式，则收银台不会弹出来，会直接使用此支付方式）
   * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
   */
  const open = () => {
    order_no.value = `test` + Date.now();
    out_trade_no.value = `${order_no.value}-1`;
    // 打开支付收银台
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    payInstance.open({
      total_fee: parseInt(total_fee.value), // 支付金额，单位分 100 = 1元
      order_no: order_no.value, // 业务系统订单号（即你自己业务系统的订单表的订单号）
      out_trade_no: out_trade_no.value, // 插件支付单号
      description: description.value, // 支付描述
      type: type.value, // 支付回调类型
      openid: openid.value, // 微信公众号需要
      custom: custom.value, // 自定义数据
      qr_code: isPcCom.value, // 如果是PC端，则强制扫码支付
    });
  }

  /**
   * 发起支付（不唤起收银台，手动指定支付方式）
   * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
   */
  const createOrder = (provider : string) => {
    order_no.value = `test` + Date.now();
    out_trade_no.value = `${order_no.value}-1`;
    // 发起支付
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    payInstance.createOrder({
      provider: provider, // 支付供应商
      total_fee: parseInt(total_fee.value), // 支付金额，单位分 100 = 1元
      order_no: order_no.value, // 业务系统订单号（即你自己业务系统的订单表的订单号）
      out_trade_no: out_trade_no.value, // 插件支付单号
      description: description.value, // 支付描述
      type: type.value, // 支付回调类型
      openid: openid.value, // 微信公众号需要
      custom: custom.value, // 自定义数据
      qr_code: isPcCom.value, // 如果是PC端，则强制扫码支付
    });
  }

  /**
   * 生成支付独立二维码（只返回支付二维码）
   * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
   */
  const createQRcode = (provider : string) => {
    order_no.value = `test` + Date.now();
    out_trade_no.value = `${order_no.value}-1`;
    // 发起支付
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    payInstance.createOrder({
      provider: provider, // 支付供应商
      total_fee: parseInt(total_fee.value), // 支付金额，单位分 100 = 1元
      order_no: order_no.value, // 业务系统订单号（即你自己业务系统的订单表的订单号）
      out_trade_no: out_trade_no.value, // 插件支付单号
      description: description.value, // 支付描述
      type: type.value, // 支付回调类型
      qr_code: true, // 强制扫码支付
      openid: openid.value, // 微信公众号需要
      custom: custom.value, // 自定义数据
    });
  }

  /**
   * 前往自定义收银台页面
   * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
   */
  const toPayDesk = () => {
    order_no.value = `test` + Date.now();
    out_trade_no.value = `${order_no.value}-1`;
    let options = {__$originalPosition: new UTSSourceMapPosition("options", "pages/API/request-payment/request-payment/request-payment-uni-pay.uvue", 249, 9),
      total_fee: parseInt(total_fee.value), // 支付金额，单位分 100 = 1元
      order_no: order_no.value, // 业务系统订单号（即你自己业务系统的订单表的订单号）
      out_trade_no: out_trade_no.value, // 插件支付单号
      description: description.value, // 支付描述
      type: type.value, // 支付回调类型
      openid: openid.value, // 微信公众号需要
      custom: custom.value, // 自定义数据
    };
    let optionsStr = UTSAndroid.consoleDebugError(encodeURI(JSON.stringify(options)), " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:258");
    uni.navigateTo({
      url: `/uni_modules/uni-pay-x/pages/pay-desk/pay-desk?options=${optionsStr}`
    });
  }

  // 打开查询订单的弹窗
  const getOrderPopup = (key : boolean) => {
    const getOrderPopupInstance = getOrderPopupRef.value as UniPayPopupComponentPublicInstance;
    if (key) {
      getOrderPopupInstance.open();
    } else {
      getOrderPopupInstance.close();
    }
  }

  // 查询支付状态
  const getOrder = async () : Promise<void> => {
    getOrderRes.value = {} as UTSJSONObject;
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    let getOrderData = { __$originalPosition: new UTSSourceMapPosition("getOrderData", "pages/API/request-payment/request-payment/request-payment-uni-pay.uvue", 278, 9), 
      await_notify: true
    } as UTSJSONObject;
    if (transaction_id.value != "") {
      getOrderData['transaction_id'] = transaction_id.value;
    } else if (out_trade_no.value != "") {
      getOrderData['out_trade_no'] = out_trade_no.value;
    }
    let res = await payInstance.getOrder(getOrderData);
    if (res['errCode'] == 0) {
      getOrderRes.value = res.getJSON('pay_order') as UTSJSONObject;
      let obj = { __$originalPosition: new UTSSourceMapPosition("obj", "pages/API/request-payment/request-payment/request-payment-uni-pay.uvue", 289, 11), 
        "-1": "已关闭",
        "1": "已支付",
        "0": "未支付",
        "2": "已部分退款",
        "3": "已全额退款"
      } as UTSJSONObject;
      let status = res['status'] as number;
      let statusStr = status + "";
      let title = obj[statusStr] as string;
      uni.showToast({
        title: title,
        icon: "none"
      });
    }
  }

  // 发起退款
  const refund = async () : Promise<void> => {
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    let res = await payInstance.refund({
      out_trade_no: out_trade_no.value, // 插件支付单号
    });
    if (res['errCode'] == 0) {
      uni.showToast({
        title: res['errMsg'] as string,
        icon: "none"
      });
    }
  }

  // 查询退款状态
  const getRefund = async () : Promise<void> => {
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    let res = await payInstance.getRefund({
      out_trade_no: out_trade_no.value, // 插件支付单号
    });
    if (res['errCode'] == 0) {
      uni.showModal({
        content: res['errMsg'] as string,
        showCancel: false
      });
    }
  }

  // 关闭订单
  const closeOrder = async () : Promise<void> => {
    const payInstance = payRef.value as UniPayComponentPublicInstance;
    let res = await payInstance.closeOrder({
      out_trade_no: out_trade_no.value, // 插件支付单号
    });
    if (res['errCode'] == 0) {
      uni.showModal({
        content: res['errMsg'] as string,
        showCancel: false
      });
    }
  }





































  // 监听事件 - 支付订单创建成功（此时用户还未支付）
  const onCreate = (res : UTSJSONObject) => {
    console.log('create: ', res, " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:386");
    // 如果只是想生成支付二维码，不需要组件自带的弹窗，则在这里可以获取到支付二维码 qr_code_image
  }

  // 监听事件 - 支付成功
  const onSuccess = (res : UTSJSONObject) => {
    console.log('success: ', res, " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:392");
    let user_order_success = res.getBoolean('user_order_success');
    if (user_order_success != null && user_order_success != true) {
      // 代表用户已付款，且你自己写的回调成功并正确执行了

    } else {
      // 代表用户已付款，但你自己写的回调执行失败（通常是因为你的回调代码有问题）

    }
  }

  // 监听事件 - 支付失败
  const onFail = (err : UTSJSONObject) => {
    console.log('fail: ', err, " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:405")

  }

  // 监听事件 - 取消支付
  const onCancel = (err : UTSJSONObject) => {
    console.log('cancel: ', err, " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:411")
    uni.showToast({
      title: "用户取消了支付",
      icon: "none"
    });
  }

  // 页面跳转
  const pageTo = (url : string) => {
    uni.navigateTo({
      url
    });
  }

  // provider格式化
  const providerFormat = (provider ?: string) : string => {
    if (provider == null) {
      return "";
    }
    let providerObj = { __$originalPosition: new UTSSourceMapPosition("providerObj", "pages/API/request-payment/request-payment/request-payment-uni-pay.uvue", 430, 9), 
      "wxpay": "微信支付",
      "alipay": "支付宝支付",
      "appleiap": "ios内购"
    } as UTSJSONObject;
    let providerStr = providerObj[provider] as string;
    return providerStr;
  }

  // amount格式化
  const amountFormat = (totalFee : number | null) : string => {
    if (totalFee == null) {
      return "0";
    } else {
      return (totalFee / 100).toFixed(2)
    }
  }

  const checkUniCloud = () : boolean => {
    let useUniCloudResult = false;
    if (typeof uniCloud != 'undefined' && typeof uniCloud.config == "object" && uniCloud.config.spaceId != "") {
      useUniCloudResult = true;
    }
    if (!useUniCloudResult) {
      let errMsgText = "本示例依赖 uniCloud，请先关联服务空间，填写正确的支付配置，支付配置文件地址：/uni_modules/uni-config-center/uniCloud/cloudfunctions/common/uni-config-center/uni-pay/config.js";
      errMsg.value = errMsgText;
      uni.showModal({
        title: "提示",
        content: errMsgText,
        showCancel: false
      })
      console.error(errMsgText, " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:461");
    }
    return useUniCloudResult;
  }

  // 生命周期
  onLoad((options) => {
    console.log('onLoad: ', options, " at pages/API/request-payment/request-payment/request-payment-uni-pay.uvue:468");
    useUniCloud.value = checkUniCloud();





























  })

return (): any | null => {

const _component_uni_pay_popup = resolveEasyComponent("uni-pay-popup",_easycom_uni_pay_popup)
const _component_uni_pay = resolveEasyComponent("uni-pay",_easycom_uni_pay)

  return _cE("view", _uM({ class: "app" }), [
    _cE("view", _uM({ class: "uni-common-mb" }), [
      _cE("text", null, "如对当前页面的支付示例功能有任何疑问，通过电子邮件：service@dcloud.io 联系我们")
    ]),
    errMsg.value != ''
      ? _cE("view", _uM({ key: 0 }), [
          _cE("text", _uM({ class: "err-msg" }), "注意：" + _tD(errMsg.value), 1 /* TEXT */)
        ])
      : _cC("v-if", true),
    _cE("view", null, [
      _cE("view", _uM({ class: "label" }), "支付单号："),
      _cE("view", null, [
        _cE("input", _uM({
          class: "input",
          modelValue: out_trade_no.value,
          onInput: ($event: UniInputEvent) => {(out_trade_no).value = $event.detail.value},
          placeholder: "点击发起支付会自动生成"
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ])
    ]),
    _cE("view", null, [
      _cE("view", _uM({ class: "label" }), "支付金额（单位分，100=1元）："),
      _cE("view", null, [
        _cE("input", _uM({
          class: "input",
          modelValue: total_fee.value,
          onInput: ($event: UniInputEvent) => {(total_fee).value = $event.detail.value}
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ])
    ]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {open()}
    }), "打开收银台（弹窗模式）", 8 /* PROPS */, ["onClick"]),
    isTrue(!isPcCom.value)
      ? _cE("view", _uM({ key: 1 }), [
          _cE("button", _uM({
            class: "button",
            onClick: toPayDesk
          }), "打开收银台（新页面模式）")
        ])
      : _cC("v-if", true),
    _cE("button", _uM({
      class: "button",
      onClick: () => {createOrder('wxpay')}
    }), "发起支付（微信）", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {createOrder('alipay')}
    }), "发起支付（支付宝）", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {createQRcode('alipay')}
    }), "APP扫码支付（支付宝）", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {getOrderPopup(true)}
    }), "查询支付状态", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {pageTo('/uni_modules/uni-pay-x/pages/success/success?out_trade_no=test2024030501-1&order_no=test2024030501&total_fee=1&adpid=1000000001&return_url=/pages/API/request-payment/request-payment/order-detail')}
    }), "支付成功页面示例", 8 /* PROPS */, ["onClick"]),
    _cV(_component_uni_pay_popup, _uM({
      ref_key: "getOrderPopupRef",
      ref: getOrderPopupRef,
      type: "center"
    }), _uM({
      default: withSlotCtx((): any[] => [
        _cE("scroll-view", _uM({
          direction: "vertical",
          class: "get-order-popup"
        }), [
          _cE("view", _uM({ class: "label" }), "插件支付单号："),
          _cE("view", _uM({ class: "mt20" }), [
            _cE("input", _uM({
              class: "input pd2030",
              modelValue: out_trade_no.value,
              onInput: ($event: UniInputEvent) => {(out_trade_no).value = $event.detail.value},
              placeholder: "请输入"
            }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"]),
            _cE("view", null, [
              _cE("text", _uM({ class: "tips" }), "插件支付单号和第三方交易单号2选1填即可")
            ])
          ]),
          _cE("view", _uM({ class: "label" }), "第三方交易单号："),
          _cE("view", _uM({ class: "mt20" }), [
            _cE("input", _uM({
              class: "input pd2030",
              modelValue: transaction_id.value,
              onInput: ($event: UniInputEvent) => {(transaction_id).value = $event.detail.value},
              placeholder: "请输入"
            }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"]),
            _cE("view", null, [
              _cE("text", _uM({ class: "tips" }), "可从支付宝账单（订单号）、微信账单（交易单号）中复制")
            ])
          ]),
          _cE("view", _uM({ class: "mt20" }), [
            _cE("button", _uM({
              class: "button",
              onClick: getOrder
            }), "查询支付状态")
          ]),
          isTrue(getOrderRes.value['transaction_id'])
            ? _cE("view", _uM({
                key: 0,
                class: "mt20"
              }), [
                _cE("view", _uM({ class: "table" }), [
                  _cE("view", _uM({ class: "table-tr" }), [
                    _cE("view", _uM({ class: "table-td label" }), [
                      _cE("text", _uM({ class: "text align-left" }), "订单描述")
                    ]),
                    _cE("view", _uM({ class: "table-td" }), [
                      _cE("text", _uM({ class: "text align-right" }), _tD(getOrderRes.value['description']), 1 /* TEXT */)
                    ])
                  ]),
                  _cE("view", _uM({ class: "table-tr" }), [
                    _cE("view", _uM({ class: "table-td label" }), [
                      _cE("text", _uM({ class: "text align-left" }), "支付金额")
                    ]),
                    _cE("view", _uM({ class: "table-td" }), [
                      _cE("text", _uM({ class: "text align-right" }), _tD(amountFormat(getOrderRes.value.getNumber('total_fee'))), 1 /* TEXT */)
                    ])
                  ]),
                  _cE("view", _uM({ class: "table-tr" }), [
                    _cE("view", _uM({ class: "table-td label" }), [
                      _cE("text", _uM({ class: "text align-left" }), "支付方式")
                    ]),
                    _cE("view", _uM({ class: "table-td" }), [
                      _cE("text", _uM({ class: "text align-right" }), _tD(providerFormat(getOrderRes.value['provider'] as string)), 1 /* TEXT */)
                    ])
                  ]),
                  _cE("view", _uM({ class: "table-tr" }), [
                    _cE("view", _uM({ class: "table-td label" }), [
                      _cE("text", _uM({ class: "text align-left" }), "第三方交易单号")
                    ]),
                    _cE("view", _uM({ class: "table-td" }), [
                      _cE("text", _uM({ class: "text align-right" }), _tD(getOrderRes.value['transaction_id']), 1 /* TEXT */)
                    ])
                  ]),
                  _cE("view", _uM({ class: "table-tr" }), [
                    _cE("view", _uM({ class: "table-td label" }), [
                      _cE("text", _uM({ class: "text align-left" }), "插件支付单号")
                    ]),
                    _cE("view", _uM({ class: "table-td" }), [
                      _cE("text", _uM({ class: "text align-right" }), _tD(getOrderRes.value['out_trade_no']), 1 /* TEXT */)
                    ])
                  ]),
                  _cE("view", _uM({ class: "table-tr" }), [
                    _cE("view", _uM({ class: "table-td label" }), [
                      _cE("text", _uM({ class: "text align-left" }), "回调状态")
                    ]),
                    _cE("view", _uM({ class: "table-td" }), [
                      _cE("text", _uM({ class: "text align-right" }), _tD(getOrderRes.value.getBoolean('user_order_success') != null && getOrderRes.value.getBoolean('user_order_success') == true ? "成功" : "异常"), 1 /* TEXT */)
                    ])
                  ])
                ])
              ])
            : _cC("v-if", true)
        ])
      ]),
      _: 1 /* STABLE */
    }), 512 /* NEED_PATCH */),
    _cV(_component_uni_pay, _uM({
      ref_key: "payRef",
      ref: payRef,
      adpid: adpid.value,
      height: "450px",
      "return-url": "/pages/API/request-payment/request-payment/order-detail",
      logo: "/static/logo.png",
      onSuccess: onSuccess,
      onCreate: onCreate,
      onFail: onFail,
      onCancel: onCancel
    }), null, 8 /* PROPS */, ["adpid"])
  ])
}
}

})
export default __sfc__
const GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayStyles = [_uM([["app", _pS(_uM([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["input", _pS(_uM([["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#f3f3f3"], ["borderRightColor", "#f3f3f3"], ["borderBottomColor", "#f3f3f3"], ["borderLeftColor", "#f3f3f3"], ["paddingTop", 5], ["paddingRight", 5], ["paddingBottom", 5], ["paddingLeft", 5], ["width", "100%"], ["boxSizing", "border-box"], ["height", 40], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"]]))], ["button", _pS(_uM([["marginTop", 10]]))], ["label", _uM([["", _uM([["marginTop", 5], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0]])], [".table ", _uM([["width", 90]])]])], ["tips", _pS(_uM([["marginTop", 10], ["marginRight", 0], ["marginBottom", 10], ["marginLeft", 0], ["fontSize", 12], ["color", "#565656"]]))], ["get-order-popup", _pS(_uM([["backgroundColor", "#ffffff"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["height", 450], ["borderTopLeftRadius", 10], ["borderTopRightRadius", 10], ["borderBottomRightRadius", 10], ["borderBottomLeftRadius", 10], ["width", "100%"]]))], ["mt20", _pS(_uM([["marginTop", 10]]))], ["pd2030", _pS(_uM([["paddingTop", 10], ["paddingRight", 15], ["paddingBottom", 10], ["paddingLeft", 15]]))], ["table-tr", _uM([[".table ", _uM([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "center"], ["alignItems", "center"], ["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0]])]])], ["table-td", _uM([[".table ", _uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]])]])], ["align-left", _uM([[".table ", _uM([["textAlign", "left"]])]])], ["align-right", _uM([[".table ", _uM([["textAlign", "right"]])]])], ["text", _uM([[".table ", _uM([["fontSize", 12]])]])], ["err-msg", _pS(_uM([["color", "#FF0000"], ["fontSize", 14]]))]])]

import { UniPayComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue"
import { UniPayPopupComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay-popup/uni-pay-popup.uvue"