package com.bytedance.push;

/* loaded from: classes2.dex */
class w implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ A b;

    w(A a, boolean z) {
        this.b = a;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0679c c2;
        A a = this.b;
        c2 = a.c();
        A.b(a, c2, this.a);
    }
}
