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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo
open class GenPagesComponentSwiperSwiperAnim : BasePage {
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
        return _cE("view", null, _uA(
            _cE("text", null, "computed属性在设置duration=0的测试:"),
            _cE("swiper", _uM("current" to _ctx.current, "vertical" to true, "duration" to "0", "style" to _nS(_uM("height" to "100px", "width" to "100%"))), _uA(
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, fun(item, index, __index, _cached): Any {
                    return _cE("swiper-item", _uM("key" to item.id), _uA(
                        _cE("view", null, " 当前实际渲染的值:" + _tD(index) + ",指定current的值：" + _tD(_ctx.current), 1)
                    ))
                }
                ), 128)
            ), 12, _uA(
                "current"
            )),
            _cE("text", null, "同时设置autoplay / circular / duration的测试:"),
            _cE("swiper", _uM("id" to "swiper-view", "autoplay" to true, "interval" to 3000, "circular" to true, "duration" to 3000, "current" to 0, "style" to _nS(_uM("height" to "100px", "width" to "100%"))), _uA(
                _cE("swiper-item", null, _uA(
                    _cE("text", null, "0000000000000000000")
                )),
                _cE("swiper-item", null, _uA(
                    _cE("text", null, "111111111111111111")
                ))
            ), 4)
        ))
    }
    open var list: UTSArray<ListType> by `$data`
    open var current: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("list" to _uA<ListType>(ListType(id = 1, content = "第一个"), ListType(id = 2, content = "第二个")), "current" to computed<Number>(fun(): Number {
            return 1
        }
        ))
    }
    open var jest_getWindowInfo = ::gen_jest_getWindowInfo_fn
    open fun gen_jest_getWindowInfo_fn(): GetWindowInfoResult {
        return uni_getWindowInfo()
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
