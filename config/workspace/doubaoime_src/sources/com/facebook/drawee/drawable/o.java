package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class o extends g {

    /* renamed from: d, reason: collision with root package name */
    q f6384d;

    /* renamed from: e, reason: collision with root package name */
    Object f6385e;

    /* renamed from: f, reason: collision with root package name */
    PointF f6386f;

    /* renamed from: g, reason: collision with root package name */
    int f6387g;
    int h;
    Matrix i;
    private Matrix j;

    public o(Drawable drawable, q qVar) {
        super(drawable);
        this.f6386f = null;
        this.f6387g = 0;
        this.h = 0;
        this.j = new Matrix();
        this.f6384d = qVar;
    }

    private void q() {
        boolean z;
        q qVar = this.f6384d;
        boolean z2 = true;
        if (qVar instanceof A) {
            Object state = ((A) qVar).getState();
            z = state == null || !state.equals(this.f6385e);
            this.f6385e = state;
        } else {
            z = false;
        }
        if (this.f6387g == getCurrent().getIntrinsicWidth() && this.h == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            p();
        }
    }

    @Override // com.facebook.drawee.drawable.g, com.facebook.drawee.drawable.C
    public void d(Matrix matrix) {
        n(matrix);
        q();
        Matrix matrix2 = this.i;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        q();
        if (this.i == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.i);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.g
    public Drawable o(Drawable drawable) {
        Drawable o = super.o(drawable);
        p();
        return o;
    }

    @Override // com.facebook.drawee.drawable.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        p();
    }

    void p() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f6387g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.i = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.i = null;
            return;
        }
        q qVar = this.f6384d;
        q qVar2 = q.a;
        if (qVar == y.j) {
            current.setBounds(bounds);
            this.i = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        q qVar3 = this.f6384d;
        Matrix matrix = this.j;
        PointF pointF = this.f6386f;
        ((p) qVar3).a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
        this.i = this.j;
    }

    public PointF r() {
        return this.f6386f;
    }

    public q s() {
        return this.f6384d;
    }

    public void t(PointF pointF) {
        if (e.c.c.d.h.h(this.f6386f, pointF)) {
            return;
        }
        if (this.f6386f == null) {
            this.f6386f = new PointF();
        }
        this.f6386f.set(pointF);
        p();
        invalidateSelf();
    }

    public void u(q qVar) {
        if (e.c.c.d.h.h(this.f6384d, qVar)) {
            return;
        }
        this.f6384d = qVar;
        this.f6385e = null;
        p();
        invalidateSelf();
    }
}
