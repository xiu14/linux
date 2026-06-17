package com.bytedance.push;

import android.content.Context;

/* renamed from: com.bytedance.push.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC0683g implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ com.bytedance.push.interfaze.u b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f5695c;

    RunnableC0683g(l lVar, Context context, com.bytedance.push.interfaze.u uVar) {
        this.f5695c = lVar;
        this.a = context;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (l.f5730e == null) {
            com.bytedance.push.settings.w.j unused = l.f5730e = com.ss.android.pushmanager.setting.c.c().g().H();
        }
        if (l.f5730e.f5866e || l.f5730e.f5867f) {
            boolean z = l.f5730e.f5864c;
            boolean z2 = l.f5730e.b;
            if (z || z2) {
                int i = (z ? 2 : 0) + (z2 ? 1 : 0);
                com.bytedance.push.g0.f.c("Polling", "start to register foreground listener");
                l.c(this.f5695c, this.a, this.b, i);
            }
        }
    }
}
