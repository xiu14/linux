package com.obric.oui.slider;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d extends Drawable {
    private Drawable a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f8033c;

    /* renamed from: d, reason: collision with root package name */
    private int f8034d;

    /* renamed from: e, reason: collision with root package name */
    private float f8035e;

    /* renamed from: f, reason: collision with root package name */
    private float f8036f;

    /* renamed from: g, reason: collision with root package name */
    private Context f8037g;
    private final Paint h;
    private final Paint i;

    public d(Context context) {
        l.f(context, "context");
        this.f8033c = e.a.a.a.a.e0("Resources.getSystem()", 1, 8);
        this.f8034d = e.a.a.a.a.e0("Resources.getSystem()", 1, 6);
        this.f8035e = e.a.a.a.a.e0("Resources.getSystem()", 1, 16);
        this.f8036f = e.a.a.a.a.e0("Resources.getSystem()", 1, 1);
        this.f8037g = context;
        this.a = ContextCompat.getDrawable(context, C0838R.drawable.o_slider_audio_white_icon);
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(context, C0838R.color.oui_accent_bg));
        paint.setStyle(Paint.Style.FILL);
        this.h = paint;
        Paint paint2 = new Paint();
        paint2.setColor(ContextCompat.getColor(context, C0838R.color.oui_line_2));
        paint2.setStyle(Paint.Style.FILL);
        this.i = paint2;
    }

    public final void a() {
        this.b = false;
        invalidateSelf();
    }

    public final void b(int i) {
        this.i.setColor(ContextCompat.getColor(this.f8037g, i));
    }

    public final void c(int i) {
        this.f8033c = i;
        if (i >= e.a.a.a.a.e0("Resources.getSystem()", 1, 32)) {
            this.f8035e = e.a.a.a.a.e0("Resources.getSystem()", 1, 8);
        } else if (i > e.a.a.a.a.e0("Resources.getSystem()", 1, 6)) {
            this.f8035e = i / 2.0f;
        } else {
            this.f8035e = e.a.a.a.a.e0("Resources.getSystem()", 1, 4);
        }
        if (i == e.a.a.a.a.e0("Resources.getSystem()", 1, 6)) {
            f(C0838R.color.oui_text_1);
        } else {
            f(C0838R.color.oui_accent_bg);
        }
        invalidateSelf();
    }

    public final void d(int i) {
        this.f8034d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        Rect bounds = getBounds();
        l.e(bounds, "bounds");
        float f2 = bounds.left;
        float f3 = bounds.top;
        float f4 = bounds.right;
        float f5 = bounds.bottom;
        int width = bounds.width();
        bounds.height();
        canvas.drawColor(0);
        float level = (getLevel() * width) / 10000.0f;
        int i = this.f8034d;
        float f6 = level - ((float) i) < ((float) 0) ? 0.0f : level - i;
        float f7 = ((float) i) + level > f4 ? width : i + level;
        RectF rectF = new RectF(f2, f3, f6 + f2, f5);
        Path path = new Path();
        float f8 = this.f8035e;
        float f9 = this.f8036f;
        path.addRoundRect(rectF, new float[]{f8, f8, f9, f9, f9, f9, f8, f8}, Path.Direction.CW);
        canvas.drawPath(path, this.h);
        RectF rectF2 = new RectF(f2 + f7, f3, f4, f5);
        Path path2 = new Path();
        float f10 = this.f8036f;
        float f11 = this.f8035e;
        path2.addRoundRect(rectF2, new float[]{f10, f10, f11, f11, f11, f11, f10, f10}, Path.Direction.CW);
        canvas.drawPath(path2, this.i);
        if (this.a == null || !this.b) {
            return;
        }
        Rect bounds2 = getBounds();
        l.e(bounds2, "bounds");
        int i2 = bounds2.left;
        int i3 = bounds2.top;
        int i4 = bounds2.bottom;
        float f12 = 8;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int a = kotlin.t.a.a(TypedValue.applyDimension(1, f12, system.getDisplayMetrics())) + i2;
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        int a2 = kotlin.t.a.a(TypedValue.applyDimension(1, f12, system2.getDisplayMetrics())) + i3;
        Resources system3 = Resources.getSystem();
        l.e(system3, "Resources.getSystem()");
        int a3 = kotlin.t.a.a(TypedValue.applyDimension(1, 32, system3.getDisplayMetrics())) + i2;
        Resources system4 = Resources.getSystem();
        l.e(system4, "Resources.getSystem()");
        Rect rect = new Rect(a, a2, a3, i4 - kotlin.t.a.a(TypedValue.applyDimension(1, f12, system4.getDisplayMetrics())));
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        l.f(drawable, "imageIcon");
        this.a = drawable;
        invalidateSelf();
    }

    public final void f(int i) {
        this.h.setColor(ContextCompat.getColor(this.f8037g, i));
    }

    public final void g() {
        this.b = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8033c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
