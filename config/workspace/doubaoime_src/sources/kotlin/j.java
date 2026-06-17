package kotlin;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class j<T> implements e<T>, Serializable {
    private kotlin.s.b.a<? extends T> a;
    private volatile Object b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f10117c;

    public j(kotlin.s.b.a aVar, Object obj, int i) {
        int i2 = i & 2;
        kotlin.s.c.l.f(aVar, "initializer");
        this.a = aVar;
        this.b = m.a;
        this.f10117c = this;
    }

    @Override // kotlin.e
    public T getValue() {
        T t;
        T t2 = (T) this.b;
        m mVar = m.a;
        if (t2 != mVar) {
            return t2;
        }
        synchronized (this.f10117c) {
            t = (T) this.b;
            if (t == mVar) {
                kotlin.s.b.a<? extends T> aVar = this.a;
                kotlin.s.c.l.c(aVar);
                t = aVar.invoke();
                this.b = t;
                this.a = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.b != m.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
