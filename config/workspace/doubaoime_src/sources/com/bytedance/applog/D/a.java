package com.bytedance.applog.D;

/* loaded from: classes.dex */
class a implements Runnable {
    final /* synthetic */ b a;

    a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e a = b.a(this.a);
        if (a != null) {
            this.a.d(a);
        }
        this.a.b();
    }
}
