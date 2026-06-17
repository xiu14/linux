package com.vivo.push.restructure.b;

import android.content.Context;
import com.vivo.push.PushConfig;
import com.vivo.push.util.ah;

/* loaded from: classes2.dex */
final class e implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ PushConfig b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f8878c;

    e(d dVar, Context context, PushConfig pushConfig) {
        this.f8878c = dVar;
        this.a = context;
        this.b = pushConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        ah.a(context, context.getPackageName(), this.b.isAgreePrivacyStatement());
    }
}
