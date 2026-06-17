package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.impl.C0772l;
import java.net.URI;

/* renamed from: com.ttnet.org.chromium.net.impl.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC0775o implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ C0772l b;

    /* renamed from: com.ttnet.org.chromium.net.impl.o$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0772l.f fVar;
            fVar = RunnableC0775o.this.b.a;
            fVar.c(new r(fVar, RunnableC0775o.this.b.n, RunnableC0775o.this.b.o));
        }
    }

    RunnableC0775o(C0772l c0772l, String str) {
        this.b = c0772l;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0772l c0772l = this.b;
        c0772l.o = URI.create(c0772l.l).resolve(this.a).toString();
        this.b.f8747e.add(this.b.o);
        this.b.g0(2, 3, new a());
    }
}
