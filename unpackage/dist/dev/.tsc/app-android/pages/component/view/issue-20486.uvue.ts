
const __sfc__ = defineComponent({
  __name: 'issue-20486',
  setup(__props, __setupCtx: SetupContext) {
const __expose = __setupCtx.expose
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const isDarkMode = ref(false)
  const testViewY = ref(0);

  onReady(() => {
    let ele = uni.getElementById('testView') as UniElement
    const currentPage = getCurrentInstance()!.proxy!.$page
    testViewY.value = ele.getBoundingClientRect().y + currentPage.statusBarHeight + 44
		console.log(testViewY.value, " at pages/component/view/issue-20486.uvue:21")
  })

  const toggleTheme = () => {
    isDarkMode.value = !isDarkMode.value
  }

  function getTestViewY() {
    return testViewY.value;
  }

  __expose({
    getTestViewY
  })

return (): any | null => {

  return _cE("scroll-view", _uM({
    style: _nS(_uM({"flex":"1"})),
    class: _nC(unref(isDarkMode)? 'dark' : 'light')
  }), [
    _cE("view", _uM({ class: "box" }), [
      _cE("text", _uM({
        class: _nC(unref(isDarkMode)? 'darkText' : 'lightText')
      }), "当前模式：" + _tD(unref(isDarkMode)? 'dark' : 'light'), 3 /* TEXT, CLASS */)
    ]),
    _cE("view", _uM({
      id: "testView",
      "hover-class": "btn-hover",
      class: "btn",
      onClick: toggleTheme
    }), [
      _cE("text", null, "切换:" + _tD(unref(isDarkMode)? 'dark' : 'light') + " (应该无背景色)", 1 /* TEXT */)
    ])
  ], 6 /* CLASS, STYLE */)
}
}

})
export default __sfc__
const GenPagesComponentViewIssue20486Styles = [_uM([["dark", _pS(_uM([["--l-box-bg-color", "#000"]]))], ["lightText", _pS(_uM([["color", "#000000"]]))], ["darkText", _pS(_uM([["color", "#FFFFFF"]]))], ["btn", _pS(_uM([["height", 50], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["btn-hover", _pS(_uM([["backgroundColor", "var(--l-btn-hover-color, red)"]]))], ["box", _pS(_uM([["width", 140], ["height", 140], ["backgroundColor", "var(--l-box-bg-color, #f5f5f5)"]]))]])]
