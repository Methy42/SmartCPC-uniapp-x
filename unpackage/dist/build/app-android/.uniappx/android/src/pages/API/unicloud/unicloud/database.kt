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
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading
import io.dcloud.uniapp.extapi.showModal as uni_showModal
open class GenPagesAPIUnicloudUnicloudDatabase : BasePage {
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
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cE("view", null, _uA(
                _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                    "title"
                )),
                _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                    _cE("view", _uM("class" to "uni-btn-v uni-common-mt"), _uA(
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbAdd), "新增单条数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbBatchAdd), "新增多条数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbUpdate), "更新数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbGet), "where传字符串获取数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbGetWithCommand), "where传对象获取数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbRemove), "删除数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbLookupInit), "初始化联表查询数据", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbLookup), "联表查询", 8, _uA(
                            "onClick"
                        )),
                        _cE("button", _uM("type" to "primary", "onClick" to _ctx.dbMultiSend), "合并查询查询", 8, _uA(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ))
    }
    open var title: String by `$data`
    open var addId: String by `$data`
    open var batchAddIds: UTSArray<String> by `$data`
    open var batchAddinserted: Number by `$data`
    open var updateUpdated: Number by `$data`
    open var getData: UTSArray<UTSJSONObject> by `$data`
    open var getWithCommandData: UTSArray<UTSJSONObject> by `$data`
    open var removeDeleted: Number by `$data`
    open var lookupData: UTSArray<UTSJSONObject> by `$data`
    open var multiSendSuccessCount: Number by `$data`
    open var isUniTest: Boolean by `$data`
    open var dataTag: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "ClientDB", "addId" to "", "batchAddIds" to _uA<String>(), "batchAddinserted" to 0, "updateUpdated" to 0, "getData" to _uA<UTSJSONObject>(), "getWithCommandData" to _uA<UTSJSONObject>(), "removeDeleted" to 0, "lookupData" to _uA<UTSJSONObject>(), "multiSendSuccessCount" to 0, "isUniTest" to false, "dataTag" to computed<String>(fun(): String {
            return if (this.isUniTest) {
                "default-tag" + Date.now()
            } else {
                "default-tag"
            }
        }
        ))
    }
    open var notify = ::gen_notify_fn
    open fun gen_notify_fn(content: String, title: String) {
        if (!this.isUniTest) {
            uni_showModal(ShowModalOptions(title = title, content = content, showCancel = false))
        } else {
            console.log(title, content)
        }
    }
    open var dbAdd = ::gen_dbAdd_fn
    open fun gen_dbAdd_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("type").add(_uO("num" to 1, "tag" to this.dataTag, "date" to Date())).then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    this.addId = res.id
                    this.notify("新增成功，id: " + res.id, "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbBatchAdd = ::gen_dbBatchAdd_fn
    open fun gen_dbBatchAdd_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("type").add(_uA(
                    _uO("num" to 2, "tag" to this.dataTag),
                    _uO("num" to 3, "tag" to this.dataTag)
                )).then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    console.log("JSON.stringify(res.inserted)", JSON.stringify(res.inserted))
                    this.batchAddIds = res.ids
                    this.batchAddinserted = res.inserted
                    this.notify("新增成功条数" + res.inserted + ", id列表: " + res.ids.join(","), "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbGet = ::gen_dbGet_fn
    open fun gen_dbGet_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("type").where("tag == \"" + this.dataTag + "\"").field("num, tag").orderBy("num desc").skip(1).limit(2).get().then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    this.getData = res.data
                    this.notify("获取成功，取到了" + res.data.length + "条数据", "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbGetWithCommand = ::gen_dbGetWithCommand_fn
    open fun gen_dbGetWithCommand_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("type").where(_uO("num" to db.command.gt(1), "tag" to this.dataTag)).field("num, tag").orderBy("num desc").skip(1).limit(2).get().then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    this.getWithCommandData = res.data
                    this.notify("获取成功，取到了" + res.data.length + "条数据", "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbUpdate = ::gen_dbUpdate_fn
    open fun gen_dbUpdate_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("type").where("tag == \"" + this.dataTag + "\"").update(object : UTSJSONObject() {
                    var num: Number = 4
                }).then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    this.updateUpdated = res.updated
                    this.notify("更新成功，更新了" + res.updated + "条数据", "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbRemove = ::gen_dbRemove_fn
    open fun gen_dbRemove_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("type").where("tag == \"" + this.dataTag + "\"").remove().then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    this.removeDeleted = res.deleted
                    this.notify("删除成功，删掉了" + res.deleted + "条数据", "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbLookupInit = ::gen_dbLookupInit_fn
    open fun gen_dbLookupInit_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                await(db.collection("local").where("tag == \"" + this.dataTag + "\"").remove().then(fun(): UTSPromise<UniCloudDBRemoveResult> {
                    return db.collection("foreign").where("tag == \"" + this.dataTag + "\"").remove()
                }
                ).then(fun(): UTSPromise<UniCloudDBBatchAddResult> {
                    return db.collection("local").add(_uA(
                        _uO("id" to "local_1", "name" to "local_1_name", "tag" to this.dataTag, "foreign_id" to "foreign_1"),
                        _uO("id" to "local_2", "name" to "local_2_name", "tag" to this.dataTag, "foreign_id" to "foreign_2")
                    ))
                }
                ).then(fun(): UTSPromise<UniCloudDBBatchAddResult> {
                    return db.collection("foreign").add(_uA(
                        _uO("id" to "foreign_1", "name" to "foreign_1_name", "tag" to this.dataTag),
                        _uO("id" to "foreign_2", "name" to "foreign_2_name", "tag" to this.dataTag)
                    ))
                }
                ).then(fun(_): Unit {
                    uni_hideLoading()
                    this.notify("数据初始化成功", "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    console.error(err)
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbLookup = ::gen_dbLookup_fn
    open fun gen_dbLookup_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                uni_showLoading(ShowLoadingOptions(title = "加载中..."))
                val db = uniCloud.databaseForJQL()
                val local = db.collection("local").where("tag == \"" + this.dataTag + "\"").getTemp()
                val foreign = db.collection("foreign").where("tag == \"" + this.dataTag + "\"").getTemp()
                await(db.collection(local, foreign).get().then(fun(res){
                    uni_hideLoading()
                    console.log(res)
                    this.lookupData = res.data
                    this.notify("联表查询成功，取到了" + res.data.length + "条数据", "提示")
                }
                ).`catch`(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    open var dbMultiSend = ::gen_dbMultiSend_fn
    open fun gen_dbMultiSend_fn(): UTSPromise<Unit> {
        return wrapUTSPromise(suspend {
                val db = uniCloud.databaseForJQL()
                val temp1 = db.collection("type").where("tag == \"default-tag\"").getTemp()
                val temp2 = db.collection("type").where("tag == \"default-tag\"").getTemp()
                await(db.multiSend(temp1, temp2).then<Unit>(fun(res){
                    uni_hideLoading()
                    var successCount: Number = 0
                    run {
                        var i: Number = 0
                        while(i < res.dataList.length){
                            val item = res.dataList[i]
                            if (item.errCode == 0) {
                                console.log("第" + i + "个请求查询到" + item.data!!.length + "条数据")
                                successCount++
                            } else {
                                console.error("第" + i + "个请求查询失败，错误信息：" + item.data!!.length)
                            }
                            i++
                        }
                    }
                    this.multiSendSuccessCount = successCount
                    this.notify("合并查询成功，成功查询的语句条数为：" + successCount, "提示")
                }
                ).`catch`<Unit>(fun(err: Any?){
                    uni_hideLoading()
                    val error = err as UniCloudError
                    console.error(err)
                    this.notify(error.errMsg, "错误")
                }
                ))
        })
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            _nCS(_uA(), _uA(
                GenApp.styles
            ))
        }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
