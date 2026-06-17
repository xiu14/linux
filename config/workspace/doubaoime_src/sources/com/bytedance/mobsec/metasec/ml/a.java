package com.bytedance.mobsec.metasec.ml;

import android.content.Context;

/* loaded from: classes.dex */
public class a {
    public static synchronized c a(String str) {
        c cVar;
        synchronized (a.class) {
            com.bytedance.mobsec.metasec.core.d a = com.bytedance.mobsec.metasec.core.e.a(str);
            cVar = a != null ? new c(a) : null;
        }
        return cVar;
    }

    public static synchronized boolean b(Context context, b bVar) {
        boolean c2;
        synchronized (a.class) {
            c2 = com.bytedance.mobsec.metasec.core.e.c(context, bVar.c());
        }
        return c2;
    }
}
