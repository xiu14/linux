package com.bytedance.android.input.keyboard.utils;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.DoubleSpellType;
import com.bytedance.android.input.constants.KeyboardInputMode;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    public static final DoubleSpellType a() {
        DoubleSpellType doubleSpellType;
        Object g2 = SettingsConfigNext.g(d(), DoubleSpellType.DEFAULT.getDoubleSpellName());
        l.d(g2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) g2;
        Objects.requireNonNull(DoubleSpellType.Companion);
        l.f(str, "doubleSpellName");
        DoubleSpellType[] values = DoubleSpellType.values();
        int i = 0;
        while (true) {
            if (i >= 3) {
                doubleSpellType = null;
                break;
            }
            doubleSpellType = values[i];
            if (l.a(doubleSpellType.getDoubleSpellName(), str)) {
                break;
            }
            i++;
        }
        return doubleSpellType == null ? DoubleSpellType.DEFAULT : doubleSpellType;
    }

    public static final KeyboardInputMode b() {
        return c(KeyboardInputMode.PY9.getInputModeValue());
    }

    public static final KeyboardInputMode c(int i) {
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(i));
        l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
        return KeyboardInputMode.Companion.a(intValue);
    }

    public static final String d() {
        return e.a.a.a.a.e(IAppGlobals.a, C0838R.string.key_double_spell_select, "IAppGlobals.context.getS….key_double_spell_select)");
    }
}
