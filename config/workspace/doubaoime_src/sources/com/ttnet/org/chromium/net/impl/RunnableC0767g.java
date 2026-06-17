package com.ttnet.org.chromium.net.impl;

/* renamed from: com.ttnet.org.chromium.net.impl.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC0767g implements Runnable {
    final /* synthetic */ com.ttnet.org.chromium.net.u a;
    final /* synthetic */ CronetUrlRequest b;

    RunnableC0767g(CronetUrlRequest cronetUrlRequest, com.ttnet.org.chromium.net.u uVar) {
        this.b = cronetUrlRequest;
        this.a = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        O o;
        o = this.b.w;
        o.b(this.a);
    }
}
