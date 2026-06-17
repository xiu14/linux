package kotlin.s.c;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class m<R> implements i<R>, Serializable {
    private final int arity;

    public m(int i) {
        this.arity = i;
    }

    @Override // kotlin.s.c.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = A.i(this);
        l.e(i, "renderLambdaToString(this)");
        return i;
    }
}
