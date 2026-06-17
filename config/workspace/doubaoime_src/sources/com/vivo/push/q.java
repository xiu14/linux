package com.vivo.push;

/* loaded from: classes2.dex */
final class q implements Runnable {
    final /* synthetic */ com.vivo.push.b.b a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f8858c;

    q(m mVar, com.vivo.push.b.b bVar, String str) {
        this.f8858c = mVar;
        this.a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8858c.a(this.a);
        this.f8858c.c(this.b);
    }
}
