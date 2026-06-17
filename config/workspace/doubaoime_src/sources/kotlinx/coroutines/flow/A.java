package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class A extends kotlinx.coroutines.flow.D.c<y<?>> {
    static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(A.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.D.c
    public boolean a(y<?> yVar) {
        kotlinx.coroutines.N0.x xVar;
        if (this._state != null) {
            return false;
        }
        xVar = z.a;
        this._state = xVar;
        return true;
    }

    @Override // kotlinx.coroutines.flow.D.c
    public kotlin.r.d[] b(y<?> yVar) {
        this._state = null;
        return kotlinx.coroutines.flow.D.b.a;
    }
}
