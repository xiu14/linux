package e.c.f.a.a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import e.c.f.a.a.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c<T extends e.c.f.a.a.a> extends e.c.f.a.a.b<T> {
    private final com.facebook.common.time.b b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f9803c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9804d;

    /* renamed from: e, reason: collision with root package name */
    private long f9805e;

    /* renamed from: f, reason: collision with root package name */
    private b f9806f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f9807g;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                c.this.f9804d = false;
                if (!c.m(c.this)) {
                    c.this.r();
                } else if (c.this.f9806f != null) {
                    c.this.f9806f.d();
                }
            }
        }
    }

    public interface b {
        void d();
    }

    private c(T t, b bVar, com.facebook.common.time.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f9804d = false;
        this.f9807g = new a();
        this.f9806f = bVar;
        this.b = bVar2;
        this.f9803c = scheduledExecutorService;
    }

    static boolean m(c cVar) {
        return cVar.b.now() - cVar.f9805e > 2000;
    }

    public static <T extends e.c.f.a.a.a & b> e.c.f.a.a.b<T> p(T t, com.facebook.common.time.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return new c(t, (b) t, bVar, scheduledExecutorService);
    }

    public static <T extends e.c.f.a.a.a & b> e.c.f.a.a.b<T> q(e.c.g.d dVar, T t, com.facebook.common.time.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return new c(dVar, t, (b) t, bVar, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r() {
        if (!this.f9804d) {
            this.f9804d = true;
            this.f9803c.schedule(this.f9807g, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // e.c.f.a.a.b, e.c.f.a.a.a
    public boolean k(Drawable drawable, Canvas canvas, int i) {
        this.f9805e = this.b.now();
        boolean k = super.k(drawable, canvas, i);
        r();
        return k;
    }

    private c(e.c.g.d dVar, T t, b bVar, com.facebook.common.time.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t, dVar);
        this.f9804d = false;
        this.f9807g = new a();
        this.f9806f = bVar;
        this.b = bVar2;
        this.f9803c = scheduledExecutorService;
    }
}
