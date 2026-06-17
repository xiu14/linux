package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10333c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10334d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10335e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<g> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    private final g b(g gVar) {
        if (gVar.b.b() == 1) {
            f10335e.incrementAndGet(this);
        }
        if (c() == 127) {
            return gVar;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, gVar);
        f10333c.incrementAndGet(this);
        return null;
    }

    private final g g() {
        g andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f10334d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.b.b() == 1) {
                    f10335e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    private final long j(m mVar, boolean z) {
        g gVar;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            if (z) {
                if (!(gVar.b.b() == 1)) {
                    return -2L;
                }
            }
            long a = k.f10330e.a() - gVar.a;
            long j = k.a;
            if (a < j) {
                return j - a;
            }
        } while (!b.compareAndSet(mVar, gVar, null));
        a(gVar, false);
        return -1L;
    }

    public final g a(g gVar, boolean z) {
        if (z) {
            return b(gVar);
        }
        g gVar2 = (g) b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final void e(c cVar) {
        boolean z;
        g gVar = (g) b.getAndSet(this, null);
        if (gVar != null) {
            cVar.a(gVar);
        }
        do {
            g g2 = g();
            if (g2 == null) {
                z = false;
            } else {
                cVar.a(g2);
                z = true;
            }
        } while (z);
    }

    public final g f() {
        g gVar = (g) b.getAndSet(this, null);
        return gVar == null ? g() : gVar;
    }

    public final long h(m mVar) {
        int i = mVar.consumerIndex;
        int i2 = mVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = mVar.a;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i3);
            if (gVar != null) {
                if ((gVar.b.b() == 1) && atomicReferenceArray.compareAndSet(i3, gVar, null)) {
                    f10335e.decrementAndGet(mVar);
                    a(gVar, false);
                    return -1L;
                }
            }
            i++;
        }
        return j(mVar, true);
    }

    public final long i(m mVar) {
        g g2 = mVar.g();
        if (g2 == null) {
            return j(mVar, false);
        }
        a(g2, false);
        return -1L;
    }
}
