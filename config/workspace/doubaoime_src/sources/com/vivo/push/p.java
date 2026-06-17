package com.vivo.push;

/* loaded from: classes2.dex */
final class p implements IPushActionListener {
    final /* synthetic */ m a;

    p(m mVar) {
        this.a = mVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i == 0) {
            com.vivo.push.restructure.a.a().h().b("");
        } else {
            com.vivo.push.restructure.a.a().h().c("");
        }
    }
}
