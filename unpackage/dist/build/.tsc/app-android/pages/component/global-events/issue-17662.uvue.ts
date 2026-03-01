
  const __sfc__ = defineComponent({
    data() {
      return {
        longpressItem: false,
        longpressText: false,
        isStopPropagation: false,
        scrollTop: 0
      };
    },
    methods: {
      longpress_item(_e : UniTouchEvent) {
        console.log("longpress listItem")
        this.longpressItem = true
      },
      longpress_text(e : UniTouchEvent) {
        console.log("longpress text")
        this.longpressText = true
        if (this.isStopPropagation) {
          e.stopPropagation()
        }
      }
    },
  });

export default __sfc__
function GenPagesComponentGlobalEventsIssue17662Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("list-view", _uM({
    style: _nS(_uM({"flex":"1"})),
    "scroll-top": _ctx.scrollTop
  }), [
    _cE(Fragment, null, RenderHelpers.renderList(50, (item, __key, __index, _cached): any => {
      return _cE("list-item", _uM({
        key: item,
        onLongpress: _ctx.longpress_item,
        style: _nS(_uM({"border-bottom-style":"solid","border-bottom-width":"1px","border-bottom-color":"black"}))
      }), [
        _cE("view", _uM({
          style: _nS(_uM({"width":"100%","height":"40px","background-color":"antiquewhite"}))
        }), [
          _cE("text", _uM({
            onLongpress: _ctx.longpress_text,
            style: _nS(_uM({"font-size":"10px","width":"100px","height":"100%","background-color":"red"}))
          }), _tD(item), 45 /* TEXT, STYLE, PROPS, NEED_HYDRATION */, ["onLongpress"])
        ], 4 /* STYLE */)
      ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onLongpress"])
    }), 64 /* STABLE_FRAGMENT */)
  ], 12 /* STYLE, PROPS */, ["scroll-top"])
}
const GenPagesComponentGlobalEventsIssue17662Styles = []
