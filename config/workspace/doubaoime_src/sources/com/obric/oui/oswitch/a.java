package com.obric.oui.oswitch;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a extends Drawable {
    private int a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f7871c;

    /* renamed from: d, reason: collision with root package name */
    private int f7872d;

    /* renamed from: e, reason: collision with root package name */
    private int f7873e;

    /* renamed from: f, reason: collision with root package name */
    private int f7874f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7875g;
    private boolean h;
    private Interpolator i;
    private final Drawable j;
    private final Drawable k;

    public a(Drawable drawable, Drawable drawable2) {
        l.f(drawable, "startDrawable");
        l.f(drawable2, "endDrawable");
        this.j = drawable;
        this.k = drawable2;
        this.h = true;
        this.i = new AccelerateInterpolator();
    }

    private final void a(Canvas canvas, int i) {
        this.j.setBounds(getBounds());
        this.k.setBounds(getBounds());
        if (this.h) {
            this.j.setAlpha(255 - i);
        }
        this.j.draw(canvas);
        if (this.h) {
            this.j.setAlpha(255);
        }
        if (i > 0) {
            this.k.setAlpha(i);
            this.k.draw(canvas);
            this.k.setAlpha(255);
        }
    }

    public final void b() {
        this.f7874f = 0;
        this.a = 0;
        invalidateSelf();
    }

    public final void c(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.a == 2) {
            long j = this.b;
            long j2 = uptimeMillis - j;
            int i2 = this.f7871c;
            if (j2 <= i2) {
                boolean z = !this.f7875g;
                this.f7875g = z;
                this.f7872d = this.f7874f;
                this.f7873e = z ? 0 : 255;
                long j3 = uptimeMillis - j;
                this.f7871c = z ? (int) j3 : i2 - ((int) j3);
                this.a = 1;
                invalidateSelf();
                return;
            }
        }
        this.f7872d = 255;
        this.f7873e = 0;
        this.f7874f = 255;
        this.f7871c = i;
        this.f7875g = true;
        this.a = 1;
        invalidateSelf();
    }

    public final void d() {
        this.f7874f = 255;
        this.a = 0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        int i = this.a;
        if (i == 1) {
            this.b = SystemClock.uptimeMillis();
            this.a = 2;
        } else if (i == 2) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.b;
            int i2 = this.f7871c;
            if (uptimeMillis >= i2) {
                this.f7874f = this.f7873e;
                this.a = 0;
            } else {
                float interpolation = this.i.getInterpolation(uptimeMillis / i2);
                this.f7874f = this.f7872d + ((int) ((this.f7873e - r1) * interpolation));
            }
        }
        int i3 = this.f7874f;
        if (this.a != 0) {
            a(canvas, i3);
            if (this.a == 2) {
                invalidateSelf();
                return;
            }
            return;
        }
        if (i3 == 0) {
            this.j.setBounds(getBounds());
            this.j.draw(canvas);
        } else if (i3 != 255) {
            a(canvas, i3);
        } else {
            this.k.setBounds(getBounds());
            this.k.draw(canvas);
        }
    }

    public final void e(int i) {
        this.f7872d = 0;
        this.f7873e = 255;
        this.f7874f = 0;
        this.f7871c = i;
        this.f7875g = false;
        this.a = 1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.j.getIntrinsicHeight(), this.k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.j.getIntrinsicWidth(), this.k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.j.setAlpha(i);
        this.k.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        this.k.setColorFilter(colorFilter);
    }
}
