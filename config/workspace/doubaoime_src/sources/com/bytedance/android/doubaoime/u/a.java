package com.bytedance.android.doubaoime.u;

import com.bytedance.android.input.basic.IAppGlobals;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a implements com.bytedance.android.input.basic.thread.c {
    public static final a a = new a();

    private a() {
    }

    @Override // com.bytedance.android.input.basic.thread.c
    public void d(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        l.f(str, "tag");
        l.f(str2, "msg");
        IAppGlobals.a.j(str, str2);
    }

    @Override // com.bytedance.android.input.basic.thread.c
    public void w(String str, String str2) {
        l.f(str, "tag");
        l.f(str2, "msg");
        l.f(str, "tag");
        l.f(str2, "msg");
        IAppGlobals.a.L(str, str2);
    }
}
