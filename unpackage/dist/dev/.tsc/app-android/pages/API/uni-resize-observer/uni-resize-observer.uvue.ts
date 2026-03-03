
  const __sfc__ = defineComponent({
    data() {
      return {
        outBoxSizeInfo: "",
        innerBoxSizeInfo: "",
        offset: 2,
        boxDisplay: false,
        outBoxElement: null as UniElement | null,
        innerBoxElement: null as UniElement | null,
        resizeObserver: null as UniResizeObserver | null,
        outBoxElementOnResize: false
      }
    },
    onBackPress() : boolean {
      if (this.resizeObserver != null) {
        this.resizeObserver!.disconnect()
      }
      return false
    },
    onReady() {
      if (this.resizeObserver == null) {
        this.resizeObserver = new UniResizeObserver((entries : Array<UniResizeObserverEntry>) => {

          entries.forEach(entry => {
            if (entry.target == this.outBoxElement) {
              this.outBoxSizeInfo = this.analysisResizeObserverEntry(entry)
              this.outBoxElementOnResize = true
            } else if (entry.target == this.innerBoxElement) {
              this.innerBoxSizeInfo = this.analysisResizeObserverEntry(entry)
            }
          })
        })
        this.outBoxElement = uni.getElementById("outBox")
        if (this.outBoxElement != null) {
          this.resizeObserver!.observe(this.outBoxElement!)
        }
        this.innerBoxElement = uni.getElementById("innerBox")
        if (this.innerBoxElement != null) {
          this.resizeObserver!.observe(this.innerBoxElement!)
        }
        this.boxDisplay = true
      }
    },
    methods: {
      innerBoxClick() {
        if (this.innerBoxElement != null) {
          this.innerBoxElement!.style.setProperty("width", this.innerBoxElement!.offsetWidth + this.offset + 'px')
          this.innerBoxElement!.style.setProperty("height", this.innerBoxElement!.offsetWidth + this.offset + 'px')
        }
      },
      outBoxClick() {
        if (this.outBoxElement != null) {
          this.outBoxElement!.style.setProperty("width", this.outBoxElement!.offsetWidth + this.offset + 'px')
          this.outBoxElement!.style.setProperty("height", this.outBoxElement!.offsetWidth + this.offset + 'px')
        }
      },
      revertBoxSize() {
        if (this.outBoxElement != null) {
          this.outBoxElement!.style.setProperty("width", "140px")
          this.outBoxElement!.style.setProperty("height", "140px")
        }
        if (this.innerBoxElement != null) {
          this.innerBoxElement!.style.setProperty("width", "80px")
          this.innerBoxElement!.style.setProperty("height", "80px")
        }
      },
      //自动化测试专用
      setOutBoxMarginLeft(value : string) {
        if (this.outBoxElement != null) {
          this.outBoxElementOnResize = false
          this.outBoxElement!.style.setProperty("margin-left", value)
        }
      },
      toggleDisplay() {
        this.boxDisplay = !this.boxDisplay
      },
      analysisResizeObserverEntry(entry : UniResizeObserverEntry) : string {
        const contentBoxSize = entry.contentBoxSize[0]
        const borderBoxSize = entry.borderBoxSize[0]
        const devicePixelContentBoxSize = entry.devicePixelContentBoxSize[0]
        return "borderBoxSize: \n{blockSize:" + borderBoxSize.blockSize + ", inlineSize:" + borderBoxSize.inlineSize + "}\n" +
          "contentBoxSize: \n{blockSize:" + contentBoxSize.blockSize + ", inlineSize:" + contentBoxSize.inlineSize + "}\n" +
          "devicePixelContentBoxSize: \n{blockSize:" + devicePixelContentBoxSize.blockSize + ", inlineSize:" + devicePixelContentBoxSize.inlineSize + "}\n" +
          "contentRect: \n{x:" + entry.contentRect.x + ", y:" + entry.contentRect.y + ", width:" + entry.contentRect.width + ", height:" + entry.contentRect.height + "}"
      },
      cancelListen() {
        // this.resizeObserver?.unobserve()
        this.resizeObserver!.unobserve(this.outBoxElement!)
        this.resizeObserver!.unobserve(this.innerBoxElement!)
      },
      goOnListen() {
        this.resizeObserver!.observe(this.outBoxElement!)
        this.resizeObserver!.observe(this.innerBoxElement!)
      }
    }
  })

export default __sfc__
function GenPagesAPIUniResizeObserverUniResizeObserverRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", null, [
    _cE("text", null, "点击蓝色或红色方块区域会修改元素宽高"),
    withDirectives(_cE("view", _uM({
      style: _nS(_uM({"align-items":"center","justify-content":"center","margin":"10px"}))
    }), [
      _cE("view", _uM({
        style: _nS(_uM({"width":"140px","height":"140px","background-color":"blue","align-items":"center","justify-content":"center","padding":"5px"})),
        id: "outBox",
        onClick: _ctx.outBoxClick
      }), [
        _cE("view", _uM({
          style: _nS(_uM({"width":"80px","height":"80px","background-color":"red","padding":"5px"})),
          id: "innerBox",
          onClick: _ctx.innerBoxClick
        }), null, 12 /* STYLE, PROPS */, ["onClick"])
      ], 12 /* STYLE, PROPS */, ["onClick"])
    ], 4 /* STYLE */), [
      [vShow, _ctx.boxDisplay]
    ]),
    _cE("button", _uM({ onClick: _ctx.revertBoxSize }), "还原修改前元素宽高", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({ onClick: _ctx.toggleDisplay }), _tD(_ctx.boxDisplay? '隐藏元素': '显示元素'), 9 /* TEXT, PROPS */, ["onClick"]),
    _cE("button", _uM({ onClick: _ctx.cancelListen }), "停止监听", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({ onClick: _ctx.goOnListen }), "恢复监听", 8 /* PROPS */, ["onClick"]),
    _cE("view", null, [
      _cE("text", _uM({ class: "info-text" }), "蓝色方块元素:"),
      _cE("view", _uM({ class: "info-item" }), [
        _cE("text", _uM({ class: "info-text" }), _tD(_ctx.outBoxSizeInfo), 1 /* TEXT */)
      ]),
      _cE("text", _uM({
        class: "info-text",
        style: _nS(_uM({"margin-top":"20px"}))
      }), "红色方块元素:", 4 /* STYLE */),
      _cE("view", _uM({ class: "info-item" }), [
        _cE("text", _uM({ class: "info-text" }), _tD(_ctx.innerBoxSizeInfo), 1 /* TEXT */)
      ])
    ])
  ])
}
const GenPagesAPIUniResizeObserverUniResizeObserverStyles = [_uM([["info-item", _pS(_uM([["flexDirection", "row"]]))], ["info-text", _pS(_uM([["fontSize", 14]]))]])]
