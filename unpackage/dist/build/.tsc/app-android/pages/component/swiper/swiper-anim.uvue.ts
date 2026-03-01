


	export type ListType={
		id:number,
		content:string
	}


	const __sfc__ = defineComponent({
		data() {
			return {
				list:[
					{id:1,content:"第一个"},
					{id:2,content:"第二个"},
				] as ListType[]
			}
		},

		computed:{
			current():number{
				return 1
			}
		},
    methods: {
      //自动化测试例专用
      jest_getWindowInfo() : GetWindowInfoResult {
        return uni.getWindowInfo();
      }
    }
	})

export default __sfc__
function GenPagesComponentSwiperSwiperAnimRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", null, [
    _cE("text", null, "computed属性在设置duration=0的测试:"),
    _cE("swiper", _uM({
      current: _ctx.current,
      vertical: true,
      duration: "0",
      style: _nS(_uM({"height":"100px","width":"100%"}))
    }), [
      _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
        return _cE("swiper-item", _uM({
          key: item.id
        }), [
          _cE("view", null, " 当前实际渲染的值:" + _tD(index) + ",指定current的值：" + _tD(_ctx.current), 1 /* TEXT */)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ], 12 /* STYLE, PROPS */, ["current"]),
    _cE("text", null, "同时设置autoplay / circular / duration的测试:"),
    _cE("swiper", _uM({
      id: "swiper-view",
      autoplay: true,
      interval: 3000,
      circular: true,
      duration: 3000,
      current: 0,
      style: _nS(_uM({"height":"100px","width":"100%"}))
    }), [
      _cE("swiper-item", null, [
        _cE("text", null, "0000000000000000000")
      ]),
      _cE("swiper-item", null, [
        _cE("text", null, "111111111111111111")
      ])
    ], 4 /* STYLE */)
  ])
}
const GenPagesComponentSwiperSwiperAnimStyles = []
