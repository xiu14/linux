package com.bytedance.android.input.k.a;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.lego.init.InitScheduler;

/* loaded from: classes.dex */
public final class a {
    private static boolean a;

    public static final boolean a() {
        return a;
    }

    public static final void b(boolean z) {
        a = z;
    }

    public static final void c() {
        IAppGlobals.a.j("init_task", "switchPrivacyPopupWindowState");
        a = false;
        InitScheduler.afterPrivacyPopupWindow();
    }
}
