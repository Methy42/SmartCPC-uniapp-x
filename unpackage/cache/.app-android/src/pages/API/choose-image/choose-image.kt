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
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage
import io.dcloud.uniapp.extapi.showActionSheet as uni_showActionSheet
import io.dcloud.uniapp.extapi.showToast as uni_showToast
open class GenPagesAPIChooseImageChooseImage : BasePage {
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
        onPageHide(fun() {
            console.log("Page Hide", " at pages/API/choose-image/choose-image.uvue:163")
        }
        , __ins)
        onUnload(fun() {
            this.imageList = _uA()
            this.sourceTypeIndex = 2
            this.sourceType = _uA(
                "拍照",
                "相册",
                "拍照或相册"
            )
            this.sizeTypeIndex = 2
            this.sizeType = _uA(
                "压缩",
                "原图",
                "压缩或原图"
            )
            this.orientationTypeIndex = 0
            this.orientationType = _uA(
                "竖屏",
                "横屏",
                "自动"
            )
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass)
        val _component_switch = resolveComponent("switch")
        return _cE("scroll-view", _uM("class" to "page-scroll-view"), _uA(
            _cV(_component_page_head, _uM("title" to _ctx.title), null, 8, _uA(
                "title"
            )),
            _cE("view", _uM("class" to "uni-common-mt"), _uA(
                _cE("view", _uM("class" to "uni-list"), _uA(
                    _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                        _cE("text", _uM("class" to "uni-list-cell-left uni-label"), " 图片来源 "),
                        _cE("view", _uM("class" to "uni-list-cell-right", "onClick" to _ctx.chooseImageSource), _uA(
                            _cE("text", _uM("class" to "click-t"), _tD(_ctx.sourceType[_ctx.sourceTypeIndex]), 1)
                        ), 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                        _cE("text", _uM("class" to "uni-list-cell-left uni-label"), " 图片质量 "),
                        _cE("view", _uM("class" to "uni-list-cell-right", "onClick" to _ctx.chooseImageType), _uA(
                            _cE("text", _uM("class" to "click-t"), _tD(_ctx.sizeType[_ctx.sizeTypeIndex]), 1)
                        ), 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                        _cE("text", _uM("class" to "uni-list-cell-left uni-label"), " 数量限制 "),
                        _cE("view", _uM("class" to "uni-list-cell-right"), _uA(
                            _cE("input", _uM("class" to "click-t", "value" to _ctx.count, "type" to "number", "maxlength" to 1, "onBlur" to _ctx.chooseImageCount), null, 40, _uA(
                                "value",
                                "onBlur"
                            ))
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                        _cE("text", _uM("class" to "uni-list-cell-left uni-label"), " 屏幕方向 "),
                        _cE("view", _uM("class" to "uni-list-cell-right", "onClick" to _ctx.chooseOrientationType), _uA(
                            _cE("text", _uM("class" to "click-t"), _tD(_ctx.orientationType[_ctx.orientationTypeIndex]), 1)
                        ), 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                        _cE("text", _uM("class" to "uni-list-cell-left uni-label"), " 相册模式 "),
                        _cE("view", _uM("class" to "uni-list-cell-right", "onClick" to _ctx.albumModeChange), _uA(
                            _cE("text", _uM("class" to "click-t"), _tD(_ctx.albumModeType[_ctx.albumModeTypeIndex]), 1)
                        ), 8, _uA(
                            "onClick"
                        ))
                    )),
                    _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                        _cE("text", _uM("class" to "uni-list-cell-left uni-label"), " 图像裁剪 "),
                        _cE("view", _uM("class" to "uni-list-cell-right"), _uA(
                            _cV(_component_switch, _uM("checked" to _ctx.isCrop, "onChange" to _ctx.switchCrop), null, 8, _uA(
                                "checked",
                                "onChange"
                            ))
                        ))
                    )),
                    _cE("view", _uM("ref" to "cropOptionNode", "class" to "crop-option", "style" to _nS(_uM("height" to if (_ctx.isCrop) {
                        "200px"
                    } else {
                        "0px"
                    }
                    , "margin-bottom" to if (_ctx.isCrop) {
                        "11px"
                    } else {
                        "0px"
                    }
                    ))), _uA(
                        _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                            _cE("view", _uM("class" to "uni-list-cell-left item_width"), " 图片质量(%) "),
                            _cE("view", _uM("class" to "uni-list-cell-right"), _uA(
                                _cE("input", _uM("value" to _ctx.cropPercent, "onConfirm" to _ctx.cropPercentConfim, "type" to "number", "maxlength" to "-1"), null, 40, _uA(
                                    "value",
                                    "onConfirm"
                                ))
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                            _cE("view", _uM("class" to "uni-list-cell-left item_width"), " 裁剪宽度(px) "),
                            _cE("view", _uM("class" to "uni-list-cell-right"), _uA(
                                _cE("input", _uM("value" to _ctx.cropWidth, "onConfirm" to _ctx.cropWidthConfim, "type" to "number", "maxlength" to "-1"), null, 40, _uA(
                                    "value",
                                    "onConfirm"
                                ))
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                            _cE("view", _uM("class" to "uni-list-cell-left item_width"), " 裁剪高度(px) "),
                            _cE("view", _uM("class" to "uni-list-cell-right"), _uA(
                                _cE("input", _uM("value" to _ctx.cropHeight, "onConfirm" to _ctx.cropHeightConfim, "type" to "number", "maxlength" to "-1"), null, 40, _uA(
                                    "value",
                                    "onConfirm"
                                ))
                            ))
                        )),
                        _cE("view", _uM("class" to "uni-list-cell cell-pd"), _uA(
                            _cE("view", _uM("class" to "uni-list-cell-left item_width"), " 保留原宽高 "),
                            _cE("view", _uM("class" to "uni-list-cell-right"), _uA(
                                _cV(_component_switch, _uM("checked" to _ctx.cropResize, "onChange" to _ctx.cropResizeChange), null, 8, _uA(
                                    "checked",
                                    "onChange"
                                ))
                            ))
                        ))
                    ), 4)
                )),
                _cE("view", _uM("class" to "uni-list list-pd", "style" to _nS(_uM("padding" to "15px"))), _uA(
                    _cE("view", _uM("class" to "uni-flex", "style" to _nS(_uM("margin-bottom" to "10px"))), _uA(
                        _cE("view", _uM("class" to "uni-list-cell-left"), "点击可预览选好的图片"),
                        _cE("view", _uM("style" to _nS(_uM("margin-left" to "auto"))), _uA(
                            _cE("text", _uM("class" to "click-t"), _tD(_ctx.imageList.length) + "/" + _tD(_ctx.count), 1)
                        ), 4)
                    ), 4),
                    _cE("view", _uM("class" to "uni-flex", "style" to _nS(_uM("flex-wrap" to "wrap"))), _uA(
                        _cE(Fragment, null, RenderHelpers.renderList(_ctx.imageList, fun(image, index, __index, _cached): Any {
                            return _cE("view", _uM("key" to index, "class" to "uni-uploader__input-box", "style" to _nS(_uM("border" to "0"))), _uA(
                                _cE("image", _uM("style" to _nS(_uM("width" to "104px", "height" to "104px")), "src" to image, "data-src" to image, "onClick" to fun(){
                                    _ctx.previewImage(index)
                                }
                                ), null, 12, _uA(
                                    "src",
                                    "data-src",
                                    "onClick"
                                )),
                                _cE("image", _uM("src" to "/static/plus.png", "class" to "image-remove", "onClick" to fun(){
                                    _ctx.removeImage(index)
                                }
                                ), null, 8, _uA(
                                    "onClick"
                                ))
                            ), 4)
                        }
                        ), 128),
                        _cE("image", _uM("class" to "uni-uploader__input-box", "onClick" to _ctx.chooseImage, "src" to "/static/plus.png"), null, 8, _uA(
                            "onClick"
                        ))
                    ), 4)
                ), 4)
            ))
        ))
    }
    open var title: String by `$data`
    open var imageList: UTSArray<String> by `$data`
    open var sourceTypeIndex: Number by `$data`
    open var sourceType: UTSArray<String> by `$data`
    open var sizeTypeIndex: Number by `$data`
    open var sizeType: UTSArray<String> by `$data`
    open var orientationTypeIndex: Number by `$data`
    open var orientationType: UTSArray<String> by `$data`
    open var albumModeTypeIndex: Number by `$data`
    open var albumModeType: UTSArray<String> by `$data`
    open var count: Number by `$data`
    open var isCrop: Boolean by `$data`
    open var cropPercent: Number by `$data`
    open var cropWidth: Number by `$data`
    open var cropHeight: Number by `$data`
    open var cropResize: Boolean by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("title" to "chooseImage", "imageList" to _uA<String>(), "sourceTypeIndex" to 2, "sourceType" to _uA(
            "拍照",
            "相册",
            "拍照或相册"
        ), "sizeTypeIndex" to 2, "sizeType" to _uA(
            "压缩",
            "原图",
            "压缩或原图"
        ), "orientationTypeIndex" to 0, "orientationType" to _uA(
            "竖屏",
            "横屏",
            "自动"
        ), "albumModeTypeIndex" to 0, "albumModeType" to _uA(
            "自定义相册",
            "系统相册"
        ), "count" to 9, "isCrop" to false, "cropPercent" to 80, "cropWidth" to 100, "cropHeight" to 100, "cropResize" to false)
    }
    open var cropHeightConfim = ::gen_cropHeightConfim_fn
    open fun gen_cropHeightConfim_fn(e: InputConfirmEvent) {
        var value = parseInt(e.detail.value)
        if (value > 0) {
            this.cropHeight = value
        } else {
            uni_showToast(ShowToastOptions(position = "bottom", title = "裁剪高度需要大于0"))
        }
    }
    open var cropWidthConfim = ::gen_cropWidthConfim_fn
    open fun gen_cropWidthConfim_fn(e: InputConfirmEvent) {
        var value = parseInt(e.detail.value)
        if (value > 0) {
            this.cropWidth = value
        } else {
            uni_showToast(ShowToastOptions(position = "bottom", title = "裁剪宽度需要大于0"))
        }
    }
    open var cropPercentConfim = ::gen_cropPercentConfim_fn
    open fun gen_cropPercentConfim_fn(e: InputConfirmEvent) {
        var value = parseInt(e.detail.value)
        if (value > 0 && value <= 100) {
            this.cropPercent = value
        } else {
            uni_showToast(ShowToastOptions(position = "bottom", title = "请输入0~100之间的值"))
        }
    }
    open var albumModeChange = ::gen_albumModeChange_fn
    open fun gen_albumModeChange_fn() {
        uni_showActionSheet(ShowActionSheetOptions(itemList = this.albumModeType, success = fun(e){
            this.albumModeTypeIndex = e.tapIndex
        }
        ))
    }
    open var cropResizeChange = ::gen_cropResizeChange_fn
    open fun gen_cropResizeChange_fn(e: UniSwitchChangeEvent) {
        this.cropResize = e.detail.value
    }
    open var switchCrop = ::gen_switchCrop_fn
    open fun gen_switchCrop_fn(e: UniSwitchChangeEvent) {
        this.isCrop = e.detail.value
    }
    open var removeImage = ::gen_removeImage_fn
    open fun gen_removeImage_fn(index: Number) {
        this.imageList.splice(index, 1)
    }
    open var chooseImageSource = ::gen_chooseImageSource_fn
    open fun gen_chooseImageSource_fn() {
        uni_showActionSheet(ShowActionSheetOptions(itemList = _uA(
            "拍照",
            "相册",
            "拍照或相册"
        ), success = fun(e){
            this.sourceTypeIndex = e.tapIndex
        }
        ))
    }
    open var chooseImageType = ::gen_chooseImageType_fn
    open fun gen_chooseImageType_fn() {
        uni_showActionSheet(ShowActionSheetOptions(itemList = _uA(
            "压缩",
            "原图",
            "压缩或原图"
        ), success = fun(e){
            this.sizeTypeIndex = e.tapIndex
        }
        ))
    }
    open var chooseOrientationType = ::gen_chooseOrientationType_fn
    open fun gen_chooseOrientationType_fn() {
        uni_showActionSheet(ShowActionSheetOptions(itemList = _uA(
            "竖屏",
            "横屏",
            "自动"
        ), success = fun(e){
            this.orientationTypeIndex = e.tapIndex
        }
        ))
    }
    open var chooseImageCount = ::gen_chooseImageCount_fn
    open fun gen_chooseImageCount_fn(event: InputBlurEvent) {
        var count = parseInt(event.detail.value)
        if (count < 0) {
            uni_showToast(ShowToastOptions(position = "bottom", title = "图片数量应该大于0"))
            return
        }
        this.count = count
    }
    open var chooseImage = ::gen_chooseImage_fn
    open fun gen_chooseImage_fn() {
        if (this.imageList.length >= this.count) {
            uni_showToast(ShowToastOptions(position = "bottom", title = "已经有 " + this.count + " 张图片了，请删除部分图片之后重新选择"))
            return
        }
        uni_chooseImage(ChooseImageOptions(sourceType = sourceTypeArray[this.sourceTypeIndex], sizeType = sizeTypeArray[this.sizeTypeIndex], crop = if (this.isCrop) {
            ChooseImageCropOptions(quality = this.cropPercent, width = this.cropWidth, height = this.cropHeight, resize = this.cropResize)
        } else {
            null
        }
        , count = this.count - this.imageList.length, pageOrientation = orientationTypeArray[this.orientationTypeIndex], albumMode = albumModeTypeArray[this.albumModeTypeIndex], success = fun(res){
            this.imageList = this.imageList.concat(res.tempFilePaths)
            console.log("this.imageList: ", this.imageList, " at pages/API/choose-image/choose-image.uvue:281")
        }
        , fail = fun(err){
            console.log("err: ", JSON.stringify(err), " at pages/API/choose-image/choose-image.uvue:284")
            uni_showToast(ShowToastOptions(title = "choose image error.code:" + err.errCode + ";message:" + err.errMsg, position = "bottom"))
        }
        ))
    }
    open var previewImage = ::gen_previewImage_fn
    open fun gen_previewImage_fn(index: Number) {
        uni_previewImage(PreviewImageOptions(current = index, urls = this.imageList))
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
                return _uM("cell-pd" to _pS(_uM("paddingTop" to 11, "paddingRight" to 15, "paddingBottom" to 11, "paddingLeft" to 15)), "click-t" to _pS(_uM("color" to "#A9A9A9")), "list-pd" to _pS(_uM("marginTop" to 25)), "uni-uploader__input-box" to _pS(_uM("marginTop" to 5, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 5, "width" to 104, "height" to 104, "borderTopWidth" to 1, "borderRightWidth" to 1, "borderBottomWidth" to 1, "borderLeftWidth" to 1, "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "borderTopColor" to "#D9D9D9", "borderRightColor" to "#D9D9D9", "borderBottomColor" to "#D9D9D9", "borderLeftColor" to "#D9D9D9")), "uni-uploader__input" to _pS(_uM("position" to "absolute", "zIndex" to 1, "top" to 0, "left" to 0, "width" to "100%", "height" to "100%", "opacity" to 0)), "image-remove" to _pS(_uM("transform" to "rotate(45deg)", "width" to 25, "height" to 25, "position" to "absolute", "top" to 0, "right" to 0, "borderTopLeftRadius" to 13, "borderTopRightRadius" to 13, "borderBottomRightRadius" to 13, "borderBottomLeftRadius" to 13, "backgroundColor" to "rgba(200,200,200,0.8)")), "item_width" to _pS(_uM("width" to 130)), "crop-option" to _pS(_uM("marginLeft" to 11, "marginRight" to 11, "borderTopLeftRadius" to 11, "borderTopRightRadius" to 11, "borderBottomRightRadius" to 11, "borderBottomLeftRadius" to 11, "backgroundColor" to "#eeeeee", "transitionProperty" to "height,marginBottom", "transitionDuration" to "200ms")), "@TRANSITION" to _uM("crop-option" to _uM("property" to "height,marginBottom", "duration" to "200ms")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
