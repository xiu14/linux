package com.ss.android.ugc.aweme.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public class j {
    public ThreadPoolType a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f8402c;

    /* renamed from: d, reason: collision with root package name */
    public BlockingQueue<Runnable> f8403d;

    /* renamed from: e, reason: collision with root package name */
    public RejectedExecutionHandler f8404e;

    /* renamed from: f, reason: collision with root package name */
    public long f8405f;

    public static final class b {
        private ThreadPoolType a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private int f8406c = 1;

        /* renamed from: d, reason: collision with root package name */
        private BlockingQueue<Runnable> f8407d = new LinkedBlockingQueue();

        /* renamed from: e, reason: collision with root package name */
        private RejectedExecutionHandler f8408e = new ThreadPoolExecutor.AbortPolicy();

        /* renamed from: f, reason: collision with root package name */
        private long f8409f = -1;

        b(ThreadPoolType threadPoolType, a aVar) {
            this.a = threadPoolType;
        }

        public j g() {
            return new j(this, null);
        }

        public b h(int i) {
            this.f8406c = i;
            return this;
        }

        public b i(String str) {
            this.b = str;
            return this;
        }
    }

    j(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f8402c = bVar.f8406c;
        this.f8403d = bVar.f8407d;
        this.f8404e = bVar.f8408e;
        this.f8405f = bVar.f8409f;
    }

    public static b a(ThreadPoolType threadPoolType) {
        return new b(threadPoolType, null);
    }
}
