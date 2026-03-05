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
import io.dcloud.uniapp.extapi.createRequestPermissionListener as uni_createRequestPermissionListener
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener : BasePage {
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
        onReady(fun() {
            this.watchPermissionRRequest()
        }
        , __ins)
        onUnload(fun() {
            this.permissionListener?.stop()
            this.permissionListener = null
            clearTimeout(this.timeoutId)
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to "权限申请监听")),
            _cE("view", _uM("class" to "permission-alert", "id" to "permission-alert", "style" to _nS(_uM("transform" to if (_ctx.isPermissionAlertShow) {
                "translateY(0)"
            } else {
                "translateY(-110px)"
            }
            ))), _uA(
                _cE("text", _uM("style" to _nS(_uM("font-size" to "20px", "margin-bottom" to "10px", "margin-top" to "5px"))), "访问日历权限申请说明：", 4),
                _cE("text", _uM("style" to _nS(_uM("color" to "darkgray"))), "uni-app x正在申请访问日历权限用于演示，允许或拒绝均不会获取任何隐私信息。", 4)
            ), 4),
            _cE("button", _uM("type" to "primary", "style" to _nS(_uM("margin" to "10px")), "onClick" to _ctx.requestPermission), "点击申请日历权限", 12, _uA(
                "onClick"
            ))
        ), 4)
    }
    open var isPermissionAlertShow: Boolean by `$data`
    open var permissionAlert: UniElement? by `$data`
    open var timeoutId: Number by `$data`
    open var permissionListener: RequestPermissionListener? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("isPermissionAlertShow" to false, "permissionAlert" to null as UniElement?, "timeoutId" to -1, "permissionListener" to null as RequestPermissionListener?)
    }
    open var watchPermissionRRequest = ::gen_watchPermissionRRequest_fn
    open fun gen_watchPermissionRRequest_fn() {
        this.permissionListener = uni_createRequestPermissionListener()
        this.permissionListener!!.onConfirm(fun(_){
            this.timeoutId = setTimeout(fun(){
                this.isPermissionAlertShow = true
            }
            , 100)
        }
        )
        this.permissionListener!!.onComplete(fun(_){
            clearTimeout(this.timeoutId)
            this.isPermissionAlertShow = false
        }
        )
    }
    open var requestPermission = ::gen_requestPermission_fn
    open fun gen_requestPermission_fn() {
        if (UTSAndroid.checkSystemPermissionGranted(UTSAndroid.getUniActivity()!!, _uA(
            "android.permission.READ_CALENDAR"
        ))) {
            uni_showToast(ShowToastOptions(title = "权限已经同意了，不需要再申请", position = "bottom"))
            return
        }
        UTSAndroid.requestSystemPermission(UTSAndroid.getUniActivity()!!, _uA(
            "android.permission.READ_CALENDAR"
        ), fun(_: Boolean, p: UTSArray<String>){
            console.log(p, " at pages/API/create-request-permission-listener/create-request-permission-listener.uvue:62")
        }
        , fun(_: Boolean, p: UTSArray<String>){
            uni_showToast(ShowToastOptions(title = "权限被拒绝了", position = "bottom"))
            console.log(p, " at pages/API/create-request-permission-listener/create-request-permission-listener.uvue:68")
        }
        )
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
                return _uM("permission-alert" to _pS(_uM("width" to "90%", "height" to 100, "marginTop" to 10, "marginRight" to "5%", "marginBottom" to 10, "marginLeft" to "5%", "position" to "absolute", "top" to 0, "zIndex" to 3, "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5, "transitionProperty" to "transform", "transitionDuration" to "200ms", "backgroundColor" to "#FFFFFF", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "@TRANSITION" to _uM("permission-alert" to _uM("property" to "transform", "duration" to "200ms")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
