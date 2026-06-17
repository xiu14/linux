package d.a.b.d;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class c {
    private final AtomicLong a;

    public c(long j) {
        this.a = new AtomicLong(j);
    }

    public final long a() {
        return this.a.incrementAndGet();
    }
}
