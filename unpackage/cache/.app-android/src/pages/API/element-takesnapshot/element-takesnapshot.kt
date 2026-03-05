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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.saveImageToPhotosAlbum as uni_saveImageToPhotosAlbum
import io.dcloud.uniapp.extapi.showActionSheet as uni_showActionSheet
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIElementTakesnapshotElementTakesnapshot : BasePage {
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
        return _cE("view", _uM("id" to "snapshot-content"), _uA(
            _cV(_component_page_head, _uM("title" to "对本页面根view截图")),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("text", null, "this is text")
            )),
            _cE("button", _uM("class" to "uni-btn btn-TakeSnapshot", "type" to "primary", "onClick" to _ctx.takeSnapshotClick), " 点击截图并替换显示下方图片 ", 8, _uA(
                "onClick"
            )),
            _cE("image", _uM("style" to _nS(_uM("margin-left" to "auto", "margin-right" to "auto", "margin-top" to "20px", "width" to "90%")), "src" to _ctx.snapImage, "mode" to _ctx.mode, "onLongpress" to _ctx.saveToAlbum), null, 44, _uA(
                "src",
                "mode",
                "onLongpress"
            ))
        ))
    }
    open var mode: String by `$data`
    open var snapImage: String by `$data`
    open var completeTriggered: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("mode" to "center", "snapImage" to "/static/uni.png", "completeTriggered" to false)
    }
    open var takeSnapshotClick = ::gen_takeSnapshotClick_fn
    open fun gen_takeSnapshotClick_fn() {
        val view = uni_getElementById("snapshot-content")!!
        view.takeSnapshot(TakeSnapshotOptions(success = fun(res){
            console.log("takeSnapshot success", res.tempFilePath, " at pages/API/element-takesnapshot/element-takesnapshot.uvue:30")
            this.snapImage = res.tempFilePath
            this.mode = "widthFix"
            uni_showToast(ShowToastOptions(title = "截图成功，路径：" + res.tempFilePath, icon = "none"))
        }
        , fail = fun(res){
            console.log("takeSnapshot fail", res, " at pages/API/element-takesnapshot/element-takesnapshot.uvue:39")
            uni_showToast(ShowToastOptions(icon = "error", title = "截图失败"))
        }
        , complete = fun(res){
            this.completeTriggered = true
            console.log("takeSnapshot complete", res, " at pages/API/element-takesnapshot/element-takesnapshot.uvue:47")
        }
        ))
    }
    open var saveToAlbum = ::gen_saveToAlbum_fn
    open fun gen_saveToAlbum_fn(e: TouchEvent) {
        var filePath: String = e.currentTarget!!.getAttribute("src") as String
        uni_showActionSheet(ShowActionSheetOptions(itemList = _uA(
            "保存"
        ), success = fun(res){
            if (res.tapIndex == 0) {
                uni_saveImageToPhotosAlbum(SaveImageToPhotosAlbumOptions(filePath = filePath, success = fun(_) {
                    uni_showToast(ShowToastOptions(position = "center", icon = "none", title = "图片保存成功，请到手机相册查看"))
                }
                , fail = fun(e) {
                    uni_showModal(ShowModalOptions(content = "保存相册失败，errCode：" + e.errCode + "，errMsg：" + e.errMsg + "，errSubject：" + e.errSubject, showCancel = false))
                }
                ))
            }
        }
        , fail = fun(_){}, complete = fun(_){}))
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(), _uA(
                GenApp.styles
            ))
        }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
