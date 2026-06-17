package com.bytedance.android.input.popup;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends PopupWindow {
    private int[] a;
    private a b;

    /* renamed from: c, reason: collision with root package name */
    private View f2908c;

    /* renamed from: d, reason: collision with root package name */
    private int f2909d;

    /* renamed from: e, reason: collision with root package name */
    private String f2910e;

    private class a extends View {
        private Paint a;
        private Paint.FontMetricsInt b;

        public a(Context context) {
            super(context);
        }

        public void a(float f2, boolean z, int i) {
            if (this.a == null) {
                this.a = new Paint(1);
            }
            this.a.setTextSize(f2);
            this.a.setColor(i);
            this.a.setTextAlign(Paint.Align.CENTER);
            this.a.setFakeBoldText(z);
            this.b = this.a.getFontMetricsInt();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (l.this.f2910e.isEmpty()) {
                return;
            }
            int width = getWidth();
            int height = getHeight();
            float measureText = this.a.measureText(l.this.f2910e);
            float paddingLeft = ((((width - measureText) - getPaddingLeft()) - getPaddingRight()) / 2.0f) + getPaddingLeft();
            if (paddingLeft < getPaddingLeft()) {
                paddingLeft = getPaddingLeft();
            }
            Paint.FontMetricsInt fontMetricsInt = this.b;
            int i = fontMetricsInt.bottom;
            canvas.drawText(l.this.f2910e, (measureText / 2.0f) + paddingLeft, ((height - (i - r3)) / 2.0f) - fontMetricsInt.top, this.a);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.resolveSize(l.c(getContext(), 80.0f), i), View.resolveSize(l.c(getContext(), 47.0f), i2));
        }
    }

    public l(Context context, View view, int i) {
        super(context);
        this.a = new int[2];
        this.f2908c = view;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        this.f2909d = aVar.c();
        setInputMethodMode(2);
        setTouchable(false);
        setBackgroundDrawable(aVar.D(context, C0838R.drawable.bg_fusiyin));
        setElevation(c(context, 8.33f));
        this.b = new a(context);
        g(context);
        a aVar2 = this.b;
        l.this.f2910e = "";
        setContentView(aVar2);
        int c2 = c(context, 80.0f);
        int c3 = c(context, 47.0f);
        setWidth(c2);
        setHeight(c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context, float f2) {
        return Math.round(TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics()));
    }

    public void d() {
        this.b.invalidate();
    }

    public void e(int i, int i2) {
        setBackgroundDrawable(IAppGlobals.a.D(getContentView().getContext(), C0838R.drawable.bg_fusiyin));
        this.b.invalidate();
        int width = getWidth();
        int height = getHeight();
        this.f2908c.getLocationInWindow(this.a);
        showAtLocation(this.f2908c, 51, 0, 0);
        int[] iArr = this.a;
        int i3 = (i + iArr[0]) - (width / 2);
        int i4 = i2 + iArr[1];
        int i5 = this.f2909d;
        update(i3, (i4 - i5) - (i5 / 2), width, height);
    }

    public void f(String str) {
        this.f2910e = str;
        this.b.measure(View.MeasureSpec.makeMeasureSpec(c(this.b.getContext(), 80.0f), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(c(this.b.getContext(), 47.0f), BasicMeasure.EXACTLY));
        getWidth();
        getHeight();
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        setWidth(measuredWidth);
        setHeight(measuredHeight);
    }

    public void g(Context context) {
        a aVar = this.b;
        float c2 = c(context, 21.0f);
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        aVar.a(c2, false, aVar2.l(context, C0838R.color.fusiyin_text));
    }
}
