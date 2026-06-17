package com.obric.oui.shadow;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import e.i.a.b.b;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OShadowLayout extends FrameLayout {
    private a a;
    private a b;

    /* renamed from: c, reason: collision with root package name */
    private float f7999c;

    public OShadowLayout(Context context) {
        this(context, null, 0);
    }

    @RequiresApi(26)
    private final void a(Canvas canvas, Path path, RectF rectF, a aVar) {
        int save = canvas.save();
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(aVar.b(), aVar.c());
        rectF2.inset(-aVar.f(), -aVar.f());
        canvas.clipOutPath(path);
        float f2 = this.f7999c;
        canvas.drawRoundRect(rectF2, f2, f2, aVar.d());
        canvas.restoreToCount(save);
    }

    private final void b(TypedArray typedArray, a aVar, int i, int i2, int i3, int i4, int i5) {
        aVar.g(typedArray.getColor(i, Color.parseColor("#00000000")));
        aVar.j(typedArray.getDimension(i2, 0.0f));
        aVar.h(typedArray.getDimension(i3, 0.0f));
        aVar.i(typedArray.getDimension(i4, 0.0f));
        aVar.k(typedArray.getDimension(i5, 0.0f));
        aVar.d().setColor(aVar.a());
        if (aVar.e() > 0) {
            aVar.d().setMaskFilter(new BlurMaskFilter(aVar.e(), BlurMaskFilter.Blur.NORMAL));
        }
    }

    @Override // android.view.View
    @RequiresApi(26)
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        Path path = new Path();
        int childCount = getChildCount();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            l.e(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 = Math.min(i4, childAt.getLeft() - marginLayoutParams.leftMargin);
            i2 = Math.min(i2, childAt.getTop() - marginLayoutParams.topMargin);
            i = Math.max(i, childAt.getRight() + marginLayoutParams.rightMargin);
            i3 = Math.max(i3, childAt.getBottom() + marginLayoutParams.bottomMargin);
        }
        RectF rectF = new RectF(i4, i2, i, i3);
        float f2 = this.f7999c;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        a(canvas, path, rectF2, this.a);
        a(canvas, path, rectF2, this.b);
    }

    public OShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new a(Color.parseColor("#00000000"), 0.0f, 0.0f, 0.0f, 0.0f, null, 32);
        this.b = new a(Color.parseColor("#00000000"), 0.0f, 0.0f, 0.0f, 0.0f, null, 32);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.F, i, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…wLayout, defStyleAttr, 0)");
        b(obtainStyledAttributes, this.a, 2, 3, 0, 1, 4);
        b(obtainStyledAttributes, this.b, 7, 8, 5, 6, 4);
        this.f7999c = obtainStyledAttributes.getDimension(10, 0.0f);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        Math.max(Math.abs(this.a.e()) + Math.abs(this.a.b()), Math.abs(this.b.e()) + Math.abs(this.b.b()));
        Math.max(Math.abs(this.a.e()) + Math.abs(this.a.c()), Math.abs(this.b.e()) + Math.abs(this.b.c()));
    }
}
