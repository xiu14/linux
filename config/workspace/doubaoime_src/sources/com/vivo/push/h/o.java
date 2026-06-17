package com.vivo.push.h;

/* loaded from: classes2.dex */
public final class o extends ab {
    o(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.l lVar = (com.vivo.push.b.l) vVar;
        int e2 = lVar.e();
        int f2 = lVar.f();
        com.vivo.push.util.ad.c().a("key_dispatch_environment", e2);
        com.vivo.push.util.ad.c().a("key_dispatch_area", f2);
        com.vivo.push.util.t.d("OnDispatcherReceiveTask", "environment  and area=" + e2 + "  ; " + f2);
    }
}
