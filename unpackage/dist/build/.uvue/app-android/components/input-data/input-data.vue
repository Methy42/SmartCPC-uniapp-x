type InputValue = string | number;
const __sfc__ = defineComponent({
    __name: 'input-data',
    props: {
        title: {
            type: String,
            required: true
        },
        type: {
            type: String,
            required: true
        },
        defaultValue: {
            type: String,
            required: true,
            default: ''
        }
    },
    emits: ['confirm'],
    setup(__props) {
        const __ins = getCurrentInstance()!;
        const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
        const _cache = __ins.renderCache;
        function emit(event: string, ...do_not_transform_spread: Array<any | null>) {
            __ins.emit(event, ...do_not_transform_spread);
        }
        const props = __props;
        const inputClearValue = ref<InputValue>('');
        const showClearIcon = ref(false);
        const inputType = ref('text');
        function _getValue(value: string | number): InputValue {
            switch (props.type) {
                case 'number':
                    return parseFloat(value as string);
            }
            return value;
        }
        onMounted(() => {
            switch (props.type) {
                case 'number':
                    inputType.value = 'number';
                    break;
            }
            inputClearValue.value = _getValue(props.defaultValue);
        });
        function input(event: InputEvent) {
            // @ts-ignore
            inputClearValue.value = event.detail.value;
            if ((inputClearValue.value as string).length > 0) {
                showClearIcon.value = true;
            }
            else {
                showClearIcon.value = false;
            }
            emit('confirm', _getValue(inputClearValue.value as string));
        }
        function clearIcon() {
            inputClearValue.value = '';
            showClearIcon.value = false;
            emit('confirm', _getValue(inputClearValue.value as string));
        }
        function blur() {
            showClearIcon.value = false;
        }
        function focus() {
            let inputValue = inputClearValue.value;
            if (typeof inputValue !== 'string') {
                inputValue = (inputValue as number).toString();
            }
            if ((inputValue as string).length > 0) {
                showClearIcon.value = true;
            }
            else {
                showClearIcon.value = false;
            }
        }
        return (): any | null => {
            return _cE(Fragment, null, [
                _cE("view", _uM({ class: "uni-padding-wrap" }), [
                    _cE("view", _uM({ class: "uni-title uni-common-mt" }), [
                        _cE("text", _uM({ class: "uni-title-text" }), _tD(_ctx.title), 1 /* TEXT */)
                    ])
                ]),
                _cE("view", _uM({ class: "input-wrapper" }), [
                    _cE("input", _uM({
                        class: "uni-input",
                        type: unref(inputType),
                        value: unref(inputClearValue),
                        placeholder: _ctx.title,
                        maxlength: "-1",
                        onInput: input,
                        onBlur: blur,
                        onFocus: focus
                    }), null, 40 /* PROPS, NEED_HYDRATION */, ["type", "value", "placeholder"]),
                    isTrue(unref(showClearIcon))
                        ? _cE("image", _uM({
                            key: 0,
                            class: "input-wrapper_image",
                            src: "/static/icons/clear.png",
                            onTouchstart: clearIcon
                        }), null, 32 /* NEED_HYDRATION */)
                        : _cC("v-if", true)
                ])
            ], 64 /* STABLE_FRAGMENT */);
        };
    }
});
export default __sfc__;
export type InputDataComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsInputDataInputDataStyles = [_uM([["input-wrapper", _pS(_uM([["borderTopWidth", 1], ["borderRightWidth", 1], ["borderBottomWidth", 1], ["borderLeftWidth", 1], ["borderTopStyle", "solid"], ["borderRightStyle", "solid"], ["borderBottomStyle", "solid"], ["borderLeftStyle", "solid"], ["borderTopColor", "rgba(0,0,0,0.08)"], ["borderRightColor", "rgba(0,0,0,0.08)"], ["borderBottomColor", "rgba(0,0,0,0.08)"], ["borderLeftColor", "rgba(0,0,0,0.08)"], ["flexDirection", "row"], ["justifyContent", "center"], ["paddingTop", 0], ["paddingRight", 0], ["paddingBottom", 0], ["paddingLeft", 0], ["marginTop", 0], ["marginRight", 10], ["marginBottom", 0], ["marginLeft", 10], ["flexWrap", "nowrap"], ["backgroundColor", "#ffffff"]]))], ["input-wrapper_image", _pS(_uM([["width", 22], ["height", 22], ["alignSelf", "center"], ["marginRight", 5]]))]])];
