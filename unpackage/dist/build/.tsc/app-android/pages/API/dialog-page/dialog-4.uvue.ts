
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'dialog 4'
      }
    },
    onShow() {
      console.log('dialog 4 onShow')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onUnload() {
      console.log('dialog 4 onUnload')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum - 5)
    },
    methods: {
      closeDialog() {
        uni.closeDialogPage({
          success(res) {
            console.log('closeDialog success', res)
          },
          fail(err) {
            console.log('closeDialog fail', err)
          },
          complete(res) {
            console.log('closeDialog complete', res)
          }
        })
      },
      closeThisDialog() {
        uni.closeDialogPage({
          dialogPage: this.$page,
          success(res) {
            console.log('closeThisDialog success', res)
          },
          fail(err) {
            console.log('closeThisDialog fail', err)
          },
          complete(res) {
            console.log('closeThisDialog complete', res)
          }
        })
      },
      openDialog3(){
        uni.openDialogPage({url: '/pages/API/dialog-page/dialog-3'})
      }
    }
  })

export default __sfc__
function GenPagesAPIDialogPageDialog4Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "dialog-container" }), [
    _cE("view", _uM({ class: "dialog-content" }), [
      _cE("text", null, "title: " + _tD(_ctx.title), 1 /* TEXT */),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.closeDialog
      }), " closeDialog ", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.closeThisDialog
      }), " closeThisDialog ", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.openDialog3
      }), " open dialog 3 ", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIDialogPageDialog4Styles = [_uM([["dialog-container", _pS(_uM([["width", "100%"], ["height", "100%"], ["backgroundColor", "rgba(0,0,0,0.3)"], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["dialog-content", _pS(_uM([["width", "80%"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 6], ["borderTopRightRadius", 6], ["borderBottomRightRadius", 6], ["borderBottomLeftRadius", 6]]))], ["mt-10", _pS(_uM([["marginTop", 10]]))]])]
