@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER", "NAME_SHADOWING", "UNNECESSARY_NOT_NULL_ASSERTION")
package uni.UNI2A1DFEF
import io.dcloud.uniapp.*
import io.dcloud.uniapp.extapi.*
import io.dcloud.uniapp.framework.*
import io.dcloud.uniapp.runtime.*
import io.dcloud.uniapp.vue.*
import io.dcloud.uniapp.vue.shared.*
import io.dcloud.unicloud.*
import io.dcloud.uts.*
import io.dcloud.uts.Map
import io.dcloud.uts.Set
import io.dcloud.uts.UTSAndroid
import kotlin.properties.Delegates
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentGlobalEventsGlobalEvents : BasePage {
    constructor(__ins: ComponentInternalInstance, __renderer: String?) : super(__ins, __renderer) {
        onLoad(fun(_: OnLoadOptions) {
            stat_instance.onLoad(this)
        }
        , __ins)
        onPageShow(fun() {
            stat_instance.onShow(this)
        }
        , __ins)
        onPageHide(fun() {
            stat_instance.onHide(this)
        }
        , __ins)
        onUnload(fun() {
            stat_instance.onUnload(this)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to "触摸方块测试相关事件")),
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt container"), _uA(
                _cE("view", _uM("class" to "target", "id" to "touch-target", "onTouchstart" to _ctx.onTouchStart, "onTouchcancel" to _ctx.onTouchCancel, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), null, 40, _uA(
                    "onTouchstart",
                    "onTouchcancel",
                    "onTouchmove",
                    "onTouchend"
                )),
                _cE("view", _uM("class" to "target", "id" to "longpress-target", "onClick" to _uA<Any?>(_ctx.onTap, _ctx.onClick), "onLongpress" to _ctx.onLongPress), null, 40, _uA(
                    "onClick",
                    "onLongpress"
                )),
                if (_ctx.touchStartEvent != null) {
                    _cE("view", _uM("key" to 0), _uA(
                        _cE("text", _uM("class" to "title1"), "touchStart Event: "),
                        _cE("text", _uM("class" to "title2"), "touches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchStartEvent!!.touches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-start-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-start-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-start-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-start-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-start-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-start-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-start-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128),
                        _cE("text", _uM("class" to "title2 uni-common-mt"), "changedTouches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchStartEvent!!.changedTouches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-start-changed-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.touchCancelEvent != null) {
                    _cE("view", _uM("key" to 1), _uA(
                        _cE("text", _uM("class" to "title1"), "touchCancel Event: "),
                        _cE("text", _uM("class" to "title2"), "touches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchCancelEvent!!.touches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-cancel-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128),
                        _cE("text", _uM("class" to "title2 uni-common-mt"), "changedTouches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchCancelEvent!!.changedTouches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-cancel-changed-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.touchMoveEvent != null) {
                    _cE("view", _uM("key" to 2), _uA(
                        _cE("text", _uM("class" to "title1"), "touchMove Event: "),
                        _cE("text", _uM("class" to "title2"), "touches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchMoveEvent!!.touches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-move-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-move-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-move-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-move-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-move-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-move-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-move-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128),
                        _cE("text", _uM("class" to "title2 uni-common-mt"), "changedTouches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchMoveEvent!!.changedTouches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-move-changed-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.touchEndEvent != null) {
                    _cE("view", _uM("key" to 3), _uA(
                        _cE("text", _uM("class" to "title1"), "touchEnd Event: "),
                        _cE("text", _uM("class" to "title2"), "touches: "),
                        if (_ctx.touchEndEvent!!.touches.length > 0) {
                            _cE(Fragment, _uM("key" to 0), RenderHelpers.renderList(_ctx.touchEndEvent!!.touches, fun(touch, index, __index, _cached): Any {
                                return _cE(Fragment, _uM("key" to index), _uA(
                                    _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "identifier: "),
                                        _cE("text", _uM("id" to "touch-end-touch-identifier"), _tD(touch.identifier), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "pageX: "),
                                        _cE("text", _uM("id" to "touch-end-touch-page-x"), _tD(touch.pageX), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "pageY: "),
                                        _cE("text", _uM("id" to "touch-end-touch-page-y"), _tD(touch.pageY), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "clientX: "),
                                        _cE("text", _uM("id" to "touch-end-touch-client-x"), _tD(touch.clientX), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "clientY: "),
                                        _cE("text", _uM("id" to "touch-end-touch-client-y"), _tD(touch.clientY), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "screenX: "),
                                        _cE("text", _uM("id" to "touch-end-touch-screen-x"), _tD(touch.screenX), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "screenY: "),
                                        _cE("text", _uM("id" to "touch-end-touch-screen-y"), _tD(touch.screenY), 1)
                                    ))
                                ), 64)
                            }), 128)
                        } else {
                            _cC("v-if", true)
                        },
                        _cE("text", _uM("class" to "title2 uni-common-mt"), "changedTouches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.touchEndEvent!!.changedTouches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "touch-end-changed-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.longPressEvent != null) {
                    _cE("view", _uM("key" to 4), _uA(
                        _cE("text", _uM("class" to "title1"), "longPress Event: "),
                        _cE("text", _uM("class" to "title2"), "touches: "),
                        if (_ctx.longPressEvent!!.touches.length > 0) {
                            _cE(Fragment, _uM("key" to 0), RenderHelpers.renderList(_ctx.longPressEvent!!.touches, fun(touch, index, __index, _cached): Any {
                                return _cE(Fragment, _uM("key" to index), _uA(
                                    _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "identifier: "),
                                        _cE("text", _uM("id" to "long-press-touch-identifier"), _tD(touch.identifier), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "pageX: "),
                                        _cE("text", _uM("id" to "long-press-touch-page-x"), _tD(touch.pageX), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "pageY: "),
                                        _cE("text", _uM("id" to "long-press-touch-page-y"), _tD(touch.pageY), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "clientX: "),
                                        _cE("text", _uM("id" to "long-press-touch-client-x"), _tD(touch.clientX), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "clientY: "),
                                        _cE("text", _uM("id" to "long-press-touch-client-y"), _tD(touch.clientY), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "screenX: "),
                                        _cE("text", _uM("id" to "long-press-touch-screen-x"), _tD(touch.screenX), 1)
                                    )),
                                    _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                        _cE("text", null, "screenY: "),
                                        _cE("text", _uM("id" to "long-press-touch-screen-y"), _tD(touch.screenY), 1)
                                    ))
                                ), 64)
                            }), 128)
                        } else {
                            _cC("v-if", true)
                        },
                        _cE("text", _uM("class" to "title2 uni-common-mt"), "changedTouches: "),
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.longPressEvent!!.changedTouches, fun(touch, index, __index, _cached): Any {
                            return _cE(Fragment, _uM("key" to index), _uA(
                                _cE("text", _uM("class" to "title3"), "touch[" + _tD(index) + "]:", 1),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "identifier: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-identifier"), _tD(touch.identifier), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageX: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-page-x"), _tD(touch.pageX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "pageY: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-page-y"), _tD(touch.pageY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientX: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-client-x"), _tD(touch.clientX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "clientY: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-client-y"), _tD(touch.clientY), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenX: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-screen-x"), _tD(touch.screenX), 1)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell"), _uA(
                                    _cE("text", null, "screenY: "),
                                    _cE("text", _uM("id" to "long-press-changed-touch-screen-y"), _tD(touch.screenY), 1)
                                ))
                            ), 64)
                        }), 128)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.tapEvent != null) {
                    _cE("view", _uM("key" to 5), _uA(
                        _cE("text", _uM("class" to "title1"), "tap Event: "),
                        _cE("view", _uM("class" to "uni-list-cell"), _uA(
                            _cE("text", null, "x: "),
                            _cE("text", _uM("id" to "tap-event-x"), _tD(_ctx.tapEvent!!.x), 1)
                        )),
                        _cE("view", _uM("class" to "uni-list-cell"), _uA(
                            _cE("text", null, "y: "),
                            _cE("text", _uM("id" to "tap-event-y"), _tD(_ctx.tapEvent!!.y), 1)
                        ))
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.clickEvent != null) {
                    _cE("view", _uM("key" to 6), _uA(
                        _cE("text", _uM("class" to "title1"), "click Event: "),
                        _cE("view", _uM("class" to "uni-list-cell"), _uA(
                            _cE("text", null, "x: "),
                            _cE("text", _uM("id" to "click-event-x"), _tD(_ctx.clickEvent!!.x), 1)
                        )),
                        _cE("view", _uM("class" to "uni-list-cell"), _uA(
                            _cE("text", null, "y: "),
                            _cE("text", _uM("id" to "click-event-y"), _tD(_ctx.clickEvent!!.y), 1)
                        ))
                    ))
                } else {
                    _cC("v-if", true)
                }
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var touchStartEvent: TouchEvent? by `$data`
    open var touchCancelEvent: TouchEvent? by `$data`
    open var touchMoveEvent: TouchEvent? by `$data`
    open var longPressEvent: TouchEvent? by `$data`
    open var touchEndEvent: TouchEvent? by `$data`
    open var tapEvent: PointerEvent? by `$data`
    open var clickEvent: PointerEvent? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "global-events", "touchStartEvent" to null as TouchEvent?, "touchCancelEvent" to null as TouchEvent?, "touchMoveEvent" to null as TouchEvent?, "longPressEvent" to null as TouchEvent?, "touchEndEvent" to null as TouchEvent?, "tapEvent" to null as PointerEvent?, "clickEvent" to null as PointerEvent?)
    }
    open var onTouchStart = ::gen_onTouchStart_fn
    open fun gen_onTouchStart_fn(e: TouchEvent) {
        this.touchStartEvent = e
        console.log("onTouchStart", e, " at pages/component/global-events/global-events.uvue:449")
    }
    open var onTouchCancel = ::gen_onTouchCancel_fn
    open fun gen_onTouchCancel_fn(e: TouchEvent) {
        this.touchCancelEvent = e
        console.log("onTouchCancel", " at pages/component/global-events/global-events.uvue:453")
    }
    open var onTouchMove = ::gen_onTouchMove_fn
    open fun gen_onTouchMove_fn(e: TouchEvent) {
        this.touchMoveEvent = e
        console.log("onTouchMove", e, " at pages/component/global-events/global-events.uvue:457")
    }
    open var onLongPress = ::gen_onLongPress_fn
    open fun gen_onLongPress_fn(e: TouchEvent) {
        this.longPressEvent = e
        console.log("onLongPress", e, " at pages/component/global-events/global-events.uvue:461")
    }
    open var onTouchEnd = ::gen_onTouchEnd_fn
    open fun gen_onTouchEnd_fn(e: TouchEvent) {
        this.touchEndEvent = e
        console.log("onTouchEnd", e, " at pages/component/global-events/global-events.uvue:465")
    }
    open var onTap = ::gen_onTap_fn
    open fun gen_onTap_fn(e: PointerEvent) {
        this.tapEvent = e
        console.log("onTap", e, " at pages/component/global-events/global-events.uvue:469")
    }
    open var onClick = ::gen_onClick_fn
    open fun gen_onClick_fn(e: PointerEvent) {
        this.clickEvent = e
        console.log("onClick", e, " at pages/component/global-events/global-events.uvue:473")
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("container" to _pS(_uM("paddingBottom" to 10)), "target" to _pS(_uM("marginTop" to 20, "marginRight" to 0, "marginBottom" to 0, "marginLeft" to 50, "width" to 200, "height" to 100, "backgroundColor" to "#00FFFF")), "title1" to _pS(_uM("marginTop" to 15, "fontSize" to 20)), "title2" to _pS(_uM("marginTop" to 10, "fontSize" to 18)), "title3" to _pS(_uM("marginTop" to 5, "fontSize" to 16)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
