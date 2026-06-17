package com.bytedance.android.input.basic.a;

import com.bytedance.android.input.basic.IAppGlobals;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e {
    public static final void a(String str, kotlin.s.b.a<String> aVar) {
        l.f(str, "tag");
        l.f(aVar, "msg");
        IAppGlobals.a aVar2 = IAppGlobals.a;
        if (d.a.b.a.h(aVar2)) {
            aVar2.j(str, aVar.invoke());
        }
    }
}
