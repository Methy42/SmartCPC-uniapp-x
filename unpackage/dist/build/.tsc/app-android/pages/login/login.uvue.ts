
// 使用选项式API避免导入问题
import { ref } from 'vue'
import { setUserInfo, UserInfo } from '@/store/index.uts'

type RequestResult = {
  statusCode: number,
  data: any
}

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
          if (savedUsername != null) {
            this.username = (savedUsername as string)
          }
          if (savedPassword != null) {
            this.password = (savedPassword as string)
          }
        }
      } catch (e) {
        console.error('读取记住密码失败:', e)
      }
    },
    
    async handleLogin() {
      if (this.isEmpty(this.username) || this.isEmpty(this.password)) {
        uni.showToast({ title: '请输入账号和密码', icon: 'none' })
        return
      }
      this.loading = true
      try {
        const res = await new Promise<RequestResult>((resolve, reject) => {
          uni.request({
            url: 'http://43.248.97.247:36680/api/oauth/Party/Login',
            method: 'POST',
            header: { 'Content-Type': 'application/json' },
            data: {
              account: this.username,
              password: this.password,
              grant_type: 'party_password'
            },
            success: (r) => {
              const rStr = JSON.stringify(r as any)
              const ro = JSON.parse(rStr) as UTSJSONObject
              const sc = (ro['statusCode'] as number) ?? 0
              const datRaw = ro['data']
              const datSafe = (datRaw != null) ? datRaw : ({} as UTSJSONObject)
              resolve({ statusCode: sc, data: datSafe } as RequestResult)
            },
            fail: (err) => reject(err)
          })
        })
        const ok: boolean = res.statusCode === 200
        if (!ok) {
          uni.showToast({ title: '登录失败', icon: 'none' })
          return
        }
        const body: any = res.data
        const bodyObj = body as UTSJSONObject
        let token: string = ''
        if (bodyObj != null) {
          const t1 = bodyObj['token'] as string | null
          const hasT1: boolean = (t1 != null) && ((t1 as string).length > 0)
          if (hasT1) {
            token = t1 as string
          } else {
            const at = bodyObj['access_token'] as string | null
            const hasAt: boolean = (at != null) && ((at as string).length > 0)
            if (hasAt) {
              token = at as string
            } else {
              const inner = bodyObj['data'] as UTSJSONObject | null
              if (inner != null) {
                const it = inner['token'] as string | null
                const hasIt: boolean = (it != null) && ((it as string).length > 0)
                if (hasIt) {
                  token = it as string
                } else {
                  const iat = inner['access_token'] as string | null
                  const hasIat: boolean = (iat != null) && ((iat as string).length > 0)
                  if (hasIat) {
                    token = iat as string
                  }
                }
              }
            }
          }
        }
        const user: UserInfo = {
          id: '',
          username: this.username,
          name: '',
          token: token
        }
        setUserInfo(user)
        uni.setStorageSync('user_token', token)
        uni.setStorageSync('user_info', JSON.stringify(user))
        if (this.remember) {
          uni.setStorageSync('remember_password', true)
          uni.setStorageSync('login_username', this.username)
          uni.setStorageSync('login_password', this.password)
        } else {
          uni.removeStorageSync('remember_password')
          uni.removeStorageSync('login_username')
          uni.removeStorageSync('login_password')
        }
        uni.switchTab({ url: '/pages/index/index' })
      } catch (e) {
        uni.showToast({ title: '网络异常', icon: 'none' })
      } finally {
        this.loading = false
      }
    }
  }
})

export default __sfc__
function GenPagesLoginLoginRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_checkbox = resolveComponent("checkbox")

  return _cE("view", _uM({ class: "container" }), [
    _cE("image", _uM({
      class: "background-image",
      src: "/static/background/u2.jpg",
      mode: "aspectFill"
    })),
    _cE("view", _uM({ class: "header" }), [
      _cE("image", _uM({
        class: "logo",
        src: "/static/index-logo.png",
        mode: "aspectFit"
      }))
    ]),
    _cE("view", _uM({ class: "form" }), [
      _cE("view", _uM({ class: "form-item" }), [
        _cE("input", _uM({
          class: "input",
          type: "text",
          modelValue: _ctx.username,
          onInput: ($event: UniInputEvent) => {(_ctx.username) = $event.detail.value},
          placeholder: "请输入账号/手机号",
          "placeholder-class": "placeholder"
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
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
          modelValue: _ctx.password,
          onInput: ($event: UniInputEvent) => {(_ctx.password) = $event.detail.value},
          placeholder: "请输入密码",
          "placeholder-class": "placeholder",
          password: ""
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
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
      }), "登录", 12 /* STYLE, PROPS */, ["onClick", "loading"])
    ]),
    _cE("view", _uM({ class: "footer" }), [
      _cE("text", _uM({ class: "footer-text" }), "技术支持：南水北调（江苏）数智科技有限公司")
    ])
  ])
}
const GenPagesLoginLoginStyles = [_uM([["container", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["backgroundColor", "rgba(0,0,0,0)"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingTop", "80rpx"], ["paddingRight", "60rpx"], ["paddingBottom", "80rpx"], ["paddingLeft", "60rpx"]]))], ["background-image", _pS(_uM([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["height", "100%"], ["zIndex", -1]]))], ["header", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["marginBottom", "100rpx"]]))], ["logo", _pS(_uM([["width", "360rpx"], ["height", "120rpx"], ["marginBottom", "30rpx"]]))], ["title", _pS(_uM([["fontSize", "48rpx"], ["fontWeight", "bold"], ["color", "#FFD700"], ["marginBottom", "20rpx"]]))], ["subtitle", _pS(_uM([["fontSize", "32rpx"], ["color", "rgba(255,255,255,0.8)"]]))], ["form", _pS(_uM([["backgroundImage", "none"], ["backgroundColor", "rgba(255,255,255,0.95)"], ["borderTopLeftRadius", "30rpx"], ["borderTopRightRadius", "30rpx"], ["borderBottomRightRadius", "30rpx"], ["borderBottomLeftRadius", "30rpx"], ["paddingTop", "60rpx"], ["paddingRight", "50rpx"], ["paddingBottom", "60rpx"], ["paddingLeft", "50rpx"], ["marginBottom", "60rpx"]]))], ["form-item", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["borderBottomWidth", "2rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#eeeeee"], ["paddingTop", "10rpx"], ["paddingRight", 0], ["paddingBottom", "10rpx"], ["paddingLeft", 0], ["marginBottom", "40rpx"], ["borderBottomWidth:last-child", "0rpx"], ["borderBottomStyle:last-child", "solid"], ["borderBottomColor:last-child", "rgba(0,0,0,0)"], ["marginBottom:last-child", 0]]))], ["input", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["marginLeft", "30rpx"], ["fontSize", "32rpx"], ["color", "#333333"], ["height", "50rpx"], ["lineHeight", "50rpx"]]))], ["placeholder", _pS(_uM([["color", "#999999"], ["fontSize", "30rpx"]]))], ["login-btn", _pS(_uM([["height", "100rpx"], ["fontSize", "36rpx"], ["fontWeight", "bold"], ["marginTop", "40rpx"]]))], ["tips", _pS(_uM([["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["marginTop", "50rpx"]]))], ["tip-text", _pS(_uM([["fontSize", "26rpx"], ["color", "#666666"], ["marginBottom", "10rpx"]]))], ["footer", _pS(_uM([["textAlign", "center"], ["marginTop", "auto"]]))], ["footer-text", _pS(_uM([["fontSize", "24rpx"], ["color", "rgba(255,255,255,0.6)"]]))]])]
