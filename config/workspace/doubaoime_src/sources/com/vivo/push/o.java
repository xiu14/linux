package com.vivo.push;

/* loaded from: classes2.dex */
final class o implements Runnable {
    final /* synthetic */ com.vivo.push.b.b a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f8857c;

    o(m mVar, com.vivo.push.b.b bVar, String str) {
        this.f8857c = mVar;
        this.a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8857c.a(this.a);
        this.f8857c.c(this.b);
    }
}
