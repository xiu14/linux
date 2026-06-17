package com.vivo.push.h;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class g implements Runnable {
    final /* synthetic */ UPSNotificationMessage a;
    final /* synthetic */ e b;

    g(e eVar, UPSNotificationMessage uPSNotificationMessage) {
        this.b = eVar;
        this.a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        e eVar = this.b;
        PushMessageCallback pushMessageCallback = ((ab) eVar).b;
        context = ((com.vivo.push.s) eVar).a;
        pushMessageCallback.onNotificationMessageClicked(context, this.a);
    }
}
