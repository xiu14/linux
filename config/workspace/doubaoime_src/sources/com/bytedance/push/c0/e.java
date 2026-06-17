package com.bytedance.push.c0;

/* loaded from: classes2.dex */
class e implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ d b;

    e(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.n(this.a);
    }
}
