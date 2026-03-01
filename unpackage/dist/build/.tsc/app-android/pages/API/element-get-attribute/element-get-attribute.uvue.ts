
  import child from './child.uvue'
  type DomRectType = {
    x : number,
    y : number,
    left : number,
    top : number,
    right : number,
    bottom : number,
    width : number,
    height : number,
  }
  const __sfc__ = defineComponent({
    components: {
      child
    },
    data() {
      return {
        boxTarget: null as null | UniElement,
        scrollViewTarget: null as null | UniElement,
        attrId: "",
        attrStyle:"",
        propertyValue:"",
        rectInfo: {
          x: 0,
          y: 0,
          width: 0,
          height: 0,
          left: 0,
          top: 0,
          right: 0,
          bottom: 0,
        } as DomRectType,
      }
    },
    onReady() {
      this.boxTarget = this.$refs['box'] as UniElement
      this.scrollViewTarget = this.$refs['scrollView'] as UniElement;
    },
    methods: {
      getBoundingClientRectAsyncChild(){
        const childEl = uni.getElementById('child')!
        childEl.getBoundingClientRectAsync()!.then((rect : DOMRect) => {
          console.log('rect: ',rect);
          this.rectInfo = {
            x: rect.x,
            y: rect.y,
            width: rect.width,
            height: rect.height,
            left: rect.left,
            top: rect.top,
            right: rect.right,
            bottom: rect.bottom,
          } as DomRectType;;
        })
      },
      getAttributeId() {
        this.attrId = this.boxTarget!.getAttribute('id') ?? ""
      },
      setStyle() {
        this.boxTarget!.style.setProperty("background-color", "#FFF000")
      },
      getPropertyValue() {
        this.propertyValue = this.boxTarget!.style.getPropertyValue("background-color")
      },
      getAttributeStyle() {
        this.attrStyle = this.boxTarget!.getAttribute('style')?? ""
      },
      scrollTo() {






        this.scrollViewTarget!.scrollTo(200,0)

      }
    }
  })

export default __sfc__
function GenPagesAPIElementGetAttributeElementGetAttributeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_child = resolveComponent("child")

  return _cE("scroll-view", _uM({ class: "page-scroll-view" }), [
    _cE("view", _uM({
      style: _nS(_uM({"padding":"15px"}))
    }), [
      _cE("view", _uM({
        id: "box",
        ref: "box"
      }), [
        _cE("text", _uM({ class: "uni-title-text" }), "元素的id：" + _tD(_ctx.attrId), 1 /* TEXT */),
        _cE("text", _uM({ class: "uni-title-text" }), "元素的背景色样式值：" + _tD(_ctx.propertyValue), 1 /* TEXT */),
        _cE("text", _uM({ class: "uni-subtitle-text" }), "小程序端：getAttribute 获取元素的属性值，目前仅支持id、style"),
        _cE("text", _uM({ class: "uni-subtitle-text" }), "App端：getAttribute 不支持获取 class、style 属性")
      ], 512 /* NEED_PATCH */),
      _cE("button", _uM({ onClick: _ctx.getAttributeId }), "getAttribute获取元素的id", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({ onClick: _ctx.setStyle }), "setProperty设置背景色", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({ onClick: _ctx.getPropertyValue }), "getPropertyValue获取背景色值", 8 /* PROPS */, ["onClick"]),
      _cV(_component_child, _uM({
        id: "child",
        ref: "child"
      }), null, 512 /* NEED_PATCH */),
      _cE("button", _uM({ onClick: _ctx.getBoundingClientRectAsyncChild }), "获取自定义组件child元素信息", 8 /* PROPS */, ["onClick"]),
      isTrue(_ctx.rectInfo)
        ? _cE("view", _uM({
            key: 0,
            class: "rect-info"
          }), [
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "x: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.x), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "y: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.y), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "width: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.width), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "height: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.height), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "left: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.left), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "top: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.top), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "right: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.right), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "node-info-item" }), [
              _cE("text", _uM({ class: "node-info-item-k" }), "bottom: "),
              _cE("text", _uM({ class: "node-info-item-v" }), _tD(_ctx.rectInfo.bottom), 1 /* TEXT */)
            ])
          ])
        : _cC("v-if", true),
      _cE("scroll-view", _uM({
        ref: "scrollView",
        class: "scroll-view_H",
        direction: "horizontal"
      }), [
        _cE("view", _uM({ class: "scroll-view-item_H uni-bg-red" }), [
          _cE("text", _uM({ class: "text" }), "A")
        ]),
        _cE("view", _uM({ class: "scroll-view-item_H uni-bg-green" }), [
          _cE("text", _uM({ class: "text" }), "B")
        ]),
        _cE("view", _uM({ class: "scroll-view-item_H uni-bg-blue" }), [
          _cE("text", _uM({ class: "text" }), "C")
        ])
      ], 512 /* NEED_PATCH */),
      _cE("button", _uM({ onClick: _ctx.scrollTo }), "scrollTo设置left滚动200px", 8 /* PROPS */, ["onClick"])
    ], 4 /* STYLE */)
  ])
}
const GenPagesAPIElementGetAttributeElementGetAttributeStyles = [_uM([["scroll-view_H", _pS(_uM([["width", "100%"], ["flexDirection", "row"], ["marginTop", 15]]))], ["scroll-view-item_H", _pS(_uM([["width", "100%"], ["height", 150], ["justifyContent", "center"], ["alignItems", "center"]]))], ["text", _pS(_uM([["fontSize", 18], ["color", "#ffffff"]]))], ["rect-info", _pS(_uM([["marginTop", 15], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["flexDirection", "column"]]))], ["node-info-item", _pS(_uM([["flexDirection", "row"]]))], ["node-info-item-k", _pS(_uM([["width", 72], ["lineHeight", 2]]))], ["node-info-item-v", _pS(_uM([["fontWeight", "bold"], ["lineHeight", 2]]))]])]
