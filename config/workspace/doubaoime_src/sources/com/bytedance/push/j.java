package com.bytedance.push;

import android.content.Context;

/* loaded from: classes2.dex */
final class j implements Runnable {
    final /* synthetic */ com.bytedance.push.interfaze.u a;
    final /* synthetic */ Context b;

    j(com.bytedance.push.interfaze.u uVar, Context context) {
        this.a = uVar;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (l.f5730e == null) {
            com.bytedance.push.settings.w.j unused = l.f5730e = com.ss.android.pushmanager.setting.c.c().g().H();
        }
        if (l.f5730e.f5866e) {
            ((com.bytedance.push.notification.l) ((C) this.a).l()).i(this.b, "performForegroundAction");
        }
    }
}
