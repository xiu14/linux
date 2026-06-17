package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class f implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ IPushRequestCallback b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f8814c;

    f(d dVar, String str, IPushRequestCallback iPushRequestCallback) {
        this.f8814c = dVar;
        this.a = str;
        this.b = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.b("delete profileId");
        d.a(this.f8814c, this.a, this.b, 2);
    }
}
