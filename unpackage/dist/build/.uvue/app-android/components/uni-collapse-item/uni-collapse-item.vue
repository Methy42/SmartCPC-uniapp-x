import { ItemChildType } from '../uni-collapse/item.type.uts';
const __sfc__ = defineComponent({
    __name: 'uni-collapse-item',
    name: "UniCollapseItem",
    props: {
        title: { type: String, default: '' },
        open: { type: Boolean, default: false },
        disabled: { type: Boolean, default: false }
    },
    setup(__props, __setupCtx: SetupContext) {
        const __expose = __setupCtx.expose;
        const __ins = getCurrentInstance()!;
        const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
        const _cache = __ins.renderCache;
        const props = __props;
        let height = 0;
        let is_open = ref<boolean>(props.open);
        let box_is_open = ref<boolean>(props.open);
        let boxRef = ref<UniViewElement | null>(null);
        let contentRef = ref<UniViewElement | null>(null);
        let openType = computed((): boolean => props.open);
        // 组件唯一ID
        const elId = ref(`uni_collapse_item_${Math.ceil(Math.random() * 10e5).toString(36)}`);
        const registerChild = inject<((child: ItemChildType) => string) | null>('uni-collapse-register-child', null);
        const collapseToggle = inject<((elId: string) => string) | null>('k-collapse-child-toggle', null);
        function openOrClose(open: boolean) {
            setTimeout(() => {
                box_is_open.value = !box_is_open.value;
            }, 10);
            const bNode = boxRef.value?.style!;
            const cNode = contentRef.value?.style!;
            let hide = open ? 'flex' : 'none';
            const opacity = open ? "1" : "0";
            let ani_transform = open ? 'translateY(0)' : 'translateY(-100%)';
            bNode.setProperty('display', hide);
            nextTick(() => {
                setTimeout(() => {
                    cNode.setProperty('transform', ani_transform);
                    cNode.setProperty('opacity', opacity);
                }, 10);
            });
        }
        // 开启或关闭折叠面板
        function openCollapse(open: boolean) {
            if (props.disabled)
                return;
            // 关闭其他已打开
            if (collapseToggle != null) {
                collapseToggle(elId.value);
            }
            is_open.value = open;
            openOrClose(open);
        }
        onMounted(() => {
            if (registerChild != null) {
                const child: ItemChildType = {
                    is_open,
                    elId: elId.value,
                    openOrClose
                };
                registerChild(child);
            }
        });
        watch(openType, (value: boolean) => {
            if (boxRef.value != null) {
                openCollapse(value);
            }
        });
        __expose({
            is_open,
            openOrClose,
            openCollapse
        });
        return (): any | null => {
            return _cE("view", _uM({ class: "uni-collapse-item" }), [
                _cE("view", _uM({
                    class: "uni-collapse-item__title",
                    onClick: () => { openCollapse(!unref(is_open)); }
                }), [
                    _cE("text", _uM({
                        class: _nC(["uni-collapse-item__title-text", _uM({ 'is-disabled': _ctx.disabled, 'open--active': unref(is_open) })])
                    }), _tD(_ctx.title), 3 /* TEXT, CLASS */),
                    _cE("view", _uM({
                        class: _nC(["down_arrow", _uM({ 'down_arrow--active': unref(is_open) })])
                    }), null, 2 /* CLASS */)
                ], 8 /* PROPS */, ["onClick"]),
                _cE("view", _uM({
                    ref_key: "boxRef",
                    ref: boxRef,
                    class: _nC(["uni-collapse-item__content", _uM({ 'box-open--active': unref(is_open) })])
                }), [
                    _cE("view", _uM({
                        ref_key: "contentRef",
                        ref: contentRef,
                        class: _nC(["uni-collapse-item__content-box", _uM({ 'content-open--active': unref(box_is_open) })])
                    }), [
                        renderSlot(_ctx.$slots, "default")
                    ], 2 /* CLASS */)
                ], 2 /* CLASS */)
            ]);
        };
    }
});
export default __sfc__;
export type UniCollapseItemComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsUniCollapseItemUniCollapseItemStyles = [_uM([["uni-collapse-item__title", _uM([[".uni-collapse-item ", _uM([["flexDirection", "row"], ["alignItems", "center"], ["paddingTop", 12], ["paddingRight", 18], ["paddingBottom", 12], ["paddingLeft", 18], ["backgroundColor", "#ffffff"]])]])], ["down_arrow", _uM([[".uni-collapse-item ", _uM([["width", 8], ["height", 8], ["transform", "rotate(45deg)"], ["borderRightWidth", 1], ["borderRightStyle", "solid"], ["borderRightColor", "#999999"], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "#999999"], ["marginTop", -3], ["transitionProperty", "transform"], ["transitionDuration", "0.2s"]])]])], ["down_arrow--active", _uM([[".uni-collapse-item ", _uM([["transform", "rotate(-135deg)"], ["marginTop", 0]])]])], ["uni-collapse-item__title-text", _uM([[".uni-collapse-item ", _uM([["flexGrow", 1], ["flexShrink", 1], ["flexBasis", "0%"], ["color", "#000000"], ["fontSize", 14], ["fontWeight", "400"]])]])], ["open--active", _uM([[".uni-collapse-item ", _uM([["color", "#bbbbbb"]])]])], ["is-disabled", _uM([[".uni-collapse-item ", _uM([["color", "#999999"]])]])], ["uni-collapse-item__content", _uM([[".uni-collapse-item ", _uM([["display", "none"], ["position", "relative"], ["overflow", "hidden"]])]])], ["box-open--active", _uM([[".uni-collapse-item ", _uM([["display", "flex"]])]])], ["uni-collapse-item__content-box", _uM([[".uni-collapse-item ", _uM([["width", "100%"], ["transitionProperty", "transform,opacity"], ["transitionDuration", "0.2s"], ["transform", "translateY(-100%)"], ["opacity", 0]])]])], ["content-open--active", _uM([[".uni-collapse-item ", _uM([["transform", "translateY(0%)"], ["opacity", 1]])]])], ["@TRANSITION", _uM([["down_arrow", _uM([["property", "transform"], ["duration", "0.2s"]])], ["uni-collapse-item__content-box", _uM([["property", "transform,opacity"], ["duration", "0.2s"]])]])]])];
