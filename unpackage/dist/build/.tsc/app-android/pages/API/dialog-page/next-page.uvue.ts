
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  const __sfc__ = defineComponent({
    onLoad() {
      console.log('dialogPage parent onLoad')
    },
    onShow() {
      console.log('dialogPage parent onShow')
    },
    onReady() {
      console.log('dialogPage parent onReady')
    },
    onHide() {
      console.log('dialogPage parent onHide')
    },
    onUnload() {
      console.log('dialogPage parent onUnload')
    },
    methods: {
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
      openDialog2() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-2',
          disableEscBack: true,
          success(res) {
            console.log('openDialog2 success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('openDialog2 fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('openDialog2 complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
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
      openDialogPage1ToHomePage() {
        const pages = getCurrentPages()
        uni.openDialogPage({
          parentPage: pages[0],
          url: '/pages/API/dialog-page/dialog-1?name=dialog1',
          success(res) {
            console.log('openDialogPage1ToHomePage success', res)
            uni.showToast({title: '在首页打开了 dialogPage'})
          },
          fail(err) {
            console.log('openDialogPage1ToHomePage fail', err)
          },
          complete(res) {
            console.log('openDialogPage1ToHomePage complete', res)
          }
        })
      },
      setLifeCycleNum(value: number) {
        setLifeCycleNum(value)
      },
      getLifeCycleNum(): number {
        return state.lifeCycleNum
      }
    }
  })

export default __sfc__
function GenPagesAPIDialogPageNextPageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "uni-padding-wrap" }), [
    _cE("button", _uM({
      class: "uni-common-mt",
      onClick: _ctx.openDialog1
    }), "open dialog1", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "uni-common-mt",
      onClick: _ctx.openDialog2
    }), "open dialog2", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "uni-common-mt",
      onClick: _ctx.openDialogPage1ToHomePage
    }), "open dialog page 1 to home page", 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesAPIDialogPageNextPageStyles = []
