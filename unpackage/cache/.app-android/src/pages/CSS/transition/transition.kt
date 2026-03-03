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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById
open class GenPagesCSSTransitionTransition : BasePage {
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
            this.widthOrHeight = uni_getElementById("widthOrHeight")
            this.widthProgress = uni_getElementById("widthProgress")
            this.widthOrHeightStyle = uni_getElementById("widthOrHeightStyle")
            this.styleMargin = uni_getElementById("styleMargin")
            this.stylePadding = uni_getElementById("stylePadding")
            this.styleBackground = uni_getElementById("styleBackground")
            this.styleBackground2 = uni_getElementById("styleBackground2")
            this.styleOpacity = uni_getElementById("styleOpacity")
            this.styleTransform = uni_getElementById("styleTransform")
            this.styleBorder = uni_getElementById("styleBorder")
            this.stylePosition = uni_getElementById("stylePosition")
            this.propertyStyleBackground = uni_getElementById("propertyStyleBackground")
            this.styleTransformWithOrigin = uni_getElementById("styleTransformWithOrigin")
            this.styleTransformWithWidth = uni_getElementById("styleTransformWithWidth")
            this.styleTransformTranslate = uni_getElementById("transformTranslate")
            this.styleTransformTranslateScale = uni_getElementById("styleTransformTranslateScale")
            this.styleTransitionAll = uni_getElementById("styleTransitionAll")
            this.widthOrHeightAuto = uni_getElementById("widthOrHeightAuto")
            this.changeWidthInEnd = uni_getElementById("changeWidthInEnd")
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改宽度"),
                _cE("view", _uM("class" to "base-style transition-width", "id" to "widthOrHeight", "onClick" to _ctx.changeWidthOrHeight), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改宽度(递增)"),
                _cE("view", _uM("class" to "width-progress transition-width", "id" to "widthProgress", "onClick" to _ctx.changeWidthProgress), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改宽度(通过style设置transition)"),
                _cE("view", _uM("class" to "base-style", "style" to _nS(_uM("transition-property" to "width", "transition-duration" to "1s")), "id" to "widthOrHeightStyle", "onClick" to _ctx.changeWidthOrHeightStyle), null, 12, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Margin"),
                _cE("view", _uM("class" to "base-style transition-margin", "id" to "styleMargin", "onClick" to _ctx.changeMargin), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Padding"),
                _cE("view", _uM("class" to "base-style transition-padding", "id" to "stylePadding", "onClick" to _ctx.changePadding), _uA(
                    _cE("view", _uM("style" to _nS(_uM("background-color" to "black", "height" to "50px", "width" to "50px"))), null, 4)
                ), 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改background-color和opacity"),
                _cE("view", _uM("class" to "base-style transition-background", "id" to "styleBackground", "onClick" to _ctx.changeBackground), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改background-color（rgba）"),
                _cE("view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
                    _cE("view", _uM("class" to "base-style transition-background", "id" to "styleBackground2", "onClick" to _ctx.changeBackground2), null, 8, _uA(
                        "onClick"
                    ))
                ), 4)
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改opacity渐隐渐现"),
                _cE("view", _uM("class" to "base-style transition-opacity", "id" to "styleOpacity", "onClick" to _ctx.changeStyleOpacity), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "动态修改background-color和duration"),
                _cE("view", _uM("class" to "base-style", "id" to "propertyStyleBackground", "onClick" to _ctx.propertyChangeBackground), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Transform"),
                _cE("view", _uM("class" to "base-style transition-transform", "id" to "styleTransform", "onClick" to _ctx.changeTransform), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改TransformTranslate"),
                _cE("view", _uM("class" to "base-style transition-transform", "id" to "transformTranslate", "onClick" to _ctx.changeTransformTranslate), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Transform和宽"),
                _cE("view", _uM("class" to "base-style transition-transform-width", "id" to "styleTransformWithWidth", "onClick" to _ctx.changeTransformWithWidth), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container", "onClick" to _ctx.changeTransformWithOrigin), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Transform（含transform-origin）"),
                _cE("view", _uM("class" to "base-style transition-transform", "style" to _nS(_uM("transform-origin" to "0 0")), "id" to "styleTransformWithOrigin"), null, 4)
            ), 8, _uA(
                "onClick"
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Border"),
                _cE("view", _uM("class" to "base-style transition-border", "id" to "styleBorder", "onClick" to _ctx.changeBorder), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Position"),
                _cE("view", _uM("class" to "base-style transition-position", "id" to "stylePosition", "onClick" to _ctx.changestylePosition), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改Scale "),
                _cE("view", _uM("class" to "base-style transition-transform", "id" to "styleChangScale", "onClick" to _ctx.changestyleScale), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "仅指定transition-duration背影有动画为正常"),
                _cE("view", _uM("style" to _nS(_uA(
                    _uM("width" to "100%", "height" to "50px"),
                    _ctx.changestyleTransitionDuration
                )), "onClick" to _ctx.doChangeTransitionDuration), null, 12, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "transition-property: all/none 演示"),
                _cE("view", _uM("class" to "base-style transition-all", "id" to "styleTransitionAll", "onClick" to _ctx.changeTransitionAll), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "在组件内滑动测试是否闪动"),
                _cE("view", _uM("class" to "base-style transition-transform", "id" to "styleTransformTranslateScale", "onTouchmove" to _ctx.handleTouchMove, "onTouchstart" to _ctx.handleTouchStart, "onTouchend" to _ctx.handleTouchEnd), " 这是一段文字 ", 40, _uA(
                    "onTouchmove",
                    "onTouchstart",
                    "onTouchend"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "测试在style中同时修改transform和width"),
                _cE("view", _uM("style" to _nS(_uM("width" to "100%", "height" to "100%"))), _uA(
                    _cE("view", _uM("class" to "base-style transition-transform-width", "id" to "styleTransformTranslateScale", "style" to _nS(_uM("transform" to ("translateX(" + _ctx.lineLeft + "px)"), "width" to ("" + _ctx.lineWidth + "px"))), "onClick" to _ctx.changeTransform61), null, 12, _uA(
                        "onClick"
                    ))
                ), 4)
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("text", _uM("class" to "text"), "点击修改宽度(值为auto有无动画交替出现)"),
                _cE("view", _uM("class" to "base-style transition-width", "id" to "widthOrHeightAuto", "onClick" to _ctx.changeWidthOrHeightAuto), null, 8, _uA(
                    "onClick"
                ))
            )),
            _cE("view", _uM("class" to "container"), _uA(
                _cE("view", _uM("class" to "text"), "重复修改width"),
                _cE("view", _uM("class" to "base-style transition-width", "id" to "changeWidthInEnd", "style" to _nS(_uM("transition-duration" to "0.5s")), "onTransitionend" to _ctx.onChangeWidthEnd, "onClick" to _ctx.changeWidthInEndFun), null, 44, _uA(
                    "onTransitionend",
                    "onClick"
                ))
            ))
        ), 4)
    }
    open var isTranstionWidthOrHeight: Boolean by `$data`
    open var isTranstionWidthAuto: Boolean by `$data`
    open var widthOrHeightAuto: UniElement? by `$data`
    open var widthOrHeight: UniElement? by `$data`
    open var widthProgress: UniElement? by `$data`
    open var isTranstionWidthOrHeightStyle: Boolean by `$data`
    open var widthOrHeightStyle: UniElement? by `$data`
    open var progressWidth: Number by `$data`
    open var isTranstionChangeMargin: Boolean by `$data`
    open var styleMargin: UniElement? by `$data`
    open var isTransitionStylePadding: Boolean by `$data`
    open var stylePadding: UniElement? by `$data`
    open var isTransitionstyleBackground: Boolean by `$data`
    open var isTransitionstyleBackground2: Boolean by `$data`
    open var isTransitionstyleOpacity: Boolean by `$data`
    open var styleBackground: UniElement? by `$data`
    open var styleBackground2: UniElement? by `$data`
    open var styleOpacity: UniElement? by `$data`
    open var isTransitionStyleTransform: Boolean by `$data`
    open var styleTransform: UniElement? by `$data`
    open var isTransitionStyleTransformWithWidth: Boolean by `$data`
    open var styleTransformWithWidth: UniElement? by `$data`
    open var isTransitionstyleBorder: Boolean by `$data`
    open var styleBorder: UniElement? by `$data`
    open var isTransitionstylePosition: Boolean by `$data`
    open var stylePosition: UniElement? by `$data`
    open var isSetTransition: Boolean by `$data`
    open var isTransitionpropertystyleBackground: Boolean by `$data`
    open var propertyStyleBackground: UniElement? by `$data`
    open var isTransitionStyleTransformWithOrigin: Boolean by `$data`
    open var styleTransformWithOrigin: UniElement? by `$data`
    open var styleTransformTranslate: UniElement? by `$data`
    open var isTransformTranslate: Boolean by `$data`
    open var styleTransformTranslateScale: UniElement? by `$data`
    open var startX: Number by `$data`
    open var moveX: Number by `$data`
    open var oldX: Number by `$data`
    open var changestyleTransitionDuration: String by `$data`
    open var styleTransitionAll: UniElement? by `$data`
    open var isTransitionAll: Boolean by `$data`
    open var lineLeft: Number by `$data`
    open var lineWidth: Number by `$data`
    open var changeWidthInEnd: UniElement? by `$data`
    open var changeWidthInEndCount: Number by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("isTranstionWidthOrHeight" to false, "isTranstionWidthAuto" to false, "widthOrHeightAuto" to null as UniElement?, "widthOrHeight" to null as UniElement?, "widthProgress" to null as UniElement?, "isTranstionWidthOrHeightStyle" to false, "widthOrHeightStyle" to null as UniElement?, "progressWidth" to 200, "isTranstionChangeMargin" to false, "styleMargin" to null as UniElement?, "isTransitionStylePadding" to false, "stylePadding" to null as UniElement?, "isTransitionstyleBackground" to false, "isTransitionstyleBackground2" to false, "isTransitionstyleOpacity" to false, "styleBackground" to null as UniElement?, "styleBackground2" to null as UniElement?, "styleOpacity" to null as UniElement?, "isTransitionStyleTransform" to false, "styleTransform" to null as UniElement?, "isTransitionStyleTransformWithWidth" to false, "styleTransformWithWidth" to null as UniElement?, "isTransitionstyleBorder" to false, "styleBorder" to null as UniElement?, "isTransitionstylePosition" to false, "stylePosition" to null as UniElement?, "isSetTransition" to false, "isTransitionpropertystyleBackground" to false, "propertyStyleBackground" to null as UniElement?, "isTransitionStyleTransformWithOrigin" to false, "styleTransformWithOrigin" to null as UniElement?, "styleTransformTranslate" to null as UniElement?, "isTransformTranslate" to false, "styleTransformTranslateScale" to null as UniElement?, "startX" to 0, "moveX" to 0, "oldX" to 0, "changestyleTransitionDuration" to "background-color:brown;", "styleTransitionAll" to null as UniElement?, "isTransitionAll" to false, "lineLeft" to 0, "lineWidth" to 200, "changeWidthInEnd" to null as UniElement?, "changeWidthInEndCount" to 0)
    }
    open var changeWidthOrHeight = ::gen_changeWidthOrHeight_fn
    open fun gen_changeWidthOrHeight_fn() {
        this.widthOrHeight?.style?.setProperty("width", if (this.isTranstionWidthOrHeight) {
            "200px"
        } else {
            "300px"
        }
        )
        this.isTranstionWidthOrHeight = !this.isTranstionWidthOrHeight
    }
    open var changeWidthOrHeightAuto = ::gen_changeWidthOrHeightAuto_fn
    open fun gen_changeWidthOrHeightAuto_fn() {
        this.widthOrHeightAuto?.style?.setProperty("width", if (this.isTranstionWidthAuto) {
            "200px"
        } else {
            "auto"
        }
        )
        this.isTranstionWidthAuto = !this.isTranstionWidthAuto
    }
    open var changeWidthProgress = ::gen_changeWidthProgress_fn
    open fun gen_changeWidthProgress_fn() {
        this.progressWidth += 20
        this.widthProgress?.style?.setProperty("width", this.progressWidth + "px")
    }
    open var changeWidthOrHeightStyle = ::gen_changeWidthOrHeightStyle_fn
    open fun gen_changeWidthOrHeightStyle_fn() {
        this.widthOrHeightStyle?.style?.setProperty("width", if (this.isTranstionWidthOrHeightStyle) {
            "200px"
        } else {
            "300px"
        }
        )
        this.isTranstionWidthOrHeightStyle = !this.isTranstionWidthOrHeightStyle
    }
    open var changeMargin = ::gen_changeMargin_fn
    open fun gen_changeMargin_fn() {
        this.styleMargin?.style?.setProperty("margin-top", if (this.isTranstionChangeMargin) {
            "0px"
        } else {
            "50px"
        }
        )
        this.styleMargin?.style?.setProperty("margin-left", if (this.isTranstionChangeMargin) {
            "0px"
        } else {
            "50px"
        }
        )
        this.isTranstionChangeMargin = !this.isTranstionChangeMargin
    }
    open var changePadding = ::gen_changePadding_fn
    open fun gen_changePadding_fn() {
        this.stylePadding?.style?.setProperty("padding-top", if (this.isTransitionStylePadding) {
            "0px"
        } else {
            "50px"
        }
        )
        this.stylePadding?.style?.setProperty("padding-left", if (this.isTransitionStylePadding) {
            "0px"
        } else {
            "50px"
        }
        )
        this.isTransitionStylePadding = !this.isTransitionStylePadding
    }
    open var changeBackground = ::gen_changeBackground_fn
    open fun gen_changeBackground_fn() {
        this.styleBackground?.style?.setProperty("background-color", if (this.isTransitionstyleBackground) {
            "brown"
        } else {
            "black"
        }
        )
        this.styleBackground?.style?.setProperty("opacity", if (this.isTransitionstyleBackground) {
            "1"
        } else {
            "0.5"
        }
        )
        this.isTransitionstyleBackground = !this.isTransitionstyleBackground
    }
    open var changeBackground2 = ::gen_changeBackground2_fn
    open fun gen_changeBackground2_fn() {
        this.styleBackground2?.style?.setProperty("background-color", if (this.isTransitionstyleBackground2) {
            "brown"
        } else {
            "rgba(0, 0, 0, 0.5)"
        }
        )
        this.isTransitionstyleBackground2 = !this.isTransitionstyleBackground2
    }
    open var changeStyleOpacity = ::gen_changeStyleOpacity_fn
    open fun gen_changeStyleOpacity_fn() {
        this.styleOpacity?.style?.setProperty("opacity", if (this.isTransitionstyleOpacity) {
            "1"
        } else {
            "0"
        }
        )
        this.isTransitionstyleOpacity = !this.isTransitionstyleOpacity
    }
    open var propertyChangeBackground = ::gen_propertyChangeBackground_fn
    open fun gen_propertyChangeBackground_fn() {
        if (!this.isSetTransition) {
            this.propertyStyleBackground?.style?.setProperty("transition-property", "background-color")
            this.propertyStyleBackground?.style?.setProperty("transition-duration", "1000ms")
            this.isSetTransition = true
        }
        this.propertyStyleBackground?.style?.setProperty("background-color", if (this.isTransitionpropertystyleBackground) {
            "brown"
        } else {
            "black"
        }
        )
        this.isTransitionpropertystyleBackground = !this.isTransitionpropertystyleBackground
    }
    open var changeTransform = ::gen_changeTransform_fn
    open fun gen_changeTransform_fn() {
        this.styleTransform?.style?.setProperty("transform", if (this.isTransitionStyleTransform) {
            "rotate(0deg)"
        } else {
            "rotate(135deg)"
        }
        )
        this.isTransitionStyleTransform = !this.isTransitionStyleTransform
    }
    open var changeTransformTranslate = ::gen_changeTransformTranslate_fn
    open fun gen_changeTransformTranslate_fn() {
        val translate = if (this.isTransformTranslate) {
            "translate(0%,0%)"
        } else {
            "translate(100%,0%)"
        }
        this.styleTransformTranslate?.style?.setProperty("transform", translate)
        this.isTransformTranslate = !this.isTransformTranslate
    }
    open var changeTransformWithWidth = ::gen_changeTransformWithWidth_fn
    open fun gen_changeTransformWithWidth_fn() {
        this.styleTransformWithWidth?.style?.setProperty("transform", if (this.isTransitionStyleTransformWithWidth) {
            "rotate(0deg)"
        } else {
            "rotate(135deg)"
        }
        )
        this.styleTransformWithWidth?.style?.setProperty("width", if (this.isTransitionStyleTransformWithWidth) {
            "200px"
        } else {
            "100px"
        }
        )
        this.isTransitionStyleTransformWithWidth = !this.isTransitionStyleTransformWithWidth
    }
    open var changeTransformWithOrigin = ::gen_changeTransformWithOrigin_fn
    open fun gen_changeTransformWithOrigin_fn() {
        this.styleTransformWithOrigin?.style?.setProperty("transform", if (this.isTransitionStyleTransformWithOrigin) {
            "scaleX(1)"
        } else {
            "scaleX(0)"
        }
        )
        this.isTransitionStyleTransformWithOrigin = !this.isTransitionStyleTransformWithOrigin
    }
    open var changeBorder = ::gen_changeBorder_fn
    open fun gen_changeBorder_fn() {
        this.styleBorder?.style?.setProperty("border-color", if (this.isTransitionstyleBorder) {
            "brown"
        } else {
            "yellow"
        }
        )
        this.isTransitionstyleBorder = !this.isTransitionstyleBorder
    }
    open var changestylePosition = ::gen_changestylePosition_fn
    open fun gen_changestylePosition_fn() {
        this.stylePosition?.style?.setProperty("left", if (this.isTransitionstylePosition) {
            "0px"
        } else {
            "100px"
        }
        )
        this.isTransitionstylePosition = !this.isTransitionstylePosition
    }
    open var changestyleScale = ::gen_changestyleScale_fn
    open fun gen_changestyleScale_fn() {
        var el = uni_getElementById("styleChangScale")
        el?.style?.setProperty("transition-duration", "0ms")
        el?.style?.setProperty("transform", "translate(10px,10px) scale(1)")
        setTimeout(fun(){
            el?.style?.setProperty("transition-duration", "200ms")
            el?.style?.setProperty("transform", "translate(10px,10px) scale(0.5)")
        }
        , 200)
    }
    open var handleTouchStart = ::gen_handleTouchStart_fn
    open fun gen_handleTouchStart_fn(e: UniTouchEvent) {
        this.startX = e.changedTouches[0].clientX
    }
    open var handleTouchMove = ::gen_handleTouchMove_fn
    open fun gen_handleTouchMove_fn(e: UniTouchEvent) {
        console.log("touchmove:" + e.touches[0].clientX + "," + e.touches[0].clientY, " at pages/CSS/transition/transition.uvue:339")
        e.preventDefault()
        e.stopPropagation()
        val difX = e.changedTouches[0].clientX
        this.moveX = difX - this.startX + this.oldX
        this.styleTransformTranslateScale?.style?.setProperty("transition-duration", "0ms")
        this.styleTransformTranslateScale?.style?.setProperty("transform", "translate(" + this.moveX + "px,0px) scale(0.5) rotate(90deg)")
    }
    open var handleTouchEnd = ::gen_handleTouchEnd_fn
    open fun gen_handleTouchEnd_fn(_0: UniTouchEvent) {
        this.oldX = this.moveX
    }
    open var doChangeTransitionDuration = ::gen_doChangeTransitionDuration_fn
    open fun gen_doChangeTransitionDuration_fn() {
        console.log("doChangeTransitionDuration", " at pages/CSS/transition/transition.uvue:351")
        this.changestyleTransitionDuration = if (this.changestyleTransitionDuration === "background-color:brown;") {
            "transition-duration: 2000ms;background-color: blue;"
        } else {
            "background-color:brown;"
        }
    }
    open var changeTransitionAll = ::gen_changeTransitionAll_fn
    open fun gen_changeTransitionAll_fn() {
        if (!this.isTransitionAll) {
            this.styleTransitionAll?.style?.setProperty("transition-property", "all")
            this.styleTransitionAll?.style?.setProperty("width", "300px")
            this.styleTransitionAll?.style?.setProperty("height", "300px")
            this.styleTransitionAll?.style?.setProperty("background-color", "blue")
            this.styleTransitionAll?.style?.setProperty("transform", "rotate(45deg)")
        } else {
            this.styleTransitionAll?.style?.setProperty("transition-property", "none")
            this.styleTransitionAll?.style?.setProperty("width", "200px")
            this.styleTransitionAll?.style?.setProperty("height", "200px")
            this.styleTransitionAll?.style?.setProperty("background-color", "brown")
            this.styleTransitionAll?.style?.setProperty("transform", "rotate(0deg)")
        }
        this.isTransitionAll = !this.isTransitionAll
    }
    open var changeTransform61 = ::gen_changeTransform61_fn
    open fun gen_changeTransform61_fn() {
        if (this.lineLeft == 0) {
            this.lineLeft = 70
            this.lineWidth = 300
        } else {
            this.lineLeft = 0
            this.lineWidth = 200
        }
    }
    open var onChangeWidthEnd = ::gen_onChangeWidthEnd_fn
    open fun gen_onChangeWidthEnd_fn(event: UniEvent) {
        this.changeWidthInEnd?.style?.setProperty("width", "300px")
        this.changeWidthInEndCount++
    }
    open var changeWidthInEndFun = ::gen_changeWidthInEndFun_fn
    open fun gen_changeWidthInEndFun_fn() {
        this.changeWidthInEnd?.style?.setProperty("width", "300px")
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
                return _uM("container" to _pS(_uM("marginTop" to 7, "marginRight" to 7, "marginBottom" to 7, "marginLeft" to 7, "backgroundColor" to "#FFFFFF")), "text" to _pS(_uM("marginTop" to 10, "marginBottom" to 16)), "base-style" to _pS(_uM("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "width-progress" to _pS(_uM("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "transform-bgColor" to _pS(_uM("transitionProperty" to "backgroundColor", "transitionDuration" to "0.5s")), "transition-width" to _pS(_uM("transitionProperty" to "width", "transitionDuration" to "1s")), "transition-margin" to _pS(_uM("transitionProperty" to "marginLeft,marginTop", "transitionDuration" to "1s")), "transition-padding" to _pS(_uM("transitionProperty" to "paddingLeft,paddingTop", "transitionDuration" to "1s")), "transition-background" to _pS(_uM("transitionProperty" to "backgroundColor,opacity", "transitionDuration" to "1s")), "transition-opacity" to _pS(_uM("transitionProperty" to "opacity", "transitionDuration" to "1s")), "transition-transform" to _pS(_uM("transform" to "translate(0%, 0%) scaleX(1) rotate(0deg)", "transitionProperty" to "transform", "transitionDuration" to "1s")), "transition-border" to _pS(_uM("borderTopWidth" to 5, "borderRightWidth" to 5, "borderBottomWidth" to 5, "borderLeftWidth" to 5, "borderTopColor" to "#A52A2A", "borderRightColor" to "#A52A2A", "borderBottomColor" to "#A52A2A", "borderLeftColor" to "#A52A2A", "borderTopStyle" to "solid", "borderRightStyle" to "solid", "borderBottomStyle" to "solid", "borderLeftStyle" to "solid", "transitionProperty" to "borderColor", "transitionDuration" to "1s")), "transition-position" to _pS(_uM("left" to 0, "transitionProperty" to "left", "transitionDuration" to "1s")), "transition-transform-width" to _pS(_uM("transform" to "rotate(0deg)", "transitionProperty" to "transform,width", "transitionDuration" to "1s")), "transition-all" to _pS(_uM("transitionProperty" to "all", "transitionDuration" to "1s")), "@TRANSITION" to _uM("transform-bgColor" to _uM("property" to "backgroundColor", "duration" to "0.5s"), "transition-width" to _uM("property" to "width", "duration" to "1s"), "transition-margin" to _uM("property" to "marginLeft,marginTop", "duration" to "1s"), "transition-padding" to _uM("property" to "paddingLeft,paddingTop", "duration" to "1s"), "transition-background" to _uM("property" to "backgroundColor,opacity", "duration" to "1s"), "transition-opacity" to _uM("property" to "opacity", "duration" to "1s"), "transition-transform" to _uM("property" to "transform", "duration" to "1s"), "transition-border" to _uM("property" to "borderColor", "duration" to "1s"), "transition-position" to _uM("property" to "left", "duration" to "1s"), "transition-transform-width" to _uM("property" to "transform,width", "duration" to "1s"), "transition-all" to _uM("property" to "all", "duration" to "1s")))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
