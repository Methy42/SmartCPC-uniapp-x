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
import io.dcloud.uniapp.extapi.startPullDownRefresh as uni_startPullDownRefresh
import io.dcloud.uniapp.extapi.stopPullDownRefresh as uni_stopPullDownRefresh
open class GenPagesAPIPullDownRefreshPullDownRefresh : BasePage {
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
        onReady(fun() {
            uni_startPullDownRefresh(null)
            this.initData()
        }
        , __ins)
        onReachBottom(fun() {
            console.log("onReachBottom", " at pages/API/pull-down-refresh/pull-down-refresh.uvue:30")
            if (this.max > 40) {
                this.loadMoreText = "没有更多数据了!"
                return
            }
            this.showLoadMore = true
            setTimeout(fun(){
                this.setListData()
            }
            , 300)
        }
        , __ins)
        onPullDownRefresh(fun() {
            console.log("onPullDownRefresh", " at pages/API/pull-down-refresh/pull-down-refresh.uvue:41")
            this.pulldownRefreshTriggered = true
            this.initData()
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.data, fun(num, index, __index, _cached): Any {
                    return _cE("text", _uM("class" to "text", "key" to index), "list - " + _tD(num), 1)
                }
                ), 128),
                if (isTrue(_ctx.showLoadMore)) {
                    _cE("view", _uM("key" to 0), _tD(_ctx.loadMoreText), 1)
                } else {
                    _cC("v-if", true)
                }
            ))
        ), 4)
    }
    open var data: UTSArray<Number> by `$data`
    open var loadMoreText: String by `$data`
    open var showLoadMore: Boolean by `$data`
    open var max: Number by `$data`
    open var pulldownRefreshTriggered: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("data" to _uA<Number>(), "loadMoreText" to "加载中...", "showLoadMore" to false, "max" to 0, "pulldownRefreshTriggered" to false)
    }
    open var initData = ::gen_initData_fn
    open fun gen_initData_fn() {
        setTimeout(fun(){
            this.max = 0
            this.data = _uA()
            var data: UTSArray<Number> = _uA()
            this.max += 20
            run {
                var i: Number = this.max - 19
                while(i < this.max + 1){
                    data.push(i)
                    i++
                }
            }
            this.data = this.data.concat(data)
            uni_stopPullDownRefresh()
        }
        , 1000)
    }
    open var setListData = ::gen_setListData_fn
    open fun gen_setListData_fn() {
        var data: UTSArray<Number> = _uA()
        this.max += 10
        run {
            var i: Number = this.max - 9
            while(i < this.max + 1){
                data.push(i)
                i++
            }
        }
        this.data = this.data.concat(data)
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
                return _uM("text" to _pS(_uM("marginTop" to 6, "marginRight" to 0, "marginBottom" to 6, "marginLeft" to 0, "width" to "100%", "backgroundColor" to "#ffffff", "height" to 52, "lineHeight" to "52px", "textAlign" to "center", "color" to "#555555", "borderTopLeftRadius" to 4, "borderTopRightRadius" to 4, "borderBottomRightRadius" to 4, "borderBottomLeftRadius" to 4)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
