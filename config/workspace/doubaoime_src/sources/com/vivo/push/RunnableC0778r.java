package com.vivo.push;

import com.vivo.push.m;

/* renamed from: com.vivo.push.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC0778r implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ m b;

    RunnableC0778r(m mVar, String str) {
        this.b = mVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a b;
        b = this.b.b(this.a);
        if (b != null) {
            b.a(1003, new Object[0]);
        }
    }
}
