package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.a;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private int a;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private Drawable f1836e;

    /* renamed from: f, reason: collision with root package name */
    private int f1837f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private Drawable f1838g;
    private int h;
    private boolean m;

    @Nullable
    private Drawable o;
    private int p;
    private boolean t;

    @Nullable
    private Resources.Theme u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean z;
    private float b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private com.bumptech.glide.load.engine.j f1834c = com.bumptech.glide.load.engine.j.f1647c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private Priority f1835d = Priority.NORMAL;
    private boolean i = true;
    private int j = -1;
    private int k = -1;

    @NonNull
    private com.bumptech.glide.load.d l = com.bumptech.glide.q.a.c();
    private boolean n = true;

    @NonNull
    private com.bumptech.glide.load.f q = new com.bumptech.glide.load.f();

    @NonNull
    private Map<Class<?>, com.bumptech.glide.load.i<?>> r = new CachedHashCodeArrayMap();

    @NonNull
    private Class<?> s = Object.class;
    private boolean y = true;

    private static boolean F(int i, int i2) {
        return (i & i2) != 0;
    }

    protected final boolean A() {
        return this.v;
    }

    public final boolean B(a<?> aVar) {
        return Float.compare(aVar.b, this.b) == 0 && this.f1837f == aVar.f1837f && com.bumptech.glide.util.j.b(this.f1836e, aVar.f1836e) && this.h == aVar.h && com.bumptech.glide.util.j.b(this.f1838g, aVar.f1838g) && this.p == aVar.p && com.bumptech.glide.util.j.b(this.o, aVar.o) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.m == aVar.m && this.n == aVar.n && this.w == aVar.w && this.x == aVar.x && this.f1834c.equals(aVar.f1834c) && this.f1835d == aVar.f1835d && this.q.equals(aVar.q) && this.r.equals(aVar.r) && this.s.equals(aVar.s) && com.bumptech.glide.util.j.b(this.l, aVar.l) && com.bumptech.glide.util.j.b(this.u, aVar.u);
    }

    public final boolean C() {
        return this.i;
    }

    public final boolean D() {
        return F(this.a, 8);
    }

    boolean E() {
        return this.y;
    }

    public final boolean G() {
        return this.n;
    }

    public final boolean H() {
        return this.m;
    }

    public final boolean I() {
        return F(this.a, 2048);
    }

    public final boolean J() {
        return com.bumptech.glide.util.j.j(this.k, this.j);
    }

    @NonNull
    public T K() {
        this.t = true;
        return this;
    }

    @NonNull
    @CheckResult
    public T L() {
        return O(DownsampleStrategy.f1742c, new com.bumptech.glide.load.resource.bitmap.i());
    }

    @NonNull
    @CheckResult
    public T M() {
        T O = O(DownsampleStrategy.b, new com.bumptech.glide.load.resource.bitmap.j());
        O.y = true;
        return O;
    }

    @NonNull
    @CheckResult
    public T N() {
        T O = O(DownsampleStrategy.a, new q());
        O.y = true;
        return O;
    }

    @NonNull
    final T O(@NonNull DownsampleStrategy downsampleStrategy, @NonNull com.bumptech.glide.load.i<Bitmap> iVar) {
        if (this.v) {
            return (T) clone().O(downsampleStrategy, iVar);
        }
        f(downsampleStrategy);
        return Z(iVar, false);
    }

    @NonNull
    @CheckResult
    public <Y> T P(@NonNull Class<Y> cls, @NonNull com.bumptech.glide.load.i<Y> iVar) {
        return a0(cls, iVar, false);
    }

    @NonNull
    @CheckResult
    public T Q(int i, int i2) {
        if (this.v) {
            return (T) clone().Q(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T R(@DrawableRes int i) {
        if (this.v) {
            return (T) clone().R(i);
        }
        this.h = i;
        int i2 = this.a | 128;
        this.a = i2;
        this.f1838g = null;
        this.a = i2 & (-65);
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T S(@NonNull Priority priority) {
        if (this.v) {
            return (T) clone().S(priority);
        }
        Objects.requireNonNull(priority, "Argument must not be null");
        this.f1835d = priority;
        this.a |= 8;
        T();
        return this;
    }

    @NonNull
    protected final T T() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    @NonNull
    @CheckResult
    public <Y> T U(@NonNull com.bumptech.glide.load.e<Y> eVar, @NonNull Y y) {
        if (this.v) {
            return (T) clone().U(eVar, y);
        }
        Objects.requireNonNull(eVar, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.q.e(eVar, y);
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T V(@NonNull com.bumptech.glide.load.d dVar) {
        if (this.v) {
            return (T) clone().V(dVar);
        }
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.l = dVar;
        this.a |= 1024;
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T W(boolean z) {
        if (this.v) {
            return (T) clone().W(true);
        }
        this.i = !z;
        this.a |= 256;
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T X(@IntRange(from = 0) int i) {
        return U(com.bumptech.glide.load.j.A.a.b, Integer.valueOf(i));
    }

    @NonNull
    @CheckResult
    public T Y(@NonNull com.bumptech.glide.load.i<Bitmap> iVar) {
        return Z(iVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    T Z(@NonNull com.bumptech.glide.load.i<Bitmap> iVar, boolean z) {
        if (this.v) {
            return (T) clone().Z(iVar, z);
        }
        o oVar = new o(iVar, z);
        a0(Bitmap.class, iVar, z);
        a0(Drawable.class, oVar, z);
        a0(BitmapDrawable.class, oVar, z);
        a0(GifDrawable.class, new com.bumptech.glide.load.resource.gif.e(iVar), z);
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T a(@NonNull a<?> aVar) {
        if (this.v) {
            return (T) clone().a(aVar);
        }
        if (F(aVar.a, 2)) {
            this.b = aVar.b;
        }
        if (F(aVar.a, 262144)) {
            this.w = aVar.w;
        }
        if (F(aVar.a, 1048576)) {
            this.z = aVar.z;
        }
        if (F(aVar.a, 4)) {
            this.f1834c = aVar.f1834c;
        }
        if (F(aVar.a, 8)) {
            this.f1835d = aVar.f1835d;
        }
        if (F(aVar.a, 16)) {
            this.f1836e = aVar.f1836e;
            this.f1837f = 0;
            this.a &= -33;
        }
        if (F(aVar.a, 32)) {
            this.f1837f = aVar.f1837f;
            this.f1836e = null;
            this.a &= -17;
        }
        if (F(aVar.a, 64)) {
            this.f1838g = aVar.f1838g;
            this.h = 0;
            this.a &= -129;
        }
        if (F(aVar.a, 128)) {
            this.h = aVar.h;
            this.f1838g = null;
            this.a &= -65;
        }
        if (F(aVar.a, 256)) {
            this.i = aVar.i;
        }
        if (F(aVar.a, 512)) {
            this.k = aVar.k;
            this.j = aVar.j;
        }
        if (F(aVar.a, 1024)) {
            this.l = aVar.l;
        }
        if (F(aVar.a, 4096)) {
            this.s = aVar.s;
        }
        if (F(aVar.a, 8192)) {
            this.o = aVar.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (F(aVar.a, 16384)) {
            this.p = aVar.p;
            this.o = null;
            this.a &= -8193;
        }
        if (F(aVar.a, 32768)) {
            this.u = aVar.u;
        }
        if (F(aVar.a, 65536)) {
            this.n = aVar.n;
        }
        if (F(aVar.a, 131072)) {
            this.m = aVar.m;
        }
        if (F(aVar.a, 2048)) {
            this.r.putAll(aVar.r);
            this.y = aVar.y;
        }
        if (F(aVar.a, 524288)) {
            this.x = aVar.x;
        }
        if (!this.n) {
            this.r.clear();
            int i = this.a & (-2049);
            this.a = i;
            this.m = false;
            this.a = i & (-131073);
            this.y = true;
        }
        this.a |= aVar.a;
        this.q.d(aVar.q);
        T();
        return this;
    }

    @NonNull
    <Y> T a0(@NonNull Class<Y> cls, @NonNull com.bumptech.glide.load.i<Y> iVar, boolean z) {
        if (this.v) {
            return (T) clone().a0(cls, iVar, z);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(iVar, "Argument must not be null");
        this.r.put(cls, iVar);
        int i = this.a | 2048;
        this.a = i;
        this.n = true;
        int i2 = i | 65536;
        this.a = i2;
        this.y = false;
        if (z) {
            this.a = i2 | 131072;
            this.m = true;
        }
        T();
        return this;
    }

    @NonNull
    public T b() {
        if (this.t && !this.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.v = true;
        return K();
    }

    @NonNull
    @CheckResult
    public T b0(boolean z) {
        if (this.v) {
            return (T) clone().b0(z);
        }
        this.z = z;
        this.a |= 1048576;
        T();
        return this;
    }

    @Override // 
    @CheckResult
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            com.bumptech.glide.load.f fVar = new com.bumptech.glide.load.f();
            t.q = fVar;
            fVar.d(this.q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.r);
            t.t = false;
            t.v = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @NonNull
    @CheckResult
    public T d(@NonNull Class<?> cls) {
        if (this.v) {
            return (T) clone().d(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.s = cls;
        this.a |= 4096;
        T();
        return this;
    }

    @NonNull
    @CheckResult
    public T e(@NonNull com.bumptech.glide.load.engine.j jVar) {
        if (this.v) {
            return (T) clone().e(jVar);
        }
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.f1834c = jVar;
        this.a |= 4;
        T();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return B((a) obj);
        }
        return false;
    }

    @NonNull
    @CheckResult
    public T f(@NonNull DownsampleStrategy downsampleStrategy) {
        com.bumptech.glide.load.e eVar = DownsampleStrategy.f1745f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        return U(eVar, downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public T g(@DrawableRes int i) {
        if (this.v) {
            return (T) clone().g(i);
        }
        this.f1837f = i;
        int i2 = this.a | 32;
        this.a = i2;
        this.f1836e = null;
        this.a = i2 & (-17);
        T();
        return this;
    }

    @NonNull
    public final com.bumptech.glide.load.engine.j h() {
        return this.f1834c;
    }

    public int hashCode() {
        float f2 = this.b;
        int i = com.bumptech.glide.util.j.f1862d;
        return com.bumptech.glide.util.j.g(this.u, com.bumptech.glide.util.j.g(this.l, com.bumptech.glide.util.j.g(this.s, com.bumptech.glide.util.j.g(this.r, com.bumptech.glide.util.j.g(this.q, com.bumptech.glide.util.j.g(this.f1835d, com.bumptech.glide.util.j.g(this.f1834c, (((((((((((((com.bumptech.glide.util.j.g(this.o, (com.bumptech.glide.util.j.g(this.f1838g, (com.bumptech.glide.util.j.g(this.f1836e, ((Float.floatToIntBits(f2) + 527) * 31) + this.f1837f) * 31) + this.h) * 31) + this.p) * 31) + (this.i ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0))))))));
    }

    public final int i() {
        return this.f1837f;
    }

    @Nullable
    public final Drawable j() {
        return this.f1836e;
    }

    @Nullable
    public final Drawable k() {
        return this.o;
    }

    public final int l() {
        return this.p;
    }

    public final boolean m() {
        return this.x;
    }

    @NonNull
    public final com.bumptech.glide.load.f n() {
        return this.q;
    }

    public final int o() {
        return this.j;
    }

    public final int p() {
        return this.k;
    }

    @Nullable
    public final Drawable q() {
        return this.f1838g;
    }

    public final int r() {
        return this.h;
    }

    @NonNull
    public final Priority s() {
        return this.f1835d;
    }

    @NonNull
    public final Class<?> t() {
        return this.s;
    }

    @NonNull
    public final com.bumptech.glide.load.d u() {
        return this.l;
    }

    public final float v() {
        return this.b;
    }

    @Nullable
    public final Resources.Theme w() {
        return this.u;
    }

    @NonNull
    public final Map<Class<?>, com.bumptech.glide.load.i<?>> x() {
        return this.r;
    }

    public final boolean y() {
        return this.z;
    }

    public final boolean z() {
        return this.w;
    }
}
