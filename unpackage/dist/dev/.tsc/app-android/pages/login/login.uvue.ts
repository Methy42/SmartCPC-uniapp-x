
// 使用选项式API避免导入问题
import { ref } from 'vue'
import { setUserInfo, UserInfo } from '@/store/index.uts'

const __sfc__ = defineComponent({
  setup() {
    // 使用简单的响应式变量，避免复杂的类型系统
    const username = ref('')
    const password = ref('')
    const remember = ref(false)
    const loading = ref(false)
    
    return {
      username,
      password,
      remember,
      loading
    }
  },
  
  onLoad() {
    this.initRememberPassword()
  },
  
  methods: {
    // 输入事件处理 - 修复类型和访问方式
    // onUsernameInput(e: { detail: { value: string } }) {
    //   this.username = e.detail.value
    // },
    
    // onPasswordInput(e: { detail: { value: string } }) {
    //   this.password = e.detail.value
    // },
    
    onRememberChange() {
      this.remember = !this.remember
    },
    
    // 简单的字符串判空函数 - 修复Kotlin兼容性
    isEmpty(str: string | null): boolean {
      if (str == null) {
        return true
      }
      // 安全地调用trim方法
      const trimmed = str.trim()
      return trimmed.length === 0
    },
    
    initRememberPassword() {
      try {
        const rememberFlag = uni.getStorageSync('remember_password')
        if (rememberFlag === true) {
          this.remember = true
          const savedUsername = uni.getStorageSync('login_username')
          const savedPassword = uni.getStorageSync('login_password')
          // if (savedUsername != null) {
          //   this.username = String(savedUsername)
          // }
          // if (savedPassword != null) {
          //   this.password = String(savedPassword)
          // }
        }
      } catch (e) {
        console.error('读取记住密码失败:', e, " at pages/login/login.uvue:124")
      }
    },
    
    async handleLogin() {
      
    }
  }
})

