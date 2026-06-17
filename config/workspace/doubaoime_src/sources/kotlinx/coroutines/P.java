package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class P<T> extends kotlinx.coroutines.N0.v<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10180d = AtomicIntegerFieldUpdater.newUpdater(P.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public P(kotlin.r.f fVar, kotlin.r.d<? super T> dVar) {
        super(fVar, dVar);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.N0.v, kotlinx.coroutines.r0
    protected void A(Object obj) {
        p0(obj);
    }

    @Override // kotlinx.coroutines.N0.v, kotlinx.coroutines.AbstractC0789a
    protected void p0(Object obj) {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f10180d.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        kotlinx.coroutines.N0.i.c(kotlin.coroutines.intrinsics.a.d(this.f10175c), com.prolificinteractive.materialcalendarview.r.g0(obj, this.f10175c), null, 2);
    }

    public final Object s0() {
        boolean z;
        while (true) {
            int i = this._decision;
            z = false;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f10180d.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        Object g2 = s0.g(X());
        if (g2 instanceof C0824u) {
            throw ((C0824u) g2).a;
        }
        return g2;
    }
}
