package com.vivo.push.h;

import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* loaded from: classes2.dex */
final class f implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Map b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f8828c;

    f(e eVar, Context context, Map map) {
        this.f8828c = eVar;
        this.a = context;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName());
        if (launchIntentForPackage == null) {
            com.vivo.push.util.t.a("NotifyOpenClientTask", "LaunchIntent is null");
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        e.b(launchIntentForPackage, this.b);
        this.a.startActivity(launchIntentForPackage);
    }
}
