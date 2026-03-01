
	const __sfc__ = defineComponent({
		data() {
			return {
				logList: [] as string[],
				title: 'sse',
				url: 'https://request.dcloud.net.cn/api/sse/connect',
				eventSource: null as UniEventSource | null,
				open: false,
				receiveMessage: false
			}
		},
		unmounted() {
			if (this.eventSource != null) {
				this.eventSource?.close()
			}
		},
		methods: {
			connect() {
				console.log('connect start')
				uni.showLoading({
					title: "",
					mask: true
				})
				this.eventSource?.close()
				let headers : UTSJSONObject = new UTSJSONObject()
				headers.set("header1", "value1")
				headers.set("header2", "value3")
				this.eventSource = uni.connectEventSource({
					url: this.url,
					header: headers
				})
				this.eventSource?.onMessage((ev) => {
					const log = 'onMessage callback:' + '\n' + 'type: ' + ev.type + '\n' + 'data: ' + ev.data + '\n\n'
					this.logList.push(log)
					this.receiveMessage = true
					uni.hideLoading()
				})
				this.eventSource?.onOpen((ev) => {
					const log = 'onOpen callback: ' + ev.type + '\n\n'
					this.logList.push(log)
					this.open = true
				})
				this.eventSource?.onError((err) => {
          const log = `onError callback: ${err} \n\n`
					this.logList.push(log)
					uni.hideLoading()
				})
			},
			close() {
				this.eventSource?.close()
				const log = 'connect close' + '\n\n'
				this.logList.push(log)
			}
		}
	})

export default __sfc__
function GenPagesAPIConnectEventSourceConnectEventSourceRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE(Fragment, null, [
    _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    _cE("button", _uM({
      class: "button",
      type: "primary",
      onClick: _ctx.connect
    }), "连接", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      class: "button",
      type: "primary",
      onClick: _ctx.close
    }), "关闭", 8 /* PROPS */, ["onClick"]),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1"}))
    }), [
      _cE("view", null, [
        _cE("text", _uM({
          style: _nS(_uM({"width":"100%","text-align":"center","margin-bottom":"5px"}))
        }), " 显示简易操作日志(可滚动查看) ", 4 /* STYLE */),
        _cE("button", _uM({
          size: "mini",
          onClick: () => {_ctx.logList = []}
        }), "清空日志", 8 /* PROPS */, ["onClick"]),
        _cE("view", _uM({
          style: _nS(_uM({"margin-top":"10px"}))
        }), [
          _cE(Fragment, null, RenderHelpers.renderList(_ctx.logList, (item, index, __index, _cached): any => {
            return _cE("view", _uM({ key: index }), [
              _cE("text", _uM({
                style: _nS(_uM({"margin-left":"20px","margin-right":"20px"}))
              }), _tD(item), 5 /* TEXT, STYLE */)
            ])
          }), 128 /* KEYED_FRAGMENT */)
        ], 4 /* STYLE */)
      ])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIConnectEventSourceConnectEventSourceStyles = [_uM([["button", _pS(_uM([["marginLeft", 30], ["marginRight", 30], ["marginBottom", 15]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
