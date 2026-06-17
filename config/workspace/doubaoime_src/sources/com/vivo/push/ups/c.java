package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* loaded from: classes2.dex */
final class c implements IPushActionListener {
    final /* synthetic */ UPSTurnCallback a;
    final /* synthetic */ VUpsManager b;

    c(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.b = vUpsManager;
        this.a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.a.onResult(new CodeResult(i));
    }
}
