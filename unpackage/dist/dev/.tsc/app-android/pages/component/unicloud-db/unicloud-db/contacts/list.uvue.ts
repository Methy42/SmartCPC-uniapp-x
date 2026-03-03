
  import { COLLECTION_NAME, UNICLOUD_DB_CONTACTS_ADD, UNICLOUD_DB_CONTACTS_UPDATE, UNICLOUD_DB_CONTACTS_DELETE } from './types.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        collection: COLLECTION_NAME,
        uniCloudElement: null as UniCloudDBElement | null
      }
    },
    onReady() {
      // TODO 后续通过 EventChannel 实现
      uni.$on(UNICLOUD_DB_CONTACTS_DELETE, this.onDataChange);
      this.uniCloudElement = this.$refs['udb'] as UniCloudDBElement
      this.uniCloudElement!.loadData()
    },
    onUnload() {
      // TODO 后续通过 EventChannel 实现
      uni.$off(UNICLOUD_DB_CONTACTS_ADD, this.onDataChange);
      uni.$off(UNICLOUD_DB_CONTACTS_UPDATE, this.onDataChange);
      uni.$off(UNICLOUD_DB_CONTACTS_DELETE, this.onDataChange);
    },
    onShow() {
      // TODO 后续通过 EventChannel 实现
      uni.$off(UNICLOUD_DB_CONTACTS_ADD, this.onDataChange);
      uni.$off(UNICLOUD_DB_CONTACTS_UPDATE, this.onDataChange);
    },
    onPullDownRefresh() {
      this.uniCloudElement!.loadData({
        clear: true,
        success: (_ : UniCloudDBGetResult) => {
          uni.stopPullDownRefresh()
        }
      })
    },
    methods: {
      loadMore() {
        this.uniCloudElement!.loadMore()
      },
      gotoAddPage() {
        // TODO 后续通过 EventChannel 实现
        uni.$on(UNICLOUD_DB_CONTACTS_ADD, this.onDataChange);
        uni.navigateTo({
          url: './add'
        })
      },
      gotoDetailPage(id : string) {
        // TODO 后续通过 EventChannel 实现
        uni.$on(UNICLOUD_DB_CONTACTS_UPDATE, this.onDataChange);
        uni.navigateTo({
          url: './detail?id=' + id
        })
      },
      onDataChange(_ : string) {
        this.uniCloudElement!.loadData({
          clear: true
        })
      }
    }
  })

export default __sfc__
function GenPagesComponentUnicloudDbUnicloudDbContactsListRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_uni_loading = resolveEasyComponent("uni-loading",_easycom_uni_loading)
const _component_unicloud_db = resolveEasyComponent("unicloud-db",_easycom_unicloud_db)

  return _cE("view", _uM({ class: "page" }), [
    _cV(_component_unicloud_db, _uM({
      ref: "udb",
      class: "udb",
      collection: _ctx.collection,
      "page-size": 15,
      getcount: true,
      loadtime: "manual"
    }), _uM({
      default: withScopedSlotCtx((slotProps: Record<string, any | null>): any[] => {
      const data = slotProps["data"]
      const pagination = slotProps["pagination"]
      const loading = slotProps["loading"]
      const hasMore = slotProps["hasMore"]
      const error = slotProps["error"]
      return [
        error!=null
          ? _cE("view", _uM({
              key: 0,
              class: "error"
            }), _tD(error.errMsg), 1 /* TEXT */)
          : _cC("v-if", true),
        _cE("scroll-view", _uM({
          ref: "listView",
          class: "list-view",
          onScrolltolower: () => {_ctx.loadMore()}
        }), [
          _cE(Fragment, null, RenderHelpers.renderList(data, (item, _, __index, _cached): any => {
            return _cE("view", _uM({
              class: "list-item",
              onClick: () => {_ctx.gotoDetailPage(item['_id'] as string)}
            }), [
              _cE("view", _uM({ class: "list-item-fill" }), [
                _cE("text", _uM({ class: "name" }), _tD(item['username']), 1 /* TEXT */),
                _cE("text", _uM({ class: "mobile" }), _tD(item['mobile']), 1 /* TEXT */)
              ])
            ], 8 /* PROPS */, ["onClick"])
          }), 256 /* UNKEYED_FRAGMENT */)
        ], 40 /* PROPS, NEED_HYDRATION */, ["onScrolltolower"]),
        isTrue(loading)
          ? _cV(_component_uni_loading, _uM({
              key: 1,
              class: "loading",
              color: "#999",
              text: "正在加载..."
            }))
          : _cC("v-if", true),
        data.length>0
          ? _cE("view", _uM({
              key: 2,
              class: "pagination"
            }), [
              _cE("text", _uM({ class: "pagination-item" }), _tD(data.length) + " / " + _tD(pagination.count), 1 /* TEXT */)
            ])
          : _cC("v-if", true)
      ]}),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["collection"]),
    _cE("view", _uM({
      class: "btn-plus",
      onClick: _ctx.gotoAddPage
    }), [
      _cE("text", _uM({ class: "btn-plus-text" }), "+")
    ], 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesComponentUnicloudDbUnicloudDbContactsListStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["flexDirection", "column"]]))], ["loading", _pS(_uM([["marginTop", 20], ["marginRight", 20], ["marginBottom", 20], ["marginLeft", 20], ["alignSelf", "center"]]))], ["udb", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["flexDirection", "column"]]))], ["list-view", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["flexDirection", "column"]]))], ["list-item", _pS(_uM([["flexDirection", "row"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["backgroundColor", "#ffffff"], ["marginBottom", 1]]))], ["mobile", _pS(_uM([["marginTop", 5]]))], ["btn-plus", _pS(_uM([["position", "absolute"], ["width", 64], ["height", 64], ["right", 20], ["bottom", 20], ["alignItems", "center"], ["justifyContent", "center"], ["backgroundColor", "#1e90ff"], ["borderTopLeftRadius", 64], ["borderTopRightRadius", 64], ["borderBottomRightRadius", 64], ["borderBottomLeftRadius", 64]]))], ["btn-plus-text", _pS(_uM([["fontSize", 30], ["color", "#ffffff"]]))], ["pagination", _pS(_uM([["alignItems", "center"], ["backgroundColor", "#f8f8f8"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))]])]

import _easycom_uni_loading from '@/uni_modules/uni-loading/components/uni-loading/uni-loading.uvue'
import _easycom_unicloud_db from '@/node-modules/@dcloudio/uni-components/lib-x/unicloud-db/unicloud-db.vue'
