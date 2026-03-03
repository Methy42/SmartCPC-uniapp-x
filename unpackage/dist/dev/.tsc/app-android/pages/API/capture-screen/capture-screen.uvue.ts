import _easycom_page_head from '@/components/page-head/page-head.vue'
import { state, setAllowCapture } from '@/store/index.uts'

const __sfc__ = defineComponent({
  __name: 'capture-screen',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

const title = '截屏监听'
const allowCapture = ref(state.allowCapture)
const captureStatus = ref('未监听')
const captureCallback = ref<((res: OnUserCaptureScreenCallbackResult) => void) | null>(null);


const toggleCaptureScreen = (checked: boolean) => {
  uni.setUserCaptureScreen({
    enable: checked,
    success: (res: SetUserCaptureScreenSuccess) => {
      allowCapture.value = checked
      setAllowCapture(checked)
      console.log('设置截屏状态成功：', res, " at pages/API/capture-screen/capture-screen.uvue:33")
    },
    fail: (err:IUniError) => {
      console.log('设置截屏状态失败：', err, " at pages/API/capture-screen/capture-screen.uvue:36")
    }
  })
}

const startCaptureListener = () => {
  captureCallback.value = (res: OnUserCaptureScreenCallbackResult) => {
    captureStatus.value = '检测到截屏'
    console.log('检测到用户截屏',res, " at pages/API/capture-screen/capture-screen.uvue:44")
  }
  uni.onUserCaptureScreen(captureCallback.value)
  captureStatus.value = '正在监听'
  console.log('开始监听截屏', " at pages/API/capture-screen/capture-screen.uvue:48")
}

const stopCaptureListener = () => {
  if (captureCallback.value != null) {
    uni.offUserCaptureScreen(captureCallback.value)
    captureStatus.value = '未监听'
    console.log('停止监听截屏', " at pages/API/capture-screen/capture-screen.uvue:55")
  }
}

// 页面卸载时清理监听
onUnmounted(() => {
  stopCaptureListener()
})

return (): any | null => {

const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_switch = resolveComponent("switch")

  return _cE("view", _uM({ class: "uni-container" }), [
    _cV(_component_page_head, _uM({ title: title })),
    _cE("view", _uM({ class: "uni-common-mt" }), [
      _cE("text", _uM({ class: "uni-title" }), "截屏状态：" + _tD(unref(captureStatus)), 1 /* TEXT */),
      _cE("view", _uM({
        style: _nS(_uM({"flex-direction":"row"}))
      }), [
        _cE("text", _uM({ class: "uni-title" }), "是否允许截屏"),
        _cV(_component_switch, _uM({
          checked: unref(allowCapture),
          onChange: (e: UniSwitchChangeEvent) => toggleCaptureScreen(e.detail.value)
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ], 4 /* STYLE */),
      _cE("view", _uM({ class: "uni-btn" }), [
        _cE("button", _uM({
          onClick: startCaptureListener,
          type: "primary",
          class: "uni-common-mt"
        }), "开启截屏监听"),
        _cE("button", _uM({
          onClick: stopCaptureListener,
          class: "uni-common-mt"
        }), "关闭截屏监听")
      ])
    ])
  ])
}
}

})
export default __sfc__
const GenPagesAPICaptureScreenCaptureScreenStyles = []
