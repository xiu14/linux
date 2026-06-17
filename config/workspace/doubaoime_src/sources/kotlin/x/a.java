package kotlin.x;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a<T> implements e<T> {
    private final AtomicReference<e<T>> a;

    public a(e<? extends T> eVar) {
        kotlin.s.c.l.f(eVar, "sequence");
        this.a = new AtomicReference<>(eVar);
    }

    @Override // kotlin.x.e
    public Iterator<T> iterator() {
        e<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
