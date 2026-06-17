package e.i.b.b.b;

import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f9983g = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f9985d;
    private final ArrayMap<b, Long> a = new ArrayMap<>();
    final ArrayList<b> b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0461a f9984c = new C0461a();

    /* renamed from: e, reason: collision with root package name */
    long f9986e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9987f = false;

    /* renamed from: e.i.b.b.b.a$a, reason: collision with other inner class name */
    class C0461a {
        C0461a() {
        }

        void a() {
            a.this.f9986e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.b(aVar.f9986e);
            if (a.this.b.size() > 0) {
                a.this.d().a();
            }
        }
    }

    interface b {
        boolean doAnimationFrame(long j);
    }

    static abstract class c {
        final C0461a a;

        c(C0461a c0461a) {
            this.a = c0461a;
        }

        abstract void a();
    }

    private static class d extends c {
        private final Choreographer b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f9988c;

        /* renamed from: e.i.b.b.b.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0462a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0462a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                d.this.a.a();
            }
        }

        d(C0461a c0461a) {
            super(c0461a);
            this.b = Choreographer.getInstance();
            this.f9988c = new ChoreographerFrameCallbackC0462a();
        }

        @Override // e.i.b.b.b.a.c
        void a() {
            this.b.postFrameCallback(this.f9988c);
        }
    }

    a() {
    }

    public static a c() {
        ThreadLocal<a> threadLocal = f9983g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j) {
        if (this.b.size() == 0) {
            if (this.f9985d == null) {
                this.f9985d = new d(this.f9984c);
            }
            this.f9985d.a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j > 0) {
            this.a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    void b(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            b bVar = this.b.get(i);
            if (bVar != null) {
                Long l = this.a.get(bVar);
                boolean z = true;
                if (l != null) {
                    if (l.longValue() < uptimeMillis) {
                        this.a.remove(bVar);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    bVar.doAnimationFrame(j);
                }
            }
        }
        if (!this.f9987f) {
            return;
        }
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f9987f = false;
                return;
            } else if (this.b.get(size) == null) {
                this.b.remove(size);
            }
        }
    }

    c d() {
        if (this.f9985d == null) {
            this.f9985d = new d(this.f9984c);
        }
        return this.f9985d;
    }

    public void e(b bVar) {
        this.a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.f9987f = true;
        }
    }
}
