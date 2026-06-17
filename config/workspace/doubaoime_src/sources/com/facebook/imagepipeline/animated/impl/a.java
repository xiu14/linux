package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.d;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements com.facebook.imagepipeline.animated.base.a {
    private final e.c.h.c.b.a a;
    private final d b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.imagepipeline.animated.base.b f6445c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6446d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f6447e;

    /* renamed from: f, reason: collision with root package name */
    private final AnimatedDrawableFrameInfo[] f6448f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f6449g = new Rect();
    private final Rect h = new Rect();
    private int i = 2;
    private Bitmap j;

    public a(e.c.h.c.b.a aVar, d dVar, Rect rect) {
        this.a = aVar;
        this.b = dVar;
        com.facebook.imagepipeline.animated.base.b e2 = dVar.e();
        this.f6445c = e2;
        int[] k = e2.k();
        this.f6447e = k;
        Objects.requireNonNull(aVar);
        for (int i = 0; i < k.length; i++) {
            if (k[i] < 11) {
                k[i] = 100;
            }
        }
        e.c.h.c.b.a aVar2 = this.a;
        int[] iArr = this.f6447e;
        Objects.requireNonNull(aVar2);
        for (int i2 : iArr) {
        }
        e.c.h.c.b.a aVar3 = this.a;
        int[] iArr2 = this.f6447e;
        Objects.requireNonNull(aVar3);
        int[] iArr3 = new int[iArr2.length];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            iArr3[i4] = i3;
            i3 += iArr2[i4];
        }
        this.f6446d = c(this.f6445c, rect);
        this.f6448f = new AnimatedDrawableFrameInfo[this.f6445c.a()];
        for (int i5 = 0; i5 < this.f6445c.a(); i5++) {
            this.f6448f[i5] = this.f6445c.h(i5);
        }
    }

    private static Rect c(com.facebook.imagepipeline.animated.base.b bVar, Rect rect) {
        return rect == null ? new Rect(0, 0, bVar.getWidth(), bVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), bVar.getWidth()), Math.min(rect.height(), bVar.getHeight()));
    }

    private String l(Bitmap bitmap, int i, int i2, Rect rect, int i3) {
        StringBuilder M = e.a.a.a.a.M(", mTempBitmap:");
        M.append(bitmap.getWidth());
        M.append("x");
        M.append(bitmap.getHeight());
        M.append(", frame:");
        M.append(i);
        M.append("x");
        M.append(i2);
        if (rect != null) {
            M.append(", renderedBounds:");
            M.append(rect.width());
            M.append("x");
            M.append(rect.height());
        }
        M.append(", decodeType:");
        M.append(i3);
        return M.toString();
    }

    private synchronized void m(int i, int i2) {
        Bitmap bitmap = this.j;
        if (bitmap != null && (bitmap.getWidth() < i || this.j.getHeight() < i2)) {
            synchronized (this) {
                Bitmap bitmap2 = this.j;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.j = null;
                }
            }
        }
        if (this.j == null) {
            this.j = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    private void o(Canvas canvas, com.facebook.imagepipeline.animated.base.c cVar) {
        int width = cVar.getWidth();
        int height = cVar.getHeight();
        int c2 = cVar.c();
        int d2 = cVar.d();
        synchronized (this) {
            m(width, height);
            synchronized (this.j) {
                this.j.eraseColor(0);
                try {
                    cVar.a(width, height, this.j);
                    this.f6449g.set(0, 0, width, height);
                    this.h.set(0, 0, width, height);
                    canvas.save();
                    canvas.translate(c2, d2);
                    canvas.drawBitmap(this.j, this.f6449g, this.h, (Paint) null);
                    canvas.restore();
                } catch (IllegalStateException e2) {
                    throw new IllegalStateException(e2.getMessage() + l(this.j, width, height, null, this.i));
                }
            }
        }
    }

    private void p(Canvas canvas, com.facebook.imagepipeline.animated.base.c cVar) {
        double width = this.f6446d.width() / this.f6445c.getWidth();
        double height = this.f6446d.height() / this.f6445c.getHeight();
        int round = (int) Math.round(cVar.getWidth() * width);
        int round2 = (int) Math.round(cVar.getHeight() * height);
        int c2 = (int) (cVar.c() * width);
        int d2 = (int) (cVar.d() * height);
        synchronized (this) {
            int width2 = this.f6446d.width();
            int height2 = this.f6446d.height();
            m(width2, height2);
            synchronized (this.j) {
                this.j.eraseColor(0);
                try {
                    cVar.a(round, round2, this.j);
                    this.f6449g.set(0, 0, width2, height2);
                    this.h.set(c2, d2, width2 + c2, height2 + d2);
                    canvas.drawBitmap(this.j, this.f6449g, this.h, (Paint) null);
                } catch (IllegalStateException e2) {
                    throw new IllegalStateException(e2.getMessage() + l(this.j, round, round2, this.f6446d, this.i));
                }
            }
        }
    }

    public com.facebook.imagepipeline.animated.base.a a(Rect rect) {
        return c(this.f6445c, rect).equals(this.f6446d) ? this : new a(this.a, this.b, rect);
    }

    public d b() {
        return this.b;
    }

    public int d(int i) {
        return this.f6447e[i];
    }

    public int e() {
        return this.f6445c.a();
    }

    public AnimatedDrawableFrameInfo f(int i) {
        return this.f6448f[i];
    }

    public int g() {
        return this.f6445c.getHeight();
    }

    public int h() {
        return this.f6445c.c();
    }

    public int i() {
        return this.f6446d.height();
    }

    public int j() {
        return this.f6446d.width();
    }

    public int k() {
        return this.f6445c.getWidth();
    }

    public void n(int i, Canvas canvas) {
        com.facebook.imagepipeline.animated.base.c e2 = this.f6445c.e(i);
        try {
            if (this.f6445c.g()) {
                p(canvas, e2);
            } else {
                o(canvas, e2);
            }
        } finally {
            e2.b();
        }
    }

    public void q(int i) {
        this.i = i;
    }
}
