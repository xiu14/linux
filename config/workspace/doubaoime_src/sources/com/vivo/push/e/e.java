package com.vivo.push.e;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
final class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ IPushRequestCallback b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f8813c;

    e(d dVar, String str, IPushRequestCallback iPushRequestCallback) {
        this.f8813c = dVar;
        this.a = str;
        this.b = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.b("add profileId");
        d.a(this.f8813c, this.a, this.b, 1);
    }
}
