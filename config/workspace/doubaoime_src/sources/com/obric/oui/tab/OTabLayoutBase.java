package com.obric.oui.tab;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.doubaoime.C0838R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class OTabLayoutBase extends HorizontalScrollView {
    private static final Interpolator P = new FastOutSlowInInterpolator();
    private static final Pools.Pool<f> Q = new Pools.SynchronizedPool(16);
    private c A;
    private ValueAnimator B;
    ViewPager C;
    private PagerAdapter D;
    private DataSetObserver E;

    /* renamed from: J, reason: collision with root package name */
    TabLayoutOnPageChangeListener f8057J;
    private a K;
    private boolean L;
    private b M;
    private final Pools.Pool<TabView> N;
    private int O;
    private final ArrayList<f> a;
    private f b;

    /* renamed from: c, reason: collision with root package name */
    private final e f8058c;

    /* renamed from: d, reason: collision with root package name */
    private int f8059d;

    /* renamed from: e, reason: collision with root package name */
    private int f8060e;

    /* renamed from: f, reason: collision with root package name */
    private int f8061f;

    /* renamed from: g, reason: collision with root package name */
    int f8062g;
    int h;
    int i;
    int j;
    int k;

    @Deprecated
    int l;
    ColorStateList m;
    float n;
    float o;
    int p;
    int q;
    int r;
    private int s;
    private int t;
    int u;
    int v;
    int w;
    boolean x;
    private c y;
    private final ArrayList<c> z;

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private final WeakReference<OTabLayoutBase> a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f8063c;

        /* renamed from: d, reason: collision with root package name */
        private int f8064d;

        /* renamed from: e, reason: collision with root package name */
        private int f8065e;

        /* renamed from: f, reason: collision with root package name */
        private ArgbEvaluator f8066f = new ArgbEvaluator();

        /* renamed from: g, reason: collision with root package name */
        private AccelerateInterpolator f8067g = new AccelerateInterpolator();

        public TabLayoutOnPageChangeListener(OTabLayoutBase oTabLayoutBase) {
            new DecelerateInterpolator(1.6f);
            this.a = new WeakReference<>(oTabLayoutBase);
            this.f8065e = oTabLayoutBase.m.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, 0);
            this.f8064d = oTabLayoutBase.m.getDefaultColor();
        }

        void a() {
            this.b = 0;
            this.f8063c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.b = this.f8063c;
            this.f8063c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f2, int i2) {
            OTabLayoutBase oTabLayoutBase = this.a.get();
            if (oTabLayoutBase != null) {
                int i3 = this.f8063c;
                oTabLayoutBase.v(i, f2, i3 != 2 || this.b == 1, (i3 == 2 && this.b == 0) ? false : true);
                if (this.f8063c == 2 && this.b == 0) {
                    oTabLayoutBase.f8058c.l = false;
                } else {
                    oTabLayoutBase.f8058c.l = true;
                    View childAt = oTabLayoutBase.f8058c.getChildAt(oTabLayoutBase.f8058c.f8073c);
                    View childAt2 = oTabLayoutBase.f8058c.getChildAt(oTabLayoutBase.f8058c.f8073c + 1);
                    if (childAt != null && childAt2 != null) {
                        View findViewById = childAt.findViewById(C0838R.id.layout_tab_indicator);
                        View findViewById2 = childAt2.findViewById(C0838R.id.layout_tab_indicator);
                        if (findViewById != null && findViewById2 != null) {
                            float width = ((childAt.getWidth() - findViewById.getWidth()) / 2) + childAt.getLeft();
                            float width2 = findViewById.getWidth() + width;
                            float width3 = ((childAt2.getWidth() - findViewById2.getWidth()) / 2) + childAt2.getLeft();
                            float width4 = findViewById2.getWidth() + width3;
                            ImageView imageView = (ImageView) findViewById.findViewById(C0838R.id.tab_item_img);
                            TextView textView = (TextView) findViewById.findViewById(C0838R.id.tab_item_text);
                            ImageView imageView2 = (ImageView) findViewById2.findViewById(C0838R.id.tab_item_img);
                            TextView textView2 = (TextView) findViewById2.findViewById(C0838R.id.tab_item_text);
                            int intValue = ((Integer) this.f8066f.evaluate(f2, Integer.valueOf(this.f8065e), Integer.valueOf(this.f8064d))).intValue();
                            if (imageView != null && textView != null) {
                                textView.setTextColor(intValue);
                                imageView.setImageAlpha(Color.alpha(intValue));
                            }
                            int intValue2 = ((Integer) this.f8066f.evaluate(f2, Integer.valueOf(this.f8064d), Integer.valueOf(this.f8065e))).intValue();
                            if (imageView2 != null && textView2 != null) {
                                textView2.setTextColor(intValue2);
                                imageView2.setImageAlpha(Color.alpha(intValue2));
                            }
                            oTabLayoutBase.f8058c.j = (this.f8067g.getInterpolation(f2) * (width3 - width)) + width;
                            oTabLayoutBase.f8058c.k = (this.f8067g.getInterpolation(f2) * (width4 - width2)) + width2;
                        }
                    }
                }
                ViewCompat.postInvalidateOnAnimation(oTabLayoutBase.f8058c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            OTabLayoutBase oTabLayoutBase = this.a.get();
            if (oTabLayoutBase == null || oTabLayoutBase.o() == i || i >= oTabLayoutBase.q()) {
                return;
            }
            int i2 = this.f8063c;
            oTabLayoutBase.t(oTabLayoutBase.p(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }

    public static class TabLayoutOnPageChangeListenerIndependent implements ViewPager.OnPageChangeListener {
        private int a;
        private int b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.a = this.b;
            this.b = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f2, int i2) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            throw null;
        }
    }

    public class TabView extends LinearLayout {
        private f a;
        private TextView b;

        /* renamed from: c, reason: collision with root package name */
        private ImageView f8068c;

        /* renamed from: d, reason: collision with root package name */
        private View f8069d;

        /* renamed from: e, reason: collision with root package name */
        private TextView f8070e;

        /* renamed from: f, reason: collision with root package name */
        private ImageView f8071f;

        /* renamed from: g, reason: collision with root package name */
        private int f8072g;

        public TabView(Context context) {
            super(context);
            this.f8072g = 2;
            int i = OTabLayoutBase.this.q;
            if (i != 0) {
                ViewCompat.setBackground(this, AppCompatResources.getDrawable(context, i));
            }
            ViewCompat.setPaddingRelative(this, OTabLayoutBase.this.f8062g, OTabLayoutBase.this.h, OTabLayoutBase.this.i, OTabLayoutBase.this.j);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        private void f(@Nullable TextView textView, @Nullable ImageView imageView) {
            f fVar = this.a;
            Drawable c2 = fVar != null ? fVar.c() : null;
            f fVar2 = this.a;
            CharSequence e2 = fVar2 != null ? fVar2.e() : null;
            f fVar3 = this.a;
            CharSequence a = fVar3 != null ? fVar3.a() : null;
            int i = 0;
            if (imageView != null) {
                if (c2 != null) {
                    imageView.setImageDrawable(c2);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(a);
            }
            boolean z = !TextUtils.isEmpty(e2);
            if (textView != null) {
                if (z) {
                    textView.setText(e2);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(a);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = OTabLayoutBase.this.n(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            TooltipCompat.setTooltipText(this, z ? null : a);
        }

        public int a() {
            int i;
            int i2;
            TextView textView = this.b;
            boolean z = true;
            boolean z2 = false;
            if (textView == null || textView.getVisibility() != 0) {
                i = 0;
                i2 = 0;
            } else {
                int left = this.b.getLeft();
                i2 = this.b.getRight();
                i = left;
                z2 = true;
            }
            ImageView imageView = this.f8068c;
            if (imageView == null || imageView.getVisibility() != 0) {
                z = z2;
            } else {
                i = z2 ? Math.min(i, this.f8068c.getLeft()) : this.f8068c.getLeft();
                i2 = z2 ? Math.max(i2, this.f8068c.getRight()) : this.f8068c.getRight();
            }
            View view = this.f8069d;
            if (view != null && view.getVisibility() == 0) {
                i = z ? Math.min(i, this.f8069d.getLeft()) : this.f8069d.getLeft();
                i2 = z ? Math.max(i2, this.f8069d.getRight()) : this.f8069d.getRight();
            }
            return i2 - i;
        }

        void b() {
            if (this.a != null) {
                this.a = null;
                e();
            }
            setSelected(false);
        }

        void c(@Nullable f fVar) {
            if (fVar != this.a) {
                this.a = fVar;
                e();
            }
        }

        void d(@Nullable f fVar, boolean z) {
            if (fVar != this.a) {
                this.a = fVar;
                if (z) {
                    e();
                }
            }
        }

        final void e() {
            f fVar = this.a;
            View b = fVar != null ? fVar.b() : null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f8069d = b;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f8068c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f8068c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) b.findViewById(C0838R.id.title);
                this.f8070e = textView2;
                if (textView2 != null) {
                    this.f8072g = TextViewCompat.getMaxLines(textView2);
                }
                this.f8071f = (ImageView) b.findViewById(R.id.icon);
            } else {
                View view = this.f8069d;
                if (view != null) {
                    removeView(view);
                    this.f8069d = null;
                }
                this.f8070e = null;
                this.f8071f = null;
            }
            boolean z = false;
            if (this.f8069d == null) {
                if (this.f8068c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C0838R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView2, 0);
                    this.f8068c = imageView2;
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C0838R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView3);
                    this.b = textView3;
                    this.f8072g = TextViewCompat.getMaxLines(textView3);
                }
                TextViewCompat.setTextAppearance(this.b, OTabLayoutBase.this.l);
                ColorStateList colorStateList = OTabLayoutBase.this.m;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                f(this.b, this.f8068c);
            } else {
                TextView textView4 = this.f8070e;
                if (textView4 != null || this.f8071f != null) {
                    f(textView4, this.f8071f);
                }
            }
            if (fVar != null && fVar.f()) {
                z = true;
            }
            setSelected(z);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
        
            if (((r1 / r5.getPaint().getTextSize()) * r5.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L38;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onMeasure(int r11, int r12) {
            /*
                r10 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r11)
                int r1 = android.view.View.MeasureSpec.getMode(r11)
                com.obric.oui.tab.OTabLayoutBase r2 = com.obric.oui.tab.OTabLayoutBase.this
                int r2 = r2.r
                android.widget.TextView r3 = r10.b
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
                if (r2 <= 0) goto L24
                if (r1 == 0) goto L1a
                if (r0 <= r2) goto L24
            L1a:
                com.obric.oui.tab.OTabLayoutBase r11 = com.obric.oui.tab.OTabLayoutBase.this
                int r11 = r11.r
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r0)
            L24:
                super.onMeasure(r11, r12)
                android.widget.TextView r0 = r10.b
                if (r0 == 0) goto Ld6
                r10.getResources()
                com.obric.oui.tab.OTabLayoutBase r0 = com.obric.oui.tab.OTabLayoutBase.this
                float r1 = r0.n
                int r2 = r10.f8072g
                int r0 = com.obric.oui.tab.OTabLayoutBase.b(r0)
                com.obric.oui.tab.OTabLayoutBase r4 = com.obric.oui.tab.OTabLayoutBase.this
                int r4 = com.obric.oui.tab.OTabLayoutBase.c(r4)
                android.widget.ImageView r5 = r10.f8068c
                r6 = 1
                if (r5 == 0) goto L4b
                int r5 = r5.getVisibility()
                if (r5 != 0) goto L4b
                r2 = r6
                goto L59
            L4b:
                android.widget.TextView r5 = r10.b
                if (r5 == 0) goto L59
                int r5 = r5.getLineCount()
                if (r5 <= r6) goto L59
                com.obric.oui.tab.OTabLayoutBase r1 = com.obric.oui.tab.OTabLayoutBase.this
                float r1 = r1.o
            L59:
                android.widget.TextView r5 = r10.b
                r7 = 0
                if (r5 == 0) goto L6d
                boolean r5 = r10.isSelected()
                if (r5 == 0) goto L6d
                com.obric.oui.tab.OTabLayoutBase r5 = com.obric.oui.tab.OTabLayoutBase.this
                int r5 = r5.p
                if (r5 <= 0) goto L6d
                float r1 = (float) r5
                r0 = r7
                r4 = r0
            L6d:
                android.widget.TextView r5 = r10.b
                float r5 = r5.getTextSize()
                android.widget.TextView r8 = r10.b
                int r8 = r8.getLineCount()
                android.widget.TextView r9 = r10.b
                int r9 = androidx.core.widget.TextViewCompat.getMaxLines(r9)
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 != 0) goto L87
                if (r9 < 0) goto Ld6
                if (r2 == r9) goto Ld6
            L87:
                com.obric.oui.tab.OTabLayoutBase r9 = com.obric.oui.tab.OTabLayoutBase.this
                int r9 = r9.v
                if (r9 != r6) goto Lbc
                if (r5 <= 0) goto Lbc
                if (r8 != r6) goto Lbc
                android.widget.TextView r5 = r10.b
                android.text.Layout r5 = r5.getLayout()
                if (r5 == 0) goto Lbb
                float r8 = r5.getLineWidth(r7)
                android.text.TextPaint r5 = r5.getPaint()
                float r5 = r5.getTextSize()
                float r5 = r1 / r5
                float r5 = r5 * r8
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getPaddingLeft()
                int r8 = r8 - r9
                int r9 = r10.getPaddingRight()
                int r8 = r8 - r9
                float r8 = (float) r8
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r5 <= 0) goto Lbc
            Lbb:
                r6 = r7
            Lbc:
                if (r6 == 0) goto Ld6
                android.widget.TextView r5 = r10.b
                r5.setTextSize(r7, r1)
                android.widget.TextView r1 = r10.b
                r1.setMaxLines(r2)
                r3.topMargin = r0
                r3.leftMargin = r4
                r3.rightMargin = r4
                android.widget.TextView r0 = r10.b
                r0.setLayoutParams(r3)
                super.onMeasure(r11, r12)
            Ld6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.tab.OTabLayoutBase.TabView.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (OTabLayoutBase.this.M != null) {
                OTabLayoutBase.this.M.a(this.a);
            } else {
                f fVar = this.a;
                OTabLayoutBase oTabLayoutBase = fVar.f8084f;
                if (oTabLayoutBase == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                oTabLayoutBase.t(fVar, true);
            }
            e.i.b.d.a.a(getContext(), 1);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            int i;
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
                this.b.setTypeface(Typeface.DEFAULT_BOLD);
                if (!z || (i = OTabLayoutBase.this.p) <= 0) {
                    this.b.setTextSize(OTabLayoutBase.this.n);
                } else {
                    this.b.setTextSize(i);
                }
            }
            ImageView imageView = this.f8068c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f8069d;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    private class a implements ViewPager.OnAdapterChangeListener {
        private boolean a;

        a() {
        }

        void a(boolean z) {
            this.a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            OTabLayoutBase oTabLayoutBase = OTabLayoutBase.this;
            if (oTabLayoutBase.C == viewPager) {
                oTabLayoutBase.u(pagerAdapter2, this.a);
            }
        }
    }

    public interface b {
        void a(f fVar);
    }

    public interface c {
        void a(f fVar);

        void b(f fVar);

        void c(f fVar);
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            OTabLayoutBase.this.s();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            OTabLayoutBase.this.s();
        }
    }

    private class e extends LinearLayout {
        private int a;
        private final Paint b;

        /* renamed from: c, reason: collision with root package name */
        int f8073c;

        /* renamed from: d, reason: collision with root package name */
        float f8074d;

        /* renamed from: e, reason: collision with root package name */
        private int f8075e;

        /* renamed from: f, reason: collision with root package name */
        private int f8076f;

        /* renamed from: g, reason: collision with root package name */
        private int f8077g;
        private ValueAnimator h;
        private int i;
        private float j;
        private float k;
        public boolean l;
        private boolean m;
        private boolean n;
        private boolean o;
        private Paint p;
        private Paint q;
        private final float r;
        private boolean s;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ int a;
            final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f8078c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f8079d;

            a(int i, int i2, int i3, int i4) {
                this.a = i;
                this.b = i2;
                this.f8078c = i3;
                this.f8079d = i4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                e eVar = e.this;
                int i = this.a;
                int i2 = this.b;
                Objects.requireNonNull(eVar);
                int round = Math.round((i2 - i) * animatedFraction) + i;
                e eVar2 = e.this;
                int i3 = this.f8078c;
                int i4 = this.f8079d;
                Objects.requireNonNull(eVar2);
                eVar.d(round, Math.round(animatedFraction * (i4 - i3)) + i3);
            }
        }

        class b extends AnimatorListenerAdapter {
            final /* synthetic */ int a;

            b(int i) {
                this.a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                e eVar = e.this;
                eVar.f8073c = this.a;
                eVar.f8074d = 0.0f;
            }
        }

        e(Context context) {
            super(context);
            this.f8073c = -1;
            this.f8075e = -1;
            this.f8076f = -1;
            this.f8077g = -1;
            OTabLayoutBase.this.n(27);
            this.i = Integer.MAX_VALUE;
            setWillNotDraw(false);
            this.b = new Paint();
            this.r = Math.round(OTabLayoutBase.this.getResources().getDisplayMetrics().density * 0.6f);
        }

        private void l() {
            int i;
            View childAt = getChildAt(this.f8073c);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f8074d > 0.0f && this.f8073c < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f8073c + 1);
                    float left = this.f8074d * childAt2.getLeft();
                    float f2 = this.f8074d;
                    i2 = (int) (((1.0f - f2) * i2) + left);
                    i = (int) (((1.0f - this.f8074d) * i) + (f2 * childAt2.getRight()));
                }
            }
            if (i2 == this.f8076f && i == this.f8077g) {
                return;
            }
            this.f8076f = i2;
            this.f8077g = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        void c(int i, int i2) {
            int i3;
            int i4;
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.h.cancel();
            }
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                l();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (Math.abs(i - this.f8073c) <= 1) {
                i3 = this.f8076f;
                i4 = this.f8077g;
            } else {
                int n = OTabLayoutBase.this.n(24);
                i3 = (i >= this.f8073c ? !z : z) ? left - n : n + right;
                i4 = i3;
            }
            if (i3 == left && i4 == right) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.h = valueAnimator2;
            valueAnimator2.setInterpolator(OTabLayoutBase.P);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new a(i3, left, i4, right));
            valueAnimator2.addListener(new b(i));
            valueAnimator2.start();
        }

        void d(int i, int i2) {
            if (i == this.f8076f && i2 == this.f8077g) {
                return;
            }
            this.f8076f = i;
            this.f8077g = i2;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            float f2;
            float f3;
            View findViewById;
            super.draw(canvas);
            if (this.m) {
                canvas.drawLine(getLeft(), getBottom() - Math.round(OTabLayoutBase.this.getResources().getDisplayMetrics().density * 0.6f), getRight() * 2, getBottom(), this.p);
            }
            if (this.n) {
                canvas.drawLine(getLeft(), this.r + getTop(), getRight() * 2, this.r + getTop(), this.q);
            }
            int i = this.f8076f;
            if (i < 0 || this.f8077g <= i || !this.o) {
                return;
            }
            View childAt = getChildAt(OTabLayoutBase.this.o());
            if (childAt != null && (findViewById = childAt.findViewById(C0838R.id.layout_tab_indicator)) != null) {
                if (OTabLayoutBase.this.C == null || !this.l) {
                    int i2 = this.f8076f;
                    float width = (((this.f8077g - i2) - findViewById.getWidth()) / 2) + i2;
                    this.j = width;
                    this.k = width + findViewById.getWidth();
                }
                Path path = new Path();
                path.addRoundRect(new RectF(((this.j + this.k) / 2.0f) - OTabLayoutBase.this.n(3), (getHeight() - getPaddingBottom()) - OTabLayoutBase.this.n(4), ((this.j + this.k) / 2.0f) + OTabLayoutBase.this.n(3), getHeight() - getPaddingBottom()), new float[]{OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(1), OTabLayoutBase.this.n(1), OTabLayoutBase.this.n(1), OTabLayoutBase.this.n(1)}, Path.Direction.CCW);
                canvas.drawPath(path, this.b);
                return;
            }
            if (this.s || !(childAt instanceof TabView)) {
                f2 = this.f8076f;
                f3 = this.f8077g;
            } else {
                float f4 = (this.f8076f + this.f8077g) * 0.5f;
                TabView tabView = (TabView) childAt;
                f2 = f4 - (tabView.a() * 0.5f);
                f3 = (tabView.a() * 0.5f) + f4;
            }
            Path path2 = new Path();
            float f5 = (f2 + f3) / 2.0f;
            path2.addRoundRect(new RectF(f5 - OTabLayoutBase.this.n(3), (getHeight() - getPaddingBottom()) - OTabLayoutBase.this.n(4), f5 + OTabLayoutBase.this.n(3), getHeight() - getPaddingBottom()), new float[]{OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(3), OTabLayoutBase.this.n(1), OTabLayoutBase.this.n(1), OTabLayoutBase.this.n(1), OTabLayoutBase.this.n(1)}, Path.Direction.CCW);
            canvas.drawPath(path2, this.b);
        }

        void e(int i, float f2) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.h.cancel();
            }
            this.f8073c = i;
            this.f8074d = f2;
            l();
        }

        void f(int i) {
            if (this.b.getColor() != i) {
                this.b.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void g(boolean z) {
            if (this.s != z) {
                this.s = z;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void h(int i) {
            if (this.a != i) {
                this.a = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void i(boolean z) {
            this.m = z;
            if (z) {
                Paint paint = new Paint();
                this.p = paint;
                paint.setColor(ContextCompat.getColor(getContext(), C0838R.color.oui_line_2));
                this.p.setStyle(Paint.Style.FILL);
            }
        }

        void j(boolean z) {
            this.o = z;
        }

        void k(boolean z) {
            this.n = z;
            if (z) {
                Paint paint = new Paint();
                this.q = paint;
                paint.setColor(ContextCompat.getColor(getContext(), C0838R.color.oui_line_2));
                this.q.setStyle(Paint.Style.FILL);
                this.q.setStrokeWidth(this.r);
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                l();
                return;
            }
            this.h.cancel();
            c(this.f8073c, Math.round((1.0f - this.h.getAnimatedFraction()) * this.h.getDuration()));
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("onMeasure ");
            M.append(View.MeasureSpec.getMode(i));
            Log.d("wjh", M.toString());
            int childCount = getChildCount();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    i5 = Math.max(i5, childAt.getMeasuredWidth());
                    this.i = Math.min(this.i, childAt.getMeasuredWidth());
                }
            }
            OTabLayoutBase oTabLayoutBase = OTabLayoutBase.this;
            int i7 = oTabLayoutBase.v;
            boolean z = true;
            if (i7 == 1 && oTabLayoutBase.u == 1) {
                if (i5 <= 0) {
                    return;
                }
                if (i5 * childCount <= getMeasuredWidth() - (oTabLayoutBase.n(16) * 2)) {
                    boolean z2 = false;
                    while (i4 < childCount) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != i5 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i5;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                        i4++;
                    }
                    z = z2;
                } else {
                    OTabLayoutBase oTabLayoutBase2 = OTabLayoutBase.this;
                    oTabLayoutBase2.u = 0;
                    oTabLayoutBase2.A(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                    return;
                }
                return;
            }
            if (i7 == 0 && oTabLayoutBase.x && oTabLayoutBase.O == getResources().getConfiguration().orientation && i5 > 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt2 = getChildAt(i9);
                    if (childAt2.getVisibility() != 8) {
                        i8 += childAt2.getMeasuredWidth();
                    }
                }
                if (i8 <= 0) {
                    return;
                }
                int measuredWidth = (OTabLayoutBase.this.getMeasuredWidth() - OTabLayoutBase.this.f8058c.getPaddingLeft()) - OTabLayoutBase.this.f8058c.getPaddingRight();
                if (i8 < measuredWidth) {
                    if (i5 * childCount < measuredWidth) {
                        i3 = 0;
                        for (int i10 = 0; i10 < childCount; i10++) {
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i10).getLayoutParams();
                            if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                                layoutParams2.width = 0;
                                layoutParams2.weight = 1.0f;
                                i3 = 1;
                            }
                        }
                    } else {
                        int i11 = (measuredWidth - i8) / (childCount * 2);
                        i3 = 0;
                        while (i4 < childCount) {
                            if (getChildAt(i4).getVisibility() != 8) {
                                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                layoutParams3.leftMargin = i11;
                                layoutParams3.rightMargin = i11;
                                i3 = 1;
                            }
                            i4++;
                        }
                    }
                    i4 = i3;
                }
                if (i4 != 0) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public static final class f {
        private Drawable a;
        private CharSequence b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f8081c;

        /* renamed from: d, reason: collision with root package name */
        private int f8082d = -1;

        /* renamed from: e, reason: collision with root package name */
        private View f8083e;

        /* renamed from: f, reason: collision with root package name */
        OTabLayoutBase f8084f;

        /* renamed from: g, reason: collision with root package name */
        TabView f8085g;

        f() {
        }

        @Nullable
        public CharSequence a() {
            return this.f8081c;
        }

        @Nullable
        public View b() {
            return this.f8083e;
        }

        @Nullable
        public Drawable c() {
            return this.a;
        }

        public int d() {
            return this.f8082d;
        }

        @Nullable
        public CharSequence e() {
            return this.b;
        }

        public boolean f() {
            OTabLayoutBase oTabLayoutBase = this.f8084f;
            if (oTabLayoutBase != null) {
                return oTabLayoutBase.o() == this.f8082d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void g() {
            this.f8084f = null;
            this.f8085g = null;
            this.a = null;
            this.b = null;
            this.f8081c = null;
            this.f8082d = -1;
            this.f8083e = null;
        }

        @NonNull
        public f h(@Nullable CharSequence charSequence) {
            this.f8081c = charSequence;
            n();
            return this;
        }

        @NonNull
        public f i(@LayoutRes int i) {
            this.f8083e = LayoutInflater.from(this.f8085g.getContext()).inflate(i, (ViewGroup) this.f8085g, false);
            n();
            return this;
        }

        @NonNull
        public f j(@Nullable View view) {
            this.f8083e = view;
            n();
            return this;
        }

        @NonNull
        public f k(@Nullable Drawable drawable) {
            this.a = drawable;
            n();
            return this;
        }

        void l(int i) {
            this.f8082d = i;
        }

        @NonNull
        public f m(@Nullable CharSequence charSequence) {
            this.b = charSequence;
            n();
            return this;
        }

        void n() {
            TabView tabView = this.f8085g;
            if (tabView != null) {
                tabView.e();
            }
        }
    }

    public static class g implements c {
        private final ViewPager a;

        public g(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.obric.oui.tab.OTabLayoutBase.c
        public void a(f fVar) {
            this.a.setCurrentItem(fVar.d());
        }

        @Override // com.obric.oui.tab.OTabLayoutBase.c
        public void b(f fVar) {
        }

        @Override // com.obric.oui.tab.OTabLayoutBase.c
        public void c(f fVar) {
        }
    }

    public OTabLayoutBase(Context context) {
        this(context, null);
    }

    private void i(View view) {
        if (view instanceof OTabItem) {
            OTabItem oTabItem = (OTabItem) view;
            f r = r(0);
            CharSequence charSequence = oTabItem.a;
            if (charSequence != null) {
                r.m(charSequence);
            }
            Drawable drawable = oTabItem.b;
            if (drawable != null) {
                r.k(drawable);
            }
            int i = oTabItem.f8056c;
            if (i != 0) {
                r.i(i);
            }
            if (!TextUtils.isEmpty(oTabItem.getContentDescription())) {
                r.h(oTabItem.getContentDescription());
            }
            h(r, this.a.isEmpty());
            return;
        }
        if (view instanceof e) {
            if (indexOfChild(view) == -1) {
                super.addView(view, 0, new FrameLayout.LayoutParams(-2, -1));
            }
        } else if (view instanceof OBottomTabItem) {
            OBottomTabItem oBottomTabItem = (OBottomTabItem) view;
            OBottomTabItemCustomView oBottomTabItemCustomView = new OBottomTabItemCustomView(getContext());
            f r2 = r(0);
            if (oBottomTabItem.b() != null) {
                oBottomTabItemCustomView.b().setText(oBottomTabItem.b());
                r2.m(oBottomTabItem.b());
            }
            if (oBottomTabItem.a() != null) {
                oBottomTabItemCustomView.a().setImageDrawable(oBottomTabItem.a());
            }
            oBottomTabItemCustomView.setTextColor(this.m);
            oBottomTabItemCustomView.setSelectedBgColor(Integer.valueOf(ContextCompat.getColor(getContext(), C0838R.color.oui_accent_bg_light)));
            r2.j(oBottomTabItemCustomView);
            h(r2, this.a.isEmpty());
        }
    }

    private void j(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            e eVar = this.f8058c;
            int childCount = eVar.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (eVar.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                int scrollX = getScrollX();
                int l = l(i, 0.0f);
                if (scrollX != l) {
                    if (this.B == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.B = valueAnimator;
                        valueAnimator.setInterpolator(P);
                        this.B.setDuration(200L);
                        this.B.addUpdateListener(new com.obric.oui.tab.a(this));
                    }
                    this.B.setIntValues(scrollX, l);
                    this.B.start();
                }
                this.f8058c.c(i, 200);
                return;
            }
        }
        setScrollPosition(i, 0.0f, true);
    }

    private void k() {
        ViewCompat.setPaddingRelative(this.f8058c, this.v == 0 ? Math.max(0, this.t - this.f8062g) : 0, 0, 0, 0);
        int i = this.v;
        if (i == 0) {
            this.f8058c.setGravity(GravityCompat.START);
        } else if (i == 1) {
            this.f8058c.setGravity(1);
        }
        A(true);
    }

    private int l(int i, float f2) {
        if (this.v != 0) {
            return 0;
        }
        View childAt = this.f8058c.getChildAt(i);
        int i2 = i + 1;
        View childAt2 = i2 < this.f8058c.getChildCount() ? this.f8058c.getChildAt(i2) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + (childAt != null ? childAt.getLeft() : 0)) - (getWidth() / 2);
        int i3 = (int) (((this.f8059d * 4) + width + width2) * 0.5f * f2);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i3 : left - i3;
    }

    private static ColorStateList m(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void w(int i) {
        int childCount = this.f8058c.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f8058c.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    private void x(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.C;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f8057J;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            a aVar = this.K;
            if (aVar != null) {
                this.C.removeOnAdapterChangeListener(aVar);
            }
        }
        c cVar = this.A;
        if (cVar != null) {
            this.z.remove(cVar);
            this.A = null;
        }
        if (viewPager != null) {
            this.C = viewPager;
            if (this.f8057J == null) {
                this.f8057J = new TabLayoutOnPageChangeListener(this);
            }
            this.f8057J.a();
            viewPager.addOnPageChangeListener(this.f8057J);
            g gVar = new g(viewPager);
            this.A = gVar;
            if (!this.z.contains(gVar)) {
                this.z.add(gVar);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                u(adapter, z);
            }
            if (this.K == null) {
                this.K = new a();
            }
            this.K.a(z);
            viewPager.addOnAdapterChangeListener(this.K);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.C = null;
            u(null, false);
        }
        this.L = z2;
    }

    private void y() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            this.a.get(i).n();
        }
    }

    private void z(LinearLayout.LayoutParams layoutParams) {
        if (this.v == 1 && this.u == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.f8059d;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
    }

    void A(boolean z) {
        for (int i = 0; i < this.f8058c.getChildCount(); i++) {
            View childAt = this.f8058c.getChildAt(i);
            z((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        i(view);
    }

    public void h(@NonNull f fVar, boolean z) {
        int size = this.a.size();
        if (fVar.f8084f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        fVar.l(size);
        this.a.add(size, fVar);
        int size2 = this.a.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.a.get(size).l(size);
            }
        }
        TabView tabView = fVar.f8085g;
        e eVar = this.f8058c;
        int d2 = fVar.d();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.rightMargin = this.k;
        z(layoutParams);
        eVar.addView(tabView, d2, layoutParams);
        if (z) {
            OTabLayoutBase oTabLayoutBase = fVar.f8084f;
            if (oTabLayoutBase == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            oTabLayoutBase.t(fVar, true);
        }
    }

    int n(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public int o() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.d();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                x((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.L) {
            setupWithViewPager(null);
            this.L = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = this.a.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = this.a.get(i3);
            if (fVar != null && ((fVar.c() != null && !TextUtils.isEmpty(fVar.e())) || fVar.b() != null)) {
                break;
            }
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + n(56);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), BasicMeasure.EXACTLY);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, BasicMeasure.EXACTLY);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i4 = this.s;
            if (i4 <= 0) {
                i4 = size2 - n(56);
            }
            this.r = i4;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.v;
            if (i5 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i5 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z = true;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }

    @Nullable
    public f p(int i) {
        if (i < 0 || i >= q()) {
            return null;
        }
        return this.a.get(i);
    }

    public int q() {
        return this.a.size();
    }

    @NonNull
    public f r(int i) {
        f acquire = Q.acquire();
        if (acquire == null) {
            acquire = new f();
        }
        acquire.f8084f = this;
        Pools.Pool<TabView> pool = this.N;
        TabView acquire2 = pool != null ? pool.acquire() : null;
        if (acquire2 == null) {
            acquire2 = new TabView(getContext());
        }
        acquire2.setFocusable(true);
        acquire.f8085g = acquire2;
        if (i > 0) {
            acquire2.d(acquire, false);
            acquire.i(i);
        } else {
            acquire2.c(acquire);
        }
        return acquire;
    }

    void s() {
        int currentItem;
        int childCount = this.f8058c.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) this.f8058c.getChildAt(childCount);
            this.f8058c.removeViewAt(childCount);
            if (tabView != null) {
                tabView.b();
                this.N.release(tabView);
            }
            requestLayout();
        }
        Iterator<f> it2 = this.a.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            it2.remove();
            next.g();
            Q.release(next);
        }
        this.b = null;
        PagerAdapter pagerAdapter = this.D;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                f r = r(this.w);
                r.m(this.D.getPageTitle(i));
                h(r, false);
            }
            ViewPager viewPager = this.C;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == o() || currentItem >= q()) {
                return;
            }
            t(p(currentItem), true);
        }
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.x = z;
    }

    public void setContentInsetStart(int i) {
        this.t = i;
    }

    public void setCustomTabViewResId(int i) {
        this.w = i;
    }

    public void setOnTabClickListener(b bVar) {
        this.M = bVar;
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable c cVar) {
        c cVar2 = this.y;
        if (cVar2 != null) {
            this.z.remove(cVar2);
        }
        this.y = cVar;
        if (cVar == null || this.z.contains(cVar)) {
            return;
        }
        this.z.add(cVar);
    }

    public void setScrollPosition(int i, float f2, boolean z) {
        v(i, f2, z, true);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        Objects.requireNonNull(this.f8058c);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.f8058c.f(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f8058c.h(i);
    }

    public void setShowSelectedIndicator(Boolean bool) {
        this.f8058c.j(bool.booleanValue());
    }

    public void setShowTopLine(Boolean bool) {
        this.f8058c.k(bool.booleanValue());
    }

    public void setSideAndTopMargin(int i, int i2) {
        this.f8060e = n(i);
        if (this.p > n(20)) {
            this.f8061f = n(i2);
        }
    }

    public void setTabBackgroundResId(int i) {
        this.q = i;
    }

    public void setTabGravity(int i) {
        if (this.u != i) {
            this.u = i;
            k();
        }
    }

    public void setTabMargin(int i) {
        this.f8059d = n(i);
        for (int i2 = 0; i2 < q(); i2++) {
            View childAt = this.f8058c.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = n(i);
            marginLayoutParams.rightMargin = n(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMaxWidth(int i) {
        this.s = i;
    }

    public void setTabMinWidth(int i) {
    }

    public void setTabMode(int i) {
        if (i != this.v) {
            this.v = i;
            k();
        }
    }

    public void setTabPaddingBottom(int i) {
        this.j = i;
    }

    public void setTabPaddingEnd(int i) {
        this.i = i;
    }

    public void setTabPaddingStart(int i) {
        this.f8062g = i;
    }

    public void setTabPaddingTop(int i) {
        this.h = i;
    }

    public void setTabStripPadding(int i, int i2, int i3, int i4) {
        this.f8058c.setPadding(i, i2, i3, i4);
    }

    @Deprecated
    public void setTabTextAppearance(int i) {
        this.l = i;
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            y();
        }
    }

    public void setTabTextSize(float f2) {
        if (this.n != f2) {
            this.n = f2;
            y();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        u(pagerAdapter, false);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.f8058c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    void t(f fVar, boolean z) {
        f fVar2 = this.b;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = this.z.size() - 1; size >= 0; size--) {
                    this.z.get(size).c(fVar);
                }
                j(fVar.d());
                return;
            }
            return;
        }
        int d2 = fVar != null ? fVar.d() : -1;
        if (z) {
            if ((fVar2 == null || fVar2.d() == -1) && d2 != -1) {
                setScrollPosition(d2, 0.0f, true);
            } else {
                j(d2);
            }
            if (d2 != -1) {
                w(d2);
            }
        }
        if (fVar2 != null) {
            for (int size2 = this.z.size() - 1; size2 >= 0; size2--) {
                this.z.get(size2).b(fVar2);
            }
        }
        this.b = fVar;
        if (fVar != null) {
            for (int size3 = this.z.size() - 1; size3 >= 0; size3--) {
                this.z.get(size3).a(fVar);
            }
        }
    }

    void u(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.D;
        if (pagerAdapter2 != null && (dataSetObserver = this.E) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.D = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.E == null) {
                this.E = new d();
            }
            pagerAdapter.registerDataSetObserver(this.E);
        }
        s();
    }

    void v(int i, float f2, boolean z, boolean z2) {
        int round = Math.round(i + f2);
        if (round < 0 || round >= this.f8058c.getChildCount()) {
            return;
        }
        if (z2) {
            this.f8058c.e(i, f2);
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.B.cancel();
        }
        scrollTo(l(i, f2), 0);
        if (z) {
            w(round);
        }
    }

    public OTabLayoutBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z) {
        x(viewPager, z, false);
    }

    public OTabLayoutBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList<>();
        this.f8060e = 0;
        this.f8061f = 0;
        this.k = 0;
        this.r = Integer.MAX_VALUE;
        this.z = new ArrayList<>();
        this.N = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.f8058c = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.Y, i, C0838R.style.OTabText);
        eVar.h(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        eVar.f(obtainStyledAttributes.getColor(8, ContextCompat.getColor(getContext(), C0838R.color.oui_accent_7)));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f8062g = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.f8062g = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        this.h = obtainStyledAttributes.getDimensionPixelSize(20, this.h);
        this.i = obtainStyledAttributes.getDimensionPixelSize(18, this.i);
        this.j = obtainStyledAttributes.getDimensionPixelSize(17, this.j);
        int resourceId = obtainStyledAttributes.getResourceId(23, 2131887107);
        this.l = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, e.i.a.b.b.Z);
        try {
            this.n = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.m = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(24)) {
                this.m = obtainStyledAttributes.getColorStateList(24);
            }
            if (obtainStyledAttributes.hasValue(22)) {
                this.m = m(this.m.getDefaultColor(), obtainStyledAttributes.getColor(22, 0));
            }
            obtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.s = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.q = obtainStyledAttributes.getResourceId(0, 0);
            this.t = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.v = obtainStyledAttributes.getInt(15, 1);
            this.u = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.N);
            try {
                eVar.g(obtainStyledAttributes3.getBoolean(3, true));
                eVar.i(obtainStyledAttributes3.getBoolean(0, false));
                eVar.k(obtainStyledAttributes3.getBoolean(2, false));
                eVar.j(obtainStyledAttributes3.getBoolean(1, true));
                this.p = obtainStyledAttributes3.getDimensionPixelSize(4, 0);
                this.n = obtainStyledAttributes3.getDimensionPixelSize(5, (int) this.n);
                int i2 = obtainStyledAttributes3.getInt(6, -1);
                if (i2 == 0 || i2 == 1) {
                    setTabStripPadding(n(12), n(3), n(12), n(3));
                    this.k = n(4);
                } else if (i2 != 2) {
                    setTabStripPadding(n(16), n(4), n(16), n(12));
                } else {
                    setTabStripPadding(n(12), n(6), n(12), n(6));
                }
                obtainStyledAttributes3.recycle();
                Resources resources = getResources();
                this.o = resources.getDimensionPixelSize(C0838R.dimen.design_tab_text_size_2line);
                resources.getDimensionPixelSize(C0838R.dimen.design_tab_scrollable_min_width);
                e.i.a.b.a.b(1.5f);
                e.i.a.b.a.b(1.5f);
                this.O = getResources().getConfiguration().orientation;
                k();
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void setTabMode(String str) {
        str.hashCode();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.v != 1) {
                this.v = 1;
                k();
                return;
            }
            return;
        }
        if (this.v != 0) {
            this.v = 0;
            k();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m(i, i2));
    }
}
