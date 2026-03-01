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
import io.dcloud.uniapp.extapi.getSystemInfo as uni_getSystemInfo
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync
open class GenPagesAPIGetSystemInfoGetSystemInfo : BasePage {
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
        onUnload(fun() {}, __ins)
        onReady(fun() {
            this.screenHeightAtReady = uni_getSystemInfoSync().screenHeight
            console.log("全局获取屏幕高度: " + globalScreenHeight + "  onReady内获取屏幕高度: " + this.screenHeightAtReady)
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
                _cE("view", _uM("class" to "uni-common-mt"), _uA(
                    _cE("view", _uM("class" to "uni-list"), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, _, __index, _cached): Any {
                            return _cE("view", _uM("class" to "uni-list-cell", "style" to _nS(_uM("align-items" to "center"))), _uA(
                                _cE("view", _uM("class" to "uni-pd"), _uA(
                                    _cE("view", _uM("class" to "uni-label", "style" to _nS(_uM("width" to "180px"))), _tD(item.label), 5)
                                )),
                                _cE("view", _uM("class" to "uni-list-cell-db"), _uA(
                                    _cE("text", _uM("class" to "uni-list-cell-db-text"), _tD(if (item.value == "") {
                                        "未获取"
                                    } else {
                                        item.value
                                    }
                                    ), 1)
                                ))
                            ), 4)
                        }
                        ), 256)
                    )),
                    _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                        _cE("view", _uM("class" to "uni-btn-v"), _uA(
                            _cE("button", _uM("type" to "primary", "onClick" to _ctx.getSystemInfoSync), " 同步获取设备系统信息 ", 8, _uA(
                                "onClick"
                            )),
                            _cE("button", _uM("type" to "primary", "onClick" to _ctx.getSystemInfo, "style" to _nS(_uM("margin-top" to "20px"))), " 异步获取设备系统信息 ", 12, _uA(
                                "onClick"
                            ))
                        ))
                    ))
                ))
            ))
        ), 4)
    }
    open var title: String by `$data`
    open var items: UTSArray<Item__2> by `$data`
    open var screenHeightAtReady: Number by `$data`
    open var jest_result: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "getSystemInfo", "items" to _uA<Item__2>(), "screenHeightAtReady" to 0, "jest_result" to false)
    }
    open var getSystemInfo = ::gen_getSystemInfo_fn
    open fun gen_getSystemInfo_fn() {
        uni_getSystemInfo(GetSystemInfoOptions(success = fun(res){
            this.items = _uA<Item__2>()
            val res_str = JSON.stringify(res)
            val res_obj = JSON.parseObject(res_str)
            val res_map = res_obj!!.toMap()
            var keys = _uA<String>()
            res_map.forEach(fun(_, key){
                keys.push(key)
            }
            )
            keys.sort().forEach(fun(key){
                val value = res[key]
                if (value != null) {
                    val item = Item__2(label = key, value = "" + (if ((UTSAndroid.`typeof`(value) == "object")) {
                        JSON.stringify(value)
                    } else {
                        value
                    }
                    ))
                    this.items.push(item)
                }
            }
            )
        }
        ))
    }
    open var getSystemInfoSync = ::gen_getSystemInfoSync_fn
    open fun gen_getSystemInfoSync_fn() {
        this.items = _uA<Item__2>()
        val res = uni_getSystemInfoSync()
        val res_str = JSON.stringify(res)
        val res_obj = JSON.parseObject(res_str)
        val res_map = res_obj!!.toMap()
        var keys = _uA<String>()
        res_map.forEach(fun(_, key){
            keys.push(key)
        }
        )
        keys.sort().forEach(fun(key){
            val value = res[key]
            if (value != null) {
                val item = Item__2(label = key, value = "" + (if ((UTSAndroid.`typeof`(value) == "object")) {
                    JSON.stringify(value)
                } else {
                    value
                }
                ))
                this.items.push(item)
            }
        }
        )
    }
    open var jest_getSystemInfo = ::gen_jest_getSystemInfo_fn
    open fun gen_jest_getSystemInfo_fn(): GetSystemInfoResult {
        return uni_getSystemInfoSync()
    }
    open var jest_getScreenHeight_at_different_stages = ::gen_jest_getScreenHeight_at_different_stages_fn
    open fun gen_jest_getScreenHeight_at_different_stages_fn() {
        this.jest_result = (globalScreenHeight == this.screenHeightAtReady)
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
                return _uM("uni-pd" to _pS(_uM("paddingLeft" to 15)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
