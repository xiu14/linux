package com.airbnb.lottie;

/* loaded from: classes.dex */
class p implements Runnable {
    final /* synthetic */ q a;

    p(q qVar) {
        this.a = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o oVar;
        o oVar2;
        oVar = this.a.f1370d;
        if (oVar == null) {
            return;
        }
        oVar2 = this.a.f1370d;
        if (oVar2.b() != null) {
            q.b(this.a, oVar2.b());
        } else {
            q.c(this.a, oVar2.a());
        }
    }
}
