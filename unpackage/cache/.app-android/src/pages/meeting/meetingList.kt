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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesMeetingMeetingList : BasePage {
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
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesMeetingMeetingList) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesMeetingMeetingList
            val _cache = __ins.renderCache
            val tabList = ref(_uA(
                object : UTSJSONObject() {
                    var name = "待开会议"
                },
                object : UTSJSONObject() {
                    var name = "已开会议"
                }
            ))
            val activeTab = ref(0)
            val showJoinModal = ref(false)
            val attendType = ref<String>("onsite")
            val joined = ref(false)
            fun gen_openJoinModal_fn() {
                showJoinModal.value = true
            }
            val openJoinModal = ::gen_openJoinModal_fn
            fun gen_closeJoinModal_fn() {
                showJoinModal.value = false
            }
            val closeJoinModal = ::gen_closeJoinModal_fn
            fun gen_confirmJoin_fn() {
                showJoinModal.value = false
                joined.value = true
                uni_showToast(ShowToastOptions(title = "已报名参加", icon = "success"))
            }
            val confirmJoin = ::gen_confirmJoin_fn
            val showLeaveModal = ref(false)
            val leaveReason = ref("")
            fun gen_openLeaveModal_fn() {
                showLeaveModal.value = true
            }
            val openLeaveModal = ::gen_openLeaveModal_fn
            fun gen_closeLeaveModal_fn() {
                showLeaveModal.value = false
            }
            val closeLeaveModal = ::gen_closeLeaveModal_fn
            fun gen_submitLeave_fn() {
                showLeaveModal.value = false
                uni_showToast(ShowToastOptions(title = "已提交请假", icon = "success"))
            }
            val submitLeave = ::gen_submitLeave_fn
            fun gen_onLeaveInput_fn(e: UniInputEvent) {
                leaveReason.value = e.detail.value
            }
            val onLeaveInput = ::gen_onLeaveInput_fn
            val showSignatureModal = ref(false)
            var signatureCanvasEl: UniCanvasElement? = null
            var signature2d: CanvasRenderingContext2D? = null
            fun gen_openSignatureModal_fn() {
                showSignatureModal.value = true
                try {
                    val pages = getCurrentPages()
                    val currentPage = pages[pages.length - 1]
                    currentPage.setPageStyle(object : UTSJSONObject() {
                        var pageOrientation = "landscape"
                    })
                }
                 catch (_: Throwable) {}
                setTimeout(fun(){
                    signatureCanvasEl = uni_getElementById("signature-canvas") as UniCanvasElement
                    if (signatureCanvasEl != null) {
                        signature2d = signatureCanvasEl.getContext("2d")!!
                        val dpr = uni_getWindowInfo().pixelRatio
                        val rect = signatureCanvasEl.getBoundingClientRect()
                        signatureCanvasEl.width = rect.width * dpr
                        signatureCanvasEl.height = rect.height * dpr
                        signature2d!!.scale(dpr, dpr)
                        signature2d!!.lineWidth = 3
                        signature2d!!.strokeStyle = "#333"
                    }
                }
                , 50)
            }
            val openSignatureModal = ::gen_openSignatureModal_fn
            fun gen_closeSignatureModal_fn() {
                showSignatureModal.value = false
                try {
                    val pages = getCurrentPages()
                    val currentPage = pages[pages.length - 1]
                    currentPage.setPageStyle(object : UTSJSONObject() {
                        var pageOrientation = "portrait"
                    })
                }
                 catch (_: Throwable) {}
            }
            val closeSignatureModal = ::gen_closeSignatureModal_fn
            var drawing = false
            fun gen_sigStart_fn(e: UniTouchEvent) {
                if (signature2d == null || signatureCanvasEl == null) {
                    return
                }
                drawing = true
                val t = e.touches[0]
                val rect = signatureCanvasEl.getBoundingClientRect()
                val x = t.clientX - rect.left
                val y = t.clientY - rect.top
                signature2d!!.beginPath()
                signature2d!!.moveTo(x, y)
            }
            val sigStart = ::gen_sigStart_fn
            fun gen_sigMove_fn(e: UniTouchEvent) {
                if (signature2d == null || signatureCanvasEl == null || drawing === false) {
                    return
                }
                val t = e.touches[0]
                val rect = signatureCanvasEl.getBoundingClientRect()
                val x = t.clientX - rect.left
                val y = t.clientY - rect.top
                signature2d!!.lineTo(x, y)
                signature2d!!.stroke()
            }
            val sigMove = ::gen_sigMove_fn
            fun gen_sigEnd_fn() {
                drawing = false
            }
            val sigEnd = ::gen_sigEnd_fn
            fun gen_sigClear_fn() {
                if (signature2d == null || signatureCanvasEl == null) {
                    return
                }
                signature2d!!.clearRect(0, 0, signatureCanvasEl.width, signatureCanvasEl.height)
            }
            val sigClear = ::gen_sigClear_fn
            return fun(): Any? {
                return _cE(Fragment, null, _uA(
                    _cE("view", _uM("class" to "container"), _uA(
                        _cE("image", _uM("class" to "background-image", "src" to "/static/background/u2.jpg", "mode" to "aspectFill")),
                        _cE("view", _uM("class" to "custom-navbar"), _uA(
                            _cE("view", _uM("class" to "nav-avatar-container"), _uA(
                                _cE("image", _uM("class" to "nav-avatar", "src" to "/static/login-avatar.png", "mode" to "aspectFill"))
                            )),
                            _cE("view", _uM("class" to "nav-right-buttons"), _uA(
                                _cE("view", _uM("class" to "nav-message-btn"), _uA(
                                    _cE("text", _uM("class" to "message-text"), "消息"),
                                    _cE("view", _uM("class" to "message-badge"), "4")
                                ))
                            ))
                        )),
                        _cE("view", _uM("class" to "content-container"), _uA(
                            _cE("view", _uM("class" to "content-title-container"), _uA(
                                _cE("image", _uM("class" to "content-title-background", "src" to "/static/mine-title-background.png", "mode" to "aspectFit")),
                                _cE("text", _uM("class" to "content-title-text"), "三会一课")
                            )),
                            _cE("view", _uM("class" to "tabs-bar"), _uA(
                                _cE("view", _uM("class" to _nC(_uA(
                                    "tab-item",
                                    if (activeTab.value === 0) {
                                        "tab-active-left"
                                    } else {
                                        "tab-inactive-left"
                                    }
                                )), "onClick" to fun(){
                                    activeTab.value = 0
                                }
                                ), _uA(
                                    _cE("text", _uM("class" to "tab-text"), "待开会议")
                                ), 10, _uA(
                                    "onClick"
                                )),
                                _cE("view", _uM("class" to _nC(_uA(
                                    "tab-item",
                                    if (activeTab.value === 1) {
                                        "tab-active-right"
                                    } else {
                                        "tab-inactive-right"
                                    }
                                )), "onClick" to fun(){
                                    activeTab.value = 1
                                }
                                ), _uA(
                                    _cE("text", _uM("class" to "tab-text"), "已开会议")
                                ), 10, _uA(
                                    "onClick"
                                ))
                            )),
                            if (activeTab.value === 0) {
                                _cE("view", _uM("key" to 0, "class" to "meeting-list"), _uA(
                                    _cE("view", _uM("class" to "meeting-card"), _uA(
                                        _cE("text", _uM("class" to "meeting-title"), "11月份党支部委员会支部大会"),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/meeting_management.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议时间：2025年11月17日 星期四 9:30 ~ 11:30")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/organization.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/location.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                        )),
                                        _cE("view", _uM("class" to "btn-group"), _uA(
                                            if (isTrue(!joined.value)) {
                                                _cE("view", _uM("key" to 0, "class" to "action-btn action-primary", "onClick" to openJoinModal), _uA(
                                                    _cE("text", null, "参加")
                                                ))
                                            } else {
                                                _cE("view", _uM("key" to 1, "class" to "action-btn action-wait", "onClick" to openSignatureModal), _uA(
                                                    _cE("text", null, "待签到")
                                                ))
                                            },
                                            _cE("view", _uM("class" to "action-btn action-outline", "onClick" to openLeaveModal), _uA(
                                                _cE("text", null, "请假")
                                            ))
                                        )),
                                        if (isTrue(joined.value)) {
                                            _cE("text", _uM("key" to 0, "class" to "checkin-tips"), "会前5分钟可签到")
                                        } else {
                                            _cC("v-if", true)
                                        }
                                    ))
                                ))
                            } else {
                                _cE("view", _uM("key" to 1, "class" to "meeting-list"), _uA(
                                    _cE("view", _uM("class" to "meeting-card"), _uA(
                                        _cE("text", _uM("class" to "meeting-title"), "11月份党支部委员会支部大会"),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/meeting_management.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议时间：2025年11月10日 星期三 9:30 ~ 11:30")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/organization.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/location.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                        )),
                                        _cE("view", _uM("class" to "btn-group"), _uA(
                                            _cE("view", _uM("class" to "action-btn action-success"), "会议纪要")
                                        ))
                                    )),
                                    _cE("view", _uM("class" to "meeting-card"), _uA(
                                        _cE("text", _uM("class" to "meeting-title"), "11月份党支部党员活动"),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/meeting_management.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议时间：2025年11月12日 星期四 9:30 ~ 11:30")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/organization.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/location.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                        )),
                                        _cE("view", _uM("class" to "btn-group"), _uA(
                                            _cE("view", _uM("class" to "action-btn action-success"), "会议记录")
                                        ))
                                    )),
                                    _cE("view", _uM("class" to "meeting-card"), _uA(
                                        _cE("text", _uM("class" to "meeting-title"), "讨论接收预备党员支部大会"),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/meeting_management.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议时间：2025年11月15日 星期二 9:30 ~ 11:30")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/organization.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                        )),
                                        _cE("view", _uM("class" to "meeting-info"), _uA(
                                            _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/location.svg", "mode" to "widthFix")),
                                            _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                        )),
                                        _cE("view", _uM("class" to "btn-group"), _uA(
                                            _cE("view", _uM("class" to "action-btn action-success"), "会议记录")
                                        ))
                                    ))
                                ))
                            }
                        ))
                    )),
                    if (isTrue(showJoinModal.value)) {
                        _cE("view", _uM("key" to 0, "class" to "modal-mask"), _uA(
                            _cE("view", _uM("class" to "modal-card"), _uA(
                                _cE("text", _uM("class" to "modal-title"), "12月份党支部党课"),
                                _cE("view", _uM("class" to "modal-section"), _uA(
                                    _cE("view", _uM("class" to "meeting-info"), _uA(
                                        _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/meeting_management.svg", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "info-text"), "会议时间：2025年12月10日 星期三 9:30 ~ 11:30")
                                    )),
                                    _cE("view", _uM("class" to "meeting-info"), _uA(
                                        _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/organization.svg", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                    )),
                                    _cE("view", _uM("class" to "meeting-info"), _uA(
                                        _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/location.svg", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                    ))
                                )),
                                _cE("view", _uM("class" to "modal-section"), _uA(
                                    _cE("view", _uM("class" to "topic-row"), _uA(
                                        _cE("view", _uM("class" to "topic-icon-wrapper"), _uA(
                                            _cE("image", _uM("class" to "topic-icon", "src" to "/static/icons/topic.svg", "mode" to "widthFix")),
                                            _cE("view", _uM("class" to "topic-icon-center"), _uA(
                                                _cE("text", _uM("class" to "topic-badge-text"), "议题")
                                            ))
                                        )),
                                        _cE("text", _uM("class" to "topic-text"), "深入学习贯彻党的二十大精神")
                                    )),
                                    _cE("view", _uM("class" to "file-row"), _uA(
                                        _cE("image", _uM("class" to "file-icon", "src" to "/static/icons/pdf.png", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "file-name"), "12月份党支部委员会会议消息.pdf · 1MB")
                                    ))
                                )),
                                _cE("view", _uM("class" to "modal-section attend-row"), _uA(
                                    _cE("text", _uM("class" to "attend-label"), "参会形式："),
                                    _cE("view", _uM("class" to "radio-option", "onClick" to fun(){
                                        attendType.value = "onsite"
                                    }), _uA(
                                        _cE("view", _uM("class" to _nC(_uA(
                                            "radio-dot",
                                            if (attendType.value === "onsite") {
                                                "active"
                                            } else {
                                                ""
                                            }
                                        ))), null, 2),
                                        _cE("text", null, "现场参会")
                                    ), 8, _uA(
                                        "onClick"
                                    )),
                                    _cE("view", _uM("class" to "radio-option", "onClick" to fun(){
                                        attendType.value = "video"
                                    }), _uA(
                                        _cE("view", _uM("class" to _nC(_uA(
                                            "radio-dot",
                                            if (attendType.value === "video") {
                                                "active"
                                            } else {
                                                ""
                                            }
                                        ))), null, 2),
                                        _cE("text", null, "视频参会")
                                    ), 8, _uA(
                                        "onClick"
                                    ))
                                )),
                                _cE("view", _uM("class" to "modal-btns"), _uA(
                                    _cE("view", _uM("class" to "action-btn btn-join", "onClick" to confirmJoin), "参加"),
                                    _cE("view", _uM("class" to "action-btn btn-cancel", "onClick" to closeJoinModal), "取消")
                                ))
                            ))
                        ))
                    } else {
                        _cC("v-if", true)
                    }
                    ,
                    if (isTrue(showSignatureModal.value)) {
                        _cE("view", _uM("key" to 1, "class" to "signature-mask"), _uA(
                            _cE("view", _uM("class" to "signature-card"), _uA(
                                _cE("view", _uM("class" to "signature-header"), _uA(
                                    _cE("text", _uM("class" to "signature-title"), "在线签名"),
                                    _cE("view", _uM("class" to "signature-close", "onClick" to closeSignatureModal), "✕")
                                )),
                                _cE("view", _uM("class" to "signature-body"), _uA(
                                    _cE("canvas", _uM("id" to "signature-canvas", "class" to "signature-canvas")),
                                    _cE("view", _uM("class" to "signature-overlay", "onTouchstart" to sigStart, "onTouchmove" to sigMove, "onTouchend" to sigEnd), null, 32),
                                    _cE("text", _uM("class" to "signature-placeholder"), "请在此处签名")
                                )),
                                _cE("view", _uM("class" to "signature-actions"), _uA(
                                    _cE("view", _uM("class" to "action-btn action-primary", "onClick" to sigClear), "撤回"),
                                    _cE("view", _uM("class" to "action-btn action-outline", "onClick" to sigClear), "重签")
                                ))
                            ))
                        ))
                    } else {
                        _cC("v-if", true)
                    }
                    ,
                    if (isTrue(showLeaveModal.value)) {
                        _cE("view", _uM("key" to 2, "class" to "modal-mask"), _uA(
                            _cE("view", _uM("class" to "modal-card"), _uA(
                                _cE("text", _uM("class" to "modal-title"), "12月份党支部党课"),
                                _cE("view", _uM("class" to "modal-section"), _uA(
                                    _cE("view", _uM("class" to "meeting-info"), _uA(
                                        _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/meeting_management.svg", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "info-text"), "会议时间：2025年12月10日 星期三 9:30 ~ 11:30")
                                    )),
                                    _cE("view", _uM("class" to "meeting-info"), _uA(
                                        _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/organization.svg", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "info-text"), "会议组织：数智公司党支部")
                                    )),
                                    _cE("view", _uM("class" to "meeting-info"), _uA(
                                        _cE("image", _uM("class" to "info-icon", "src" to "/static/icons/location.svg", "mode" to "widthFix")),
                                        _cE("text", _uM("class" to "info-text"), "会议地点：311室")
                                    ))
                                )),
                                _cE("view", _uM("class" to "modal-section"), _uA(
                                    _cE("text", _uM("class" to "reason-label"), "请假事由"),
                                    _cE("textarea", _uM("class" to "reason-textarea", "value" to leaveReason.value, "onInput" to onLeaveInput, "placeholder" to "请输入请假原因"), null, 40, _uA(
                                        "value"
                                    ))
                                )),
                                _cE("view", _uM("class" to "modal-btns"), _uA(
                                    _cE("view", _uM("class" to "action-btn btn-join", "onClick" to submitLeave), "提交"),
                                    _cE("view", _uM("class" to "action-btn btn-cancel", "onClick" to closeLeaveModal), "取消")
                                ))
                            ))
                        ))
                    } else {
                        _cC("v-if", true)
                    }
                ), 64)
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ), _uA(
                GenApp.styles
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("container" to _pS(_uM("backgroundColor" to "#F5F5F5", "display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingBottom" to "100rpx", "position" to "relative")), "background-image" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "zIndex" to -1)), "custom-navbar" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to "var(--status-bar-height, 40rpx)", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "height" to "100rpx", "width" to "100%", "boxSizing" to "border-box", "flexWrap" to "nowrap", "whiteSpace" to "nowrap")), "nav-avatar-container" to _pS(_uM("position" to "relative", "width" to "70rpx", "height" to "70rpx", "flexShrink" to 0)), "nav-avatar" to _pS(_uM("width" to "100%", "height" to "100%", "boxSizing" to "border-box")), "nav-right-buttons" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "flexShrink" to 0, "flexWrap" to "nowrap")), "nav-message-btn" to _pS(_uM("position" to "relative", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to 0, "paddingRight" to "40rpx", "paddingBottom" to 0, "paddingLeft" to 0, "color" to "#ffffff", "fontSize" to "28rpx", "fontFamily" to "sans-serif", "whiteSpace" to "nowrap", "flexShrink" to 0)), "message-text" to _pS(_uM("color" to "#ffffff", "fontSize" to "28rpx", "whiteSpace" to "nowrap")), "message-badge" to _pS(_uM("position" to "absolute", "right" to 0, "width" to "36rpx", "height" to "36rpx", "backgroundColor" to "#FF6B35", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "color" to "#ffffff", "fontSize" to "22rpx", "fontWeight" to "bold")), "content-container" to _pS(_uM("width" to "90%", "marginTop" to "20rpx", "marginRight" to "auto", "marginBottom" to "auto", "marginLeft" to "auto", "paddingTop" to "20rpx", "paddingRight" to "0rpx", "paddingBottom" to "20rpx", "paddingLeft" to "0rpx", "backgroundColor" to "#f9e1ce", "overflow" to "visible")), "content-title-container" to _pS(_uM("position" to "relative", "width" to "70%", "height" to "80rpx", "display" to "flex", "justifyContent" to "center", "overflow" to "visible")), "content-title-background" to _pS(_uM("position" to "absolute", "top" to 0, "left" to "-60rpx", "width" to "100%", "height" to "100%", "zIndex" to 1, "overflow" to "visible")), "content-title-text" to _pS(_uM("position" to "relative", "zIndex" to 2, "fontSize" to "28rpx", "color" to "#FFEAD2", "fontWeight" to "bold", "textAlign" to "left", "paddingTop" to "10rpx", "paddingRight" to "60rpx", "paddingBottom" to "10rpx", "paddingLeft" to "60rpx")), "tabs-bar" to _pS(_uM("display" to "flex", "flexDirection" to "row", "paddingTop" to 0, "paddingRight" to "30rpx", "paddingBottom" to 0, "paddingLeft" to "30rpx", "marginTop" to "10rpx", "marginBottom" to "10rpx")), "tab-item" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "height" to "64rpx", "borderTopLeftRadius" to "12rpx", "borderTopRightRadius" to "12rpx", "borderBottomRightRadius" to "12rpx", "borderBottomLeftRadius" to "12rpx", "alignItems" to "center", "justifyContent" to "center", "display" to "flex")), "tab-text" to _uM("" to _uM("fontSize" to "28rpx"), ".tab-active-left " to _uM("color" to "#FFFFFF"), ".tab-inactive-left " to _uM("color" to "#7A6154"), ".tab-active-right " to _uM("color" to "#FFFFFF"), ".tab-inactive-right " to _uM("color" to "#7A6154")), "tab-active-left" to _pS(_uM("backgroundColor" to "#e2a65c", "color" to "#ffffff", "marginRight" to "10rpx")), "tab-inactive-left" to _pS(_uM("backgroundColor" to "#e2c9aafd", "marginRight" to "10rpx", "opacity" to 0.8)), "tab-active-right" to _pS(_uM("backgroundColor" to "#e2a65c", "marginLeft" to "10rpx")), "tab-inactive-right" to _pS(_uM("backgroundColor" to "#e2c9aafd", "marginLeft" to "10rpx", "opacity" to 0.85)), "meeting-list" to _pS(_uM("paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx")), "meeting-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx", "boxShadow" to "0 10rpx 20rpx rgba(0,0,0,0.08)", "borderTopWidth" to "1rpx", "borderRightWidth" to "1rpx", "borderBottomWidth" to "1rpx", "borderLeftWidth" to "1rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#e6e6e6", "borderRightColor" to "#e6e6e6", "borderBottomColor" to "#e6e6e6", "borderLeftColor" to "#e6e6e6", "position" to "relative", "marginBottom" to "15rpx")), "meeting-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "marginBottom" to "20rpx")), "meeting-info" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "flex-start", "marginBottom" to "15rpx")), "info-icon" to _pS(_uM("width" to "24rpx", "height" to "24rpx", "marginRight" to "10rpx", "flexShrink" to 0)), "info-text" to _pS(_uM("fontSize" to "24rpx", "color" to "#666666", "marginLeft" to 0, "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "lineHeight" to "32rpx")), "btn-group" to _pS(_uM("display" to "flex", "flexDirection" to "row", "flexWrap" to "nowrap", "justifyContent" to "flex-end", "marginTop" to "20rpx", "position" to "absolute", "bottom" to "15rpx", "right" to "15rpx", "overflow" to "visible")), "btn-group-btn" to _pS(_uM("marginRight:first-child" to "20rpx")), "action-btn" to _pS(_uM("height" to "54rpx", "borderTopLeftRadius" to "12rpx", "borderTopRightRadius" to "12rpx", "borderBottomRightRadius" to "12rpx", "borderBottomLeftRadius" to "12rpx", "alignItems" to "center", "justifyContent" to "center", "paddingTop" to 0, "paddingRight" to "24rpx", "paddingBottom" to 0, "paddingLeft" to "24rpx", "fontSize" to "26rpx", "whiteSpace" to "nowrap", "flexGrow" to 0, "flexShrink" to 0, "flexBasis" to "auto")), "action-primary" to _pS(_uM("backgroundColor" to "#D8A243", "color" to "#ffffff", "marginRight" to "20rpx")), "action-outline" to _pS(_uM("borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#D8A243", "borderRightColor" to "#D8A243", "borderBottomColor" to "#D8A243", "borderLeftColor" to "#D8A243", "color" to "#D8A243", "backgroundColor" to "rgba(0,0,0,0)")), "action-success" to _pS(_uM("backgroundColor" to "#74CF69", "color" to "#ffffff")), "action-wait" to _pS(_uM("backgroundColor" to "#dd3333", "color" to "#ffffff", "marginRight" to "20rpx")), "checkin-tips" to _pS(_uM("fontSize" to "22rpx", "color" to "#999999", "marginTop" to "10rpx", "textAlign" to "right")), "modal-mask" to _pS(_uM("position" to "fixed", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.4)", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "zIndex" to 1000)), "modal-card" to _pS(_uM("width" to "88%", "backgroundColor" to "#ffffff", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx")), "modal-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold", "color" to "#333333", "marginBottom" to "20rpx")), "modal-section" to _pS(_uM("marginTop" to "20rpx", "paddingTop" to "20rpx", "borderTopWidth" to "1rpx", "borderTopStyle" to "solid", "borderTopColor" to "#eeeeee")), "topic-row" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "fontSize" to "28rpx")), "topic-icon-wrapper" to _pS(_uM("position" to "relative", "width" to "44rpx", "height" to "44rpx", "marginRight" to "12rpx")), "topic-icon" to _pS(_uM("width" to "100%", "height" to "100%")), "topic-icon-center" to _pS(_uM("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "display" to "flex", "alignItems" to "center", "justifyContent" to "center")), "topic-badge-text" to _pS(_uM("color" to "#dd3333", "fontSize" to "22rpx", "fontWeight" to "bold")), "topic-text" to _pS(_uM("color" to "#333333", "fontSize" to "28rpx")), "file-row" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "justifyContent" to "flex-start", "flexWrap" to "nowrap", "marginTop" to "16rpx")), "file-icon" to _pS(_uM("width" to "36rpx", "height" to "36rpx", "marginRight" to "12rpx")), "file-name" to _pS(_uM("fontSize" to "28rpx", "color" to "#333333", "flexGrow" to 0, "flexShrink" to 1, "flexBasis" to "auto", "whiteSpace" to "nowrap")), "attend-row" to _pS(_uM("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "marginTop" to "16rpx")), "attend-label" to _pS(_uM("fontSize" to "28rpx", "color" to "#333333", "marginRight" to "20rpx")), "radio-option" to _pS(_uM("flexDirection" to "row", "alignItems" to "center", "marginRight" to "30rpx")), "radio-dot" to _uM("" to _uM("width" to "28rpx", "height" to "28rpx", "borderTopLeftRadius" to "28rpx", "borderTopRightRadius" to "28rpx", "borderBottomRightRadius" to "28rpx", "borderBottomLeftRadius" to "28rpx", "borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#dd3333", "borderRightColor" to "#dd3333", "borderBottomColor" to "#dd3333", "borderLeftColor" to "#dd3333", "marginRight" to "8rpx"), ".active" to _uM("backgroundColor" to "#dd3333")), "modal-btns" to _pS(_uM("display" to "flex", "flexDirection" to "row", "flexWrap" to "nowrap", "justifyContent" to "center", "alignItems" to "center", "marginTop" to "30rpx")), "btn-join" to _pS(_uM("backgroundColor" to "#dd3333", "color" to "#ffffff", "marginRight" to "20rpx")), "btn-cancel" to _pS(_uM("borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#D8A243", "borderRightColor" to "#D8A243", "borderBottomColor" to "#D8A243", "borderLeftColor" to "#D8A243", "color" to "#D8A243", "backgroundColor" to "rgba(0,0,0,0)")), "reason-label" to _pS(_uM("fontSize" to "28rpx", "color" to "#333333", "marginBottom" to "12rpx")), "reason-textarea" to _pS(_uM("width" to "100%", "minHeight" to "200rpx", "borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#e6e6e6", "borderRightColor" to "#e6e6e6", "borderBottomColor" to "#e6e6e6", "borderLeftColor" to "#e6e6e6", "borderTopLeftRadius" to "12rpx", "borderTopRightRadius" to "12rpx", "borderBottomRightRadius" to "12rpx", "borderBottomLeftRadius" to "12rpx", "paddingTop" to "16rpx", "paddingRight" to "16rpx", "paddingBottom" to "16rpx", "paddingLeft" to "16rpx", "fontSize" to "28rpx", "color" to "#333333", "boxSizing" to "border-box")), "signature-mask" to _pS(_uM("position" to "fixed", "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.4)", "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "zIndex" to 1100)), "signature-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "20rpx", "borderTopRightRadius" to "20rpx", "borderBottomRightRadius" to "20rpx", "borderBottomLeftRadius" to "20rpx", "paddingTop" to "12rpx", "paddingRight" to "12rpx", "paddingBottom" to "12rpx", "paddingLeft" to "12rpx", "display" to "flex", "flexDirection" to "column")), "signature-header" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "signature-title" to _pS(_uM("fontSize" to "32rpx", "fontWeight" to "bold")), "signature-close" to _pS(_uM("fontSize" to "32rpx")), "signature-body" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "marginTop" to "10rpx", "position" to "relative", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "signature-canvas" to _pS(_uM("width" to "100%", "backgroundColor" to "#ffffff", "borderTopWidth" to "2rpx", "borderRightWidth" to "2rpx", "borderBottomWidth" to "2rpx", "borderLeftWidth" to "2rpx", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#e6e6e6", "borderRightColor" to "#e6e6e6", "borderBottomColor" to "#e6e6e6", "borderLeftColor" to "#e6e6e6", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx")), "signature-overlay" to _pS(_uM("position" to "absolute", "width" to "100%")), "signature-placeholder" to _pS(_uM("position" to "absolute", "color" to "#cccccc")), "signature-actions" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center", "marginTop" to "20rpx")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
