
  type CameraScanCodeResult = { __$originalPosition?: UTSSourceMapPosition<"CameraScanCodeResult", "pages/component/camera/camera-scan-code.uvue", 31, 8>;
    type : string | null;
    result : string | null;
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        result: null as CameraScanCodeResult | null,
      }
    },
    methods: {
      navigateBack() {
        uni.navigateBack()
      },
      handleScanCode(ev : UniCameraScanCodeEvent) {
        const deatil = ev.detail;
        this.result = {
          type: deatil.type,
          result: deatil.result
        } as CameraScanCodeResult
      }
    }
  })

export default __sfc__
function GenPagesComponentCameraCameraScanCodeRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_camera = resolveComponent("camera")

  return _cE("view", _uM({
    style: _nS(_uM({"flex":"1"}))
  }), [
    _cV(_component_camera, _uM({
      style: _nS(_uM({"width":"100%","height":"300px"})),
      resolution: 'high',
      mode: 'scanCode',
      onScancode: _ctx.handleScanCode
    }), null, 8 /* PROPS */, ["style", "onScancode"]),
    _cE("view", _uM({ class: "camera-scan-code-back-wrap" }), [
      _cE("button", _uM({
        type: "default",
        onClick: _ctx.navigateBack
      }), "返回正常模式", 8 /* PROPS */, ["onClick"])
    ]),
    _cE("view", _uM({ class: "camera-scan-code-table" }), [
      _cE("view", _uM({ class: "camera-scan-code-table-pair" }), [
        _cE("view", _uM({ class: "camera-scan-code-table-pair-label" }), [
          _cE("text", null, "类型")
        ]),
        _cE("view", _uM({ class: "camera-scan-code-table-pair-value" }), [
          _cE("text", null, _tD(_ctx.result?.type ?? ''), 1 /* TEXT */)
        ])
      ]),
      _cE("view", _uM({ class: "camera-scan-code-table-pair camera-scan-code-table-top-line" }), [
        _cE("view", _uM({ class: "camera-scan-code-table-pair-label" }), [
          _cE("text", null, "结果")
        ]),
        _cE("view", _uM({ class: "camera-scan-code-table-pair-value" }), [
          _cE("text", null, _tD(_ctx.result?.result ?? ''), 1 /* TEXT */)
        ])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentCameraCameraScanCodeStyles = [_uM([["camera-scan-code-back-wrap", _pS(_uM([["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["camera-scan-code-table", _pS(_uM([["backgroundColor", "#FFFFFF"], ["marginTop", 20]]))], ["camera-scan-code-table-pair", _pS(_uM([["height", 50], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignItems", "center"]]))], ["camera-scan-code-table-pair-label", _pS(_uM([["flexGrow", 1], ["marginLeft", 15]]))], ["camera-scan-code-table-pair-value", _pS(_uM([["flexGrow", 2]]))], ["camera-scan-code-table-top-line", _pS(_uM([["borderTopWidth", 1], ["borderTopStyle", "solid"], ["borderTopColor", "#eeeeee"]]))]])]
