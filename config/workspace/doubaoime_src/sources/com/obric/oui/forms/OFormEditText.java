package com.obric.oui.forms;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OFormEditText extends AppCompatEditText {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7764c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7765d;

    public OFormEditText(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (this.f7765d) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    protected float getLeftFadingEdgeStrength() {
        if (this.a) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    protected float getRightFadingEdgeStrength() {
        if (this.b) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (this.f7764c) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final void setBottomFading(boolean z) {
        this.f7765d = z;
    }

    public final void setLeftFading(boolean z) {
        this.a = z;
    }

    public final void setRightFading(boolean z) {
        this.b = z;
    }

    public final void setTextFading(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        setFadingEdgeLength(i);
        this.a = z;
        this.f7764c = z2;
        this.b = z3;
        this.f7765d = z4;
        setHorizontalFadingEdgeEnabled(z || z3);
        setVerticalFadingEdgeEnabled(this.f7764c || this.f7765d);
    }

    public final void setTopFading(boolean z) {
        this.f7764c = z;
    }

    public OFormEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OFormEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
