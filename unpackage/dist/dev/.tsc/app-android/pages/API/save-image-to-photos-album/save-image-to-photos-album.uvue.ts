
  const __sfc__ = defineComponent({
    data() {
      return {
        title: "saveImageToPhotosAlbum",
        // 自动化测试
        success: false
      }
    },
    methods: {
      saveImage() {
        uni.saveImageToPhotosAlbum({
          filePath: "/static/uni.png",
          success: (res) => {
            console.log("saveImageToPhotosAlbum success", JSON.stringify(res), " at pages/API/save-image-to-photos-album/save-image-to-photos-album.uvue:29");
            uni.showToast({
              position: "center",
              icon: "none",
              title: "图片保存成功，请到手机相册查看"
            });
            this.success = true;
          },
          fail: (err) => {
            uni.showModal({
              title: "保存图片到相册失败",
              content: JSON.stringify(err),
              showCancel: false
            });
            this.success = false;
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbumRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("image", _uM({
        class: "image",
        src: "/static/uni.png"
      })),
      _cE("button", _uM({
        class: "margin-top-10",
        type: "primary",
        onClick: _ctx.saveImage
      }), "将图片保存到手机相册", 8 /* PROPS */, ["onClick"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbumStyles = [_uM([["margin-top-10", _pS(_uM([["marginTop", 10]]))], ["image", _pS(_uM([["width", 196], ["height", 196], ["alignSelf", "center"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
