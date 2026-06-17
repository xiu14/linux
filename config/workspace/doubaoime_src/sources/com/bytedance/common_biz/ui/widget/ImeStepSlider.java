package com.bytedance.common_biz.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.TypefaceCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.o;
import kotlin.s.b.q;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes.dex */
public final class ImeStepSlider extends View {
    private Integer A;
    private Integer B;
    private Integer C;
    private boolean D;
    private boolean E;

    /* renamed from: J, reason: collision with root package name */
    private Typeface f4357J;
    private Typeface K;
    private q<? super Integer, ? super String, ? super Boolean, o> L;
    private final Paint a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f4358c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f4359d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f4360e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f4361f;

    /* renamed from: g, reason: collision with root package name */
    private final RectF f4362g;
    private Drawable h;
    private float i;
    private int j;
    private int k;
    private List<String> l;
    private int m;
    private float[] n;
    private float[] o;
    private float p;
    private float q;
    private float r;
    private boolean s;
    private boolean t;
    private ValueAnimator u;
    private int v;
    private int w;
    private int x;
    private Paint y;
    private Integer z;

    private static final class a extends Drawable {
        private final float a;
        private final Context b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4363c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4364d;

        /* renamed from: e, reason: collision with root package name */
        private final float f4365e;

        /* renamed from: f, reason: collision with root package name */
        private final float f4366f;

        /* renamed from: g, reason: collision with root package name */
        private final Paint f4367g;
        private final Paint h;
        private final Paint i;
        private final Paint j;

        public a(float f2, Context context) {
            l.f(context, "context");
            this.a = f2;
            this.b = context;
            this.f4365e = f2 / 2.0f;
            this.f4366f = (f2 * 0.444f) / 2.0f;
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setShadowLayer(e.a.a.a.a.m("Resources.getSystem()", 1, 4), 0.0f, 0.0f, context.getColor(C0838R.color.ime_color_black_1A));
            this.f4367g = paint;
            Paint paint2 = new Paint(1);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.h = paint2;
            Paint paint3 = new Paint(1);
            paint3.setColor(Color.parseColor("#D3D3D3"));
            this.i = paint3;
            Paint paint4 = new Paint(1);
            paint4.setColor(Color.parseColor("#F0F0F0"));
            this.j = paint4;
        }

        public final void a(boolean z) {
            this.f4363c = z;
        }

