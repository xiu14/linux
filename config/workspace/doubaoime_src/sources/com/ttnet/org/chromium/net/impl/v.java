package com.ttnet.org.chromium.net.impl;

import android.util.Log;
import com.ttnet.org.chromium.net.impl.C0772l;

/* loaded from: classes2.dex */
class v implements Runnable {
    final /* synthetic */ com.ttnet.org.chromium.net.G a;
    final /* synthetic */ C0772l.f b;

    v(C0772l.f fVar, com.ttnet.org.chromium.net.G g2) {
        this.b = fVar;
        this.a = g2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0772l.f fVar = this.b;
            fVar.a.f(fVar.f8751d, this.a);
            C0772l.f.a(this.b);
        } catch (Exception e2) {
            Log.e(C0772l.r, "Exception in onSucceeded method", e2);
        }
    }
}
