
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  type Location = {
    latitude: string[]
    longitude: string[]
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'chooseLocation',
        hasLocation: false,
        location: {
          latitude: [],
          longitude: []
        } as Location,
        locationName: '',
        locationAddress: '',
        dialogPagesNum: -1,
        hoverLocation: false,
        hoverKeyword: false,
        hoverPayload: false
      }
    },
    onShow() {
      console.log("Page Show");
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onHide() {
      console.log("Page Hide");
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum - 1)
    },
    methods: {
      chooseLocation: function () {
        let chooseLocationOptions = {
          success: (res) => {
            console.log('chooseLocation success', res)
            this.hasLocation = true
            this.location = this.formatLocation(res.longitude, res.latitude)
            this.locationName = res.name
            this.locationAddress = res.address
          }
        } as ChooseLocationOptions
        if (this.hoverLocation) {
          chooseLocationOptions.latitude = 39.908823
          chooseLocationOptions.longitude = 116.39747
        }
        if (this.hoverKeyword) {
          chooseLocationOptions.keyword = '公园'
        }

        if (this.hoverPayload) {
          chooseLocationOptions.payload = {
            token: 'xxx'
          }
        }

        uni.chooseLocation(chooseLocationOptions)
        // 自动化测试
        setTimeout(() => {
          this.test()
        }, 500)
      },
      formatLocation: function(longitude:number, latitude:number):Location {
        const longitudeArr = longitude.toString().split('.')
        const latitudeArr = latitude.toString().split('.')
        if(longitudeArr.length>1){
          longitudeArr[1] = longitudeArr[1].substring(0,2)
        }
        if(latitudeArr.length>1){
          latitudeArr[1] = latitudeArr[1].substring(0,2)
        }
        return {
          longitude: longitudeArr,
          latitude: latitudeArr
        }
      },
      clear: function () {
        this.hasLocation = false
      },
      changeLocationBoolean(checked : boolean) {
        this.hoverLocation = checked
      },
      changeKeywordBoolean(checked : boolean) {
        this.hoverKeyword = checked
      },
      changePayloadBoolean(checked : boolean) {
        this.hoverPayload = checked
      },





      // 自动化测试
      test() {
        const pages = getCurrentPages()
        const page = pages[pages.length - 1]

        const dialogPages = page.getDialogPages()
        this.dialogPagesNum = dialogPages.length

      },
      // 自动化测试
      setLifeCycleNum(value : number) {
        setLifeCycleNum(value)
      },
      // 自动化测试
      getLifeCycleNum() : number {
        return state.lifeCycleNum
      },
    }
  })

export default __sfc__
function GenPagesAPIChooseLocationChooseLocationRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)

  return _cE("view", null, [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("view", _uM({ class: "uni-column uni-container align-center" }), [
        _cE("text", _uM({ class: "uni-hello-text" }), "位置信息"),
        isTrue(!_ctx.hasLocation)
          ? _cE("text", _uM({
              key: 0,
              class: "uni-title-text uni-common-mt"
            }), "未选择位置")
          : _cC("v-if", true),
        isTrue(_ctx.hasLocation)
          ? _cE("view", _uM({
              key: 1,
              class: "align-center"
            }), [
              _cE("text", _uM({ class: "uni-common-mt" }), _tD(_ctx.locationName), 1 /* TEXT */),
              _cE("text", _uM({ class: "uni-common-mt" }), _tD(_ctx.locationAddress), 1 /* TEXT */),
              _ctx.location.latitude.length>1
                ? _cE("view", _uM({
                    key: 0,
                    class: "uni-common-mt"
                  }), [
                    _cE("text", null, "E: " + _tD(_ctx.location.longitude[0]) + "°" + _tD(_ctx.location.longitude[1]) + "′", 1 /* TEXT */),
                    _cE("text", null, "\nN: " + _tD(_ctx.location.latitude[0]) + "°" + _tD(_ctx.location.latitude[1]) + "′", 1 /* TEXT */)
                  ])
                : _cC("v-if", true)
            ])
          : _cC("v-if", true)
      ]),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("text", _uM({ class: "tips" }), "注意：\n1. Web和App需要正确配置地图服务商的Key并且保证Key的权限和余额足够，才能正常选择位置\n2. 若没有关联uniCloud空间，则只能全屏地图选点，不能根据POI选择位置\n3. payload参数会原样透传给uni-map-co，可用于用户鉴权"),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "是否指定位置为天安门",
          onChange: _ctx.changeLocationBoolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "是否携带keyword参数",
          onChange: _ctx.changeKeywordBoolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cV(_component_boolean_data, _uM({
          defaultValue: false,
          title: "是否携带payload参数",
          onChange: _ctx.changePayloadBoolean
        }), null, 8 /* PROPS */, ["onChange"]),
        _cE("button", _uM({
          class: "uni-btn",
          type: "primary",
          onClick: _ctx.chooseLocation
        }), "选择位置", 8 /* PROPS */, ["onClick"]),
        _cE("button", _uM({
          class: "uni-btn",
          onClick: _ctx.clear
        }), "清空", 8 /* PROPS */, ["onClick"])
      ])
    ])
  ])
}
const GenPagesAPIChooseLocationChooseLocationStyles = [_uM([["page-body-info", _pS(_uM([["paddingBottom", 0], ["height", 220]]))], ["align-center", _pS(_uM([["alignItems", "center"]]))], ["tips", _pS(_uM([["fontSize", 12], ["marginTop", 15], ["marginRight", 0], ["marginBottom", 15], ["marginLeft", 0], ["opacity", 0.8]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
