package f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b extends A {
    private static final long h;
    private static final long i;
    private static b j;
    public static final a k = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private boolean f10036e;

    /* renamed from: f, reason: collision with root package name */
    private b f10037f;

    /* renamed from: g, reason: collision with root package name */
    private long f10038g;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }

        public final b a() throws InterruptedException {
            b bVar = b.j;
            if (bVar == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            b bVar2 = bVar.f10037f;
            if (bVar2 == null) {
                long nanoTime = System.nanoTime();
                b.class.wait(b.h);
                b bVar3 = b.j;
                if (bVar3 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                if (bVar3.f10037f != null || System.nanoTime() - nanoTime < b.i) {
                    return null;
                }
                return b.j;
            }
            long m = b.m(bVar2, System.nanoTime());
            if (m > 0) {
                long j = m / 1000000;
                b.class.wait(j, (int) (m - (1000000 * j)));
                return null;
            }
            b bVar4 = b.j;
            if (bVar4 == null) {
                kotlin.s.c.l.k();
                throw null;
            }
            bVar4.f10037f = bVar2.f10037f;
            bVar2.f10037f = null;
            return bVar2;
        }
    }

    /* renamed from: f.b$b, reason: collision with other inner class name */
    private static final class C0465b extends Thread {
        public C0465b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b a;
            while (true) {
                try {
                    synchronized (b.class) {
                        a = b.k.a();
                        if (a == b.j) {
                            b.j = null;
                            return;
                        }
                    }
                    if (a != null) {
                        a.v();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long m(b bVar, long j2) {
        return bVar.f10038g - j2;
    }

    public final void q() {
        if (!(!this.f10036e)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long h2 = h();
        boolean e2 = e();
        if (h2 != 0 || e2) {
            this.f10036e = true;
            synchronized (b.class) {
                if (j == null) {
                    j = new b();
                    new C0465b().start();
                }
                long nanoTime = System.nanoTime();
                if (h2 != 0 && e2) {
                    this.f10038g = Math.min(h2, c() - nanoTime) + nanoTime;
                } else if (h2 != 0) {
                    this.f10038g = h2 + nanoTime;
                } else {
                    if (!e2) {
                        throw new AssertionError();
                    }
                    this.f10038g = c();
                }
                long m = m(this, nanoTime);
                b bVar = j;
                if (bVar == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                while (bVar.f10037f != null) {
                    b bVar2 = bVar.f10037f;
                    if (bVar2 == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                    if (m < m(bVar2, nanoTime)) {
                        break;
                    }
                    bVar = bVar.f10037f;
                    if (bVar == null) {
                        kotlin.s.c.l.k();
                        throw null;
                    }
                }
                this.f10037f = bVar.f10037f;
                bVar.f10037f = this;
                if (bVar == j) {
                    b.class.notify();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        r2.f10037f = r4.f10037f;
        r4.f10037f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r() {
        /*
            r4 = this;
            boolean r0 = r4.f10036e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.f10036e = r1
            java.lang.Class<f.b> r0 = f.b.class
            monitor-enter(r0)
            f.b r2 = i()     // Catch: java.lang.Throwable -> L2c
        Lf:
            if (r2 == 0) goto L29
            f.b r3 = l(r2)     // Catch: java.lang.Throwable -> L2c
            if (r3 != r4) goto L24
            f.b r3 = l(r4)     // Catch: java.lang.Throwable -> L2c
            o(r2, r3)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            o(r4, r2)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            goto L2b
        L24:
            f.b r2 = l(r2)     // Catch: java.lang.Throwable -> L2c
            goto Lf
        L29:
            r1 = 1
            monitor-exit(r0)
        L2b:
            return r1
        L2c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.r():boolean");
    }

    public final IOException s(IOException iOException) {
        kotlin.s.c.l.g(iOException, "cause");
        return !r() ? iOException : u(iOException);
    }

    public final void t(boolean z) {
        if (r() && z) {
            throw u(null);
        }
    }

    protected IOException u(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    protected void v() {
    }
}
