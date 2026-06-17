package com.bytedance.lego.init;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ c a;

    b(c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = a.h;
        com.bytedance.lego.init.model.b bVar = this.a.a;
        kotlin.s.c.l.b(bVar, "task");
        a.e(aVar, bVar, true);
    }
}
