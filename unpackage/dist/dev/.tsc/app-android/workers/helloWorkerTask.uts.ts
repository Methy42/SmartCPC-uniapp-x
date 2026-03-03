export class HelloWorkerTask extends WorkerTaskImpl {
  //constructor
  constructor() {
    super();
    //初始化操作
    __f__('log','at workers/helloWorkerTask.uts:6',"[WorkerTask] HelloWorkerTask 构造器初始化");
  }

  //实现入口函数
  override entry() {
    //Worker启动时的入口函数
    __f__('log','at workers/helloWorkerTask.uts:12',"[WorkerTask] HelloWorkerTask 启动完成，等待主线程消息");
  }

  //接收主线程发送的消息
  override onMessage(message : any) {
    __f__('log','at workers/helloWorkerTask.uts:17','[WorkerTask] 收到主线程消息: ', message);

    // 处理消息对象
    const messageData = message as UTSJSONObject;
    const msgData = messageData['data'] as string;
    const needReply = messageData['needReply'] as boolean;

    __f__('log','at workers/helloWorkerTask.uts:24',`[WorkerTask] 数据: ${msgData}, 需要回复: ${needReply}`);

    // 根据是否需要回复来处理
    if (needReply) {
      this.sendReply(msgData);
    }
  }

  // 发送回复消息
  private sendReply(msgData : string) {
    const response = new UTSJSONObject();

    // 尝试将接收到的数据转换为数字并加1
    const inputNumber = parseInt(msgData);
    if (isNaN(inputNumber)) {
      response.data = `输入"${msgData}"不是有效数字`;
    } else {
      const result = inputNumber + 1;
      response.data = result.toString()
    }

    __f__('log','at workers/helloWorkerTask.uts:45','[WorkerTask] 发送回复消息:', response);
    this.postMessage(response);
  }
}
