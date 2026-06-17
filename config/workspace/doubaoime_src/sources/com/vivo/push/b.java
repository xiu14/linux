package com.vivo.push;

import com.vivo.push.listener.IPushQueryActionListener;

/* loaded from: classes2.dex */
final class b implements Runnable {
    final /* synthetic */ IPushQueryActionListener a;
    final /* synthetic */ a b;

    b(a aVar, IPushQueryActionListener iPushQueryActionListener) {
        this.b = aVar;
        this.a = iPushQueryActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String b = com.vivo.push.restructure.a.a().h().b();
        IPushQueryActionListener iPushQueryActionListener = this.a;
        if (iPushQueryActionListener != null) {
            iPushQueryActionListener.onSuccess(b);
        }
    }
}
