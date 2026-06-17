package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class J0 extends D {
    public static final J0 a = new J0();

    private J0() {
    }

    @Override // kotlinx.coroutines.D
    public void dispatch(kotlin.r.f fVar, Runnable runnable) {
        if (((M0) fVar.get(M0.a)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // kotlinx.coroutines.D
    public boolean isDispatchNeeded(kotlin.r.f fVar) {
        return false;
    }

    @Override // kotlinx.coroutines.D
    public D limitedParallelism(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.D
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
