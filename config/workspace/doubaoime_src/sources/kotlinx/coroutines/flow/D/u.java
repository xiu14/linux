package kotlinx.coroutines.flow.D;

/* loaded from: classes2.dex */
final class u<T> implements kotlin.r.d<T>, kotlin.r.h.a.d {
    private final kotlin.r.d<T> a;
    private final kotlin.r.f b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(kotlin.r.d<? super T> dVar, kotlin.r.f fVar) {
        this.a = dVar;
        this.b = fVar;
    }

    @Override // kotlin.r.h.a.d
    public kotlin.r.h.a.d getCallerFrame() {
        kotlin.r.d<T> dVar = this.a;
        if (dVar instanceof kotlin.r.h.a.d) {
            return (kotlin.r.h.a.d) dVar;
        }
        return null;
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        return this.b;
    }

    @Override // kotlin.r.d
    public void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
