package com.ttnet.org.chromium.net.impl;

import android.util.Log;
import com.ttnet.org.chromium.net.AbstractC0760h;
import com.ttnet.org.chromium.net.impl.C0772l;

/* loaded from: classes2.dex */
class w implements Runnable {
    final /* synthetic */ com.ttnet.org.chromium.net.G a;
    final /* synthetic */ AbstractC0760h b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0772l.f f8754c;

    w(C0772l.f fVar, com.ttnet.org.chromium.net.G g2, AbstractC0760h abstractC0760h) {
        this.f8754c = fVar;
        this.a = g2;
        this.b = abstractC0760h;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0772l.f fVar = this.f8754c;
            fVar.a.b(fVar.f8751d, this.a, this.b);
            C0772l.f.a(this.f8754c);
        } catch (Exception e2) {
            Log.e(C0772l.r, "Exception in onFailed method", e2);
        }
    }
}
