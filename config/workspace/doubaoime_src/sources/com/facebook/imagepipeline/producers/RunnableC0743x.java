package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C0745z;
import com.facebook.imagepipeline.producers.M;

/* renamed from: com.facebook.imagepipeline.producers.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC0743x implements Runnable {
    final /* synthetic */ C0745z.a a;
    final /* synthetic */ M.a b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0745z f6671c;

    RunnableC0743x(C0745z c0745z, C0745z.a aVar, M.a aVar2) {
        this.f6671c = c0745z;
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6671c.c(this.a, this.b);
    }
}
