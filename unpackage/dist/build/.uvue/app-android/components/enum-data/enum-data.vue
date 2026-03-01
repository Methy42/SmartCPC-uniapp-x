import { ItemType } from './enum-data-types';
import { state } from '@/store/index.uts';
const __sfc__ = defineComponent({
    __name: 'enum-data',
    props: {
        title: {
            type: String,
            default: ''
        },
        items: {
            type: Array as PropType<Array<ItemType>>,
            required: true
        }
    },
    emits: ['change'],
    setup(__props) {
        const __ins = getCurrentInstance()!;
        const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
        const _cache = __ins.renderCache;
        function emit(event: string, ...do_not_transform_spread: Array<any | null>) {
            __ins.emit(event, ...do_not_transform_spread);
        }
        const props = __props;
        const isDarkMode = computed((): boolean => state.isDarkMode);
        const current = ref(0);
        // @ts-ignore
        function _change(e: RadioGroupChangeEvent) {
            const selected = props.items.find((item: ItemType): boolean => {
                return item.value.toString(10) == e.detail.value;
            });
            if (selected != null) {
                emit('change', selected.value);
                uni.showToast({
                    icon: 'none',
                    title: '当前选中:' + selected.name,
                });
            }
        }
        return (): any | null => {
            const _component_radio = resolveComponent("radio");
            const _component_radio_group = resolveComponent("radio-group");
            return _cE(Fragment, null, [
                _cE("view", _uM({
                    class: _nC(["uni-padding-wrap", unref(isDarkMode) ? 'theme-dark' : 'theme-light'])
                }), [
                    _cE("view", _uM({ class: "uni-title uni-common-mt" }), [
                        _cE("text", _uM({ class: "uni-title-text" }), _tD(_ctx.title), 1 /* TEXT */)
                    ])
                ], 2 /* CLASS */),
                _cE("view", _uM({
                    class: _nC(["uni-list uni-common-pl", unref(isDarkMode) ? 'theme-dark' : 'theme-light'])
                }), [
                    _cV(_component_radio_group, _uM({ onChange: _change }), _uM({
                        default: withSlotCtx((): any[] => [
                            _cE(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
                                return _cV(_component_radio, _uM({
                                    class: _nC(["uni-list-cell uni-list-cell-pd", index < _ctx.items.length - 1 ? 'uni-list-cell-line' : '']),
                                    key: item.name,
                                    value: item.value + '',
                                    color: unref(isDarkMode) ? '#a8a8b7' : '#007AFF'
                                }), _uM({
                                    default: withSlotCtx((): any[] => [
                                        _cE("text", _uM({ class: "radio-text" }), _tD(item.name), 1 /* TEXT */)
                                    ]),
                                    _: 2 /* DYNAMIC */
                                }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "color"]);
                            }), 128 /* KEYED_FRAGMENT */)
                        ]),
                        _: 1 /* STABLE */
                    }))
                ], 2 /* CLASS */)
            ], 64 /* STABLE_FRAGMENT */);
        };
    }
});
export default __sfc__;
export type EnumDataComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsEnumDataEnumDataStyles = [_uM([["radio-text", _uM([[".uni-list ", _uM([["color", "var(--text-color, #333333)"]])]])]])];
