package com.bytedance.crash.monitor;

import com.bytedance.crash.monitor.i;

/* loaded from: classes.dex */
class k implements Runnable {
    final /* synthetic */ i a;

    k(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.d dVar;
        this.a.L();
        dVar = this.a.t;
        dVar.a();
    }
}
