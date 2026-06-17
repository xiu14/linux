package e.c.f.a.b.d;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class b implements e.c.f.a.b.b {
    private int a = -1;
    private e.c.c.g.a<Bitmap> b;

    private synchronized void g() {
        e.c.c.g.a<Bitmap> aVar = this.b;
        int i = e.c.c.g.a.h;
        if (aVar != null) {
            aVar.close();
        }
        this.b = null;
        this.a = -1;
    }

    @Override // e.c.f.a.b.b
    public synchronized e.c.c.g.a<Bitmap> a(int i, int i2, int i3) {
        try {
        } finally {
            g();
        }
        return e.c.c.g.a.h(this.b);
    }

    @Override // e.c.f.a.b.b
    public void b(int i, e.c.c.g.a<Bitmap> aVar, int i2) {
    }

    @Override // e.c.f.a.b.b
    public synchronized boolean c(int i) {
        boolean z;
        if (i == this.a) {
            z = e.c.c.g.a.x(this.b);
        }
        return z;
    }

    @Override // e.c.f.a.b.b
    public synchronized void clear() {
        g();
    }

    @Override // e.c.f.a.b.b
    public synchronized e.c.c.g.a<Bitmap> d(int i) {
        if (this.a != i) {
            return null;
        }
        return e.c.c.g.a.h(this.b);
    }

    @Override // e.c.f.a.b.b
    public synchronized void e(int i, e.c.c.g.a<Bitmap> aVar, int i2) {
        if (aVar != null) {
            if (this.b != null && aVar.r().equals(this.b.r())) {
                return;
            }
        }
        e.c.c.g.a<Bitmap> aVar2 = this.b;
        int i3 = e.c.c.g.a.h;
        if (aVar2 != null) {
            aVar2.close();
        }
        this.b = e.c.c.g.a.h(aVar);
        this.a = i;
    }

    @Override // e.c.f.a.b.b
    public synchronized e.c.c.g.a<Bitmap> f(int i) {
        return e.c.c.g.a.h(this.b);
    }
}
