package com.vivo.push.restructure.a.a;

import com.vivo.push.PushClient;

/* loaded from: classes2.dex */
final class f implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f8869c;

    f(e eVar, int i, String str) {
        this.f8869c = eVar;
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 3) {
            PushClient.getInstance(com.vivo.push.restructure.a.a().b()).unBindAlias(this.b, null);
        } else if (i == 4) {
            PushClient.getInstance(com.vivo.push.restructure.a.a().b()).delTopic(this.b, null);
        }
    }
}
