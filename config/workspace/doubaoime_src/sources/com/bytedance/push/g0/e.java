package com.bytedance.push.g0;

import android.content.Context;
import com.ss.android.c.a;
import com.ss.android.c.d;

/* loaded from: classes2.dex */
final class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    e(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.j jVar;
        jVar = f.f5705f;
        if (jVar == null) {
            a.j unused = f.f5705f = com.ss.android.c.a.f(this.a, new d.b(this.b).a());
        }
    }
}
