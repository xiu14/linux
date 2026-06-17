package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* loaded from: classes2.dex */
final class a implements IPushActionListener {
    final /* synthetic */ UPSRegisterCallback a;
    final /* synthetic */ VUpsManager b;

    a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.b = vUpsManager;
        this.a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.a.onResult(new TokenResult(i, com.vivo.push.restructure.a.a().h().b()));
    }
}
