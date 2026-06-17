package com.bytedance.crash.monitor;

import com.bytedance.crash.monitor.i;

/* loaded from: classes.dex */
class j implements Runnable {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.d dVar;
        this.a.K();
        dVar = this.a.s;
        dVar.a();
    }
}
