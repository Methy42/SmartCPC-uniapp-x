
const __sfc__ = defineComponent({
  __name: 'page-head',
  props: {
    title: { type: String, default: "" }
  },
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const props = __props

return (): any | null => {

  return _cE("view", _uM({ class: "common-page-head" }), [
    _cE("view", _uM({ class: "common-page-head-title-box" }), [
      _cE("text", _uM({ class: "common-page-head-title" }), _tD(_ctx.title), 1 /* TEXT */)
    ])
  ])
}
}

})
export default __sfc__
export type PageHeadComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsPageHeadPageHeadStyles = [_uM([["common-page-head", _pS(_uM([["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["alignItems", "center"]]))], ["common-page-head-title-box", _pS(_uM([["paddingTop", 0], ["paddingRight", 20], ["paddingBottom", 0], ["paddingLeft", 20], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#D8D8D8"]]))], ["common-page-head-title", _pS(_uM([["lineHeight", "40px"], ["color", "#BEBEBE"]]))]])]
