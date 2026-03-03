
  type Icon = { __$originalPosition?: UTSSourceMapPosition<"Icon", "pages/CSS/text/font-family-icon.uvue", 20, 8>;
    name : string,
    code : string,
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        uniIcons: [ //图标数据
          {
            'name':'back',
            'code':'E601',
          },
          {
            'name':'forward',
            'code':'E600',
          },
          {
            'name':'share',
            'code':'E602',
          },
          {
            'name':'favorites',
            'code':'E604',
          },
          {
            'name':'home',
            'code':'E605',
          },
          {
            'name':'more',
            'code':'E606',
          },
          {
            'name':'close',
            'code':'E650',
          },
          {
            'name':'down',
            'code':'E661',
          },
          {
            'name':'circle',
            'code':'EA01',
          },
          {
            'name':'warn',
            'code':'EA0F',
          },
          {
            'name':'info',
            'code':'EA03',
          },
          {
            'name':'info circle',
            'code':'EA04',
          },
          {
            'name':'success',
            'code':'EA06',
          },
          {
            'name':'success circle',
            'code':'EA07',
          },
          {
            'name':'success no circle',
            'code':'EA08',
          },
          {
            'name':'cancel circle',
            'code':'EA0B',
          },
          {
            'name':'clear',
            'code':'EA14',
          },
          {
            'name':'download',
            'code':'EA19',
          },
          {
            'name':'waitnig',
            'code':'EA1E',
          },
          {
            'name':'search',
            'code':'EA23',
          }
        ] as Icon[],
        // 自动化测试
        fontWeight: 'normal',
        fontStyle: 'normal'
      }
    },
    methods: {
      // 自动化测试
      changeStyle() {
        this.fontWeight = 'bold';
        this.fontStyle = 'italic';
      }
    }
  })

export default __sfc__
function GenPagesCSSTextFontFamilyIconRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", _uM({
      style: _nS(_uM({"align-items":"center","align-self":"center"}))
    }), [
      _cE("view", _uM({ class: "iconContainer" }), [
        _cE(Fragment, null, RenderHelpers.renderList(_ctx.uniIcons, (item, __key, __index, _cached): any => {
          return _cE("view", _uM({ class: "iconItem" }), [
            _cE("text", _uM({
              class: "icon",
              style: _nS(_uM({'font-weight': _ctx.fontWeight, 'font-style': _ctx.fontStyle}))
            }), _tD(String.fromCharCode(parseInt(item.code,16))), 5 /* TEXT, STYLE */),
            _cE("text", _uM({ class: "code" }), "\\u" + _tD(item.code), 1 /* TEXT */),
            _cE("text", _uM({ class: "name" }), _tD(item.name), 1 /* TEXT */)
          ])
        }), 256 /* UNKEYED_FRAGMENT */)
      ])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSTextFontFamilyIconStyles = [_uM([["iconContainer", _pS(_uM([["flexDirection", "row"], ["flexWrap", "wrap"], ["justifyContent", "center"]]))], ["iconItem", _pS(_uM([["width", 100], ["height", 150], ["justifyContent", "center"], ["alignItems", "center"]]))], ["icon", _pS(_uM([["width", 48], ["height", 48], ["fontFamily", "uni-icon"], ["fontSize", 42], ["lineHeight", "48px"], ["color", "#333333"], ["marginBottom", 8]]))], ["code", _pS(_uM([["fontSize", 14], ["color", "#ff0000"]]))], ["name", _pS(_uM([["fontSize", 12], ["color", "#000000"]]))]])]
