package kotlinx.coroutines;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<T>] */
/* loaded from: classes2.dex */
class M<T> extends AbstractC0789a<T> implements L<T> {
    public M(kotlin.r.f fVar, boolean z) {
        super(fVar, true, z);
    }

    @Override // kotlinx.coroutines.L
    public T h() {
        Object X = X();
        if (!(!(X instanceof InterfaceC0807h0))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (X instanceof C0824u) {
            throw ((C0824u) X).a;
        }
        return (T) s0.g(X);
    }
}
