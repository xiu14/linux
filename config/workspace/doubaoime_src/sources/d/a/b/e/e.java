package d.a.b.e;

import d.a.b.e.i;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e implements i {
    private final f a;

    private static final class a implements i.a {

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public static final C0416a f9358d = new C0416a(null);
        private volatile ScheduledExecutorService a;
        private final Object b;

        /* renamed from: c, reason: collision with root package name */
        private final f f9359c;

        /* renamed from: d.a.b.e.e$a$a, reason: collision with other inner class name */
        private static final class C0416a {
            public C0416a(kotlin.s.c.g gVar) {
            }
        }

        public a(f fVar) {
            l.g(fVar, "executorServiceStrategy");
            this.f9359c = fVar;
            this.a = fVar.get();
            this.b = new Object();
        }

        @Override // d.a.b.e.i.a
        public void a(long j, kotlin.s.b.a<o> aVar) {
            l.g(aVar, "task");
            if (this.a != null) {
                synchronized (this.b) {
                    ScheduledExecutorService scheduledExecutorService = this.a;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.schedule(new d(aVar), j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    public e(f fVar) {
        l.g(fVar, "executorServiceStrategy");
        this.a = fVar;
    }

    @Override // d.a.b.e.i
    public i.a a() {
        return new a(this.a);
    }
}
