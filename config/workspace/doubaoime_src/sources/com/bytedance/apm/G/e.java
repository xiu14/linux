package com.bytedance.apm.G;

import com.bytedance.apm.launch.e;
import java.util.Objects;

/* loaded from: classes.dex */
class e implements Runnable {
    final /* synthetic */ e.a a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f3304c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f3305d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f3306e;

    e(g gVar, e.a aVar, int i, String str, String str2) {
        this.f3306e = gVar;
        this.a = aVar;
        this.b = i;
        this.f3304c = str;
        this.f3305d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean h;
        long j;
        h = this.f3306e.h();
        if (h) {
            Objects.requireNonNull(com.bytedance.apm.launch.a.b().c());
        }
        g gVar = this.f3306e;
        int i = this.b;
        String str = this.f3304c;
        String str2 = this.f3305d;
        j = gVar.b;
        g.c(gVar, i, str, str2, j, this.a);
    }
}
