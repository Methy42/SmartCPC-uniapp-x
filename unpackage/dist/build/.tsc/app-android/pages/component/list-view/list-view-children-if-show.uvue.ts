
type Child = {
	id: string
}
type List = {
	id: string
	children: Child[]
}

const __sfc__ = defineComponent({
	data(){
		return {
			list: [] as List[],
			expandIds: [] as string[],
		}
	},
	onLoad() {
		this.init()
	},
	methods: {
		init(){
			this.list = [
				{id:'1', children: [{ id: '1-1'},{ id: '1-2'},{ id: '1-3'}]},
				{id:'2', children: [{ id: '2-1'},{ id: '2-2'},{ id: '2-3'}]},
				{id:'3', children: [{ id: '3-1'},{ id: '3-2'},{ id: '3-3'}]},
			] as List[]

			this.expandIds = [this.list[0].id]
		},
		clear(){
			this.list = [] as List[]
			this.expandIds = [] as string[]
		},
		toggleChildrenShow(id: string){
			const index = this.expandIds.findIndex((item) => item == id)
			if(index == -1) {
				this.expandIds.push(id)
			} else {
				this.expandIds.splice(index, 1)
			}
		},
	}
})

export default __sfc__
function GenPagesComponentListViewListViewChildrenIfShowRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return _cE("view", _uM({ class: "p-10" }), [
    _cE("button", _uM({
      id: "init-btn",
      class: "uni-btn",
      onClick: _ctx.init
    }), "init", 8 /* PROPS */, ["onClick"]),
    _cE("button", _uM({
      id: "clear-btn",
      class: "uni-btn",
      onClick: _ctx.clear
    }), "clear", 8 /* PROPS */, ["onClick"]),
    _cE("view", _uM({
      class: _nC(["uni-common-mt list-view-container", _uM({ ' p-10': _ctx.list.length > 0 })])
    }), [
      _cE("list-view", null, [
        _cE(Fragment, null, RenderHelpers.renderList(_ctx.list, (item, index, __index, _cached): any => {
          return _cE(Fragment, null, [
            _cE("list-item", _uM({
              id: "toggle-children-show-btn",
              class: _nC(_uM({ 'uni-common-mt': index > 0 })),
              onClick: () => {_ctx.toggleChildrenShow(item.id)}
            }), [
              _cE("text", null, "toggle children isShow")
            ], 10 /* CLASS, PROPS */, ["onClick"]),
            isTrue(_ctx.expandIds.includes(item.id))
              ? _cE(Fragment, _uM({ key: 0 }), RenderHelpers.renderList(item.children, (child, __key, __index, _cached): any => {
                  return _cE("list-item", _uM({
                    id: "list-item-child",
                    class: "mt-5"
                  }), [
                    _cE("text", null, _tD(child.id), 1 /* TEXT */)
                  ])
                }), 256 /* UNKEYED_FRAGMENT */)
              : _cC("v-if", true)
          ], 64 /* STABLE_FRAGMENT */)
        }), 256 /* UNKEYED_FRAGMENT */)
      ])
    ], 2 /* CLASS */)
  ])
}
const GenPagesComponentListViewListViewChildrenIfShowStyles = [_uM([["p-10", _pS(_uM([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["list-view-container", _pS(_uM([["backgroundColor", "#ffffff"]]))], ["mt-5", _pS(_uM([["marginTop", 5]]))]])]
