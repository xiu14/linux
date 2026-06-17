package kotlin;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p<T> implements e<T>, Serializable {
    private kotlin.s.b.a<? extends T> a;
    private Object b;

    public p(kotlin.s.b.a<? extends T> aVar) {
        kotlin.s.c.l.f(aVar, "initializer");
        this.a = aVar;
        this.b = m.a;
    }

    @Override // kotlin.e
    public T getValue() {
        if (this.b == m.a) {
            kotlin.s.b.a<? extends T> aVar = this.a;
            kotlin.s.c.l.c(aVar);
            this.b = aVar.invoke();
            this.a = null;
        }
        return (T) this.b;
    }

    public String toString() {
        return this.b != m.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
