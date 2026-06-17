package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.locks.LockSupport;

/* renamed from: kotlinx.coroutines.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0799f<T> extends AbstractC0789a<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Thread f10238c;

    /* renamed from: d, reason: collision with root package name */
    private final Y f10239d;

    public C0799f(kotlin.r.f fVar, Thread thread, Y y) {
        super(fVar, true, true);
        this.f10238c = thread;
        this.f10239d = y;
    }

    @Override // kotlinx.coroutines.r0
    protected void A(Object obj) {
        if (kotlin.s.c.l.a(Thread.currentThread(), this.f10238c)) {
            return;
        }
        LockSupport.unpark(this.f10238c);
    }

    @Override // kotlinx.coroutines.r0
    protected boolean b0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T s0() {
        Y y = this.f10239d;
        if (y != null) {
            int i = Y.f10201d;
            y.e0(false);
        }
        while (!Thread.interrupted()) {
            try {
                Y y2 = this.f10239d;
                long l0 = y2 != null ? y2.l0() : LocationRequestCompat.PASSIVE_INTERVAL;
                if (!(X() instanceof InterfaceC0807h0)) {
                    T t = (T) s0.g(X());
                    C0824u c0824u = t instanceof C0824u ? (C0824u) t : null;
                    if (c0824u == null) {
                        return t;
                    }
                    throw c0824u.a;
                }
                LockSupport.parkNanos(this, l0);
            } finally {
                Y y3 = this.f10239d;
                if (y3 != null) {
                    int i2 = Y.f10201d;
                    y3.U(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        B(interruptedException);
        throw interruptedException;
    }
}
