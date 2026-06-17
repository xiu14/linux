package com.bytedance.apm.B.j;

import com.bytedance.apm.g;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ com.bytedance.apm.B.j.g.b a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f3259c;

    b(e eVar, com.bytedance.apm.B.j.g.b bVar, String str) {
        this.f3259c = eVar;
        this.a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.apm.config.a aVar;
        try {
            e.d(this.f3259c);
            if (e.e(this.f3259c, this.a)) {
                if (g.B()) {
                    com.bytedance.apm.y.d.b("DetectActivityLeakTask", "No Leak First Check:" + this.b);
                    return;
                }
                return;
            }
            aVar = this.f3259c.f3262d;
            if (!aVar.d()) {
                e.h(this.f3259c, this.a, this.b);
                return;
            }
            e.g(this.f3259c);
            e.d(this.f3259c);
            if (!e.e(this.f3259c, this.a)) {
                e.h(this.f3259c, this.a, this.b);
            } else if (g.B()) {
                com.bytedance.apm.y.d.b("DetectActivityLeakTask", "No Leak:" + this.b);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
