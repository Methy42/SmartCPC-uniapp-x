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
import io.dcloud.uniapp.extapi.getFileSystemManager as uni_getFileSystemManager
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.request as uni_request
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.showToast as uni_showToast
import uts.sdk.modules.testInvokeNetworkApi.testInovkeRequest
import uts.sdk.modules.testInvokeNetworkApi.CommonOptions
open class GenPagesAPIRequestRequest : BasePage {
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
        return _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE("view", _uM("class" to "uni-common-mt", "style" to _nS(_uM("border-width" to "2px", "border-style" to "solid", "border-radius" to "4px"))), _uA(
                    _cE("textarea", _uM("value" to _ctx.res, "class" to "uni-textarea", "style" to _nS(_uM("width" to "100%"))), null, 12, _uA(
                        "value"
                    ))
                ), 4),
                _cE("view", null, _uA(
                    _cE("text", null, "地址 : " + _tD(_ctx.host + _ctx.url), 1),
                    _cE("text", null, "请求方式 : " + _tD(_ctx.method), 1)
                )),
                _cE("view", _uM("class" to "uni-btn-v uni-common-mt"), _uA(
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.sendRequest), "发起请求", 8, _uA(
                        "onClick"
                    ))
                ))
            )),
            _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1")), "show-scrollbar" to "true"), _uA(
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "设置请求方式"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row", "flex-wrap" to "wrap"))), _uA(
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("GET")
                        }
                        ), "GET", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("POST")
                        }
                        ), "POST", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("PUT")
                        }
                        ), "PUT", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("DELETE")
                        }
                        ), "DELETE", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("PATCH")
                        }
                        ), "PATCH", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px", "margin-right" to "10px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("OPTIONS")
                        }
                        ), "OPTIONS", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.changeMethod("HEAD")
                        }
                        ), "HEAD", 12, _uA(
                            "onClick"
                        ))
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "请求返回错误码的接口（默认为GET）"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row", "flex-wrap" to "wrap"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.errorCodeUrls, fun(item, index, __index, _cached): Any {
                            return _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrl(item)
                            }
                            ), _tD(item), 13, _uA(
                                "onClick"
                            ))
                        }
                        ), 128)
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "请求不同header的接口（默认为GET）"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row", "flex-wrap" to "wrap"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.headerUrls, fun(item, index, __index, _cached): Any {
                            return _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrl(item)
                            }
                            ), _tD(item), 13, _uA(
                                "onClick"
                            ))
                        }
                        ), 128)
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "请求不同content-type的接口（默认为GET）"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row", "flex-wrap" to "wrap"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.contentTypeUrls, fun(item, index, __index, _cached): Any {
                            return _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrl(item)
                            }
                            ), _tD(item), 13, _uA(
                                "onClick"
                            ))
                        }
                        ), 128)
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "POST请求(有body)"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row", "flex-wrap" to "wrap"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.postUrls, fun(item, index, __index, _cached): Any {
                            return _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "key" to index, "onClick" to fun(){
                                _ctx.changeUrlFromPost(item)
                            }
                            ), _tD(item), 13, _uA(
                                "onClick"
                            ))
                        }
                        ), 128)
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "ArrayBuffer 测试"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row", "flex-wrap" to "wrap"))), _uA(
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.sendArrayBuffer(false)
                        }
                        ), "请求body为ArrayBuffer，response也为ArrayBuffer", 12, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("style" to _nS(_uM("padding" to "5px")), "type" to "primary", "size" to "mini", "onClick" to fun(){
                            _ctx.sendArrayBuffer(true)
                        }
                        ), "请求response为ArrayBuffer", 12, _uA(
                            "onClick"
                        ))
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("padding" to "20px"))), _uA(
                    _cE("text", null, "RequestTask 测试"),
                    _cE("view", _uM("class" to "uni-common-pb")),
                    _cE("button", _uM("type" to "primary", "onClick" to _ctx.sendChunkRequest), "流式请求", 8, _uA(
                        "onClick"
                    ))
                ), 4),
                _cE("view", _uM("class" to "uni-common-pb")),
                _cE("view", _uM("class" to "uni-common-pb"))
            ), 4)
        ), 4)
    }
    open var title: String by `$data`
    open var res: String by `$data`
    open var task: RequestTask? by `$data`
    open var host: String by `$data`
    open var url: String by `$data`
    open var method: RequestMethod? by `$data`
    open var data: Any? by `$data`
    open var header: UTSJSONObject? by `$data`
    open var errorCodeUrls: UTSArray<String> by `$data`
    open var headerUrls: UTSArray<String> by `$data`
    open var contentTypeUrls: UTSArray<String> by `$data`
    open var postUrls: UTSArray<String> by `$data`
    open var jest_requestTask_result: Boolean by `$data`
    open var jest_result: Boolean by `$data`
    open var jest_result_data: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "request", "res" to "", "task" to null as RequestTask?, "host" to "https://request.dcloud.net.cn", "url" to "/api/http/method/get", "method" to "GET" as RequestMethod?, "data" to null as Any?, "header" to null as UTSJSONObject?, "errorCodeUrls" to _uA(
            "/api/http/statusCode/200",
            "/api/http/statusCode/204",
            "/api/http/statusCode/301",
            "/api/http/statusCode/302",
            "/api/http/statusCode/307",
            "/api/http/statusCode/400",
            "/api/http/statusCode/401",
            "/api/http/statusCode/403",
            "/api/http/statusCode/404",
            "/api/http/statusCode/405",
            "/api/http/statusCode/500",
            "/api/http/statusCode/502",
            "/api/http/statusCode/503",
            "/api/http/statusCode/504"
        ), "headerUrls" to _uA(
            "/api/http/header/ua",
            "/api/http/header/referer",
            "/api/http/header/requestCookie",
            "/api/http/header/setCookie",
            "/api/http/header/deleteCookie"
        ), "contentTypeUrls" to _uA(
            "/api/http/contentType/text/plain",
            "/api/http/contentType/text/html",
            "/api/http/contentType/text/xml",
            "/api/http/contentType/image/gif",
            "/api/http/contentType/image/jpeg",
            "/api/http/contentType/image/png",
            "/api/http/contentType/application/json",
            "/api/http/contentType/application/octetStream"
        ), "postUrls" to _uA(
            "/api/http/contentType/json",
            "/api/http/contentType/xWwwFormUrlencoded"
        ), "jest_requestTask_result" to false, "jest_result" to false, "jest_result_data" to "")
    }
    open var sendChunkRequest = ::gen_sendChunkRequest_fn
    open fun gen_sendChunkRequest_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/request/requestTask"))
    }
    open var changeMethod = ::gen_changeMethod_fn
    open fun gen_changeMethod_fn(e: RequestMethod) {
        this.method = e
        this.url = methodMap[e] as String
        this.data = null
        this.header = null
    }
    open var changeUrl = ::gen_changeUrl_fn
    open fun gen_changeUrl_fn(e: String) {
        this.method = "GET"
        this.url = e
        this.data = null
        this.header = null
    }
    open var changeUrlFromPost = ::gen_changeUrlFromPost_fn
    open fun gen_changeUrlFromPost_fn(e: String) {
        this.method = "POST"
        this.url = e
        when (e) {
            "/api/http/contentType/json" -> 
                {
                    this.header = object : UTSJSONObject() {
                        var `Content-Type` = "application/json"
                    }
                    this.data = object : UTSJSONObject() {
                        var hello = "world"
                    }
                }
            "/api/http/contentType/xWwwFormUrlencoded" -> 
                {
                    this.header = object : UTSJSONObject() {
                        var `Content-Type` = "application/x-www-form-urlencoded"
                    }
                    this.data = "hello=world"
                }
        }
    }
    open var sendArrayBuffer = ::gen_sendArrayBuffer_fn
    open fun gen_sendArrayBuffer_fn(onlyResponse: Boolean) {
        this.method = "POST"
        this.url = "/api/http/contentType/arrayBuffer/post"
        if (onlyResponse) {
            this.header = object : UTSJSONObject() {
                var `Content-Type` = "application/json"
            }
            this.data = object : UTSJSONObject() {
                var hello = "world"
            }
            uni_showLoading(ShowLoadingOptions(title = "请求中..."))
            this.task = uni_request<ArrayBuffer>(RequestOptions(url = this.host + this.url, method = this.method, data = this.data, header = this.header, timeout = 60000, sslVerify = false, withCredentials = false, responseType = "arraybuffer", firstIpv4 = false, success = fun(res){
                if (res.data != null) {
                    var uint8 = Uint8Array(res.data as ArrayBuffer)
                    console.log("request success", uint8.toString())
                    this.res = "请求结果 : " + uint8.toString()
                    console.log("request success header is :", JSON.stringify(res.header))
                    uni_showToast(ShowToastOptions(title = "请求成功", icon = "success", mask = true, duration = duration))
                } else {
                    uni_showModal(ShowModalOptions(content = "error", showCancel = false))
                }
            }, fail = fun(err){
                console.log("request fail", err)
                uni_showModal(ShowModalOptions(content = err.errMsg, showCancel = false))
            }, complete = fun(_){
                uni_hideLoading()
                this.task = null
            }))
        } else {
            uni_chooseImage(ChooseImageOptions(count = 1, albumMode = "system", sizeType = _uA(
                "original"
            ), sourceType = _uA(
                "album"
            ), success = fun(e){
                console.log(e.tempFilePaths[0])
                uni_getFileSystemManager().readFile(ReadFileOptions(filePath = e.tempFilePaths[0], success = fun(res){
                    this.data = res.data as ArrayBuffer
                    this.header = object : UTSJSONObject() {
                        var `Content-Type` = "application/octet-stream"
                    }
                    uni_showLoading(ShowLoadingOptions(title = "请求中..."))
                    this.task = uni_request<ArrayBuffer>(RequestOptions(url = this.host + this.url, method = this.method, data = this.data, header = this.header, timeout = 60000, sslVerify = false, withCredentials = false, firstIpv4 = false, responseType = "arraybuffer", success = fun(res){
                        console.log()
                        if (res.data != null) {
                            uni_showToast(ShowToastOptions(title = "请求成功", icon = "success", mask = true, duration = duration))
                            this.res = "请求结果 : byteLength=" + (res.data as ArrayBuffer).byteLength
                            console.log("request success header is :", JSON.stringify(res.header))
                        } else {
                            uni_showModal(ShowModalOptions(content = "error", showCancel = false))
                        }
                    }
                    , fail = fun(err){
                        console.log("request fail", err)
                        uni_showModal(ShowModalOptions(content = err.errMsg, showCancel = false))
                    }
                    , complete = fun(_){
                        uni_hideLoading()
                        this.task = null
                    }
                    ))
                }
                ))
            }
            ))
        }
    }
    open var sendRequest = ::gen_sendRequest_fn
    open fun gen_sendRequest_fn() {
        uni_showLoading(ShowLoadingOptions(title = "请求中..."))
        this.task = uni_request<Any>(RequestOptions(url = this.host + this.url, method = this.method, data = this.data, header = this.header, timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res){
            console.log("request success", JSON.stringify(res.data))
            console.log("request success header is :", JSON.stringify(res.header))
            uni_showToast(ShowToastOptions(title = "请求成功", icon = "success", mask = true, duration = duration))
            this.res = "请求结果 : " + JSON.stringify(res)
        }
        , fail = fun(err){
            console.log("request fail", err)
            uni_showModal(ShowModalOptions(content = err.errMsg, showCancel = false))
        }
        , complete = fun(_){
            uni_hideLoading()
            this.task = null
        }
        ))
    }
    open var jest_request = ::gen_jest_request_fn
    open fun gen_jest_request_fn() {
        uni_request<Any>(RequestOptions(url = this.host + this.url, method = this.method, data = this.data, header = this.header, timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
            this.jest_result = true
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_set_cookie = ::gen_jest_set_cookie_fn
    open fun gen_jest_set_cookie_fn() {
        uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/setCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
            this.jest_cookie_request(true)
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_set_cookie_expires = ::gen_jest_set_cookie_expires_fn
    open fun gen_jest_set_cookie_expires_fn() {
        uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/setCookie?expires=5", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
            this.jest_cookie_request(true)
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_delete_cookie = ::gen_jest_delete_cookie_fn
    open fun gen_jest_delete_cookie_fn() {
        uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/deleteCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
            this.jest_cookie_request(false)
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_cookie_request = ::gen_jest_cookie_request_fn
    open fun gen_jest_cookie_request_fn(needCookie: Boolean) {
        uni_request<Any>(RequestOptions(url = this.host + "/api/http/header/requestCookie", method = "GET", timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res){
            val requestCookie = (res.data as UTSJSONObject).getJSON("data")?.getAny("requestCookie")
            this.jest_result_data = JSON.stringify(requestCookie)
            if (requestCookie is UTSArray<*>) {
                this.jest_result = if (needCookie) {
                    (requestCookie as UTSArray<Any>).length > 0
                } else {
                    (requestCookie as UTSArray<Any>).length == 0
                }
            } else {
                this.jest_result = if (needCookie) {
                    (requestCookie as UTSJSONObject).toMap().size > 0
                } else {
                    (requestCookie as UTSJSONObject).toMap().size == 0
                }
            }
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_timeout_null = ::gen_jest_timeout_null_fn
    open fun gen_jest_timeout_null_fn() {
        uni_request<Any>(RequestOptions(url = this.host + (methodMap["GET"] as String), method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
            this.jest_result = true
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_get_with_data = ::gen_jest_get_with_data_fn
    open fun gen_jest_get_with_data_fn() {
        uni_request<Any>(RequestOptions(url = "https://unidemo.dcloud.net.cn/api/banner/36kr", method = "GET", data = object : UTSJSONObject() {
            var column = "id,post_id,title,author_name,cover,published_at"
        }, timeout = 6000, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(_){
            this.jest_result = true
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_get_with_generics = ::gen_jest_get_with_generics_fn
    open fun gen_jest_get_with_generics_fn() {
        uni_request<GETDataType>(RequestOptions(url = this.host + (methodMap["GET"] as String), method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res: RequestSuccess<GETDataType>){
            this.jest_result = true
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_get_array = ::gen_jest_get_array_fn
    open fun gen_jest_get_array_fn() {
        uni_request<UTSArray<UTSJSONObject>>(RequestOptions(url = "https://unidemo.dcloud.net.cn/api/news?column=title,author_name,cover,published_at", method = "GET", success = fun(res: RequestSuccess<UTSArray<UTSJSONObject>>){
            if (res.statusCode == 200 && UTSArray.isArray(res.data)) {
                this.jest_result = true
            } else {
                this.jest_result = false
            }
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_uts_module_invoked = ::gen_jest_uts_module_invoked_fn
    open fun gen_jest_uts_module_invoked_fn() {
        this.jest_result = false
        testInovkeRequest(CommonOptions(success = fun(res: Any){
            this.jest_result = true
        }
        , fail = fun(err: Any){
            this.jest_result = false
        }
        ))
    }
    open var jest_respone_json_string = ::gen_jest_respone_json_string_fn
    open fun gen_jest_respone_json_string_fn() {
        uni_request<Any>(RequestOptions(url = "https://request.dcloud.net.cn/api/http/contentType/text/json", success = fun(res: RequestSuccess<Any>){
            this.jest_result = UTSAndroid.`typeof`(res.data) == "object"
        }
        , fail = fun(e: RequestFail){
            this.jest_result = false
        }
        ))
    }
    open var jest_respone_with_string_generics = ::gen_jest_respone_with_string_generics_fn
    open fun gen_jest_respone_with_string_generics_fn() {
        uni_request<String>(RequestOptions(url = this.host + (methodMap["GET"] as String), method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res: RequestSuccess<String>){
            this.jest_result = true
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_respone_with_404_and_string_generics = ::gen_jest_respone_with_404_and_string_generics_fn
    open fun gen_jest_respone_with_404_and_string_generics_fn() {
        uni_request<String>(RequestOptions(url = this.host + "/api/http/statusCode/404", method = "GET", timeout = null, sslVerify = false, withCredentials = false, firstIpv4 = false, success = fun(res: RequestSuccess<String>){
            this.jest_result = true
        }
        , fail = fun(_){
            this.jest_result = false
        }
        ))
    }
    open var jest_issue_19687 = ::gen_jest_issue_19687_fn
    open fun gen_jest_issue_19687_fn() {
        uni_request<Any>(RequestOptions(url = this.host + "/api/http/statusCode/404", method = "GET", success = fun(res){
            this.jest_result = UTSAndroid.`typeof`(res.data) === "string"
        }
        , fail = fun(_){
            this.jest_result = false
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
                return _uM("uni-textarea" to _pS(_uM("paddingTop" to 9, "paddingRight" to 9, "paddingBottom" to 9, "paddingLeft" to 9, "fontSize" to 14)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
