
  const __sfc__ = defineComponent({
    onUnload() {
      this.destory();
    },
    data() {
      return {
        created_boolean: false,
        workerStatus: 'none', // none, created, destroyed
        isListening: false,
        logs: [] as Array<UTSJSONObject>,
        inputValue: '1', // 默认值为1
        taskResult: '',
        worker: null as Worker | null
      }
    },
    computed: {
      statusText() : string {
        switch (this.workerStatus) {
          case 'none': return '未创建';
          case 'created': return '已创建';
          case 'destroyed': return '已销毁';
          default: return '未知';
        }
      }
    },
    methods: {
      // 添加日志方法
      addLog(message : string, type : string = 'info') {
        const now = new Date();
        const timeStr = `${now.getHours().toString().padStart(2, '0')}:${now.getMinutes().toString().padStart(2, '0')}:${now.getSeconds().toString().padStart(2, '0')}`;
        const logItem = {
          message: `[${timeStr}] ${message}`,
          type: type,
          time: timeStr
        } as UTSJSONObject;
        this.logs.unshift(logItem);
        // 限制日志数量
        if (this.logs.length > 50) {
          this.logs = this.logs.slice(0, 50);
        }
      },

      // 创建Worker
      create() {
        this.worker = uni.createWorker('workers/helloWorkerTask.uts');
        this.workerStatus = 'created';
        this.addLog('Worker创建成功', 'success');
        this.created_boolean = true;

      },
      onWorkerMsg() {
        if (this.worker == null) {
          this.addLog('请先创建worker', 'warning');
          return;
        }
        this.worker!.onMessage((result) => {
          // 处理Worker返回的消息
          console.log(`收到Worker消息:`, result);
          const res = result as UTSJSONObject;
          const resultData = res['data'] as string;
          this.taskResult = resultData;
          this.inputValue = this.taskResult
          this.addLog(`收到WorkerTask返回: ${resultData}`, 'receive');
        })
      },
      onWorkerError() {
        if (this.worker == null) {
          this.addLog('请先创建worker', 'warning');
          return;
        }
        this.worker!.onError((error) => {
          console.error('Worker发生错误:', error);
          // this.addLog(`Worker错误: ${error.message}`, 'error');
        })
      },

      // 向workerTask发送消息
      sendMessage() {
        // 检查输入值
        if (this.inputValue == '') {
          this.addLog('请输入有效的数字', 'warning');
          return;
        }
        const options = {
          data: this.inputValue,
          needReply: true
        };
        this.worker!.postMessage(options, null);
        this.addLog(`发送值到WorkerTask: ${this.inputValue}`, 'send');
      },

      // 销毁Worker
      destory() {
        if (this.worker == null) {
          this.addLog('没有创建worker,无法销毁', 'warning');
          return;
        }
        this.worker!.terminate();
        this.workerStatus = 'destroyed';
        this.isListening = false;
        this.addLog('Worker已销毁', 'warning');
        this.created_boolean = false;
      },

      // 清空日志
      clearLogs() {
        this.logs = [];
      },

      test_resetInputValue() {
        this.inputValue = '1'
      },
    }
  })

