
  const __sfc__ = defineComponent({
    data() {
      return {

      }
    },
    methods: {

    }
  })

export default __sfc__
function GenPagesCSSOverflowOverflowRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("text", _uM({
      style: _nS(_uM({"font-size":"15px"}))
    }), "overflow=hidden效果子元素是view border圆角", 4 /* STYLE */),
    _cE("view", _uM({ class: "backgroundview" }), [
      _cE("view", _uM({ class: "box-hidden-border-radius" }), [
        _cE("view", _uM({
          style: _nS(_uM({"width":"50px","height":"150px","background-color":"greenyellow"}))
        }), null, 4 /* STYLE */)
      ])
    ]),
    _cE("text", _uM({
      style: _nS(_uM({"font-size":"15px"}))
    }), "overflow=hidden效果 子元素是view border边框", 4 /* STYLE */),
    _cE("view", _uM({ class: "backgroundview" }), [
      _cE("view", _uM({ class: "box-hidden-border-width" }), [
        _cE("view", _uM({
          style: _nS(_uM({"width":"50px","height":"150px","background-color":"greenyellow"}))
        }), null, 4 /* STYLE */)
      ])
    ]),
    _cE("text", _uM({
      style: _nS(_uM({"font-size":"15px"}))
    }), "overflow=visible效果 子元素是view border圆角", 4 /* STYLE */),
    _cE("view", _uM({ class: "backgroundview" }), [
      _cE("view", _uM({ class: "box-visible-border-radius" }), [
        _cE("view", _uM({
          style: _nS(_uM({"width":"50px","height":"150px","background-color":"greenyellow"}))
        }), null, 4 /* STYLE */)
      ])
    ]),
    _cE("text", _uM({
      style: _nS(_uM({"font-size":"15px"}))
    }), "overflow=visible效果 子元素是view border边框", 4 /* STYLE */),
    _cE("view", _uM({ class: "backgroundview" }), [
      _cE("view", _uM({ class: "box-visible-border-width" }), [
        _cE("view", _uM({
          style: _nS(_uM({"width":"50px","height":"150px","background-color":"greenyellow"}))
        }), null, 4 /* STYLE */)
      ])
    ]),
    _cE("view", _uM({
      style: _nS(_uM({"flex-grow":"1"}))
    }), [
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"15px"}))
      }), "overflow=hidden效果 子元素是text", 4 /* STYLE */),
      _cE("view", _uM({ class: "backgroundview" }), [
        _cE("view", _uM({ class: "box-hidden-border-radius" }), [
          _cE("text", _uM({ class: "text1" }), "ABCDEFG")
        ])
      ]),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"15px"}))
      }), "overflow=visible效果 子元素是text", 4 /* STYLE */),
      _cE("view", _uM({ class: "backgroundview" }), [
        _cE("view", _uM({ class: "box-visible-border-radius" }), [
          _cE("text", _uM({ class: "text1" }), "ABCDEFG")
        ])
      ]),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"15px"}))
      }), "overflow=hidden效果 子元素是image", 4 /* STYLE */),
      _cE("view", _uM({ class: "backgroundview" }), [
        _cE("view", _uM({ class: "box-hidden-border-radius" }), [
          _cE("image", _uM({
            style: _nS(_uM({"width":"150px","height":"150px"})),
            src: "/static/uni.png"
          }), null, 4 /* STYLE */)
        ])
      ]),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"15px"}))
      }), "overflow=visible效果 子元素是image", 4 /* STYLE */),
      _cE("view", _uM({ class: "backgroundview" }), [
        _cE("view", _uM({ class: "box-visible-border-radius" }), [
          _cE("image", _uM({
            style: _nS(_uM({"width":"150px","height":"150px"})),
            src: "/static/uni.png"
          }), null, 4 /* STYLE */)
        ])
      ]),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"15px"}))
      }), "overflow=visible效果 子元素是view 父是scroll-view", 4 /* STYLE */),
      _cE("scroll-view", _uM({ class: "backgroundview" }), [
        _cE("view", _uM({ class: "box-visible-border-radius" }), [
          _cE("view", _uM({
            style: _nS(_uM({"width":"50px","height":"150px","background-color":"greenyellow"}))
          }), null, 4 /* STYLE */)
        ])
      ]),
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"15px"}))
      }), "overflow=visible 设置阴影显示文字", 4 /* STYLE */),
      _cE("view", _uM({ class: "backgroundview" }), [
        _cE("view", _uM({
          class: "",
          style: _nS(_uM({"overflow":"visible","width":"100px","height":"100px","background-color":"green","box-shadow":"10px 10px #000","margin-top":"10px"}))
        }), [
          _cE("text", _uM({
            style: _nS(_uM({"width":"170px","background-color":"greenyellow"}))
          }), "文字文字文字文字文字", 4 /* STYLE */)
        ], 4 /* STYLE */)
      ])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSOverflowOverflowStyles = [_uM([["backgroundview", _pS(_uM([["width", 300], ["height", 300], ["marginBottom", 20], ["backgroundColor", "#FFFFFF"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["box-hidden-border-radius", _pS(_uM([["width", 100], ["height", 100], ["borderTopLeftRadius", 20], ["borderTopRightRadius", 20], ["borderBottomRightRadius", 20], ["borderBottomLeftRadius", 20], ["overflow", "hidden"], ["backgroundColor", "#008000"]]))], ["box-hidden-border-width", _pS(_uM([["width", 100], ["height", 100], ["borderTopWidth", 2], ["borderRightWidth", 2], ["borderBottomWidth", 2], ["borderLeftWidth", 2], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["backgroundColor", "#008000"]]))], ["box-visible-border-radius", _pS(_uM([["width", 100], ["height", 100], ["borderTopLeftRadius", 20], ["borderTopRightRadius", 20], ["borderBottomRightRadius", 20], ["borderBottomLeftRadius", 20], ["overflow", "visible"], ["backgroundColor", "#008000"]]))], ["box-visible-border-width", _pS(_uM([["width", 100], ["height", 100], ["borderTopWidth", 2], ["borderRightWidth", 2], ["borderBottomWidth", 2], ["borderLeftWidth", 2], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["overflow", "visible"], ["backgroundColor", "#008000"]]))], ["text1", _pS(_uM([["fontSize", 50], ["lines", 1]]))]])]
