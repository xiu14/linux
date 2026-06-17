package com.bytedance.crash.L;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class k implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ com.bytedance.crash.monitor.a b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f4431c;

    k(j jVar, List list, com.bytedance.crash.monitor.a aVar) {
        this.f4431c = jVar;
        this.a = list;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (q qVar : this.a) {
            j jVar = this.f4431c;
            com.bytedance.crash.monitor.a aVar = this.b;
            Objects.requireNonNull(jVar);
            qVar.upload(aVar, null);
        }
    }
}
