
  const __sfc__ = defineComponent({
    data() {
      return {
        level: 0,
        isCharging: false
      }
    },
    onLoad() {
      try {
        uni.getBatteryInfo({
          success: res => {
            this.level = res.level;
            this.isCharging = res.isCharging;
          }
        });
      } catch (e) {
        console.error((e as Error).message, " at pages/API/get-battery-info/get-battery-info.uvue:25");
        uni.showModal({
          content: (e as Error).message,
          showCancel: false
        });
      }
    }
  })

export default __sfc__
function GenPagesAPIGetBatteryInfoGetBatteryInfoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", null, [
    _cE("text", null, "当前电量：" + _tD(_ctx.level) + "%", 1 /* TEXT */),
    _cE("text", null, "是否充电中：" + _tD(_ctx.isCharging), 1 /* TEXT */)
  ])
}
const GenPagesAPIGetBatteryInfoGetBatteryInfoStyles = []
