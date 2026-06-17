package d.a.b.e;

import java.util.concurrent.TimeUnit;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class j {
    private static final d.a.b.d.d<kotlin.e<i>> a = new d.a.b.d.d<>(kotlin.a.c(b.a));
    private static final d.a.b.d.d<kotlin.e<i>> b = new d.a.b.d.d<>(kotlin.a.c(a.a));

    static final /* synthetic */ class a extends kotlin.s.c.j implements kotlin.s.b.a<i> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.c.AbstractC0783c
        public final String getName() {
            return "createIoScheduler";
        }

        @Override // kotlin.s.c.AbstractC0783c
        public final kotlin.reflect.d getOwner() {
            return A.d(d.a.b.e.b.class, "kn_common_release");
        }

        @Override // kotlin.s.c.AbstractC0783c
        public final String getSignature() {
            return "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        @Override // kotlin.s.b.a
        public i invoke() {
            return new e(new d.a.b.e.a(TimeUnit.MINUTES.toMillis(1L), new k("IO")));
        }
    }

    static final /* synthetic */ class b extends kotlin.s.c.j implements kotlin.s.b.a<i> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.c.AbstractC0783c
        public final String getName() {
            return "createMainScheduler";
        }

        @Override // kotlin.s.c.AbstractC0783c
        public final kotlin.reflect.d getOwner() {
            return A.d(c.class, "kn_common_release");
        }

        @Override // kotlin.s.c.AbstractC0783c
        public final String getSignature() {
            return "createMainScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
        }

        @Override // kotlin.s.b.a
        public i invoke() {
            return new g();
        }
    }

    public static final i a() {
        d.a.b.d.d<kotlin.e<i>> dVar = b;
        l.g(dVar, "$this$value");
        return dVar.a().getValue();
    }

    public static final i b() {
        d.a.b.d.d<kotlin.e<i>> dVar = a;
        l.g(dVar, "$this$value");
        return dVar.a().getValue();
    }
}
