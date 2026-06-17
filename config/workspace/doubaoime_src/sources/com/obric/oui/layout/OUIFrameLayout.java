package com.obric.oui.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.core.app.NotificationCompat;
import e.i.b.c.b.e;
import e.i.b.c.b.f;
import e.i.b.c.b.g;
import e.i.b.c.b.h;
import e.i.b.c.b.i;
import e.i.b.c.b.m;
import e.i.b.c.b.o;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OUIFrameLayout extends FrameLayout implements e, f {
    private i a;
    private g b;

    /* renamed from: c, reason: collision with root package name */
    private h f7851c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ e f7852d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ f f7853e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ m f7854f;

    public OUIFrameLayout(Context context) {
        this(context, null, 0, null, 14);
    }

    public OUIFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
    }

    public OUIFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OUIFrameLayout(android.content.Context r3, android.util.AttributeSet r4, int r5, e.i.b.c.b.m r6, int r7) {
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
            java.lang.String r5 = "context"
            kotlin.s.c.l.f(r3, r5)
            java.lang.String r5 = "provider"
            kotlin.s.c.l.f(r0, r5)
            r2.<init>(r3, r4)
            e.i.b.c.b.e r4 = r0.a()
            r2.f7852d = r4
            e.i.b.c.b.f r4 = r0.c()
            r2.f7853e = r4
            r2.f7854f = r0
            r0.d(r2)
            e.i.b.c.b.f r4 = r0.c()
            java.lang.String r5 = "null cannot be cast to non-null type com.obric.oui.common.style.OUILayoutHelper"
            java.util.Objects.requireNonNull(r4, r5)
            e.i.b.c.b.i r4 = (e.i.b.c.b.i) r4
            r2.a = r4
            e.i.b.c.b.e r4 = r2.g()
            java.lang.String r5 = "null cannot be cast to non-null type com.obric.oui.common.style.OUIAlphaHelper"
            java.util.Objects.requireNonNull(r4, r5)
            e.i.b.c.b.g r4 = (e.i.b.c.b.g) r4
            r2.b = r4
            e.i.b.c.b.h r4 = r0.b()
            r2.f7851c = r4
            r2.h(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.layout.OUIFrameLayout.<init>(android.content.Context, android.util.AttributeSet, int, e.i.b.c.b.m, int):void");
    }

    @Override // e.i.b.c.b.f
    public boolean a() {
        return this.f7853e.a();
    }

    @Override // e.i.b.c.b.e
    public void b(String str) {
        this.f7852d.b(str);
    }

    @Override // e.i.b.c.b.f
    public void c(int i, int i2, int i3, int i4) {
        this.f7853e.c(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    public void d(int i) {
        this.f7853e.d(i);
    }

    @Override // android.view.ViewGroup, android.view.View
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
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        h hVar = this.f7851c;
        if (hVar != null) {
            hVar.b(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        h hVar = this.f7851c;
        if (hVar != null) {
            hVar.c(motionEvent);
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.d(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
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

    public boolean e() {
        return this.f7853e.e();
    }

    @Override // e.i.b.c.b.f
    public void f(float f2) {
        this.f7853e.f(f2);
    }

    public e g() {
        return this.f7854f.a();
    }

    @Override // e.i.b.c.b.f
    public int getShadowColor() {
        return this.f7853e.getShadowColor();
    }

    public final void h(Context context) {
        l.f(context, "context");
        setChangeAlphaWhenPress(true);
        setChangeAlphaWhenDisable(true);
        setVibrateEnabled(false);
        setSoundEffectEnabled(false);
        setWillNotDraw(false);
    }

    public boolean i() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.f7851c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f7851c;
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z) {
        super.onHoverChanged(z);
        h hVar = this.f7851c;
        if (hVar != null) {
            hVar.h(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        i iVar = this.a;
        if (iVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        l.c(iVar);
        int z = iVar.z(i);
        i iVar2 = this.a;
        l.c(iVar2);
        int y = iVar2.y(i2);
        super.onMeasure(z, y);
        i iVar3 = this.a;
        l.c(iVar3);
        int C = iVar3.C(z, getMeasuredWidth());
        i iVar4 = this.a;
        l.c(iVar4);
        int B = iVar4.B(y, getMeasuredHeight());
        if (z == C && y == B) {
            return;
        }
        super.onMeasure(C, B);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        h hVar = this.f7851c;
        if (hVar != null) {
            hVar.i(i);
        }
    }

    @Override // e.i.b.c.b.f
    public void setBorderColor(@ColorInt int i) {
        this.f7853e.setBorderColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setBorderWidth(int i) {
        this.f7853e.setBorderWidth(i);
    }

    @Override // e.i.b.c.b.f
    public void setBottomDividerAlpha(int i) {
        this.f7853e.setBottomDividerAlpha(i);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenDisable(boolean z) {
        this.f7852d.setChangeAlphaWhenDisable(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenPress(boolean z) {
        this.f7852d.setChangeAlphaWhenPress(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenSelected(boolean z) {
        this.f7852d.setChangeAlphaWhenSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        g gVar = this.b;
        if (gVar != null) {
            gVar.i(this, z);
        }
    }

    @Override // e.i.b.c.b.e
    public void setKeepPressAlpha(boolean z) {
        this.f7852d.setKeepPressAlpha(z);
    }

    @Override // e.i.b.c.b.f
    public void setLeftDividerAlpha(int i) {
        this.f7853e.setLeftDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setOuterNormalColor(int i) {
        this.f7853e.setOuterNormalColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineExcludePadding(boolean z) {
        this.f7853e.setOutlineExcludePadding(z);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineInset(int i, int i2, int i3, int i4) {
        this.f7853e.setOutlineInset(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (i()) {
            h hVar = this.f7851c;
            if (hVar != null) {
                hVar.j(z);
            }
            super.setPressed(z);
            g gVar = this.b;
            if (gVar != null) {
                gVar.j(z);
            }
        }
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i) {
        this.f7853e.setRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i, int i2, int i3, int i4) {
        this.f7853e.setRadius(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, float f2) {
        this.f7853e.setRadiusAndShadow(i, i2, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, int i3, float f2) {
        this.f7853e.setRadiusAndShadow(i, i2, i3, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRightDividerAlpha(int i) {
        this.f7853e.setRightDividerAlpha(i);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        g gVar = this.b;
        if (gVar != null) {
            gVar.k(this, z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setShadow(@Nullable o oVar, @Nullable o oVar2) {
        this.f7853e.setShadow(oVar, oVar2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowAlpha(float f2) {
        this.f7853e.setShadowAlpha(f2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowColor(int i) {
        this.f7853e.setShadowColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowCornerRadius(int i) {
        this.f7853e.setShadowCornerRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowElevation(int i) {
        this.f7853e.setShadowElevation(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowInsets(int i, int i2) {
        this.f7853e.setShadowInsets(i, i2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowStyle(@StyleRes int i) {
        this.f7853e.setShadowStyle(i);
    }

    @Override // e.i.b.c.b.f
    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f7853e.setShowBorderOnlyBeforeL(z);
    }

    public final void setSoundEffectEnabled(boolean z) {
        h hVar = this.f7851c;
        if (hVar != null) {
            hVar.k(z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setTopDividerAlpha(int i) {
        this.f7853e.setTopDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setUseThemeGeneralShadowElevation() {
        this.f7853e.setUseThemeGeneralShadowElevation();
    }

    public final void setVibrateEnabled(boolean z) {
        h hVar = this.f7851c;
        if (hVar != null) {
            hVar.l(z);
        }
    }
}
