
  const __sfc__ = defineComponent({
    data() {
      return {
        decodeStr: '&lt; &gt; &amp; &apos;',
        title: 'text-props',
        multiLineText:
          'HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言；HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言',
        singleLineText: 'uni-app x，终极跨平台方案',
        // 自动化测试
        autoTest: false,
        nestedText: '三级节点文本',
        emptyText: '空文本',
        heightText: '设置高度文本',
        isNestedText1TapTriggered: false,
        isNestedText2TapTriggered: false
      }
    },
    methods: {
      nestedText1Tap() {
        uni.showModal({
          title: '点击了',
          content: '一级节点黑色',
          showCancel: false
        });
      },
      nestedText2Tap(e : UniPointerEvent) {
        e.stopPropagation();
        uni.showModal({
          title: '点击了',
          content: '二级节点红色且背景色黄色',
          showCancel: false
        });
      },
      nestedText3Tap(e : UniPointerEvent) {
        e.stopPropagation();
        uni.showModal({
          title: '点击了',
          content: 'App三级节点不继承二级的颜色',
          showCancel: false
        });
      },
      iconTap() {
        uni.showModal({
          title: '点击了',
          content: '字体图标1',
          showCancel: false
        });
      },
      iconTap2() {
        uni.showModal({
          title: '点击了',
          content: '字体图标2',
          showCancel: false
        });
      },
      // 自动化测试
      setNestedText() {
        this.nestedText = "修改三级节点文本";
      },
      setEmptyText() {
        this.emptyText = "";
      },
      setHeightText() {
        this.heightText = "修改设置高度文本";
      },
      getBoundingClientRectForTest() : DOMRect | null {
        return uni.getElementById('nested-text2')?.getBoundingClientRect();
      },
      nestedText1TapForTest() {
        this.isNestedText1TapTriggered = true;
      },
      nestedText2TapForTest() {
        this.isNestedText2TapTriggered = true;
      }
    }
  })

