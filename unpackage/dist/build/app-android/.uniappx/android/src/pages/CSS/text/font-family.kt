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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo
open class GenPagesCSSTextFontFamily : BasePage {
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
        return _cE(Fragment, null, _uA(
            _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                _cE("text", _uM("class" to "common", "style" to _nS(_uM("font-family" to "monospace"))), "font-family: monospace", 4),
                _cE("text", _uM("class" to "common", "style" to _nS(_uM("font-family" to "cursive"))), "font-family: cursive", 4),
                _cE("text", _uM("class" to "common", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiTTF"))), "font-family: 阿里妈妈刀隶体-ttf（网络字体下载后生效）", 4),
                _cE("text", _uM("class" to "common", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiOTF"))), "font-family: 阿里妈妈刀隶体-otf", 4),
                _cE("text", _uM("class" to "common", "style" to _nS(_uM("font-family" to "AlimamaDaoLiTiOTF", "font-weight" to "bold", "font-style" to "italic"))), "font-family: 阿里妈妈刀隶体-otf（粗斜体）", 4),
                _cE("text", _uM("style" to _nS(_uM("font-family" to "UniFontFamily"))), "style 加载非 static 目录字体文件：" + _tD(_ctx.uniIcon), 5)
            )),
            _cE("view", _uM("style" to _nS(_uM("margin" to "24px 12px"))), _uA(
                _cE("button", _uM("type" to "default", "onClick" to _ctx.openUniIcon), "内置字体图标uni-icon示例", 8, _uA(
                    "onClick"
                ))
            ), 4)
        ), 64)
    }
    open var uniIcon: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("uniIcon" to "\ue100")
    }
    open var openUniIcon = ::gen_openUniIcon_fn
    open fun gen_openUniIcon_fn() {
        uni_navigateTo(NavigateToOptions(url = "/pages/CSS/text/font-family-icon"))
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
                return _uM("common" to _pS(_uM("fontSize" to 20, "lineHeight" to "40px")), "@FONT-FACE" to _uM("0" to _uM("fontFamily" to "AlimamaDaoLiTiTTF", "src" to "url('https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/font/AlimamaDaoLiTi.ttf')"), "1" to _uM("fontFamily" to "AlimamaDaoLiTiOTF", "src" to "url('/static/font/AlimamaDaoLiTi.otf')"), "2" to _uM("fontFamily" to "UniFontFamily", "src" to "url('/assets/uni.173d2b94.ttf')")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
