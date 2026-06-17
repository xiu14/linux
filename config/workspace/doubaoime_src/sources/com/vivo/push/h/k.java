package com.vivo.push.h;

/* loaded from: classes2.dex */
final class k extends ab {
    k(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.util.t.d("OnClearCacheTask", "delete push info " + this.a.getPackageName());
        com.vivo.push.util.af.b(this.a).a();
    }
}
