package com.ss.alive.monitor.services.impl;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ com.ss.alive.monitor.model.a a;
    final /* synthetic */ a b;

    b(a aVar, com.ss.alive.monitor.model.a aVar2) {
        this.b = aVar;
        this.a = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.j(this.a);
    }
}
