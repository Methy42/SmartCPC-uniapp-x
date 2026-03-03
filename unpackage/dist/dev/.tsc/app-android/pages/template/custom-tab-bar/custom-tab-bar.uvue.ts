
  import tab1 from './custom-tab-bar-tab1.uvue';
  import tab2 from './custom-tab-bar-tab2.uvue';

  type TabItem = { __$originalPosition?: UTSSourceMapPosition<"TabItem", "pages/template/custom-tab-bar/custom-tab-bar.uvue", 45, 8>;
    init : boolean,
    preload : boolean,
  }

  const __sfc__ = defineComponent({
    components: {
      tab1,
      tab2
    },
    data() {
      return {
        tabList: [
          {
            init: true,
            preload: false
          } as TabItem,
          {
            init: false,
            preload: false
          } as TabItem,
        ] as TabItem[],
        selectedIndex: 0,
        displayArrow: false,
        lastTab1Top:0,
        tabViewHeight: 0
      }
    },
    onLoad() {
      uni.$on('tabchange', this.onTabPageEvent) //监听tab1页面发出的tabchange事件，触发到本页面的onTabPageEvent方法。为了判断tab1的scroll-view滚动距离
    },
    onReady() {
      // this.setSelectedIndex(0)
      (this.$refs["tabview"] as UniElement).getBoundingClientRectAsync()!.then((res: DOMRect) => {
        this.tabViewHeight = res.height
      });
    },
    onUnload() {
      uni.$off('tabchange', this.onTabPageEvent)
    },
    methods: {
      onTabClick(index : number) {
        if (this.selectedIndex == index && index == 0 && this.displayArrow == true) { //首页当tab按钮变成向上时，点向上就滚动到顶
          // console.log("11");
          this.displayArrow = false;
          (this.$refs["tab1"]! as ComponentPublicInstance).$callMethod('scrollTop', 0)
        }
        else if (index !=0){ //不在首页时，把箭头变成图标
          // console.log("22");
          this.displayArrow = false
        }
        else if (index == 0 && this.selectedIndex !=0){ //从其他tab切回首页时，检查是否需要把图标变箭头
          // console.log("33",this.lastTab1Top, this.tabViewHeight);
          this.displayArrow = this.lastTab1Top > this.tabViewHeight
        }
        this.setSelectedIndex(index);
        // console.log('index: ',index);
        // console.log('this.selectedIndex: ',this.selectedIndex);
        // console.log('this.displayArrow: ',this.displayArrow);
        // console.log('this.lastTab1Top: ',this.lastTab1Top);
      },
      onTabPageEvent(top : number) {
        // console.log('top: ',top);
        this.displayArrow = top > this.tabViewHeight //滚动1屏后，就把第一个tab的图标从首页变成向上箭头
        this.lastTab1Top = top
      },
      setSelectedIndex(index : number) {
        if (this.selectedIndex === index) {
          return
        }
        if (!this.tabList[index].init) {
          this.tabList[index].init = true
        }
        this.selectedIndex = index
      },
      onPlusClick() {
        uni.showModal({
          title: "提示",
          content: "你点击了 +",
          showCancel: false
        })
      }
    }
  })

