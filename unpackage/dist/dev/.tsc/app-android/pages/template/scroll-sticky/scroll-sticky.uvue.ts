
  const __sfc__ = defineComponent({
    data() {
      return {
        list: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15'],
        stickyTop: 0,
        stickyTran: 0,
        scrollTop: 0,
        stickyNode: null as UniElement | null
      }
    },
    methods: {
      onScroll(e : ScrollEvent) {
        if (e.detail.scrollTop > this.stickyTop) {
          let stickyTran = e.detail.scrollTop - this.stickyTop;
          if (stickyTran != this.stickyTran) {
            this.stickyNode?.style?.setProperty('transform', 'translateY(' + stickyTran + 'px)');
          }
          this.stickyTran = stickyTran;
        } else {
          this.stickyNode?.style?.setProperty('transform', '');
          this.stickyTran = 0;
        }
      },
      back() {
        uni.navigateBack({
          success(result) {
            console.log('navigateBack success', result.errMsg, " at pages/template/scroll-sticky/scroll-sticky.uvue:56")
          },
          fail(error) {
            console.log('navigateBack fail', error.errMsg, " at pages/template/scroll-sticky/scroll-sticky.uvue:59")
          },
          complete(result) {
            console.log('navigateBack complete', result.errMsg, " at pages/template/scroll-sticky/scroll-sticky.uvue:62")
          },
        })
      },
      async calcStickyTop() {
        this.stickyNode = this.$refs['sticky'] as UniElement;
        // let rect = this.stickyNode?.getBoundingClientRect();
        // this.stickyTop = rect?.top;
        //this.stickyTop = this.stickyNode?.getBoundingClientRect()?.top;
        const stickyRect = await (this.$refs['sticky'] as UniElement).getBoundingClientRectAsync()!;
        const scrollRect = await (this.$refs['scroll'] as UniElement).getBoundingClientRectAsync()!;
        this.stickyTop = stickyRect.top - scrollRect.top;
        console.log(stickyRect, scrollRect, " at pages/template/scroll-sticky/scroll-sticky.uvue:74");
      }
    },
    onLoad() {
    },
    onReady() {
      this.calcStickyTop()
    }
  })

export default __sfc__
function GenPagesTemplateScrollStickyScrollStickyRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({
    ref: "scroll",
    onScroll: _ctx.onScroll,
    class: "page",
    bounces: "false"
  }), [
    _cE("view", _uM({ class: "content-item" }), [
      _cE("text", _uM({ class: "text" }), "向上滑动页面，体验元素吸顶效果。")
    ]),
    _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
      return _cE("view", _uM({
        key: index,
        class: "content-item"
      }), [
        _cE("text", _uM({ class: "text" }), "first content-" + _tD(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */),
    _cE("view", _uM({
      ref: "sticky",
      class: "search"
    }), [
      _cE("view", _uM({
        style: _nS(_uM({"flex-direction":"row"}))
      }), [
        _cE("image", _uM({
          src: "/static/template/scroll-fold-nav/search.png",
          style: _nS(_uM({"width":"15px"})),
          mode: "widthFix"
        }), null, 4 /* STYLE */),
        _cE("text", _uM({ class: "search-tip-text" }), "请输入你要搜索的内容")
      ], 4 /* STYLE */),
      _cE("text", _uM({ class: "search-btn" }), "搜索")
    ], 512 /* NEED_PATCH */),
    _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
      return _cE("view", _uM({
        key: index,
        class: "content-item"
      }), [
        _cE("text", _uM({ class: "text" }), "second content-" + _tD(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */),
    _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
      return _cE("view", _uM({
        key: index,
        class: "content-item"
      }), [
        _cE("text", _uM({ class: "text" }), "second content-" + _tD(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */)
  ], 40 /* PROPS, NEED_HYDRATION */, ["onScroll"])
}
const GenPagesTemplateScrollStickyScrollStickyStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", 0], ["paddingRight", 15], ["paddingBottom", 0], ["paddingLeft", 15], ["backgroundColor", "#f5f5f5"]]))], ["content-item", _pS(_uM([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginTop", 5], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5]]))], ["text", _pS(_uM([["fontSize", 14], ["color", "#666666"], ["lineHeight", "20px"]]))], ["search", _pS(_uM([["backgroundColor", "#FFFFFF"], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#fbdf0d"], ["borderRightColor", "#fbdf0d"], ["borderBottomColor", "#fbdf0d"], ["borderLeftColor", "#fbdf0d"], ["height", 35], ["borderTopLeftRadius", 100], ["borderTopRightRadius", 100], ["borderBottomRightRadius", 100], ["borderBottomLeftRadius", 100], ["marginTop", 0], ["marginRight", 12], ["marginBottom", 0], ["marginLeft", 12], ["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8], ["flexDirection", "row"], ["alignItems", "center"], ["justifyContent", "space-between"], ["zIndex", 100]]))], ["search-tip-text", _pS(_uM([["fontSize", 12], ["color", "#666666"]]))], ["search-btn", _pS(_uM([["fontSize", 12], ["backgroundColor", "#ff6900"], ["color", "#FFFFFF"], ["paddingTop", 5], ["paddingRight", 8], ["paddingBottom", 5], ["paddingLeft", 8], ["borderTopLeftRadius", 100], ["borderTopRightRadius", 100], ["borderBottomRightRadius", 100], ["borderBottomLeftRadius", 100]]))]])]
