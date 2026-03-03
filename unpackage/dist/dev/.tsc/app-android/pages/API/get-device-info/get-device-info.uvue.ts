
  import { setDevicePixelRatio } from '@/store/index.uts'

  type Item = { __$originalPosition?: UTSSourceMapPosition<"Item", "pages/API/get-device-info/get-device-info.uvue", 38, 8>;
    label : string,
    value : string,
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'getDeviceInfo',
        items: [] as Item[],
      }
    },
    onUnload: function () {
    },
    methods: {
      getDeviceInfo: function () {
        const res = uni.getDeviceInfo();
        // 获取像素比, 供截图对比使用
        setDevicePixelRatio(res.devicePixelRatio !== null ? res.devicePixelRatio! : 1)
        this.items = [] as Item[];

        const res_str = JSON.stringify(res);
        const res_obj = UTSAndroid.consoleDebugError(JSON.parseObject(res_str), " at pages/API/get-device-info/get-device-info.uvue:59");
        const res_map = res_obj!.toMap();
        let keys = [] as string[]
        res_map.forEach((_, key) => {
          keys.push(key);
        });
        keys.sort().forEach(key => {
          const value = res[key];
          if (value != null) {
            const item = {
              label: key,
              value: "" + ((typeof value == "object") ? JSON.stringify(value) : value)
            } as Item;
            this.items.push(item);
          }
        });
      }
    }
  })

export default __sfc__
function GenPagesAPIGetDeviceInfoGetDeviceInfoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({ class: "page-scroll-view" }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      _cE("view", _uM({ class: "uni-common-mt" }), [
        _cE("view", _uM({ class: "uni-list" }), [
          _cE("view", _uM({ class: "uni-list" }), [
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, _, __index, _cached): any => {
              return _cE("view", _uM({
                class: "uni-list-cell",
                style: _nS(_uM({"align-items":"center"}))
              }), [
                _cE("view", _uM({ class: "uni-pd" }), [
                  _cE("view", _uM({
                    class: "uni-label",
                    style: _nS(_uM({"width":"180px"}))
                  }), _tD(item.label), 5 /* TEXT, STYLE */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell-db" }), [
                  _cE("text", _uM({ class: "uni-list-cell-db-text" }), _tD(item.value == "" ? "未获取" : item.value), 1 /* TEXT */)
                ])
              ], 4 /* STYLE */)
            }), 256 /* UNKEYED_FRAGMENT */)
          ])
        ]),
        _cE("view", _uM({ class: "uni-padding-wrap" }), [
          _cE("view", _uM({ class: "uni-btn-v" }), [
            _cE("button", _uM({
              type: "primary",
              onClick: _ctx.getDeviceInfo
            }), "获取设备信息", 8 /* PROPS */, ["onClick"])
          ])
        ])
      ])
    ])
  ])
}
const GenPagesAPIGetDeviceInfoGetDeviceInfoStyles = [_uM([["uni-pd", _pS(_uM([["paddingLeft", 15]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
