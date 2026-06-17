package com.vivo.push;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ah;

/* loaded from: classes2.dex */
final class aa implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ z b;

    aa(z zVar, String str) {
        this.b = zVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context b = com.vivo.push.restructure.a.a().b();
        if (b == null) {
            return;
        }
        long j = m.a().f() ? 506L : 356L;
        if (TextUtils.isEmpty(this.a) || !ah.a(b, b.getPackageName(), this.a, j)) {
            return;
        }
        com.vivo.push.restructure.a.a().e().e();
        this.b.f8941d = "";
    }
}
