package kotlinx.coroutines.N0;

import kotlinx.coroutines.InterfaceC0812k;
import kotlinx.coroutines.K;
import kotlinx.coroutines.N;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class j extends kotlinx.coroutines.D implements Runnable, N {
    private final kotlinx.coroutines.D a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ N f10163c;

    /* renamed from: d, reason: collision with root package name */
    private final n<Runnable> f10164d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f10165e;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(kotlinx.coroutines.D d2, int i) {
        this.a = d2;
        this.b = i;
        N n = d2 instanceof N ? (N) d2 : null;
        this.f10163c = n == null ? K.a() : n;
        this.f10164d = new n<>(false);
        this.f10165e = new Object();
    }

    private final boolean U() {
        synchronized (this.f10165e) {
            if (this.runningWorkers >= this.b) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.N
    public U A(long j, Runnable runnable, kotlin.r.f fVar) {
        return this.f10163c.A(j, runnable, fVar);
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        this.f10164d.a(runnable);
        if ((this.runningWorkers >= this.b) || !U()) {
            return;
        }
        this.a.dispatch(this, this);
    }

    @Override // kotlinx.coroutines.D
    public void dispatchYield(kotlin.r.f fVar, Runnable runnable) {
        this.f10164d.a(runnable);
        if ((this.runningWorkers >= this.b) || !U()) {
            return;
        }
        this.a.dispatchYield(this, this);
    }

    @Override // kotlinx.coroutines.D
    public kotlinx.coroutines.D limitedParallelism(int i) {
        com.prolificinteractive.materialcalendarview.r.B(i);
        return i >= this.b ? this : super.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.N
    public void o(long j, InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
        this.f10163c.o(j, interfaceC0812k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r1 = r4.f10165e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r4.f10164d.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        r4.runningWorkers++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.N0.n<java.lang.Runnable> r2 = r4.f10164d
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.r.g r3 = kotlin.r.g.a
            com.prolificinteractive.materialcalendarview.r.T(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.D r2 = r4.a
            boolean r2 = r2.isDispatchNeeded(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.D r0 = r4.a
            r0.dispatch(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f10165e
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            kotlinx.coroutines.N0.n<java.lang.Runnable> r2 = r4.f10164d     // Catch: java.lang.Throwable -> L45
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.N0.j.run():void");
    }
}
