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
import io.dcloud.uniapp.extapi.getAppBaseInfo as uni_getAppBaseInfo
import io.dcloud.uniapp.extapi.getFacialRecognitionMetaInfo as uni_getFacialRecognitionMetaInfo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showModal as uni_showModal
import io.dcloud.uniapp.extapi.startFacialRecognitionVerify as uni_startFacialRecognitionVerify
open class GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo : BasePage {
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
        onReady(fun() {}, __ins)
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
                        _cE("input", _uM("class" to "uni-input", "type" to "text", "modelValue" to _ctx.realName, "onInput" to fun(`$event`: UniInputEvent){
                            _ctx.realName = `$event`.detail.value
                        }
                        , "name" to "real-name", "placeholder" to "姓名", "maxlength" to "-1"), null, 40, _uA(
                            "modelValue",
                            "onInput"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-btn-v uni-common-mt"), _uA(
                        _cE("input", _uM("class" to "uni-input", "type" to "text", "modelValue" to _ctx.idCard, "onInput" to fun(`$event`: UniInputEvent){
                            _ctx.idCard = `$event`.detail.value
                        }
                        , "name" to "id-card", "placeholder" to "身份证号", "maxlength" to "-1"), null, 40, _uA(
                            "modelValue",
                            "onInput"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-btn-v uni-common-mt"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.facialRecognition), "开始人脸识别", 8, _uA(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var realName: String by `$data`
    open var idCard: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "实人认证", "realName" to "", "idCard" to "")
    }
    open var facialRecognition = ::gen_facialRecognition_fn
    open fun gen_facialRecognition_fn() {
        val realName = this.realName.trim()
        val idCard = this.idCard.trim()
        if (realName == "" || idCard == "") {
            uni_showModal(ShowModalOptions(title = "错误", content = "姓名和身份证号不可为空", showCancel = false))
            return
        }
        if ("production" === "production" && "__UNI__HelloUniAppX" === uni_getAppBaseInfo(null).appId) {
            uni_showModal(ShowModalOptions(title = "提示", content = "实人认证为收费功能，当前环境暂不支持。请在HBuilderX中新建Hello uni-app x项目真机运行体验！", showCancel = false))
            return
        }
        val testFacialCo = uniCloud.importObject("facial-recognition-co", GenCloudObjFacialRecognitionCo::class.java)
        var metaInfo = uni_getFacialRecognitionMetaInfo()
        testFacialCo.getCertifyId(_uO("realName" to realName, "idCard" to idCard, "metaInfo" to metaInfo)).then(fun(res: UTSJSONObject): UTSPromise<String> {
            val certifyId = res["certifyId"] as String
            return UTSPromise(fun(resolve: (res: String) -> Unit, reject: (err: UTSError) -> Unit){
                uni_startFacialRecognitionVerify(StartFacialRecognitionVerifyOptions(certifyId = certifyId, success = fun(_) {
                    resolve(certifyId)
                }
                , fail = fun(err) {
                    reject(UTSError(err.errMsg))
                }
                ))
            }
            )
        }
        ).then(fun(certifyId: String): UTSPromise<UTSJSONObject> {
            return testFacialCo.getAuthResult(certifyId)
        }
        ).then(fun(res: UTSJSONObject){
            console.log("res", res)
        }
        ).`catch`(fun(err: Any?){
            console.error("error", err)
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
