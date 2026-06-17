package com.vivo.push.restructure.a.a;

import android.os.SystemClock;

/* loaded from: classes2.dex */
final class g extends a<com.vivo.push.restructure.a.a> {
    private long b;

    public g(com.vivo.push.restructure.a.a aVar, j jVar) {
        super("IPCNode", aVar, jVar);
        this.b = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d2 = aVar.d();
        if (d2 <= 0 || elapsedRealtime <= d2) {
            return;
        }
        this.b = elapsedRealtime - d2;
    }

    @Override // com.vivo.push.restructure.a.a.a
    protected final /* bridge */ /* synthetic */ int a(com.vivo.push.restructure.a.a aVar) {
        return 0;
    }

    @Override // com.vivo.push.restructure.a.a.a
    public final synchronized String b() {
        a(this.b);
        return super.b();
    }
}
