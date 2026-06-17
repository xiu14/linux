package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class f extends C0714b {
    private final Drawable[] i;
    int j;
    int k;
    long l;
    int[] m;
    int[] n;
    int o;
    boolean[] p;
    int q;
    private a r;
    private boolean s;

    public interface a {
        void a();
    }

    public f(Drawable[] drawableArr) {
        super(drawableArr);
        e.c.c.d.h.g(drawableArr.length >= 1, "At least one layer required!");
        this.i = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.m = iArr;
        this.n = new int[drawableArr.length];
        this.o = 255;
        this.p = new boolean[drawableArr.length];
        this.q = 0;
        this.j = 2;
        Arrays.fill(iArr, 0);
        this.m[0] = 255;
        Arrays.fill(this.n, 0);
        this.n[0] = 255;
        Arrays.fill(this.p, false);
        this.p[0] = true;
    }

    private void n() {
        a aVar = this.r;
        if (aVar == null || !this.s) {
            return;
        }
        aVar.a();
        this.s = false;
    }

    private boolean p(float f2) {
        boolean z = true;
        for (int i = 0; i < this.i.length; i++) {
            boolean[] zArr = this.p;
            int i2 = zArr[i] ? 1 : -1;
            int[] iArr = this.n;
            iArr[i] = (int) ((i2 * 255 * f2) + this.m[i]);
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (zArr[i] && iArr[i] < 255) {
                z = false;
            }
            if (!zArr[i] && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.drawee.drawable.C0714b, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean p;
        int i = this.j;
        int i2 = 0;
        if (i == 0) {
            System.arraycopy(this.n, 0, this.m, 0, this.i.length);
            this.l = SystemClock.uptimeMillis();
            p = p(this.k == 0 ? 1.0f : 0.0f);
            this.j = p ? 2 : 1;
            if (p) {
                n();
            }
        } else if (i != 1) {
            if (i == 2) {
                n();
            }
            p = true;
        } else {
            e.c.c.d.h.f(this.k > 0);
            p = p((SystemClock.uptimeMillis() - this.l) / this.k);
            this.j = p ? 2 : 1;
            if (p) {
                n();
            }
        }
        while (true) {
            Drawable[] drawableArr = this.i;
            if (i2 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i2];
            int i3 = (this.n[i2] * this.o) / 255;
            if (drawable != null && i3 > 0) {
                this.q++;
                drawable.mutate().setAlpha(i3);
                this.q--;
                drawable.draw(canvas);
            }
            i2++;
        }
        if (p) {
            return;
        }
        invalidateSelf();
    }

    public void g() {
        this.q++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o;
    }

    public void i() {
        this.q--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.q == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.j = 0;
        Arrays.fill(this.p, true);
        invalidateSelf();
    }

    public void k(int i) {
        this.s = i == 2;
        this.j = 0;
        this.p[i] = true;
        invalidateSelf();
    }

    public void l(int i) {
        this.j = 0;
        this.p[i] = false;
        invalidateSelf();
    }

    public void m() {
        this.j = 2;
        for (int i = 0; i < this.i.length; i++) {
            this.n[i] = this.p[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public void o(int i) {
        this.k = i;
        if (this.j == 1) {
            this.j = 0;
        }
    }

    @Override // com.facebook.drawee.drawable.C0714b, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.o != i) {
            this.o = i;
            invalidateSelf();
        }
    }
}
