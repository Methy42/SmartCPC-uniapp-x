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
import io.dcloud.uniapp.extapi.`$off` as uni__off
import io.dcloud.uniapp.extapi.`$on` as uni__on
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery
open class GenPagesAPICreateSelectorQueryCreateSelectorQuery : BasePage {
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
            uni__on("childReady", this.onChildReady)
        }
        , __ins)
        onUnload(fun() {
            uni__off("childReady", this.onChildReady)
        }
        , __ins)
        onReady(fun() {
            this.testFields()
            this.testNode()
        }
        , __ins)
        onResize(fun(_: OnResizeOptions) {}, __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_node_child = resolveComponent("node-child")
        val _component_multi_child = resolveComponent("multi-child")
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", _uM("class" to "page uni-list-cell-db-text", "id" to "page"), _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("button", _uM("class" to "btn btn-get-node-info", "onClick" to _ctx.getNodeInfo), "getNodeInfo", 8, _uA(
                    "onClick"
                )),
                _cE("button", _uM("class" to "btn btn-get-all-node-info", "onClick" to _ctx.getAllNodeInfo), "getAllNodeInfo", 8, _uA(
                    "onClick"
                )),
                _cE("view", _uM("id" to "rect-1-2", "class" to "rect-1-2"), _uA(
                    _cE("view", _uM("class" to "rect rect1")),
                    _cE("view", _uM("class" to "rect rect2"))
                )),
                _cE("view", _uM("class" to "rect-info-1-2"), _uA(
                    _cE(Fragment, null, RenderHelpers.renderList(_ctx.nodeInfoList, fun(nodeInfo, index, __index, _cached): Any {
                        return _cE("view", _uM("class" to "rect-info", "key" to index), _uA(
                            _cE("view", _uM("class" to "node-info-item"), _uA(
                                _cE("text", _uM("class" to "node-info-item-k"), "left: "),
                                _cE("text", _uM("class" to "node-info-item-v"), _tD(nodeInfo.left), 1)
                            )),
                            _cE("view", _uM("class" to "node-info-item"), _uA(
                                _cE("text", _uM("class" to "node-info-item-k"), "top: "),
                                _cE("text", _uM("class" to "node-info-item-v"), _tD(nodeInfo.top), 1)
                            )),
                            _cE("view", _uM("class" to "node-info-item"), _uA(
                                _cE("text", _uM("class" to "node-info-item-k"), "right: "),
                                _cE("text", _uM("class" to "node-info-item-v"), _tD(nodeInfo.right), 1)
                            )),
                            _cE("view", _uM("class" to "node-info-item"), _uA(
                                _cE("text", _uM("class" to "node-info-item-k"), "bottom: "),
                                _cE("text", _uM("class" to "node-info-item-v"), _tD(nodeInfo.bottom), 1)
                            )),
                            _cE("view", _uM("class" to "node-info-item"), _uA(
                                _cE("text", _uM("class" to "node-info-item-k"), "width: "),
                                _cE("text", _uM("class" to "node-info-item-v"), _tD(nodeInfo.width), 1)
                            )),
                            _cE("view", _uM("class" to "node-info-item"), _uA(
                                _cE("text", _uM("class" to "node-info-item-k"), "height: "),
                                _cE("text", _uM("class" to "node-info-item-v"), _tD(nodeInfo.height), 1)
                            ))
                        ))
                    }
                    ), 128)
                )),
                _cV(_component_node_child, _uM("class" to "node-child")),
                _cE("text", null, "子组件多根节点"),
                _cV(_component_multi_child, _uM("ref" to "multi-child", "id" to "multi-child"), null, 512),
                _cE("text", null, "子组件多根节点(仅测试，用于验证查询是否超出范围)"),
                _cV(_component_multi_child, _uM("id" to "multi-child-2")),
                _cE("view", null, _uA(
                    _cE("text", null, "测试.fields"),
                    _cE("text", null, _tD(_ctx.fieldsResultContainNode), 1)
                )),
                _cE("view", null, _uA(
                    _cE("text", null, "测试.node"),
                    _cE("text", null, _tD(_ctx.nodeResultContainNode), 1)
                )),
                _cE("canvas", _uM("id" to "canvas1"))
            ))
        ))
    }
    open var title: String by `$data`
    open var nodeInfoList: UTSArray<NodeInfoType> by `$data`
    open var rootNodeInfo: NodeInfoType? by `$data`
    open var selectCount: Number by `$data`
    open var selectAllCount: Number by `$data`
    open var fieldsResultContainNode: Boolean by `$data`
    open var nodeResultContainNode: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "createSelectorQuery", "nodeInfoList" to _uA<NodeInfoType>(), "rootNodeInfo" to null as NodeInfoType?, "selectCount" to 0, "selectAllCount" to 0, "fieldsResultContainNode" to false, "nodeResultContainNode" to false)
    }
    open var onChildReady = ::gen_onChildReady_fn
    open fun gen_onChildReady_fn() {
        val instance2 = (this.`$refs`["multi-child"] as ComponentPublicInstance)
        this.selectCount = instance2.`$data`["selectCount"] as Number
        this.selectAllCount = instance2.`$data`["selectAllCount"] as Number
    }
    open var getRootNodeInfo = ::gen_getRootNodeInfo_fn
    open fun gen_getRootNodeInfo_fn(selector: String) {
        uni_createSelectorQuery().select(selector).boundingClientRect().exec(fun(ret){
            if (ret.length == 1) {
                val nodeInfo = ret[0] as NodeInfo
                val nodeType = NodeInfoType(left = nodeInfo.left, top = nodeInfo.top, right = nodeInfo.right, bottom = nodeInfo.bottom, width = nodeInfo.width, height = nodeInfo.height)
                this.rootNodeInfo = nodeType
            }
        }
        )
    }
    open var getNodeInfo = ::gen_getNodeInfo_fn
    open fun gen_getNodeInfo_fn() {
        uni_createSelectorQuery().select(".rect1").boundingClientRect().exec(fun(ret){
            this.nodeInfoList.length = 0
            val i = ret[0] as NodeInfo
            this.nodeInfoList.push(NodeInfoType(left = i.left, top = i.top, right = i.right, bottom = i.bottom, width = i.width, height = i.height))
        }
        )
    }
    open var getAllNodeInfo = ::gen_getAllNodeInfo_fn
    open fun gen_getAllNodeInfo_fn() {
        uni_createSelectorQuery().selectAll(".rect").boundingClientRect().exec(fun(ret){
            this.nodeInfoList.length = 0
            val array = ret[0] as UTSArray<NodeInfo>
            array.forEach(fun(i){
                this.nodeInfoList.push(NodeInfoType(left = i.left, top = i.top, right = i.right, bottom = i.bottom, width = i.width, height = i.height))
            }
            )
        }
        )
    }
    open var testFields = ::gen_testFields_fn
    open fun gen_testFields_fn() {
        uni_createSelectorQuery().select(".rect1").fields(NodeField(node = true), fun(ret){
            val isElement = (ret as NodeInfo).node is UniElement
            if (isElement) {
                this.fieldsResultContainNode = true
            } else {
                this.fieldsResultContainNode = false
            }
        }
        ).exec()
    }
    open var testNode = ::gen_testNode_fn
    open fun gen_testNode_fn() {
        uni_createSelectorQuery().select("#canvas1").node(fun(ret){
            val isElement = (ret as NodeInfo).node is UniElement
            val isCanvasElement = ((ret as NodeInfo).node as UniCanvasElement).tagName == "CANVAS"
            if (isElement && isCanvasElement) {
                this.nodeResultContainNode = true
            } else {
                this.nodeResultContainNode = false
            }
        }
        ).exec()
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
                return _uM("page" to _pS(_uM("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "btn" to _pS(_uM("marginTop" to 15)), "rect-1-2" to _pS(_uM("flexDirection" to "row", "marginTop" to 15)), "rect" to _pS(_uM("width" to 150, "height" to 100)), "rect1" to _pS(_uM("backgroundColor" to "#1E90FF")), "rect2" to _pS(_uM("marginLeft" to "auto", "backgroundColor" to "#2E8B57")), "rect-info-1-2" to _pS(_uM("flexDirection" to "row", "marginTop" to 15)), "rect-info" to _pS(_uM("flexGrow" to 1, "flexShrink" to 1, "flexBasis" to "0%", "flexDirection" to "column")), "node-info-item" to _pS(_uM("flexDirection" to "row")), "node-info-item-k" to _pS(_uM("width" to 72, "lineHeight" to 2)), "node-info-item-v" to _pS(_uM("fontWeight" to "bold", "lineHeight" to 2)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM("nodeChild" to GenPagesAPICreateSelectorQueryNodesInfoChildClass, "multiChild" to GenPagesAPICreateSelectorQuerySelectorQueryChildMultiClass)
    }
}
