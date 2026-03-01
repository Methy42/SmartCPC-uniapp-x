
  const __sfc__ = defineComponent({
    data() {
      return {
        class: 'box',
      }
    },
    methods: {
      start() {
        this.class = 'box ani'
      },
      reset() {
        this.class = 'box'
      },
      jest_start(){
        this.start()
      },
      jest_reset(){
        this.reset()
      },
    }
  })

export default __sfc__
function GenPagesCSSTransitionTransitionDurationRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", null, [
    _cE("view", _uM({
      class: _nC(_ctx.class)
    }), null, 2 /* CLASS */),
    _cE("button", _uM({ onClick: _ctx.start }), "start", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({ onClick: _ctx.reset }), "reset", 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesCSSTransitionTransitionDurationStyles = [_uM([["box", _pS(_uM([["width", 100], ["height", 100], ["backgroundColor", "#0000FF"]]))], ["ani", _pS(_uM([["transitionDuration", "5s"], ["width", 200]]))], ["@TRANSITION", _uM([["ani", _uM([["duration", "5s"]])]])]])]
