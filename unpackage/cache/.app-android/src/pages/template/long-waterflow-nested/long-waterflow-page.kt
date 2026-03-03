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
import io.dcloud.uniapp.extapi.request as uni_request
open class GenPagesTemplateLongWaterflowNestedLongWaterflowPage : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var type: String by `$props`
    open var preload: Boolean by `$props`
    open var id: String by `$props`
    open var refreshData: (loadComplete: (() -> Unit)?) -> Unit
        get() {
            return unref(this.`$exposed`["refreshData"]) as (loadComplete: (() -> Unit)?) -> Unit
        }
        set(value) {
            setRefValue(this.`$exposed`, "refreshData", value)
        }
    open var loadData: (loadComplete: (() -> Unit)?) -> Unit
        get() {
            return unref(this.`$exposed`["loadData"]) as (loadComplete: (() -> Unit)?) -> Unit
        }
        set(value) {
            setRefValue(this.`$exposed`, "loadData", value)
        }
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesTemplateLongWaterflowNestedLongWaterflowPage, __setupCtx: SetupContext) -> Any? = fun(__props, __setupCtx): Any? {
            val __expose = __setupCtx.expose
            val __ins = getCurrentInstance()!!
            val _ctx = __ins.proxy as GenPagesTemplateLongWaterflowNestedLongWaterflowPage
            val _cache = __ins.renderCache
            val SERVER_URL = "https://unidemo.dcloud.net.cn/plugin/uniappx-plugin-list"
            val PAGE_SIZE: Number = 10
            val props = __props
            val loading = ref(false)
            val datagrid = ref(_uA<flowItem>())
            val isEnded = ref(false)
            val loadingError = ref("")
            val currentPage = ref(1)
            val loadingText = computed(fun(): String {
                if (loading.value) {
                    return "加载中..."
                } else if (isEnded.value) {
                    return "没有更多了"
                } else if (loadingError.value.length > 0) {
                    return loadingError.value
                } else {
                    return ""
                }
            }
            )
            fun gen_loadData_fn(loadComplete: (() -> Unit)?) {
                if (loading.value || isEnded.value) {
                    return
                }
                loading.value = true
                uni_request<ResponseDataType__1>(RequestOptions(url = SERVER_URL, data = object : UTSJSONObject() {
                    var type = props.type
                    var page = currentPage.value
                    var page_size = PAGE_SIZE
                }, success = fun(res){
                    val responseData = res.data
                    if (responseData == null) {
                        return
                    }
                    datagrid.value.push(*responseData.data.toTypedArray())
                    if (responseData.data.length == 0) {
                        isEnded.value = true
                    } else {
                        currentPage.value++
                    }
                }
                , fail = fun(err){
                    loadingError.value = err.errMsg
                }
                , complete = fun(_){
                    loading.value = false
                    if (loadComplete != null) {
                        loadComplete()
                    }
                }
                ))
            }
            val loadData = ::gen_loadData_fn
            fun gen_refreshData_fn(loadComplete: (() -> Unit)?) {
                datagrid.value.length = 0
                currentPage.value = 1
                loadData(loadComplete)
            }
            val refreshData = ::gen_refreshData_fn
            fun gen_convertToStarUnicode_fn(score: Number): String {
                val fill_code = "\ue879"
                val half_code = "\ue87a"
                val null_code = "\ue87b"
                val fillStarCount = parseInt(score / 10 % 10 + "")
                val halfStarCount = if (score % 10 >= 5) {
                    1
                } else {
                    0
                }
                val nullStarCount = 5 - fillStarCount - halfStarCount
                var result = ""
                if (fillStarCount > 0) {
                    result += fill_code.repeat(fillStarCount)
                }
                if (halfStarCount > 0) {
                    result += half_code.repeat(halfStarCount)
                }
                if (nullStarCount > 0) {
                    result += null_code.repeat(nullStarCount)
                }
                return result
            }
            val convertToStarUnicode = ::gen_convertToStarUnicode_fn
            onMounted(fun(){
                if (props.preload) {
                    loadData(null)
                }
            }
            )
            __expose(_uM("refreshData" to refreshData, "loadData" to loadData))
            return fun(): Any? {
                val _component_uni_loading = resolveEasyComponent("uni-loading", GenUniModulesUniLoadingComponentsUniLoadingUniLoadingClass)
                return _cE("waterflow", _uM("id" to _ctx.id, "class" to "grid", "bounces" to false, "scroll-y" to true, "custom-nested-scroll" to true, "main-axis-gap" to "8px", "cross-axis-gap" to "8px", "cross-axis-count" to "2", "onScrolltolower" to fun(){
                    loadData(null)
                }
                , "associative-container" to "nested-scroll-view"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(unref(datagrid), fun(item, _, __index, _cached): Any {
                        return _cE("flow-item", _uM("class" to "flow-item", "key" to item.plugin_id, "type" to "1"), _uA(
                            _cE("view", _uM("class" to "flow-item-icon"), _uA(
                                _cE("image", _uM("class" to "flow-item-icon-image", "src" to item.plugin_img_link, "mode" to "aspectFit"), null, 8, _uA(
                                    "src"
                                ))
                            )),
                            _cE("view", _uM("class" to "flow-item-fill"), _uA(
                                _cE("view", _uM("class" to "flex-row"), _uA(
                                    _cE("text", _uM("class" to "title"), _tD(item.plugin_name), 1)
                                )),
                                _cE("view", null, _uA(
                                    _cE("text", _uM("class" to "description-text"), _tD(item.plugin_intro), 1)
                                )),
                                _cE("text", _uM("class" to "icon-star"), _tD(convertToStarUnicode(item.score)), 1),
                                _cE("view", _uM("class" to "tag-grid"), _uA(
                                    _cE(Fragment, null, RenderHelpers.renderList(item.tags.slice(0, 1), fun(item2, index2, __index, _cached): Any {
                                        return _cE("text", _uM("class" to "tag-item", "key" to index2), _tD(item2), 1)
                                    }
                                    ), 128)
                                )),
                                _cE("view", _uM("class" to "flex-row update-date"), _uA(
                                    _cE("text", _uM("class" to "author"), _tD(item.author_name), 1)
                                )),
                                _cE("view", _uM("class" to "flex-row update-date"), _uA(
                                    _cE("text", _uM("class" to "update-date-text"), "更新日期"),
                                    _cE("text", _uM("class" to "update-date-value"), _tD(item.update_date), 1)
                                ))
                            ))
                        ))
                    }
                    ), 128),
                    _cE("flow-item", _uM("slot" to "load-more", "class" to "loading", "type" to "6"), _uA(
                        _cV(_component_uni_loading, _uM("loading" to unref(loading), "color" to "#999", "text" to unref(loadingText)), null, 8, _uA(
                            "loading",
                            "text"
                        ))
                    ))
                ), 40, _uA(
                    "id",
                    "onScrolltolower"
                ))
            }
        }
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(
                styles0
            ))
        }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return _uM("grid" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "backgroundColor" to "#f7f7f7")), "flow-item" to _pS(_uM("flexDirection" to "column", "borderTopLeftRadius" to 5, "borderTopRightRadius" to 5, "borderBottomRightRadius" to 5, "borderBottomLeftRadius" to 5, "backgroundColor" to "#ffffff")), "flow-item-icon" to _pS(_uM("position" to "relative")), "flow-item-icon-image" to _pS(_uM("width" to "100%")), "flow-item-fill" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5)), "description-text" to _pS(_uM("fontSize" to 13, "color" to "#666666", "lineHeight" to "19px")), "icon-star" to _pS(_uM("fontFamily" to "UtsStarIcons", "fontSize" to 16, "fontStyle" to "normal", "color" to "#ffca3e", "letterSpacing" to 3)), "tag-grid" to _pS(_uM("flexDirection" to "row", "marginTop" to 5)), "tag-item" to _pS(_uM("fontSize" to 12, "backgroundColor" to "#EFF9F0", "color" to "#639069", "borderTopLeftRadius" to 20, "borderTopRightRadius" to 20, "borderBottomRightRadius" to 20, "borderBottomLeftRadius" to 20, "marginRight" to 5, "paddingTop" to 2, "paddingRight" to 5, "paddingBottom" to 2, "paddingLeft" to 5)), "update-date" to _pS(_uM("marginTop" to 10)), "update-date-text" to _pS(_uM("fontSize" to 12, "color" to "#888888")), "update-date-value" to _pS(_uM("fontSize" to 12, "color" to "#777777", "marginLeft" to 5)), "author" to _pS(_uM("fontSize" to 12, "color" to "#008000")), "loading" to _pS(_uM("paddingTop" to 30, "paddingRight" to 30, "paddingBottom" to 30, "paddingLeft" to 30, "alignItems" to "center", "height" to 80)), "flex-row" to _pS(_uM("flexDirection" to "row")), "@FONT-FACE" to _uM("0" to _uM("fontFamily" to "UtsStarIcons", "src" to "url('/static/fonts/icon-star.ttf')")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM("type" to _uM("type" to "String", "default" to ""), "preload" to _uM("type" to "Boolean", "default" to false), "id" to _uM("type" to "String", "default" to "")))
        var propsNeedCastKeys = _uA(
            "type",
            "preload",
            "id"
        )
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
