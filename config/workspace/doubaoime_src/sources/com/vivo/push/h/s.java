package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class s implements Runnable {
    final /* synthetic */ com.vivo.push.b.n a;
    final /* synthetic */ r b;

    s(r rVar, com.vivo.push.b.n nVar) {
        this.b = rVar;
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        r rVar = this.b;
        PushMessageCallback pushMessageCallback = ((ab) rVar).b;
        context = ((com.vivo.push.s) rVar).a;
        pushMessageCallback.onLog(context, this.a.e(), this.a.f(), this.a.g());
    }
}
