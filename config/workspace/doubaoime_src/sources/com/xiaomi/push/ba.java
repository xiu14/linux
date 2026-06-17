package com.xiaomi.push;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ba {

    /* renamed from: com.xiaomi.push.ba$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Runnable a;

        /* renamed from: a, reason: collision with other field name */
        final /* synthetic */ String f138a;

        @Override // java.lang.Runnable
        public void run() {
            ba.a(this.f138a, this.a);
        }
    }

    private static class a implements Runnable {
        private final bg a;

        /* renamed from: a, reason: collision with other field name */
        private final Runnable f139a;

        /* renamed from: a, reason: collision with other field name */
        private final String f140a;

        /* synthetic */ a(bg bgVar, String str, Runnable runnable, AnonymousClass1 anonymousClass1) {
            this(bgVar, str, runnable);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.f140a);
            this.f139a.run();
            this.a.mo126a();
        }

        private a(bg bgVar, String str, Runnable runnable) {
            this.a = bgVar;
            this.f140a = str;
            this.f139a = runnable;
        }
    }

    public static void a(String str, Runnable runnable) {
        bd a2 = bd.a();
        a2.execute(new a(a2, str, runnable, null));
    }

    public static void b(String str, Runnable runnable) {
        be a2 = be.a();
        a2.execute(new a(a2, str, runnable, null));
    }

    public static void a(String str, Runnable runnable, boolean z) {
        if (z) {
            a(str, runnable);
        } else {
            b(str, runnable);
        }
    }

    public static ScheduledFuture a(String str, Runnable runnable, long j, TimeUnit timeUnit) {
        bf a2 = bf.a();
        return a2.schedule(new a(a2, str, runnable, null), j, timeUnit);
    }
}
