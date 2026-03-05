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
open class GenPagesComponentCoverViewCoverView : BasePage {
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
            this.showMap = true
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_map = resolveComponent("map")
        return _cE("view", null, _uA(
            _cV(_component_page_head, _uM("title" to "cover-view用于覆盖map、video等原生组件")),
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mb"), _uA(
                _cE("text", _uM("class" to "uni-subtitle-text"), "注意：Web和App需正确配置地图SDK的Key才能正常显示地图组件")
            )),
            _cE("view", _uM("class" to "cover-content"), _uA(
                _cV(_component_map, _uM("class" to "map", "latitude" to _ctx.latitude, "longitude" to _ctx.longitude), null, 8, _uA(
                    "latitude",
                    "longitude"
                )),
                _cE("cover-view", _uM("class" to "cover-view"), "简单的cover-view"),
                _cE("image", _uM("class" to "cover-image", "src" to "/static/uni.png"))
            ))
        ))
    }
    open var showMap: Boolean by `$data`
    open var latitude: Number by `$data`
    open var longitude: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("showMap" to false, "latitude" to 39.909, "longitude" to 116.39742)
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
                return _uM("map" to _pS(_uM("width" to "100%", "height" to 600)), "cover-content" to _pS(_uM("position" to "relative")), "cover-view" to _pS(_uM("position" to "absolute", "left" to 5, "top" to 5, "width" to 188, "textAlign" to "center", "backgroundColor" to "#DDDDDD")), "cover-image" to _pS(_uM("position" to "absolute", "left" to 0, "top" to 0, "right" to 0, "bottom" to 0, "marginTop" to "auto", "marginRight" to "auto", "marginBottom" to "auto", "marginLeft" to "auto", "width" to 96, "height" to 96)), "tips" to _pS(_uM("fontSize" to 12, "marginTop" to 15, "opacity" to 0.8)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
