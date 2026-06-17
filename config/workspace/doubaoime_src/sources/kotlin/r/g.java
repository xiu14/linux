package kotlin.r;

import java.io.Serializable;
import kotlin.r.f;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class g implements f, Serializable {
    public static final g a = new g();

    private g() {
    }

    @Override // kotlin.r.f
    public <R> R fold(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        l.f(pVar, "operation");
        return r;
    }

    @Override // kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        l.f(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.r.f
    public f minusKey(f.c<?> cVar) {
        l.f(cVar, "key");
        return this;
    }

    @Override // kotlin.r.f
    public f plus(f fVar) {
        l.f(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
