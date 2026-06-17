package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class q implements Runnable {
    final /* synthetic */ com.vivo.push.b.m a;
    final /* synthetic */ p b;

    q(p pVar, com.vivo.push.b.m mVar) {
        this.b = pVar;
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        p pVar = this.b;
        PushMessageCallback pushMessageCallback = ((ab) pVar).b;
        context = ((com.vivo.push.s) pVar).a;
        pushMessageCallback.onListTags(context, this.a.j(), this.a.e(), this.a.i());
    }
}
