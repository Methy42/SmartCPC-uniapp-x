
const __sfc__ = defineComponent({
  __name: 'uni-recycle-item',
  props: {
    offset: {
      type: Number,
      default: 0
    }
  },
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const props = __props

return (): any | null => {

  return _cE("view", _uM({
    class: "recycle-item",
    style: _nS(_uM({transform: 'translateY(' + props.offset + 'px)'}))
  }), [
    renderSlot(_ctx.$slots, "default")
  ], 4 /* STYLE */)
}
}

})
export default __sfc__
export type UniRecycleItemComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItemStyles = [_uM([["recycle-item", _pS(_uM([["position", "absolute"], ["left", 0], ["top", 0], ["width", "100%"], ["height", "auto"]]))]])]
