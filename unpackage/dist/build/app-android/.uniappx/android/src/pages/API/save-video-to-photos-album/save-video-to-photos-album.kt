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
import io.dcloud.uniapp.extapi.saveVideoToPhotosAlbum as uni_saveVideoToPhotosAlbum
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum : BasePage {
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
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("video", _uM("class" to "video", "src" to _ctx.src, "controls" to true), null, 8, _uA(
                    "src"
                )),
                _cE("button", _uM("type" to "primary", "class" to "margin-top-10", "onClick" to _ctx.saveVideo), "将视频保存到手机相册", 8, _uA(
                    "onClick"
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var src: String by `$data`
    open var success: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "saveVideoToPhotosAlbum", "src" to "/static/test-video/10second-demo.mp4", "success" to false)
    }
    open var saveVideo = ::gen_saveVideo_fn
    open fun gen_saveVideo_fn() {
        uni_saveVideoToPhotosAlbum(SaveVideoToPhotosAlbumOptions(filePath = this.src, success = fun(_){
            console.log("saveVideoToPhotosAlbum success")
            uni_showToast(ShowToastOptions(position = "center", icon = "none", title = "视频保存成功，请到手机相册查看"))
            this.success = true
        }
        , fail = fun(err){
            uni_showModal(ShowModalOptions(title = "保存视频到相册失败", content = JSON.stringify(err), showCancel = false))
            this.success = false
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
                return _uM("video" to _pS(_uM("alignSelf" to "center")), "margin-top-10" to _pS(_uM("marginTop" to 10)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
