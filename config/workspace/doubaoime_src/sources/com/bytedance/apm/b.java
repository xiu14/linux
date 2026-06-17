package com.bytedance.apm;

import android.content.Context;
import com.bytedance.apm.internal.ApmDelegate;

/* loaded from: classes.dex */
public class b {

    class a implements Runnable {
        a(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.c.m("Apm#init", "Apm init");
        }
    }

    /* renamed from: com.bytedance.apm.b$b, reason: collision with other inner class name */
    class RunnableC0111b implements Runnable {
        RunnableC0111b(b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.c.m("Apm#start", "Apm start");
        }
    }

    private static class c {
        private static final b a = new b(null);
    }

    b(com.bytedance.apm.a aVar) {
    }

    public static b a() {
        return c.a;
    }

    public void b(Context context, com.bytedance.apm.config.b bVar) {
        ApmDelegate.i().m(context, bVar);
        if (g.D()) {
            com.bytedance.apm.F.d.a().b(new a(this));
        }
    }

    public void c(com.bytedance.apm.config.c cVar) {
        ApmDelegate.i().q(cVar);
        if (g.D()) {
            com.bytedance.apm.F.d.a().b(new RunnableC0111b(this));
        }
    }
}
