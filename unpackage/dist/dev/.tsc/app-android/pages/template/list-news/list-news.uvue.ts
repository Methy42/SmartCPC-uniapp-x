import { state } from '@/store/index.uts'
  import detail from './detail/detail.uvue'

  type Banner = { __$originalPosition?: UTSSourceMapPosition<"Banner", "pages/template/list-news/list-news.uvue", 55, 8>;
    cover : string | null,
    title : string | null,
    post_id : string | null
  }
  type Item = { __$originalPosition?: UTSSourceMapPosition<"Item", "pages/template/list-news/list-news.uvue", 60, 8>;
    author_name : string,
    cover : string,
    id : number,
    post_id : string,
    published_at : string,
    title : string
  }
  // 导入详情组件，宽屏时，右侧直接展示详情内容
  
const __sfc__ = defineComponent({
  __name: 'list-news',
  setup(__props) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const th_item = ref(["排序", "筛选"])
  const refresherTriggered = ref(false)
  const banner = ref({} as Banner)
  const listData = ref([] as Item[])
  const last_id = ref('')
  const isWideScreen = ref(false) // 是否为宽屏模式
  const currentIndex = ref(0) // 当前选中的列表项索引
  const post_id = ref('')
  const cover = ref('')
  const title = ref('')
  const firstDetailContent = ref('') // 并行预加载的第一个详情内容

  function checkScreenWidth() {
    const deviceType = uni.getDeviceInfo().deviceType
    const { windowWidth } = uni.getWindowInfo()
    // 只要是pad/pc，或者宽度大于700，都算宽屏
    isWideScreen.value = (
      deviceType === 'pad' ||
      deviceType === 'pc' ||
      windowWidth > 700
    )
  }

  function getBanner() {
    let data = {__$originalPosition: new UTSSourceMapPosition("data", "pages/template/list-news/list-news.uvue", 95, 9),
      column: 'id,post_id,title,author_name,cover,published_at' //需要的字段名
    };
    uni.request<Banner>({
      url: 'https://unidemo.dcloud.net.cn/api/banner/36kr',
      data: data,
      success: data => {
        refresherTriggered.value = false
        if (data.statusCode == 200) {
          const result = data.data
          if (result != null) {
            banner.value = result;
          }
        }
      },
      fail: (e) => {
        console.log('fail', e, " at pages/template/list-news/list-news.uvue:111");
      }
    });
  }

  function goDetail(e: Item, key: number) {
    currentIndex.value = key
    const detail = e;
    post_id.value = detail.post_id;
    cover.value = detail.cover;
    title.value = detail.title;
    // 窄屏时跳转到详情页，宽屏时右侧直接展示
    if (!isWideScreen.value) {

      cover.value = btoa(cover.value);

      uni.navigateTo({
        url: '/pages/template/list-news/detail/detail?post_id=' + post_id.value + "&cover=" + cover.value + "&title=" + title.value + "&shareKey=image_" + key
      });
    }
  }

  function getList() {
    let url = "https://unidemo.dcloud.net.cn/api/news?column=id,post_id,title,author_name,cover,published_at";
    /* if (last_id.value != "") {
      const minId = parseInt((last_id.value))
      const time = new Date().getTime() + '';
      const pageSize = 10;
      url = url + "&minId=" + minId + "&time=" + time + "&pageSize=" + pageSize;
    } */
    uni.request<Item[]>({
      url: url,
      method: "GET",
      success: (res) => {
        if (res.statusCode == 200) {
          const result = res.data
          //因本接口没有更多分页数据，所以重新赋值。正常有分页的列表应该如下面push方式增加数组项
          // listData.value.push(...result)
          // last_id.value = listData.value[0].id + "";
          if (result != null) {
            listData.value = result
            // 宽屏模式下，自动选中并展示第一个新闻详情
            if (isWideScreen.value && listData.value.length > 0) {
              goDetail(listData.value[0], 0)
              // 并行预加载第一个详情内容，提升右侧展示速度
              const first = listData.value[0]
              uni.request({
                url: 'https://unidemo.dcloud.net.cn/api/news/36kr/' + first.post_id,
                success: (res) => {
                  if (res.statusCode == 200) {
                    const result = res.data as UTSJSONObject;
                    firstDetailContent.value = result["content"] as string
                  }
                }
              })
            }
          }
          refresherTriggered.value = false;
        }
      },
      fail: (res) => {
        console.log('fail', res, " at pages/template/list-news/list-news.uvue:172");
        refresherTriggered.value = false
      }
    });
  }

  function bannerClick(e: Banner) {
    const detail = e;
    const post_id_val = detail.post_id;
    let cover_val = detail.cover ?? "";

    cover_val = btoa(cover_val);

    const title_val = detail.title;
    uni.navigateTo({
      url: '/pages/template/list-news/detail/detail?post_id=' + post_id_val + "&cover=" + cover_val + "&title=" + title_val
    });
  }

  function clickTH(index: number) {
    uni.showModal({
      content: "点击表头项：" + index,
      showCancel: false
    });
  }

  function onRefresherrefresh() {
    refresherTriggered.value = true
    getBanner();
    getList();
  }

  const currentDetailContent = computed(() => {
    // 只在宽屏且是第一个文章时用预加载内容
    if (
      isWideScreen.value &&
      listData.value.length > 0 &&
      post_id.value === listData.value[0].post_id &&
      firstDetailContent.value !== ''
    ) {
      return firstDetailContent.value
    }
    return ''
  })

  const isDarkMode = computed(() => state.isDarkMode)

  onLoad(() => {
    checkScreenWidth()
    getBanner()
    getList()
  })

  onResize(() => {
    checkScreenWidth()
  })

return (): any | null => {

  return _cE("view", _uM({
    class: _nC(['uni-container', _uM({ 'flex-row': unref(isWideScreen) }), unref(isDarkMode) ? 'theme-dark' : 'theme-light']),
    style: _nS(_uM({"flex":"1","padding":"0px"}))
  }), [
    _cE("list-view", _uM({
      class: _nC(["list-container", _uM({'list-narrow': unref(isWideScreen)})]),
      "refresher-enabled": "true",
      onRefresherrefresh: onRefresherrefresh,
      "refresher-triggered": unref(refresherTriggered),
      "enable-back-to-top": "true"
    }), [
      _cE("list-item", _uM({
        class: "banner",
        onClick: () => {bannerClick(unref(banner))},
        type: "1"
      }), [
        _cE("image", _uM({
          class: "banner-img",
          src: unref(banner).cover
        }), null, 8 /* PROPS */, ["src"]),
        _cE("text", _uM({ class: "banner-title" }), _tD(unref(banner).title), 1 /* TEXT */)
      ], 8 /* PROPS */, ["onClick"]),
      _cE("sticky-section", null, [
        _cE("sticky-header", null, [
          _cE("view", _uM({ class: "th-item" }), [
            _cE(Fragment, null, RenderHelpers.renderList(unref(th_item), (name, index, __index, _cached): any => {
              return _cE("text", _uM({
                key: index,
                onClick: () => {clickTH(index)},
                class: "th-item-text"
              }), _tD(name), 9 /* TEXT, PROPS */, ["onClick"])
            }), 128 /* KEYED_FRAGMENT */)
          ])
        ]),
        _cE(Fragment, null, RenderHelpers.renderList(unref(listData), (value, index, __index, _cached): any => {
          return _cE("list-item", _uM({
            key: index,
            type: "2"
          }), [
            _cE("view", _uM({
              class: "uni-list-cell",
              "hover-class": "uni-list-cell-hover",
              onClick: () => {goDetail(value, index)}
            }), [
              _cE("view", _uM({ class: "uni-media-list" }), [
                isTrue(unref(isWideScreen))
                  ? _cE("image", _uM({
                      key: 0,
                      class: "uni-media-list-logo",
                      src: value.cover
                    }), null, 8 /* PROPS */, ["src"])
                  : _cE("share-element", _uM({
                      key: 1,
                      "share-key": 'image_'+index
                    }), [
                      _cE("image", _uM({
                        class: "uni-media-list-logo",
                        src: value.cover
                      }), null, 8 /* PROPS */, ["src"])
                    ], 8 /* PROPS */, ["share-key"]),
                _cE("view", _uM({ class: "uni-media-list-body" }), [
                  _cE("text", _uM({ class: "uni-media-list-text-top" }), _tD(value.title), 1 /* TEXT */),
                  _cE("view", _uM({ class: "uni-media-list-text-bottom" }), [
                    _cE("text", _uM({ class: "uni-media-list-text" }), _tD(value.author_name), 1 /* TEXT */),
                    _cE("text", _uM({ class: "uni-media-list-text" }), _tD(value.published_at), 1 /* TEXT */)
                  ])
                ])
              ])
            ], 8 /* PROPS */, ["onClick"])
          ])
        }), 128 /* KEYED_FRAGMENT */)
      ])
    ], 42 /* CLASS, PROPS, NEED_HYDRATION */, ["refresher-triggered"]),
    isTrue(unref(isWideScreen))
      ? _cE("view", _uM({
          key: 0,
          class: "detail-container"
        }), [
          isTrue(unref(post_id) != '' && unref(title) != '' && unref(cover) != '')
            ? _cV(unref(detail), _uM({
                key: unref(post_id),
                post_id: unref(post_id),
                cover: unref(cover),
                title: unref(title),
                isWideScreen: unref(isWideScreen),
                firstDetailContent: unref(currentDetailContent)
              }), null, 8 /* PROPS */, ["post_id", "cover", "title", "isWideScreen", "firstDetailContent"])
            : _cC("v-if", true)
        ])
      : _cC("v-if", true)
  ], 6 /* CLASS, STYLE */)
}
}

})
export default __sfc__
const GenPagesTemplateListNewsListNewsStyles = [_uM([["flex-row", _pS(_uM([["flexDirection", "row"]]))], ["list-container", _pS(_uM([["width", "100%"], ["backgroundColor", "var(--list-background-color,#ffffff)"], ["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"]]))], ["list-narrow", _pS(_uM([["width", 100]]))], ["th-item", _pS(_uM([["width", "100%"], ["height", 44], ["backgroundColor", "var(--list-background-color,#ffffff)"], ["flexDirection", "row"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["th-item-text", _pS(_uM([["marginRight", 20], ["color", "var(--text-color,#333333)"]]))], ["detail-container", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["minWidth", 0], ["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["backgroundColor", "var(--background-color,#f8f8f8)"]]))], ["banner", _pS(_uM([["height", 180], ["overflow", "hidden"], ["position", "relative"], ["backgroundColor", "var(--background-color,#f8f8f8)"]]))], ["banner-img", _pS(_uM([["width", "100%"]]))], ["banner-title", _pS(_uM([["maxHeight", 42], ["overflow", "hidden"], ["position", "absolute"], ["left", 15], ["bottom", 15], ["width", "90%"], ["fontSize", 16], ["fontWeight", "400"], ["lineHeight", "21px"], ["color", "#FFFFFF"]]))], ["uni-media-list", _pS(_uM([["paddingTop", 11], ["paddingRight", 15], ["paddingBottom", 11], ["paddingLeft", 15], ["boxSizing", "border-box"], ["display", "flex"], ["width", "100%"], ["flexDirection", "row"]]))], ["uni-media-list-logo", _pS(_uM([["width", 90], ["height", 70]]))], ["uni-media-list-body", _pS(_uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["paddingLeft", 7], ["justifyContent", "space-around"]]))], ["uni-media-list-text-top", _pS(_uM([["fontSize", 14], ["lines", 2], ["overflow", "hidden"], ["color", "var(--text-color,#333333)"]]))], ["uni-media-list-text-bottom", _pS(_uM([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"]]))], ["uni-media-list-text", _pS(_uM([["color", "#9D9D9F"], ["fontSize", 13]]))]])]
