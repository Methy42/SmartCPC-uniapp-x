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
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.reLaunch as uni_reLaunch
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesTabBarTemplate : BasePage {
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
        val _component_u_link = resolveEasyComponent("u-link", GenComponentsULinkULinkClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1")), "enable-back-to-top" to "true"), _uA(
            _cE("view", _uM("class" to _nC(_uA(
                "uni-container",
                if (_ctx.isDarkMode) {
                    "theme-dark"
                } else {
                    "theme-light"
                }
            ))), _uA(
                if (isTrue(!_ctx.hasLeftWin)) {
                    _cE("view", _uM("key" to 0, "class" to "uni-header-logo"), _uA(
                        _cE("image", _uM("class" to "uni-header-image", "src" to "/static/templateIndex.png"))
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                if (isTrue(!_ctx.hasLeftWin)) {
                    _cE("view", _uM("key" to 1, "class" to "uni-text-box"), _uA(
                        _cE("text", _uM("class" to "hello-text"), "以下是部分模板示例，更多模板见插件市场："),
                        _cV(_component_u_link, _uM("href" to "https://ext.dcloud.net.cn", "text" to "https://ext.dcloud.net.cn", "inWhiteList" to true), null, 8, _uA(
                            "text"
                        ))
                    ))
                } else {
                    _cC("v-if", true)
                }
                ,
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, fun(item, index, __index, _cached): Any {
                    return _cE("view", _uM("class" to "uni-panel", "key" to item.id), _uA(
                        _cE("view", _uM("hover-class" to "is--active", "class" to "uni-panel-h", "onClick" to fun(){
                            _ctx.triggerCollapse(index, item)
                        }
                        ), _uA(
                            _cE("text", _uM("class" to _nC(_uA(
                                "uni-panel-text",
                                if (item.enable == false || item.open == true) {
                                    "text-disabled"
                                } else {
                                    ""
                                }
                                ,
                                if (item.url == _ctx.leftWinActive && item.pages.length == 0) {
                                    "left-win-active"
                                } else {
                                    ""
                                }
                            ))), _tD(item.name), 3),
                            _cE("image", _uM("src" to if (item.pages.length > 0) {
                                if (item.open) {
                                    _ctx.arrowUpIcon
                                } else {
                                    _ctx.arrowDownIcon
                                }
                            } else {
                                _ctx.arrowRightIcon
                            }
                            , "class" to "uni-icon-size"), null, 8, _uA(
                                "src"
                            ))
                        ), 8, _uA(
                            "onClick"
                        )),
                        if (isTrue(item.open)) {
                            _cE("view", _uM("key" to 0), _uA(
                                _cE(Fragment, null, RenderHelpers.renderList(item.pages, fun(page, key, __index, _cached): Any {
                                    return _cE("view", _uM("style" to _nS(_uM("padding-left" to "18px")), "class" to "uni-navigate-item", "hover-class" to if (page.enable == false) {
                                        ""
                                    } else {
                                        "is--active"
                                    }, "key" to key, "onClick" to fun(){
                                        _ctx.goDetailPage(page)
                                    }), _uA(
                                        _cE("text", _uM("class" to _nC(_uA(
                                            "uni-navigate-text",
                                            _uM("left-win-active" to (_ctx.leftWinActive === page.url && _ctx.hasLeftWin), "text-disabled" to (page.enable == false))
                                        ))), _tD(page.name), 3),
                                        _cE("image", _uM("src" to _ctx.arrowRightIcon, "class" to "uni-icon-size"), null, 8, _uA(
                                            "src"
                                        ))
                                    ), 12, _uA(
                                        "hover-class",
                                        "onClick"
                                    ))
                                }), 128)
                            ))
                        } else {
                            _cC("v-if", true)
                        }
                    ))
                }
                ), 128)
            ), 2)
        ), 4)
    }
    open var list: UTSArray<ListItem> by `$data`
    open var arrowUpIcon: String by `$data`
    open var arrowDownIcon: String by `$data`
    open var arrowRightIcon: String by `$data`
    open var hasLeftWin: Boolean by `$data`
    open var leftWinActive: String by `$data`
    open var isDarkMode: Boolean by `$data`
    open var netless: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("list" to _uA<ListItem>(ListItem(id = "slider-100", url = "slider-100", name = "slider-100", open = false, pages = _uA<Page__3>()), ListItem(id = "long-list", url = "long-list", name = "左右滑动长列表", open = false, enable = true, pages = _uA<Page__3>(Page__3(name = "顶部banner长列表（嵌套滚动）", url = "long-list-nested"), Page__3(name = "顶部banner瀑布流长列表（嵌套滚动）", url = "long-waterflow-nested"), Page__3(name = "顶部搜索框随时下移长列表", url = "long-list"))), ListItem(id = "list-news", url = "list-news", name = "列表到详情（吸顶）", open = false, pages = _uA<Page__3>()), ListItem(id = "long-list-batch", url = "long-list-batch", name = "分批加载长列表", open = false, pages = _uA<Page__3>()), ListItem(id = "custom-long-list", url = "custom-long-list", name = "回收复用长列表", open = false, pages = _uA<Page__3>()), ListItem(id = "swiper-list", url = "swiper-list", name = "swiper-list", open = false, pages = _uA<Page__3>(Page__3(name = "下划线样式", url = "swiper-list"), Page__3(name = "字体放大样式", url = "swiper-list2"))), ListItem(id = "scroll-fold-nav", url = "scroll-fold-nav", name = "随滚动折叠的导航栏", open = false, pages = _uA<Page__3>()), ListItem(id = "custom-refresher", url = "custom-refresher", name = "自定义下拉刷新", open = false, pages = _uA<Page__3>()), ListItem(id = "pull-zoom-image", url = "pull-zoom-image", name = "下拉缩放顶部封面图", open = false, pages = _uA<Page__3>()), ListItem(id = "scroll-sticky", url = "scroll-sticky", name = "scroll-view自定义滚动吸顶", open = false, pages = _uA<Page__3>()), ListItem(id = "swiper-vertical-video", url = "swiper-vertical-video", name = "竖滑视频", open = false, pages = _uA<Page__3>()), ListItem(id = "half-screen", url = "half-screen", name = "半屏弹窗", open = false, pages = _uA<Page__3>()), ListItem(id = "drop-card", url = "drop-card", name = "划走式卡片", open = false, pages = _uA<Page__3>()), ListItem(id = "navbar-lite", url = "navbar-lite", name = "自定义导航栏", open = false, pages = _uA<Page__3>()), ListItem(id = "nav-transparent", url = "nav-transparent", name = "自定义透明渐变导航栏", open = false, pages = _uA<Page__3>()), ListItem(id = "custom-tab-bar", url = "custom-tab-bar", name = "自定义TabBar", open = false, enable = true, pages = _uA<Page__3>()), ListItem(id = "calendar", url = "calendar", name = "日历", open = false, pages = _uA<Page__3>()), ListItem(id = "schema", url = "schema", name = "打开外部链接", open = false, pages = _uA<Page__3>()), ListItem(id = "about", url = "about", name = "关于", open = false, pages = _uA<Page__3>())), "arrowUpIcon" to "/static/icons/arrow-up.png", "arrowDownIcon" to "/static/icons/arrow-down.png", "arrowRightIcon" to "/static/icons/arrow-right.png", "hasLeftWin" to computed<Boolean>(fun(): Boolean {
            return !state.noMatchLeftWindow
        }
        ), "leftWinActive" to computed<String>(fun(): String {
            return state.leftWinActive.split("/")[3]
        }
        ), "isDarkMode" to computed<Boolean>(fun(): Boolean {
            return state.isDarkMode
        }
        ), "netless" to computed<Boolean>(fun(): Boolean {
            return state.netless
        }
        ))
    }
    open var triggerCollapse = ::gen_triggerCollapse_fn
    open fun gen_triggerCollapse_fn(index: Number, item: ListItem) {
        if (item.pages.length == 0) {
            val page = Page__3(name = item.name, enable = item.enable, url = item.url!!)
            this.goDetailPage(page)
            return
        }
        run {
            var i: Number = 0
            while(i < this.list.length){
                if (index == i) {
                    this.list[i].open = !this.list[i].open
                } else {
                    this.list[i].open = false
                }
                ++i
            }
        }
    }
    open var goDetailPage = ::gen_goDetailPage_fn
    open fun gen_goDetailPage_fn(e: Page__3) {
        if (e.enable == false) {
            uni_showToast(ShowToastOptions(icon = "none", title = "暂不支持"))
            return
        }
        val url = if (e.url.indexOf("platform") > -1) {
            e.url
        } else {
            "/pages/template/" + e.url + "/" + e.url
        }
        if (this.hasLeftWin) {
            uni_reLaunch(ReLaunchOptions(url = url))
        } else {
            uni_navigateTo(NavigateToOptions(url = url))
        }
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
                return _uM("uni-panel-h" to _pS(_uM("paddingTop" to 12, "paddingRight" to 18, "paddingBottom" to 12, "paddingLeft" to 18)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
