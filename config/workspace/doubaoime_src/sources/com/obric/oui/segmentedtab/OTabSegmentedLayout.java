package com.obric.oui.segmentedtab;

import android.R;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common.wschannel.WsConstants;
import e.i.b.c.b.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OTabSegmentedLayout extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private int E;

    /* renamed from: J, reason: collision with root package name */
    private int f7977J;
    private float K;
    private boolean L;
    private Typeface M;
    private FragmentManager N;
    private int O;
    private ArrayList<Fragment> P;
    private final ValueAnimator Q;
    private final OvershootInterpolator R;
    private final float[] S;
    private final Paint T;
    private final Paint U;
    private final RectF V;
    private final RectF W;
    private final Context a;
    private List<View> a0;
    private String[] b;
    private boolean b0;

    /* renamed from: c, reason: collision with root package name */
    private Drawable[] f7978c;
    private c c0;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f7979d;
    private final a d0;

    /* renamed from: e, reason: collision with root package name */
    private int f7980e;
    private final a e0;

    /* renamed from: f, reason: collision with root package name */
    private int f7981f;

    /* renamed from: g, reason: collision with root package name */
    private int f7982g;
    private int h;
    private final Rect i;
    private final Rect j;
    private final Paint k;
    private final Paint l;
    private float m;
    private boolean n;
    private float o;
    private int p;
    private float q;
    private float r;
    private float s;
    private long t;
    private boolean u;
    private boolean v;
    private int w;
    private float x;
    private float y;
    private float z;

    public final class a {
        private float a;
        private float b;

        public a(OTabSegmentedLayout oTabSegmentedLayout) {
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final void c(float f2) {
            this.a = f2;
        }

        public final void d(float f2) {
            this.b = f2;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("(left = ");
            M.append(this.a);
            M.append(", right = ");
            M.append(this.b);
            M.append(')');
            return M.toString();
        }
    }

    public final class b implements TypeEvaluator<a> {
        public b() {
        }

        @Override // android.animation.TypeEvaluator
        public a evaluate(float f2, a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            l.f(aVar3, "startValue");
            l.f(aVar4, "endValue");
            float a = ((aVar4.a() - aVar3.a()) * f2) + aVar3.a();
            float b = ((aVar4.b() - aVar3.b()) * f2) + aVar3.b();
            a aVar5 = new a(OTabSegmentedLayout.this);
            aVar5.c(a);
            aVar5.d(b);
            return aVar5;
        }
    }

    public interface c {
        void a(int i);

        void b(int i);
    }

    public OTabSegmentedLayout(Context context) {
        this(context, null, 0);
    }

    private final void e(TextPaint textPaint, boolean z) {
        Typeface defaultFromStyle;
        if (Build.VERSION.SDK_INT >= 28) {
            defaultFromStyle = Typeface.create(null, z ? TypedValues.TransitionType.TYPE_DURATION : 400, false);
        } else {
            defaultFromStyle = Typeface.defaultFromStyle(z ? 1 : 0);
        }
        textPaint.setTypeface(defaultFromStyle);
    }

    private final void f() {
        View childAt = this.f7979d.getChildAt(this.f7980e);
        l.e(childAt, "currentTabView");
        float left = childAt.getLeft();
        float right = childAt.getRight();
        Rect rect = this.i;
        rect.left = (int) left;
        rect.right = (int) right;
        if (this.u) {
            float[] fArr = this.S;
            float f2 = this.r;
            fArr[0] = f2;
            fArr[1] = f2;
            fArr[2] = f2;
            fArr[3] = f2;
            fArr[4] = f2;
            fArr[5] = f2;
            fArr[6] = f2;
            fArr[7] = f2;
            return;
        }
        int i = this.f7980e;
        if (i == 0) {
            float[] fArr2 = this.S;
            float f3 = this.r;
            fArr2[0] = f3;
            fArr2[1] = f3;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = f3;
            fArr2[7] = f3;
            return;
        }
        if (i != this.h - 1) {
            float[] fArr3 = this.S;
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
            fArr3[3] = 0.0f;
            fArr3[4] = 0.0f;
            fArr3[5] = 0.0f;
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
            return;
        }
        float[] fArr4 = this.S;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        float f4 = this.r;
        fArr4[2] = f4;
        fArr4[3] = f4;
        fArr4[4] = f4;
        fArr4[5] = f4;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
    }

    private final int g(float f2) {
        Resources resources = this.a.getResources();
        l.e(resources, "mContext.resources");
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    private final void j(int i) {
        ArrayList<Fragment> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentManager fragmentManager = this.N;
                l.c(fragmentManager);
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                l.e(beginTransaction, "mFragmentManager!!.beginTransaction()");
                ArrayList<Fragment> arrayList2 = this.P;
                l.c(arrayList2);
                Fragment fragment = arrayList2.get(i2);
                l.e(fragment, "mFragments!![i]");
                Fragment fragment2 = fragment;
                if (i2 == i) {
                    beginTransaction.show(fragment2);
                } else {
                    beginTransaction.hide(fragment2);
                }
                beginTransaction.commit();
            }
            this.f7980e = i;
        }
    }

    private final int k(float f2) {
        Resources resources = this.a.getResources();
        l.e(resources, "mContext.resources");
        return (int) ((f2 * resources.getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private final void l(int i) {
        int i2 = this.h;
        int i3 = 0;
        while (i3 < i2) {
            View childAt = this.f7979d.getChildAt(i3);
            boolean z = i3 == i;
            View findViewById = childAt.findViewById(C0838R.id.tv_tab_title);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            ImageView imageView = (ImageView) childAt.findViewById(C0838R.id.tv_tab_icon);
            l.e(imageView, "it");
            imageView.setImageTintList(ColorStateList.valueOf(z ? this.A : this.B));
            if (this.C == 1) {
                TextPaint paint = textView.getPaint();
                l.e(paint, "tabTitle.paint");
                e(paint, z);
            }
            textView.setTypeface(this.M);
            if (!(childAt instanceof OSegmentTabView)) {
                childAt = null;
            }
            OSegmentTabView oSegmentTabView = (OSegmentTabView) childAt;
            if (oSegmentTabView != null) {
                oSegmentTabView.h(z);
            }
            i3++;
        }
    }

    private final void m() {
        int i = this.h;
        int i2 = 0;
        while (i2 < i) {
            View childAt = this.f7979d.getChildAt(i2);
            float f2 = this.m;
            childAt.setPadding((int) f2, 0, (int) f2, 0);
            View findViewById = childAt.findViewById(C0838R.id.tv_tab_title);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            int i3 = this.f7980e;
            boolean z = i2 == i3;
            textView.setTextColor(i2 == i3 ? this.A : this.B);
            textView.setTextSize(0, this.z);
            ImageView imageView = (ImageView) childAt.findViewById(C0838R.id.tv_tab_icon);
            l.e(imageView, "it");
            imageView.setImageTintList(ColorStateList.valueOf(i2 == this.f7980e ? this.A : this.B));
            if (this.D) {
                String obj = textView.getText().toString();
                Locale locale = Locale.ROOT;
                l.e(locale, "Locale.ROOT");
                String upperCase = obj.toUpperCase(locale);
                l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                textView.setText(upperCase);
            }
            int i4 = this.C;
            if (i4 == 2) {
                TextPaint paint = textView.getPaint();
                l.e(paint, "tvTabTitle.paint");
                e(paint, true);
            } else if (i4 == 0) {
                TextPaint paint2 = textView.getPaint();
                l.e(paint2, "tvTabTitle.paint");
                e(paint2, false);
            } else if (i4 == 1) {
                TextPaint paint3 = textView.getPaint();
                l.e(paint3, "tvTabTitle.paint");
                e(paint3, z);
            }
            textView.setTypeface(this.M);
            i2++;
        }
    }

    public static /* synthetic */ void setTabTextTypeface$default(OTabSegmentedLayout oTabSegmentedLayout, Typeface typeface, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        oTabSegmentedLayout.setTabTextTypeface(typeface, z);
    }

    public final int h() {
        return this.f7980e;
    }

    public final List<View> i() {
        return this.a0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        l.f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type com.obric.oui.segmentedtab.OTabSegmentedLayout.IndicatorPoint");
        a aVar = (a) animatedValue;
        this.i.left = (int) aVar.a();
        this.i.right = (int) aVar.b();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        if (isInEditMode() || this.h <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f2 = 0;
        if (this.q < f2) {
            this.q = height - (this.s * 2);
        }
        float f3 = this.r;
        if (f3 < f2 || f3 > this.q / 2) {
            this.r = this.q;
        }
        this.T.setColor(this.E);
        this.V.set(0.0f, getPaddingTop(), getWidth(), height - getPaddingBottom());
        float f4 = 2;
        float f5 = (this.s / f4) + this.r;
        p pVar = p.f10030e;
        p.g(canvas, this.V, f5, this.T);
        if (this.K > f2) {
            this.U.setColor(this.f7977J);
            this.U.setStrokeWidth(this.K);
            this.W.set(this.K / f4, (this.K / f4) + getPaddingTop(), getWidth() - (this.K / f4), (height - getPaddingBottom()) - (this.K / f4));
            p.g(canvas, this.W, f5, this.U);
        }
        if (!this.u) {
            float f6 = this.x;
            if (f6 > f2) {
                this.l.setStrokeWidth(f6);
                this.l.setColor(this.w);
                int i = this.h - 1;
                for (int i2 = 0; i2 < i; i2++) {
                    l.e(this.f7979d.getChildAt(i2), "tab");
                    canvas.drawLine(r1.getRight() + paddingLeft, this.y, r1.getRight() + paddingLeft, height - this.y, this.l);
                }
            }
        }
        if (!this.u) {
            f();
        } else if (this.b0) {
            this.b0 = false;
            f();
        }
        int i3 = this.f7981f;
        View childAt = i3 != -1 ? this.f7979d.getChildAt(i3) : null;
        if (childAt != null) {
            this.j.left = childAt.getLeft();
            this.j.right = childAt.getRight();
        }
        float f7 = (this.s / f4) + this.K;
        Paint paint = this.k;
        paint.setColor(this.p);
        paint.setShadowLayer(e.a.a.a.a.m("Resources.getSystem()", 1, 10), e.a.a.a.a.m("Resources.getSystem()", 1, f2), e.a.a.a.a.m("Resources.getSystem()", 1, 4), ContextCompat.getColor(getContext(), C0838R.color.TabSegmentedShadowColor));
        p pVar2 = p.f10030e;
        Rect rect = this.i;
        float f8 = this.s;
        float f9 = this.K;
        p.f(canvas, paddingLeft + f7 + rect.left, f8 + f9, (paddingLeft + rect.right) - f7, (f8 + this.q) - f9, this.r, this.k);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        l.f(parcelable, WsConstants.KEY_CONNECTION_STATE);
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7980e = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.f7980e != 0 && this.f7979d.getChildCount() > 0) {
                l(this.f7980e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.f7980e);
        return bundle;
    }

    public final void setCurrentTab(int i) {
        int i2 = this.f7980e;
        if (i == i2) {
            return;
        }
        this.f7982g = i2;
        this.f7980e = i;
        l(i);
        j(i);
        if (!this.u) {
            invalidate();
            return;
        }
        View childAt = this.f7979d.getChildAt(this.f7980e);
        a aVar = this.d0;
        l.e(childAt, "currentTabView");
        aVar.c(childAt.getLeft());
        this.d0.d(childAt.getRight());
        View childAt2 = this.f7979d.getChildAt(this.f7982g);
        a aVar2 = this.e0;
        l.e(childAt2, "lastTabView");
        aVar2.c(childAt2.getLeft());
        this.e0.d(childAt2.getRight());
        if (this.e0.a() == this.d0.a() && this.e0.b() == this.d0.b()) {
            invalidate();
            return;
        }
        this.Q.setObjectValues(this.e0, this.d0);
        if (this.v) {
            this.Q.setInterpolator(this.R);
        }
        if (this.t < 0) {
            this.t = this.v ? 500 : ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        this.Q.setDuration(this.t);
        this.Q.start();
    }

    public final void setDividerColor(int i) {
        this.w = i;
        invalidate();
    }

    public final void setDividerPadding(float f2) {
        this.y = g(f2);
        invalidate();
    }

    public final void setDividerWidth(float f2) {
        this.x = g(f2);
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Iterator<View> it2 = this.a0.iterator();
        while (it2.hasNext()) {
            it2.next().setEnabled(z);
        }
    }

    public final void setImageSize(int i, int i2) {
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            ImageView imageView = (ImageView) this.f7979d.getChildAt(i4).findViewById(C0838R.id.tv_tab_icon);
            l.e(imageView, "it");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.height = i2;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public final void setIndicatorAnimDuration(long j) {
        this.t = j;
    }

    public final void setIndicatorAnimEnable(boolean z) {
        this.u = z;
    }

    public final void setIndicatorBounceEnable(boolean z) {
        this.v = z;
    }

    public final void setIndicatorColor(int i) {
        this.p = i;
        invalidate();
    }

    public final void setIndicatorCornerRadius(float f2) {
        this.r = g(f2);
        invalidate();
    }

    public final void setIndicatorHeight(float f2) {
        this.q = g(f2);
        invalidate();
    }

    public final void setOnTabSelectListener(c cVar) {
        this.c0 = cVar;
    }

    public final void setTabData(String[] strArr, FragmentActivity fragmentActivity, int i, ArrayList<Fragment> arrayList) {
        l.f(fragmentActivity, "fa");
        this.N = fragmentActivity.getSupportFragmentManager();
        this.O = i;
        this.P = arrayList;
        if (arrayList != null) {
            Iterator<Fragment> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Fragment next = it2.next();
                FragmentManager fragmentManager = this.N;
                l.c(fragmentManager);
                fragmentManager.beginTransaction().add(this.O, next).hide(next).commit();
            }
            j(0);
        }
        setTabTitleAndDrawable(strArr, null);
    }

    public final void setTabList(List<View> list) {
        l.f(list, "<set-?>");
        this.a0 = list;
    }

    public final void setTabPadding(float f2) {
        this.m = g(f2);
        m();
    }

    public final void setTabSpaceEqual(boolean z) {
        this.n = z;
        m();
    }

    public final void setTabTextTypeface(Typeface typeface, boolean z) {
        this.M = typeface;
        if (z) {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTabTitleAndDrawable(java.lang.String[] r7, android.graphics.drawable.Drawable[] r8) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.segmentedtab.OTabSegmentedLayout.setTabTitleAndDrawable(java.lang.String[], android.graphics.drawable.Drawable[]):void");
    }

    public final void setTabWidth(float f2) {
        this.o = g(f2);
        m();
    }

    public final void setTextAllCaps(boolean z) {
        this.D = z;
        m();
    }

    public final void setTextBold(int i) {
        this.C = i;
        m();
    }

    public final void setTextSelectColor(int i) {
        this.A = i;
        m();
    }

    public final void setTextUnselectColor(int i) {
        this.B = i;
        m();
    }

    public final void setTextsize(float f2) {
        this.z = k(f2);
        m();
    }

    public OTabSegmentedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTabSegmentedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int hashCode;
        l.f(context, "context");
        this.f7981f = -1;
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Paint();
        this.l = new Paint(1);
        this.t = 200L;
        this.u = true;
        this.L = true;
        this.R = new OvershootInterpolator(0.8f);
        this.S = new float[8];
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.T = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.U = paint2;
        this.V = new RectF();
        this.W = new RectF();
        this.a0 = new ArrayList();
        this.b0 = true;
        new Paint(1);
        new SparseArray();
        a aVar = new a(this);
        this.d0 = aVar;
        a aVar2 = new a(this);
        this.e0 = aVar2;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.a = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7979d = linearLayout;
        addView(linearLayout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.M);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.OTabLayout)");
        this.p = obtainStyledAttributes.getColor(9, getResources().getColor(C0838R.color.oui_fill_seg_selected));
        this.q = obtainStyledAttributes.getDimension(11, -1.0f);
        this.r = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension = obtainStyledAttributes.getDimension(16, g(4.0f));
        this.s = dimension;
        int i2 = (int) (dimension / 2);
        linearLayout.setPadding(i2, 0, i2, 0);
        this.u = obtainStyledAttributes.getBoolean(7, false);
        this.v = obtainStyledAttributes.getBoolean(8, true);
        this.t = obtainStyledAttributes.getInt(6, -1);
        this.w = obtainStyledAttributes.getColor(3, this.p);
        this.x = obtainStyledAttributes.getDimension(5, g(1.0f));
        this.y = obtainStyledAttributes.getDimension(4, 0.0f);
        this.z = obtainStyledAttributes.getDimension(22, k(13.0f));
        this.A = obtainStyledAttributes.getColor(21, Color.parseColor("#ffffff"));
        this.B = obtainStyledAttributes.getColor(23, this.p);
        this.C = obtainStyledAttributes.getInt(20, 0);
        this.D = obtainStyledAttributes.getBoolean(19, false);
        this.n = obtainStyledAttributes.getBoolean(18, true);
        float dimension2 = obtainStyledAttributes.getDimension(24, g(-1.0f));
        this.o = dimension2;
        this.m = obtainStyledAttributes.getDimension(17, (this.n || dimension2 > ((float) 0)) ? g(0.0f) : g(10.0f));
        int color = obtainStyledAttributes.getColor(0, 0);
        this.E = color;
        this.f7977J = obtainStyledAttributes.getColor(1, color);
        this.K = obtainStyledAttributes.getDimension(2, g(0.0f));
        this.L = obtainStyledAttributes.getBoolean(25, true);
        obtainStyledAttributes.recycle();
        l.c(attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue == null || ((hashCode = attributeValue.hashCode()) == 1444 ? !attributeValue.equals("-1") : hashCode != 1445 || !attributeValue.equals("-2"))) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            l.e(obtainStyledAttributes2, "context.obtainStyledAttributes(attrs, systemAttrs)");
            obtainStyledAttributes2.getDimensionPixelSize(0, -2);
            obtainStyledAttributes2.recycle();
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new b(), aVar2, aVar);
        l.e(ofObject, "ValueAnimator.ofObject(P…tor(), mLastP, mCurrentP)");
        this.Q = ofObject;
        ofObject.addUpdateListener(this);
    }
}
