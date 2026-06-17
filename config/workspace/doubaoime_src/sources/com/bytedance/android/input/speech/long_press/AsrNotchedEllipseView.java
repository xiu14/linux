package com.bytedance.android.input.speech.long_press;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.bytedance.android.input.r.j;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class AsrNotchedEllipseView extends View {
    private float A;
    private final String a;
    private Paint b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f3113c;

    /* renamed from: d, reason: collision with root package name */
    private Path f3114d;

    /* renamed from: e, reason: collision with root package name */
    private Path f3115e;

    /* renamed from: f, reason: collision with root package name */
    private Path f3116f;

    /* renamed from: g, reason: collision with root package name */
    private Path f3117g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private boolean r;
    private boolean s;
    private String t;
    private kotlin.s.b.a<o> u;
    private kotlin.s.b.a<o> v;
    private kotlin.s.b.a<o> w;
    private kotlin.s.b.a<o> x;
    private ValueAnimator y;
    private float z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrNotchedEllipseView(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    private final void a(Canvas canvas, boolean z, boolean z2) {
        if (z2) {
            this.b.setColor(getContext().getResources().getColor(C0838R.color.asr_long_press_button_bk_press));
        } else {
            this.b.setColor(getContext().getResources().getColor(C0838R.color.asr_long_press_button_bk_normal));
        }
        float f2 = z2 ? this.p + this.k : this.k;
        this.b.setStrokeWidth(f2);
        float f3 = 2;
        float height = (getHeight() - this.i) + (this.k / f3);
        float f4 = f2 / f3;
        k kVar = k.a;
        float f5 = k.R() ? this.n : this.l;
        float width = ((getWidth() - f5) / f3) - f4;
        float f6 = f5 + width + f2;
        float f7 = f2 + (k.R() ? this.o : this.m) + height;
        if (z) {
            this.f3114d.reset();
            this.f3116f.reset();
            Path path = this.f3114d;
            float f8 = this.q;
            path.arcTo(width, height + f8, f6, f7 + f8, -97.0f, -180.0f, false);
            this.f3116f.arcTo(width, height, f6, f7, -97.0f, -180.0f, false);
            canvas.drawPath(this.f3114d, this.b);
            return;
        }
        this.f3115e.reset();
        this.f3117g.reset();
        Path path2 = this.f3115e;
        float f9 = this.q;
        path2.arcTo(width, height + f9, f6, f7 + f9, -83.0f, 180.0f, false);
        this.f3117g.arcTo(width, height, f6, f7, -83.0f, 180.0f, false);
        canvas.drawPath(this.f3115e, this.b);
    }

    private final void b(Canvas canvas, String str, Path path, boolean z, boolean z2) {
        String str2 = str;
        int i = 0;
        int i2 = 1;
        if (str2 == null || str.length() == 0) {
            return;
        }
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        if (z2) {
            Paint paint = this.f3113c;
            k kVar = k.a;
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            paint.setTextSize(k.c(TypedValue.applyDimension(1, 17, system.getDisplayMetrics())));
        } else {
            Paint paint2 = this.f3113c;
            k kVar2 = k.a;
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            paint2.setTextSize(k.c(TypedValue.applyDimension(1, 15, system2.getDisplayMetrics())));
        }
        float measureText = this.f3113c.measureText(str2);
        float f2 = this.f3113c.getFontMetrics().bottom - this.f3113c.getFontMetrics().top;
        float f3 = 2;
        float width = (((getWidth() - this.h) / f3) - measureText) / f3;
        if (!z) {
            width -= measureText / f3;
        }
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        if (!z2) {
            Paint paint3 = this.f3113c;
            IAppGlobals.a aVar = IAppGlobals.a;
            Context context = getContext();
            l.e(context, "context");
            paint3.setColor(aVar.l(context, C0838R.color.asr_long_text_notched_ellipse_normal));
        } else if (z) {
            Paint paint4 = this.f3113c;
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Context context2 = getContext();
            l.e(context2, "context");
            paint4.setColor(aVar2.l(context2, C0838R.color.asr_long_text_notched_ellipse_press));
        } else {
            Paint paint5 = this.f3113c;
            IAppGlobals.a aVar3 = IAppGlobals.a;
            Context context3 = getContext();
            l.e(context3, "context");
            paint5.setColor(aVar3.l(context3, C0838R.color.asr_long_text_notched_ellipse_press_right));
        }
        int length2 = str.length();
        while (i < length2) {
            char charAt = z ? str2.charAt((str.length() - i) - i2) : str2.charAt(i);
            float measureText2 = this.f3113c.measureText(String.valueOf(charAt));
            pathMeasure.getPosTan(width, fArr, fArr2);
            PathMeasure pathMeasure2 = pathMeasure;
            float[] fArr3 = fArr2;
            float f4 = f3;
            float atan2 = (float) ((Math.atan2(fArr2[i2], fArr2[0]) * 180) / 3.141592653589793d);
            if (z) {
                atan2 -= 180.0f;
            }
            canvas.save();
            canvas.translate(fArr[0], (f2 / 4) + fArr[1]);
            canvas.rotate(atan2);
            canvas.drawText(String.valueOf(charAt), 0.0f, 0.0f, this.f3113c);
            canvas.restore();
            if (z) {
                i2 = 1;
                if (i == (str.length() / 2) - 1) {
                    this.z = width;
                }
            } else {
                if (i == 0) {
                    this.A = (measureText2 / f4) + width;
                }
                i2 = 1;
            }
            width += measureText2;
            if (width > length) {
                return;
            }
            i++;
            str2 = str;
            fArr2 = fArr3;
            pathMeasure = pathMeasure2;
            f3 = f4;
        }
    }

    private final void c(Canvas canvas, String str, Path path, boolean z, boolean z2) {
        String str2 = str;
        int i = 1;
        int i2 = 0;
        if (str2 == null || str.length() == 0) {
            return;
        }
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float measureText = this.f3113c.measureText(str2);
        float f2 = this.f3113c.getFontMetrics().bottom - this.f3113c.getFontMetrics().top;
        float abs = z ? this.z : this.A - (Math.abs(measureText - this.f3113c.measureText(this.t)) / 2);
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        Paint paint = this.f3113c;
        k kVar = k.a;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        paint.setTextSize(k.c(TypedValue.applyDimension(1, 11, system.getDisplayMetrics())));
        if (z2) {
            this.f3113c.setColor(getContext().getResources().getColor(C0838R.color.asr_long_text_press));
        } else {
            this.f3113c.setColor(getContext().getResources().getColor(C0838R.color.transparent));
        }
        int length2 = str.length();
        float f3 = abs;
        char c2 = 0;
        while (i2 < length2) {
            char charAt = z ? str2.charAt((str.length() - i2) - i) : str2.charAt(i2);
            float measureText2 = this.f3113c.measureText(String.valueOf(charAt));
            pathMeasure.getPosTan(f3, fArr, fArr2);
            int i3 = i2;
            PathMeasure pathMeasure2 = pathMeasure;
            float atan2 = (float) ((Math.atan2(fArr2[i], fArr2[c2]) * 180) / 3.141592653589793d);
            if (z) {
                atan2 -= 180.0f;
            }
            canvas.save();
            canvas.translate(fArr[0], (f2 / 4) + fArr[1]);
            canvas.rotate(atan2);
            canvas.drawText(String.valueOf(charAt), 0.0f, 0.0f, this.f3113c);
            canvas.restore();
            f3 += measureText2;
            if (f3 > length) {
                return;
            }
            c2 = 0;
            i = 1;
            pathMeasure = pathMeasure2;
            i2 = i3 + 1;
            str2 = str;
        }
    }

    private final void d() {
        k kVar = k.a;
        this.i = k.L(getResources().getInteger(C0838R.integer.asr_long_press_notched_ellipse_height_draw));
        this.j = k.L(8);
        this.k = k.L(57);
        this.l = k.L(698);
        this.m = k.L(465);
        this.n = k.L(1123);
        this.o = k.L(466);
        this.h = k.L(50);
        this.q = k.L(50);
        this.b.setStrokeWidth(this.k);
    }

    private final boolean e(float f2, boolean z) {
        return z ? f2 >= 0.0f && f2 < ((float) (getWidth() / 2)) : f2 > ((float) (getWidth() / 2)) && f2 <= ((float) getWidth());
    }

    static final void f(AsrNotchedEllipseView asrNotchedEllipseView, ValueAnimator valueAnimator) {
        l.f(asrNotchedEllipseView, "this$0");
        l.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        asrNotchedEllipseView.p = ((Float) animatedValue).floatValue() * asrNotchedEllipseView.j;
        asrNotchedEllipseView.invalidate();
    }

    public final boolean g(MotionEvent motionEvent) {
        kotlin.s.b.a<o> aVar;
        kotlin.s.b.a<o> aVar2;
        if (motionEvent == null) {
            return false;
        }
        boolean z = this.r;
        boolean z2 = this.s;
        getLocationOnScreen(new int[2]);
        float rawX = motionEvent.getRawX() - r4[0];
        this.r = e(rawX, true);
        this.s = e(rawX, false);
        int action = motionEvent.getAction();
        if (action == 1) {
            boolean z3 = this.r;
            if (z3 || this.s) {
                if (z3 && (aVar2 = this.w) != null) {
                    aVar2.invoke();
                }
                if (this.s && (aVar = this.x) != null) {
                    aVar.invoke();
                }
                String str = this.a;
                StringBuilder M = e.a.a.a.a.M("onTouchEventProcess isTouchingStrokeLeft ");
                M.append(this.r);
                M.append(", isTouchingStrokeRight ");
                M.append(this.s);
                j.m(str, M.toString());
            }
            this.r = false;
        } else if (action == 2 && (z != this.r || z2 != this.s)) {
            invalidate();
            if (this.r) {
                kotlin.s.b.a<o> aVar3 = this.u;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                ValueAnimator valueAnimator = this.y;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
            if (this.s) {
                kotlin.s.b.a<o> aVar4 = this.v;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
        return this.r || this.s;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            a(canvas, true, this.r);
            a(canvas, false, this.s);
            b(canvas, "撤回输入", this.f3114d, true, this.r);
            b(canvas, this.t, this.f3115e, false, this.s);
            c(canvas, "松手 撤回", this.f3116f, true, this.r);
            StringBuilder M = e.a.a.a.a.M("松手 一键");
            M.append(this.t);
            c(canvas, M.toString(), this.f3117g, false, this.s);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            d();
        } else {
            this.s = false;
            this.r = false;
        }
    }

    public final void setActionClickLeft(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "action");
        this.w = aVar;
    }

    public final void setActionClickRight(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "action");
        this.x = aVar;
    }

    public final void setActionInLeft(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "action");
        this.u = aVar;
    }

    public final void setActionInRight(kotlin.s.b.a<o> aVar) {
        l.f(aVar, "action");
        this.v = aVar;
    }

    public final void setLeaveAll() {
        this.r = false;
        this.s = false;
        invalidate();
    }

    public final void setTextSend(int i) {
        String string = getContext().getString(i);
        l.e(string, "context.getString(text)");
        this.t = string;
        e.a.a.a.a.j0("text show = ", i, this.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrNotchedEllipseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrNotchedEllipseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = "Asr-NotchedEllipseView";
        this.b = new Paint();
        this.f3113c = new Paint();
        this.f3114d = new Path();
        this.f3115e = new Path();
        this.f3116f = new Path();
        this.f3117g = new Path();
        this.t = "发送";
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeCap(Paint.Cap.ROUND);
        this.b.setStrokeJoin(Paint.Join.ROUND);
        this.b.setColor(context.getResources().getColor(C0838R.color.asr_long_press_button_bk_normal));
        Paint paint = new Paint();
        this.f3113c = paint;
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3113c.setTypeface(Typeface.create(Typeface.DEFAULT, 500, false));
        } else {
            try {
                this.f3113c.setTypeface(Typeface.create("sans-serif-medium", 0));
            } catch (Exception e2) {
                j.k(this.a, "Failed to create typeface 'sans-serif-medium'", e2);
                this.f3113c.setTypeface(Typeface.DEFAULT);
            }
        }
        this.f3113c.setColor(context.getResources().getColor(C0838R.color.white));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.speech.long_press.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AsrNotchedEllipseView.f(AsrNotchedEllipseView.this, valueAnimator);
            }
        });
        this.y = ofFloat;
        d();
        setClickable(true);
    }
}
