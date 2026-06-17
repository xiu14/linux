package com.airbnb.lottie.v.c;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f1423c;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    protected com.airbnb.lottie.z.c<A> f1425e;
    final List<b> a = new ArrayList(1);
    private boolean b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f1424d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private A f1426f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f1427g = -1.0f;
    private float h = -1.0f;

    public interface b {
        void a();
    }

    private static final class c<T> implements d<T> {
        c(C0019a c0019a) {
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean a(float f2) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public com.airbnb.lottie.z.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean c(float f2) {
            return false;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public float d() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public float e() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d<T> {
        boolean a(float f2);

        com.airbnb.lottie.z.a<T> b();

        boolean c(float f2);

        @FloatRange(from = 0.0d, to = 1.0d)
        float d();

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    private static final class e<T> implements d<T> {
        private final List<? extends com.airbnb.lottie.z.a<T>> a;

        /* renamed from: c, reason: collision with root package name */
        private com.airbnb.lottie.z.a<T> f1428c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f1429d = -1.0f;

        @NonNull
        private com.airbnb.lottie.z.a<T> b = f(0.0f);

        e(List<? extends com.airbnb.lottie.z.a<T>> list) {
            this.a = list;
        }

        private com.airbnb.lottie.z.a<T> f(float f2) {
            List<? extends com.airbnb.lottie.z.a<T>> list = this.a;
            com.airbnb.lottie.z.a<T> aVar = list.get(list.size() - 1);
            if (f2 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.z.a<T> aVar2 = this.a.get(size);
                if (this.b != aVar2 && aVar2.a(f2)) {
                    return aVar2;
                }
            }
            return this.a.get(0);
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean a(float f2) {
            com.airbnb.lottie.z.a<T> aVar = this.f1428c;
            com.airbnb.lottie.z.a<T> aVar2 = this.b;
            if (aVar == aVar2 && this.f1429d == f2) {
                return true;
            }
            this.f1428c = aVar2;
            this.f1429d = f2;
            return false;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        @NonNull
        public com.airbnb.lottie.z.a<T> b() {
            return this.b;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean c(float f2) {
            if (this.b.a(f2)) {
                return !this.b.h();
            }
            this.b = f(f2);
            return true;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public float d() {
            return this.a.get(r0.size() - 1).b();
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public float e() {
            return this.a.get(0).e();
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f<T> implements d<T> {

        @NonNull
        private final com.airbnb.lottie.z.a<T> a;
        private float b = -1.0f;

        f(List<? extends com.airbnb.lottie.z.a<T>> list) {
            this.a = list.get(0);
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean a(float f2) {
            if (this.b == f2) {
                return true;
            }
            this.b = f2;
            return false;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public com.airbnb.lottie.z.a<T> b() {
            return this.a;
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean c(float f2) {
            return !this.a.h();
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public float d() {
            return this.a.b();
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public float e() {
            return this.a.e();
        }

        @Override // com.airbnb.lottie.v.c.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends com.airbnb.lottie.z.a<K>> list) {
        d fVar;
        if (list.isEmpty()) {
            fVar = new c(null);
        } else {
            fVar = list.size() == 1 ? new f(list) : new e(list);
        }
        this.f1423c = fVar;
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    protected com.airbnb.lottie.z.a<K> b() {
        com.airbnb.lottie.z.a<K> b2 = this.f1423c.b();
        com.airbnb.lottie.d.a("BaseKeyframeAnimation#getCurrentKeyframe");
        return b2;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    float c() {
        if (this.h == -1.0f) {
            this.h = this.f1423c.d();
        }
        return this.h;
    }

    protected float d() {
        com.airbnb.lottie.z.a<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return b2.f1460d.getInterpolation(e());
    }

    float e() {
        if (this.b) {
            return 0.0f;
        }
        com.airbnb.lottie.z.a<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return (this.f1424d - b2.e()) / (b2.b() - b2.e());
    }

    public float f() {
        return this.f1424d;
    }

    public A g() {
        float e2 = e();
        if (this.f1425e == null && this.f1423c.a(e2)) {
            return this.f1426f;
        }
        com.airbnb.lottie.z.a<K> b2 = b();
        Interpolator interpolator = b2.f1461e;
        A h = (interpolator == null || b2.f1462f == null) ? h(b2, d()) : i(b2, e2, interpolator.getInterpolation(e2), b2.f1462f.getInterpolation(e2));
        this.f1426f = h;
        return h;
    }

    abstract A h(com.airbnb.lottie.z.a<K> aVar, float f2);

    protected A i(com.airbnb.lottie.z.a<K> aVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void j() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    public void k() {
        this.b = true;
    }

    public void l(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (this.f1423c.isEmpty()) {
            return;
        }
        if (this.f1427g == -1.0f) {
            this.f1427g = this.f1423c.e();
        }
        float f3 = this.f1427g;
        if (f2 < f3) {
            if (f3 == -1.0f) {
                this.f1427g = this.f1423c.e();
            }
            f2 = this.f1427g;
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.f1424d) {
            return;
        }
        this.f1424d = f2;
        if (this.f1423c.c(f2)) {
            j();
        }
    }

    public void m(@Nullable com.airbnb.lottie.z.c<A> cVar) {
        com.airbnb.lottie.z.c<A> cVar2 = this.f1425e;
        if (cVar2 != null) {
            Objects.requireNonNull(cVar2);
        }
        this.f1425e = cVar;
    }
}
