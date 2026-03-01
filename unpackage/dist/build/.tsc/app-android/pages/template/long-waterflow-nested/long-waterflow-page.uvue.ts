import _easycom_uni_loading from '@/uni_modules/uni-loading/components/uni-loading/uni-loading.uvue'
type flowItem = {
    plugin_id : number,
    plugin_img_link : string,
    plugin_name : string,
    plugin_intro : string,
    score : number,
    tags : Array<string>,
    update_date : string,
    author_name : string,
  }

  type ResponseDataType = {
    code : number,
    data : flowItem[]
  }

  
const __sfc__ = defineComponent({
  __name: 'long-waterflow-page',
  props: {
    type: { type: String, default: '' },
    preload: { type: Boolean, default: false },
    id: { type: String, default: '' }
  },
  setup(__props, __setupCtx: SetupContext) {
const __expose = __setupCtx.expose
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const SERVER_URL = "https://unidemo.dcloud.net.cn/plugin/uniappx-plugin-list"
  const PAGE_SIZE = 10; // 最大值 10

  const props = __props

  const loading = ref(false);
  const datagrid = ref([] as flowItem[]);
  const isEnded = ref(false);
  const loadingError = ref('');
  const currentPage = ref(1);

  const loadingText = computed(() : string => {
    if (loading.value) {
      return "加载中..."
    } else if (isEnded.value) {
      return "没有更多了"
    } else if (loadingError.value.length > 0) {
      return loadingError.value
    } else {
      return ""
    }
  });

  function loadData(loadComplete : (() => void) | null) {
    if (loading.value || isEnded.value) {
      return
    }
    loading.value = true

    uni.request<ResponseDataType>({
      url: SERVER_URL,
      data: {
        type: props.type,
        page: currentPage.value,
        page_size: PAGE_SIZE
      },
      success: (res) => {
        const responseData = res.data
        if (responseData == null) {
          return
        }

        datagrid.value.push(...responseData.data)

        if (responseData.data.length == 0) {
          isEnded.value = true
        } else {
          currentPage.value++
        }
      },
      fail: (err) => {
        loadingError.value = err.errMsg
      },
      complete: () => {
        loading.value = false
        if (loadComplete != null) {
          loadComplete()
        }
      }
    })
  }

  function refreshData(loadComplete : (() => void) | null) {
    datagrid.value.length = 0
    currentPage.value = 1
    loadData(loadComplete)
  }

  // score 0 ~ 50
  function convertToStarUnicode(score : number) : string {
    const fill_code = '\ue879'
    const half_code = '\ue87a'
    const null_code = '\ue87b'

    const fillStarCount = parseInt(score / 10 % 10 + '')
    const halfStarCount = score % 10 >= 5 ? 1 : 0
    const nullStarCount = 5 - fillStarCount - halfStarCount

    let result = ''
    if (fillStarCount > 0) { result += fill_code.repeat(fillStarCount) }
    if (halfStarCount > 0) { result += half_code.repeat(halfStarCount) }
    if (nullStarCount > 0) { result += null_code.repeat(nullStarCount) }

    return result
  }

  onMounted(() => {
    if (props.preload) {
      loadData(null)
    }
  });

  __expose({
    refreshData,
    loadData
  });

return (): any | null => {

const _component_uni_loading = resolveEasyComponent("uni-loading",_easycom_uni_loading)

  return _cE("waterflow", _uM({
    id: _ctx.id,
    class: "grid",
    bounces: false,
    "scroll-y": true,
    "custom-nested-scroll": true,
    "main-axis-gap": "8px",
    "cross-axis-gap": "8px",
    "cross-axis-count": "2",
    onScrolltolower: () => {loadData(null)},
    "associative-container": "nested-scroll-view"
  }), [
    _cE(Fragment, null, RenderHelpers.renderList(unref(datagrid), (item, _, __index, _cached): any => {
      return _cE("flow-item", _uM({
        class: "flow-item",
        key: item.plugin_id,
        type: "1"
      }), [
        _cE("view", _uM({ class: "flow-item-icon" }), [
          _cE("image", _uM({
            class: "flow-item-icon-image",
            src: item.plugin_img_link,
            mode: "aspectFit"
          }), null, 8 /* PROPS */, ["src"])
        ]),
        _cE("view", _uM({ class: "flow-item-fill" }), [
          _cE("view", _uM({ class: "flex-row" }), [
            _cE("text", _uM({ class: "title" }), _tD(item.plugin_name), 1 /* TEXT */)
          ]),
          _cE("view", null, [
            _cE("text", _uM({ class: "description-text" }), _tD(item.plugin_intro), 1 /* TEXT */)
          ]),
          _cE("text", _uM({ class: "icon-star" }), _tD(convertToStarUnicode(item.score)), 1 /* TEXT */),
          _cE("view", _uM({ class: "tag-grid" }), [
            _cE(Fragment, null, RenderHelpers.renderList(item.tags.slice(0,1), (item2, index2, __index, _cached): any => {
              return _cE("text", _uM({
                class: "tag-item",
                key: index2
              }), _tD(item2), 1 /* TEXT */)
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _cE("view", _uM({ class: "flex-row update-date" }), [
            _cE("text", _uM({ class: "author" }), _tD(item.author_name), 1 /* TEXT */)
          ]),
          _cE("view", _uM({ class: "flex-row update-date" }), [
            _cE("text", _uM({ class: "update-date-text" }), "更新日期"),
            _cE("text", _uM({ class: "update-date-value" }), _tD(item.update_date), 1 /* TEXT */)
          ])
        ])
      ])
    }), 128 /* KEYED_FRAGMENT */),
    _cE("flow-item", _uM({
      slot: "load-more",
      class: "loading",
      type: "6"
    }), [
      _cV(_component_uni_loading, _uM({
        loading: unref(loading),
        color: "#999",
        text: unref(loadingText)
      }), null, 8 /* PROPS */, ["loading", "text"])
    ])
  ], 40 /* PROPS, NEED_HYDRATION */, ["id", "onScrolltolower"])
}
}

})
export default __sfc__
const GenPagesTemplateLongWaterflowNestedLongWaterflowPageStyles = [_uM([["grid", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["backgroundColor", "#f7f7f7"]]))], ["flow-item", _pS(_uM([["flexDirection", "column"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5], ["backgroundColor", "#ffffff"]]))], ["flow-item-icon", _pS(_uM([["position", "relative"]]))], ["flow-item-icon-image", _pS(_uM([["width", "100%"]]))], ["flow-item-fill", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", 5], ["paddingRight", 5], ["paddingBottom", 5], ["paddingLeft", 5]]))], ["description-text", _pS(_uM([["fontSize", 13], ["color", "#666666"], ["lineHeight", "19px"]]))], ["icon-star", _pS(_uM([["fontFamily", "UtsStarIcons"], ["fontSize", 16], ["fontStyle", "normal"], ["color", "#ffca3e"], ["letterSpacing", 3]]))], ["tag-grid", _pS(_uM([["flexDirection", "row"], ["marginTop", 5]]))], ["tag-item", _pS(_uM([["fontSize", 12], ["backgroundColor", "#EFF9F0"], ["color", "#639069"], ["borderTopLeftRadius", 20], ["borderTopRightRadius", 20], ["borderBottomRightRadius", 20], ["borderBottomLeftRadius", 20], ["marginRight", 5], ["paddingTop", 2], ["paddingRight", 5], ["paddingBottom", 2], ["paddingLeft", 5]]))], ["update-date", _pS(_uM([["marginTop", 10]]))], ["update-date-text", _pS(_uM([["fontSize", 12], ["color", "#888888"]]))], ["update-date-value", _pS(_uM([["fontSize", 12], ["color", "#777777"], ["marginLeft", 5]]))], ["author", _pS(_uM([["fontSize", 12], ["color", "#008000"]]))], ["loading", _pS(_uM([["paddingTop", 30], ["paddingRight", 30], ["paddingBottom", 30], ["paddingLeft", 30], ["alignItems", "center"], ["height", 80]]))], ["flex-row", _pS(_uM([["flexDirection", "row"]]))], ["@FONT-FACE", _uM([["0", _uM([["fontFamily", "UtsStarIcons"], ["src", "url('/static/fonts/icon-star.ttf')"]])]])]])]
