
  type StatInfo = {
    path : string;
    size : string;
  };
  const __sfc__ = defineComponent({
    data() {
      return {
        result: '',
        error: '',
        list: [] as Array<StatInfo>,
        recursive: false,
        cachePath: uni.env.CACHE_PATH as string,
        sandboxPath: uni.env.SANDBOX_PATH as string,




        androidInternalSandboxPath: uni.env.ANDROID_INTERNAL_SANDBOX_PATH as string,

      }
    },
    methods: {
      switchRecursive() {
        this.recursive = !this.recursive
      },
      getDirInfo(dirPath:string) {
        const fm = uni.getFileSystemManager()
        this.list = [];
        fm.stat({
          path: dirPath,
          recursive: this.recursive,
          success: (res: StatSuccessResult) => {
            this.result = `获取 "${dirPath}" 成功(success)`
            console.log(this.result)
            res.stats.forEach((item)=>{
              this.list.push({
                path: item.path,
                size: `${item.stats.size} Bytes`
              })
            })
          },
          fail: (err) => {
            this.result = `获取 "${dirPath}" 失败(fail)`
            console.log(this.result)
            this.error = JSON.stringify(err)
            console.log(this.error)
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIEnvEnvRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)

  return _cE(Fragment, null, [
    _cE("view", _uM({
      style: _nS(_uM({"margin":"12px"}))
    }), [
      _cV(_component_page_head, _uM({ title: "环境变量 - 文件系统" })),
      _cE("button", _uM({
        class: "button",
        type: "primary",
        onClick: () => {_ctx.getDirInfo(uni.env.USER_DATA_PATH)}
      }), "USER_DATA_PATH", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "button",
        type: "primary",
        onClick: () => {_ctx.getDirInfo(_ctx.cachePath)}
      }), "CACHE_PATH", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "button",
        type: "primary",
        onClick: () => {_ctx.getDirInfo(_ctx.sandboxPath)}
      }), "SANDBOX_PATH", 8 /* PROPS */, ["onClick"]),
      _cE("button", _uM({
        class: "button",
        type: "primary",
        onClick: () => {_ctx.getDirInfo(_ctx.androidInternalSandboxPath)}
      }), "ANDROID_INTERNAL_SANDBOX_PATH", 8 /* PROPS */, ["onClick"]),
      _cV(_component_boolean_data, _uM({
        defaultValue: false,
        title: "是否递归获取",
        onChange: _ctx.switchRecursive
      }), null, 8 /* PROPS */, ["onChange"])
    ], 4 /* STYLE */),
    _cE("scroll-view", _uM({
      style: _nS(_uM({"flex":"1","padding":"16px 0px"}))
    }), [
      _cE("text", _uM({ class: "result" }), _tD(_ctx.result), 1 /* TEXT */),
      _cE("text", _uM({ class: "error" }), _tD(_ctx.error), 1 /* TEXT */),
      _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, (stat, index, __index, _cached): any => {
        return _cE("view", _uM({
          class: "stat",
          key: index
        }), [
          _cE("text", _uM({ class: "path" }), _tD(stat.path), 1 /* TEXT */),
          _cE("text", _uM({ class: "size" }), _tD(stat.size), 1 /* TEXT */)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIEnvEnvStyles = [_uM([["button", _pS(_uM([["marginBottom", 4], ["whiteSpace", "nowrap"], ["textOverflow", "ellipsis"]]))], ["result", _pS(_uM([["fontSize", 18], ["fontWeight", "bold"], ["textAlign", "center"], ["width", "100%"]]))], ["error", _pS(_uM([["color", "#B22222"]]))], ["stat", _pS(_uM([["paddingTop", 8], ["paddingRight", 16], ["paddingBottom", 8], ["paddingLeft", 16]]))], ["path", _pS(_uM([["color", "#A9A9A9"]]))], ["size", _pS(_uM([["color", "#A9A9A9"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
