import _easycom_page_head from '@/components/page-head/page-head.vue'
type VideoFormat = {
    format : string
    src : string
  }
  
const __sfc__ = defineComponent({
  __name: 'video-format',
  setup(__props, __setupCtx: SetupContext) {
const __expose = __setupCtx.expose
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  let supportFormats = ref([
    // TODO web本地运行时本地服务返回的content-type不对，导致本地视频无法播放。此外web端原生video不支持flv、m3u8、avi格式，但是和app端相比多了ogg格式的支持
    {
      format: 'mp4',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mp4'
    },
    {
      format: 'm4v',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.m4v'
    },
    {
      format: 'mov',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.mov'
    },

    {
      format: 'webm（iOS、Safari、鸿蒙不支持）',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.webm'
    },

    {
      format: '3gp',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.3gp'
    },

    {
      format: 'flv',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.flv'
    },


    {
      format: 'm3u8',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.m3u8'
    },


    {
      format: '本地m3u8',
      src: '/static/test-video/2minute-demo.m3u8'
    },

    {
      format: '错误路径',
      src: 'https://www.dcloud.net.cn/errorpath.mp4'
    },
  ] as Array<VideoFormat>)

  let notSupportFormats = ref([

    {
      format: 'ogg',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.ogg'
    },


    {
      format: 'avi',
      src: 'https://qiniu-web-assets.dcloud.net.cn/video/sample/2minute-demo.avi'
    }

  ] as Array<VideoFormat>)

  // 自动化测试
  const isError = reactive({ value: false })

  const onError = (format : string, e : UniVideoErrorEvent) => {
    console.log(format + ":" + JSON.stringify(e));
    if (format != "错误路径") {
      isError['value'] = true;
    }
  }

  onReady(() => {
    // const v = uni.createVideoContext("video-mp4",getCurrentInstance()!.proxy!)
    // v?.play()
  })

  __expose({ isError })

return (): any | null => {

const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({ class: "page-scroll-view" }), [
    _cV(_component_page_head, _uM({ title: "video-format" })),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "支持的视频格式示例")
      ]),
      _cE(Fragment, null, RenderHelpers.renderList(unref(supportFormats), (item, index, __index, _cached): any => {
        return _cE("view", _uM({ key: index }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), _tD(item.format), 1 /* TEXT */),
          _cE("video", _uM({
            id: 'video-' + item.format,
            class: "video",
            src: item.src,
            controls: true,
            direction: -90,
            onError: ($event: any) => {onError(item.format, $event as UniVideoErrorEvent)}
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["id", "src", "onError"])
        ])
      }), 128 /* KEYED_FRAGMENT */),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "暂不支持的格式")
      ]),
      _cE(Fragment, null, RenderHelpers.renderList(unref(notSupportFormats), (item, index, __index, _cached): any => {
        return _cE("view", _uM({ key: index }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), _tD(item.format), 1 /* TEXT */),
          _cE("video", _uM({
            id: 'video-' + item.format,
            ref_for: true,
            ref: 'videoRef-' + item.format,
            class: "video",
            src: item.src,
            controls: true,
            direction: -90
          }), null, 8 /* PROPS */, ["id", "src"])
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ])
  ])
}
}

})
export default __sfc__
const GenPagesComponentVideoVideoFormatStyles = [_uM([["video", _pS(_uM([["height", 200]]))]])]
