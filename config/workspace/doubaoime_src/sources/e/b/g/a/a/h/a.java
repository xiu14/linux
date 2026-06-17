package e.b.g.a.a.h;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class a {
    private e.b.g.a.a.h.b a;
    private final Runnable b = new RunnableC0432a();

    /* renamed from: c, reason: collision with root package name */
    CopyOnWriteArraySet<c> f9522c = new CopyOnWriteArraySet<>();

    /* renamed from: e.b.g.a.a.h.a$a, reason: collision with other inner class name */
    class RunnableC0432a implements Runnable {
        RunnableC0432a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Iterator<c> it2 = a.this.f9522c.iterator();
                while (it2.hasNext()) {
                    it2.next().onTimeEvent(System.currentTimeMillis());
                }
                if (a.a(a.this)) {
                    a.this.a.g(this, 30000L);
                }
            } catch (OutOfMemoryError unused) {
            }
        }
    }

    private static final class b {
        static final a a = new a(null);
    }

    public interface c {
        void onTimeEvent(long j);
    }

    a(RunnableC0432a runnableC0432a) {
        e.b.g.a.a.h.b bVar = new e.b.g.a.a.h.b("AsyncEventManager-Thread");
        this.a = bVar;
        bVar.j();
    }

    static /* synthetic */ boolean a(a aVar) {
        Objects.requireNonNull(aVar);
        return true;
    }

    public static a d() {
        return b.a;
    }

    public void c(c cVar) {
        try {
            this.f9522c.add(cVar);
            this.a.h(this.b);
            this.a.g(this.b, 30000L);
        } catch (Throwable unused) {
        }
    }

    public void e(Runnable runnable) {
        this.a.f(runnable);
    }

    public void f(Runnable runnable, long j) {
        this.a.g(runnable, j);
    }
}
