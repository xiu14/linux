package com.huawei.d.a.j;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a {
    public static final a b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f6981c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6982d;
    public final Executor a = new b(null);

    public static class b implements Executor {
        public b(C0344a c0344a) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f6981c = availableProcessors + 1;
        f6982d = (availableProcessors * 2) + 1;
    }
}
