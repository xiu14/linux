package it.sephiroth.android.library.imagezoom;

import android.graphics.RectF;
import java.util.Objects;

/* loaded from: classes2.dex */
class a implements Runnable {
    double a = 0.0d;
    double b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ double f10092c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f10093d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ double f10094e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ double f10095f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ImageViewTouchBase f10096g;

    a(ImageViewTouchBase imageViewTouchBase, double d2, long j, double d3, double d4) {
        this.f10096g = imageViewTouchBase;
        this.f10092c = d2;
        this.f10093d = j;
        this.f10094e = d3;
        this.f10095f = d4;
    }

    @Override // java.lang.Runnable
    public void run() {
        double min = Math.min(this.f10092c, System.currentTimeMillis() - this.f10093d);
        it.sephiroth.android.library.easing.a aVar = this.f10096g.a;
        double d2 = this.f10094e;
        double d3 = this.f10092c;
        Objects.requireNonNull(aVar);
        double d4 = (min / d3) - 1.0d;
        double d5 = (((d4 * d4 * d4) + 1.0d) * d2) + 0.0d;
        it.sephiroth.android.library.easing.a aVar2 = this.f10096g.a;
        double d6 = this.f10095f;
        double d7 = this.f10092c;
        Objects.requireNonNull(aVar2);
        double d8 = (min / d7) - 1.0d;
        double d9 = (((d8 * d8 * d8) + 1.0d) * d6) + 0.0d;
        this.f10096g.n(d5 - this.a, d9 - this.b);
        this.a = d5;
        this.b = d9;
        if (min < this.f10092c) {
            this.f10096g.f10081e.post(this);
            return;
        }
        ImageViewTouchBase imageViewTouchBase = this.f10096g;
        RectF d10 = imageViewTouchBase.d(imageViewTouchBase.f10079c, true, true);
        float f2 = d10.left;
        if (f2 == 0.0f && d10.top == 0.0f) {
            return;
        }
        this.f10096g.n(f2, d10.top);
    }
}
