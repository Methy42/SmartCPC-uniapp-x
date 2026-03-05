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
open class GenPagesTemplateCalendarCalendar : BasePage {
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
        onCreated(fun() {}, __ins)
        onResize(fun(_: OnResizeOptions) {
            this.init()
        }
        , __ins)
        onReady(fun() {
            this.init()
            val header = this.`$refs`["draw-header"] as UniElement
            this.testWidth = header.getBoundingClientRect().width
        }
        , __ins)
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this
        val _cache = this.`$`.renderCache
        return _cE("scroll-view", _uM("style" to _nS(_uM("flex" to "1"))), _uA(
            _cE("view", _uM("class" to "root"), _uA(
                _cE("view", _uM("class" to "date"), _uA(
                    _cE("text", _uM("class" to "date-text"), _tD(_ctx.current_month), 1)
                )),
                _cE("view", _uM("ref" to "draw-header", "class" to "calendar-header"), null, 512),
                _cE("view", _uM("ref" to "draw-weeks", "class" to "calendar-week", "onClick" to _ctx.select), null, 8, _uA(
                    "onClick"
                )),
                _cE("view", _uM("class" to "btn-group"), _uA(
                    _cE("button", _uM("size" to "mini", "onClick" to _ctx.preDate), "上个月", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("size" to "mini", "onClick" to _ctx.gotoToday), "回到今天", 8, _uA(
                        "onClick"
                    )),
                    _cE("button", _uM("size" to "mini", "onClick" to _ctx.nextDate), "下个月", 8, _uA(
                        "onClick"
                    ))
                )),
                _cE("view", null, _tD(_ctx.timeData.fullDate) + " " + _tD(_ctx.current_day), 1)
            ))
        ), 4)
    }
    open var weeks: UTSArray<UTSArray<DateType>> by `$data`
    open var `$coords`: UTSArray<CoordsType> by `$data`
    open var `$calendar`: Calendar by `$data`
    open var timeData: DateType by `$data`
    open var testWidth: Number by `$data`
    open var current_month: String by `$data`
    open var current_day: String by `$data`
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return _uM("weeks" to _uA<UTSArray<DateType>>(), "\$coords" to _uA<CoordsType>(), "\$calendar" to Calendar() as Calendar, "timeData" to DateType(fullDate = "", year = 0, month = 0, date = 0, day = 0, lunar = "", disabled = false, is_today = false), "testWidth" to 0, "current_month" to computed<String>(fun(): String {
            val nowDate = this.timeData
            val month = nowDate.month
            return if (month < 10) {
                "0" + month
            } else {
                month.toString(10)
            }
        }
        ), "current_day" to computed<String>(fun(): String {
            val time = this.timeData.data
            if (time == null) {
                return ""
            }
            return time.IMonthCn + time.IDayCn
        }
        ))
    }
    open var init = ::gen_init_fn
    open fun gen_init_fn() {
        val calendar = this.`$data`["\$calendar"] as Calendar
        val refs = this.`$refs`["draw-weeks"] as UniElement
        var ctx = refs.getDrawableContext()
        if (ctx != null) {
            ctx.reset()
        }
        var fulltime = this.timeData.fullDate
        if (fulltime == "") {
            this.timeData = calendar.getDateInfo()
            fulltime = this.timeData.fullDate
        }
        this.weeks = calendar.getWeeks(fulltime)
        this.drawHeader()
        this.drawWeek(this.weeks, fulltime)
    }
    open var select = ::gen_select_fn
    open fun gen_select_fn(event: UniPointerEvent) {
        val refs = this.`$refs`["draw-weeks"] as UniElement
        val rect = refs.getBoundingClientRect()
        val dom_x = rect.left
        val dom_y = rect.top
        val clientX = event.clientX
        val clientY = event.clientY
        val x = clientX - dom_x
        val y = clientY - dom_y
        this.clickGrid(x, y)
    }
    open var clickGrid = ::gen_clickGrid_fn
    open fun gen_clickGrid_fn(x: Number, y: Number) {
        val calendar = this.`$data`["\$calendar"] as Calendar
        val gridArray = this.`$data`["\$coords"] as UTSArray<CoordsType>
        run {
            var i: Number = 0
            while(i < gridArray.length){
                val grid = gridArray[i]
                val max_x = grid.x + grid.width
                val max_y = grid.y + grid.height
                val is_x_limit = grid.x < x && x < max_x
                val is_y_limit = grid.y < y && y < max_y
                val is_select = is_x_limit && is_y_limit
                if (is_select) {
                    val data = grid.data
                    this.timeData = calendar.getDateInfo(data.fullDate)
                    this.drawWeek(this.weeks, grid.data.fullDate)
                }
                i++
            }
        }
    }
    open var preDate = ::gen_preDate_fn
    open fun gen_preDate_fn() {
        val fulldate = this.timeData.fullDate
        val calendar = this.`$data`["\$calendar"] as Calendar
        var time = calendar.getDate(fulldate, -1, "month")
        val newDate = time.year + "-" + time.month + "-1"
        time = calendar.getDate(newDate)
        this.timeData = calendar.getDateInfo(time.fullDate)
        this.weeks = calendar.getWeeks(time.fullDate)
        if (this.isCurrentMonth(time.year, time.month)) {
            this.gotoToday()
        } else {
            this.drawWeek(this.weeks, time.fullDate)
        }
    }
    open var nextDate = ::gen_nextDate_fn
    open fun gen_nextDate_fn() {
        val fulldate = this.timeData.fullDate
        val calendar = this.`$data`["\$calendar"] as Calendar
        var time = calendar.getDate(fulldate, 1, "month")
        val newDate = time.year + "-" + time.month + "-1"
        time = calendar.getDate(newDate)
        this.timeData = calendar.getDateInfo(time.fullDate)
        this.weeks = calendar.getWeeks(time.fullDate)
        if (this.isCurrentMonth(time.year, time.month)) {
            this.gotoToday()
        } else {
            this.drawWeek(this.weeks, time.fullDate)
        }
    }
    open var gotoToday = ::gen_gotoToday_fn
    open fun gen_gotoToday_fn() {
        val calendar = this.`$data`["\$calendar"] as Calendar
        val time = calendar.getDate()
        this.timeData = calendar.getDateInfo(time.fullDate)
        this.weeks = calendar.getWeeks(time.fullDate)
        this.drawWeek(this.weeks, time.fullDate)
    }
    open var isCurrentMonth = ::gen_isCurrentMonth_fn
    open fun gen_isCurrentMonth_fn(year: Number, month: Number): Boolean {
        val today = Date()
        return year === today.getFullYear() && month === today.getMonth() + 1
    }
    open var drawHeader = ::gen_drawHeader_fn
    open fun gen_drawHeader_fn() {
        val refs = this.`$refs`["draw-header"] as UniElement
        var ctx = refs.getDrawableContext()
        if (ctx == null) {
            return
        }
        ctx.reset()
        val date_header_map = _uA(
            "一",
            "二",
            "三",
            "四",
            "五",
            "六",
            "日"
        )
        val width = refs.getBoundingClientRect().width
        val num = date_header_map.length
        val one_width = width / num
        ctx.font = "12"
        ctx.textAlign = "center"
        run {
            var i: Number = 0
            while(i < num){
                var box_left = i * one_width + 2
                var box_width = one_width - 4
                var box_height: Number = 26
                val text = date_header_map[i]
                var text_left = box_width / 2 + box_left
                var text_top = box_height / 2 + 6
                ctx.fillText(text, text_left, text_top)
                i++
            }
        }
        ctx.update()
    }
    open var drawWeek = ::gen_drawWeek_fn
    open fun gen_drawWeek_fn(weeks: UTSArray<UTSArray<DateType>>, time: String) {
        val start_time = Date.now()
        val refs = this.`$refs`["draw-weeks"] as UniElement
        var ctx = refs.getDrawableContext()
        if (ctx == null) {
            return
        }
        val dom = refs.getBoundingClientRect()
        val width = dom.width
        val height = dom.height
        var week_len = weeks.length
        val one_width = width / weeks[0].length
        val one_height = height / week_len
        if (time != "") {
            this.`$data`["\$coords"] = _uA<CoordsType>()
            ctx.reset()
        }
        ctx.textAlign = "center"
        run {
            var week: Number = 0
            while(week < week_len){
                val week_item = weeks[week]
                run {
                    var day: Number = 0
                    while(day < week_item.length){
                        val day_item = week_item[day]
                        var day_left = day * one_width + 2
                        var day_top = one_height * week + 2
                        var day_width = one_width - 4
                        var day_height = one_height - 4
                        var text = day_item.date.toString(10)
                        var text_left = day * one_width + (one_width / 2)
                        var text_top = one_height * week + 25
                        ctx.font = "16"
                        if (day_item.disabled) {
                            ctx.fillStyle = "#ccc"
                        } else {
                            if (day_item.is_today) {
                                ctx.fillStyle = "red"
                            } else if (time == day_item.fullDate) {
                                ctx.fillStyle = "blue"
                            } else {
                                ctx.fillStyle = "#666"
                            }
                            val coords = CoordsType(x = day_left, y = day_top, width = day_width, height = day_height, data = day_item)
                            var gridArr = this.`$data`["\$coords"] as UTSArray<CoordsType>
                            gridArr.push(coords)
                        }
                        ctx.fillText(text, text_left, text_top)
                        text = day_item.lunar
                        var lunar_left = day * one_width + (one_width / 2)
                        var lunar_top = one_height * week + 42
                        ctx.font = "10"
                        ctx.fillText(text, lunar_left, lunar_top)
                        day++
                    }
                }
                week++
            }
        }
        ctx.update()
        console.log("diff time", Date.now() - start_time, " at pages/template/calendar/calendar.uvue:310")
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
                return _uM("root" to _pS(_uM("position" to "relative", "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "backgroundColor" to "#ffffff")), "calendar-header" to _pS(_uM("height" to 30, "marginBottom" to 10)), "date" to _pS(_uM("marginBottom" to 10, "marginLeft" to 10)), "date-text" to _pS(_uM("fontSize" to 34, "fontWeight" to "bold")), "calendar-week" to _pS(_uM("height" to 350, "marginTop" to 2, "marginRight" to 0, "marginBottom" to 2, "marginLeft" to 0)), "btn-group" to _pS(_uM("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "marginTop" to 20, "marginRight" to 0, "marginBottom" to 20, "marginLeft" to 0)))
            }
        var inheritAttrs = true
        var inject: Map<String, Map<String, Any?>> = _uM()
        var emits: Map<String, Any?> = _uM()
        var props = _nP(_uM())
        var propsNeedCastKeys: UTSArray<String> = _uA()
        var components: Map<String, CreateVueComponent> = _uM()
    }
}
