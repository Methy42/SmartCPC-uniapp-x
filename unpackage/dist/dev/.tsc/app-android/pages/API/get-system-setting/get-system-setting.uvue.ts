
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'getSystemSetting',
        bluetoothEnabled: "",
        locationEnabled: "",
        wifiEnabled: "",
        deviceOrientation: ""
      }
    },
    onUnload: function () {
    },
    methods: {
      getSystemSetting: function () {
        const res = uni.getSystemSetting();
        this.bluetoothEnabled = (res.bluetoothEnabled ?? false) ? "开启" : "关闭";
        this.locationEnabled = res.locationEnabled ? "开启" : "关闭";
        this.wifiEnabled = (res.wifiEnabled ?? false) ? "开启" : "关闭";
        this.deviceOrientation = res.deviceOrientation

        if (res.bluetoothError != null) {
          this.bluetoothEnabled = "无蓝牙权限"
        }

        if (res.wifiError != null) {
          this.wifiEnabled = "无WiFi权限"
        }
      }
    }
  })

export default __sfc__
function GenPagesAPIGetSystemSettingGetSystemSettingRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-list" }), [
        _cE("view", _uM({ class: "uni-list-cell" }), [
          _cE("view", _uM({ class: "uni-pd" }), [
            _cE("view", _uM({
              class: "uni-label",
              style: _nS(_uM({"width":"180px"}))
            }), "蓝牙的系统开关", 4 /* STYLE */)
          ]),
          _cE("view", _uM({ class: "uni-list-cell-db" }), [
            _cE("input", _uM({
              type: "text",
              disabled: true,
              placeholder: "未获取",
              value: _ctx.bluetoothEnabled
            }), null, 8 /* PROPS */, ["value"])
          ])
        ]),
        _cE("view", _uM({ class: "uni-list-cell" }), [
          _cE("view", _uM({ class: "uni-pd" }), [
            _cE("view", _uM({
              class: "uni-label",
              style: _nS(_uM({"width":"180px"}))
            }), "地理位置的系统开关", 4 /* STYLE */)
          ]),
          _cE("view", _uM({ class: "uni-list-cell-db" }), [
            _cE("input", _uM({
              type: "text",
              disabled: true,
              placeholder: "未获取",
              value: _ctx.locationEnabled
            }), null, 8 /* PROPS */, ["value"])
          ])
        ]),
        _cE("view", _uM({ class: "uni-list-cell" }), [
          _cE("view", _uM({ class: "uni-pd" }), [
            _cE("view", _uM({
              class: "uni-label",
              style: _nS(_uM({"width":"180px"}))
            }), "Wi-Fi 的系统开关", 4 /* STYLE */)
          ]),
          _cE("view", _uM({ class: "uni-list-cell-db" }), [
            _cE("input", _uM({
              type: "text",
              disabled: true,
              placeholder: "未获取",
              value: _ctx.wifiEnabled
            }), null, 8 /* PROPS */, ["value"])
          ])
        ]),
        _cE("view", _uM({ class: "uni-list-cell" }), [
          _cE("view", _uM({ class: "uni-pd" }), [
            _cE("view", _uM({
              class: "uni-label",
              style: _nS(_uM({"width":"180px"}))
            }), "设备方向", 4 /* STYLE */)
          ]),
          _cE("view", _uM({ class: "uni-list-cell-db" }), [
            _cE("input", _uM({
              type: "text",
              disabled: true,
              placeholder: "未获取",
              value: _ctx.deviceOrientation
            }), null, 8 /* PROPS */, ["value"])
          ])
        ])
      ]),
      _cE("view", _uM({ class: "uni-padding-wrap" }), [
        _cE("view", _uM({ class: "uni-btn-v" }), [
          _cE("button", _uM({
            type: "primary",
            onClick: _ctx.getSystemSetting
          }), "获取系统设置", 8 /* PROPS */, ["onClick"])
        ])
      ])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIGetSystemSettingGetSystemSettingStyles = [_uM([["uni-pd", _pS(_uM([["paddingLeft", 15]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
