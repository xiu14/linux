package com.bytedance.push;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes2.dex */
public class l implements com.bytedance.push.interfaze.j {

    /* renamed from: d, reason: collision with root package name */
    private static int f5729d;

    /* renamed from: e, reason: collision with root package name */
    private static com.bytedance.push.settings.w.j f5730e;
    private a a;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f5731c = null;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements Runnable {
        private final com.bytedance.push.interfaze.u a;
        private final Context b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5732c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5733d = false;

        a(com.bytedance.push.interfaze.u uVar, Context context, long j) {
            this.a = uVar;
            this.b = context;
            this.f5732c = j;
        }

        void a(boolean z) {
            this.f5733d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.f5730e == null) {
                com.bytedance.push.settings.w.j unused = l.f5730e = com.ss.android.pushmanager.setting.c.c().g().H();
            }
            if (this.f5733d) {
                com.bytedance.push.g0.f.c("Polling", "Polling is cancelled");
                return;
            }
            try {
                try {
                    com.bytedance.push.g0.f.c("Polling", "polling to report switch status");
                    if (l.f5730e.f5866e) {
                        ((com.bytedance.push.notification.l) ((C) this.a).l()).i(this.b, "pollingAction");
                    }
                    if (this.f5733d) {
                        return;
                    }
                } catch (Exception e2) {
                    com.bytedance.push.g0.f.f("Polling", "Polling failed", e2);
                    if (this.f5733d) {
                        return;
                    }
                }
                com.ss.android.message.e.e().f(this, this.f5732c);
            } catch (Throwable th) {
                if (!this.f5733d) {
                    com.ss.android.message.e.e().f(this, this.f5732c);
                }
                throw th;
            }
        }
    }

    static void c(l lVar, Context context, com.bytedance.push.interfaze.u uVar, int i) {
        Objects.requireNonNull(lVar);
        f5729d = i;
        com.bytedance.push.helper.d.c().a(new C0684h(lVar, context, uVar));
        com.bytedance.common.push.b.e().addObserver(new C0685i(lVar, context, uVar));
    }

    static /* synthetic */ a j(l lVar, a aVar) {
        lVar.a = null;
        return null;
    }

    static void k(l lVar, Context context, com.bytedance.push.interfaze.u uVar, long j) {
        a aVar = lVar.a;
        if (aVar != null) {
            aVar.a(true);
            lVar.a = null;
        }
        lVar.a = new a(uVar, context, j);
        com.ss.android.message.e.e().f(lVar.a, 0L);
    }
}
