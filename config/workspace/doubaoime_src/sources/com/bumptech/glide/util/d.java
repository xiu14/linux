package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d {
    private static final Executor a = new a();
    private static final Executor b = new b();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            j.k(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return b;
    }

    public static Executor b() {
        return a;
    }
}