export default __sfc__
function GenPagesTemplateCustomTabBarCustomTabBarRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_tab1 = resolveComponent("tab1")
const _component_tab2 = resolveComponent("tab2")

  return _cE("view", _uM({ class: "tabs" }), [
    _cE("view", _uM({
      ref: "tabview",
      class: "tab-view"
    }), [
      isTrue(_ctx.tabList[0].init)
        ? _cV(_component_tab1, _uM({
            key: 0,
            ref: "tab1",
            class: "tab-page",
            style: _nS(_uM({visibility:(_ctx.selectedIndex==0?'visible':'hidden')}))
          }), null, 8 /* PROPS */, ["style"])
        : _cC("v-if", true),
      isTrue(_ctx.tabList[1].init)
        ? _cV(_component_tab2, _uM({
            key: 1,
            ref: "tab2",
            class: "tab-page",
            style: _nS(_uM({visibility:(_ctx.selectedIndex==1?'visible':'hidden')}))
          }), null, 8 /* PROPS */, ["style"])
        : _cC("v-if", true)
    ], 512 /* NEED_PATCH */),
    _cE("view", _uM({
      ref: "tabbar",
      class: "tab-bar"
    }), [
      _cE("view", _uM({
        class: "tab-item",
        onClick: () => {_ctx.onTabClick(0)}
      }), [
        _cE("view", _uM({
          ref: "tab-item1",
          class: "tab-item-content"
        }), [
          isTrue(_ctx.displayArrow)
            ? _cE("text", _uM({
                key: 0,
                class: _nC(["tab-item-icon tab-item-arrow uni-icon", _ctx.selectedIndex==0 ? 'tab-item-text-active' : ''])
              }), _tD('\ue6bd'), 2 /* CLASS */)
            : _cC("v-if", true),
          isTrue(!_ctx.displayArrow)
            ? _cE("text", _uM({
                key: 1,
                class: _nC(["tab-item-icon uni-icon", _ctx.selectedIndex==0 ? 'tab-item-text-active' : ''])
              }), _tD('\ue644'), 2 /* CLASS */)
            : _cC("v-if", true),
          isTrue(!_ctx.displayArrow)
            ? _cE("text", _uM({
                key: 2,
                class: _nC(["tab-item-text", _ctx.selectedIndex==0 ? 'tab-item-text-active' : ''])
              }), " 首页 ", 2 /* CLASS */)
            : _cC("v-if", true)
        ], 512 /* NEED_PATCH */)
      ], 8 /* PROPS */, ["onClick"]),
      _cE("view", null, [
        _cE("image", _uM({
          class: "concave-image",
          mode: "heightFix",
          src: "/static/template/custom-tab-bar/concave.png"
        }))
      ]),
      _cE("view", _uM({
        class: "tab-item",
        onClick: () => {_ctx.onTabClick(1)}
      }), [
        _cE("view", _uM({
          ref: "tab-item2",
          class: "tab-item-content"
        }), [
          _cE("text", _uM({
            class: _nC(["tab-item-icon uni-icon", _ctx.selectedIndex==1 ? 'tab-item-text-active' : ''])
          }), _tD('\ue699'), 2 /* CLASS */),
          _cE("text", _uM({
            class: _nC(["tab-item-text", _ctx.selectedIndex==1 ? 'tab-item-text-active' : ''])
          }), " 我的 ", 2 /* CLASS */)
        ], 512 /* NEED_PATCH */)
      ], 8 /* PROPS */, ["onClick"])
    ], 512 /* NEED_PATCH */),
    _cE("view", _uM({
      class: "btn-plus",
      onClick: _ctx.onPlusClick
    }), [
      _cE("text", _uM({ class: "btn-plus-text" }), "+")
    ], 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesTemplateCustomTabBarCustomTabBarStyles = [_uM([["uni-icon", _pS(_uM([["fontFamily", "UniIcon"], ["fontSize", 16], ["fontStyle", "normal"]]))], ["tabs", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["backgroundColor", "#ffffff"], ["overflow", "visible"]]))], ["tab-view", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["tab-page", _pS(_uM([["position", "absolute"], ["width", "100%"], ["height", "100%"]]))], ["tab-bar", _pS(_uM([["flexDirection", "row"], ["height", 56], ["overflow", "visible"]]))], ["tab-item", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["position", "relative"], ["backgroundColor", "#1e90ff"], ["overflow", "visible"]]))], ["tab-item-content", _pS(_uM([["marginTop", "auto"], ["marginRight", "auto"], ["marginBottom", "auto"], ["marginLeft", "auto"], ["transitionProperty", "transform"], ["transitionDuration", "0.3s"]]))], ["tab-item-icon", _pS(_uM([["color", "#cccccc"], ["fontSize", 12], ["textAlign", "center"], ["marginBottom", 4]]))], ["tab-item-text", _pS(_uM([["color", "#cccccc"], ["fontSize", 12], ["textAlign", "center"]]))], ["tab-item-text-active", _pS(_uM([["color", "#ffffff"]]))], ["tab-item-arrow", _pS(_uM([["!fontSize", 30], ["fontWeight", "bold"]]))], ["concave-image", _pS(_uM([["height", 56]]))], ["btn-plus", _pS(_uM([["position", "absolute"], ["width", 70], ["height", 70], ["bottom", 21], ["borderTopLeftRadius", 50], ["borderTopRightRadius", 50], ["borderBottomRightRadius", 50], ["borderBottomLeftRadius", 50], ["backgroundColor", "#FE5722"], ["boxShadow", "0 0 4px rgba(0, 0, 0, 0.5)"], ["alignSelf", "center"], ["alignItems", "center"], ["justifyContent", "center"], ["overflow", "visible"]]))], ["btn-plus-text", _pS(_uM([["color", "#ffffff"], ["fontSize", 32]]))], ["@FONT-FACE", _uM([["0", _uM([["fontFamily", "UniIcon"], ["src", "url('/static/fonts/uni-icon.ttf')"]])]])], ["@TRANSITION", _uM([["tab-item-content", _uM([["property", "transform"], ["duration", "0.3s"]])]])]])]
