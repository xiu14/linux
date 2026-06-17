package kotlinx.coroutines.flow;

/* loaded from: classes2.dex */
public final class C implements g<Object> {
    public final Throwable a;

    public C(Throwable th) {
        this.a = th;
    }

    @Override // kotlinx.coroutines.flow.g
    public Object emit(Object obj, kotlin.r.d<? super kotlin.o> dVar) {
        throw this.a;
    }
}
