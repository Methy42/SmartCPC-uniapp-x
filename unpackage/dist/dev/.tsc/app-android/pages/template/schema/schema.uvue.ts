import { openSchema } from '@/uni_modules/uts-openSchema'

const __sfc__ = defineComponent({
  __name: 'schema',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;


return (): any | null => {

  return _cE("view", null, [
    _cE("button", _uM({
      class: "button",
      onClick: () => {unref(openSchema)('https://uniapp.dcloud.io/uni-app-x')}
    }), "使用外部浏览器打开指定URL", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {unref(openSchema)('market://details?id=com.tencent.mm')}
    }), "使用应用商店打开指定App", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      onClick: () => {unref(openSchema)('androidamap://viewMap?sourceApplication=Hello%20uni-app&poiname=DCloud&lat=39.9631018208&lon=116.3406135236&dev=0')}
    }), " 打开地图坐标 ", 8 /* PROPS */, ["onClick"])
  ])
}
}

})
export default __sfc__
const GenPagesTemplateSchemaSchemaStyles = [_uM([["button", _pS(_uM([["marginTop", 15], ["marginRight", 15], ["marginBottom", 15], ["marginLeft", 15]]))], ["tip", _pS(_uM([["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8]]))], ["link", _pS(_uM([["color", "#7A7E83"], ["fontSize", 14], ["lineHeight", "20px"]]))]])]
