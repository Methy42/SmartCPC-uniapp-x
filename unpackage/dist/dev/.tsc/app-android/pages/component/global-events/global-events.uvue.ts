
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'global-events',
        touchStartEvent: null as TouchEvent | null,
        touchCancelEvent: null as TouchEvent | null,
        touchMoveEvent: null as TouchEvent | null,
        longPressEvent: null as TouchEvent | null,
        touchEndEvent: null as TouchEvent | null,
        tapEvent: null as PointerEvent | null,
        clickEvent: null as PointerEvent | null,
      }
    },
    methods: {
      onTouchStart(e : TouchEvent) {
        this.touchStartEvent = e
        console.log('onTouchStart', e, " at pages/component/global-events/global-events.uvue:449")
      },
      onTouchCancel(e : TouchEvent) {
        this.touchCancelEvent = e
        console.log('onTouchCancel', " at pages/component/global-events/global-events.uvue:453")
      },
      onTouchMove(e : TouchEvent) {
        this.touchMoveEvent = e
        console.log('onTouchMove', e, " at pages/component/global-events/global-events.uvue:457")
      },
      onLongPress(e : TouchEvent) {
        this.longPressEvent = e
        console.log('onLongPress', e, " at pages/component/global-events/global-events.uvue:461")
      },
      onTouchEnd(e : TouchEvent) {
        this.touchEndEvent = e
        console.log('onTouchEnd', e, " at pages/component/global-events/global-events.uvue:465")
      },
      onTap(e : PointerEvent) {
        this.tapEvent = e
        console.log('onTap', e, " at pages/component/global-events/global-events.uvue:469")
      },
      onClick(e : PointerEvent) {
        this.clickEvent = e
        console.log('onClick', e, " at pages/component/global-events/global-events.uvue:473")
      }
    },
  })

