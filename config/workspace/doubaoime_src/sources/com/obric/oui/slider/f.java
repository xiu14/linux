package com.obric.oui.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class f extends Drawable {
    private Context a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private int f8038c;

    /* renamed from: d, reason: collision with root package name */
    private int f8039d;

    /* renamed from: e, reason: collision with root package name */
    private int f8040e;

    /* renamed from: f, reason: collision with root package name */
    private int f8041f;

    /* renamed from: g, reason: collision with root package name */
    private int f8042g;

    public f(Context context, int i) {
        l.f(context, "context");
        this.f8042g = i;
        this.a = context;
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(context, C0838R.color.oui_accent_bg));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.b = paint;
        this.f8038c = e.a.a.a.a.e0("Resources.getSystem()", 1, 16);
        this.f8039d = e.a.a.a.a.e0("Resources.getSystem()", 1, 24);
        this.f8040e = this.f8038c;
        this.f8041f = e.a.a.a.a.e0("Resources.getSystem()", 1, 4);
    }

    public final void a(int i, int i2) {
        this.f8038c = i;
        if (i == e.a.a.a.a.e0("Resources.getSystem()", 1, 14)) {
            this.b.setColor(ContextCompat.getColor(this.a, C0838R.color.oui_text_1));
        } else {
            this.b.setColor(ContextCompat.getColor(this.a, C0838R.color.oui_accent_bg));
        }
        this.f8039d = i2;
        this.f8040e = i;
        invalidateSelf();
    }

    public final void b(int i) {
        this.f8041f = i;
        invalidateSelf();
    }

    public final void c(boolean z) {
        if (z) {
            this.f8040e = this.f8039d;
        } else {
            this.f8040e = this.f8038c;
        }
        invalidateSelf();
    }

    public final void d(int i) {
        this.b.setColor(ContextCompat.getColor(this.a, i));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        Rect bounds = getBounds();
        l.e(bounds, "bounds");
        RectF rectF = new RectF(bounds.left, (bounds.height() - this.f8040e) / 2, bounds.right, r1 + this.f8040e);
        float f2 = 8;
        canvas.drawRoundRect(rectF, e.a.a.a.a.e0("Resources.getSystem()", 1, f2), e.a.a.a.a.e0("Resources.getSystem()", 1, f2), this.b);
    }

    public final void e(int i) {
        this.f8042g = i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8042g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8041f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
