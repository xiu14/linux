package d.a.b.d;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class e {
    private final ReentrantLock a = new ReentrantLock();

    public final void a() {
        this.a.lock();
    }

    public final void b() {
        this.a.unlock();
    }
}
