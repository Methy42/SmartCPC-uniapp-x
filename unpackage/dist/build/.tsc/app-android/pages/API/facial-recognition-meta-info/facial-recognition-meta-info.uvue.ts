
  const __sfc__ = defineComponent({
    data() {
      return {
        title: '实人认证',
        realName: '',
        idCard: ''
      }
    },
    onReady() {
    },
    methods: {
      facialRecognition() {
        const realName = this.realName.trim()
        const idCard = this.idCard.trim()
        if (realName == '' || idCard == '') {
          uni.showModal({
            title: '错误',
            content: '姓名和身份证号不可为空',
            showCancel: false
          })
          return
        }
        if('production' === process.env.NODE_ENV && '__UNI__HelloUniAppX'===uni.getAppBaseInfo().appId){
          uni.showModal({
            title: '提示',
            content: '实人认证为收费功能，当前环境暂不支持。请在HBuilderX中新建Hello uni-app x项目真机运行体验！',
            showCancel: false
          })
          return
        }
        const testFacialCo = uniCloud.importObject('facial-recognition-co')
        let metaInfo = uni.getFacialRecognitionMetaInfo();
        testFacialCo.getCertifyId({
          realName,
          idCard,
          metaInfo
        })
          .then((res : UTSJSONObject) : Promise<string> => {
            const certifyId = res['certifyId'] as string
            return new Promise((
              resolve : (res : string) => void,
              reject : (err : Error) => void
            ) => {
              uni.startFacialRecognitionVerify({
                certifyId,
                success() {
                  resolve(certifyId)
                },
                fail(err) {
                  reject(new Error(err.errMsg))
                }
              })
            })
          })
          .then((certifyId : string) : Promise<UTSJSONObject> => {
            return testFacialCo.getAuthResult(certifyId)
          })
          .then((res : UTSJSONObject) => {
            console.log('res', res)
          })
          .catch((err : any | null) => {
            console.error('error', err)
          })
      }
    }
  })

export default __sfc__
function GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return _cE("scroll-view", _uM({ class: "page-scroll-view" }), [
    _cE("view", null, [
      _cV(_component_page_head, _uM({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      _cE("view", _uM({ class: "uni-padding-wrap uni-common-mt" }), [
        _cE("view", _uM({ class: "uni-btn-v uni-common-mt" }), [
          _cE("input", _uM({
            class: "uni-input",
            type: "text",
            modelValue: _ctx.realName,
            onInput: ($event: UniInputEvent) => {(_ctx.realName) = $event.detail.value},
            name: "real-name",
            placeholder: "姓名",
            maxlength: "-1"
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
        ]),
        _cE("view", _uM({ class: "uni-btn-v uni-common-mt" }), [
          _cE("input", _uM({
            class: "uni-input",
            type: "text",
            modelValue: _ctx.idCard,
            onInput: ($event: UniInputEvent) => {(_ctx.idCard) = $event.detail.value},
            name: "id-card",
            placeholder: "身份证号",
            maxlength: "-1"
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
        ]),
        _cE("view", _uM({ class: "uni-btn-v uni-common-mt" }), [
          _cE("button", _uM({
            type: "primary",
            onClick: _ctx.facialRecognition
          }), "开始人脸识别", 8 /* PROPS */, ["onClick"])
        ])
      ])
    ])
  ])
}
const GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfoStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
