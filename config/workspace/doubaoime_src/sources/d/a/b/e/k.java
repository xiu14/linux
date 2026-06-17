package d.a.b.e;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class k implements ThreadFactory {
    private final String a;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b f9360c = new b(null);
    private static final kotlin.e b = kotlin.a.c(a.a);

    static final class a extends m implements kotlin.s.b.a<ThreadFactory> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public ThreadFactory invoke() {
            return Executors.defaultThreadFactory();
        }
    }

    private static final class b {
        public b(kotlin.s.c.g gVar) {
        }
    }

    public k(String str) {
        l.g(str, "namePrefix");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        l.g(runnable, "runnable");
        Thread newThread = ((ThreadFactory) b.getValue()).newThread(runnable);
        newThread.setName(this.a + ", " + newThread.getName());
        newThread.setDaemon(true);
        l.b(newThread, "factory\n            .new…emon = true\n            }");
        return newThread;
    }
}
