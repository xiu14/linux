package com.bytedance.crash;

import java.util.Map;

/* loaded from: classes.dex */
final class H implements Runnable {
    final /* synthetic */ Map a;

    H(Map map) {
        this.a = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar;
        String str;
        try {
            I.a();
            for (String str2 : this.a.keySet()) {
                tVar = I.a;
                str = I.b;
                tVar.c(str, str2, (String) this.a.get(str2));
            }
        } catch (Throwable unused) {
        }
    }
}
