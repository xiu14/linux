package com.bytedance.monitor.collector;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ c b;

    b(c cVar, int i) {
        this.b = cVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.b;
        int i = cVar.b;
        if (i > -1 && i == 2) {
            int i2 = cVar.f5423c;
            int i3 = this.a;
            if (i2 != i3) {
                cVar.f5423c = i3;
                cVar.d(i3);
            }
        }
    }
}
