package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import kotlinx.coroutines.N0.C0785a;

/* loaded from: classes2.dex */
public abstract class Y extends D {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10201d = 0;
    private long a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private C0785a<Q<?>> f10202c;

    private final long Y(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void U(boolean z) {
        long Y = this.a - Y(z);
        this.a = Y;
        if (Y <= 0 && this.b) {
            shutdown();
        }
    }

    public final void a0(Q<?> q) {
        C0785a<Q<?>> c0785a = this.f10202c;
        if (c0785a == null) {
            c0785a = new C0785a<>();
            this.f10202c = c0785a;
        }
        c0785a.a(q);
    }

    protected long c0() {
        C0785a<Q<?>> c0785a = this.f10202c;
        if (c0785a == null || c0785a.b()) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return 0L;
    }

    public final void e0(boolean z) {
        this.a += Y(z);
        if (z) {
            return;
        }
        this.b = true;
    }

    public final boolean f0() {
        return this.a >= Y(true);
    }

    public final boolean j0() {
        C0785a<Q<?>> c0785a = this.f10202c;
        if (c0785a != null) {
            return c0785a.b();
        }
        return true;
    }

    public long l0() {
        if (n0()) {
            return 0L;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    @Override // kotlinx.coroutines.D
    public final D limitedParallelism(int i) {
        com.prolificinteractive.materialcalendarview.r.B(i);
        return this;
    }

    public final boolean n0() {
        Q<?> c2;
        C0785a<Q<?>> c0785a = this.f10202c;
        if (c0785a == null || (c2 = c0785a.c()) == null) {
            return false;
        }
        c2.run();
        return true;
    }

    public void shutdown() {
    }
}
