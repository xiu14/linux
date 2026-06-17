package d.a.b.e;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a implements f {
    private final ThreadFactory a;

    public a(long j, ThreadFactory threadFactory) {
        l.g(threadFactory, "threadFactory");
        this.a = threadFactory;
    }

    @Override // d.a.b.e.f
    public ScheduledExecutorService get() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5, this.a);
        l.b(newScheduledThreadPool, "Executors.newScheduledTh…READ_SIZE, threadFactory)");
        return newScheduledThreadPool;
    }
}
