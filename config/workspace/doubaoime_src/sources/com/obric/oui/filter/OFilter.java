package com.obric.oui.filter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.b.c.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OFilter extends DrawableCenterButton {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7733c;

    /* renamed from: d, reason: collision with root package name */
    private int f7734d;

    /* renamed from: e, reason: collision with root package name */
    private int f7735e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f7736f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7737g;
    private boolean h;
    private int i;
    private a j;
    private final float k;
    private final Paint l;
    private final Paint m;
    private final RectF n;
    private final RectF o;

    public interface a {
        void a(OFilter oFilter, boolean z);
    }

    public OFilter(Context context) {
        this(context, null, 0, false, 14);
    }

    public OFilter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12);
    }

    public OFilter(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OFilter(android.content.Context r6, android.util.AttributeSet r7, int r8, boolean r9, int r10) {
        /*
            r5 = this;
            r0 = r10 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            r0 = r10 & 4
            r1 = 0
            if (r0 == 0) goto Lb
            r8 = r1
        Lb:
            r10 = r10 & 8
            if (r10 == 0) goto L10
            r9 = r1
        L10:
            java.lang.String r10 = "context"
            kotlin.s.c.l.f(r6, r10)
            r5.<init>(r6, r7, r8)
            r10 = 12
            float r10 = (float) r10
            java.lang.String r0 = "Resources.getSystem()"
            r2 = 1
            int r10 = e.a.a.a.a.e0(r0, r2, r10)
            r5.a = r10
            r10 = 5
            float r10 = (float) r10
            int r10 = e.a.a.a.a.e0(r0, r2, r10)
            r5.b = r10
            r10 = 16
            float r10 = (float) r10
            int r10 = e.a.a.a.a.e0(r0, r2, r10)
            r5.f7733c = r10
            r10 = 7
            float r10 = (float) r10
            int r10 = e.a.a.a.a.e0(r0, r2, r10)
            r5.f7734d = r10
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            float r10 = (float) r3
            int r10 = e.a.a.a.a.e0(r0, r2, r10)
            float r10 = (float) r10
            r5.k = r10
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
            r5.l = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            r0.setStrokeWidth(r10)
            r5.m = r0
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>()
            r5.n = r10
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>()
            r5.o = r10
            android.content.res.Resources$Theme r10 = r6.getTheme()
            int[] r0 = e.i.a.b.b.t
            android.content.res.TypedArray r7 = r10.obtainStyledAttributes(r7, r0, r8, r1)
            int r8 = r7.getInt(r1, r1)     // Catch: java.lang.Throwable -> Lb8
            r5.f7735e = r8     // Catch: java.lang.Throwable -> Lb8
            r8 = 2
            boolean r8 = r7.getBoolean(r8, r1)     // Catch: java.lang.Throwable -> Lb8
            r5.f7737g = r8     // Catch: java.lang.Throwable -> Lb8
            boolean r8 = r7.getBoolean(r2, r9)     // Catch: java.lang.Throwable -> Lb8
            r5.h = r8     // Catch: java.lang.Throwable -> Lb8
            r7.recycle()
            r5.setSingleLine()
            android.content.res.Resources r7 = r6.getResources()
            r8 = 2131167149(0x7f0707ad, float:1.7948563E38)
            float r7 = r7.getDimension(r8)
            r5.setTextSize(r1, r7)
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131167148(0x7f0707ac, float:1.7948561E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r5.setCompoundDrawablePadding(r6)
            r6 = 17
            r5.setGravity(r6)
            r5.a()
            return
        Lb8:
            r6 = move-exception
            r7.recycle()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.filter.OFilter.<init>(android.content.Context, android.util.AttributeSet, int, boolean, int):void");
    }

    public static /* synthetic */ void setStyle$default(OFilter oFilter, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStyle");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        oFilter.setStyle(i, z);
    }

    public final void a() {
        if (isEnabled()) {
            if (this.f7735e == 1) {
                Resources system = Resources.getSystem();
                l.e(system, "Resources.getSystem()");
                setMinHeight(kotlin.t.a.a(TypedValue.applyDimension(1, 36, system.getDisplayMetrics())));
            } else {
                setMinHeight(-1);
            }
            boolean isSelected = isSelected();
            int i = C0838R.color.BGInput;
            int i2 = C0838R.color.oui_basic_text_2;
            if (isSelected) {
                if (this.h) {
                    i = C0838R.color.BGBrand;
                    this.i = C0838R.color.primary;
                    setTypeface(null, 1);
                } else if (this.f7735e == 1) {
                    this.i = C0838R.color.primary;
                    setTypeface(null, 1);
                    i = C0838R.color.Transparent;
                } else {
                    this.i = C0838R.color.TextPrimary;
                    setTypeface(null, 1);
                    i2 = C0838R.color.BGInput;
                }
                i2 = C0838R.color.primary;
            } else {
                if (this.h) {
                    this.i = C0838R.color.TextReverse;
                    setTypeface(null, 0);
                    i2 = C0838R.color.LineReverse2;
                } else if (this.f7735e == 1) {
                    this.i = C0838R.color.oui_basic_text_2;
                    setTypeface(null, 0);
                } else {
                    this.i = C0838R.color.oui_basic_text_2;
                    i = C0838R.color.oui_basic_text_4;
                    setTypeface(null, 0);
                }
                i = C0838R.color.Transparent;
            }
            this.l.setColor(ContextCompat.getColor(getContext(), i));
            this.m.setColor(ContextCompat.getColor(getContext(), i2));
            setTextColor(ContextCompat.getColor(getContext(), this.i));
            if (!this.f7737g) {
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                int i3 = this.a;
                int i4 = this.b;
                setPadding(i3, i4, i3, i4);
                setGravity(17);
                return;
            }
            if (this.f7736f == null) {
                Drawable drawable = ContextCompat.getDrawable(getContext(), C0838R.drawable.o_arrow_forward_filter);
                this.f7736f = drawable != null ? drawable.mutate() : null;
            }
            Drawable drawable2 = this.f7736f;
            l.c(drawable2);
            Drawable wrap = DrawableCompat.wrap(drawable2);
            DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
            DrawableCompat.setTint(wrap, ContextCompat.getColor(getContext(), this.i));
            l.e(wrap, "drawableCompat");
            wrap.setBounds(0, 0, wrap.getIntrinsicWidth(), wrap.getIntrinsicHeight());
            setGravity(8388629);
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, wrap, (Drawable) null);
            int i5 = this.f7733c;
            int i6 = this.f7734d;
            setPadding(i5, i6, i5, i6);
        }
    }

    @Override // com.obric.oui.filter.DrawableCenterButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        canvas.save();
        canvas.translate(getScrollX() * 1.0f, getScrollY() * 1.0f);
        float e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, this.f7735e == 0 ? 4 : 8);
        this.n.set(0.0f, 0.0f, getWidth(), getHeight());
        p pVar = p.f10030e;
        p.g(canvas, this.n, e0, this.l);
        if (this.f7735e == 1) {
            float f2 = this.k * 0.5f;
            this.o.set(f2, f2, getWidth() - f2, getHeight() - f2);
            p.g(canvas, this.o, e0, this.m);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setAlwaysLight(boolean z) {
        this.h = z;
        a();
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            setAlpha(0.5f);
        } else {
            setAlpha(1.0f);
            a();
        }
    }

    public final void setNormalPadding(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void setSelectChangeListener(a aVar) {
        l.f(aVar, "listener");
        this.j = aVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        a();
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, z);
        }
    }

    public final void setStyle(int i, boolean z) {
        this.f7735e = i;
        this.h = z;
        a();
    }

    public final void setWithIconPadding(int i, int i2) {
        this.f7733c = i;
        this.f7734d = i2;
    }
}
