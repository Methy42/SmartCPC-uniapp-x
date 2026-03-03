
  const __sfc__ = defineComponent({
    data() {
      return {
        title: "getImageInfo",
        relativeImagePath: "/static/test-image/logo.png",
        relativeImageInfo: "",
        absoluteImagePath: "",
        absoluteImageInfo: "",
        remoteImagePath: "https://request.dcloud.net.cn/api/http/contentType/image/png",
        remoteImageInfo: "",
        // 自动化测试
        imageInfoForTest: null as UTSJSONObject | null,
      }
    },
    methods: {
      chooseImage() {
        uni.chooseImage({
          count: 1,
          success: (res) => {
            this.absoluteImagePath = res.tempFilePaths[0];
            uni.getImageInfo({
              src: res.tempFilePaths[0],
              success: (_res) => {
                console.log("getImageInfo success", JSON.stringify(_res), " at pages/API/get-image-info/get-image-info.uvue:55");
                this.relativeImageInfo = `图片宽度: ${_res.width}\n图片高度: ${_res.height}\n图片路径: ${_res.path}\n图片方向: ${_res.orientation}\n图片格式: ${_res.type}`;
              },
              fail: (err) => {
                uni.showModal({
                  title: "获取图片信息失败",
                  content: JSON.stringify(err),
                  showCancel: false
                });
              }
            });
          }
        });
      }
    },
    onReady() {
      uni.getImageInfo({
        src: this.relativeImagePath,
        success: (res) => {
          console.log("getImageInfo success", JSON.stringify(res), " at pages/API/get-image-info/get-image-info.uvue:74");
          this.absoluteImageInfo = `图片宽度: ${res.width}\n图片高度: ${res.height}\n图片路径: ${res.path}\n图片方向: ${res.orientation}\n图片格式: ${res.type}`;
          this.imageInfoForTest = {
            "width": res.width,
            "height": res.height,
            "path": res.path.slice(res.path.indexOf('static/') + 'static/'.length),
            "orientation": res.orientation,
            "type": res.type
          };
        },
        fail: (err) => {
          uni.showModal({
            title: "获取图片信息失败",
            content: JSON.stringify(err),
            showCancel: false
          });
          this.imageInfoForTest = null;
        }
      });
      uni.getImageInfo({
        src: this.remoteImagePath,
        success: (res) => {
          console.log("getImageInfo success", JSON.stringify(res), " at pages/API/get-image-info/get-image-info.uvue:96");
          this.remoteImageInfo = `图片宽度: ${res.width}\n图片高度: ${res.height}\n图片路径: ${res.path}\n图片方向: ${res.orientation}\n图片格式: ${res.type}`;
        },
        fail: (err) => {
          uni.showModal({
            title: "获取图片信息失败",
            content: JSON.stringify(err),
            showCancel: false
          });
        }
      });
    }
  })

export default __sfc__
function GenPagesAPIGetImageInfoGetImageInfoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-subtitle-text" }), "获取本地相对路径图片信息")
      ]),
      _cE("image", _uM({
        class: "image",
        src: _ctx.relativeImagePath,
        mode: "aspectFit"
      }), null, 8 /* PROPS */, ["src"]),
      _cE("text", _uM({ class: "margin-top-10" }), _tD(_ctx.absoluteImageInfo), 1 /* TEXT */),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-subtitle-text" }), "获取网络路径图片信息")
      ]),
      _cE("image", _uM({
        class: "image",
        src: _ctx.remoteImagePath,
        mode: "aspectFit"
      }), null, 8 /* PROPS */, ["src"]),
      _cE("text", _uM({ class: "margin-top-10" }), _tD(_ctx.remoteImageInfo), 1 /* TEXT */),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-subtitle-text" }), "获取本地绝对路径图片信息")
      ]),
      _cE("image", _uM({
        class: "image",
        src: _ctx.absoluteImagePath,
        mode: "aspectFit"
      }), null, 8 /* PROPS */, ["src"]),
      _cE("text", _uM({ class: "margin-top-10" }), _tD(_ctx.relativeImageInfo), 1 /* TEXT */),
      _cE("view", _uM({ class: "uni-btn-v" }), [
        _cE("button", _uM({
          type: "primary",
          onClick: _ctx.chooseImage
        }), "拍摄照片或从相册中选择照片", 8 /* PROPS */, ["onClick"])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIGetImageInfoGetImageInfoStyles = [_uM([["image", _pS(_uM([["alignSelf", "center"]]))], ["margin-top-10", _pS(_uM([["marginTop", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
