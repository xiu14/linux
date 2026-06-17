package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class h0 implements g0 {
    private final Deque<Runnable> a;
    private final Executor b;

    public h0(Executor executor) {
        Objects.requireNonNull(executor);
        this.b = executor;
        this.a = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public synchronized void a(Runnable runnable) {
        this.a.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public synchronized void b(Runnable runnable) {
        this.b.execute(runnable);
    }
}
