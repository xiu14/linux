package com.bytedance.push;

import android.content.Context;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class x implements Runnable {
    final /* synthetic */ com.bytedance.push.interfaze.u a;
    final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A f5885c;

    x(A a, com.bytedance.push.interfaze.u uVar, Context context) {
        this.f5885c = a;
        this.a = uVar;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.push.settings.w.j H = com.ss.android.pushmanager.setting.c.c().g().H();
        if (H.f5867f) {
            ((com.bytedance.push.notification.l) ((C) this.a).l()).h(this.b);
        }
        if (H.f5866e) {
            ((com.bytedance.push.notification.l) ((C) this.a).l()).i(this.b, "coldStartAction");
        }
        if (((com.bytedance.push.U.a.a) ((C) C.a()).n()).o()) {
            Context context = this.b;
            if (com.ss.android.message.f.a.t(context)) {
                com.ss.android.g.f.a.g(context);
            }
        }
        Objects.requireNonNull(this.f5885c);
        try {
            String h0 = com.ss.android.pushmanager.setting.c.c().e().h0();
            if (com.bytedance.android.input.k.b.a.Y(h0)) {
                return;
            }
            com.bytedance.push.interfaze.w B = C.B();
            new JSONObject(h0);
            Objects.requireNonNull((H) B);
            com.ss.android.pushmanager.setting.c.c().e().t0("");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
