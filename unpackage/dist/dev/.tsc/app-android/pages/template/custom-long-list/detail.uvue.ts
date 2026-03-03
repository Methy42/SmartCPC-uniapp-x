
const __sfc__ = defineComponent({
  __name: 'detail',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  let name = ref("")
  onLoad((options: OnLoadOptions) => {
    name.value = (options["name"] as string | null) ?? ""
  })

return (): any | null => {

  return _cE("view", _uM({
    style: _nS(_uM({"text-align":"center","padding":"15px"}))
  }), _tD(unref(name)) + "的详情页面 ", 5 /* TEXT, STYLE */)
}
}

})
export default __sfc__
const GenPagesTemplateCustomLongListDetailStyles = []
