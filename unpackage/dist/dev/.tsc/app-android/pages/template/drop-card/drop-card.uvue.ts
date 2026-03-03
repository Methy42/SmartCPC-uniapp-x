
  import card from './card/card.uvue';
  const __sfc__ = defineComponent({
    components: {
      card
    },
    data() {
      return {
        cardList: [
          'https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/drop-card-1.jpg',
          'https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/drop-card-2.jpg',
          'https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/drop-card-3.jpg'
        ] as string.ImageURIString[]
      }
    }
  })

export default __sfc__
function GenPagesTemplateDropCardDropCardRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_card = resolveComponent("card")

  return _cE("view", _uM({ class: "root" }), [
    _cE(Fragment, null, RenderHelpers.renderList(_ctx.cardList, (item, index, __index, _cached): any => {
      return _cV(_component_card, _uM({
        key: index,
        ref_for: true,
        ref: "card",
        img: item,
        cardIndex: index
      }), null, 8 /* PROPS */, ["img", "cardIndex"])
    }), 128 /* KEYED_FRAGMENT */)
  ])
}
const GenPagesTemplateDropCardDropCardStyles = [_uM([["root", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["position", "relative"], ["alignItems", "center"]]))]])]
