package com.bytedance.android.input.constants;

import kotlin.s.c.g;

/* loaded from: classes.dex */
public enum KeyboardInputMode {
    PY26(0),
    PY9(1),
    ENGLISH26(2),
    DOUBLE_SPELL(3),
    HANDWRITING(4);

    public static final a Companion = new a(null);
    private final int inputModeValue;

    public static final class a {
        public a(g gVar) {
        }

        public final KeyboardInputMode a(int i) {
            KeyboardInputMode keyboardInputMode;
            KeyboardInputMode[] values = KeyboardInputMode.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    keyboardInputMode = null;
                    break;
                }
                keyboardInputMode = values[i2];
                if (keyboardInputMode.getInputModeValue() == i) {
                    break;
                }
                i2++;
            }
            return keyboardInputMode == null ? KeyboardInputMode.PY9 : keyboardInputMode;
        }
    }

    KeyboardInputMode(int i) {
        this.inputModeValue = i;
    }

    public final int getInputModeValue() {
        return this.inputModeValue;
    }
}