        public final void b(boolean z) {
            this.f4364d = z;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            l.f(canvas, "canvas");
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            int saveLayer = canvas.saveLayer(null, null);
            if (this.f4364d && this.f4363c) {
                canvas.drawCircle(exactCenterX, exactCenterY, this.f4365e, this.i);
                canvas.drawCircle(exactCenterX, exactCenterY, this.f4366f, this.j);
            } else {
                canvas.drawCircle(exactCenterX, exactCenterY, this.f4365e, this.f4367g);
                canvas.drawCircle(exactCenterX, exactCenterY, this.f4366f, this.h);
            }
            canvas.restoreToCount(saveLayer);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.f4367g.setAlpha(i);
            this.i.setAlpha(i);
            this.j.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f4367g.setColorFilter(colorFilter);
            this.i.setColorFilter(colorFilter);
            this.j.setColorFilter(colorFilter);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeStepSlider(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final void a(float f2) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, f2);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.common_biz.ui.widget.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ImeStepSlider.h(ImeStepSlider.this, valueAnimator2);
            }
        });
        ofFloat.start();
        this.u = ofFloat;
    }

    private final int b(float f2) {
        Integer num;
        if (this.l.isEmpty()) {
            return 0;
        }
        float[] fArr = this.n;
        l.f(fArr, "<this>");
        Iterator<Integer> it2 = new kotlin.w.d(0, kotlin.collections.g.x(fArr)).iterator();
        if (it2.hasNext()) {
            Integer next = it2.next();
            if (it2.hasNext()) {
                float abs = Math.abs(this.n[next.intValue()] - f2);
                do {
                    Integer next2 = it2.next();
                    float abs2 = Math.abs(this.n[next2.intValue()] - f2);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it2.hasNext());
            }
            num = next;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public static void e(ImeStepSlider imeStepSlider, int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if ((i2 & 2) != 0) {
            z = false;
        }
        int i3 = i2 & 4;
        if (imeStepSlider.f()) {
            imeStepSlider.m = i;
            return;
        }
        if (i >= 0 && i < imeStepSlider.l.size()) {
            z3 = true;
        }
        if (z3) {
            float[] fArr = imeStepSlider.n;
            float f2 = (i < 0 || i > kotlin.collections.g.x(fArr)) ? 0.0f : fArr[i];
            if (z) {
                imeStepSlider.a(f2);
            } else {
                imeStepSlider.i = f2;
                imeStepSlider.invalidate();
            }
            if (i != imeStepSlider.m) {
                imeStepSlider.m = i;
            }
        }
    }

    private final boolean f() {
        return this.v == 1;
    }

    private final boolean g() {
        return this.v == 0;
    }

    public static void h(ImeStepSlider imeStepSlider, ValueAnimator valueAnimator) {
        l.f(imeStepSlider, "this$0");
        l.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        imeStepSlider.i = ((Float) animatedValue).floatValue();
        imeStepSlider.invalidate();
    }

    private final void i(int i, boolean z, boolean z2) {
        if (f()) {
            this.m = i;
            return;
        }
        boolean z3 = false;
        if (i >= 0 && i < this.l.size()) {
            z3 = true;
        }
        if (z3) {
            float[] fArr = this.n;
            float f2 = (i < 0 || i > kotlin.collections.g.x(fArr)) ? 0.0f : fArr[i];
            if (z) {
                a(f2);
            } else {
                this.i = f2;
                invalidate();
            }
            if (i != this.m) {
                this.m = i;
                q<? super Integer, ? super String, ? super Boolean, o> qVar = this.L;
                if (qVar != null) {
                    qVar.d(Integer.valueOf(i), this.l.get(this.m), Boolean.valueOf(z2));
                }
            }
        }
    }

    private final void j(boolean z) {
        if (g()) {
            return;
        }
        int d2 = d();
        this.w = d2;
        q<? super Integer, ? super String, ? super Boolean, o> qVar = this.L;
        if (qVar != null) {
            qVar.d(Integer.valueOf(d2), String.valueOf(this.w), Boolean.valueOf(z));
        }
    }

    private final List<String> k(String str, float f2, Paint paint) {
        int i = 0;
        if ((str.length() == 0) || f2 <= 0.0f || paint.measureText(str) <= f2) {
            return kotlin.collections.g.F(str);
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (paint.measureText(str, i, i3) <= f2) {
                    i2 = i3;
                }
            }
            String substring = str.substring(i, i2);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            i = i2;
        }
        return arrayList;
    }

    public static /* synthetic */ void setProgress$default(ImeStepSlider imeStepSlider, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        imeStepSlider.setProgress(i, z);
    }

    public final int c() {
        return this.m;
    }

    public final int d() {
        if (g()) {
            int size = this.l.size();
            int i = this.m;
            if (i >= 0 && i < size) {
                return i;
            }
            return 0;
        }
        RectF rectF = this.f4361f;
        float f2 = rectF.left;
        int i2 = this.j;
        float f3 = f2 + i2;
        float f4 = (rectF.right - i2) - f3;
        if (f4 <= 0.0f) {
            return 0;
        }
        return h.f((int) (((this.i - f3) / f4) * 100), 0, 100);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float applyDimension;
        float f2;
        float f3;
        float f4;
        Integer num;
        Integer num2;
        Paint paint;
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f4361f;
        float f5 = this.p;
        float f6 = 2;
        canvas.drawRoundRect(rectF, f5 / f6, f5 / f6, this.a);
        float f7 = this.f4361f.left;
        boolean z = this.i <= ((float) this.j) + f7;
        if (z) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            f7 += TypedValue.applyDimension(1, 3, system.getDisplayMetrics());
        }
        if (z) {
            float f8 = (this.p / f6) + this.i;
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            applyDimension = f8 - TypedValue.applyDimension(1, 3, system2.getDisplayMetrics());
        } else {
            float f9 = (this.p / f6) + this.i;
            Resources system3 = Resources.getSystem();
            l.e(system3, "Resources.getSystem()");
            applyDimension = f9 - TypedValue.applyDimension(1, f6, system3.getDisplayMetrics());
        }
        RectF rectF2 = this.f4361f;
        if (z) {
            float f10 = rectF2.top;
            Resources system4 = Resources.getSystem();
            l.e(system4, "Resources.getSystem()");
            f2 = TypedValue.applyDimension(1, f6, system4.getDisplayMetrics()) + f10;
        } else {
            f2 = rectF2.top;
        }
        float f11 = this.f4361f.bottom;
        if (z) {
            Resources system5 = Resources.getSystem();
            l.e(system5, "Resources.getSystem()");
            f11 -= TypedValue.applyDimension(1, f6, system5.getDisplayMetrics());
        }
        this.f4362g.set(f7, f2, applyDimension, f11);
        RectF rectF3 = this.f4362g;
        float f12 = this.p;
        canvas.drawRoundRect(rectF3, f12 / f6, f12 / f6, this.b);
        if (g() && (!this.l.isEmpty())) {
            float[] fArr = this.n;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                float f13 = fArr[i];
                if (Math.abs(f13 - this.i) > this.j) {
                    if (i != this.x || (paint = this.y) == null || this.z == null || this.A == null) {
                        canvas.drawCircle(f13, this.f4361f.centerY(), this.q, f13 <= this.i ? this.f4359d : this.f4358c);
                    } else {
                        if (f13 <= this.i) {
                            l.c(paint);
                            Integer num3 = this.A;
                            l.c(num3);
                            paint.setColor(num3.intValue());
                        } else {
                            l.c(paint);
                            Integer num4 = this.z;
                            l.c(num4);
                            paint.setColor(num4.intValue());
                        }
                        float centerY = this.f4361f.centerY();
                        float f14 = this.q;
                        Paint paint2 = this.y;
                        l.c(paint2);
                        canvas.drawCircle(f13, centerY, f14, paint2);
                    }
                }
            }
        } else if (f()) {
            RectF rectF4 = this.f4361f;
            float f15 = (rectF4.left + rectF4.right) / f6;
            if (Math.abs(this.i - f15) > this.j) {
                canvas.drawCircle(f15, this.f4361f.centerY(), this.q, f15 <= this.i ? this.f4359d : this.f4358c);
            }
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            if (drawable instanceof a) {
                a aVar = (a) drawable;
                aVar.a(z);
                aVar.b(this.E);
            }
            drawable.setBounds((int) (this.i - this.j), (int) (this.f4361f.centerY() - this.k), (int) (this.i + this.j), (int) (this.f4361f.centerY() + this.k));
            drawable.draw(canvas);
        }
        float f16 = (this.f4361f.bottom + this.r) - this.f4360e.getFontMetrics().ascent;
        if (!g() || !(!this.l.isEmpty())) {
            if (f()) {
                String valueOf = String.valueOf(d());
                float measureText = this.f4360e.measureText(valueOf);
                float f17 = this.i;
                RectF rectF5 = this.f4361f;
                float f18 = measureText / f6;
                canvas.drawText(valueOf, h.e(f17, rectF5.left + f18, rectF5.right - f18), f16, this.f4360e);
                return;
            }
            return;
        }
        Paint.Align textAlign = this.f4360e.getTextAlign();
        if (this.l.size() > 1) {
            RectF rectF6 = this.f4361f;
            f3 = ((rectF6.right - rectF6.left) - (this.j * 2)) / (this.l.size() - 1);
        } else {
            f3 = 0.0f;
        }
        int size = this.l.size();
        for (int i2 = 0; i2 < size; i2++) {
            float[] fArr2 = this.o;
            if ((!(fArr2.length == 0)) && fArr2.length == this.l.size()) {
                float f19 = this.o[i2];
                if (!(f19 == 0.0f)) {
                    this.f4360e.setTextSize(f19);
                    f16 = (this.f4361f.bottom + this.r) - this.f4360e.getFontMetrics().ascent;
                }
            }
            String str = this.l.get(i2);
            boolean z2 = f3 > 0.0f && this.f4360e.measureText(str) > f3;
            if (z2) {
                this.f4360e.setTextAlign(Paint.Align.CENTER);
                float f20 = this.n[i2];
                RectF rectF7 = this.f4361f;
                float f21 = f3 / f6;
                f4 = h.e(f20, rectF7.left + f21, rectF7.right - f21);
            } else if (this.s) {
                this.f4360e.setTextAlign(Paint.Align.CENTER);
                f4 = this.n[i2];
            } else if (i2 == 0) {
                this.f4360e.setTextAlign(Paint.Align.LEFT);
                f4 = this.f4361f.left;
            } else if (i2 == this.l.size() - 1) {
                this.f4360e.setTextAlign(Paint.Align.RIGHT);
                f4 = this.f4361f.right;
            } else {
                this.f4360e.setTextAlign(Paint.Align.CENTER);
                f4 = this.n[i2];
            }
            if (!this.D || (num = this.B) == null || (num2 = this.C) == null) {
                Integer num5 = this.B;
                if (num5 != null) {
                    this.f4360e.setColor(num5.intValue());
                }
                this.f4360e.setTypeface(this.f4357J);
            } else if (i2 == this.m) {
                Paint paint3 = this.f4360e;
                l.c(num2);
                paint3.setColor(num2.intValue());
                this.f4360e.setTypeface(this.K);
            } else {
                Paint paint4 = this.f4360e;
                l.c(num);
                paint4.setColor(num.intValue());
                this.f4360e.setTypeface(this.f4357J);
            }
            if (z2) {
                float f22 = this.f4360e.getFontMetrics().descent - this.f4360e.getFontMetrics().ascent;
                Iterator<String> it2 = k(str, f3, this.f4360e).iterator();
                float f23 = f16;
                while (it2.hasNext()) {
                    canvas.drawText(it2.next(), f4, f23, this.f4360e);
                    f23 += f22;
                }
            } else {
                canvas.drawText(str, f4, f16, this.f4360e);
            }
        }
        this.f4360e.setTextAlign(textAlign);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int resolveSize = View.resolveSize(View.MeasureSpec.getSize(i), i);
        float f2 = this.f4360e.getFontMetrics().descent - this.f4360e.getFontMetrics().ascent;
        if (g() && (!this.l.isEmpty())) {
            float paddingLeft = ((resolveSize - getPaddingLeft()) - getPaddingRight()) - (this.j * 2);
            if (paddingLeft > 0.0f && this.l.size() > 1) {
                float size = paddingLeft / (this.l.size() - 1);
                if (size > 0.0f) {
                    float textSize = this.f4360e.getTextSize();
                    int size2 = this.l.size();
                    i3 = 1;
                    int i4 = 0;
                    while (i4 < size2) {
                        float[] fArr = this.o;
                        l.f(fArr, "<this>");
                        Float f3 = null;
                        Float valueOf = (i4 < 0 || i4 > kotlin.collections.g.x(fArr)) ? null : Float.valueOf(fArr[i4]);
                        if (valueOf != null) {
                            if (!(valueOf.floatValue() == 0.0f)) {
                                f3 = valueOf;
                            }
                        }
                        this.f4360e.setTextSize(f3 != null ? f3.floatValue() : textSize);
                        int size3 = k(this.l.get(i4), size, this.f4360e).size();
                        if (size3 > i3) {
                            i3 = size3;
                        }
                        i4++;
                    }
                    this.f4360e.setTextSize(textSize);
                    setMeasuredDimension(resolveSize, View.resolveSize(getPaddingBottom() + getPaddingTop() + ((int) ((this.k * 2) + this.r + ((!f() || (this.l.isEmpty() ^ true)) ? f2 * i3 : 0.0f))), i2));
                }
            }
        }
        i3 = 1;
        setMeasuredDimension(resolveSize, View.resolveSize(getPaddingBottom() + getPaddingTop() + ((int) ((this.k * 2) + this.r + ((!f() || (this.l.isEmpty() ^ true)) ? f2 * i3 : 0.0f))), i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float paddingTop = (getPaddingTop() + this.k) - (this.p / 2);
        this.f4361f.set(getPaddingLeft(), paddingTop, i - getPaddingRight(), this.p + paddingTop);
        RectF rectF = this.f4361f;
        float f2 = rectF.left;
        int i5 = this.j;
        float f3 = f2 + i5;
        float f4 = rectF.right - i5;
        if (!g()) {
            float f5 = f4 - f3;
            if (f5 > 0.0f) {
                this.i = h.e(((f5 * this.w) / 100.0f) + f3, f3, f4);
                return;
            } else {
                this.i = f3;
                return;
            }
        }
        if (this.l.size() > 1) {
            float size = (f4 - f3) / (this.l.size() - 1);
            int size2 = this.l.size();
            for (int i6 = 0; i6 < size2; i6++) {
                this.n[i6] = (i6 * size) + f3;
            }
        } else if (this.l.size() == 1) {
            this.n[0] = this.f4361f.centerX();
        }
        float[] fArr = this.n;
        int i7 = this.m;
        if (i7 >= 0 && i7 <= kotlin.collections.g.x(fArr)) {
            f3 = fArr[i7];
        }
        this.i = f3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r3 != 3) goto L46;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common_biz.ui.widget.ImeStepSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDefaultPosition(int i) {
        this.x = i;
    }

    public final void setDefaultTickColor(int i, int i2) {
        if (this.y == null) {
            this.y = new Paint(1);
        }
        this.z = Integer.valueOf(i);
        this.A = Integer.valueOf(i2);
    }

    public final void setFirstThumbGray(boolean z) {
        this.E = z;
    }

    public final void setLabelAlignCenter(boolean z) {
        this.s = z;
    }

    public final void setLabelFontSize(float[] fArr) {
        l.f(fArr, "fontSizeArray");
        if ((!(fArr.length == 0)) && (!this.l.isEmpty()) && fArr.length == this.l.size()) {
            this.o = fArr;
            requestLayout();
            invalidate();
        }
    }

    public final void setLabelStatusColor(int i, int i2) {
        this.B = Integer.valueOf(i);
        this.C = Integer.valueOf(i2);
    }

    public final void setLabelStatusColorEnable(boolean z) {
        this.D = z;
        requestLayout();
        invalidate();
    }

    public final void setOnStepChangedListener(q<? super Integer, ? super String, ? super Boolean, o> qVar) {
        l.f(qVar, "listener");
        this.L = qVar;
    }

    public final void setProgress(int i, boolean z) {
        if (g()) {
            return;
        }
        int f2 = h.f(i, 0, 100);
        this.w = f2;
        RectF rectF = this.f4361f;
        float f3 = rectF.left;
        int i2 = this.j;
        float f4 = f3 + i2;
        float f5 = ((((rectF.right - i2) - f4) * f2) / 100.0f) + f4;
        if (z) {
            a(f5);
        } else {
            this.i = f5;
            invalidate();
        }
    }

    public final void setSteps(List<String> list) {
        l.f(list, "steps");
        this.l = list;
        if (!list.isEmpty()) {
            this.n = new float[list.size()];
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeStepSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeStepSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.f4358c = paint3;
        Paint paint4 = new Paint(1);
        this.f4359d = paint4;
        Paint paint5 = new Paint(1);
        this.f4360e = paint5;
        this.f4361f = new RectF();
        this.f4362g = new RectF();
        this.l = kotlin.collections.l.a;
        this.n = new float[0];
        this.o = new float[0];
        setLayerType(1, null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.f2459g);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr….styleable.ImeStepSlider)");
        this.v = obtainStyledAttributes.getInt(5, 0);
        paint.setColor(obtainStyledAttributes.getColor(10, context.getColor(C0838R.color.ime_slide_bg_color)));
        this.p = obtainStyledAttributes.getDimension(11, context.getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_20));
        paint2.setColor(obtainStyledAttributes.getColor(4, context.getColor(C0838R.color.ime_color_primary)));
        paint3.setColor(obtainStyledAttributes.getColor(7, context.getColor(C0838R.color.ime_slide_tick_color)));
        paint4.setColor(obtainStyledAttributes.getColor(8, context.getColor(C0838R.color.ime_slide_active_tick_color)));
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        this.q = obtainStyledAttributes.getDimension(9, TypedValue.applyDimension(1, 3, system.getDisplayMetrics()));
        paint5.setColor(obtainStyledAttributes.getColor(1, context.getColor(C0838R.color.ime_keyboard_progress_text_color)));
        Integer num = 12;
        float floatValue = num.floatValue();
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        paint5.setTextSize(obtainStyledAttributes.getDimension(3, TypedValue.applyDimension(2, floatValue, system2.getDisplayMetrics())));
        paint5.setTextAlign(Paint.Align.CENTER);
        try {
            Typeface typeface = Typeface.DEFAULT;
            this.f4357J = typeface;
            paint5.setTypeface(typeface);
            this.K = TypefaceCompat.create(context, Typeface.DEFAULT, 600, false);
        } catch (Exception unused) {
        }
        this.r = obtainStyledAttributes.getDimension(2, context.getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_6));
        this.s = obtainStyledAttributes.getBoolean(0, this.s);
        this.h = new a(this.p, context);
        float f2 = this.p;
        float f3 = 2;
        this.j = (int) (f2 / f3);
        this.k = (int) (f2 / f3);
        obtainStyledAttributes.recycle();
    }
}
