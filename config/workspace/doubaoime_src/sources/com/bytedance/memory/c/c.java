package com.bytedance.memory.c;

/* loaded from: classes.dex */
class c implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ d b;

    c(d dVar, int i) {
        this.b = dVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.e(this.a);
    }
}
