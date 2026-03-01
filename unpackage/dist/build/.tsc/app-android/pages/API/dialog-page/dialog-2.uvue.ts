
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'dialog 2',
      }
    },
    onLoad(options : OnLoadOptions) {
      console.log('dialog 2 onLoad', options)
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onShow() {
      console.log('dialog 2 onShow')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onReady() {
      console.log('dialog 2 onReady')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onHide() {
      console.log('dialog 2 onHide')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum - 1)
    },
    onUnload() {
      console.log('dialog 2 onUnload')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum - 5)
    },
    onBackPress(options : OnBackPressOptions) : boolean | null {
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
      return false
    },
    methods: {
      goNextPage() {
        uni.navigateTo({ url: '/pages/API/dialog-page/next-page' })
      },
      openDialog1() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-1?name=dialog1',
          success(res) {
            console.log('openDialog1 success', res)
          },
          fail(err) {
            console.log('openDialog1 fail', err)
          },
          complete(res) {
            console.log('openDialog1 complete', res)
          }
        })
      },
      closeDialog() {
        uni.closeDialogPage({
          success(res) {
            console.log('closeDialog success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('closeDialog fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('closeDialog complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      closeThisDialog() {
        uni.closeDialogPage({
          dialogPage: this.$page,
          success(res) {
            console.log('closeThisDialog success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('closeThisDialog fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('closeThisDialog complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      back() {
        uni.navigateBack()
      }
    }
  })

export default __sfc__
function GenPagesAPIDialogPageDialog2Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    id: "dialog2",
    class: "dialog-container"
  }), [
    _cE("view", _uM({ class: "dialog-content" }), [
      _cE("text", null, "title: " + _tD(_ctx.title), 1 /* TEXT */),
      _cE("text", _uM({ class: "mt-10" }), "onBackPress return false"),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.goNextPage
      }), "go next page", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.openDialog1
      }), "openDialog1", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.closeDialog
      }), "closeDialog", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.closeThisDialog
      }), "closeThisDialog", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "mt-10",
        onClick: _ctx.back
      }), "back", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIDialogPageDialog2Styles = [_uM([["dialog-container", _pS(_uM([["width", "100%"], ["height", "100%"], ["backgroundColor", "rgba(0,0,0,0.3)"], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["dialog-content", _pS(_uM([["width", "80%"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 6], ["borderTopRightRadius", 6], ["borderBottomRightRadius", 6], ["borderBottomLeftRadius", 6]]))], ["mt-10", _pS(_uM([["marginTop", 10]]))]])]
