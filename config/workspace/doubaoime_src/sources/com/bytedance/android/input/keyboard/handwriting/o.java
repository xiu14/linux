package com.bytedance.android.input.keyboard.handwriting;

import android.os.Looper;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.editor.SelectionTracker;

/* loaded from: classes.dex */
public final class o {
    private static com.bytedance.android.input.keyboard.handwriting.r.a a;

    public static final void a(int i, int i2, SelectionTracker.ActionType actionType) {
        com.bytedance.android.input.keyboard.handwriting.r.a aVar;
        kotlin.s.c.l.f(actionType, "action");
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
        kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
        if (KeyboardInputMode.Companion.a(intValue) != KeyboardInputMode.HANDWRITING) {
            int currentKbdType = KeyboardJni.getKeyboardJni().getCurrentKbdType();
            KeyboardJni.InputBoardType inputBoardType = KeyboardJni.InputBoardType.kHandwrite;
            if (currentKbdType != 6) {
                return;
            }
        }
        boolean z = (i == -1 || i2 == -1) ? false : true;
        StringBuilder M = e.a.a.a.a.M("onUpdateSelection is MainThread = ");
        M.append(kotlin.s.c.l.a(Looper.getMainLooper(), Looper.myLooper()));
        M.append(" --hasPreEdit = ");
        M.append(z);
        M.append("---action = ");
        M.append(actionType.name());
        IAppGlobals.a.j("HandWritingManager", M.toString());
        if (actionType != SelectionTracker.ActionType.NOT_INNER || (aVar = a) == null) {
            return;
        }
        aVar.a();
    }

    public static final void b(com.bytedance.android.input.keyboard.handwriting.r.a aVar) {
        a = aVar;
    }

    public static final void c() {
        a = null;
    }
}
