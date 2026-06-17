package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class j implements com.vivo.push.restructure.request.c<com.vivo.push.e.a.b> {
    final /* synthetic */ IPushRequestCallback a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f8815c;

    j(d dVar, IPushRequestCallback iPushRequestCallback, int i) {
        this.f8815c = dVar;
        this.a = iPushRequestCallback;
        this.b = i;
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(com.vivo.push.e.a.b bVar) {
        if (this.a != null) {
            t.b(this.b + " sync success");
            this.a.onSuccess(0);
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.a != null) {
            t.b(this.b + " sync err : " + i);
            this.a.onError(i);
        }
    }
}
