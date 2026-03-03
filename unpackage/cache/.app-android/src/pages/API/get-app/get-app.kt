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
open class GenPagesAPIGetAppGetApp : BasePage {
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
            this.lifeCycleNum = state.lifeCycleNum
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1", "padding-bottom" to "20px"))), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to "getApp")),
                _cE("view", _uM("class" to "uni-padding-wrap"), _uA(
                    _cE("button", _uM("onClick" to _ctx.getGlobalData), "get globalData", 8, _uA(
                        "onClick"
                    )),
                    if (isTrue(_ctx.originGlobalData.str.length)) {
                        _cE(Fragment, _uM("key" to 0), _uA(
                            _cE("text", _uM("class" to "uni-common-mt bold"), "初始的 globalData:"),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData string: " + _tD(_ctx.originGlobalData.str), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData number: " + _tD(_ctx.originGlobalData.num), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData boolean: " + _tD(_ctx.originGlobalData.bool), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData object: " + _tD(_ctx.originGlobalData.obj), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData null: " + _tD(_ctx.originGlobalData.`null`), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData array: " + _tD(_ctx.originGlobalData.arr), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData Set: " + _tD(_ctx.originGlobalData.mySet), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData Map: " + _tD(_ctx.originGlobalData.myMap), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData func 返回值: " + _tD(_ctx.originGlobalDataFuncRes), 1)
                        ), 64)
                    } else {
                        _cC("v-if", true)
                    }
                    ,
                    _cE("button", _uM("onClick" to _ctx.setGlobalData, "class" to "uni-common-mt"), " set globalData ", 8, _uA(
                        "onClick"
                    )),
                    if (isTrue(_ctx.newGlobalData.bool)) {
                        _cE(Fragment, _uM("key" to 1), _uA(
                            _cE("text", _uM("class" to "uni-common-mt bold"), "更新后的 globalData:"),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData string: " + _tD(_ctx.newGlobalData.str), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData number: " + _tD(_ctx.newGlobalData.num), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData boolean: " + _tD(_ctx.newGlobalData.bool), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData object: " + _tD(_ctx.newGlobalData.obj), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData null: " + _tD(_ctx.newGlobalData.`null`), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData array: " + _tD(_ctx.newGlobalData.arr), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData Set: " + _tD(_ctx.newGlobalData.mySet), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData Map: " + _tD(_ctx.newGlobalData.myMap), 1),
                            _cE("text", _uM("class" to "uni-common-mt"), "globalData func 返回值: " + _tD(_ctx.newGlobalDataFuncRes), 1)
                        ), 64)
                    } else {
                        _cC("v-if", true)
                    }
                    ,
                    _cE("text", _uM("class" to "uni-common-mt"), "点击按钮调用 App.uvue methods"),
                    _cE("text", _uM("class" to "uni-common-mt"), "increaseLifeCycleNum 方法"),
                    _cE("button", _uM("class" to "uni-common-mt", "onClick" to _ctx._increaseLifeCycleNum), " increase lifeCycleNum ", 8, _uA(
                        "onClick"
                    )),
                    _cE("text", _uM("class" to "uni-common-mt"), "lifeCycleNum: " + _tD(_ctx.lifeCycleNum), 1),
                    _cE("button", _uM("class" to "uni-common-mt", "onClick" to _ctx.getAndroidApplication), " getAndroidApplication ", 8, _uA(
                        "onClick"
                    )),
                    _cE("text", _uM("class" to "uni-common-mt"), "androidApplication is null: " + _tD(_ctx.androidApplication == null), 1)
                ))
            ))
        ), 4)
    }
    open var originGlobalData: MyGlobalData by `$data`
    open var originGlobalDataFuncRes: String by `$data`
    open var newGlobalData: MyGlobalData by `$data`
    open var newGlobalDataFuncRes: String by `$data`
    open var lifeCycleNum: Number by `$data`
    open var androidApplication: Any? by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("originGlobalData" to MyGlobalData(str = "", num = 0, bool = false, obj = object : UTSJSONObject() {
            var str = ""
            var num: Number = 0
            var bool = false
        }, `null` = null, arr = _uA<Number>(), mySet = _uA<String>(), myMap = UTSJSONObject(), func = fun(): String {
            return ""
        }
        ), "originGlobalDataFuncRes" to "", "newGlobalData" to MyGlobalData(str = "", num = 0, bool = false, obj = object : UTSJSONObject() {
            var str = ""
            var num: Number = 0
            var bool = false
        }, `null` = null, arr = _uA<Number>(), mySet = _uA<String>(), myMap = UTSJSONObject(), func = fun(): String {
            return ""
        }
        ), "newGlobalDataFuncRes" to "", "lifeCycleNum" to 0, "androidApplication" to null as Any?)
    }
    open var getGlobalData = ::gen_getGlobalData_fn
    open fun gen_getGlobalData_fn() {
        val app = getApp()
        this.originGlobalData.str = app.globalData.str
        this.originGlobalData.num = app.globalData.num
        this.originGlobalData.bool = app.globalData.bool
        this.originGlobalData.obj = app.globalData.obj
        this.originGlobalData.`null` = app.globalData.`null`
        this.originGlobalData.arr = app.globalData.arr
        app.globalData.mySet.forEach(fun(value: String){
            this.originGlobalData.mySet.push(value)
        }
        )
        app.globalData.myMap.forEach(fun(value: Any, key: String){
            this.originGlobalData.myMap[key] = value
        }
        )
        this.originGlobalData.func = app.globalData.func
        this.originGlobalDataFuncRes = this.originGlobalData.func()
    }
    open var setGlobalData = ::gen_setGlobalData_fn
    open fun gen_setGlobalData_fn() {
        val app = getApp()
        app.globalData.str = "new globalData str"
        app.globalData.num = 100
        app.globalData.bool = true
        app.globalData.obj = object : UTSJSONObject() {
            var str = "new globalData obj str"
            var num: Number = 200
            var bool = true
        }
        app.globalData.`null` = "not null"
        app.globalData.arr = _uA(
            1,
            2,
            3
        )
        app.globalData.mySet = Set(_uA(
            "a",
            "b",
            "c"
        ))
        app.globalData.myMap = Map(_uA(
            _uA(
                "a",
                1
            ),
            _uA(
                "b",
                2
            ),
            _uA(
                "c",
                3
            )
        ))
        app.globalData.func = fun(): String {
            return "new globalData func"
        }
        this.newGlobalData.str = app.globalData.str
        this.newGlobalData.num = app.globalData.num
        this.newGlobalData.bool = app.globalData.bool
        this.newGlobalData.obj = app.globalData.obj
        this.newGlobalData.`null` = app.globalData.`null`
        this.newGlobalData.arr = app.globalData.arr
        app.globalData.mySet.forEach(fun(value: String){
            this.newGlobalData.mySet.push(value)
        }
        )
        app.globalData.myMap.forEach(fun(value: Any, key: String){
            this.newGlobalData.myMap[key] = value
        }
        )
        this.newGlobalData.func = app.globalData.func
        this.newGlobalDataFuncRes = this.newGlobalData.func()
    }
    open var _increaseLifeCycleNum = ::gen__increaseLifeCycleNum_fn
    open fun gen__increaseLifeCycleNum_fn() {
        val app = getApp()
        app.vm!!.increaseLifeCycleNum()
        this.lifeCycleNum = state.lifeCycleNum
    }
    open var setLifeCycleNum = ::gen_setLifeCycleNum_fn
    open fun gen_setLifeCycleNum_fn(num: Number) {
        uni.UNI2A1DFEF.setLifeCycleNum(num)
    }
    open var getAndroidApplication = ::gen_getAndroidApplication_fn
    open fun gen_getAndroidApplication_fn(): Boolean {
        val app = getApp()
        this.androidApplication = app.getAndroidApplication()
        return this.androidApplication != null
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
                return _uM("bold" to _pS(_uM("fontWeight" to "bold")), "hr" to _pS(_uM("borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#cccccc")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
