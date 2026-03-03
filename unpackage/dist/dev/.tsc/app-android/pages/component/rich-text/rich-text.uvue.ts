
  const __sfc__ = defineComponent({
    data() {
      return {
        text: "<span>hello uni-app x!</span><br/><span>uni-app x，终极跨平台方案</span>",
        richTextHeight: 0,
        richTextElement: null as UniElement | null,
        // 自动化测试
        autoTest: false,
        testNodes: '<img src="https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png"></img>',
        isItemClickTrigger: false,
        richTextStr: false
      }
    },
    onReady() {
      this.richTextElement = uni.getElementById('richtext') as UniElement
      setTimeout(() => {
        this.updateRichTextHeight()
      }, 2500)
    },
    methods: {
      changeText() {
        if (this.text === "<span>hello uni-app x!</span><br/><span>uni-app x，终极跨平台方案</span>") {
          this.text = "<h1>hello uni-app x!</h1><br/><h2>uni-app x，终极跨平台方案</h2>"
        } else {
          this.text = "<span>hello uni-app x!</span><br/><span>uni-app x，终极跨平台方案</span>"
        }
        setTimeout(() => {
          this.updateRichTextHeight()
        }, 200)
      },
      updateRichTextHeight() {
        if (this.richTextElement != null) {
          this.richTextElement!.getBoundingClientRectAsync()!.then((elRect: DOMRect) => {
            this.richTextHeight = elRect.height
            console.log('richTextHeight:', this.richTextHeight, " at pages/component/rich-text/rich-text.uvue:72")
          })
        }
      },
      // 自动化测试
      itemClickForTest(_ : UniRichTextItemClickEvent) {
        this.isItemClickTrigger = true;
      },
      getBoundingClientRectForTest() : DOMRect {
        return uni.getElementById('test-rich-text')?.getBoundingClientRect()!;
      },
      richTextParentClick() {
        this.richTextStr = true;
      }
    }
  })

export default __sfc__
function GenPagesComponentRichTextRichTextRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_navigator = resolveComponent("navigator")

  return _cE(Fragment, null, [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: "rich-text" })),
      _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
        _cE("view", _uM({ class: "uni-btn-v" }), [
          _cV(_component_navigator, _uM({ url: "/pages/component/rich-text/rich-text-tags" }), _uM({
            default: withSlotCtx((): any[] => [
              _cE("button", _uM({ type: "primary" }), "rich-text渲染单个HTML标签示例")
            ]),
            _: 1 /* STABLE */
          }))
        ]),
        _cE("view", _uM({ class: "uni-btn-v" }), [
          _cV(_component_navigator, _uM({ url: "/pages/component/rich-text/rich-text-complex" }), _uM({
            default: withSlotCtx((): any[] => [
              _cE("button", _uM({ type: "primary" }), "rich-text渲染复杂HTML示例")
            ]),
            _: 1 /* STABLE */
          }))
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("button", _uM({
            type: "default",
            onClick: _ctx.changeText
          }), "修改文本内容", 8 /* PROPS */, ["onClick"])
        ]),
        _cE("view", _uM({
          class: "text-box",
          id: "rich-text-parent",
          onClick: _ctx.richTextParentClick
        }), [
          _cE("rich-text", _uM({
            id: "richtext",
            style: _nS(_uM({"border":"1px","border-style":"solid","border-color":"red"})),
            nodes: _ctx.text
          }), null, 12 /* STYLE, PROPS */, ["nodes"]),
          _cE("view", null, [
            _cE("text", null, "rich-text-parent"),
            _cE("text", _uM({ id: "rich-text-str" }), _tD(_ctx.richTextStr), 1 /* TEXT */)
          ])
        ], 8 /* PROPS */, ["onClick"]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "selectable")
        ]),
        _cE("view", _uM({ class: "text-box2" }), [
          _cE("rich-text", _uM({
            style: _nS(_uM({"height":"80px"})),
            selectable: true,
            nodes: _ctx.text
          }), null, 12 /* STYLE, PROPS */, ["nodes"])
        ])
      ])
    ]),
    isTrue(_ctx.autoTest)
      ? _cE("rich-text", _uM({
          key: 0,
          id: "test-rich-text",
          nodes: _ctx.testNodes,
          selectable: true,
          onItemclick: _ctx.itemClickForTest,
          style: _nS(_uM({"position":"fixed","width":"100px","height":"100px"}))
        }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["nodes", "onItemclick"])
      : _cC("v-if", true)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentRichTextRichTextStyles = [_uM([["text-box", _pS(_uM([["paddingTop", 20], ["paddingRight", 0], ["paddingBottom", 20], ["paddingLeft", 0], ["backgroundColor", "#FFFFFF"]]))], ["text-box2", _pS(_uM([["top", 20], ["backgroundColor", "#FFFFFF"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
