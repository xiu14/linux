package kotlinx.coroutines.scheduling;

import androidx.core.location.LocationRequestCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N0.u;
import kotlinx.coroutines.N0.x;

/* loaded from: classes2.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10313c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final String f10314d;

    /* renamed from: e, reason: collision with root package name */
    public final c f10315e;

    /* renamed from: f, reason: collision with root package name */
    public final c f10316f;

    /* renamed from: g, reason: collision with root package name */
    public final u<a> f10317g;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final x k = new x("NOT_IN_STACK");
    private static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public final class a extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
        public final m a;
        public WorkerState b;

        /* renamed from: c, reason: collision with root package name */
        private long f10318c;

        /* renamed from: d, reason: collision with root package name */
        private long f10319d;

        /* renamed from: e, reason: collision with root package name */
        private int f10320e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f10321f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        public a(int i) {
            setDaemon(true);
            this.a = new m();
            this.b = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.k;
            this.f10320e = kotlin.v.c.a.d();
            f(i);
        }

        private final g e() {
            if (d(2) == 0) {
                g d2 = CoroutineScheduler.this.f10315e.d();
                return d2 != null ? d2 : CoroutineScheduler.this.f10316f.d();
            }
            g d3 = CoroutineScheduler.this.f10316f.d();
            return d3 != null ? d3 : CoroutineScheduler.this.f10315e.d();
        }

        private final g i(boolean z) {
            int i = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int d2 = d(i);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                d2++;
                if (d2 > i) {
                    d2 = 1;
                }
                a b = coroutineScheduler.f10317g.b(d2);
                if (b != null && b != this) {
                    long h2 = z ? this.a.h(b.a) : this.a.i(b.a);
                    if (h2 == -1) {
                        return this.a.f();
                    }
                    if (h2 > 0) {
                        j = Math.min(j, h2);
                    }
                }
            }
            if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                j = 0;
            }
            this.f10319d = j;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlinx.coroutines.scheduling.g a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.b
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L9
                goto L32
            L9:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            Lb:
                long r6 = r0.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r1 = 42
                long r4 = r4 >> r1
                int r1 = (int) r4
                if (r1 != 0) goto L1b
                r0 = r2
                goto L2c
            L1b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.i
                r5 = r0
                boolean r1 = r4.compareAndSet(r5, r6, r8)
                if (r1 == 0) goto Lb
                r0 = r3
            L2c:
                if (r0 == 0) goto L34
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.b = r0
            L32:
                r0 = r3
                goto L35
            L34:
                r0 = r2
            L35:
                if (r0 == 0) goto L6e
                if (r11 == 0) goto L62
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.a
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L46
                goto L47
            L46:
                r3 = r2
            L47:
                if (r3 == 0) goto L50
                kotlinx.coroutines.scheduling.g r11 = r10.e()
                if (r11 == 0) goto L50
                goto L6d
            L50:
                kotlinx.coroutines.scheduling.m r11 = r10.a
                kotlinx.coroutines.scheduling.g r11 = r11.f()
                if (r11 == 0) goto L59
                goto L6d
            L59:
                if (r3 != 0) goto L69
                kotlinx.coroutines.scheduling.g r11 = r10.e()
                if (r11 == 0) goto L69
                goto L6d
            L62:
                kotlinx.coroutines.scheduling.g r11 = r10.e()
                if (r11 == 0) goto L69
                goto L6d
            L69:
                kotlinx.coroutines.scheduling.g r11 = r10.i(r2)
            L6d:
                return r11
            L6e:
                if (r11 == 0) goto L83
                kotlinx.coroutines.scheduling.m r11 = r10.a
                kotlinx.coroutines.scheduling.g r11 = r11.f()
                if (r11 != 0) goto L8d
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                kotlinx.coroutines.scheduling.c r11 = r11.f10316f
                java.lang.Object r11 = r11.d()
                kotlinx.coroutines.scheduling.g r11 = (kotlinx.coroutines.scheduling.g) r11
                goto L8d
            L83:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                kotlinx.coroutines.scheduling.c r11 = r11.f10316f
                java.lang.Object r11 = r11.d()
                kotlinx.coroutines.scheduling.g r11 = (kotlinx.coroutines.scheduling.g) r11
            L8d:
                if (r11 != 0) goto L93
                kotlinx.coroutines.scheduling.g r11 = r10.i(r3)
            L93:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.a.a(boolean):kotlinx.coroutines.scheduling.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.f10320e;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f10320e = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f10314d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.b;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.i.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.b = workerState;
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0002, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.a.run():void");
        }
    }

    public CoroutineScheduler(int i2, int i3, long j2, String str) {
        this.a = i2;
        this.b = i3;
        this.f10313c = j2;
        this.f10314d = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("Core pool size ", i2, " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(e.a.a.a.a.l("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(e.a.a.a.a.k("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f10315e = new c();
        this.f10316f = new c();
        this.parkedWorkersStack = 0L;
        this.f10317g = new u<>(i2 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    private final int a() {
        synchronized (this.f10317g) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 >= this.a) {
                return 0;
            }
            if (i2 >= this.b) {
                return 0;
            }
            int i4 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i4 > 0 && this.f10317g.b(i4) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a aVar = new a(i4);
            this.f10317g.c(i4, aVar);
            if (!(i4 == ((int) (2097151 & i.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            aVar.start();
            return i3 + 1;
        }
    }

    private final a d() {
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.s.c.l.a(CoroutineScheduler.this, this)) {
            return null;
        }
        return aVar;
    }

    public static /* synthetic */ void l(CoroutineScheduler coroutineScheduler, Runnable runnable, h hVar, boolean z, int i2) {
        h hVar2 = (i2 & 2) != 0 ? k.f10331f : null;
        if ((i2 & 4) != 0) {
            z = false;
        }
        coroutineScheduler.h(runnable, hVar2, z);
    }

    private final int o(a aVar) {
        Object c2 = aVar.c();
        while (c2 != k) {
            if (c2 == null) {
                return 0;
            }
            a aVar2 = (a) c2;
            int b = aVar2.b();
            if (b != 0) {
                return b;
            }
            c2 = aVar2.c();
        }
        return -1;
    }

    private final boolean x(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 < this.a) {
            int a2 = a();
            if (a2 == 1 && this.a > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean z() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            a b = this.f10317g.b((int) (2097151 & j2));
            if (b == null) {
                b = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                int o = o(b);
                if (o >= 0 && h.compareAndSet(this, j2, o | j3)) {
                    b.g(k);
                }
            }
            if (b == null) {
                return false;
            }
            if (a.h.compareAndSet(b, -1, 0)) {
                LockSupport.unpark(b);
                return true;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i2;
        g d2;
        if (j.compareAndSet(this, 0, 1)) {
            a d3 = d();
            synchronized (this.f10317g) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    a b = this.f10317g.b(i3);
                    kotlin.s.c.l.c(b);
                    a aVar = b;
                    if (aVar != d3) {
                        while (aVar.isAlive()) {
                            LockSupport.unpark(aVar);
                            aVar.join(com.heytap.mcssdk.constant.a.q);
                        }
                        aVar.a.e(this.f10316f);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f10316f.b();
            this.f10315e.b();
            while (true) {
                if (d3 != null) {
                    d2 = d3.a(true);
                    if (d2 != null) {
                        continue;
                        s(d2);
                    }
                }
                d2 = this.f10315e.d();
                if (d2 == null && (d2 = this.f10316f.d()) == null) {
                    break;
                }
                s(d2);
            }
            if (d3 != null) {
                d3.h(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        l(this, runnable, null, false, 6);
    }

    public final void h(Runnable runnable, h hVar, boolean z) {
        g jVar;
        g gVar;
        long a2 = k.f10330e.a();
        if (runnable instanceof g) {
            jVar = (g) runnable;
            jVar.a = a2;
            jVar.b = hVar;
        } else {
            jVar = new j(runnable, a2, hVar);
        }
        a d2 = d();
        if (d2 == null || d2.b == WorkerState.TERMINATED || (jVar.b.b() == 0 && d2.b == WorkerState.BLOCKING)) {
            gVar = jVar;
        } else {
            d2.f10321f = true;
            gVar = d2.a.a(jVar, z);
        }
        if (gVar != null) {
            if (!(gVar.b.b() == 1 ? this.f10316f.a(gVar) : this.f10315e.a(gVar))) {
                throw new RejectedExecutionException(e.a.a.a.a.J(new StringBuilder(), this.f10314d, " was terminated"));
            }
        }
        boolean z2 = z && d2 != null;
        if (jVar.b.b() == 0) {
            if (z2) {
                return;
            }
            w();
        } else {
            long addAndGet = i.addAndGet(this, 2097152L);
            if (z2 || z() || x(addAndGet)) {
                return;
            }
            z();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean p(a aVar) {
        long j2;
        int b;
        if (aVar.c() != k) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            b = aVar.b();
            aVar.g(this.f10317g.b((int) (2097151 & j2)));
        } while (!h.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | b));
        return true;
    }

    public final void r(a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? o(aVar) : i3;
            }
            if (i4 >= 0 && h.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void s(g gVar) {
        try {
            gVar.run();
        } finally {
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a2 = this.f10317g.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a b = this.f10317g.b(i7);
            if (b != null) {
                int d2 = b.a.d();
                int ordinal = b.b.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(d2);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(d2);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (d2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(d2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f10314d);
        sb4.append('@');
        sb4.append(I.b(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.a);
        sb4.append(", max = ");
        e.a.a.a.a.F0(sb4, this.b, "}, Worker States {CPU = ", i2, ", blocking = ");
        e.a.a.a.a.F0(sb4, i3, ", parked = ", i4, ", dormant = ");
        e.a.a.a.a.F0(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f10315e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f10316f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.a - ((int) ((9223367638808264704L & j2) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void w() {
        if (z() || x(this.controlState)) {
            return;
        }
        z();
    }
}
