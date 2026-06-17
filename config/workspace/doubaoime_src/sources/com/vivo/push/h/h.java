package com.vivo.push.h;

/* loaded from: classes2.dex */
final class h extends ab {
    h(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.i iVar = (com.vivo.push.b.i) vVar;
        String f2 = iVar.f();
        com.vivo.push.util.t.d("OnBindTask", "doTask,订阅APP结果 = " + iVar.j() + " clientToken= " + f2);
        com.vivo.push.m.a().a(iVar.i(), iVar.j(), f2);
        com.vivo.push.t.a(new i(this, f2, iVar));
    }
}
