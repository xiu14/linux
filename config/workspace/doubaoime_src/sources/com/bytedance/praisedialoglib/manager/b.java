package com.bytedance.praisedialoglib.manager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.praisedialoglib.manager.a;
import e.b.k.d.a;

/* loaded from: classes.dex */
class b implements a.InterfaceC0441a {
    final /* synthetic */ Context a;
    final /* synthetic */ d b;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            e.b.k.d.a.b = false;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.a));
            intent.setFlags(268435456);
            try {
                a.b.a.K(b.this.a, intent);
                str = b.this.b.f5529c;
                com.bytedance.feedbackerlib.a.r0(str);
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
                b.this.b.l(true);
            }
        }
    }

    /* renamed from: com.bytedance.praisedialoglib.manager.b$b, reason: collision with other inner class name */
    class RunnableC0284b implements Runnable {
        RunnableC0284b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.b.k.d.a.b = false;
            b.this.b.l(true);
        }
    }

    b(d dVar, Context context) {
        this.b = dVar;
        this.a = context;
    }

    @Override // e.b.k.d.a.InterfaceC0441a
    public void a(int i, String str) {
        Handler handler;
        handler = this.b.a;
        handler.post(new RunnableC0284b());
    }

    @Override // e.b.k.d.a.InterfaceC0441a
    public void b(String str) {
        Handler handler;
        handler = this.b.a;
        handler.post(new a(str));
    }
}
