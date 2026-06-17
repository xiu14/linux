package com.bytedance.crash.crash;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ com.bytedance.crash.monitor.a b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f4570c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f4571d;

    b(c cVar, List list, com.bytedance.crash.monitor.a aVar, List list2) {
        this.f4571d = cVar;
        this.a = list;
        this.b = aVar;
        this.f4570c = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.a.size(); i++) {
            this.f4571d.f((CrashSummary) this.a.get(i), this.b, (File) this.f4570c.get(i));
        }
    }
}
