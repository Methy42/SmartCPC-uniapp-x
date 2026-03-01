
  const __sfc__ = defineComponent({
    data() {
      return {
        uniIcon1: '\ue100',
        uniIcon2: '\ue101',
      }
    }
  })

export default __sfc__
function GenPagesAPILoadFontFaceLoadFontFaceChildRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: "loadFontFace-child" })),
    _cE("view", _uM({ class: "uni-padding-wrap" }), [
      _cE("text", _uM({ class: "font-size-20" }), "上一页全局加载字体："),
      _cE("text", _uM({
        class: "font-size-20 line-height-40",
        style: _nS(_uM({"font-family":"UniFontFamily"}))
      }), "font-family: uni.ttf", 4 /* STYLE */),
      _cE("view", _uM({
        style: _nS(_uM({"flex-direction":"row"}))
      }), [
        _cE("text", _uM({
          style: _nS(_uM({"font-family":"UniFontFamily","font-size":"20px"}))
        }), _tD(_ctx.uniIcon1), 5 /* TEXT, STYLE */),
        _cE("text", _uM({
          style: _nS(_uM({"margin-left":"5px","margin-right":"20px","line-height":"22px"}))
        }), "\\ue100", 4 /* STYLE */),
        _cE("text", _uM({
          style: _nS(_uM({"font-family":"UniFontFamily","font-size":"20px"}))
        }), _tD(_ctx.uniIcon2), 5 /* TEXT, STYLE */),
        _cE("text", _uM({
          style: _nS(_uM({"margin-left":"5px","line-height":"22px"}))
        }), "\\ue101", 4 /* STYLE */)
      ], 4 /* STYLE */),
      _cE("text", _uM({ class: "uni-common-mt font-size-20" }), "上一页非全局加载字体（不生效为正常）："),
      _cE("text", _uM({
        class: "font-size-20 line-height-40",
        style: _nS(_uM({"font-family":"AlimamaDaoLiTiTTF"}))
      }), "font-family: 阿里妈妈刀隶体-ttf", 4 /* STYLE */),
      _cE("text", _uM({
        class: "font-size-20 line-height-40",
        style: _nS(_uM({"font-family":"AlimamaDaoLiTiOTF"}))
      }), "font-family: 阿里妈妈刀隶体-otf", 4 /* STYLE */)
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPILoadFontFaceLoadFontFaceChildStyles = [_uM([["font-size-20", _pS(_uM([["fontSize", 20]]))], ["line-height-40", _pS(_uM([["lineHeight", "40px"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
