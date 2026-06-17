package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class aa implements Runnable {
    final /* synthetic */ com.vivo.push.b.s a;
    final /* synthetic */ z b;

    aa(z zVar, com.vivo.push.b.s sVar) {
        this.b = zVar;
        this.a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        z zVar = this.b;
        PushMessageCallback pushMessageCallback = ((ab) zVar).b;
        context = ((com.vivo.push.s) zVar).a;
        pushMessageCallback.onPublish(context, this.a.j(), this.a.i());
    }
}
