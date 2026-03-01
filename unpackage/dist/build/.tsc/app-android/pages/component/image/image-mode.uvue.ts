
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'image-mode',
        data: [
          {
            mode: 'scaleToFill',
            description: '不保持纵横比缩放图片，使图片的宽高完全拉伸至填满 image 元素'
          },
          {
            mode: 'aspectFit',
            description: '保持纵横比缩放图片，使图片的长边能完全显示出来。也就是说，可以完整地将图片显示出来'
          },
          {
            mode: 'aspectFill',
            description: '保持纵横比缩放图片，只保证图片的短边能完全显示出来。也就是说，图片通常只在水平或垂直方向是完整的，另一个方向将会发生截取'
          },
          {
            mode: 'top',
            description: '不缩放图片，只显示图片的顶部区域'
          },
          {
            mode: 'bottom',
            description: '不缩放图片，只显示图片的底部区域'
          },
          {
            mode: 'center',
            description: '不缩放图片，只显示图片的中间区域'
          },
          {
            mode: 'left',
            description: '不缩放图片，只显示图片的左边区域'
          },
          {
            mode: 'right',
            description: '不缩放图片，只显示图片的右边区域'
          },
          {
            mode: 'top left',
            description: '不缩放图片，只显示图片的左上边区域'
          },
          {
            mode: 'top right',
            description: '不缩放图片，只显示图片的右上边区域'
          },
          {
            mode: 'bottom left',
            description: '不缩放图片，只显示图片的左下边区域'
          },
          {
            mode: 'bottom right',
            description: '不缩放图片，只显示图片的右下边区域'
          },
          {
            mode: 'widthFix',
            description: '宽度不变，高度自动变化，保持原图宽高比不变'
          },
          {
            mode: 'heightFix',
            description: '高度不变，宽度自动变化，保持原图宽高比不变'
          }
        ] as Array<ImageMode>
      }
    }
  })

  type ImageMode = {
    mode : string
    description : string
  }

export default __sfc__
function GenPagesComponentImageImageModeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "支持的图片缩放模式示例")
      ]),
      _cE(Fragment, null, RenderHelpers.renderList(_ctx.data, (item, index, __index, _cached): any => {
        return _cE("view", _uM({ key: index }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), _tD(item.mode) + ": " + _tD(item.description), 1 /* TEXT */),
          _cE("view", _uM({
            class: "uni-center",
            style: _nS(_uM({"background":"#FFFFFF"}))
          }), [
            _cE("image", _uM({
              class: "image",
              mode: item.mode,
              src: "/static/shuijiao.jpg"
            }), null, 8 /* PROPS */, ["mode"])
          ], 4 /* STYLE */)
        ])
      }), 128 /* KEYED_FRAGMENT */),
      _cE("view", _uM({ class: "uni-title" }), [
        _cE("text", _uM({ class: "uni-title-text" }), "其他示例")
      ]),
      _cE("view", null, [
        _cE("text", _uM({ class: "uni-subtitle-text" }), "同时设置mode和圆角"),
        _cE("view", _uM({
          class: "uni-center",
          style: _nS(_uM({"background":"#FFFFFF"}))
        }), [
          _cE("image", _uM({
            class: "image radius",
            mode: "heightFix",
            src: "/static/shuijiao.jpg"
          }))
        ], 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", _uM({ class: "uni-subtitle-text" }), "设置图片width='100%'与mode='widthFix'"),
        _cE("view", _uM({
          class: "uni-center",
          style: _nS(_uM({"background":"#FFFFFF"}))
        }), [
          _cE("view", _uM({
            class: "uni-center",
            style: _nS(_uM({"background-color":"red","width":"150px","margin":"20px"}))
          }), [
            _cE("image", _uM({
              style: _nS(_uM({"width":"100%"})),
              mode: "widthFix",
              src: "/static/shuijiao.jpg"
            }), null, 4 /* STYLE */)
          ], 4 /* STYLE */)
        ], 4 /* STYLE */)
      ]),
      _cE("view", null, [
        _cE("text", _uM({ class: "uni-subtitle-text" }), "image默认mode"),
        _cE("view", _uM({
          class: "uni-center",
          style: _nS(_uM({"background":"#FFFFFF"}))
        }), [
          _cE("view", _uM({
            class: "uni-center",
            style: _nS(_uM({"margin":"20px"}))
          }), [
            _cE("image", _uM({
              style: _nS(_uM({"width":"100px","height":"100px"})),
              src: "/static/logo.png"
            }), null, 4 /* STYLE */)
          ], 4 /* STYLE */)
        ], 4 /* STYLE */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentImageImageModeStyles = [_uM([["image", _pS(_uM([["marginTop", 20], ["marginRight", "auto"], ["marginBottom", 20], ["marginLeft", "auto"], ["width", 100], ["height", 100], ["backgroundColor", "#eeeeee"]]))], ["radius", _pS(_uM([["borderTopLeftRadius", 10], ["borderTopRightRadius", 10], ["borderBottomRightRadius", 10], ["borderBottomLeftRadius", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
