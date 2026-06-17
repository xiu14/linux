package com.bytedance.android.input.basic.thread;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.l;
import kotlin.s.c.g;

/* loaded from: classes.dex */
public final class b {
    private final boolean a;
    private final List<ImeThreadPoolType> b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2120c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2121d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2122e;

    public static final class a {
        private boolean a;
        private List<? extends ImeThreadPoolType> b = l.a;

        /* renamed from: c, reason: collision with root package name */
        private long f2123c;

        /* renamed from: d, reason: collision with root package name */
        private long f2124d;

        /* renamed from: e, reason: collision with root package name */
        private long f2125e;

        public a() {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            this.f2123c = timeUnit.toMillis(5L);
            this.f2124d = timeUnit.toMillis(5L);
            this.f2125e = timeUnit.toMillis(15L);
        }

        public final b a() {
            return new b(this.a, this.b, l.a, this.f2123c, this.f2124d, this.f2125e, null);
        }

        public final a b(boolean z) {
            this.a = z;
            return this;
        }

        public final a c(List<? extends ImeThreadPoolType> list) {
            kotlin.s.c.l.f(list, "types");
            this.b = list;
            return this;
        }

        public final a d(long j) {
            if (!(j > 0)) {
                throw new IllegalArgumentException("taskBlockedTimeout must > 0".toString());
            }
            this.f2125e = j;
            return this;
        }

        public final a e(long j) {
            if (!(j > 0)) {
                throw new IllegalArgumentException("taskExecuteTimeout must > 0".toString());
            }
            this.f2124d = j;
            return this;
        }

        public final a f(long j) {
            if (!(j > 0)) {
                throw new IllegalArgumentException("taskWaitTimeout must > 0".toString());
            }
            this.f2123c = j;
            return this;
        }
    }

    public b(boolean z, List list, List list2, long j, long j2, long j3, g gVar) {
        this.a = z;
        this.b = list;
        this.f2120c = j;
        this.f2121d = j2;
        this.f2122e = j3;
    }

    public final boolean a() {
        return this.a;
    }

    public final List<ImeThreadPoolType> b() {
        return this.b;
    }

    public final List<String> c() {
        return l.a;
    }

    public final long d() {
        return this.f2122e;
    }

    public final long e() {
        return this.f2121d;
    }

    public final long f() {
        return this.f2120c;
    }
}
