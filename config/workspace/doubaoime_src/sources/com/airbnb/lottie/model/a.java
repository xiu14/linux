package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class a {
    private final PointF a;
    private final PointF b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f1289c;

    public a() {
        this.a = new PointF();
        this.b = new PointF();
        this.f1289c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.f1289c;
    }

    public void d(float f2, float f3) {
        this.a.set(f2, f3);
    }

    public void e(float f2, float f3) {
        this.b.set(f2, f3);
    }

    public void f(float f2, float f3) {
        this.f1289c.set(f2, f3);
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.f1289c = pointF3;
    }
}
