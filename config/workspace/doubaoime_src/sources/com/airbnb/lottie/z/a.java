package com.airbnb.lottie.z;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.g;

/* loaded from: classes.dex */
public class a<T> {

    @Nullable
    private final g a;

    @Nullable
    public final T b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public T f1459c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final Interpolator f1460d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final Interpolator f1461e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final Interpolator f1462f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1463g;

    @Nullable
    public Float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private float m;
    private float n;
    public PointF o;
    public PointF p;

    public a(g gVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f2, @Nullable Float f3) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = gVar;
        this.b = t;
        this.f1459c = t2;
        this.f1460d = interpolator;
        this.f1461e = null;
        this.f1462f = null;
        this.f1463g = f2;
        this.h = f3;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return f2 >= e() && f2 < b();
    }

    public float b() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            } else {
                this.n = ((this.h.floatValue() - this.f1463g) / this.a.e()) + e();
            }
        }
        return this.n;
    }

    public float c() {
        if (this.j == -3987645.8f) {
            this.j = ((Float) this.f1459c).floatValue();
        }
        return this.j;
    }

    public int d() {
        if (this.l == 784923401) {
            this.l = ((Integer) this.f1459c).intValue();
        }
        return this.l;
    }

    public float e() {
        g gVar = this.a;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.f1463g - gVar.p()) / this.a.e();
        }
        return this.m;
    }

    public float f() {
        if (this.i == -3987645.8f) {
            this.i = ((Float) this.b).floatValue();
        }
        return this.i;
    }

    public int g() {
        if (this.k == 784923401) {
            this.k = ((Integer) this.b).intValue();
        }
        return this.k;
    }

    public boolean h() {
        return this.f1460d == null && this.f1461e == null && this.f1462f == null;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Keyframe{startValue=");
        M.append(this.b);
        M.append(", endValue=");
        M.append(this.f1459c);
        M.append(", startFrame=");
        M.append(this.f1463g);
        M.append(", endFrame=");
        M.append(this.h);
        M.append(", interpolator=");
        M.append(this.f1460d);
        M.append('}');
        return M.toString();
    }

    public a(g gVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f2, @Nullable Float f3) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = gVar;
        this.b = t;
        this.f1459c = t2;
        this.f1460d = null;
        this.f1461e = interpolator;
        this.f1462f = interpolator2;
        this.f1463g = f2;
        this.h = null;
    }

    protected a(g gVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f2, @Nullable Float f3) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = gVar;
        this.b = t;
        this.f1459c = t2;
        this.f1460d = interpolator;
        this.f1461e = interpolator2;
        this.f1462f = interpolator3;
        this.f1463g = f2;
        this.h = f3;
    }

    public a(T t) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = t;
        this.f1459c = t;
        this.f1460d = null;
        this.f1461e = null;
        this.f1462f = null;
        this.f1463g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
