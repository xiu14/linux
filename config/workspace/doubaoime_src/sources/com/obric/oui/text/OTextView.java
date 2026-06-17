package com.obric.oui.text;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import e.i.b.c.b.e;
import e.i.b.c.b.f;
import e.i.b.c.b.g;
import e.i.b.c.b.h;
import e.i.b.c.b.i;
import e.i.b.c.b.m;
import e.i.b.c.b.o;
import kotlin.s.c.l;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class OTextView extends TextView implements e, f {
    private i a;
    private g b;

    /* renamed from: c, reason: collision with root package name */
    private h f8093c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8094d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8095e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e f8096f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ f f8097g;
    private final /* synthetic */ m h;

    public OTextView(Context context) {
        this(context, null, 0, null, 14);
    }

    public OTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
    }

    public OTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OTextView(android.content.Context r3, android.util.AttributeSet r4, int r5, e.i.b.c.b.m r6, int r7) {
        /*
            r2 = this;
            r6 = r7 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r4 = r0
        L6:
            r6 = r7 & 4
            r1 = 0
            if (r6 == 0) goto Lc
            r5 = r1
        Lc:
            r6 = r7 & 8
            if (r6 == 0) goto L15
            e.i.b.c.b.m r0 = new e.i.b.c.b.m
            r0.<init>(r3, r4, r5, r1)
        L15:
            java.lang.String r6 = "context"
            kotlin.s.c.l.f(r3, r6)
            java.lang.String r6 = "provider"
            kotlin.s.c.l.f(r0, r6)
            r2.<init>(r3, r4, r5)
            e.i.b.c.b.e r4 = r0.a()
            r2.f8096f = r4
            e.i.b.c.b.f r4 = r0.c()
            r2.f8097g = r4
            r2.h = r0
            int r4 = r2.getGravity()
            r2.f8094d = r4
            r0.d(r2)
            e.i.b.c.b.f r4 = r0.c()
            java.lang.String r5 = "null cannot be cast to non-null type com.obric.oui.common.style.OUILayoutHelper"
            java.util.Objects.requireNonNull(r4, r5)
            e.i.b.c.b.i r4 = (e.i.b.c.b.i) r4
            r2.a = r4
            e.i.b.c.b.e r4 = r0.a()
            java.lang.String r5 = "null cannot be cast to non-null type com.obric.oui.common.style.OUIAlphaHelper"
            java.util.Objects.requireNonNull(r4, r5)
            e.i.b.c.b.g r4 = (e.i.b.c.b.g) r4
            r2.b = r4
            e.i.b.c.b.h r4 = r0.b()
            r2.f8093c = r4
            e.i.b.c.b.g r4 = r2.b
            if (r4 == 0) goto L60
            r4.setChangeAlphaWhenPress(r1)
        L60:
            e.i.b.c.b.g r4 = r2.b
            if (r4 == 0) goto L67
            r4.setChangeAlphaWhenDisable(r1)
        L67:
            r4 = 2131101931(0x7f0608eb, float:1.7816286E38)
            int r3 = r3.getColor(r4)
            r2.setHighlightColor(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.text.OTextView.<init>(android.content.Context, android.util.AttributeSet, int, e.i.b.c.b.m, int):void");
    }

    @Override // e.i.b.c.b.f
    public boolean a() {
        return this.f8097g.a();
    }

    @Override // e.i.b.c.b.e
    public void b(String str) {
        this.f8096f.b(str);
    }

    @Override // e.i.b.c.b.f
    public void c(int i, int i2, int i3, int i4) {
        this.f8097g.c(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    public void d(int i) {
        this.f8097g.d(i);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.dispatchDraw(canvas);
        i iVar = this.a;
        if (iVar != null) {
            iVar.v(canvas, getWidth(), getHeight());
        }
        i iVar2 = this.a;
        if (iVar2 != null) {
            iVar2.t(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(26)
    public void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        i iVar = this.a;
        if (iVar != null) {
            iVar.u(canvas);
        }
        super.draw(canvas);
    }

    @Override // e.i.b.c.b.f
    public boolean e() {
        return this.f8097g.e();
    }

    @Override // e.i.b.c.b.f
    public void f(float f2) {
        this.f8097g.f(f2);
    }

    @Override // android.widget.TextView, e.i.b.c.b.f
    public int getShadowColor() {
        return this.f8097g.getShadowColor();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f8095e) {
            int i5 = (this.f8094d & 112) | (getLineCount() <= 1 ? 1 : 3);
            if (getGravity() != i5) {
                setGravity(i5);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // e.i.b.c.b.f
    public void setBorderColor(@ColorInt int i) {
        this.f8097g.setBorderColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setBorderWidth(int i) {
        this.f8097g.setBorderWidth(i);
    }

    @Override // e.i.b.c.b.f
    public void setBottomDividerAlpha(int i) {
        this.f8097g.setBottomDividerAlpha(i);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenDisable(boolean z) {
        this.f8096f.setChangeAlphaWhenDisable(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenPress(boolean z) {
        this.f8096f.setChangeAlphaWhenPress(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenSelected(boolean z) {
        this.f8096f.setChangeAlphaWhenSelected(z);
    }

    public final void setEnableAutoAlignLeft(boolean z) {
        if (this.f8095e != z) {
            this.f8095e = z;
            requestLayout();
        }
    }

    @Override // e.i.b.c.b.e
    public void setKeepPressAlpha(boolean z) {
        this.f8096f.setKeepPressAlpha(z);
    }

    @Override // e.i.b.c.b.f
    public void setLeftDividerAlpha(int i) {
        this.f8097g.setLeftDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setOuterNormalColor(int i) {
        this.f8097g.setOuterNormalColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineExcludePadding(boolean z) {
        this.f8097g.setOutlineExcludePadding(z);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineInset(int i, int i2, int i3, int i4) {
        this.f8097g.setOutlineInset(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        h hVar = this.f8093c;
        if (hVar != null) {
            hVar.j(z);
        }
        super.setPressed(z);
        g gVar = this.b;
        if (gVar != null) {
            gVar.j(z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i) {
        this.f8097g.setRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i, int i2, int i3, int i4) {
        this.f8097g.setRadius(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, float f2) {
        this.f8097g.setRadiusAndShadow(i, i2, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, int i3, float f2) {
        this.f8097g.setRadiusAndShadow(i, i2, i3, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRightDividerAlpha(int i) {
        this.f8097g.setRightDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadow(@Nullable o oVar, @Nullable o oVar2) {
        this.f8097g.setShadow(oVar, oVar2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowAlpha(float f2) {
        this.f8097g.setShadowAlpha(f2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowColor(int i) {
        this.f8097g.setShadowColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowCornerRadius(int i) {
        this.f8097g.setShadowCornerRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowElevation(int i) {
        this.f8097g.setShadowElevation(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowInsets(int i, int i2) {
        this.f8097g.setShadowInsets(i, i2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowStyle(@StyleRes int i) {
        this.f8097g.setShadowStyle(i);
    }

    @Override // e.i.b.c.b.f
    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f8097g.setShowBorderOnlyBeforeL(z);
    }

    @Override // e.i.b.c.b.f
    public void setTopDividerAlpha(int i) {
        this.f8097g.setTopDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setUseThemeGeneralShadowElevation() {
        this.f8097g.setUseThemeGeneralShadowElevation();
    }
}
