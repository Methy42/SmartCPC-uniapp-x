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
import io.dcloud.uniapp.extapi.downloadFile as uni_downloadFile
import io.dcloud.uniapp.extapi.env as uni_env
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.request as uni_request
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import uts.sdk.modules.testInvokeNetworkApi.testInovkeDownloadFile
import uts.sdk.modules.testInvokeNetworkApi.testInovkeRequest
import uts.sdk.modules.testInvokeNetworkApi.CommonOptions
open class GenPagesAPIDownloadFileDownloadFile : BasePage {
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
        onUnload(fun() {
            uni_hideLoading()
            this.task?.abort()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("view", null, _uA(
                    if (isTrue(_ctx.imageSrc)) {
                        _cE("view", _uM("key" to 0), _uA(
                            _cE("image", _uM("class" to "img", "src" to _ctx.imageSrc, "mode" to "aspectFit"), null, 8, _uA(
                                "src"
                            ))
                        ))
                    } else {
                        _cE("view", _uM("key" to 1, "style" to _nS(_uM("margin" to "10px"))), _uA(
                            _cE("text", _uM("class" to "uni-hello-text"), "点击按钮下载服务端示例图片（下载网络文件到本地临时目录）"),
                            _cE("button", _uM("type" to "primary", "onClick" to _ctx.downloadImage), "下载", 8, _uA(
                                "onClick"
                            ))
                        ), 4)
                    }
                    ,
                    _cE("view", _uM("style" to _nS(_uM("margin" to "10px"))), _uA(
                        _cE("text", _uM("class" to "uni-hello-text"), "下载接口的Content-Disposition中的filename非法值例子"),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.downloadErrorFilename), "下载", 8, _uA(
                            "onClick"
                        ))
                    ), 4)
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var imageSrc: String by `$data`
    open var task: DownloadTask? by `$data`
    open var jest_result: Boolean by `$data`
    open var jest_callback_triggred: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "downloadFile", "imageSrc" to "", "task" to null as DownloadTask?, "jest_result" to false, "jest_callback_triggred" to false)
    }
    open var downloadImage = ::gen_downloadImage_fn
    open fun gen_downloadImage_fn() {
        uni_showLoading(ShowLoadingOptions(title = "下载中"))
        var self = this
        this.task = uni_downloadFile(DownloadFileOptions(url = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png", success = fun(res){
            console.log("downloadFile success, res is", res.tempFilePath, " at pages/API/download-file/download-file.uvue:60")
            self.imageSrc = res.tempFilePath
        }
        , fail = fun(err){
            console.log("downloadFile fail, err is:", err, " at pages/API/download-file/download-file.uvue:64")
        }
        , complete = fun(res){
            uni_hideLoading()
            this.task = null
        }
        ))
        this.task?.onProgressUpdate(fun(update){
            console.log("progress : ", update.progress, " at pages/API/download-file/download-file.uvue:72")
        }
        )
    }
    open var downloadErrorFilename = ::gen_downloadErrorFilename_fn
    open fun gen_downloadErrorFilename_fn() {
        uni_downloadFile(DownloadFileOptions(url = "https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/file/test9.txt", success = fun(res){
            console.log("downloadFile success, res is", res.tempFilePath, " at pages/API/download-file/download-file.uvue:79")
        }
        , fail = fun(err){
            console.log("downloadFile fail, err is:", err, " at pages/API/download-file/download-file.uvue:82")
        }
        ))
    }
    open var jest_downloadFile = ::gen_jest_downloadFile_fn
    open fun gen_jest_downloadFile_fn() {
        uni_downloadFile(DownloadFileOptions(url = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png", success = fun(_){
            this.jest_result = true
            this.jest_callback_triggred = true
        }
        , fail = fun(_){
            this.jest_result = false
            this.jest_callback_triggred = true
        }
        ))
    }
    open var jest_downloadFile_with_uni_env = ::gen_jest_downloadFile_with_uni_env_fn
    open fun gen_jest_downloadFile_with_uni_env_fn() {
        uni_downloadFile(DownloadFileOptions(url = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni-app.png", filePath = "" + uni_env.CACHE_PATH + "/a/b/", success = fun(_){
            this.jest_result = true
            this.jest_callback_triggred = true
        }
        , fail = fun(_){
            this.jest_result = false
            this.jest_callback_triggred = true
        }
        ))
    }
    open var jest_set_cookie = ::gen_jest_set_cookie_fn
    open fun gen_jest_set_cookie_fn() {
        uni_request<Any>(RequestOptions(url = "https://request.dcloud.net.cn/api/http/header/setCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = true, firstIpv4 = false, success = fun(_){
            this.jest_cookie_download(true)
        }
        , fail = fun(_){
            this.jest_result = false
            this.jest_callback_triggred = true
        }
        ))
    }
    open var jest_delete_cookie = ::gen_jest_delete_cookie_fn
    open fun gen_jest_delete_cookie_fn() {
        uni_request<Any>(RequestOptions(url = "https://request.dcloud.net.cn/api/http/header/deleteCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = true, firstIpv4 = false, success = fun(_){
            this.jest_cookie_download(false)
        }
        , fail = fun(_){
            this.jest_result = false
            this.jest_callback_triggred = true
        }
        ))
    }
    open var jest_cookie_download = ::gen_jest_cookie_download_fn
    open fun gen_jest_cookie_download_fn(needCookie: Boolean) {
        uni_downloadFile(DownloadFileOptions(url = "https://request.dcloud.net.cn/api/http/header/download", success = fun(_){
            this.jest_result = if (needCookie) {
                true
            } else {
                false
            }
            this.jest_callback_triggred = true
        }
        , fail = fun(_){
            this.jest_result = if (needCookie) {
                false
            } else {
                true
            }
        }
        ))
    }
    open var jest_uts_module_invoked = ::gen_jest_uts_module_invoked_fn
    open fun gen_jest_uts_module_invoked_fn() {
        testInovkeDownloadFile(CommonOptions(success = fun(res: Any){
            this.jest_result = true
            this.jest_callback_triggred = true
        }
        , fail = fun(err: Any){
            this.jest_result = false
            this.jest_callback_triggred = true
        }
        ))
    }
    open var jest_special_characters_download = ::gen_jest_special_characters_download_fn
    open fun gen_jest_special_characters_download_fn() {
        uni_downloadFile(DownloadFileOptions(url = "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/1789834995055525889-你好%23你好.png", success = fun(res: DownloadFileSuccess){
            this.jest_result = true
            this.jest_callback_triggred = true
        }
        , fail = fun(_){
            this.jest_result = false
            this.jest_callback_triggred = true
        }
        ))
    }
    open var jest_download_call_timeout = ::gen_jest_download_call_timeout_fn
    open fun gen_jest_download_call_timeout_fn() {
        uni_downloadFile(DownloadFileOptions(url = "https://web-assets.dcloud.net.cn/video/sample/2minute-demo-10k.mp4", timeout = 3000, fail = fun(_){
            this.jest_result = false
        }
        ))
        setTimeout(fun(){
            this.jest_result = true
        }
        , 4000)
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
                return _uM("img" to _pS(_uM("marginTop" to 0, "marginRight" to "auto", "marginBottom" to 0, "marginLeft" to "auto")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
