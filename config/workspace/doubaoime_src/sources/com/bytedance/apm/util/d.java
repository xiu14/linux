package com.bytedance.apm.util;

/* loaded from: classes.dex */
class d implements Runnable {
    final /* synthetic */ Throwable a;

    d(e eVar, Throwable th) {
        this.a = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.apm.n.e().b(this.a, "apm_error");
    }
}
