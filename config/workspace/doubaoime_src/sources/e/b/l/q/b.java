package e.b.l.q;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class b {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private AtomicInteger f9648c;

    public b(int i, int i2) {
        this.f9648c = new AtomicInteger(i);
        this.b = i;
        this.a = i2;
    }

    public int a() {
        int andIncrement = this.f9648c.getAndIncrement();
        if (andIncrement >= this.a) {
            this.f9648c.set(this.b);
        }
        return andIncrement;
    }
}
