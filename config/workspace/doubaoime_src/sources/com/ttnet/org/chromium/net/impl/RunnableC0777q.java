package com.ttnet.org.chromium.net.impl;

/* renamed from: com.ttnet.org.chromium.net.impl.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC0777q implements Runnable {
    final /* synthetic */ y a;
    final /* synthetic */ C0772l b;

    RunnableC0777q(C0772l c0772l, y yVar) {
        this.b = c0772l;
        this.a = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            C0772l.U(this.b, th);
        }
    }
}
