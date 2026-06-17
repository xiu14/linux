package com.bytedance.retrofit2;

/* loaded from: classes2.dex */
final class y implements Runnable {
    final /* synthetic */ kotlin.r.d a;
    final /* synthetic */ Exception b;

    y(kotlin.r.d dVar, Exception exc) {
        this.a = dVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.coroutines.intrinsics.a.d(this.a).resumeWith(com.prolificinteractive.materialcalendarview.r.J(this.b));
    }
}
