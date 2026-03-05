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
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import io.dcloud.uniapp.extapi.showModal as uni_showModal
open class GenPagesAPIUnicloudUnicloudCloudStorage : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {}, __ins)
        onUnload(fun() {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                    _cE("view", _uM("class" to "uni-btn-v uni-common-mt"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.uploadFile), "选择文件上传", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.chooseAndUploadFile), "一个接口选择文件并上传", 8, _uA(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ))
    }
    open var title: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "云存储")
    }
    open var uploadFile = ::gen_uploadFile_fn
    open fun gen_uploadFile_fn() {
        uni_chooseImage(ChooseImageOptions(count = 1, success = fun(res): Unit {
            uni_showLoading(ShowLoadingOptions(title = "上传中..."))
            val tempFilePath = res.tempFilePaths[0]
            uniCloud.uploadFile(UniCloudUploadFileOptions(filePath = tempFilePath, cloudPath = "test.jpg")).then(fun(res) {
                uni_hideLoading()
                console.log(res, " at pages/API/unicloud/unicloud/cloud-storage.uvue:44")
                uni_showModal(ShowModalOptions(content = "上传成功", showCancel = false))
            }
            ).`catch`(fun(err: Any?) {
                uni_hideLoading()
                val error = err as UniCloudError
                uni_showModal(ShowModalOptions(content = "上传失败，" + error.errMsg, showCancel = false))
            }
            )
        }
        , fail = fun(err): Unit {
            console.error("chooseImage fail: ", err, " at pages/API/unicloud/unicloud/cloud-storage.uvue:63")
        }
        ))
    }
    open var chooseAndUploadFile = ::gen_chooseAndUploadFile_fn
    open fun gen_chooseAndUploadFile_fn() {
        uniCloud.chooseAndUploadFile(UniCloudChooseAndUploadFileOptions(type = "image")).then(fun(res) {
            uni_hideLoading()
            console.log(res, " at pages/API/unicloud/unicloud/cloud-storage.uvue:72")
            uni_showModal(ShowModalOptions(content = "上传成功", showCancel = false))
        }
        ).`catch`(fun(err: Any?) {
            uni_hideLoading()
            val error = err as UniCloudError
            uni_showModal(ShowModalOptions(content = "上传失败，" + error.errMsg, showCancel = false))
        }
        )
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
