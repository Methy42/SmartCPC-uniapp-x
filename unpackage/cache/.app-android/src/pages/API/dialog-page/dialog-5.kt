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
import io.dcloud.uniapp.extapi.closeDialogPage as uni_closeDialogPage
import io.dcloud.uniapp.framework.onShow
open class GenPagesAPIDialogPageDialog5 : BasePage {
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
        onPageShow(fun() {
            console.log("dialog 5 onShow", " at pages/API/dialog-page/dialog-5.uvue:48")
        }
        , __ins)
        onReady(fun() {
            val currentPage = this.`$page`
            this.pageBody = currentPage.pageBody
            this.safeAreaInsets = currentPage.safeAreaInsets
            this.width = currentPage.width
            this.height = currentPage.height
            this.statusBarHeight = currentPage.statusBarHeight
        }
        , __ins)
        onUnload(fun() {
            console.log("dialog 5 onUnload", " at pages/API/dialog-page/dialog-5.uvue:61")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("view", _uM("class" to "dialog-container"), _uA(
            _cE("view", _uM("class" to "dialog-content"), _uA(
                _cE("text", null, "title: " + _tD(_ctx.title), 1),
                if (_ctx.pageBody != null) {
                    _cE("view", _uM("key" to 0, "class" to "uni-common-mt flex-row"), _uA(
                        "pageBody: { top: ",
                        _cE("text", _uM("id" to "page-body-top"), _tD(_ctx.pageBody!!.top), 1),
                        ", right: ",
                        _cE("text", _uM("id" to "page-body-right"), _tD(_ctx.pageBody!!.right), 1),
                        ", bottom: ",
                        _cE("text", _uM("id" to "page-body-bottom"), _tD(_ctx.pageBody!!.bottom), 1),
                        ", left: ",
                        _cE("text", _uM("id" to "page-body-left"), _tD(_ctx.pageBody!!.left), 1),
                        ", width: ",
                        _cE("text", _uM("id" to "page-body-width"), _tD(_ctx.pageBody!!.width), 1),
                        ", height: ",
                        _cE("text", _uM("id" to "page-body-height"), _tD(_ctx.pageBody!!.height), 1),
                        " } "
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.safeAreaInsets != null) {
                    _cE("view", _uM("key" to 1, "class" to "uni-common-mt flex-row"), _uA(
                        "safeAreaInsets: { top: ",
                        _cE("text", _uM("id" to "page-safe-area-insets-top"), _tD(_ctx.safeAreaInsets!!.top), 1),
                        ", right: ",
                        _cE("text", _uM("id" to "page-safe-area-insets-right"), _tD(_ctx.safeAreaInsets!!.right), 1),
                        ", bottom: ",
                        _cE("text", _uM("id" to "page-safe-area-insets-bottom"), _tD(_ctx.safeAreaInsets!!.bottom), 1),
                        ", left: ",
                        _cE("text", _uM("id" to "page-safe-area-insets-left"), _tD(_ctx.safeAreaInsets!!.left), 1),
                        "} "
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.width != null) {
                    _cE("view", _uM("key" to 2, "class" to "uni-common-mt flex-row"), _uA(
                        "width: ",
                        _cE("text", null, _tD(_ctx.width!!), 1)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.height != null) {
                    _cE("view", _uM("key" to 3, "class" to "uni-common-mt flex-row"), _uA(
                        "height: ",
                        _cE("text", null, _tD(_ctx.height!!), 1)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (_ctx.statusBarHeight != null) {
                    _cE("view", _uM("key" to 4, "class" to "uni-common-mt flex-row"), _uA(
                        "statusBarHeight: ",
                        _cE("text", null, _tD(_ctx.statusBarHeight!!), 1)
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                _cE("button", _uM("class" to "mt-10", "onClick" to _ctx.closeThisDialog), " closeThisDialog ", 8, _uA(
                    "onClick"
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var pageBody: UniPageBody? by `$data`
    open var safeAreaInsets: UniSafeAreaInsets? by `$data`
    open var width: Number? by `$data`
    open var height: Number? by `$data`
    open var statusBarHeight: Number? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "dialog 5", "pageBody" to null as UniPageBody?, "safeAreaInsets" to null as UniSafeAreaInsets?, "width" to null as Number?, "height" to null as Number?, "statusBarHeight" to null as Number?)
    }
    open var closeThisDialog = ::gen_closeThisDialog_fn
    open fun gen_closeThisDialog_fn() {
        uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`, success = fun(res) {
            console.log("closeThisDialog success", res, " at pages/API/dialog-page/dialog-5.uvue:68")
        }
        , fail = fun(err) {
            console.log("closeThisDialog fail", err, " at pages/API/dialog-page/dialog-5.uvue:71")
        }
        , complete = fun(res) {
            console.log("closeThisDialog complete", res, " at pages/API/dialog-page/dialog-5.uvue:74")
        }
        ))
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
                return _uM("dialog-container" to _pS(_uM("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.3)", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "dialog-content" to _pS(_uM("width" to "80%", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "backgroundColor" to "#ffffff", "borderTopLeftRadius" to 6, "borderTopRightRadius" to 6, "borderBottomRightRadius" to 6, "borderBottomLeftRadius" to 6)), "mt-10" to _pS(_uM("marginTop" to 10)), "flex-row" to _pS(_uM("flexDirection" to "row", "flexWrap" to "wrap")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