export default __sfc__
function GenPagesComponentTextTextPropsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-title-text" }), "text相关属性示例")
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "根据宽度自动折行")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", null, _tD(_ctx.multiLineText), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "\\n换行")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", null, "\n 换行"),
          _cE("text", null, "\\n 换行"),
          _cE("text", null, "\\\n 换行"),
          _cE("text", null, "\n 换行 \\n 换行 \\\n 换行 \\\\n 换行 \\\\\n 换行"),
          _cE("text", _uM({ space: "nbsp" }), "HBuilderX，轻巧、极速，极客编辑器;\nuni-app x，终极跨平台方案;")
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "截断（clip）")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({
            class: "uni-flex-item",
            style: _nS(_uM({"width":"100%","text-overflow":"clip","white-space":"nowrap"}))
          }), _tD(_ctx.multiLineText), 5 /* TEXT, STYLE */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "截断（ellipsis）")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({
            class: "uni-flex-item",
            style: _nS(_uM({"width":"100%","text-overflow":"ellipsis","white-space":"nowrap"}))
          }), _tD(_ctx.multiLineText), 5 /* TEXT, STYLE */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "selectable")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({ selectable: true }), _tD(_ctx.singleLineText), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "space"),
          _cE("text", _uM({ class: "uni-subtitle-text" }), "依次为nbsp ensp emsp效果")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({ space: "nbsp" }), _tD(_ctx.singleLineText), 1 /* TEXT */),
          _cE("text", _uM({ space: "ensp" }), _tD(_ctx.singleLineText), 1 /* TEXT */),
          _cE("text", _uM({ space: "emsp" }), _tD(_ctx.singleLineText), 1 /* TEXT */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "decode"),
          _cE("text", _uM({ class: "uni-subtitle-text" }), "依次为lt gt amp apos nbsp ensp emsp效果")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({ decode: true }), _tD(_ctx.decodeStr), 1 /* TEXT */),
          _cE("text", _uM({ decode: true }), "uni-app x，终极跨平台方案"),
          _cE("text", _uM({ decode: true }), "uni-app x，终极跨平台方案"),
          _cE("text", _uM({ decode: true }), "uni-app x，终极跨平台方案")
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "嵌套1")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({ onClick: _ctx.nestedText1Tap }), [
            "一级节点黑色 ",
            _cE("text", _uM({
              style: _nS(_uM({"color":"red","background-color":"yellow"})),
              onClick: _ctx.nestedText2Tap
            }), [
              "二级节点红色且背景色黄色 ",
              _cE("text", _uM({
                style: _nS(_uM({"text-decoration-line":"underline","color":"blue"})),
                onClick: _ctx.nestedText3Tap
              }), "App三级节点不继承二级的颜色", 12 /* STYLE, PROPS */, ["onClick"])
            ], 12 /* STYLE, PROPS */, ["onClick"]),
            _cE("text", _uM({
              style: _nS(_uM({"font-size":"50px"}))
            }), "二级节点大字体", 4 /* STYLE */)
          ], 8 /* PROPS */, ["onClick"])
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "嵌套2")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", null, [
            _cE("text", null, "文字应居中显示")
          ])
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "padding和border")
        ]),
        _cE("view", _uM({ class: "text-box" }), [
          _cE("text", _uM({ class: "text-padding-border" }), "hello uni-app x"),
          _cE("text", _uM({
            class: "text-padding-border",
            style: _nS(_uM({"width":"200px"}))
          }), "hello uni-app x", 4 /* STYLE */),
          _cE("text", _uM({
            class: "text-padding-border",
            style: _nS(_uM({"height":"100px"}))
          }), "hello uni-app x", 4 /* STYLE */),
          _cE("text", _uM({
            class: "text-padding-border",
            style: _nS(_uM({"width":"200px","height":"100px"}))
          }), "hello uni-app x", 4 /* STYLE */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "含换行符的多行文本(3行)，但不自动换行，可横向滚动")
        ]),
        _cE("scroll-view", _uM({
          class: "text-container",
          direction: "horizontal"
        }), [
          _cE("text", _uM({
            style: _nS(_uM({"white-space":"nowrap","align-self":"flex-start"}))
          }), "HBuilderX，轻巧、极速，极客编辑器；\nuni-app x，是下一代 uni-app，是一个跨平台应用开发引擎。uni-app x 是一个庞大的工程，它包括uts语言、uvue渲染引擎、uni的组件和API、以及扩展机制。\nuts是一门类ts的、跨平台的、新语言。", 4 /* STYLE */)
        ]),
        _cE("view", _uM({ class: "uni-title" }), [
          _cE("text", _uM({ class: "uni-subtitle-text" }), "点击事件测试")
        ]),
        _cE("view", _uM({
          class: "text-box",
          style: _nS(_uM({"flex-direction":"row"}))
        }), [
          _cE("text", _uM({
            class: "text-icon",
            style: _nS(_uM({"background-color":"aqua"})),
            onClick: _ctx.iconTap
          }), _tD(String.fromCharCode(parseInt('E650',16))), 13 /* TEXT, STYLE, PROPS */, ["onClick"]),
          _cE("text", _uM({
            class: "text-icon",
            style: _nS(_uM({"background-color":"yellow"})),
            onClick: _ctx.iconTap2
          }), _tD(String.fromCharCode(parseInt('EA08',16))), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
        ], 4 /* STYLE */),
        isTrue(_ctx.autoTest)
          ? _cE("view", _uM({ key: 0 }), [
              _cE("view", _uM({ class: "uni-row" }), [
                _cE("text", _uM({ id: "empty-text" }))
              ]),
              _cE("view", _uM({ class: "uni-row" }), [
                _cE("text", _uM({ id: "empty-text2" }), _tD(_ctx.emptyText), 1 /* TEXT */)
              ]),
              _cE("view", _uM({ class: "uni-row" }), [
                _cE("text", _uM({
                  id: "empty-text3",
                  style: _nS(_uM({"width":"100px","height":"100px"}))
                }), _tD(_ctx.emptyText), 5 /* TEXT, STYLE */)
              ]),
              _cE("text", null, [
                "一级节点文本 ",
                _cE("text", null, [
                  "二级节点文本 ",
                  _cE("text", _uM({ id: "nested-text" }), _tD(_ctx.nestedText), 1 /* TEXT */)
                ])
              ]),
              _cE("text", _uM({
                id: "height-text",
                style: _nS(_uM({"height":"50px"}))
              }), _tD(_ctx.heightText), 5 /* TEXT, STYLE */),
              _cE("text", _uM({
                style: _nS(_uM({"position":"fixed"})),
                id: "nested-text2",
                onClick: _ctx.nestedText1TapForTest
              }), [
                "1 ",
                _cE("text", _uM({ onClick: _ctx.nestedText2TapForTest }), [
                  "2 ",
                  _cE("text", null, "3")
                ], 8 /* PROPS */, ["onClick"])
              ], 12 /* STYLE, PROPS */, ["onClick"])
            ])
          : _cC("v-if", true)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentTextTextPropsStyles = [_uM([["text-box", _pS(_uM([["marginBottom", 20], ["paddingTop", 20], ["paddingRight", 0], ["paddingBottom", 20], ["paddingLeft", 0], ["backgroundColor", "#ffffff"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["text-container", _pS(_uM([["width", "100%"], ["backgroundColor", "#ffffff"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["text", _pS(_uM([["fontSize", 15], ["color", "#353535"], ["lineHeight", "27px"], ["textAlign", "center"]]))], ["text-padding-border", _pS(_uM([["marginTop", 5], ["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["borderTopWidth", 5], ["borderRightWidth", 5], ["borderBottomWidth", 5], ["borderLeftWidth", 5], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#FF0000"], ["borderRightColor", "#FF0000"], ["borderBottomColor", "#FF0000"], ["borderLeftColor", "#FF0000"], ["textAlign", "center"]]))], ["text-icon", _pS(_uM([["fontFamily", "uni-icon"], ["fontSize", 100]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
