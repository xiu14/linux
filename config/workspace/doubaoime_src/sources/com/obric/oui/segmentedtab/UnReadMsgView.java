package com.obric.oui.segmentedtab;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class UnReadMsgView extends AppCompatTextView {
    private final GradientDrawable a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7984c;

    /* renamed from: d, reason: collision with root package name */
    private int f7985d;

    /* renamed from: e, reason: collision with root package name */
    private int f7986e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7987f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7988g;

    public UnReadMsgView(Context context) {
        this(context, null, 0);
    }

    private final void a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = this.a;
        int i = this.b;
        int i2 = this.f7986e;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(this.f7984c);
        gradientDrawable.setStroke(this.f7985d, i2);
        stateListDrawable.addState(new int[]{-16842919}, this.a);
        setBackground(stateListDrawable);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f7987f) {
            a();
            return;
        }
        float height = getHeight() / 2;
        Context context = getContext();
        l.e(context, "context");
        Resources resources = context.getResources();
        l.e(resources, "context.resources");
        this.f7984c = (int) ((height * resources.getDisplayMetrics().density) + 0.5f);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.f7988g || getWidth() <= 0 || getHeight() <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width < height) {
            width = height;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, BasicMeasure.EXACTLY);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.b = i;
        a();
    }

    public final void setIsRadiusHalfHeight(boolean z) {
        this.f7987f = z;
        a();
    }

    public final void setIsWidthHeightEqual(boolean z) {
        this.f7988g = z;
        a();
    }

    public final void setStrokeColor(int i) {
        this.f7986e = i;
        a();
    }

    public UnReadMsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnReadMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new GradientDrawable();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.a);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.MsgView)");
        this.b = obtainStyledAttributes.getColor(0, 0);
        this.f7984c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f7985d = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f7986e = obtainStyledAttributes.getColor(4, 0);
        this.f7987f = obtainStyledAttributes.getBoolean(2, false);
        this.f7988g = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
    }
}
