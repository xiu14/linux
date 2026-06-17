package e.i.b.b.b;

import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import e.i.b.b.b.a;
import e.i.b.b.b.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class b<T extends b<T>> implements a.b {
    public static final l m = new c("translationY");
    public static final l n = new d("scaleX");
    public static final l o = new e("scaleY");
    public static final l p = new f(Key.ROTATION);
    public static final l q = new g("rotationX");
    public static final l r = new h("rotationY");
    public static final l s = new a("alpha");

    /* renamed from: d, reason: collision with root package name */
    final Object f9990d;

    /* renamed from: e, reason: collision with root package name */
    final e.i.b.b.b.c f9991e;
    private float j;
    float a = 0.0f;
    float b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    boolean f9989c = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f9992f = false;

    /* renamed from: g, reason: collision with root package name */
    float f9993g = Float.MAX_VALUE;
    float h = -3.4028235E38f;
    private long i = 0;
    private final ArrayList<j> k = new ArrayList<>();
    private final ArrayList<k> l = new ArrayList<>();

    class a extends l {
        a(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setAlpha(f2);
        }
    }

    /* renamed from: e.i.b.b.b.b$b, reason: collision with other inner class name */
    class C0463b extends l {
    }

    class c extends l {
        c(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setTranslationY(f2);
        }
    }

    class d extends l {
        d(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setScaleX(f2);
        }
    }

    class e extends l {
        e(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setScaleY(f2);
        }
    }

    class f extends l {
        f(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getRotation();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setRotation(f2);
        }
    }

    class g extends l {
        g(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setRotationX(f2);
        }
    }

    class h extends l {
        h(String str) {
            super(str, null);
        }

        @Override // e.i.b.b.b.c
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // e.i.b.b.b.c
        public void b(View view, float f2) {
            view.setRotationY(f2);
        }
    }

    static class i {
        float a;
        float b;

        i() {
        }
    }

    public interface j {
        void a(b bVar, boolean z, float f2, float f3);
    }

    public interface k {
        void a(b bVar, float f2, float f3);
    }

    public static abstract class l extends e.i.b.b.b.c<View> {
        l(String str, C0463b c0463b) {
            super(str);
        }
    }

    <K> b(K k2, e.i.b.b.b.c<K> cVar) {
        this.f9990d = k2;
        this.f9991e = cVar;
        if (cVar == p || cVar == q || cVar == r) {
            this.j = 0.1f;
            return;
        }
        if (cVar == s) {
            this.j = 0.00390625f;
        } else if (cVar == n || cVar == o) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
    }

    private void c(boolean z) {
        this.f9992f = false;
        e.i.b.b.b.a.c().e(this);
        this.i = 0L;
        this.f9989c = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, z, this.b, this.a);
            }
        }
        g(this.k);
    }

    private static <T> void g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T a(j jVar) {
        if (!this.k.contains(jVar)) {
            this.k.add(jVar);
        }
        return this;
    }

    public T b(k kVar) {
        if (this.f9992f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.l.contains(kVar)) {
            this.l.add(kVar);
        }
        return this;
    }

    float d() {
        return this.j * 0.75f;
    }

    @Override // e.i.b.b.b.a.b
    public boolean doAnimationFrame(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            k(this.b);
            return false;
        }
        this.i = j2;
        boolean m2 = m(j2 - j3);
        float min = Math.min(this.b, this.f9993g);
        this.b = min;
        float max = Math.max(min, this.h);
        this.b = max;
        k(max);
        if (m2) {
            c(false);
        }
        return m2;
    }

    public boolean e() {
        return this.f9992f;
    }

    public void f(j jVar) {
        ArrayList<j> arrayList = this.k;
        int indexOf = arrayList.indexOf(jVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public void h(k kVar) {
        ArrayList<k> arrayList = this.l;
        int indexOf = arrayList.indexOf(kVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public T i(float f2) {
        this.f9993g = f2;
        return this;
    }

    public T j(float f2) {
        this.h = f2;
        return this;
    }

    void k(float f2) {
        this.f9991e.b(this.f9990d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).a(this, this.b, this.a);
            }
        }
        g(this.l);
    }

    public T l(float f2) {
        this.b = f2;
        this.f9989c = true;
        return this;
    }

    abstract boolean m(long j2);
}
