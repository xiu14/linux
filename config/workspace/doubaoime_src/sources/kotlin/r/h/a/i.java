package kotlin.r.h.a;

import kotlin.s.c.A;
import kotlin.s.c.l;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes2.dex */
public abstract class i extends c implements kotlin.s.c.i<Object> {
    private final int arity;

    public i(int i, kotlin.r.d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    @Override // kotlin.s.c.i
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.r.h.a.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = A.h(this);
        l.e(h, "renderLambdaToString(this)");
        return h;
    }

    public i(int i) {
        this(i, null);
    }
}
