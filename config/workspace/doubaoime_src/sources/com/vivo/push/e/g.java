package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class g implements Runnable {
    final /* synthetic */ IPushRequestCallback a;
    final /* synthetic */ d b;

    g(d dVar, IPushRequestCallback iPushRequestCallback) {
        this.b = dVar;
        this.a = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.b("delete all profileIds");
        d.a(this.b, "", this.a, 3);
    }
}
