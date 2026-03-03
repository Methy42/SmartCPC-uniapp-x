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
open class GenPagesMineMine : BasePage {
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
        var setup: (__props: GenPagesMineMine) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesMineMine
            val _cache = __ins.renderCache
            return fun(): Any? {
                val _component_u_tag = resolveComponent("u-tag")
                val _component_u_cell = resolveComponent("u-cell")
                val _component_u_cell_group = resolveComponent("u-cell-group")
                return _cE("view", _uM("class" to "container"), _uA(
                    _cE("view", _uM("class" to "page-header"), _uA(
                        _cE("image", _uM("class" to "star-icon", "src" to "/static/star.png", "mode" to "widthFix")),
                        _cE("text", _uM("class" to "page-title"), "个人中心")
                    )),
                    _cE("view", _uM("class" to "user-card"), _uA(
                        _cE("image", _uM("class" to "user-avatar", "src" to "/static/avatar.png", "mode" to "aspectFill")),
                        _cE("view", _uM("class" to "user-info"), _uA(
                            _cE("text", _uM("class" to "user-name"), "李邵丽"),
                            _cV(_component_u_tag, _uM("text" to "党员", "type" to "danger", "size" to "mini")),
                            _cE("text", _uM("class" to "user-org"), "所在党组织：数智公司党支部")
                        ))
                    )),
                    _cE("view", _uM("class" to "func-list"), _uA(
                        _cV(_component_u_cell_group, null, _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return _uA(
                                _cV(_component_u_cell, _uM("title" to "个人资料", "icon" to "heart", "icon-color" to "#9370DB", "isLink" to "")),
                                _cV(_component_u_cell, _uM("title" to "我的参会记录", "icon" to "flag", "icon-color" to "#C8102E", "isLink" to "")),
                                _cV(_component_u_cell, _uM("title" to "我的活动记录", "icon" to "folder", "icon-color" to "#1E90FF", "isLink" to "")),
                                _cV(_component_u_cell, _uM("title" to "修改密码", "icon" to "lock", "icon-color" to "#32CD32", "isLink" to "")),
                                _cV(_component_u_cell, _uM("title" to "系统设置", "icon" to "setting", "icon-color" to "#1E90FF", "isLink" to "")),
                                _cV(_component_u_cell, _uM("title" to "退出登录", "icon" to "logout", "icon-color" to "#8B4513", "isLink" to ""))
                            )
                        }
                        ), "_" to 1))
                    ))
                ))
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
                return _uM("container" to _pS(_uM("backgroundColor" to "#F5F5F5", "display" to "flex", "flexDirection" to "column", "flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingBottom" to "100rpx")), "page-header" to _pS(_uM("display" to "flex", "alignItems" to "center", "paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx", "backgroundColor" to "#ffffff")), "star-icon" to _pS(_uM("width" to "40rpx", "height" to "40rpx", "marginRight" to "10rpx")), "page-title" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold", "color" to "#333333")), "user-card" to _pS(_uM("backgroundColor" to "#ffffff", "borderTopLeftRadius" to "16rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx", "borderBottomLeftRadius" to "16rpx", "marginTop" to "20rpx", "marginRight" to "30rpx", "marginBottom" to "20rpx", "marginLeft" to "30rpx", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx", "display" to "flex", "alignItems" to "center")), "user-avatar" to _pS(_uM("width" to "120rpx", "height" to "120rpx", "borderTopLeftRadius" to "60rpx", "borderTopRightRadius" to "60rpx", "borderBottomRightRadius" to "60rpx", "borderBottomLeftRadius" to "60rpx", "marginRight" to "30rpx")), "user-info" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%")), "user-name" to _pS(_uM("fontSize" to "36rpx", "fontWeight" to "bold", "color" to "#333333", "marginRight" to "10rpx")), "user-org" to _pS(_uM("fontSize" to "28rpx", "color" to "#666666", "marginTop" to "10rpx")), "func-list" to _pS(_uM("marginTop" to "20rpx", "marginRight" to "30rpx", "marginBottom" to "20rpx", "marginLeft" to "30rpx")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
