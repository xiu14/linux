package com.obric.oui.toast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.core.content.res.ResourcesCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.b.c.b.p;
import e.i.b.f.e.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class ToastBackgroundView extends FrameLayout {
    private int a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f8158c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f8159d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f8160e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8161f;

    public ToastBackgroundView(Context context) {
        this(context, null, 0);
    }

    public final int a() {
        return this.a;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.f8161f) {
            float f2 = 2;
            this.f8158c.set((this.b / f2) + getPaddingLeft(), (this.b / f2) + getPaddingTop(), (getWidth() - getPaddingRight()) - (this.b / f2), (getHeight() - getPaddingBottom()) - (this.b / f2));
            float f3 = this.a * 1.0f;
            p pVar = p.f10030e;
            p.g(canvas, this.f8158c, f3, this.f8159d);
            p.g(canvas, this.f8158c, f3, this.f8160e);
        }
        super.onDraw(canvas);
    }

    public final void setBgColor(@ColorRes int i, @ColorRes int i2) {
        this.f8159d.setColor(getResources().getColor(i, null));
        this.f8160e.setColor(getResources().getColor(i2, null));
    }

    public final void setupBackground(int i) {
        if (i == this.a * 2) {
            setBackground(ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_toast_background_capsule_form, null));
            this.f8161f = false;
        } else {
            this.f8161f = true;
        }
        StringBuilder M = e.a.a.a.a.M("setupBackground: drawSelf = ");
        M.append(this.f8161f);
        M.append(", height = ");
        M.append(i);
        b.a("ToastBackgroundView", M.toString());
        invalidate();
    }

    public ToastBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = e.a.a.a.a.e0("Resources.getSystem()", 1, 24.0f);
        this.b = 1.0f;
        this.f8158c = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f8159d = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.b);
        this.f8160e = paint2;
        setBackgroundColor(0);
        paint.setColor(getResources().getColor(C0838R.color.ime_on_tost_bg, null));
        paint2.setColor(getResources().getColor(C0838R.color.ime_on_tost_border_bg, null));
    }
}
