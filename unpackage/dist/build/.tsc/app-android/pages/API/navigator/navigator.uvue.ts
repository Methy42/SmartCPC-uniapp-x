
  import { state, setLifeCycleNum } from '@/store/index.uts'
  type AnimationType = "slide-in-right" | "slide-in-left" | "slide-in-top" | "slide-in-bottom" | "pop-in" | "fade-in" | "zoom-out" | "zoom-fade-out" | "none" | "auto"

  const __sfc__ = defineComponent({
    data() {
      return {
        onLoadTime: 0,
        onShowTime: 0,
        onReadyTime: 0,
        onHideTime: 0,
        shareElementKey: "",
        animationTypeList: [
          'slide-in-right',
          'slide-in-left',
          'slide-in-top',
          'slide-in-bottom',
          'pop-in',
          'fade-in',
          'zoom-out',
          'zoom-fade-out',
          'none'
        ]
      }
    },
    onLoad() {
      this.onLoadTime = Date.now()
      console.log('onLoad', this.onLoadTime)
    },
    onShow() {
      this.onShowTime = Date.now()
      console.log('onShow', this.onShowTime)
    },
    onReady() {
      this.onReadyTime = Date.now()
      console.log('onReady', this.onReadyTime)
    },
    onHide() {
      this.onHideTime = Date.now()
      console.log('onHide', this.onHideTime)
    },
    onBackPress(options : OnBackPressOptions) : boolean | null {
      console.log('onBackPress', Date.now())
      console.log('onBackPress from', options.from)
      return null
    },
    onUnload() {
      console.log('onUnload', Date.now())
    },
    methods: {
      reLaunch() {
        uni.reLaunch({
          url: '/pages/tabBar/component',
          success(result) {
            console.log('reLaunch success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('reLaunch fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('reLaunch complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateTo() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=Hello',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateToAnimationType(animationType : AnimationType) {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=Hello',
          animationType: animationType,
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateToErrorPage() {
        uni.navigateTo({
          url: '/pages/error-page/error-page',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            uni.showToast({
              title: error.errMsg,
              icon: 'none',
            })
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateToDebounce() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=debounce',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=debounce',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      navigateToRelativePath1() {
        uni.navigateTo({
          url: 'new-page/new-page-1?data=new-page/new-page-1',
          success() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail() {
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      navigateToRelativePath2() {
        uni.navigateTo({
          url: './new-page/new-page-1?data=./new-page/new-page-1',
          success() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail() {
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      navigateToRelativePath3() {
        uni.navigateTo({
          url: '../navigator/new-page/new-page-1?data=../navigator/new-page/new-page-1',
          success() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail() {
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateBack() {
        uni.navigateBack({
          success(result) {
            console.log('navigateBack success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateBack fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateBack complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateBackWithDelta1() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1',
          success() {
            uni.navigateBack({
              delta: 1,
              success(result) {
                console.log('navigateBack success', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
              fail(error) {
                console.log('navigateBack fail', error.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum - 1)
              },
              complete(result) {
                console.log('navigateBack complete', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
            })
          },
        })
      },
      navigateBackWithDelta100() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1',
          success() {
            uni.navigateBack({
              delta: 100,
              success(result) {
                console.log('navigateBack success', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
              fail(error) {
                console.log('navigateBack fail', error.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum - 1)
              },
              complete(result) {
                console.log('navigateBack complete', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
            })
          },
        })
      },
      redirectTo() {
        uni.redirectTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=Hello',
          success(result) {
            console.log('redirectTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('redirectTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('redirectTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      switchTab() {
        uni.switchTab({
          url: '/pages/tabBar/template',
          success(result) {
            console.log('switchTab success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('switchTab fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('switchTab complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      getLifeCycleNum() : number {
        return state.lifeCycleNum
      },
      // 自动化测试
      setLifeCycleNum(num : number) {
        setLifeCycleNum(num)
      },
      onChange(event: UniSwitchChangeEvent) {
        if(event.detail.value) {
          this.shareElementKey = "test-share-element-key"
        } else {
          this.shareElementKey = ""
        }
      },
      goOnLoadCallAPI(){
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/onLoad-call-api'
        })
      }
    },
  })

export default __sfc__
function GenPagesAPINavigatorNavigatorRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_switch = resolveComponent("switch")

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: "navigate" })),
      _cE("view", _uM({
        style: _nS(_uM({"flex-direction":"row"}))
      }), [
        _cV(_component_switch, _uM({ onChange: _ctx.onChange }), null, 8 /* PROPS */, ["onChange"]),
        _cE("view", _uM({ class: "uni-title" }), "是否启用共享元素动画")
      ], 4 /* STYLE */),
      _cE("share-element", _uM({ "share-key": _ctx.shareElementKey }), [
        _cE("image", _uM({
          style: _nS(_uM({"width":"250px","height":"176px"})),
          src: "/static/shuijiao.jpg",
          mode: "scaleToFill"
        }), null, 4 /* STYLE */)
      ], 8 /* PROPS */, ["share-key"]),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"13px"}))
      }), "注意：开启共享元素动画后仅支持slide-in-right和fade-in动画效果", 4 /* STYLE */),
      _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt uni-common-mb" }), [
        _cE("view", _uM({ class: "direction-row" }), [
          _cE("text", _uM({ class: "label" }), "onLoad触发时间戳:"),
          _cE("text", null, _tD(_ctx.onLoadTime), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "direction-row" }), [
          _cE("text", _uM({ class: "label" }), "onShow触发时间戳:"),
          _cE("text", null, _tD(_ctx.onShowTime), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "direction-row" }), [
          _cE("text", _uM({ class: "label" }), "onReady触发时间戳:"),
          _cE("text", null, _tD(_ctx.onReadyTime), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "direction-row" }), [
          _cE("text", _uM({ class: "label" }), "onHide触发时间戳:"),
          _cE("text", null, _tD(_ctx.onHideTime), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "direction-row" }), [
          _cE("text", _uM({ class: "label" }), "onBackPress触发时间戳:"),
          _cE("text", null, "见控制台")
        ]),
        _cE("view", _uM({ class: "direction-row" }), [
          _cE("text", _uM({ class: "label" }), "onUnload触发时间戳:"),
          _cE("text", null, "见控制台")
        ]),
        _cE("view", _uM({ class: "uni-btn-v" }), [
          _cE("button", _uM({
            onClick: _ctx.navigateTo,
            class: "uni-btn"
          }), " 跳转新页面，并传递数据 ", 8 /* PROPS */, ["onClick"]),
          _cE("button", _uM({
            onClick: _ctx.navigateBack,
            class: "uni-btn"
          }), "返回上一页", 8 /* PROPS */, ["onClick"]),
          _cE("button", _uM({
            onClick: _ctx.redirectTo,
            class: "uni-btn"
          }), "在当前页面打开", 8 /* PROPS */, ["onClick"]),
          _cE("button", _uM({
            onClick: _ctx.switchTab,
            class: "uni-btn"
          }), "切换到模板选项卡", 8 /* PROPS */, ["onClick"]),
          _cE("button", _uM({
            onClick: _ctx.reLaunch,
            class: "uni-btn"
          }), " 关闭所有页面，打开首页 ", 8 /* PROPS */, ["onClick"]),
          _cE("button", _uM({
            onClick: _ctx.navigateToErrorPage,
            class: "uni-btn"
          }), " 打开不存在的页面 ", 8 /* PROPS */, ["onClick"]),
          _cE(Fragment, null, RenderHelpers.renderList(_ctx.animationTypeList, (item, _, __index, _cached): any => {
            return _cE("button", _uM({
              onClick: () => {_ctx.navigateToAnimationType(item)},
              class: "uni-btn"
            }), "navigateTo动画(" + _tD(item) + ")", 9 /* TEXT, PROPS */, ["onClick"])
          }), 256 /* UNKEYED_FRAGMENT */),
          _cE("button", _uM({
            class: "uni-btn",
            onClick: _ctx.goOnLoadCallAPI
          }), "测试 onLoad 调用 API", 8 /* PROPS */, ["onClick"])
        ])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPINavigatorNavigatorStyles = [_uM([["direction-row", _pS(_uM([["flexDirection", "row"]]))], ["label", _pS(_uM([["width", 190]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
