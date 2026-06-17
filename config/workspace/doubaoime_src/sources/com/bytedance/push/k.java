package com.bytedance.push;

import android.content.Context;

/* loaded from: classes2.dex */
class k implements Runnable {
    final /* synthetic */ Context a;

    k(l lVar, Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (l.f5730e == null) {
            com.bytedance.push.settings.w.j unused = l.f5730e = com.ss.android.pushmanager.setting.c.c().g().H();
        }
        if (l.f5730e.f5865d) {
            if (l.f5730e.f5866e) {
                ((com.bytedance.push.notification.l) ((C) C.a()).l()).i(this.a, "allianceAction");
            }
            com.bytedance.push.g0.f.c("Polling", "try to sync notice state once");
        }
    }
}
