
  type GetLocationType = 'wgs84' | 'gcj02'
  export type LocationItem = { id : string, name : string, provider ?: UniProvider }
  export type ItemType = { value : GetLocationType, name : GetLocationType }

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'get-location',
        altitudeSelect: false,
        isHighAccuracySelect: false,
        geocodeSelect: false,
        exeRet: '',
        items: [
          {
            value: 'wgs84',
            name: 'wgs84'
          },
          {
            value: 'gcj02',
            name: 'gcj02'
          }
        ] as ItemType[],
        providerList: [] as LocationItem[],
        current: 0,
        currentProvider: 0,
        jest_provider: '',
        jest_type: 'wgs84' as GetLocationType,
        jest_isAltitude: false,
        jest_isGeocode: false,
        jest_isHighAccuracy: false,
        jest_altitude: -1000,
        jest_longitude: 200,
        jest_latitude: 100,
        jest_address: '',
        jest_errCode: 0,
        jest_complete: false
      }
    },
    onLoad: function () {

      this.getProvider()

    },
    methods: {
      getProvider() {


        let provider = uni.getProviderSync({
          service: "location",
        } as GetProviderSyncOptions)
        console.log(provider)
        provider.providerObjects.forEach((value : UniProvider) => {
          var currentProvider = value
          // if (value.id == 'system') {
          //   currentProvider = value as UniLocationSystemProvider
          // } else if (value.id == 'tencent') {
          //   currentProvider = value as UniLocationTencentProvider
          // }
          this.providerList.push({
            name: currentProvider.description,
            id: currentProvider.id,
            provider: currentProvider
          } as LocationItem);
        })

        this.providerList.forEach((value, index) => {
          if (value.id == "system") {
            this.currentProvider = index
          }
        })

      },
      altitudeChange: function (e : UniSwitchChangeEvent) {
        this.altitudeSelect = e.detail.value
      },
      geocodeChange: function (e : UniSwitchChangeEvent) {
        this.geocodeSelect = e.detail.value
      },
      highAccuracySelectChange: function (e : UniSwitchChangeEvent) {
        this.isHighAccuracySelect = e.detail.value
      },
      radioChange(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.items.length; i++) {
          if (this.items[i].value === e.detail.value) {
            this.current = i;
            break;
          }
        }
      },
      radioChangePV(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.providerList.length; i++) {
          if (this.providerList[i].id === e.detail.value) {
            this.currentProvider = i;
            break;
          }
        }
        if (e.detail.value == "system") {
          this.current = 0
        } else if (e.detail.value == "tencent") {
          this.current = 1
        }
      },
      getLocationTap: function () {

        if (this.providerList.length == 0) {
          uni.showToast({
            title: '未获取到provider，请确定基座中包含location功能',
            icon: "error"
          })
          console.log("未获取到provider，请确定基座中包含location功能")
          return
        }

        uni.showLoading({
          title: '定位中'
        })
        uni.getLocation(({

          provider: this.providerList[this.currentProvider].id,

          type: this.items[this.current].value,
          altitude: this.altitudeSelect,
          isHighAccuracy: this.isHighAccuracySelect,
          geocode: this.geocodeSelect,
          success: (res : any) => {
            uni.hideLoading()
            this.exeRet = JSON.stringify(res)
          },
          fail: (res : any) => {
            uni.hideLoading()
            this.exeRet = JSON.stringify(res)
          },
          complete: (res : any) => {
            uni.hideLoading()
            this.exeRet = JSON.stringify(res)
          }
        }));
      },

      // 仅用于自动化测试
      jestGetLocation() {
        this.jest_complete = false
        this.jest_errCode = 0
        uni.getLocation(({

          provider: this.jest_provider,

          type: this.jest_type,
          altitude: this.jest_isAltitude,
          isHighAccuracy: this.jest_isHighAccuracy,
          geocode: this.jest_isGeocode,
          success: (res) => {
            if (res.address != null) {
              this.jest_address = res.address!
            }
            this.jest_longitude = res.longitude
            this.jest_latitude = res.latitude
            this.jest_altitude = res.altitude
            this.jest_complete = true
          },
          fail: (err) => {
            this.jest_errCode = err.errCode
            this.jest_complete = true
          }
        }));
      }
    }
  })

