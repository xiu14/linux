package com.bytedance.android.input.basic.thread;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.input.basic.thread.f.l;
import java.util.concurrent.ExecutorService;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class a {
    private static final kotlin.e a = kotlin.a.c(C0061a.a);
    public static final /* synthetic */ int b = 0;

    /* renamed from: com.bytedance.android.input.basic.thread.a$a, reason: collision with other inner class name */
    static final class C0061a extends m implements kotlin.s.b.a<Handler> {
        public static final C0061a a = new C0061a();

        C0061a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final ExecutorService a() {
        return l.a.g();
    }

    public static void b(Runnable runnable, long j, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        kotlin.s.c.l.f(runnable, "task");
        if (j <= 0) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
                return;
            }
        }
        if (j <= 0) {
            ((Handler) a.getValue()).post(runnable);
        } else {
            ((Handler) a.getValue()).postDelayed(runnable, j);
        }
    }
}
