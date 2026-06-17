package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class i<T> implements e<T>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f10105c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, com.heytap.mcssdk.liquid.b.a);
    private volatile kotlin.s.b.a<? extends T> a;
    private volatile Object b;

    public i(kotlin.s.b.a<? extends T> aVar) {
        kotlin.s.c.l.f(aVar, "initializer");
        this.a = aVar;
        this.b = m.a;
    }

    @Override // kotlin.e
    public T getValue() {
        T t = (T) this.b;
        m mVar = m.a;
        if (t != mVar) {
            return t;
        }
        kotlin.s.b.a<? extends T> aVar = this.a;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (f10105c.compareAndSet(this, mVar, invoke)) {
                this.a = null;
                return invoke;
            }
        }
        return (T) this.b;
    }

    public String toString() {
        return this.b != m.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
