package okhttp3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import okhttp3.y;

/* loaded from: classes2.dex */
public final class m {
    private ExecutorService a;
    private final Deque<y.b> b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Deque<y.b> f10705c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final Deque<y> f10706d = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.a = executorService;
    }

    private <T> void c(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<okhttp3.y$b> r1 = r15.b     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8a
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8a
            okhttp3.y$b r2 = (okhttp3.y.b) r2     // Catch: java.lang.Throwable -> L8a
            java.util.Deque<okhttp3.y$b> r3 = r15.f10705c     // Catch: java.lang.Throwable -> L8a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L8a
            r4 = 64
            if (r3 < r4) goto L23
            goto L37
        L23:
            int r3 = r15.g(r2)     // Catch: java.lang.Throwable -> L8a
            r4 = 5
            if (r3 < r4) goto L2b
            goto Lc
        L2b:
            r1.remove()     // Catch: java.lang.Throwable -> L8a
            r0.add(r2)     // Catch: java.lang.Throwable -> L8a
            java.util.Deque<okhttp3.y$b> r3 = r15.f10705c     // Catch: java.lang.Throwable -> L8a
            r3.add(r2)     // Catch: java.lang.Throwable -> L8a
            goto Lc
        L37:
            monitor-enter(r15)     // Catch: java.lang.Throwable -> L8a
            java.util.Deque<okhttp3.y$b> r1 = r15.f10705c     // Catch: java.lang.Throwable -> L87
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L87
            java.util.Deque<okhttp3.y> r2 = r15.f10706d     // Catch: java.lang.Throwable -> L87
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            if (r1 <= 0) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = r2
        L4c:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8a
            int r3 = r0.size()
            r4 = r2
        L52:
            if (r4 >= r3) goto L86
            java.lang.Object r5 = r0.get(r4)
            okhttp3.y$b r5 = (okhttp3.y.b) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch: java.lang.Throwable -> L83
            if (r6 != 0) goto L7a
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L83
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L83
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L83
            r13.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = "OkHttp Dispatcher"
            java.util.concurrent.ThreadFactory r14 = okhttp3.F.c.z(r7, r2)     // Catch: java.lang.Throwable -> L83
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch: java.lang.Throwable -> L83
            r15.a = r6     // Catch: java.lang.Throwable -> L83
        L7a:
            java.util.concurrent.ExecutorService r6 = r15.a     // Catch: java.lang.Throwable -> L83
            monitor-exit(r15)
            r5.b(r6)
            int r4 = r4 + 1
            goto L52
        L83:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L86:
            return r1
        L87:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L8a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.m.f():boolean");
    }

    private int g(y.b bVar) {
        Iterator<y.b> it2 = this.f10705c.iterator();
        int i = 0;
        while (it2.hasNext()) {
            y yVar = y.this;
            if (!yVar.f10743f && yVar.f10742e.url().f10711d.equals(y.this.f10742e.url().f10711d)) {
                i++;
            }
        }
        return i;
    }

    void a(y.b bVar) {
        synchronized (this) {
            this.b.add(bVar);
        }
        f();
    }

    synchronized void b(y yVar) {
        this.f10706d.add(yVar);
    }

    void d(y.b bVar) {
        c(this.f10705c, bVar);
    }

    void e(y yVar) {
        c(this.f10706d, yVar);
    }

    public m() {
    }
}
