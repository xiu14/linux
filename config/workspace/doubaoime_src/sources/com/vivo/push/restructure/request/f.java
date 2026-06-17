package com.vivo.push.restructure.request;

/* loaded from: classes2.dex */
final class f implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ e b;

    f(e eVar, b bVar) {
        this.b = eVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.a;
        if (bVar == null || bVar.b() == null) {
            return;
        }
        this.a.b().a(1003);
    }
}
