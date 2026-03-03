
  import { ItemType } from '@/components/enum-data/enum-data-types';
  const __sfc__ = defineComponent({
    data() {
      return {
        orientation_enum: [{ "value": 0, "name": "auto" }, { "value": 1, "name": "landscape" }, { "value": 2, "name": "landscape-primary" }, { "value": 3, "name": "landscape-secondary" }, { "value": 4, "name": "portrait" }] as ItemType[],
        navigationUI_enum: [{ "value": 0, "name": "auto" }, { "value": 1, "name": "hide" }, { "value": 2, "name": "show" }] as ItemType[],
        text: "点击进入全屏",
        fullscreenElement: null as UniElement | null,
        isFullscreen: false,
        orientation: "landscape",
        navigationUI: "hide",
        fullscreenchangeCount: 0
      }
    },
    onReady() {
      this.fullscreenElement = uni.getElementById('fullscreen') as UniElement
    },
    methods: {
      getCurrentPage() : UniPage {
        const pages = getCurrentPages()
        return pages[pages.length - 1]
      },
      fullscreen() {
        if (this.isFullscreen) {
          const page = this.getCurrentPage()
          page.exitFullscreen({
            success: () => {
              this.text = "点击进入全屏"
            },
            fail: (err) => {
              console.log('fail', err, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:42")
            },
            complete: () => {
              console.log('complete', " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:45")
            }
          })
        } else {
          this.fullscreenElement?.requestFullscreen({
            navigationUI: this.navigationUI,
            orientation: this.orientation,
            success: () => {
              this.text = "点击退出全屏"
            },
            fail: (err) => {
              console.log('fail', err, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:56")
            },
            complete: () => {
              console.log('complete', " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:59")
            }
          })
        }

        this.isFullscreen = !this.isFullscreen
      },
      fullscreenchange(e : UniEvent) {
        console.log(e.type, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:67")
        this.fullscreenchangeCount++
        console.log(this.fullscreenchangeCount, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:69")
      },
      fullscreenerror(e : UniEvent) {
        console.log(e.type, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:72")
      },
      radio_change_orientation(checked : number) {
        console.log(checked, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:75")
        this.orientation = this.orientation_enum[checked]['name'] as string
      },
      radio_change_ui(checked : number) {
        console.log(checked, " at pages/API/element-request-fullscreen/element-request-fullscreen.uvue:79")
        this.navigationUI = this.navigationUI_enum[checked]['name'] as string
      }
    }
  })

export default __sfc__
function GenPagesAPIElementRequestFullscreenElementRequestFullscreenRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_enum_data = resolveEasyComponent("enum-data",_easycom_enum_data)

  return _cE("scroll-view", _uM({
    class: "content",
    direction: "vertical"
  }), [
    _cE("view", _uM({
      id: "fullscreen",
      class: "view1",
      onClick: _ctx.fullscreen,
      onFullscreenchange: _ctx.fullscreenchange,
      onFullscreenerror: _ctx.fullscreenerror
    }), [
      _cE("text", _uM({
        style: _nS(_uM({"color":"white"}))
      }), _tD(_ctx.text), 5 /* TEXT, STYLE */)
    ], 40 /* PROPS, NEED_HYDRATION */, ["onClick", "onFullscreenchange", "onFullscreenerror"]),
    _cV(_component_enum_data, _uM({
      items: _ctx.orientation_enum,
      title: "orientation",
      onChange: _ctx.radio_change_orientation
    }), null, 8 /* PROPS */, ["items", "onChange"]),
    _cV(_component_enum_data, _uM({
      items: _ctx.navigationUI_enum,
      title: "navigationUI",
      onChange: _ctx.radio_change_ui
    }), null, 8 /* PROPS */, ["items", "onChange"])
  ])
}
const GenPagesAPIElementRequestFullscreenElementRequestFullscreenStyles = [_uM([["content", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["backgroundColor", "#f0f0f0"]]))], ["view1", _pS(_uM([["width", "100%"], ["height", 150], ["alignItems", "center"], ["justifyContent", "center"], ["backgroundColor", "#000000"]]))]])]

import _easycom_enum_data from '@/components/enum-data/enum-data.vue'
