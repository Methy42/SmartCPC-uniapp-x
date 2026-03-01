
  import { COLLECTION_NAME, GenderType, GenderList, UNICLOUD_DB_CONTACTS_UPDATE, UNICLOUD_DB_CONTACTS_DELETE } from './types.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        collection: '',
        where: '',
        genderList: GenderList as GenderType[],
        whereID: '',
        uniCloudElement: null as UniCloudDBElement | null
      }
    },
    onLoad(options) {
      this.collection = COLLECTION_NAME;
      this.whereID = options['id'] as string;
      this.where = `_id=='${this.whereID}'`;
    },
    onReady() {
      this.uniCloudElement = this.$refs['udb'] as UniCloudDBElement
    },
    methods: {
      onFormSubmit: function (e : UniFormSubmitEvent) {
        const formData = e.detail.value
        const genderString = formData['gender'] as string
        formData['gender'] = (genderString.length > 0) ? parseInt(genderString) : -1
        this.uniCloudElement!.update(this.whereID, formData, {
          showToast: false,
          needLoading: true,
          needConfirm: false,
          loadingTitle: "正在保存...",
          success: (_ : UniCloudDBUpdateResult) => {
            // TODO 后续通过 EventChannel 实现
            uni.$emit(UNICLOUD_DB_CONTACTS_UPDATE, this.whereID)
            setTimeout(() => {
              uni.navigateBack()
            }, 500)
          },
          fail: (err : any | null) => {
            const error = err as UniCloudError
            uni.showModal({
              content: error.errMsg,
              showCancel: false
            })
          }
        })
      },
      remove(id : string | null, name : string | null) {
        this.uniCloudElement!.remove(id!, {
          needConfirm: true,
          needLoading: true,
          loadingTitle: "正在删除...",
          confirmTitle: "确定删除?",
          confirmContent: name,
          success: (_ : UniCloudDBRemoveResult) => {
            // TODO 后续通过 EventChannel 实现
            uni.$emit(UNICLOUD_DB_CONTACTS_DELETE, this.whereID)
            setTimeout(() => {
              uni.navigateBack({
                delta: 2
              })
            }, 500)
          },
          fail: (err : any | null) => {
            const error = err as UniCloudError
            uni.showModal({
              content: error.errMsg,
              showCancel: false
            })
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesComponentUnicloudDbUnicloudDbContactsEditRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_form = resolveComponent("form")
const _component_unicloud_db = resolveEasyComponent("unicloud-db",_easycom_unicloud_db)

  return _cE("scroll-view", _uM({ class: "scroll-view" }), [
    _cV(_component_unicloud_db, _uM({
      ref: "udb",
      collection: _ctx.collection,
      where: _ctx.where,
      "page-data": "replace"
    }), _uM({
      default: withScopedSlotCtx((slotProps: Record<string, any | null>): any[] => {
      const data = slotProps["data"]
      const loading = slotProps["loading"]
      const error = slotProps["error"]
      return [
        error!=null
          ? _cE("view", _uM({
              key: 0,
              class: "error"
            }), _tD(error.errMsg), 1 /* TEXT */)
          : _cC("v-if", true),
        isTrue(loading)
          ? _cE("view", _uM({
              key: 1,
              class: "loading"
            }), "正在加载...")
          : _cC("v-if", true),
        data.length>0
          ? _cV(_component_form, _uM({
              key: 2,
              onSubmit: _ctx.onFormSubmit
            }), _uM({
              default: withSlotCtx((): any[] => [
                _cE("view", _uM({ class: "form-item" }), [
                  _cE("text", _uM({ class: "form-item-label" }), "姓名"),
                  _cE("input", _uM({
                    class: "form-item-input",
                    placeholder: "姓名",
                    name: "username",
                    value: data[0].getString('username')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                _cE("view", _uM({ class: "form-item" }), [
                  _cE("text", _uM({ class: "form-item-label" }), "电话"),
                  _cE("input", _uM({
                    class: "form-item-input",
                    placeholder: "电话",
                    name: "mobile",
                    value: data[0].getString('mobile')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                _cE("view", _uM({ class: "form-item" }), [
                  _cE("text", _uM({ class: "form-item-label" }), "邮箱"),
                  _cE("input", _uM({
                    class: "form-item-input",
                    placeholder: "邮箱地址",
                    name: "email",
                    value: data[0].getString('email')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                _cE("view", _uM({ class: "form-item" }), [
                  _cE("text", _uM({ class: "form-item-label" }), "备注"),
                  _cE("textarea", _uM({
                    class: "form-item-input-comment",
                    placeholder: "备注",
                    name: "comment",
                    maxlength: "-1",
                    value: data[0].getString('comment')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                _cE("view", _uM({ class: "form-item" }), [
                  _cE("text", _uM({ class: "form-item-label" }), "性别"),
                  _cV(_component_radio_group, _uM({
                    class: "radio-list",
                    name: "gender"
                  }), _uM({
                    default: withSlotCtx((): any[] => [
                      _cE(Fragment, null, RenderHelpers.renderList(_ctx.genderList, (item, _, __index, _cached): any => {
                        return _cE("view", _uM({
                          class: "radio-item",
                          key: item.value
                        }), [
                          _cV(_component_radio, _uM({
                            value: item.value,
                            checked: item.value == data[0].getNumber('gender')
                          }), null, 8 /* PROPS */, ["value", "checked"]),
                          _cE("text", null, _tD(item.text), 1 /* TEXT */)
                        ])
                      }), 128 /* KEYED_FRAGMENT */)
                    ]),
                    _: 2 /* DYNAMIC */
                  }), 1024 /* DYNAMIC_SLOTS */)
                ]),
                _cE("view", _uM({ class: "btn-group" }), [
                  _cE("button", _uM({
                    class: "btn-submit",
                    type: "primary",
                    "form-type": "submit"
                  }), "保存"),
                  _cE("button", _uM({
                    class: "btn-delete",
                    type: "warn",
                    onClick: () => {_ctx.remove(data[0].getString('_id'), data[0].getString('username'))}
                  }), "删除联系人", 8 /* PROPS */, ["onClick"])
                ])
              ]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["onSubmit"])
          : _cC("v-if", true)
      ]}),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["collection", "where"])
  ])
}
const GenPagesComponentUnicloudDbUnicloudDbContactsEditStyles = [_uM([["page", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["scroll-view", _pS(_uM([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["loading", _pS(_uM([["alignItems", "center"]]))], ["form-item", _pS(_uM([["flexDirection", "row"], ["marginBottom", 15], ["alignItems", "center"]]))], ["form-item-label", _pS(_uM([["width", 45], ["marginRight", 10]]))], ["form-item-input", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["fontSize", 14], ["color", "#666666"], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#e5e5e5"], ["borderRightColor", "#e5e5e5"], ["borderBottomColor", "#e5e5e5"], ["borderLeftColor", "#e5e5e5"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5], ["height", 34], ["paddingLeft", 8], ["paddingRight", 8]]))], ["form-item-input-comment", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["fontSize", 14], ["color", "#666666"], ["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "#e5e5e5"], ["borderRightColor", "#e5e5e5"], ["borderBottomColor", "#e5e5e5"], ["borderLeftColor", "#e5e5e5"], ["borderTopLeftRadius", 5], ["borderTopRightRadius", 5], ["borderBottomRightRadius", 5], ["borderBottomLeftRadius", 5], ["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8]]))], ["radio-list", _pS(_uM([["flexDirection", "row"]]))], ["radio-item", _pS(_uM([["flexDirection", "row"], ["marginRight", 30], ["alignItems", "center"]]))], ["btn-group", _pS(_uM([["marginTop", 30]]))], ["btn-delete", _pS(_uM([["marginTop", 15]]))]])]

import _easycom_unicloud_db from '@/node-modules/@dcloudio/uni-components/lib-x/unicloud-db/unicloud-db.vue'
