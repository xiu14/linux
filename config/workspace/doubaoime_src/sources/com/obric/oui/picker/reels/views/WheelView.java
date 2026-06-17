package com.obric.oui.picker.reels.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class WheelView extends View {
    private boolean a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7917c;

    /* renamed from: d, reason: collision with root package name */
    private int f7918d;

    /* renamed from: e, reason: collision with root package name */
    private int f7919e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f7920f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f7921g;
    private Rect h;
    private final e i;
    private final e j;
    private final e k;
    private final e l;
    private final e m;
    private final e n;
    private final List<String> o;
    private CharSequence p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    /* compiled from: kotlin-style lambda group */
    static final class a extends m implements kotlin.s.b.a<TextPaint> {
        public static final a b = new a(0);

        /* renamed from: c, reason: collision with root package name */
        public static final a f7922c = new a(1);

        /* renamed from: d, reason: collision with root package name */
        public static final a f7923d = new a(2);
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public final TextPaint invoke() {
            int i = this.a;
            if (i == 0) {
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                return textPaint;
            }
            if (i == 1) {
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setAntiAlias(true);
                return textPaint2;
            }
            if (i != 2) {
                throw null;
            }
            TextPaint textPaint3 = new TextPaint();
            textPaint3.setAntiAlias(true);
            return textPaint3;
        }
    }

    /* compiled from: kotlin-style lambda group */
    static final class b extends m implements kotlin.s.b.a<Paint> {
        public static final b b = new b(0);

        /* renamed from: c, reason: collision with root package name */
        public static final b f7924c = new b(1);
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public final Paint invoke() {
            int i = this.a;
            if (i == 0) {
                return new Paint();
            }
            if (i == 1) {
                return new Paint();
            }
            throw null;
        }
    }

    static final class c extends m implements kotlin.s.b.a<com.obric.oui.picker.reels.views.b> {
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.b = context;
        }

        @Override // kotlin.s.b.a
        public com.obric.oui.picker.reels.views.b invoke() {
            return new com.obric.oui.picker.reels.views.b(this.b, WheelView.this);
        }
    }

    public WheelView(Context context) {
        this(context, null);
    }

    private final Paint c() {
        return (Paint) this.l.getValue();
    }

    private final Paint d() {
        return (Paint) this.m.getValue();
    }

    private final com.obric.oui.picker.reels.views.b e() {
        return (com.obric.oui.picker.reels.views.b) this.n.getValue();
    }

    private final TextPaint f() {
        return (TextPaint) this.k.getValue();
    }

    private final TextPaint g() {
        return (TextPaint) this.j.getValue();
    }

    private final TextPaint h() {
        return (TextPaint) this.i.getValue();
    }

    private final int i() {
        int paddingBottom = (this.f7919e * this.f7917c) + getPaddingBottom() + getPaddingTop();
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        return paddingBottom - kotlin.t.a.a(TypedValue.applyDimension(1, 30, system.getDisplayMetrics()));
    }

    public static /* synthetic */ void setCurrentIndex$default(WheelView wheelView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        wheelView.setCurrentIndex(i, z);
    }

    public final int a() {
        return this.f7919e;
    }

    public final int b() {
        return this.o.size();
    }

    @Override // android.view.View
    public void computeScroll() {
        e().a();
    }

    public final boolean j() {
        return this.r;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.obric.oui.picker.reels.views.b e2 = e();
        Context context = getContext();
        l.e(context, "context");
        Objects.requireNonNull(e2);
        l.f(context, "context");
        e.i.b.c.b.l.f10018e.d(context, C0838R.raw.reel_picker);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.picker.reels.views.WheelView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else if (mode == 1073741824) {
            setMeasuredDimension(size, i());
        } else if (mode2 == 1073741824) {
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + this.f7918d, size2);
        } else {
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + this.f7918d, i());
        }
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        int i3 = (paddingTop + measuredHeight) / 2;
        Rect rect = new Rect();
        rect.left = paddingLeft;
        rect.right = measuredWidth;
        int i4 = this.f7919e / 2;
        rect.top = i3 - i4;
        rect.bottom = i4 + i3;
        this.f7921g = rect;
        Rect rect2 = new Rect();
        rect2.left = paddingLeft;
        rect2.right = measuredWidth;
        rect2.top = paddingTop;
        rect2.bottom = i3 - (this.f7919e / 2);
        this.f7920f = rect2;
        Rect rect3 = new Rect();
        rect3.left = paddingLeft;
        rect3.right = measuredWidth;
        rect3.top = (this.f7919e / 2) + i3;
        rect3.bottom = measuredHeight;
        this.h = rect3;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        e().g(motionEvent);
        return true;
    }

    public final void setCurrentIndex(int i) {
        setCurrentIndex$default(this, i, false, 2, null);
    }

    public final void setCyclic(boolean z) {
        this.r = z;
        e().h();
        invalidate();
    }

    public final void setEntries(String... strArr) {
        l.f(strArr, "entries");
        this.o.clear();
        if (!(strArr.length == 0)) {
            g.b(this.o, strArr);
        }
        e().h();
        setCurrentIndex$default(this, this.b, false, 2, null);
        invalidate();
    }

    public final void setHighlightColor(int i) {
        d().setColor(i);
        invalidate();
    }

    public final void setHighlightConorRadiusPx(int i) {
        this.q = i;
        invalidate();
    }

    public final void setItemCount(int i) {
        this.f7917c = i;
        invalidate();
    }

    public final void setItemHeightPx(int i) {
        this.f7919e = i;
        invalidate();
    }

    public final void setItemWidthPx(int i) {
        this.f7918d = i;
        invalidate();
    }

    public final void setOnWheelChangedListener(com.obric.oui.picker.reels.views.a aVar) {
        e().j(aVar);
    }

    public final void setSelectedTextColor(int i) {
        f().setColor(i);
        invalidate();
    }

    public final void setSelectedTextSizePx(float f2) {
        f().setTextSize(f2);
        invalidate();
    }

    public final void setShowBottomLeftCorner(boolean z) {
        this.u = z;
    }

    public final void setShowBottomRightCorner(boolean z) {
        this.v = z;
    }

    public final void setShowDivider(boolean z) {
        this.a = z;
        invalidate();
    }

    public final void setShowTopLeftCorner(boolean z) {
        this.s = z;
    }

    public final void setShowTopRightCorner(boolean z) {
        this.t = z;
    }

    public final void setStartIndex(int i) {
        this.b = i;
        e().i(i, false);
    }

    public final void setTagText(CharSequence charSequence) {
        l.f(charSequence, "tag");
        if (!kotlin.text.a.s(charSequence)) {
            this.p = charSequence;
            invalidate();
        }
    }

    public final void setTextColor(int i) {
        h().setColor(i);
        invalidate();
    }

    public final void setTextSizePx(float f2) {
        h().setTextSize(f2);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        ArrayList arrayList;
        l.f(context, "context");
        this.f7917c = 7;
        float f2 = 343;
        this.f7918d = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        this.f7919e = e.a.a.a.a.e0("Resources.getSystem()", 1, 48);
        this.i = kotlin.a.c(a.f7923d);
        this.j = kotlin.a.c(a.f7922c);
        this.k = kotlin.a.c(a.b);
        this.l = kotlin.a.c(b.b);
        this.m = kotlin.a.c(b.f7924c);
        this.n = kotlin.a.c(new c(context));
        this.o = new ArrayList();
        float f3 = 8;
        this.q = e.a.a.a.a.e0("Resources.getSystem()", 1, f3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.U);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.OWheelView)");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        int i = obtainStyledAttributes.getInt(10, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(9, false);
        int i2 = obtainStyledAttributes.getInt(4, 7);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(5, kotlin.t.a.a(TypedValue.applyDimension(1, 40, system2.getDisplayMetrics())));
        Resources system3 = Resources.getSystem();
        l.e(system3, "Resources.getSystem()");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, kotlin.t.a.a(TypedValue.applyDimension(2, 16, system3.getDisplayMetrics())));
        Resources system4 = Resources.getSystem();
        l.e(system4, "Resources.getSystem()");
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(12, kotlin.t.a.a(TypedValue.applyDimension(2, 14, system4.getDisplayMetrics())));
        int color = obtainStyledAttributes.getColor(11, ContextCompat.getColor(context, C0838R.color.oui_text_1));
        int color2 = obtainStyledAttributes.getColor(7, ContextCompat.getColor(context, C0838R.color.oui_accent_fg));
        Resources system5 = Resources.getSystem();
        l.e(system5, "Resources.getSystem()");
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(8, kotlin.t.a.a(TypedValue.applyDimension(2, 20, system5.getDisplayMetrics())));
        int color3 = obtainStyledAttributes.getColor(2, ContextCompat.getColor(context, C0838R.color.oui_fill_element_2));
        Resources system6 = Resources.getSystem();
        l.e(system6, "Resources.getSystem()");
        int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(3, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system6.getDisplayMetrics())));
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(1);
        if (textArray != null) {
            arrayList = new ArrayList(textArray.length);
            str = "Resources.getSystem()";
            int i3 = 0;
            for (int length = textArray.length; i3 < length; length = length) {
                CharSequence charSequence = textArray[i3];
                i3++;
                arrayList.add(charSequence.toString());
            }
        } else {
            str = "Resources.getSystem()";
            arrayList = null;
        }
        obtainStyledAttributes.recycle();
        setCyclic(z);
        setShowDivider(z2);
        setStartIndex(i);
        setItemCount(i2);
        setItemWidthPx(dimensionPixelOffset);
        setItemHeightPx(dimensionPixelOffset2);
        setHighlightConorRadiusPx(dimensionPixelOffset3);
        TextPaint h = h();
        h.setTextAlign(Paint.Align.CENTER);
        h.setTextSize(dimensionPixelSize);
        h.setColor(color);
        h.setTypeface(Typeface.create(null, 480, false));
        TextPaint g2 = g();
        g2.setTextAlign(Paint.Align.LEFT);
        g2.setTextSize(dimensionPixelSize2);
        g2.setColor(color);
        g2.setTypeface(Typeface.create(null, 600, false));
        TextPaint f4 = f();
        f4.setTextAlign(Paint.Align.CENTER);
        f4.setTextSize(dimensionPixelSize3);
        f4.setColor(color2);
        f4.setTypeface(Typeface.create(null, 640, false));
        Paint c2 = c();
        Resources system7 = Resources.getSystem();
        l.e(system7, str);
        boolean z3 = true;
        c2.setStrokeWidth(TypedValue.applyDimension(1, (float) 0.5d, system7.getDisplayMetrics()));
        c2.setColor(ContextCompat.getColor(context, C0838R.color.LinePrimary));
        Paint d2 = d();
        d2.setStyle(Paint.Style.FILL);
        d2.setColor(color3);
        if (arrayList != null && !arrayList.isEmpty()) {
            z3 = false;
        }
        if (z3) {
            return;
        }
        this.o.addAll(arrayList);
        setCurrentIndex$default(this, i, false, 2, null);
    }

    public final void setCurrentIndex(int i, boolean z) {
        e().i(i, z);
    }

    public final void setEntries(List<String> list) {
        this.o.clear();
        if (!(list == null || list.isEmpty())) {
            this.o.addAll(list);
        }
        e().h();
        setCurrentIndex$default(this, this.b, false, 2, null);
        invalidate();
    }
}
