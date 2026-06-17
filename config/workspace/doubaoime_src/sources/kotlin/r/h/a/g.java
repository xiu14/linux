package kotlin.r.h.a;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(kotlin.r.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == kotlin.r.g.a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.r.d
    public kotlin.r.f getContext() {
        return kotlin.r.g.a;
    }
}
