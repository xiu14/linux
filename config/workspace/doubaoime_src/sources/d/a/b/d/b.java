package d.a.b.d;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b {
    private final AtomicInteger a;

    public b(int i) {
        this.a = new AtomicInteger(i);
    }

    public final boolean a(int i, int i2) {
        return this.a.compareAndSet(i, i2);
    }

    public final int b() {
        return this.a.decrementAndGet();
    }

    public final int c() {
        return this.a.get();
    }

    public final int d() {
        return this.a.incrementAndGet();
    }

    public final void e(int i) {
        this.a.set(i);
    }
}
