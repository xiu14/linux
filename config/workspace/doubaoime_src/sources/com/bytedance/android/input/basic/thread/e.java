package com.bytedance.android.input.basic.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e {
    private final ImeThreadPoolType a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2126c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2127d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2128e;

    public static final class a {
        private final ImeThreadPoolType a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private int f2129c;

        /* renamed from: d, reason: collision with root package name */
        private BlockingQueue<Runnable> f2130d;

        /* renamed from: e, reason: collision with root package name */
        private RejectedExecutionHandler f2131e;

        /* renamed from: f, reason: collision with root package name */
        private long f2132f;

        /* renamed from: g, reason: collision with root package name */
        private int f2133g;

        public a(ImeThreadPoolType imeThreadPoolType) {
            l.f(imeThreadPoolType, "type");
            this.a = imeThreadPoolType;
            this.f2129c = 1;
            this.f2130d = new LinkedBlockingQueue();
            this.f2131e = new ThreadPoolExecutor.AbortPolicy();
            this.f2132f = -1L;
        }

        public final e a() {
            return new e(this.a, this.b, this.f2129c, this.f2130d, this.f2131e, this.f2132f, null, this.f2133g, null);
        }

        public final a b(int i) {
            this.f2129c = i;
            return this;
        }

        public final a c(String str) {
            this.b = str;
            return this;
        }

        public final a d(int i) {
            this.f2133g = i;
            return this;
        }
    }

    public e(ImeThreadPoolType imeThreadPoolType, String str, int i, BlockingQueue blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, long j, ThreadFactory threadFactory, int i2, g gVar) {
        this.a = imeThreadPoolType;
        this.b = str;
        this.f2126c = i;
        this.f2127d = j;
        this.f2128e = i2;
    }

    public final ThreadFactory a() {
        return null;
    }

    public final long b() {
        return this.f2127d;
    }

    public final int c() {
        return this.f2128e;
    }

    public final int d() {
        return this.f2126c;
    }

    public final String e() {
        return this.b;
    }

    public final ImeThreadPoolType f() {
        return this.a;
    }
}
