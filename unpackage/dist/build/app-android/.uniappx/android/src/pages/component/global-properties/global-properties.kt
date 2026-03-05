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
import io.dcloud.uniapp.framework.onShow
open class GenPagesComponentGlobalPropertiesGlobalProperties : BasePage {
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
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                    _cE("view", _uM("id" to _ctx.generalId, "class" to _nC(_ctx.generalClass), "name" to _ctx.generalName, "title" to _ctx.generalTitle, "data-test" to _ctx.generalData, "style" to _nS(_ctx.generalStyle), "ref" to "general-target"), _uA(
                        _cE("text", null, "id: " + _tD(_ctx.generalId), 1),
                        _cE("text", null, "class: " + _tD(_ctx.generalClass), 1),
                        _cE("text", null, "name: " + _tD(_ctx.generalName), 1),
                        _cE("text", null, "title: " + _tD(_ctx.generalTitle), 1),
                        _cE("text", null, "data-test: " + _tD(_ctx.generalData), 1),
                        _cE("text", null, "style: " + _tD(_ctx.generalStyle), 1)
                    ), 14, _uA(
                        "id",
                        "name",
                        "title",
                        "data-test"
                    )),
                    _cE("view", _uM("class" to "btn btn-style uni-common-mt", "onClick" to _ctx.validateGeneralAttributes), _uA(
                        _cE("text", _uM("class" to "btn-inner"), _tD(_ctx.validateGeneralAttrText), 1)
                    ), 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "btn btn-ref uni-common-mt", "onClick" to _ctx.changeHeight), _uA(
                        _cE("text", _uM("class" to "btn-inner"), _tD(_ctx.changeHeightByRefText), 1)
                    ), 8, _uA(
                        "onClick"
                    )),
                    _cE("view", _uM("class" to "view-class", "hover-class" to _ctx.hoverClass, "ref" to "view-target"), _uA(
                        _cE("text", _uM("class" to "text"), "按下 50 ms 后背景变红"),
                        _cE("text", _uM("class" to "text"), "抬起 400 ms 后背景恢复")
                    ), 8, _uA(
                        "hover-class"
                    )),
                    _cE("view", _uM("class" to "view-class", "hover-class" to _ctx.hoverClass, "hover-start-time" to 1000, "hover-stay-time" to 1000, "ref" to "view-target"), _uA(
                        _cE("text", _uM("class" to "text"), "按下 1000 ms 后背景变红"),
                        _cE("text", _uM("class" to "text"), "抬起 1000 ms 后背景恢复")
                    ), 8, _uA(
                        "hover-class"
                    ))
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var generalId: String by `$data`
    open var generalClass: String by `$data`
    open var generalName: String by `$data`
    open var generalTitle: String by `$data`
    open var generalData: String by `$data`
    open var generalStyle: String by `$data`
    open var validateGeneralAttrText: String by `$data`
    open var hoverClass: String by `$data`
    open var validateViewAttrText: String by `$data`
    open var changeHeightByRefText: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "global-properties", "generalId" to "general-id", "generalClass" to "general-class", "generalName" to "general-name", "generalTitle" to "general-title", "generalData" to "general-data", "generalStyle" to "background-color: aqua", "validateGeneralAttrText" to "验证基础属性", "hoverClass" to "hover-class", "validateViewAttrText" to "验证 view 属性", "changeHeightByRefText" to "通过 ref 修改高度")
    }
    open var validateGeneralAttributes = ::gen_validateGeneralAttributes_fn
    open fun gen_validateGeneralAttributes_fn() {
        val generalTarget = this.`$refs`["general-target"] as UniElement
        val generalId = generalTarget.getAttribute("id")
        if (generalId != this.generalId) {
            this.validateGeneralAttrText = "基础属性 id 验证失败"
            return
        }
        if (!generalTarget.classList.includes("general-class")) {
            this.validateGeneralAttrText = "基础属性 class 验证失败"
            return
        }
        val generalName = generalTarget.getAttribute("name")
        if (generalName != this.generalName) {
            this.validateGeneralAttrText = "基础属性 name 验证失败"
            return
        }
        val generalTitle = generalTarget.getAttribute("title")
        if (generalTitle != this.generalTitle) {
            this.validateGeneralAttrText = "基础属性 title 验证失败"
            return
        }
        val generalData = generalTarget.getAttribute("data-test")
        if (generalData != this.generalData) {
            this.validateGeneralAttrText = "基础属性 data-test 验证失败"
            return
        }
        this.validateGeneralAttrText = "基础属性验证成功"
    }
    open var changeHeight = ::gen_changeHeight_fn
    open fun gen_changeHeight_fn() {
        val generalTarget = this.`$refs`["general-target"] as UniElement
        this.changeHeightByRefText = "已通过 ref 修改高度"
        generalTarget.style.setProperty("height", "200px")
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
                return _uM("btn" to _pS(_uM("height" to 50, "display" to "flex", "alignItems" to "center", "justifyContent" to "center", "backgroundColor" to "#409eff", "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5)), "btn-inner" to _pS(_uM("color" to "#ffffff")), "general-class" to _pS(_uM("marginLeft" to 40, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "width" to 260, "height" to 160, "backgroundColor" to "#FAEBD7")), "view-class" to _pS(_uM("marginTop" to 20, "marginRight" to 0, "marginBottom" to 0, "marginLeft" to 50, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "width" to 240, "height" to 100, "backgroundColor" to "#FAEBD7")), "text" to _uM(".view-class " to _uM("marginTop" to 5, "textAlign" to "center")), "hover-class" to _pS(_uM("backgroundColor" to "#FF0000")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
