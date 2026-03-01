
	const __sfc__ = defineComponent({
		data() {
			return {
			  title: '隐私信息授权',
			  appPrivacy: '未获取',
        privacyContractName: "",
        listenId: 0
			}
		},
    onReady() {

      //添加 隐私协议监听
      const id = uni.onPrivacyAuthorizationChange((res) => {
         this.appPrivacy = res.needAuthorization ? "未同意" : "已同意"
         const privacyState = "监听到隐私协议状态已变更为 " + this.appPrivacy;
         uni.showToast({
           "position": "bottom",
           "title": privacyState
         })
      })
      this.listenId = id;
      uni.showToast({
        "position": "bottom",
        "title": "开启监听隐私协议状态"
      })

    },
    onUnload() {

      //注销监听
      uni.offPrivacyAuthorizationChange(this.listenId)
      this.listenId = 0;
      uni.showToast({
        "position": "bottom",
        "title": "已停止监听隐私协议状态"
      })

    },
		methods: {
			getPrivacySetting() {
			  uni.getPrivacySetting({
			    success: (res) => {
			      this.appPrivacy = res.needAuthorization ? "未同意" : "已同意"



			    }
			  })
			},
      resetPrivacyAuthorization(){
        uni.resetPrivacyAuthorization()
      },
      openPrivacyDialog(){
        uni.openDialogPage({
          url: '/pages/component/button/privacy',
        })
      }
		}
	})

export default __sfc__
function GenPagesAPIPrivacyPrivacyRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("view", _uM({ class: "uni-padding-wrap" }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "item-box" }), [
      _cE("text", null, "当前应用隐私授权状态:"),
      _cE("text", null, _tD(_ctx.appPrivacy), 1 /* TEXT */)
    ]),
    _cE("view", null, [
      _cE("button", _uM({
        class: "privacy-button",
        type: "primary",
        onClick: _ctx.getPrivacySetting
      }), " 获取隐私协议授权状态 ", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "privacy-button",
        type: "primary",
        "open-type": "agreePrivacyAuthorization"
      }), " 同意隐私协议专用按钮 "),
      _cE("button", _uM({
        class: "privacy-button",
        type: "primary",
        onClick: _ctx.resetPrivacyAuthorization
      }), " 重置隐私协议授权状态 ", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "privacy-button",
        onClick: _ctx.openPrivacyDialog
      }), " 显示隐私政策弹框 ", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIPrivacyPrivacyStyles = [_uM([["item-box", _pS(_uM([["marginBottom", 10], ["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"]]))], ["privacy-button", _pS(_uM([["marginTop", 5], ["marginBottom", 5]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
