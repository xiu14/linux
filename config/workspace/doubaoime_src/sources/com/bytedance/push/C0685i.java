package com.bytedance.push;

import android.content.Context;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.bytedance.push.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0685i implements Observer {
    final /* synthetic */ Context a;
    final /* synthetic */ com.bytedance.push.interfaze.u b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f5728c;

    /* renamed from: com.bytedance.push.i$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.f5730e == null) {
                com.bytedance.push.settings.w.j unused = l.f5730e = com.ss.android.pushmanager.setting.c.c().g().H();
            }
            if (l.f5730e.a > 0) {
                C0685i c0685i = C0685i.this;
                l.k(c0685i.f5728c, c0685i.a, c0685i.b, l.f5730e.a * 1000);
            }
        }
    }

    C0685i(l lVar, Context context, com.bytedance.push.interfaze.u uVar) {
        this.f5728c = lVar;
        this.a = context;
        this.b = uVar;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        int i;
        int i2;
        if (((Boolean) obj).booleanValue()) {
            this.f5728c.b = false;
            i = l.f5729d;
            if (i != 1) {
                i2 = l.f5729d;
                if (i2 != 3) {
                    return;
                }
            }
            com.ss.android.message.e.e().f(new a(), 0L);
        }
    }
}
