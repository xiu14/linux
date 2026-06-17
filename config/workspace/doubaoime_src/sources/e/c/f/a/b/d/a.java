package e.c.f.a.b.d;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.imagepipeline.image.d;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.i;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements e.c.f.a.b.b {
    private final com.facebook.imagepipeline.animated.impl.c a;
    private final boolean b;

    /* renamed from: d, reason: collision with root package name */
    private e.c.c.g.a<d> f9814d;

    /* renamed from: e, reason: collision with root package name */
    private int f9815e = -1;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<e.c.c.g.a<d>> f9813c = new SparseArray<>();

    public a(com.facebook.imagepipeline.animated.impl.c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    static e.c.c.g.a<Bitmap> g(e.c.c.g.a<d> aVar) {
        e eVar;
        try {
            if (e.c.c.g.a.x(aVar) && (aVar.r() instanceof e) && (eVar = (e) aVar.r()) != null) {
                e.c.c.g.a<Bitmap> w = eVar.w();
                aVar.close();
                return w;
            }
            if (aVar != null) {
                aVar.close();
            }
            return null;
        } catch (Throwable th) {
            int i = e.c.c.g.a.h;
            if (aVar != null) {
                aVar.close();
            }
            throw th;
        }
    }

    private synchronized void h(int i) {
        e.c.c.g.a<d> aVar = this.f9813c.get(i);
        if (aVar != null) {
            this.f9813c.delete(i);
            int i2 = e.c.c.g.a.h;
            aVar.close();
            e.c.c.e.a.o(a.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f9813c);
        }
    }

    @Override // e.c.f.a.b.b
    public synchronized e.c.c.g.a<Bitmap> a(int i, int i2, int i3) {
        if (!this.b) {
            return null;
        }
        return g(this.a.f());
    }

    @Override // e.c.f.a.b.b
    public synchronized void b(int i, e.c.c.g.a<Bitmap> aVar, int i2) {
        AutoCloseable autoCloseable = null;
        try {
            e.c.c.g.a<d> z = e.c.c.g.a.z(new e(aVar, i.f6481d, 0));
            if (z == null) {
                if (z != null) {
                    z.close();
                }
                return;
            }
            e.c.c.g.a<d> b = this.a.b(i, z);
            if (e.c.c.g.a.x(b)) {
                e.c.c.g.a<d> aVar2 = this.f9813c.get(i);
                if (aVar2 != null) {
                    aVar2.close();
                }
            } else {
                b = z.clone();
                e.c.c.g.a<d> aVar3 = this.f9813c.get(i);
                if (aVar3 != null) {
                    aVar3.close();
                }
            }
            this.f9813c.put(i, b);
            e.c.c.e.a.o(a.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f9813c);
            z.close();
        } catch (Throwable th) {
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th;
        }
    }

    @Override // e.c.f.a.b.b
    public synchronized boolean c(int i) {
        boolean z;
        if (!this.a.d(i)) {
            z = this.f9813c.get(i) != null;
        }
        return z;
    }

    @Override // e.c.f.a.b.b
    public synchronized void clear() {
        e.c.c.g.a<d> aVar = this.f9814d;
        int i = e.c.c.g.a.h;
        if (aVar != null) {
            aVar.close();
        }
        this.a.c(this.f9815e);
        this.f9814d = null;
        this.f9815e = -1;
        for (int i2 = 0; i2 < this.f9813c.size(); i2++) {
            e.c.c.g.a<d> valueAt = this.f9813c.valueAt(i2);
            if (valueAt != null) {
                valueAt.close();
                this.a.c(this.f9813c.keyAt(i2));
            }
        }
        this.f9813c.clear();
    }

    @Override // e.c.f.a.b.b
    public synchronized e.c.c.g.a<Bitmap> d(int i) {
        if (this.a.d(i)) {
            return g(this.a.e(i));
        }
        return g(e.c.c.g.a.h(this.f9813c.get(i)));
    }

    @Override // e.c.f.a.b.b
    public synchronized void e(int i, e.c.c.g.a<Bitmap> aVar, int i2) {
        Objects.requireNonNull(aVar);
        h(i);
        e.c.c.g.a<d> aVar2 = null;
        try {
            aVar2 = e.c.c.g.a.z(new e(aVar, i.f6481d, 0));
            if (aVar2 != null) {
                e.c.c.g.a<d> aVar3 = this.f9814d;
                if (aVar3 != null) {
                    aVar3.close();
                }
                this.f9814d = this.a.b(i, aVar2);
                this.f9815e = i;
            }
        } finally {
            if (aVar2 != null) {
                aVar2.close();
            }
        }
    }

    @Override // e.c.f.a.b.b
    public synchronized e.c.c.g.a<Bitmap> f(int i) {
        return g(e.c.c.g.a.h(this.f9814d));
    }
}
