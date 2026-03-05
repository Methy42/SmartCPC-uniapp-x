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
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
import io.dcloud.uniapp.framework.onShow
open class GenPagesAPILoadFontFaceLoadFontFace : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            val self = this
            uni_loadFontFace(LoadFontFaceOptions(global = true, family = "UniFontFamily", source = "url('/static/font/uni.ttf')", success = fun(_) {
                self.successTriggeredNum++
                console.log("global loadFontFace uni.ttf success")
            }
            , fail = fun(error) {
                console.warn("global loadFontFace uni.ttf fail", error.errMsg)
            }
            ))
            uni_loadFontFace(LoadFontFaceOptions(family = "UniFontFamily2", source = "url(data:font/ttf;charset=utf-8;base64,AAEAAAAKAIAAAwAgT1MvMjpAVPQAAACsAAAAYGNtYXAADeKoAAABDAAAAUJnbHlmUL6yUwAAAlAAAAEYaGVhZBdlAJ0AAANoAAAANmhoZWEHvgOiAAADoAAAACRobXR4BCEAAAAAA8QAAAAGbG9jYQCMAAYAAAPMAAAABm1heHABEQBiAAAD1AAAACBuYW1lwbWvwwAAA/QAAANmcG9zdNTj4UYAAAdcAAAAMAAEBAABkAAFAAACiQLMAAAAjwKJAswAAAHrADIBCAAAAgAFAwAAAAAAAAAAAAAQAAAAAAAAAAAAAABQZkVkAEDhAuECA4D/gABcA4AAgAAAAAEAAAAAAgACzQAAAAAAAAAAAAMAAAADAAAAHAABAAAAAAA8AAMAAQAAABwABAAgAAAABAAEAAEAAOEC//8AAOEC//8e/wABAAAAAAAAAQYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFACH/rAPgA1QACwAXACwAOABVAAABPgE3LgEnDgEHHgE3LgEnPgE3HgEXDgEHIgYHFhc2Nx4BFxYnIQYHIRYnLgEBPgE3LgEnDgEHHgE3IiY9ASMuATQ2OwE1NDYyFh0BMzIWFAYHIxUUBgJpTmkCAmhPTmkCAmlOMUIBAUIxMUIBAUIxOmUpGxU/WZScAQER/oUBCgFyagECxP3iW3wCAntcXHsDA3tcCxFSCw8PC1IRFxBSCw8PC1IQAccCclVVbQICb1NVcj8BTDs5SQEBSTk6TXcZFhYcHwEGiTsNASEgAUZbsf4hAnxcXHsCAntcXXtKDg1YAQ8WD1kMDg4MWQ8WDwFYDQ4AAAAAAQAAAAEAABiJhVNfDzz1AAsEAAAAAADaMRNoAAAAANo0qTgAAP+sA+ADVAAAAAgAAgAAAAAAAAABAAADgP+AAFwEAAAAACAD4AABAAAAAAAAAAAAAAAAAAAAAQQAAAAAIQAAAAAABgCMAAAAAQAAAAIAVgAFAAAAAAACAAAACgAKAAAA/wAAAAAAAAAAABIA3gABAAAAAAAAABMAAAABAAAAAAABAA4AEwABAAAAAAACAAcAIQABAAAAAAADABsAKAABAAAAAAAEAA4AQwABAAAAAAAFADsAUQABAAAAAAAGAA4AjAABAAAAAAAKACsAmgABAAAAAAALABMAxQADAAEECQAAACYA2AADAAEECQABABwA/gADAAEECQACAA4BGgADAAEECQADADYBKAADAAEECQAEABwBXgADAAEECQAFAHYBegADAAEECQAGABwB8AADAAEECQAKAFYCDAADAAEECQALACYCYkNyZWF0ZWQgYnkgaWNvbmZvbnR1bmlpY29uc1NpbmdsZVJlZ3VsYXJ1bmlpY29uc1NpbmdsZTpWZXJzaW9uIDEuMDB1bmlpY29uc1NpbmdsZVZlcnNpb24gMS4wMDtKYW51YXJ5IDMsIDIwMjA7Rm9udENyZWF0b3IgMTIuMC4wLjI1MzUgNjQtYml0dW5paWNvbnNTaW5nbGVHZW5lcmF0ZWQgYnkgc3ZnMnR0ZiBmcm9tIEZvbnRlbGxvIHByb2plY3QuaHR0cDovL2ZvbnRlbGxvLmNvbQBDAHIAZQBhAHQAZQBkACAAYgB5ACAAaQBjAG8AbgBmAG8AbgB0AHUAbgBpAGkAYwBvAG4AcwBTAGkAbgBnAGwAZQBSAGUAZwB1AGwAYQByAHUAbgBpAGkAYwBvAG4AcwBTAGkAbgBnAGwAZQA6AFYAZQByAHMAaQBvAG4AIAAxAC4AMAAwAHUAbgBpAGkAYwBvAG4AcwBTAGkAbgBnAGwAZQBWAGUAcgBzAGkAbwBuACAAMQAuADAAMAA7AEoAYQBuAHUAYQByAHkAIAAzACwAIAAyADAAMgAwADsARgBvAG4AdABDAHIAZQBhAHQAbwByACAAMQAyAC4AMAAuADAALgAyADUAMwA1ACAANgA0AC0AYgBpAHQAdQBuAGkAaQBjAG8AbgBzAFMAaQBuAGcAbABlAEcAZQBuAGUAcgBhAHQAZQBkACAAYgB5ACAAcwB2AGcAMgB0AHQAZgAgAGYAcgBvAG0AIABGAG8AbgB0AGUAbABsAG8AIABwAHIAbwBqAGUAYwB0AC4AaAB0AHQAcAA6AC8ALwBmAG8AbgB0AGUAbABsAG8ALgBjAG8AbQAAAAIAAAAAAAAACgABAAAAAAAAAAAAAAAAAAAAAAAAAAIAAgAAAQIJcGVyc29uYWRk)", success = fun(_) {
                self.successTriggeredNum++
                console.log("loadFontFace uni.ttf(base64 format) success")
            }
            , fail = fun(error) {
                console.warn("loadFontFace uni.ttf(base64 format) fail", error.errMsg)
            }
            ))
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiTTF", source = "url('https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/font/AlimamaDaoLiTi.ttf')", success = fun(_) {
                self.successTriggeredNum++
                console.log("loadFontFace Remote AlimamaDaoLiTi.ttf success")
            }
            , fail = fun(error) {
                console.warn("loadFontFace Remote AlimamaDaoLiTi.ttf fail", error.errMsg)
            }
            ))
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiOTF", source = "url('/static/font/AlimamaDaoLiTi.otf')", success = fun(_) {
                self.successTriggeredNum++
                console.log("loadFontFace AlimamaDaoLiTi.otf success")
            }
            , fail = fun(error) {
                console.warn("loadFontFace AlimamaDaoLiTi.otf fail", error.errMsg)
            }
            ))
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiWOFF", source = "url('/static/font/AlimamaDaoLiTi.woff')", success = fun(_) {
                self.successTriggeredNum++
                console.log("loadFontFace AlimamaDaoLiTi.woff success")
            }
            , fail = fun(error) {
                console.warn("loadFontFace AlimamaDaoLiTi.woff fail", error.errMsg)
            }
            ))
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiWOFF2", source = "url('/static/font/AlimamaDaoLiTi.woff2')", success = fun(_) {
                self.successTriggeredNum++
                console.log("loadFontFace AlimamaDaoLiTi.woff2 success")
            }
            , fail = fun(error) {
                console.warn("loadFontFace AlimamaDaoLiTi.woff2 fail", error.errMsg)
            }
            ))
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE(Fragment, null, _uA(
            _cV(_component_page_head, _uM("title" to "loadFontFace")),
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("text", _uM("class" to "font-size-20"), "全局加载字体："),
                _cE("text", _uM("class" to "font-size-20 line-height-40", "style" to _nS(_uM("font-family" to "UniFontFamily"))), "font-family: uni.ttf", 4),
                _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row"))), _uA(
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("font-family" to "UniFontFamily"))), _tD(_ctx.uniIcon1), 5),
                    _cE("text", _uM("class" to "icon-text"), "\\ue100"),
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("font-family" to "UniFontFamily"))), _tD(_ctx.uniIcon2), 5),
                    _cE("text", _uM("style" to _nS(_uM("margin-left" to "5px", "line-height" to "22px"))), "\\ue101", 4)
                ), 4),
                _cE("text", _uM("class" to "uni-common-mt font-size-20"), "非全局加载字体："),
                _cE("text", _uM("class" to "font-size-20 line-height-40"), "font-family: uni.ttf(base64格式)"),
                _cE("view", _uM("style" to _nS(_uM("flex-direction" to "row"))), _uA(
                    _cE("text", _uM("class" to "font-size-20", "style" to _nS(_uM("font-family" to "UniFontFamily2"))), _tD(_ctx.uniIcon3), 5),
                    _cE("text", _uM("class" to "icon-text"), "\\ue102")
                ), 4),
                _cE("text", _uM("class" to "font-size-20 line-height-40", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiTTF"))), "font-family: 阿里妈妈刀隶体-ttf (网络字体下载后生效)", 4),
                _cE("text", _uM("class" to "font-size-20 line-height-40", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiOTF"))), "font-family: 阿里妈妈刀隶体-otf", 4),
                _cE("text", _uM("class" to "item", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiWOFF"))), "font-family: 阿里妈妈刀隶体-woff", 4),
                _cE("text", _uM("class" to "item", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiWOFF2"))), "font-family: 阿里妈妈刀隶体-woff2", 4),
                _cE("button", _uM("class" to "uni-btn", "onClick" to _ctx.navigateToChild), "跳转子页面测试字体生效范围", 8, _uA(
                    "onClick"
                ))
            ))
        ), 64)
    }
    open var uniIcon1: String by `$data`
    open var uniIcon2: String by `$data`
    open var uniIcon3: String by `$data`
    open var successTriggeredNum: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("uniIcon1" to "\ue100", "uniIcon2" to "\ue101", "uniIcon3" to "\ue102", "successTriggeredNum" to 0)
    }
    open var navigateToChild = ::gen_navigateToChild_fn
    open fun gen_navigateToChild_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/API/load-font-face/load-font-face-child"))
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
                return _uM("font-size-20" to _pS(_uM("fontSize" to 20)), "line-height-40" to _pS(_uM("lineHeight" to "40px")), "icon-text" to _pS(_uM("marginLeft" to 5, "marginRight" to 20, "lineHeight" to "22px")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
