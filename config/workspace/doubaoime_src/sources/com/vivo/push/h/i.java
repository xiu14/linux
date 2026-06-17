package com.vivo.push.h;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes2.dex */
final class i implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ com.vivo.push.b.i b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f8829c;

    i(h hVar, String str, com.vivo.push.b.i iVar) {
        this.f8829c = hVar;
        this.a = str;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        if (!TextUtils.isEmpty(this.a)) {
            h hVar = this.f8829c;
            PushMessageCallback pushMessageCallback = ((ab) hVar).b;
            context2 = ((com.vivo.push.s) hVar).a;
            pushMessageCallback.onReceiveRegId(context2, this.a);
        }
        h hVar2 = this.f8829c;
        PushMessageCallback pushMessageCallback2 = ((ab) hVar2).b;
        context = ((com.vivo.push.s) hVar2).a;
        pushMessageCallback2.onBind(context, this.b.j(), this.b.e());
    }
}
