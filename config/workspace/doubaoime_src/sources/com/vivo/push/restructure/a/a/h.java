package com.vivo.push.restructure.a.a;

import android.content.Context;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class h extends a<com.vivo.push.restructure.a.a> {
    public h(com.vivo.push.restructure.a.a aVar, j jVar) {
        super("InitNode", aVar, jVar);
    }

    @Override // com.vivo.push.restructure.a.a.a
    protected final /* synthetic */ int a(com.vivo.push.restructure.a.a aVar) {
        Context b = com.vivo.push.restructure.a.a().b();
        com.vivo.push.m.a().a(b);
        t.d("InitNode", "PushMessageReceiver " + b.getPackageName() + " ; requestId = " + aVar.c());
        return 0;
    }
}
