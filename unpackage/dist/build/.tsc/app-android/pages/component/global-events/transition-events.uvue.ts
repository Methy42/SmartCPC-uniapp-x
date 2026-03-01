
  const __sfc__ = defineComponent({
    data() {
      return {
        times: 0,
        element: null as UniElement | null,
        isStart: false,
        buttonValue: "开启图片旋转",
        onTransitionEndTriggr: false,
        isShow: false
      }
    },
    onReady() {
      // onReady中动态修改isShow是为了验证在安卓手机上子线程中创建节点可能会崩溃的问题，不具备代码参考性。

      var that = this
      class ThreadRunnable extends Runnable {
        override run() {
          that.isShow = true
        }
      }
      new Thread(new ThreadRunnable()).start()




    },
    methods: {
      switchBtn() {
        if (!this.isStart) {
          if (this.element == null) {
            this.element = uni.getElementById('transition-transform')
          }
          this.buttonValue = "关闭图片旋转"
          this.times = this.times + 1
          this.element!.style.setProperty('transition-duration', '2000ms')
          this.element!.style.setProperty('transform', 'rotate(' + this.times * 360 + 'deg)')
          this.isStart = true
        } else {
          this.isStart = false
          this.times = 0
          this.onTransitionEndTriggr = false
          this.buttonValue = "开启图片旋转"
          this.element!.style.setProperty('transition-duration', '0ms')
          this.element!.style.setProperty('transform', 'rotate(0deg)')
        }
      },
      onEnd() {
        console.log('transform transitionend')
        if (this.isStart) {
          this.times = this.times + 1
          this.element!.style.setProperty('transform', 'rotate(' + this.times * 360 + 'deg)')
          this.onTransitionEndTriggr = true
        }
      }
    }
  })

export default __sfc__
function GenPagesComponentGlobalEventsTransitionEventsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return isTrue(_ctx.isShow)
    ? _cE("scroll-view", _uM({
        key: 0,
        style: _nS(_uM({"flex":"1"}))
      }), [
        _cE("image", _uM({
          class: "transition-transform",
          id: "transition-transform",
          onTransitionend: _ctx.onEnd,
          src: "/static/uni.png"
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["onTransitionend"]),
        _cE("text", _uM({ class: "adjust" }), "对图片设置transform进行旋转，在旋转完成的transitionend事件后，继续旋转"),
        _cE("button", _uM({
          class: "adjust",
          onClick: _ctx.switchBtn
        }), _tD(_ctx.buttonValue), 9 /* TEXT, PROPS */, ["onClick"])
      ], 4 /* STYLE */)
    : _cC("v-if", true)
}
const GenPagesComponentGlobalEventsTransitionEventsStyles = [_uM([["adjust", _pS(_uM([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10]]))], ["transition-transform", _pS(_uM([["width", 200], ["height", 200], ["marginTop", 25], ["marginRight", "auto"], ["marginBottom", 25], ["marginLeft", "auto"], ["borderTopLeftRadius", 100], ["borderTopRightRadius", 100], ["borderBottomRightRadius", 100], ["borderBottomLeftRadius", 100], ["transitionProperty", "transform"], ["transitionTimingFunction", "linear"], ["transform", "rotate(0deg)"]]))], ["@TRANSITION", _uM([["transition-transform", _uM([["property", "transform"], ["timingFunction", "linear"]])]])]])]
