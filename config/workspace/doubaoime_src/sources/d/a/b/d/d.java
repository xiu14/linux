package d.a.b.d;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d<V> {
    private final AtomicReference<V> a;

    public d(V v) {
        this.a = new AtomicReference<>(v);
    }

    public final V a() {
        return this.a.get();
    }
}
