
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'image',
        imageSrc: "/static/test-image/logo.png" as string.ImageURIString,
        loadError: false,
        // 自动化测试
        autoTest: false,
        setCookieImage: "",
        verifyCookieImage: "",
        eventLoad: null as UTSJSONObject | null,
        eventError: null as UTSJSONObject | null
      }
    },
    methods: {
      error(event : ImageErrorEvent) {
        this.loadError = true
        console.log(event.type, event.detail, " at pages/component/image/image.uvue:48");
        if (this.autoTest) {
          this.eventError = {
            "tagName": event.target?.tagName,
            "type": event.type,
            // "errMsg": event.detail.errMsg
          };
        }
      },
      load(event : ImageLoadEvent) {
        console.log(event.type, event.detail, " at pages/component/image/image.uvue:58");
        if (this.autoTest) {
          this.eventLoad = {
            "tagName": event.target?.tagName,
            "type": event.type,
            "width": event.detail.width,
            "height": event.detail.height
          };
        }
      },
      imageFormat() {
        uni.navigateTo({
          url: '/pages/component/image/image-format'
        });
      },
      imageMode() {
        uni.navigateTo({
          url: '/pages/component/image/image-mode'
        });
      },
      imagePath() {
        uni.navigateTo({
          url: '/pages/component/image/image-path'
        });
      },
      imageLarge() {
        uni.navigateTo({
          url: '/pages/component/image/image-large'
        });
      },
      imageLong() {
        uni.navigateTo({
          url: '/pages/component/image/image-long'
        });
      }
    }
  })

export default __sfc__
function GenPagesComponentImageImageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({
        class: "uni-center",
        style: _nS(_uM({"background":"#FFFFFF"}))
      }), [
        _cE("image", _uM({
          class: "image",
          "fade-show": true,
          mode: "widthFix",
          src: _ctx.imageSrc,
          onError: _ctx.error,
          onLoad: _ctx.load
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onError", "onLoad"])
      ], 4 /* STYLE */),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          type: "primary",
          onClick: _ctx.imageFormat
        }), "图片格式示例", 8 /* PROPS */, ["onClick"])
      ]),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          type: "primary",
          onClick: _ctx.imageMode
        }), "图片缩放模式示例", 8 /* PROPS */, ["onClick"])
      ]),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          type: "primary",
          onClick: _ctx.imagePath
        }), "图片路径示例", 8 /* PROPS */, ["onClick"])
      ]),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          type: "primary",
          onClick: _ctx.imageLarge
        }), "大图示例", 8 /* PROPS */, ["onClick"])
      ]),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          type: "primary",
          onClick: _ctx.imageLong
        }), "长图示例", 8 /* PROPS */, ["onClick"])
      ])
    ]),
    isTrue(_ctx.autoTest)
      ? _cE("view", _uM({ key: 0 }), [
          _cE("image", _uM({ src: _ctx.setCookieImage }), null, 8 /* PROPS */, ["src"]),
          _cE("image", _uM({
            src: _ctx.verifyCookieImage,
            onError: _ctx.error
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["src", "onError"])
        ])
      : _cC("v-if", true)
  ], 4 /* STYLE */)
}
const GenPagesComponentImageImageStyles = [_uM([["image", _pS(_uM([["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"], ["width", 100]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
