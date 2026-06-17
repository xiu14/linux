package com.ss.alive.monitor;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ a b;

    b(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        try {
            synchronized (this.b.j) {
                z = this.b.i;
                if (z) {
                    com.ss.alive.monitor.h.b b = com.ss.alive.monitor.h.a.a(this.b.b).b();
                    com.bytedance.push.g0.f.c("ActivityThreadHandler", "updateLog() called processStartDbInfo = " + b);
                    if (b != null) {
                        b.b = this.a;
                        com.bytedance.push.g0.f.c("ActivityThreadHandler", "updateLog() called update = " + b);
                        boolean e2 = com.ss.alive.monitor.h.a.a(this.b.b).e(b);
                        if (com.bytedance.push.g0.f.d()) {
                            com.bytedance.push.g0.f.c("ActivityThreadHandler", "updateLog: result = " + e2);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
