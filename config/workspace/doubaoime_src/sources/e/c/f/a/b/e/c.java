package e.c.f.a.b.e;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class c implements b {
    private final e.c.h.d.b a;
    private final e.c.f.a.b.c b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f9816c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f9817d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<Runnable> f9818e = new SparseArray<>();

    private class a implements Runnable {
        private final e.c.f.a.b.b a;
        private final e.c.f.a.a.a b;

        /* renamed from: c, reason: collision with root package name */
        private final int f9819c;

        /* renamed from: d, reason: collision with root package name */
        private final int f9820d;

        public a(e.c.f.a.a.a aVar, e.c.f.a.b.b bVar, int i, int i2) {
            this.b = aVar;
            this.a = bVar;
            this.f9819c = i;
            this.f9820d = i2;
        }

        private boolean a(int i, int i2) {
            e.c.c.g.a<Bitmap> a;
            int i3 = 2;
            AutoCloseable autoCloseable = null;
            try {
                if (i2 == 1) {
                    a = this.a.a(i, this.b.j(), this.b.h());
                } else {
                    if (i2 != 2) {
                        int i4 = e.c.c.g.a.h;
                        return false;
                    }
                    try {
                        a = c.this.a.a(this.b.j(), this.b.h(), c.this.f9816c);
                        i3 = -1;
                    } catch (RuntimeException e2) {
                        e.c.c.e.a.u(c.class, "Failed to create frame bitmap", e2);
                        int i5 = e.c.c.g.a.h;
                        return false;
                    }
                }
                boolean b = b(i, a, i2);
                if (a != null) {
                    a.close();
                }
                return (b || i3 == -1) ? b : a(i, i3);
            } catch (Throwable th) {
                int i6 = e.c.c.g.a.h;
                if (0 != 0) {
                    autoCloseable.close();
                }
                throw th;
            }
        }

        private boolean b(int i, e.c.c.g.a<Bitmap> aVar, int i2) {
            if (!e.c.c.g.a.x(aVar)) {
                return false;
            }
            if (!((e.c.f.a.b.f.b) c.this.b).d(i, aVar.r())) {
                return false;
            }
            e.c.c.e.a.n(c.class, "Frame %d ready.", Integer.valueOf(this.f9819c));
            synchronized (c.this.f9818e) {
                this.a.b(this.f9819c, aVar, i2);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.a.c(this.f9819c)) {
                    e.c.c.e.a.n(c.class, "Frame %d is cached already.", Integer.valueOf(this.f9819c));
                    synchronized (c.this.f9818e) {
                        c.this.f9818e.remove(this.f9820d);
                    }
                    return;
                }
                if (a(this.f9819c, 1)) {
                    e.c.c.e.a.n(c.class, "Prepared frame frame %d.", Integer.valueOf(this.f9819c));
                } else {
                    e.c.c.e.a.g(c.class, "Could not prepare frame %d.", Integer.valueOf(this.f9819c));
                }
                synchronized (c.this.f9818e) {
                    c.this.f9818e.remove(this.f9820d);
                }
            } catch (Throwable th) {
                synchronized (c.this.f9818e) {
                    c.this.f9818e.remove(this.f9820d);
                    throw th;
                }
            }
        }
    }

    public c(e.c.h.d.b bVar, e.c.f.a.b.c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.a = bVar;
        this.b = cVar;
        this.f9816c = config;
        this.f9817d = executorService;
    }

    public boolean e(e.c.f.a.b.b bVar, e.c.f.a.a.a aVar, int i) {
        int hashCode = (aVar.hashCode() * 31) + i;
        synchronized (this.f9818e) {
            if (this.f9818e.get(hashCode) != null) {
                e.c.c.e.a.n(c.class, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                return true;
            }
            if (bVar.c(i)) {
                e.c.c.e.a.n(c.class, "Frame %d is cached already.", Integer.valueOf(i));
                return true;
            }
            a aVar2 = new a(aVar, bVar, i, hashCode);
            this.f9818e.put(hashCode, aVar2);
            this.f9817d.execute(aVar2);
            return true;
        }
    }
}
