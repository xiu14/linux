package com.bytedance.applog.q;

import java.util.List;

/* loaded from: classes.dex */
class d implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ c b;

    d(c cVar, List list) {
        this.b = cVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.applog.x.b bVar;
        bVar = this.b.f3875d;
        com.bytedance.applog.y.b p = bVar.p(0);
        c.f(this.b, this.a, p, this.b.h().j().b(this.b, true, p));
    }
}
