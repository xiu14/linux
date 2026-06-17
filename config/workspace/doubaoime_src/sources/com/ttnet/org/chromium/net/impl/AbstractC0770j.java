package com.ttnet.org.chromium.net.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ttnet.org.chromium.net.impl.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0770j extends com.ttnet.org.chromium.net.E {
    private final AtomicInteger a = new AtomicInteger(3);
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8740c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ttnet.org.chromium.net.D f8741d;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f8742e;

    /* renamed from: f, reason: collision with root package name */
    private long f8743f;

    /* renamed from: g, reason: collision with root package name */
    private long f8744g;

    /* renamed from: com.ttnet.org.chromium.net.impl.j$a */
    class a implements Executor {
        final /* synthetic */ Executor a;

        a(Executor executor) {
            this.a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.a.execute(runnable);
            } catch (RejectedExecutionException e2) {
                C0772l.Z(C0772l.this, e2);
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.j$b */
    class b implements y {
        final /* synthetic */ boolean a;

        /* renamed from: com.ttnet.org.chromium.net.impl.j$b$a */
        class a implements y {
            a() {
            }

            @Override // com.ttnet.org.chromium.net.impl.y
            public void run() throws Exception {
                com.ttnet.org.chromium.net.D d2 = AbstractC0770j.this.f8741d;
                AbstractC0770j abstractC0770j = AbstractC0770j.this;
                d2.d(abstractC0770j, abstractC0770j.f8742e);
            }
        }

        b(boolean z) {
            this.a = z;
        }

        @Override // com.ttnet.org.chromium.net.impl.y
        public void run() throws Exception {
            AbstractC0770j.this.f8742e.flip();
            if (AbstractC0770j.this.f8743f != -1 && AbstractC0770j.this.f8743f - AbstractC0770j.this.f8744g < AbstractC0770j.this.f8742e.remaining()) {
                C0772l.Z(C0772l.this, new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(AbstractC0770j.this.f8744g + AbstractC0770j.this.f8742e.remaining()), Long.valueOf(AbstractC0770j.this.f8743f))));
                return;
            }
            AbstractC0770j.i(AbstractC0770j.this, r0.r(r0.f8742e));
            if (AbstractC0770j.this.f8744g < AbstractC0770j.this.f8743f || (AbstractC0770j.this.f8743f == -1 && !this.a)) {
                AbstractC0770j.this.f8742e.clear();
                AbstractC0770j.this.a.set(0);
                AbstractC0770j.this.n(new a());
            } else if (AbstractC0770j.this.f8743f == -1) {
                AbstractC0770j.this.o();
            } else if (AbstractC0770j.this.f8743f == AbstractC0770j.this.f8744g) {
                AbstractC0770j.this.o();
            } else {
                C0772l.Z(C0772l.this, new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(AbstractC0770j.this.f8744g), Long.valueOf(AbstractC0770j.this.f8743f))));
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.j$c */
    class c implements y {

        /* renamed from: com.ttnet.org.chromium.net.impl.j$c$a */
        class a implements y {
            a() {
            }

            @Override // com.ttnet.org.chromium.net.impl.y
            public void run() throws Exception {
                com.ttnet.org.chromium.net.D d2 = AbstractC0770j.this.f8741d;
                AbstractC0770j abstractC0770j = AbstractC0770j.this;
                d2.d(abstractC0770j, abstractC0770j.f8742e);
            }
        }

        c() {
        }

        @Override // com.ttnet.org.chromium.net.impl.y
        public void run() throws Exception {
            AbstractC0770j.this.p();
            AbstractC0770j.this.a.set(0);
            AbstractC0770j.this.n(new a());
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.j$d */
    class d implements y {
        final /* synthetic */ boolean a;

        d(boolean z) {
            this.a = z;
        }

        @Override // com.ttnet.org.chromium.net.impl.y
        public void run() throws Exception {
            AbstractC0770j abstractC0770j = AbstractC0770j.this;
            abstractC0770j.f8743f = abstractC0770j.f8741d.a();
            if (AbstractC0770j.this.f8743f == 0) {
                AbstractC0770j.this.o();
                return;
            }
            if (AbstractC0770j.this.f8743f <= 0 || AbstractC0770j.this.f8743f >= 8192) {
                AbstractC0770j.this.f8742e = ByteBuffer.allocateDirect(8192);
            } else {
                AbstractC0770j abstractC0770j2 = AbstractC0770j.this;
                abstractC0770j2.f8742e = ByteBuffer.allocateDirect(((int) abstractC0770j2.f8743f) + 1);
            }
            AbstractC0770j abstractC0770j3 = AbstractC0770j.this;
            abstractC0770j3.q(abstractC0770j3.f8743f);
            if (this.a) {
                AbstractC0770j.this.t();
            } else {
                AbstractC0770j.this.a.set(1);
                AbstractC0770j.this.f8741d.h(AbstractC0770j.this);
            }
        }
    }

    public AbstractC0770j(Executor executor, Executor executor2, com.ttnet.org.chromium.net.D d2) {
        this.b = new a(executor);
        this.f8740c = executor2;
        this.f8741d = d2;
    }

    static /* synthetic */ long i(AbstractC0770j abstractC0770j, long j) {
        long j2 = abstractC0770j.f8744g + j;
        abstractC0770j.f8744g = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(y yVar) {
        try {
            Executor executor = this.b;
            C0772l c0772l = C0772l.this;
            int i = C0772l.s;
            Objects.requireNonNull(c0772l);
            executor.execute(new RunnableC0771k(c0772l, yVar));
        } catch (RejectedExecutionException e2) {
            C0772l.Z(C0772l.this, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Executor executor = this.f8740c;
        c cVar = new c();
        C0772l c0772l = C0772l.this;
        int i = C0772l.s;
        Objects.requireNonNull(c0772l);
        executor.execute(new RunnableC0777q(c0772l, cVar));
    }

    @Override // com.ttnet.org.chromium.net.E
    public void a(boolean z) {
        if (!this.a.compareAndSet(0, 2)) {
            StringBuilder M = e.a.a.a.a.M("onReadSucceeded() called when not awaiting a read result; in state: ");
            M.append(this.a.get());
            throw new IllegalStateException(M.toString());
        }
        Executor executor = this.f8740c;
        b bVar = new b(z);
        C0772l c0772l = C0772l.this;
        int i = C0772l.s;
        Objects.requireNonNull(c0772l);
        executor.execute(new RunnableC0777q(c0772l, bVar));
    }

    @Override // com.ttnet.org.chromium.net.E
    public void b(Exception exc) {
        C0772l.Z(C0772l.this, exc);
    }

    @Override // com.ttnet.org.chromium.net.E
    public void c() {
        if (this.a.compareAndSet(1, 2)) {
            t();
        } else {
            StringBuilder M = e.a.a.a.a.M("onRewindSucceeded() called when not awaiting a rewind; in state: ");
            M.append(this.a.get());
            throw new IllegalStateException(M.toString());
        }
    }

    protected abstract void o() throws IOException;

    protected abstract void p() throws IOException;

    protected abstract void q(long j);

    protected abstract int r(ByteBuffer byteBuffer) throws IOException;

    public void s(boolean z) {
        n(new d(z));
    }
}
