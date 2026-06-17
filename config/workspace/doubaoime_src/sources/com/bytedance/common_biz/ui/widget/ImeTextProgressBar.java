package com.bytedance.common_biz.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes.dex */
public final class ImeTextProgressBar extends View {
    private final Paint a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f4368c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f4369d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f4370e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f4371f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f4372g;
    private final float[] h;
    private int i;
    private int j;
    private float k;
    private CharSequence l;
    private Typeface m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTextProgressBar(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final String a() {
        CharSequence charSequence = this.l;
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            return obj;
        }
        int f2 = h.f((int) ((this.j * 100.0f) / this.i), 0, 100);
        StringBuilder sb = new StringBuilder();
        sb.append(f2);
        sb.append('%');
        return sb.toString();
    }

    private final void b() {
        this.f4371f.rewind();
        if (this.f4370e.isEmpty()) {
            return;
        }
        float min = Math.min(this.k, Math.min(this.f4370e.width(), this.f4370e.height()) / 2.0f);
        this.f4371f.addRoundRect(this.f4370e, min, min, Path.Direction.CW);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation", "UseKtx"})
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        float min = Math.min(this.k, Math.min(this.f4370e.width(), this.f4370e.height()) / 2.0f);
        canvas.drawRoundRect(this.f4370e, min, min, this.a);
        float e2 = h.e((this.f4370e.width() * this.j) / this.i, 0.0f, this.f4370e.width());
        if (e2 > 0.0f) {
            int save = canvas.save();
            canvas.clipPath(this.f4371f);
            RectF rectF = this.f4370e;
            float f2 = rectF.left;
            RectF rectF2 = new RectF(f2, rectF.top, f2 + e2, rectF.bottom);
            float min2 = Math.min(min, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
            float[] fArr = this.h;
            fArr[0] = min2;
            fArr[1] = min2;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2;
            fArr[7] = min2;
            this.f4372g.rewind();
            this.f4372g.addRoundRect(rectF2, this.h, Path.Direction.CW);
            canvas.drawPath(this.f4372g, this.b);
            canvas.restoreToCount(save);
        }
        String a = a();
        float centerY = this.f4370e.centerY() - ((this.f4368c.ascent() + this.f4368c.descent()) / 2.0f);
        float centerX = this.f4370e.centerX();
        canvas.drawText(a, centerX, centerY, this.f4368c);
        if (e2 > 0.0f) {
            int save2 = canvas.save();
            canvas.clipPath(this.f4371f);
            RectF rectF3 = this.f4370e;
            float f3 = rectF3.left;
            canvas.clipRect(f3, rectF3.top, e2 + f3, rectF3.bottom);
            canvas.drawText(a, centerX, centerY, this.f4369d);
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        String a = a();
        Paint.FontMetrics fontMetrics = this.f4368c.getFontMetrics();
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        float paddingBottom = getPaddingBottom() + getPaddingTop();
        float m = e.a.a.a.a.m("Resources.getSystem()", 1, 36);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int max = (int) (Math.max(m, TypedValue.applyDimension(1, 16, system.getDisplayMetrics()) + f2) + paddingBottom);
        if (mode != 1073741824) {
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            float measureText = this.f4368c.measureText(a);
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            size = Math.max(suggestedMinimumWidth, paddingRight + ((int) (TypedValue.applyDimension(1, 32, system2.getDisplayMetrics()) + measureText)));
        }
        if (mode2 != 1073741824) {
            size2 = Math.max(getSuggestedMinimumHeight(), max);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f4370e.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        b();
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void setCornerRadius(float f2) {
        float max = Math.max(0.0f, f2);
        if (this.k == max) {
            return;
        }
        this.k = max;
        b();
        invalidate();
    }

    public final void setFontFamily(Typeface typeface) {
        if (l.a(this.m, typeface)) {
            return;
        }
        this.m = typeface;
        this.f4368c.setTypeface(typeface);
        this.f4369d.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void setMax(int i) {
        int max = Math.max(i, 1);
        if (this.i == max) {
            return;
        }
        this.i = max;
        this.j = h.f(this.j, 0, max);
        invalidate();
    }

    public final void setProgress(int i) {
        int f2 = h.f(i, 0, this.i);
        if (this.j == f2) {
            return;
        }
        this.j = f2;
        invalidate();
    }

    public final void setProgressColor(int i) {
        if (this.b.getColor() == i) {
            return;
        }
        this.b.setColor(i);
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        if (TextUtils.equals(this.l, charSequence)) {
            return;
        }
        this.l = charSequence;
        setContentDescription(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setTextColors(int i, int i2) {
        if ((this.f4368c.getColor() == i && this.f4369d.getColor() == i2) ? false : true) {
            this.f4368c.setColor(i);
            this.f4369d.setColor(i2);
            invalidate();
        }
    }

    public final void setTextSizePx(float f2) {
        if (this.f4368c.getTextSize() == f2) {
            if (this.f4369d.getTextSize() == f2) {
                return;
            }
        }
        this.f4368c.setTextSize(f2);
        this.f4369d.setTextSize(f2);
        requestLayout();
        invalidate();
    }

    public final void setTrackColor(int i) {
        if (this.a.getColor() == i) {
            return;
        }
        this.a.setColor(i);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTextProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011a A[Catch: all -> 0x013b, TryCatch #1 {all -> 0x013b, blocks: (B:3:0x006f, B:24:0x00fb, B:27:0x0100, B:29:0x0104, B:13:0x0121, B:5:0x0108, B:7:0x010e, B:12:0x011a, B:32:0x00f7, B:23:0x00f1), top: B:2:0x006f, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImeTextProgressBar(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common_biz.ui.widget.ImeTextProgressBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
