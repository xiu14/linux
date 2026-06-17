package com.obric.oui.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatImageView;
import e.i.b.c.b.e;
import e.i.b.c.b.f;
import e.i.b.c.b.g;
import e.i.b.c.b.h;
import e.i.b.c.b.i;
import e.i.b.c.b.m;
import e.i.b.c.b.o;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OIconButton extends AppCompatImageView implements e, f {
    private i a;
    private g b;

    /* renamed from: c, reason: collision with root package name */
    private h f7636c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7637d;

    /* renamed from: e, reason: collision with root package name */
    private int f7638e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e f7639f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ f f7640g;
    private final /* synthetic */ m h;

    public OIconButton(Context context) {
        this(context, null, 0, 0, null, 30);
    }

    public OIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28);
    }

    public OIconButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OIconButton(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6, e.i.b.c.b.m r7, int r8) {
        /*
            r2 = this;
            r7 = r8 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r4 = r0
        L6:
            r7 = r8 & 4
            r1 = 0
            if (r7 == 0) goto Lc
            r5 = r1
        Lc:
            r7 = r8 & 8
            if (r7 == 0) goto L11
            r6 = r1
        L11:
            r7 = r8 & 16
            if (r7 == 0) goto L1a
            e.i.b.c.b.m r0 = new e.i.b.c.b.m
            r0.<init>(r3, r4, r5, r6)
        L1a:
            java.lang.String r6 = "context"
            kotlin.s.c.l.f(r3, r6)
            java.lang.String r6 = "provider"
            kotlin.s.c.l.f(r0, r6)
            r2.<init>(r3, r4, r5)
            e.i.b.c.b.e r5 = r0.a()
            r2.f7639f = r5
            e.i.b.c.b.f r5 = r0.c()
            r2.f7640g = r5
            r2.h = r0
            r0.d(r2)
            e.i.b.c.b.f r5 = r0.c()
            java.lang.String r6 = "null cannot be cast to non-null type com.obric.oui.common.style.OUILayoutHelper"
            java.util.Objects.requireNonNull(r5, r6)
            e.i.b.c.b.i r5 = (e.i.b.c.b.i) r5
            r2.a = r5
            e.i.b.c.b.e r5 = r0.a()
            java.lang.String r6 = "null cannot be cast to non-null type com.obric.oui.common.style.OUIAlphaHelper"
            java.util.Objects.requireNonNull(r5, r6)
            e.i.b.c.b.g r5 = (e.i.b.c.b.g) r5
            r2.b = r5
            e.i.b.c.b.h r5 = r0.b()
            r2.f7636c = r5
            r5 = 1
            r2.setChangeAlphaWhenPress(r5)
            r2.setChangeAlphaWhenDisable(r5)
            int[] r5 = e.i.a.b.b.f9967f
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
            java.lang.String r4 = "context.obtainStyledAttr…trs, R.styleable.OButton)"
            kotlin.s.c.l.e(r3, r4)
            r4 = 2
            boolean r4 = r3.getBoolean(r4, r1)
            r2.f7637d = r4
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.button.OIconButton.<init>(android.content.Context, android.util.AttributeSet, int, int, e.i.b.c.b.m, int):void");
    }

    @Override // e.i.b.c.b.f
    public boolean a() {
        return this.f7640g.a();
    }

    @Override // e.i.b.c.b.e
    public void b(String str) {
        this.f7639f.b(str);
    }

    @Override // e.i.b.c.b.f
    public void c(int i, int i2, int i3, int i4) {
        this.f7640g.c(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    @RequiresApi(26)
    public void d(int i) {
        if (this.f7637d) {
            float e2 = kotlin.w.h.e(i / 255.0f, 0.0f, 1.0f);
            if (this.f7638e == 0) {
                this.f7638e = getImageAlpha();
            }
            int i2 = this.f7638e;
            if (i2 == 0) {
                return;
            }
            setImageAlpha(kotlin.w.h.f((int) ((1 - (e2 * 0.7f)) * i2), 0, 255));
        }
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
        return this.f7640g.e();
    }

    @Override // e.i.b.c.b.f
    public void f(float f2) {
        this.f7640g.f(f2);
    }

    @Override // e.i.b.c.b.f
    public int getShadowColor() {
        return this.f7640g.getShadowColor();
    }

    @Override // e.i.b.c.b.f
    public void setBorderColor(@ColorInt int i) {
        this.f7640g.setBorderColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setBorderWidth(int i) {
        this.f7640g.setBorderWidth(i);
    }

    @Override // e.i.b.c.b.f
    public void setBottomDividerAlpha(int i) {
        this.f7640g.setBottomDividerAlpha(i);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenDisable(boolean z) {
        this.f7639f.setChangeAlphaWhenDisable(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenPress(boolean z) {
        this.f7639f.setChangeAlphaWhenPress(z);
    }

    @Override // e.i.b.c.b.e
    public void setChangeAlphaWhenSelected(boolean z) {
        this.f7639f.setChangeAlphaWhenSelected(z);
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
        this.f7639f.setKeepPressAlpha(z);
    }

    @Override // e.i.b.c.b.f
    public void setLeftDividerAlpha(int i) {
        this.f7640g.setLeftDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setOuterNormalColor(int i) {
        this.f7640g.setOuterNormalColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineExcludePadding(boolean z) {
        this.f7640g.setOutlineExcludePadding(z);
    }

    @Override // e.i.b.c.b.f
    public void setOutlineInset(int i, int i2, int i3, int i4) {
        this.f7640g.setOutlineInset(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        h hVar = this.f7636c;
        if (hVar != null) {
            hVar.j(z);
        }
        g gVar = this.b;
        if (gVar != null) {
            gVar.j(z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i) {
        this.f7640g.setRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setRadius(int i, int i2, int i3, int i4) {
        this.f7640g.setRadius(i, i2, i3, i4);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, float f2) {
        this.f7640g.setRadiusAndShadow(i, i2, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRadiusAndShadow(int i, int i2, int i3, float f2) {
        this.f7640g.setRadiusAndShadow(i, i2, i3, f2);
    }

    @Override // e.i.b.c.b.f
    public void setRightDividerAlpha(int i) {
        this.f7640g.setRightDividerAlpha(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        g gVar = this.b;
        if (gVar != null) {
            gVar.k(this, z);
        }
    }

    @Override // e.i.b.c.b.f
    public void setShadow(@Nullable o oVar, @Nullable o oVar2) {
        this.f7640g.setShadow(oVar, oVar2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowAlpha(float f2) {
        this.f7640g.setShadowAlpha(f2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowColor(int i) {
        this.f7640g.setShadowColor(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowCornerRadius(int i) {
        this.f7640g.setShadowCornerRadius(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowElevation(int i) {
        this.f7640g.setShadowElevation(i);
    }

    @Override // e.i.b.c.b.f
    public void setShadowInsets(int i, int i2) {
        this.f7640g.setShadowInsets(i, i2);
    }

    @Override // e.i.b.c.b.f
    public void setShadowStyle(@StyleRes int i) {
        this.f7640g.setShadowStyle(i);
    }

    @Override // e.i.b.c.b.f
    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f7640g.setShowBorderOnlyBeforeL(z);
    }

    @Override // e.i.b.c.b.f
    public void setTopDividerAlpha(int i) {
        this.f7640g.setTopDividerAlpha(i);
    }

    @Override // e.i.b.c.b.f
    public void setUseThemeGeneralShadowElevation() {
        this.f7640g.setUseThemeGeneralShadowElevation();
    }
}