export default __sfc__
function GenPagesComponentGlobalEventsGlobalEventsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_page_head, _uM({ title: "触摸方块测试相关事件" })),
    _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt container" }), [
      _cE("view", _uM({
        class: "target",
        id: "touch-target",
        onTouchstart: _ctx.onTouchStart,
        onTouchcancel: _ctx.onTouchCancel,
        onTouchmove: _ctx.onTouchMove,
        onTouchend: _ctx.onTouchEnd
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchcancel", "onTouchmove", "onTouchend"]),
      _cE("view", _uM({
        class: "target",
        id: "longpress-target",
        onClick: [_ctx.onTap, _ctx.onClick] as Array<any | null>,
        onLongpress: _ctx.onLongPress
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["onClick", "onLongpress"]),
      _ctx.touchStartEvent !== null
        ? _cE("view", _uM({ key: 0 }), [
            _cE("text", _uM({ class: "title1" }), "touchStart Event: "),
            _cE("text", _uM({ class: "title2" }), "touches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchStartEvent!.touches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-start-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-start-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-start-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-start-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-start-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-start-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-start-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */),
            _cE("text", _uM({ class: "title2 uni-common-mt" }), "changedTouches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchStartEvent!.changedTouches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-start-changed-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */)
          ])
        : _cC("v-if", true),
      _ctx.touchCancelEvent !== null
        ? _cE("view", _uM({ key: 1 }), [
            _cE("text", _uM({ class: "title1" }), "touchCancel Event: "),
            _cE("text", _uM({ class: "title2" }), "touches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchCancelEvent!.touches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-cancel-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */),
            _cE("text", _uM({ class: "title2 uni-common-mt" }), "changedTouches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchCancelEvent!.changedTouches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-cancel-changed-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */)
          ])
        : _cC("v-if", true),
      _ctx.touchMoveEvent !== null
        ? _cE("view", _uM({ key: 2 }), [
            _cE("text", _uM({ class: "title1" }), "touchMove Event: "),
            _cE("text", _uM({ class: "title2" }), "touches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchMoveEvent!.touches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-move-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-move-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-move-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-move-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-move-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-move-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-move-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */),
            _cE("text", _uM({ class: "title2 uni-common-mt" }), "changedTouches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchMoveEvent!.changedTouches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-move-changed-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */)
          ])
        : _cC("v-if", true),
      _ctx.touchEndEvent !== null
        ? _cE("view", _uM({ key: 3 }), [
            _cE("text", _uM({ class: "title1" }), "touchEnd Event: "),
            _cE("text", _uM({ class: "title2" }), "touches: "),
            _ctx.touchEndEvent!.touches.length > 0
              ? _cE(Fragment, _uM({ key: 0 }), RenderHelpers.renderList(_ctx.touchEndEvent!.touches, (touch, index, __index, _cached): any => {
                  return _cE(Fragment, _uM({ key: index }), [
                    _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "identifier: "),
                      _cE("text", _uM({ id: "touch-end-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "pageX: "),
                      _cE("text", _uM({ id: "touch-end-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "pageY: "),
                      _cE("text", _uM({ id: "touch-end-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "clientX: "),
                      _cE("text", _uM({ id: "touch-end-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "clientY: "),
                      _cE("text", _uM({ id: "touch-end-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "screenX: "),
                      _cE("text", _uM({ id: "touch-end-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "screenY: "),
                      _cE("text", _uM({ id: "touch-end-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                    ])
                  ], 64 /* STABLE_FRAGMENT */)
                }), 128 /* KEYED_FRAGMENT */)
              : _cC("v-if", true),
            _cE("text", _uM({ class: "title2 uni-common-mt" }), "changedTouches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchEndEvent!.changedTouches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "touch-end-changed-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */)
          ])
        : _cC("v-if", true),
      _ctx.longPressEvent !== null
        ? _cE("view", _uM({ key: 4 }), [
            _cE("text", _uM({ class: "title1" }), "longPress Event: "),
            _cE("text", _uM({ class: "title2" }), "touches: "),
            _ctx.longPressEvent!.touches.length > 0
              ? _cE(Fragment, _uM({ key: 0 }), RenderHelpers.renderList(_ctx.longPressEvent!.touches, (touch, index, __index, _cached): any => {
                  return _cE(Fragment, _uM({ key: index }), [
                    _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "identifier: "),
                      _cE("text", _uM({ id: "long-press-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "pageX: "),
                      _cE("text", _uM({ id: "long-press-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "pageY: "),
                      _cE("text", _uM({ id: "long-press-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "clientX: "),
                      _cE("text", _uM({ id: "long-press-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "clientY: "),
                      _cE("text", _uM({ id: "long-press-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "screenX: "),
                      _cE("text", _uM({ id: "long-press-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                    ]),
                    _cE("view", _uM({ class: "uni-list-cell" }), [
                      _cE("text", null, "screenY: "),
                      _cE("text", _uM({ id: "long-press-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                    ])
                  ], 64 /* STABLE_FRAGMENT */)
                }), 128 /* KEYED_FRAGMENT */)
              : _cC("v-if", true),
            _cE("text", _uM({ class: "title2 uni-common-mt" }), "changedTouches: "),
            _cE(Fragment, null, RenderHelpers.renderList(_ctx.longPressEvent!.changedTouches, (touch, index, __index, _cached): any => {
              return _cE(Fragment, _uM({ key: index }), [
                _cE("text", _uM({ class: "title3" }), "touch[" + _tD(index) + "]:", 1 /* TEXT */),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "identifier: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-identifier" }), _tD(touch.identifier), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageX: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-page-x" }), _tD(touch.pageX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "pageY: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-page-y" }), _tD(touch.pageY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientX: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-client-x" }), _tD(touch.clientX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "clientY: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-client-y" }), _tD(touch.clientY), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenX: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-screen-x" }), _tD(touch.screenX), 1 /* TEXT */)
                ]),
                _cE("view", _uM({ class: "uni-list-cell" }), [
                  _cE("text", null, "screenY: "),
                  _cE("text", _uM({ id: "long-press-changed-touch-screen-y" }), _tD(touch.screenY), 1 /* TEXT */)
                ])
              ], 64 /* STABLE_FRAGMENT */)
            }), 128 /* KEYED_FRAGMENT */)
          ])
        : _cC("v-if", true),
      _ctx.tapEvent !== null
        ? _cE("view", _uM({ key: 5 }), [
            _cE("text", _uM({ class: "title1" }), "tap Event: "),
            _cE("view", _uM({ class: "uni-list-cell" }), [
              _cE("text", null, "x: "),
              _cE("text", _uM({ id: "tap-event-x" }), _tD(_ctx.tapEvent!.x), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "uni-list-cell" }), [
              _cE("text", null, "y: "),
              _cE("text", _uM({ id: "tap-event-y" }), _tD(_ctx.tapEvent!.y), 1 /* TEXT */)
            ])
          ])
        : _cC("v-if", true),
      _ctx.clickEvent !== null
        ? _cE("view", _uM({ key: 6 }), [
            _cE("text", _uM({ class: "title1" }), "click Event: "),
            _cE("view", _uM({ class: "uni-list-cell" }), [
              _cE("text", null, "x: "),
              _cE("text", _uM({ id: "click-event-x" }), _tD(_ctx.clickEvent!.x), 1 /* TEXT */)
            ]),
            _cE("view", _uM({ class: "uni-list-cell" }), [
              _cE("text", null, "y: "),
              _cE("text", _uM({ id: "click-event-y" }), _tD(_ctx.clickEvent!.y), 1 /* TEXT */)
            ])
          ])
        : _cC("v-if", true)
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentGlobalEventsGlobalEventsStyles = [_uM([["container", _pS(_uM([["paddingBottom", 10]]))], ["target", _pS(_uM([["marginTop", 20], ["marginRight", 0], ["marginBottom", 0], ["marginLeft", 50], ["width", 200], ["height", 100], ["backgroundColor", "#00FFFF"]]))], ["title1", _pS(_uM([["marginTop", 15], ["fontSize", 20]]))], ["title2", _pS(_uM([["marginTop", 10], ["fontSize", 18]]))], ["title3", _pS(_uM([["marginTop", 5], ["fontSize", 16]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
