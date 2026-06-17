package okhttp3;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.F.e.g;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f10607g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), okhttp3.F.c.z("OkHttp ConnectionPool", true));
    private final int a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f10608c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Deque<okhttp3.F.e.c> f10609d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final okhttp3.F.e.d f10610e = new okhttp3.F.e.d();

    /* renamed from: f, reason: collision with root package name */
    boolean f10611f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a = i.this.a(System.nanoTime());
                if (a == -1) {
                    return;
                }
                if (a > 0) {
                    long j = a / 1000000;
                    long j2 = a - (1000000 * j);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i(int i, long j, TimeUnit timeUnit) {
        this.a = i;
        this.b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException(e.a.a.a.a.n("keepAliveDuration <= 0: ", j));
        }
    }

    private int e(okhttp3.F.e.c cVar, long j) {
        List<Reference<okhttp3.F.e.g>> list = cVar.n;
        int i = 0;
        while (i < list.size()) {
            Reference<okhttp3.F.e.g> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder M = e.a.a.a.a.M("A connection to ");
                M.append(cVar.n().a.a);
                M.append(" was leaked. Did you forget to close a response body?");
                okhttp3.F.h.g.h().o(M.toString(), ((g.a) reference).a);
                list.remove(i);
                cVar.k = true;
                if (list.isEmpty()) {
                    cVar.o = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j) {
        synchronized (this) {
            okhttp3.F.e.c cVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (okhttp3.F.e.c cVar2 : this.f10609d) {
                if (e(cVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - cVar2.o;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.b;
            if (j2 < j4 && i <= this.a) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f10611f = false;
                return -1L;
            }
            this.f10609d.remove(cVar);
            okhttp3.F.c.h(cVar.o());
            return 0L;
        }
    }

    boolean b(okhttp3.F.e.c cVar) {
        if (cVar.k || this.a == 0) {
            this.f10609d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    Socket c(C0833a c0833a, okhttp3.F.e.g gVar) {
        for (okhttp3.F.e.c cVar : this.f10609d) {
            if (cVar.i(c0833a, null) && cVar.k() && cVar != gVar.d()) {
                return gVar.k(cVar);
            }
        }
        return null;
    }

    okhttp3.F.e.c d(C0833a c0833a, okhttp3.F.e.g gVar, E e2) {
        for (okhttp3.F.e.c cVar : this.f10609d) {
            if (cVar.i(c0833a, e2)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    void f(okhttp3.F.e.c cVar) {
        if (!this.f10611f) {
            this.f10611f = true;
            f10607g.execute(this.f10608c);
        }
        this.f10609d.add(cVar);
    }
}