export default __sfc__
function GenPagesLoginLoginRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_checkbox = resolveComponent("checkbox")

  return _cE("view", _uM({ class: "container" }), [
    _cE("view", _uM({ class: "header" }), [
      _cE("image", _uM({
        class: "logo",
        src: "/static/party-icon.png",
        mode: "aspectFit"
      })),
      _cE("text", _uM({ class: "title" }), "水源红·智慧党建"),
      _cE("text", _uM({ class: "subtitle" }), "党员教育管理平台")
    ]),
    _cE("view", _uM({ class: "form" }), [
      _cE("view", _uM({ class: "form-item" }), [
        _cE("image", _uM({
          src: "/static/avatar.png",
          style: _nS(_uM({"width":"24px","height":"24px","margin-right":"30rpx"})),
          mode: "aspectFit"
        }), null, 4 /* STYLE */),
        _cE("input", _uM({
          class: "input",
          type: "text",
          value: _ctx.username,
          placeholder: "请输入账号/手机号",
          "placeholder-class": "placeholder"
        }), null, 8 /* PROPS */, ["value"])
      ]),
      _cE("view", _uM({ class: "form-item" }), [
        _cE("image", _uM({
          src: "/static/lock-icon.png",
          style: _nS(_uM({"width":"24px","height":"24px","margin-right":"30rpx"})),
          mode: "aspectFit"
        }), null, 4 /* STYLE */),
        _cE("input", _uM({
          class: "input",
          type: "password",
          value: _ctx.password,
          placeholder: "请输入密码",
          "placeholder-class": "placeholder",
          password: ""
        }), null, 8 /* PROPS */, ["value"])
      ]),
      _cE("view", _uM({ class: "form-item" }), [
        _cV(_component_checkbox, _uM({
          checked: _ctx.remember,
          onChange: _ctx.onRememberChange,
          style: _nS(_uM({"transform":"scale(0.7)","margin-right":"10rpx"}))
        }), null, 8 /* PROPS */, ["checked", "onChange", "style"]),
        _cE("text", _uM({
          style: _nS(_uM({"font-size":"28rpx","color":"#666"}))
        }), "记住密码", 4 /* STYLE */)
      ]),
      _cE("button", _uM({
        class: "login-btn",
        onClick: _ctx.handleLogin,
        loading: _ctx.loading,
        style: _nS(_uM({"background-color":"#C8102E","color":"white","border-radius":"100rpx","height":"100rpx","font-size":"36rpx","font-weight":"bold","margin-top":"40rpx"}))
      }), "登录", 12 /* STYLE, PROPS */, ["onClick", "loading"]),
      _cE("view", _uM({ class: "tips" }), [
        _cE("text", _uM({ class: "tip-text" }), "默认账号：党员账号/手机号"),
        _cE("text", _uM({ class: "tip-text" }), "默认密码：123456")
      ])
    ]),
    _cE("view", _uM({ class: "footer" }), [
      _cE("text", _uM({ class: "footer-text" }), "技术支持：南水北调（江苏）数智科技有限公司")
    ])
  ])
}
const GenPagesLoginLoginStyles = [_uM([["container", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["backgroundImage", "linear-gradient(135deg, #C8102E 0%, #A80E26 100%)"], ["backgroundColor", "rgba(0,0,0,0)"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", "80rpx"], ["paddingRight", "60rpx"], ["paddingBottom", "80rpx"], ["paddingLeft", "60rpx"]]))], ["header", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["marginBottom", "100rpx"]]))], ["logo", _pS(_uM([["width", "120rpx"], ["height", "120rpx"], ["marginBottom", "30rpx"]]))], ["title", _pS(_uM([["fontSize", "48rpx"], ["fontWeight", "bold"], ["color", "#FFD700"], ["marginBottom", "20rpx"]]))], ["subtitle", _pS(_uM([["fontSize", "32rpx"], ["color", "rgba(255,255,255,0.8)"]]))], ["form", _pS(_uM([["backgroundImage", "none"], ["backgroundColor", "rgba(255,255,255,0.95)"], ["borderTopLeftRadius", "30rpx"], ["borderTopRightRadius", "30rpx"], ["borderBottomRightRadius", "30rpx"], ["borderBottomLeftRadius", "30rpx"], ["paddingTop", "60rpx"], ["paddingRight", "50rpx"], ["paddingBottom", "60rpx"], ["paddingLeft", "50rpx"], ["marginBottom", "60rpx"]]))], ["form-item", _pS(_uM([["display", "flex"], ["alignItems", "center"], ["borderBottomWidth", "2rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#eeeeee"], ["paddingTop", "40rpx"], ["paddingRight", 0], ["paddingBottom", "40rpx"], ["paddingLeft", 0], ["marginBottom", "40rpx"], ["borderBottomWidth:last-child", "medium"], ["borderBottomStyle:last-child", "none"], ["borderBottomColor:last-child", "#000000"], ["marginBottom:last-child", 0]]))], ["input", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["marginLeft", "30rpx"], ["fontSize", "32rpx"], ["color", "#333333"], ["height", "50rpx"], ["lineHeight", "50rpx"]]))], ["placeholder", _pS(_uM([["color", "#999999"], ["fontSize", "30rpx"]]))], ["login-btn", _pS(_uM([["height", "100rpx"], ["fontSize", "36rpx"], ["fontWeight", "bold"], ["marginTop", "40rpx"]]))], ["tips", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["marginTop", "50rpx"]]))], ["tip-text", _pS(_uM([["fontSize", "26rpx"], ["color", "#666666"], ["marginBottom", "10rpx"]]))], ["footer", _pS(_uM([["textAlign", "center"], ["marginTop", "auto"]]))], ["footer-text", _pS(_uM([["fontSize", "24rpx"], ["color", "rgba(255,255,255,0.6)"]]))]])]
