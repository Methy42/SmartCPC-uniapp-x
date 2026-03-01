
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'makePhoneCall',
        disabled: true,
        inputValue: ''
      }
    },
    methods: {
      bindInput: function (e : UniInputEvent) {
        this.inputValue = e.detail.value
        if (this.inputValue.length > 0) {
          this.disabled = false
        } else {
          this.disabled = true
        }
      },
      makePhoneCall: function () {
        uni.makePhoneCall({
          phoneNumber: this.inputValue,
          success: () => {
            console.log("成功拨打电话")
          },
          fail: (err) => {
            console.log(err.errCode)
            uni.showToast({
              title: '错误码：' + err.errCode.toString(),
              icon: "error"
            })
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIMakePhoneCallMakePhoneCallRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("view", null, [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-hello-text uni-center" }), "请在下方输入电话号码"),
      _cE("input", _uM({
        class: "input uni-common-mt",
        type: "number",
        name: "input",
        onInput: _ctx.bindInput
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onInput"]),
      _cE("view", _uM({ class: "uni-btn-v uni-common-mt" }), [
        _cE("button", _uM({
          onClick: _ctx.makePhoneCall,
          type: "primary",
          disabled: _ctx.disabled
        }), "拨打", 8 /* PROPS */, ["onClick", "disabled"])
      ])
    ])
  ])
}
const GenPagesAPIMakePhoneCallMakePhoneCallStyles = [_uM([["input", _pS(_uM([["height", 60], ["lineHeight", "60px"], ["fontSize", 39], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#E2E2E2"], ["textAlign", "center"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