export default __sfc__
function GenPagesAPICreateWorkerCreateWorkerRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("scroll-view", _uM({ class: "container" }), [
    _cE("view", _uM({ class: "status-section" }), [
      _cE("text", _uM({ class: "status-label" }), "Worker状态: "),
      _cE("text", _uM({ class: "status-text" }), _tD(_ctx.statusText), 1 /* TEXT */)
    ]),
    _cE("view", _uM({ class: "button-group" }), [
      _cE("text", _uM({ class: "description-text" }), "操作步骤：1.创建Worker 2.添加消息监听 3.发送数据测试"),
      _cE("button", _uM({
        class: "btn",
        type: "primary",
        disabled: _ctx.created_boolean,
        onClick: _ctx.create
      }), "创建Worker", 8 /* PROPS */, ["disabled", "onClick"]),
      _cE("button", _uM({
        class: "btn",
        type: "primary",
        onClick: _ctx.onWorkerMsg
      }), "添加消息监听", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btn",
        type: "primary",
        onClick: _ctx.onWorkerError
      }), "添加错误监听", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "btn",
        onClick: _ctx.destory,
        disabled: _ctx.workerStatus != 'created'
      }), "销毁Worker", 8 /* PROPS */, ["onClick", "disabled"])
    ]),
    _cE("view", _uM({ class: "input-section" }), [
      _cE("text", _uM({ class: "section-title" }), "输入测试值:"),
      _cE("text", _uM({ class: "description-text" }), "点击发送按钮后，会将输入值传给WorkerTask，在子线程执行+1操作后返回结果"),
      _cE("input", _uM({
        class: "input-field",
        modelValue: _ctx.inputValue,
        onInput: ($event: UniInputEvent) => {(_ctx.inputValue) = $event.detail.value},
        type: "number",
        placeholder: "请输入数字"
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"]),
      _cE("button", _uM({
        class: "btn",
        type: "primary",
        onClick: _ctx.sendMessage,
        disabled: _ctx.workerStatus != 'created'
      }), "发送到WorkerTask (值+1)", 8 /* PROPS */, ["onClick", "disabled"])
    ]),
    _cE("view", _uM({ class: "log-section" }), [
      _cE("text", _uM({ class: "section-title" }), "通信日志:"),
      _cE("scroll-view", _uM({
        class: "log-container",
        "scroll-y": "true"
      }), [
        _cE(Fragment, null, RenderHelpers.renderList(_ctx.logs, (log, index, __index, _cached): any => {
          return _cE("view", _uM({
            key: index,
            class: "log-item"
          }), [
            _cE("text", _uM({
              class: _nC(['log-text', log.type])
            }), _tD(log.message), 3 /* TEXT, CLASS */)
          ])
        }), 128 /* KEYED_FRAGMENT */)
      ]),
      _cE("button", _uM({
        onClick: _ctx.clearLogs,
        class: "btn clear-btn"
      }), "清空日志", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPICreateWorkerCreateWorkerStyles = [_uM([["container", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["status-section", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["justifyContent", "center"], ["marginBottom", 20], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8]]))], ["status-label", _pS(_uM([["fontSize", 16], ["color", "#666666"]]))], ["status-text", _pS(_uM([["fontSize", 16], ["fontWeight", "bold"], ["marginLeft", 8]]))], ["button-group", _pS(_uM([["flexDirection", "column"], ["marginBottom", 10]]))], ["input-section", _pS(_uM([["marginBottom", 20], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8]]))], ["input-field", _pS(_uM([["width", "100%"], ["paddingTop", 12], ["paddingRight", 12], ["paddingBottom", 12], ["paddingLeft", 12], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#dddddd"], ["borderRightColor", "#dddddd"], ["borderBottomColor", "#dddddd"], ["borderLeftColor", "#dddddd"], ["borderTopLeftRadius", 6], ["borderTopRightRadius", 6], ["borderBottomRightRadius", 6], ["borderBottomLeftRadius", 6], ["fontSize", 16], ["marginTop", 10], ["marginRight", 0], ["marginBottom", 10], ["marginLeft", 0], ["backgroundColor", "#ffffff"]]))], ["btn", _pS(_uM([["marginBottom", 10], ["paddingTop", 5], ["paddingRight", 10], ["paddingBottom", 5], ["paddingLeft", 10], ["borderTopLeftRadius", 6], ["borderTopRightRadius", 6], ["borderBottomRightRadius", 6], ["borderBottomLeftRadius", 6], ["fontSize", 14], ["textAlign", "center"]]))], ["log-section", _pS(_uM([["backgroundColor", "#ffffff"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["section-title", _pS(_uM([["fontSize", 18], ["fontWeight", "bold"], ["color", "#333333"], ["marginBottom", 10]]))], ["log-container", _pS(_uM([["height", 300], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#dddddd"], ["borderRightColor", "#dddddd"], ["borderBottomColor", "#dddddd"], ["borderLeftColor", "#dddddd"], ["borderTopLeftRadius", 4], ["borderTopRightRadius", 4], ["borderBottomRightRadius", 4], ["borderBottomLeftRadius", 4], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["marginTop", 10], ["marginRight", 0], ["marginBottom", 10], ["marginLeft", 0], ["backgroundColor", "#fafafa"]]))], ["log-item", _pS(_uM([["marginBottom", 5]]))], ["log-text", _uM([["", _uM([["fontSize", 12], ["lineHeight", 1.4]])], [".info", _uM([["color", "#2196F3"]])], [".success", _uM([["color", "#4CAF50"]])], [".warning", _uM([["color", "#ff9800"]])], [".error", _uM([["color", "#f44336"]])], [".send", _uM([["color", "#9C27B0"]])], [".receive", _uM([["color", "#009688"]])]])], ["clear-btn", _pS(_uM([["backgroundColor", "#ff9800"], ["fontSize", 12], ["paddingTop", 8], ["paddingRight", 12], ["paddingBottom", 8], ["paddingLeft", 12], ["color", "#ffffff"], ["borderTopLeftRadius", 4], ["borderTopRightRadius", 4], ["borderBottomRightRadius", 4], ["borderBottomLeftRadius", 4], ["textAlign", "center"]]))], ["description-text", _pS(_uM([["fontSize", 14], ["color", "#666666"], ["lineHeight", 1.4], ["marginBottom", 10]]))]])]
