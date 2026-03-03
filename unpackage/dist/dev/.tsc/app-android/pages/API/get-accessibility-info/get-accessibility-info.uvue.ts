import _easycom_page_head from '@/components/page-head/page-head.vue'

const __sfc__ = defineComponent({
  __name: 'get-accessibility-info',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const accessibilityInfo = ref("")
  accessibilityInfo.value = JSON.stringify(uni.getAccessibilityInfo())

return (): any | null => {

const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: 'getAccessibilityInfo' })),
      _cE("view", _uM({ class: "uni-common-mt" }), [
        _cE("text", _uM({
          style: _nS(_uM({"margin-left":"8px"}))
        }), "无障碍服务信息如下：", 4 /* STYLE */),
        _cE("text", _uM({
          style: _nS(_uM({"margin-top":"15px","padding":"8px"}))
        }), _tD(unref(accessibilityInfo)), 5 /* TEXT, STYLE */)
      ])
    ])
  ], 4 /* STYLE */)
}
}

})
export default __sfc__
const GenPagesAPIGetAccessibilityInfoGetAccessibilityInfoStyles = []
