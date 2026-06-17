package com.bytedance.crash;

import android.content.Context;
import com.bytedance.crash.D;

/* renamed from: com.bytedance.crash.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0651f {
    private static com.bytedance.crash.Y.c a;
    private static com.bytedance.crash.Y.b b;

    /* renamed from: com.bytedance.crash.f$a */
    static class a implements Runnable {
        final /* synthetic */ com.bytedance.crash.monitor.f a;

        a(com.bytedance.crash.monitor.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.bytedance.crash.monitor.b(this.a).c();
        }
    }

    /* renamed from: com.bytedance.crash.f$b */
    static class b implements Runnable {
        final /* synthetic */ com.bytedance.crash.monitor.f a;

        b(com.bytedance.crash.monitor.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.bytedance.crash.monitor.g(this.a).c();
        }
    }

    public static com.bytedance.crash.Y.b a() {
        return b;
    }

    public static com.bytedance.crash.Y.c b() {
        return a;
    }

    public static void c(com.bytedance.crash.Y.b bVar) {
        b = bVar;
    }

    public static void d(com.bytedance.crash.Y.c cVar) {
        a = cVar;
    }

    public static void e(Context context, com.bytedance.crash.monitor.f fVar) {
        D.a.a(context, C0652g.k());
        com.bytedance.crash.runtime.b.d(new a(fVar));
    }

    public static void f(Context context, com.bytedance.crash.monitor.f fVar) {
        D.a.a(context, C0652g.k());
        com.bytedance.crash.runtime.b.d(new b(fVar));
    }
}