export default __sfc__
function GenPagesAPIGetLocationGetLocationRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_switch = resolveComponent("switch")

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({
      style: _nS(_uM({"padding":"4px"}))
    }), [
      _cE("text", _uM({ class: "hello-text" }), " 定位功能默认调用操作系统定位API实现。也支持三方SDK定位\n 部分老款Android手机因gms问题可能导致无法使用系统定位。\n Web、Android、iOS平台，gcj国标、逆地理信息等功能需调用腾讯定位。")
    ], 4 /* STYLE */),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-list-cell-db" }), "定位服务商provider(如系统定位，腾讯定位等)"),
      _cE("view", _uM({
        class: "uni-list",
        style: _nS(_uM({"margin-bottom":"20px"}))
      }), [
        _cV(_component_radio_group, _uM({ onChange: _ctx.radioChangePV }), _uM({
          default: withSlotCtx((): any[] => [
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.providerList, (item, index, __index, _cached): any => {
              return _cV(_component_radio, _uM({
                class: _nC(["uni-list-cell uni-list-cell-pd", index < _ctx.providerList.length - 1 ? 'uni-list-cell-line' : '']),
                key: item.id,
                value: item.id,
                checked: index === _ctx.currentProvider
              }), _uM({
                default: withSlotCtx((): any[] => [_tD(item.name)]),
                _: 2 /* DYNAMIC */
              }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "checked"])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        }), 8 /* PROPS */, ["onChange"])
      ], 4 /* STYLE */),
      _cE("view", _uM({ class: "uni-list-cell-db" }), "定位类型"),
      _cE("view", _uM({ class: "uni-list" }), [
        _cV(_component_radio_group, _uM({ onChange: _ctx.radioChange }), _uM({
          default: withSlotCtx((): any[] => [
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
              return _cV(_component_radio, _uM({
                class: _nC(["uni-list-cell uni-list-cell-pd", index < _ctx.items.length - 1 ? 'uni-list-cell-line' : '']),
                key: item.value,
                value: item.value,
                checked: index === _ctx.current
              }), _uM({
                default: withSlotCtx((): any[] => [_tD(item.name)]),
                _: 2 /* DYNAMIC */
              }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "checked"])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        }), 8 /* PROPS */, ["onChange"])
      ]),
      _cE("view", _uM({
        class: "uni-list-cell uni-list-cell-pd",
        style: _nS(_uM({"margin-top":"20px"}))
      }), [
        _cE("view", _uM({ class: "uni-list-cell-db" }), "高度信息"),
        _cV(_component_switch, _uM({
          checked: _ctx.altitudeSelect,
          onChange: _ctx.altitudeChange
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ], 4 /* STYLE */),
      _cE("view", _uM({ class: "uni-list-cell uni-list-cell-pd" }), [
        _cE("view", _uM({ class: "uni-list-cell-db" }), "开启高精度定位"),
        _cV(_component_switch, _uM({
          checked: _ctx.isHighAccuracySelect,
          onChange: _ctx.highAccuracySelectChange
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      _cE("view", _uM({ class: "uni-list-cell uni-list-cell-pd" }), [
        _cE("view", _uM({ class: "uni-list-cell-db" }), "是否解析地址信息"),
        _cV(_component_switch, _uM({
          checked: _ctx.geocodeSelect,
          onChange: _ctx.geocodeChange
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      _cE("view", _uM({ class: "get-location-result" }), _tD(_ctx.exeRet), 1 /* TEXT */),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          class: "uni-btn",
          type: "default",
          onClick: _ctx.getLocationTap
        }), " 获取定位 ", 8 /* PROPS */, ["onClick"])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIGetLocationGetLocationStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
