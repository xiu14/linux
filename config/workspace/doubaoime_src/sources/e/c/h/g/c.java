package e.c.h.g;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class c implements f {
    private final Executor b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9882c;
    private final Executor a = Executors.newFixedThreadPool(2, new n(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d, reason: collision with root package name */
    private final Executor f9883d = Executors.newFixedThreadPool(1, new n(10, "FrescoLightWeightBackgroundExecutor", true));

    public c(int i) {
        this.b = Executors.newFixedThreadPool(i, new n(10, "FrescoDecodeExecutor", true));
        this.f9882c = Executors.newFixedThreadPool(i, new n(10, "FrescoBackgroundExecutor", true));
    }

    @Override // e.c.h.g.f
    public Executor a() {
        return this.b;
    }

    @Override // e.c.h.g.f
    public Executor b() {
        return this.f9883d;
    }

    @Override // e.c.h.g.f
    public Executor c() {
        return this.f9882c;
    }

    @Override // e.c.h.g.f
    public Executor d() {
        return this.a;
    }

    @Override // e.c.h.g.f
    public Executor e() {
        return this.a;
    }

    @Override // e.c.h.g.f
    public Executor f() {
        return this.a;
    }
}
