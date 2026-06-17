package com.obric.oui.button;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import e.i.b.c.b.e;
import e.i.b.c.b.f;
import e.i.b.c.b.g;
import e.i.b.c.b.h;
import e.i.b.c.b.m;
import e.i.b.c.b.o;
import e.i.b.f.e.b;
import kotlin.s.c.l;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class OButton extends Button implements e, f {
    private g a;
    private h b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f7631c;

    /* renamed from: d, reason: collision with root package name */
    private int f7632d;

    /* renamed from: e, reason: collision with root package name */
    private int f7633e;

    /* renamed from: f, reason: collision with root package name */
    private int f7634f;

    /* renamed from: g, reason: collision with root package name */
    private int f7635g;
    private boolean h;
    private final /* synthetic */ e i;
    private final /* synthetic */ f j;
    private final /* synthetic */ m k;

    public OButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28);
    }

    public OButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OButton(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, e.i.b.c.b.m r6, int r7) {
        /*
            r1 = this;
            r6 = r7 & 4
            r0 = 0
            if (r6 == 0) goto L6
            r4 = r0
        L6:
            r6 = r7 & 8
            if (r6 == 0) goto Lb
            r5 = r0
        Lb:
            r6 = r7 & 16
            if (r6 == 0) goto L15
            e.i.b.c.b.m r6 = new e.i.b.c.b.m
            r6.<init>(r2, r3, r4, r5)
            goto L16
        L15:
            r6 = 0
        L16:
            java.lang.String r5 = "context"
            kotlin.s.c.l.f(r2, r5)
            java.lang.String r5 = "provider"
            kotlin.s.c.l.f(r6, r5)
            r1.<init>(r2, r3, r4)
            e.i.b.c.b.e r4 = r6.a()
            r1.i = r4
            e.i.b.c.b.f r4 = r6.c()
            r1.j = r4
            r1.k = r6
            r6.d(r1)
            e.i.b.c.b.f r4 = r6.c()
            java.lang.String r5 = "null cannot be cast to non-null type com.obric.oui.common.style.OUILayoutHelper"
            java.util.Objects.requireNonNull(r4, r5)
            e.i.b.c.b.e r4 = r6.a()
            java.lang.String r5 = "null cannot be cast to non-null type com.obric.oui.common.style.OUIAlphaHelper"
            java.util.Objects.requireNonNull(r4, r5)
            e.i.b.c.b.g r4 = (e.i.b.c.b.g) r4
            r1.a = r4
            e.i.b.c.b.h r4 = r6.b()
            r1.b = r4
            r4 = 1
            r1.setChangeAlphaWhenPress(r4)
            r1.setChangeAlphaWhenDisable(r4)
            int[] r5 = e.i.a.b.b.f9967f
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r5)
            java.lang.String r3 = "context.obtainStyledAttr…trs, R.styleable.OButton)"
            kotlin.s.c.l.e(r2, r3)
            r3 = -1
            int r5 = r2.getResourceId(r0, r3)
            r1.f7632d = r5
            int r3 = r2.getResourceId(r4, r3)
            r1.setMImageTintColorId(r3)
            int r3 = r1.f7632d
            if (r3 < 0) goto L77
            r1.setButtonSourceBitmap(r3)
        L77:
            r3 = 3
            r4 = 2131887376(0x7f120510, float:1.9409357E38)
            int r3 = r2.getResourceId(r3, r4)
            r1.setTextAppearance(r3)
            r3 = 2
            boolean r3 = r2.getBoolean(r3, r0)
            r1.h = r3
            int r3 = r1.getCurrentTextColor()
            r1.f7634f = r3
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            java.lang.String r4 = "ColorStateList.valueOf(textColor)"
            kotlin.s.c.l.e(r3, r4)
            r1.setCompoundDrawableTintList(r3)
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.button.OButton.<init>(android.content.Context, android.util.AttributeSet, int, int, e.i.b.c.b.m, int):void");
    }

    @Override // e.i.b.c.b.f
    public boolean a() {
        return this.j.a();
    }

    @Override // e.i.b.c.b.e
    public void b(String str) {
        this.i.b(str);
    }

    @Override // e.i.b.c.b.f
    public void c(int i, int i2, int i3, int i4) {
        this.j.c(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    @RequiresApi(26)
    public void d(int i) {
        if (this.h) {
            float e2 = kotlin.w.h.e(i / 255.0f, 0.0f, 1.0f);
            int i2 = this.f7634f;
            if (i2 != 0) {
                int i3 = (i2 >> 24) & 255;
                int f2 = kotlin.w.h.f((int) ((1 - (e2 * 0.7f)) * i3), 0, 255);
                setTextColor((i2 & 255) | (((i2 >> 16) & 255) << 16) | (f2 << 24) | (((i2 >> 8) & 255) << 8));
                b.a("OButton", "updateTextColorOnPress, fraction: " + e2 + ", newTextAlpha: " + f2 + ", originTextAlpha: " + i3);
            }
            int i4 = this.f7635g;
            if (i4 == 0) {
                return;
            }
            int f3 = kotlin.w.h.f((int) ((1 - (0.7f * e2)) * i4), 0, 255);
            Drawable drawable = this.f7631c;
            if (drawable != null) {
                drawable.setAlpha(f3);
            }
            b.a("OButton", "updateIconAlphaOnPress, fraction: " + e2 + ", alpha: " + f3 + ", originIconAlpha: " + this.f7635g);
        }
    }

    @Override // e.i.b.c.b.f
    public boolean e() {
        return this.j.e();
    }

    @Override // e.i.b.c.b.f
    public void f(float f2) {
        this.j.f(f2);
    }

    @Override // android.widget.TextView, e.i.b.c.b.f
    public int getShadowColor() {
        return this.j.getShadowColor();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f7631c;
        if (drawable != null) {
            int width = (getWidth() - drawable.getIntrinsicWidth()) / 2;
            int height = (getHeight() - drawable.getIntrinsicHeight()) / 2;
            drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, drawable.getIntrinsicHeight() + height);
            if (this.f7633e > 0) {
                drawable.setColorFilter(new PorterDuffColorFilter(getResources().getColor(this.f7633e), PorterDuff.Mode.SRC_IN));
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = this.f7631c;
        if (drawable != null) {
            measuredWidth = Math.max(measuredWidth, getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth());
            measuredHeight = Math.max(measuredHeight, getPaddingBottom() + getPaddingTop() + drawable.getIntrinsicHeight());
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // e.i.b.c.b.f
    public void setBorderColor(@ColorInt int i) {
        this.j.setBorderColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setBorderWidth(int i) {
        this.j.setBorderWidth(i);
    }

    @Override // e.i.b.c.b.f
    public void setBottomDividerAlpha(int i) {
        this.j.setBottomDividerAlpha(i);
    }

    public final void setButtonSourceBitmap(int i) {
        if (i < 0) {
            return;
        }
        setMIcon(ContextCompat.getDrawable(getContext(), i));
        Drawable drawable = this.f7631c;
        this.f7635g = drawable != null ? drawable.getAlpha() : 0;
        invalidate();
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenDisable(boolean z) {
        this.i.setChangeAlphaWhenDisable(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenPress(boolean z) {
        this.i.setChangeAlphaWhenPress(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenSelected(boolean z) {
        this.i.setChangeAlphaWhenSelected(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        g gVar = this.a;
        if (gVar != null) {
            gVar.i(this, z);
        }
    }

    @Override // e.i.b.c.b.e
    public void setKeepPressAlpha(boolean z) {
        this.i.setKeepPressAlpha(z);
    }

    @Override // e.i.b.c.b.f
    public void setLeftDividerAlpha(int i) {
        this.j.setLeftDividerAlpha(i);
    }

    public final void setMIcon(Drawable drawable) {
        this.f7631c = drawable;
        requestLayout();
        invalidate();
    }

    public final void setMImageTintColorId(int i) {
        this.f7633e = i;
        invalidate();
    }

    @Override // e.i.b.c.b.f
    public void setOuterNormalColor(int i) {
        this.j.setOuterNormalColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineExcludePadding(boolean z) {
        this.j.setOutlineExcludePadding(z);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineInset(int i, int i2, int i3, int i4) {
        this.j.setOutlineInset(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        h hVar = this.b;
        if (hVar != null) {
            hVar.j(z);
        }
        g gVar = this.a;
        if (gVar != null) {
            gVar.j(z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i) {
        this.j.setRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i, int i2, int i3, int i4) {
        this.j.setRadius(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, float f2) {
        this.j.setRadiusAndShadow(i, i2, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, int i3, float f2) {
        this.j.setRadiusAndShadow(i, i2, i3, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRightDividerAlpha(int i) {
        this.j.setRightDividerAlpha(i);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        g gVar = this.a;
        if (gVar != null) {
            gVar.k(this, z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setShadow(@Nullable o oVar, @Nullable o oVar2) {
        this.j.setShadow(oVar, oVar2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowAlpha(float f2) {
        this.j.setShadowAlpha(f2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowColor(int i) {
        this.j.setShadowColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowCornerRadius(int i) {
        this.j.setShadowCornerRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowElevation(int i) {
        this.j.setShadowElevation(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowInsets(int i, int i2) {
        this.j.setShadowInsets(i, i2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowStyle(@StyleRes int i) {
        this.j.setShadowStyle(i);
    }

    @Override // e.i.b.c.b.f
    public void setShowBorderOnlyBeforeL(boolean z) {
        this.j.setShowBorderOnlyBeforeL(z);
    }

    @Override // e.i.b.c.b.f
    public void setTopDividerAlpha(int i) {
        this.j.setTopDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setUseThemeGeneralShadowElevation() {
        this.j.setUseThemeGeneralShadowElevation();
    }

    public final void setButtonSourceBitmap(int i, int i2) {
        if (i < 0) {
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        setMIcon(drawable != null ? drawable.mutate() : null);
        Drawable drawable2 = this.f7631c;
        if (drawable2 != null) {
            drawable2.setTint(i2);
        }
        Drawable drawable3 = this.f7631c;
        this.f7635g = drawable3 != null ? drawable3.getAlpha() : 0;
        invalidate();
    }
}
