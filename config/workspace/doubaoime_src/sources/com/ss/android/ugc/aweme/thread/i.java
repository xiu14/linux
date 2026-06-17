package com.ss.android.ugc.aweme.thread;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class i {
    private List<ThreadPoolType> a;
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private long f8396c;

    /* renamed from: d, reason: collision with root package name */
    private long f8397d;

    /* renamed from: e, reason: collision with root package name */
    private long f8398e;

    public static final class b {
        private List<ThreadPoolType> a = Collections.emptyList();
        private List<String> b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        private long f8399c;

        /* renamed from: d, reason: collision with root package name */
        private long f8400d;

        /* renamed from: e, reason: collision with root package name */
        private long f8401e;

        b(a aVar) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            this.f8399c = timeUnit.toMillis(5L);
            this.f8400d = timeUnit.toMillis(5L);
            this.f8401e = timeUnit.toMillis(15L);
        }
    }

    i(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f8396c = bVar.f8399c;
        this.f8397d = bVar.f8400d;
        this.f8398e = bVar.f8401e;
    }

    public List<ThreadPoolType> a() {
        return this.a;
    }

    public long b() {
        return this.f8398e;
    }

    public long c() {
        return this.f8397d;
    }

    public long d() {
        return this.f8396c;
    }
}
