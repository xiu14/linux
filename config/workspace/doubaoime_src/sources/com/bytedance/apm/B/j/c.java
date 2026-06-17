package com.bytedance.apm.B.j;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
class c implements Runnable {
    final /* synthetic */ com.bytedance.apm.B.j.g.b a;
    final /* synthetic */ e b;

    c(e eVar, com.bytedance.apm.B.j.g.b bVar) {
        this.b = eVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVar = this.b;
        com.bytedance.apm.B.j.g.b bVar = this.a;
        Objects.requireNonNull(eVar);
        Looper.myQueue().addIdleHandler(new d(eVar, bVar));
    }
}
