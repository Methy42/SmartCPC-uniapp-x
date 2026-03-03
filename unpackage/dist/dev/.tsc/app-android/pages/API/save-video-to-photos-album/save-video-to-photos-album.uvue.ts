
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'saveVideoToPhotosAlbum',
        src: '/static/test-video/10second-demo.mp4',
        // 自动化测试
        success: false
      }
    },
    methods: {
      saveVideo() {
        uni.saveVideoToPhotosAlbum({
          filePath: this.src,
          success: (_) => {
            console.log("saveVideoToPhotosAlbum success", " at pages/API/save-video-to-photos-album/save-video-to-photos-album.uvue:30");
            uni.showToast({
              position: "center",
              icon: "none",
              title: "视频保存成功，请到手机相册查看"
            });
            this.success = true;
          },
          fail: (err) => {
            uni.showModal({
              title: "保存视频到相册失败",
              content: JSON.stringify(err),
              showCancel: false
            });
            this.success = false;
          }
        });
      }
    }
  })

export default __sfc__
function GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbumRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("video", _uM({
        class: "video",
        src: _ctx.src,
        controls: true
      }), null, 8 /* PROPS */, ["src"]),
      _cE("button", _uM({
        type: "primary",
        class: "margin-top-10",
        onClick: _ctx.saveVideo
      }), "将视频保存到手机相册", 8 /* PROPS */, ["onClick"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbumStyles = [_uM([["video", _pS(_uM([["alignSelf", "center"]]))], ["margin-top-10", _pS(_uM([["marginTop", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
