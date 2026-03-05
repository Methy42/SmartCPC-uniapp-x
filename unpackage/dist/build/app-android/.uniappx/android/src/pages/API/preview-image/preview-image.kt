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
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage
import io.dcloud.uniapp.framework.onShow
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIPreviewImagePreviewImage : BasePage {
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
        val _component_radio = resolveComponent("radio")
        val _component_radio_group = resolveComponent("radio-group")
        val _component_checkbox = resolveComponent("checkbox")
        val _component_checkbox_group = resolveComponent("checkbox-group")
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("style" to _nS(_uM("padding-left" to "8px", "padding-right" to "8px"))), _uA(
                _cE("view", null, _uA(
                    _cE("text", _uM("class" to "text-desc"), "图片指示器样式"),
                    _cV(_component_radio_group, _uM("class" to "cell-ct", "style" to _nS(_uM("background-color" to "white")), "onChange" to _ctx.onIndicatorChanged), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.indicator, fun(item, index, __index, _cached): Any {
                                return _cE("view", _uM("class" to "indicator-it", "key" to item.value), _uA(
                                    _cV(_component_radio, _uM("disabled" to _ctx.isWeb, "checked" to (index == 0), "value" to item.value), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return _uA(
                                            _tD(item.name)
                                        )
                                    }
                                    ), "_" to 2), 1032, _uA(
                                        "disabled",
                                        "checked",
                                        "value"
                                    ))
                                ))
                            }
                            ), 128)
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "style",
                        "onChange"
                    ))
                )),
                _cE("view", null, _uA(
                    _cV(_component_checkbox_group, _uM("onChange" to _ctx.onCheckboxChange, "style" to _nS(_uM("margin-top" to "16px", "margin-bottom" to "16px", "margin-left" to "8px"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cV(_component_checkbox, _uM("disabled" to _ctx.isWeb, "checked" to _ctx.isLoop, "style" to _nS(_uM("margin-right" to "15px"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    "循环播放"
                                )
                            }
                            ), "_" to 1), 8, _uA(
                                "disabled",
                                "checked",
                                "style"
                            ))
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange",
                        "style"
                    ))
                )),
                _cE("view", null, _uA(
                    _cV(_component_checkbox_group, _uM("onChange" to _ctx.onLongPressCheckboxChange, "style" to _nS(_uM("margin-top" to "16px", "margin-bottom" to "16px", "margin-left" to "8px"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return _uA(
                            _cV(_component_checkbox, _uM("disabled" to _ctx.isWeb, "checked" to _ctx.isLongPress, "style" to _nS(_uM("margin-right" to "15px"))), _uM("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return _uA(
                                    "支持长按事件"
                                )
                            }
                            ), "_" to 1), 8, _uA(
                                "disabled",
                                "checked",
                                "style"
                            ))
                        )
                    }
                    ), "_" to 1), 8, _uA(
                        "onChange",
                        "style"
                    ))
                )),
                _cE("view", _uM("style" to _nS(_uM("background-color" to "white"))), _uA(
                    _cE("text", _uM("class" to "text-desc"), "点击图片开始预览"),
                    _cE("view", _uM("class" to "cell-ct", "style" to _nS(_uM("margin" to "8px"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.imageList, fun(image, index, __index, _cached): Any {
                            return _cE("view", _uM("class" to "cell cell-choose-image", "key" to index), _uA(
                                if (isTrue(image.error)) {
                                    _cE("text", _uM("key" to 0, "style" to _nS(_uM("width" to "100px", "height" to "100px", "background-color" to "lightgray", "color" to "red", "text-align" to "center", "line-height" to "100px", "font-size" to "14px")), "onClick" to fun(){
                                        _ctx.previewImage(index)
                                    }), "图片路径非法", 12, _uA(
                                        "onClick"
                                    ))
                                } else {
                                    _cC("v-if", true)
                                }
                                ,
                                if (isTrue(!image.error)) {
                                    _cE("image", _uM("key" to 1, "style" to _nS(_uM("width" to "100px", "height" to "100px", "background-color" to "white")), "mode" to "aspectFit", "src" to image.src, "onClick" to fun(){
                                        _ctx.previewImage(index)
                                    }, "onError" to fun(`$event`: Any){
                                        _ctx.onImageLoadError(index, `$event` as ImageErrorEvent)
                                    }), null, 44, _uA(
                                        "src",
                                        "onClick",
                                        "onError"
                                    ))
                                } else {
                                    _cC("v-if", true)
                                }
                            ))
                        }
                        ), 128),
                        _cE("image", _uM("class" to "cell cell-choose-image", "src" to "/static/plus.png", "onClick" to _ctx.chooseImage), _uA(
                            _cE("view")
                        ), 8, _uA(
                            "onClick"
                        ))
                    ), 4)
                ), 4),
                _cE("view", _uM("style" to _nS(_uM("margin" to "8px"))), _uA(
                    _cE("text", _uM("style" to _nS(_uM("color" to "black", "font-size" to "18px", "margin-bottom" to "4px"))), "注意事项:", 4),
                    _cE("text", _uM("style" to _nS(_uM("font-size" to "17px", "margin-left" to "4px", "color" to "darkgray"))), "1、indicator属性仅App平台支持。", 4),
                    _cE("text", _uM("style" to _nS(_uM("font-size" to "17px", "margin-left" to "4px", "color" to "darkgray"))), "2、Web平台不支持loop属性。", 4)
                ), 4)
            ), 4)
        ), 4)
    }
    open var imageList: UTSArray<ImageType> by `$data`
    open var indicator: UTSArray<ItemType__8> by `$data`
    open var currentIndicator: Indicator by `$data`
    open var isWeb: Boolean by `$data`
    open var isIOS: Boolean by `$data`
    open var isLongPress: Boolean by `$data`
    open var isLoop: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("imageList" to _uA<ImageType>(ImageType(src = "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png", error = false), ImageType(src = "/static/uni.png", error = false), ImageType(src = "/static/test-image/logo.svg", error = false), ImageType(src = "/static/uni2.png", error = false)), "indicator" to _uA<ItemType__8>(ItemType__8(value = "default", name = "圆点"), ItemType__8(value = "number", name = "数字"), ItemType__8(value = "none", name = "不显示")), "currentIndicator" to "default" as Indicator, "isWeb" to false, "isIOS" to false, "isLongPress" to true, "isLoop" to true)
    }
    open var previewImage = ::gen_previewImage_fn
    open fun gen_previewImage_fn(index: Number) {
        var list = _uA<String>()
        this.imageList.forEach(fun(item: ImageType){
            list.push(item.src)
        }
        )
        uni_previewImage(PreviewImageOptions(urls = list, current = index, indicator = this.currentIndicator, loop = this.isLoop, longPressActions = if (this.isLongPress) {
            (LongPressActionsOptions(itemList = _uA(
                "按钮1",
                "按钮2",
                "按钮3"
            ), itemColor = "#ccc", success = fun(e: LongPressActionsSuccessResult){
                uni_showToast(ShowToastOptions(title = "用户选中了第" + (e.index + 1) + "张图片，并选中了第" + (e.tapIndex + 1) + "个选项", position = "bottom"))
            }, fail = fun(e: LongPressActionsFailResult){
                uni_showToast(ShowToastOptions(title = "用户关闭了action sheet", position = "bottom"))
            }))
        } else {
            null
        }
        ))
    }
    open var chooseImage = ::gen_chooseImage_fn
    open fun gen_chooseImage_fn() {
        uni_chooseImage(ChooseImageOptions(sourceType = _uA(
            "album"
        ), count = 1, success = fun(e){
            this.imageList = this.imageList.concat(ImageType(src = e.tempFilePaths[0], error = false))
        }
        , fail = fun(_) {}))
    }
    open var onIndicatorChanged = ::gen_onIndicatorChanged_fn
    open fun gen_onIndicatorChanged_fn(e: UniRadioGroupChangeEvent) {
        this.currentIndicator = e.detail.value as Indicator
    }
    open var onCheckboxChange = ::gen_onCheckboxChange_fn
    open fun gen_onCheckboxChange_fn(_0: UniCheckboxGroupChangeEvent) {
        this.isLoop = !this.isLoop
    }
    open var onLongPressCheckboxChange = ::gen_onLongPressCheckboxChange_fn
    open fun gen_onLongPressCheckboxChange_fn() {
        this.isLongPress = !this.isLongPress
    }
    open var onImageLoadError = ::gen_onImageLoadError_fn
    open fun gen_onImageLoadError_fn(index: Number, error: UniImageErrorEvent) {
        this.imageList[index].error = true
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
                return _uM("text-desc" to _pS(_uM("marginTop" to 16, "marginLeft" to 8, "marginBottom" to 16, "fontWeight" to "bold")), "cell-ct" to _pS(_uM("display" to "flex", "flexWrap" to "wrap", "flexDirection" to "row")), "cell" to _pS(_uM("marginLeft" to 3, "marginRight" to 3, "width" to 100, "height" to 100)), "cell-choose-image" to _pS(_uM("borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#D3D3D3", "borderRightColor" to "#D3D3D3", "borderBottomColor" to "#D3D3D3", "borderLeftColor" to "#D3D3D3")), "indicator-it" to _pS(_uM("marginTop" to 8, "marginRight" to 8, "marginBottom" to 8, "marginLeft" to 8)), "cell-pd" to _pS(_uM("paddingTop" to 11, "paddingRight" to 0, "paddingBottom" to 11, "paddingLeft" to 0)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
