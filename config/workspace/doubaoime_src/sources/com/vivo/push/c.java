package com.vivo.push;

/* loaded from: classes2.dex */
final class c implements Runnable {
    final /* synthetic */ IPushActionListener a;
    final /* synthetic */ a b;

    c(a aVar, IPushActionListener iPushActionListener) {
        this.b = aVar;
        this.a = iPushActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a = com.vivo.push.restructure.a.a().h().a();
        IPushActionListener iPushActionListener = this.a;
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(a);
        }
    }
}
