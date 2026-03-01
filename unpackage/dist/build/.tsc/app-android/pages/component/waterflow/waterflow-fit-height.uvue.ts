
const __sfc__ = defineComponent({
  __name: 'waterflow-fit-height',
  setup(__props, __setupCtx: SetupContext) {
const __expose = __setupCtx.expose
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const list = ref<UTSJSONObject[]>([] as UTSJSONObject[])
  const isShow = ref<boolean>(true)

  const itemClick = (title : string | null) => {
    if (title != null) {
      uni.showToast({
        title: title,
        icon: 'none'
      })
    }
  }

  function getList() {
    uni.showLoading({
      title: 'loading...'
    })

    uni.request<UTSJSONObject[]>({
      url: 'https://unidemo.dcloud.net.cn/api/news?column=title,author_name,cover,published_at',
      method: "GET",
      success: (res : RequestSuccess<UTSJSONObject[]>) => {
        if (res.statusCode == 200) {
          const result = res.data

          if (result != null) {
            list.value.push(...result)
          }
        }
      },
      complete: () => {
        uni.hideLoading()
      }
    });
  }

  function changeShow() {
    isShow.value = false
  }

  function verify() {
    return true
  }

  onLoad((_: OnLoadOptions) => {
    getList()
  })

  __expose({
    changeShow,
    verify
  })


return (): any | null => {

  return _cE("view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    isTrue(unref(isShow))
      ? _cE("waterflow", _uM({
          key: 0,
          style: _nS(_uM({"flex":"1"})),
          "cross-axis-gap": "5",
          "main-axis-gap": "5"
        }), [
          _cE(Fragment, null, RenderHelpers.renderList(unref(list), (item, index, __index, _cached): any => {
            return _cE("flow-item", _uM({
              key: index,
              onClick: () => {itemClick(item['author_name'] as string | null)}
            }), [
              _cE("view", _uM({ class: "item" }), [
                _cE("image", _uM({
                  class: "img",
                  "fade-show": true,
                  src: item['cover'],
                  mode: "widthFix"
                }), null, 8 /* PROPS */, ["src"]),
                _cE("text", _uM({ class: "name" }), _tD(item['author_name']), 1 /* TEXT */),
                _cE("text", _uM({ class: "title" }), _tD(item['title']), 1 /* TEXT */),
                _cE("text", _uM({ class: "time" }), _tD(item['published_at']), 1 /* TEXT */)
              ])
            ], 8 /* PROPS */, ["onClick"])
          }), 128 /* KEYED_FRAGMENT */),
          _cE("flow-item", _uM({
            slot: "refresher",
            id: "refresher",
            type: "2"
          }), [
            _cE("text", null, "自定义加载")
          ]),
          _cE("flow-item", _uM({
            slot: "load-more",
            id: "loadmore",
            type: "6",
            class: "load-more-box"
          }), [
            _cE("text", null, "加载更多")
          ])
        ], 4 /* STYLE */)
      : _cC("v-if", true)
  ], 4 /* STYLE */)
}
}

})
export default __sfc__
const GenPagesComponentWaterflowWaterflowFitHeightStyles = [_uM([["item", _pS(_uM([["width", "100%"], ["borderTopLeftRadius", 8], ["borderTopRightRadius", 8], ["borderBottomRightRadius", 8], ["borderBottomLeftRadius", 8], ["backgroundColor", "#FFFFFF"]]))], ["img", _uM([[".item ", _uM([["width", "100%"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5]])]])], ["name", _uM([[".item ", _uM([["fontSize", 18], ["fontWeight", "bold"], ["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10]])]])], ["title", _uM([[".item ", _uM([["fontSize", 14], ["marginTop", 0], ["marginRight", 10], ["marginBottom", 0], ["marginLeft", 10], ["color", "#808080"]])]])], ["time", _uM([[".item ", _uM([["fontSize", 14], ["color", "#808080"], ["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10]])]])], ["load-more-box", _pS(_uM([["justifyContent", "center"], ["alignItems", "center"], ["flexDirection", "row"], ["height", 45], ["width", "100%"], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"]]))]])]
