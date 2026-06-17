package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class ag implements Runnable {
    final /* synthetic */ com.vivo.push.b.i a;
    final /* synthetic */ af b;

    ag(af afVar, com.vivo.push.b.i iVar) {
        this.b = afVar;
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        af afVar = this.b;
        PushMessageCallback pushMessageCallback = ((ab) afVar).b;
        context = ((com.vivo.push.s) afVar).a;
        pushMessageCallback.onUnBind(context, this.a.j(), this.a.e());
    }
}
