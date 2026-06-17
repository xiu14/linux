package com.bytedance.android.input.keyboard.u.b;

import android.content.Context;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class a implements com.bytedance.android.input.keyboard.u.c.a {
    private final String e() {
        StringBuilder M = e.a.a.a.a.M("[Vibrate]-");
        M.append(i());
        return M.toString();
    }

    protected final boolean c(VibrateKeyType vibrateKeyType, com.bytedance.android.input.keyboard.vibrate.entity.a aVar) {
        l.f(vibrateKeyType, "vibrateKeyType");
        l.f(aVar, "vibrateParams");
        if (!aVar.b()) {
            h("vibrate close");
            return false;
        }
        if (vibrateKeyType != VibrateKeyType.NONE) {
            return a();
        }
        h("vibrate key-type = none");
        return false;
    }

    protected final Context d() {
        return IAppGlobals.a.getContext();
    }

    protected final void f(String str) {
        l.f(str, "msg");
        IAppGlobals.a.j(e(), str);
    }

    protected final void g(String str) {
        l.f(str, "msg");
        IAppGlobals.a.e(e(), str);
    }

    protected final void h(String str) {
        l.f(str, "msg");
        IAppGlobals.a.x(e(), str);
    }

    protected abstract String i();
}
