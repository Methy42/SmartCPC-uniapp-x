import _easycom_page_head from '@/components/page-head/page-head.vue'

const __sfc__ = defineComponent({
  __name: 'is-simulator',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const isSimulator = ref(false)
  isSimulator.value = uni.isSimulator()

return (): any | null => {

const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: 'isSimulator' })),
      _cE("view", _uM({
        class: "uni-common-mt",
        style: _nS(_uM({"justify-content":"center","align-items":"center"}))
      }), [
        _cE("text", null, _tD(unref(isSimulator) ? "当前设备是模拟器" : "当前设备不是模拟器"), 1 /* TEXT */),
        _cE("text", null, "\n注：有些模拟器会故意伪装为真机，此时识别可能会不准确")
      ], 4 /* STYLE */)
    ])
  ], 4 /* STYLE */)
}
}

})
export default __sfc__
const GenPagesAPIIsSimulatorIsSimulatorStyles = []
