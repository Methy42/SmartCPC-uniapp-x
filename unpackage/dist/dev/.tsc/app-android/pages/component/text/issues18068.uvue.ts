
	const __sfc__ = defineComponent({
		data() {
			return {
				text1Height : 0,
				text2Height : 0
			}
		},
		onReady() {
			const testText1Ele = uni.getElementById("testText1") as UniElement
			const testText2Ele = uni.getElementById("testText2") as UniElement
			setTimeout(() => {
        this.text1Height = testText1Ele.getBoundingClientRect().height;
        this.text2Height = testText2Ele.getBoundingClientRect().height;
			}, 1000)
		},
		methods: {

		}
	})

export default __sfc__
function GenPagesComponentTextIssues18068Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cE("text", _uM({
      id: "testText1",
      style: _nS(_uM({"font-size":"20px","line-height":"2","lines":"2"}))
    }), [
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"20px","line-height":"2","background-color":"red"}))
      }), "测试text设置lineHeight", 4 /* STYLE */)
    ], 4 /* STYLE */),
    _cE("text", _uM({
      id: "testText2",
      style: _nS(_uM({"font-size":"20px","line-height":"2","lines":"2"}))
    }), [
      _cE("text", _uM({
        style: _nS(_uM({"font-size":"20px","line-height":"2","background-color":"red"}))
      }), "测试text嵌套多行文字设置lineHeight测试text嵌套多行文字设置", 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesComponentTextIssues18068Styles = []
