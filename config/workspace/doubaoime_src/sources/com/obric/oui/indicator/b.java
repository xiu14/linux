package com.obric.oui.indicator;

/* loaded from: classes2.dex */
final class b implements Runnable {
    final /* synthetic */ OBaseIndicator a;

    b(OBaseIndicator oBaseIndicator) {
        this.a = oBaseIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.a.w()) {
            this.a.E();
        }
        z = this.a.f7828d;
        if (z) {
            this.a.B();
        }
        z2 = this.a.f7829e;
        if (z2) {
            this.a.D();
        }
        z3 = this.a.f7830f;
        if (z3) {
            this.a.C();
        }
    }
}
