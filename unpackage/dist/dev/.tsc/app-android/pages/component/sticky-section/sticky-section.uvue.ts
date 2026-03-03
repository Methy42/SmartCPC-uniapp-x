
  export type sectionData = { __$originalPosition?: UTSSourceMapPosition<"sectionData", "pages/component/sticky-section/sticky-section.uvue", 31, 15>;
    name : string,
    list : sectionListItem[]
  }
  export type sectionListItem = { __$originalPosition?: UTSSourceMapPosition<"sectionListItem", "pages/component/sticky-section/sticky-section.uvue", 35, 15>;
    text : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        data: ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'],
        sectionPadding: [0, 10, 0, 10] as Array<number>,
        scrollIntoView: "",
        scrolling: false,
        sectionArray: [] as sectionData[],
        appendId: 0,
        refresherTriggered: false,
        isReady: false//自动化测试使用
      }
    },
    onLoad() {

    },
    onReady() {
      //延迟onReady再加载数据 校验issues:14705 bug
      this.initSectionArray()
      this.isReady = true
    },
    methods: {
      initSectionArray() {
        this.sectionArray = [] as sectionData[]
        console.log("initSectionArray start", this.sectionArray.length, " at pages/component/sticky-section/sticky-section.uvue:62")
        this.data.forEach(key => {
          const list = [] as sectionListItem[]
          for (let i = 1; i < 11; i++) {
            const item = { text: key + "--item--content----" + i } as sectionListItem
            list.push(item)
          }
          const data = { name: key, list: list } as sectionData
          this.sectionArray.push(data)
        }
        )
        console.log("initSectionArray end", this.sectionArray[0].name, " at pages/component/sticky-section/sticky-section.uvue:73")
      },
      toTop() {
        this.scrollIntoView = ""
        uni.getElementById("list-view")!.scrollTop = 0
      },
      //用于自动化测试
      listViewScrollByY(y : number) {
        const listview = this.$refs["list-view"] as UniElement
        // listview.scrollBy(0, y)
        listview.scrollTop = y
      },
      gotoStickyHeader(id : string) {

        this.scrollIntoView = id




      },
      onScroll() {
        this.scrolling = true
      },
      onScrollEnd() {
        this.scrolling = false
        //滚动后重置scrollIntoView = ""
        if (this.scrollIntoView != "") {
          this.scrollIntoView = ""
        }
      },
      appendSectionItem(index : number) {
        const data = this.sectionArray[index]
        this.appendId++
        const list = [
          { text: data.name + "--item--content----new1--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new2--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new3--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new4--" + this.appendId } as sectionListItem,
          { text: data.name + "--item--content----new5--" + this.appendId } as sectionListItem
        ] as sectionListItem[]
        data.list.unshift(...list)
      },
      deleteSection() {
        this.sectionArray.shift()
      },
      onRefresherrefresh(_ : UniRefresherEvent) {
        this.refresherTriggered = true;
        setTimeout(() => {
          this.initSectionArray()
          this.refresherTriggered = false;
        }, 1000)
      },
    }
  })

export default __sfc__
function GenPagesComponentStickySectionStickySectionRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: "sticky-section" })),
    _cE("list-view", _uM({
      id: "list-view",
      ref: "list-view",
      "show-scrollbar": "false",
      class: "page",
      "scroll-into-view": _ctx.scrollIntoView,
      onScroll: _ctx.onScroll,
      onScrollend: _ctx.onScrollEnd,
      bounces: "false",
      "refresher-enabled": "true",
      "refresher-triggered": _ctx.refresherTriggered,
      onRefresherrefresh: _ctx.onRefresherrefresh
    }), [
      _cE("list-item", _uM({
        style: _nS(_uM({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 20
      }), [
        _cE("button", _uM({
          onClick: () => {_ctx.gotoStickyHeader('C')},
          size: "mini"
        }), "跳转到id为C的sticky-header位置上", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      _cE("list-item", _uM({
        style: _nS(_uM({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 20
      }), [
        _cE("button", _uM({
          onClick: () => {_ctx.appendSectionItem(0)},
          size: "mini"
        }), "第一组 section 新增5条内容", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      _cE("list-item", _uM({
        style: _nS(_uM({"padding":"10px","margin":"5px 0","align-items":"center"})),
        type: 20
      }), [
        _cE("button", _uM({
          onClick: () => {_ctx.deleteSection()},
          size: "mini"
        }), "删除第一组 section", 8 /* PROPS */, ["onClick"])
      ], 4 /* STYLE */),
      _cE(Fragment, null, RenderHelpers.renderList(_ctx.sectionArray, (section, __key, __index, _cached): any => {
        return _cE("sticky-section", _uM({
          key: section.name,
          padding: _ctx.sectionPadding,
          "push-pinned-header": true
        }), [
          _cE("sticky-header", _uM({
            id: section.name
          }), [
            _cE("text", _uM({ class: "sticky-header-text" }), _tD(section.name), 1 /* TEXT */)
          ], 8 /* PROPS */, ["id"]),
          _cE(Fragment, null, RenderHelpers.renderList(section.list, (list, __key, __index, _cached): any => {
            return _cE("list-item", _uM({
              key: list.text,
              name: list.text,
              class: "content-item",
              type: 10
            }), [
              _cE("text", _uM({ class: "text" }), _tD(list.text), 1 /* TEXT */)
            ], 8 /* PROPS */, ["name"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 8 /* PROPS */, ["padding"])
      }), 128 /* KEYED_FRAGMENT */),
      _ctx.sectionArray.length > 0
        ? _cE("list-item", _uM({
            key: 0,
            style: _nS(_uM({"padding":"10px","margin":"5px 0","align-items":"center"})),
            type: 30
          }), [
            _cE("button", _uM({
              onClick: _ctx.toTop,
              size: "mini"
            }), "回到顶部", 8 /* PROPS */, ["onClick"])
          ], 4 /* STYLE */)
        : _cC("v-if", true)
    ], 40 /* PROPS, NEED_HYDRATION */, ["scroll-into-view", "onScroll", "onScrollend", "refresher-triggered", "onRefresherrefresh"])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentStickySectionStickySectionStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["backgroundColor", "#f5f5f5"]]))], ["sticky-header-text", _pS(_uM([["fontSize", 16], ["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8], ["color", "#959595"], ["backgroundColor", "#f5f5f5"]]))], ["content-item", _pS(_uM([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginBottom", 10], ["backgroundColor", "#ffffff"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
