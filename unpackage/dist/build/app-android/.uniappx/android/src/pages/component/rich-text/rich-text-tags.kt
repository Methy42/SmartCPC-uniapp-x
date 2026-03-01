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
import io.dcloud.uniapp.extapi.showModal as uni_showModal
open class GenPagesComponentRichTextRichTextTags : BasePage {
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
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass)
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cV(_component_page_head, _uM("title" to "rich-text-tags")),
            _cV(_component_enum_data, _uM("title" to "设置mode（仅Android平台支持，默认值为web）", "items" to _ctx.modeItemTypes, "onChange" to _ctx.onModeChange), null, 8, _uA(
                "items",
                "onChange"
            )),
            _cE("view", _uM("class" to "uni-padding-wrap uni-common-mt"), _uA(
                _cE("view", _uM("class" to "uni-title"), _uA(
                    _cE("text", _uM("class" to "uni-title-text"), "支持的HTML标签")
                )),
                _cE(Fragment, null, RenderHelpers.renderList(_ctx.data, fun(item, index, __index, _cached): Any {
                    return _cE("view", _uM("class" to "uni-common-mt", "key" to index), _uA(
                        _cE("text", _uM("class" to "uni-subtitle-text"), _tD(item.name), 1),
                        _cE("view", _uM("style" to _nS(_uM("background" to "#FFFFFF"))), _uA(
                            _cE("rich-text", _uM("nodes" to item.html, "onItemclick" to _ctx.itemClick, "mode" to _ctx.mode), null, 40, _uA(
                                "nodes",
                                "onItemclick",
                                "mode"
                            ))
                        ), 4)
                    ))
                }
                ), 128)
            ))
        ), 4)
    }
    open var data: UTSArray<TagInfo> by `$data`
    open var mode: String by `$data`
    open var modeItems: UTSArray<String> by `$data`
    open var modeItemTypes: UTSArray<ItemType> by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("data" to _uA<TagInfo>(TagInfo(name = "<br/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "br"
        }, object : UTSJSONObject() {
            var type = "text"
            var text = "hello uni-app x"
        }, object : UTSJSONObject() {
            var name = "br"
        }, object : UTSJSONObject() {
            var type = "text"
            var text = "hello uni-app x"
        })), TagInfo(name = "<p/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "p"
            var attrs = object : UTSJSONObject() {
                var style = "text-align: center; text-decoration: line-through;"
            }
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        }, object : UTSJSONObject() {
            var name = "p"
            var attrs = object : UTSJSONObject() {
                var style = "background-color: green; color: red;"
            }
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<ul/> <li/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "ul"
            var children = _uA(
                object : UTSJSONObject() {
                    var name = "li"
                    var attrs = object : UTSJSONObject() {
                        var style = "text-decoration: line-through; text-align: center;"
                    }
                    var children = _uA(
                        object : UTSJSONObject() {
                            var type = "text"
                            var text = "hello uni-app x"
                        }
                    )
                },
                object : UTSJSONObject() {
                    var name = "li"
                    var attrs = object : UTSJSONObject() {
                        var style = "color: red; background-color: green; text-align: center;"
                    }
                    var children = _uA(
                        object : UTSJSONObject() {
                            var type = "text"
                            var text = "hello uni-app x"
                        }
                    )
                }
            )
        })), TagInfo(name = "<span/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "span"
            var attrs = object : UTSJSONObject() {
                var style = "color: red; background-color: green; text-decoration: line-through;"
            }
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<strong/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "strong"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<i/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "i"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<big/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "big"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<small/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "small"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<a/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "a"
            var attrs = object : UTSJSONObject() {
                var href = "https://www.baidu.com"
            }
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "百度"
                }
            )
        })), TagInfo(name = "<u/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "u"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<del/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "del"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "<h1/> <h2/> <h3/> <h4/> <h5/> <h6/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "h1"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        }, object : UTSJSONObject() {
            var name = "h2"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        }, object : UTSJSONObject() {
            var name = "h3"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        }, object : UTSJSONObject() {
            var name = "h4"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        }, object : UTSJSONObject() {
            var name = "h5"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        }, object : UTSJSONObject() {
            var name = "h6"
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "hello uni-app x"
                }
            )
        })), TagInfo(name = "带 # 内容", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "span"
            var attrs = object : UTSJSONObject() {
                var style = "color: #42b983;"
            }
            var children = _uA(
                object : UTSJSONObject() {
                    var type = "text"
                    var text = "span 标签 style 中使用 16 进制颜色 # 正常显示"
                }
            )
        })), TagInfo(name = "<img/>", html = _uA<UTSJSONObject>(object : UTSJSONObject() {
            var name = "img"
            var attrs = object : UTSJSONObject() {
                var src = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png"
                var width = "100"
                var height = "100"
            }
        }))), "mode" to "web", "modeItems" to _uA(
            "web",
            "native"
        ), "modeItemTypes" to _uA<ItemType>(ItemType(value = 0, name = "web"), ItemType(value = 1, name = "native")))
    }
    open var itemClick = ::gen_itemClick_fn
    open fun gen_itemClick_fn(e: UniRichTextItemClickEvent) {
        console.log(JSON.stringify(e.detail))
        var clicktext = ""
        if (e.detail.src != null) {
            clicktext = "点击了图片，src = " + e.detail.src!!
        } else if (e.detail.href != null) {
            clicktext = "点击了链接，href = " + e.detail.href!!
        }
        uni_showModal(ShowModalOptions(content = clicktext, showCancel = false))
    }
    open var onModeChange = ::gen_onModeChange_fn
    open fun gen_onModeChange_fn(value: Number) {
        this.mode = this.modeItems[value]
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
