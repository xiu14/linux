package com.obric.oui.titlebar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OIconButton;
import com.obric.oui.titlebar.behavior.BaseBehavior;
import com.obric.oui.titlebar.behavior.HeaderBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OUnitedTitleBar extends FrameLayout implements CoordinatorLayout.AttachedBehavior {
    private ViewGroup a;
    private ViewGroup b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f8128c;

    /* renamed from: d, reason: collision with root package name */
    private String f8129d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f8130e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f8131f;

    /* renamed from: g, reason: collision with root package name */
    private View f8132g;
    private b h;
    private int i;
    private int j;
    private List<c> k;
    private boolean l;
    private int m;
    private final int n;
    private WindowInsetsCompat o;
    public static final a v = new a(null);
    private static final int p = e.a.a.a.a.e0("Resources.getSystem()", 1, 56);
    private static final int q = e.a.a.a.a.e0("Resources.getSystem()", 1, 240);
    private static final int r = e.a.a.a.a.e0("Resources.getSystem()", 1, 12);
    private static final int s = e.a.a.a.a.e0("Resources.getSystem()", 1, 92);
    private static final int t = e.a.a.a.a.e0("Resources.getSystem()", 1, 17);
    private static final int u = e.a.a.a.a.e0("Resources.getSystem()", 1, 14);

    public static final class Behavior extends HeaderBehavior<OUnitedTitleBar> {
        private ValueAnimator j;
        private boolean k;
        private WeakReference<View> l;
        private boolean m;
        private boolean n;
        private int o;
        private int p;
        private int q;

        public Behavior() {
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, OUnitedTitleBar oUnitedTitleBar) {
            int height;
            ValueAnimator valueAnimator;
            int topAndBottomOffset = getTopAndBottomOffset();
            l.c(oUnitedTitleBar);
            a aVar = OUnitedTitleBar.v;
            int i = -e.a.a.a.a.e0("Resources.getSystem()", 1, 56);
            if (topAndBottomOffset <= i || topAndBottomOffset >= 0) {
                return false;
            }
            if (topAndBottomOffset >= (i + 0) / 2) {
                i = 0;
            }
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0) {
                height = Math.round((abs / abs2) * 1000);
            } else {
                l.c(oUnitedTitleBar);
                height = (int) (((abs / oUnitedTitleBar.getHeight()) + 1) * 150);
            }
            int topAndBottomOffset2 = getTopAndBottomOffset();
            if (topAndBottomOffset2 == i && (valueAnimator = this.j) != null) {
                l.c(valueAnimator);
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.j;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.j = valueAnimator3;
                l.c(valueAnimator3);
                valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
                ValueAnimator valueAnimator4 = this.j;
                l.c(valueAnimator4);
                valueAnimator4.addUpdateListener(new com.obric.oui.titlebar.a(this, coordinatorLayout, oUnitedTitleBar));
            } else {
                l.c(valueAnimator2);
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator5 = this.j;
            l.c(valueAnimator5);
            valueAnimator5.setDuration(height);
            ValueAnimator valueAnimator6 = this.j;
            l.c(valueAnimator6);
            valueAnimator6.setIntValues(topAndBottomOffset2, i);
            ValueAnimator valueAnimator7 = this.j;
            l.c(valueAnimator7);
            valueAnimator7.start();
            return true;
        }

        @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean fling(CoordinatorLayout coordinatorLayout, OUnitedTitleBar oUnitedTitleBar, int i, int i2, float f2) {
            l.f(oUnitedTitleBar, "layout");
            if (f2 < 0) {
                this.n = true;
                this.o = 0;
                this.p = i;
                this.q = i2;
                i = Integer.MIN_VALUE;
                i2 = Integer.MAX_VALUE;
            }
            return super.fling(coordinatorLayout, oUnitedTitleBar, i, i2, f2);
        }

        @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
        public boolean canDragView(OUnitedTitleBar oUnitedTitleBar) {
            OUnitedTitleBar oUnitedTitleBar2 = oUnitedTitleBar;
            WeakReference<View> weakReference = this.l;
            if (weakReference == null) {
                return true;
            }
            l.c(weakReference);
            View view = weakReference.get();
            if (view != null && view.isShown() && !ViewCompat.canScrollVertically(view, -1)) {
                int topAndBottomOffset = getTopAndBottomOffset();
                l.c(oUnitedTitleBar2);
                if (topAndBottomOffset > (-OUnitedTitleBar.c(oUnitedTitleBar2))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
        public int getMaxDragOffset(OUnitedTitleBar oUnitedTitleBar) {
            OUnitedTitleBar oUnitedTitleBar2 = oUnitedTitleBar;
            l.f(oUnitedTitleBar2, "view");
            return -OUnitedTitleBar.c(oUnitedTitleBar2);
        }

        @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
        public int getScrollRangeForDragFling(OUnitedTitleBar oUnitedTitleBar) {
            OUnitedTitleBar oUnitedTitleBar2 = oUnitedTitleBar;
            l.f(oUnitedTitleBar2, "view");
            return OUnitedTitleBar.c(oUnitedTitleBar2);
        }

        @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
        public void onFlingFinished(CoordinatorLayout coordinatorLayout, OUnitedTitleBar oUnitedTitleBar) {
            this.n = false;
            b(coordinatorLayout, oUnitedTitleBar);
        }

        @Override // com.obric.oui.titlebar.behavior.c, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            l.f(coordinatorLayout, "parent");
            l.f(oUnitedTitleBar, "child");
            super.onLayoutChild(coordinatorLayout, oUnitedTitleBar, i);
            if (oUnitedTitleBar.j != 0) {
                if ((oUnitedTitleBar.j & 1) != 0) {
                    setHeaderTopBottomOffset(coordinatorLayout, oUnitedTitleBar, -OUnitedTitleBar.c(oUnitedTitleBar));
                } else if ((oUnitedTitleBar.j & 16) != 0) {
                    setHeaderTopBottomOffset(coordinatorLayout, oUnitedTitleBar, 0);
                }
            }
            oUnitedTitleBar.g(getTopAndBottomOffset());
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3, boolean z) {
            l.f(coordinatorLayout, "coordinatorLayout");
            l.f((OUnitedTitleBar) view, "child");
            l.f(view2, TypedValues.AttributesType.S_TARGET);
            this.m = true;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            l.f(coordinatorLayout, "coordinatorLayout");
            l.f(oUnitedTitleBar, "child");
            l.f(view2, TypedValues.AttributesType.S_TARGET);
            if (f3 <= 0 || getTopAndBottomOffset() <= (-OUnitedTitleBar.c(oUnitedTitleBar))) {
                return false;
            }
            fling(coordinatorLayout, oUnitedTitleBar, -OUnitedTitleBar.c(oUnitedTitleBar), 0, -f3);
            this.m = true;
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            l.f(coordinatorLayout, "coordinatorLayout");
            l.f(oUnitedTitleBar, "child");
            l.f(view2, TypedValues.AttributesType.S_TARGET);
            l.f(iArr, "consumed");
            if (i2 <= 0 || this.k) {
                return;
            }
            iArr[1] = scroll(coordinatorLayout, oUnitedTitleBar, i2, -OUnitedTitleBar.c(oUnitedTitleBar), 0);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
            boolean z;
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            l.f(coordinatorLayout, "coordinatorLayout");
            l.f(oUnitedTitleBar, "child");
            l.f(view2, TypedValues.AttributesType.S_TARGET);
            if (i4 < 0) {
                scroll(coordinatorLayout, oUnitedTitleBar, i4, -OUnitedTitleBar.c(oUnitedTitleBar), 0);
                z = true;
            } else {
                z = false;
            }
            this.k = z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
            ValueAnimator valueAnimator;
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            l.f(coordinatorLayout, "coordinatorLayout");
            l.f(oUnitedTitleBar, "child");
            l.f(view2, "directTargetChild");
            l.f(view3, TypedValues.AttributesType.S_TARGET);
            boolean z = (i & 2) > 0 && OUnitedTitleBar.c(oUnitedTitleBar) > 0 && coordinatorLayout.getHeight() - view2.getHeight() <= oUnitedTitleBar.getHeight();
            if (z && (valueAnimator = this.j) != null) {
                l.c(valueAnimator);
                valueAnimator.cancel();
            }
            this.l = null;
            this.m = false;
            this.n = false;
            a();
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
            OUnitedTitleBar oUnitedTitleBar = (OUnitedTitleBar) view;
            l.f(coordinatorLayout, "coordinatorLayout");
            l.f(oUnitedTitleBar, "child");
            l.f(view2, TypedValues.AttributesType.S_TARGET);
            if (!this.m) {
                b(coordinatorLayout, oUnitedTitleBar);
            }
            this.k = false;
            this.l = new WeakReference<>(view2);
        }

        @Override // com.obric.oui.titlebar.behavior.HeaderBehavior
        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, OUnitedTitleBar oUnitedTitleBar, int i, int i2, int i3) {
            OUnitedTitleBar oUnitedTitleBar2 = oUnitedTitleBar;
            int topAndBottomOffset = getTopAndBottomOffset();
            if (this.n) {
                i2 = Math.max(this.p, i2);
                i3 = Math.min(this.q, i3);
            }
            int headerTopBottomOffset = super.setHeaderTopBottomOffset(coordinatorLayout, oUnitedTitleBar2, i, i2, i3);
            if (oUnitedTitleBar2 != null) {
                oUnitedTitleBar2.g(getTopAndBottomOffset());
            }
            int i4 = 0;
            if (this.n) {
                if ((oUnitedTitleBar2 != null ? oUnitedTitleBar2.k() : null) != null) {
                    int i5 = ((i - topAndBottomOffset) + headerTopBottomOffset) - this.o;
                    if (i5 != 0) {
                        l.c(oUnitedTitleBar2);
                        b k = oUnitedTitleBar2.k();
                        l.c(k);
                        i4 = k.a(oUnitedTitleBar2, i, i5);
                    }
                    this.o += -i4;
                }
            }
            return headerTopBottomOffset + i4;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static final class a {
        public a(g gVar) {
        }
    }

    public interface b {
        int a(OUnitedTitleBar oUnitedTitleBar, int i, int i2);
    }

    public interface c {
        void a(OUnitedTitleBar oUnitedTitleBar, int i);
    }

    public OUnitedTitleBar(Context context) {
        this(context, null);
    }

    public static final int c(OUnitedTitleBar oUnitedTitleBar) {
        return q - p;
    }

    public final void g(int i) {
        List<c> list = this.k;
        if (list != null) {
            l.c(list);
            Iterator<c> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, i);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new BaseBehavior.c(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<?> getBehavior() {
        return new BaseBehavior.Behavior();
    }

    public final View h() {
        return this.f8132g;
    }

    public final ViewGroup i() {
        return this.a;
    }

    public final int j() {
        return this.i;
    }

    public final b k() {
        return this.h;
    }

    public final TextView l() {
        return this.f8128c;
    }

    public final int m() {
        return this.j;
    }

    public final ViewGroup n() {
        return this.b;
    }

    public final int o() {
        return this.m;
    }

    public final int p() {
        WindowInsetsCompat windowInsetsCompat = this.o;
        if (windowInsetsCompat == null) {
            return 0;
        }
        l.c(windowInsetsCompat);
        return windowInsetsCompat.getSystemWindowInsetTop();
    }

    public final int q() {
        return q - p;
    }

    public final WindowInsetsCompat r(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.o, windowInsetsCompat2)) {
            this.o = windowInsetsCompat2;
            setWillNotDraw(!(p() > 0));
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public final void s() {
        this.j = 0;
    }

    public final void setBottomAction(View view) {
    }

    public final void setDivider(View view) {
        this.f8132g = view;
    }

    public final void setExpanded(boolean z) {
        this.j = z ? 16 : 1;
        requestLayout();
    }

    public final void setInDebug(boolean z) {
        this.l = z;
    }

    public final void setLeftAction(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void setLeftActionSrc(Drawable drawable) {
        this.f8130e = drawable;
    }

    public final void setMCollapsePosition(int i) {
        this.i = i;
    }

    public final void setMOnHeaderFlingUnConsumedListener(b bVar) {
        this.h = bVar;
    }

    public final void setMTvSubTitle(TextView textView) {
    }

    public final void setMTvTitle(TextView textView) {
        this.f8128c = textView;
    }

    public final void setOnHeaderFlingUnConsumedListener(b bVar) {
        l.f(bVar, "onHeaderFlingUnConsumedListener");
        this.h = bVar;
    }

    public final void setRightAction(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void setRightActionSrc(Drawable drawable) {
        this.f8131f = drawable;
    }

    public final void setTextInitPos(int i) {
        this.m = i;
    }

    public final void setTitleText(String str) {
        this.f8129d = str;
    }

    public final void setupView() {
        if (this.f8130e != null) {
            Context context = getContext();
            l.e(context, "context");
            OIconButton oIconButton = new OIconButton(context, null, 0, 0, null, 28);
            oIconButton.setImageDrawable(this.f8130e);
            setLeftAction(oIconButton);
        }
        if (this.f8131f != null) {
            Context context2 = getContext();
            l.e(context2, "context");
            OIconButton oIconButton2 = new OIconButton(context2, null, 0, 0, null, 28);
            oIconButton2.setImageDrawable(this.f8131f);
            setRightAction(oIconButton2);
        }
        setBackgroundColor(getResources().getColor(C0838R.color.Transparent));
        if (this.l) {
            ViewGroup viewGroup = this.a;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(getResources().getColor(C0838R.color.oui_blue_2));
            }
            ViewGroup viewGroup2 = this.b;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(getResources().getColor(C0838R.color.oui_blue_2));
            }
            setBackgroundColor(getResources().getColor(C0838R.color.oui_red_2));
            TextView textView = this.f8128c;
            if (textView != null) {
                textView.setBackgroundColor(getResources().getColor(C0838R.color.oui_yellow_1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OUnitedTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.T);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.OUnitedTitleBar)");
        this.f8129d = obtainStyledAttributes.getString(3);
        this.i = obtainStyledAttributes.getInt(2, 0);
        this.f8130e = obtainStyledAttributes.getDrawable(0);
        this.f8131f = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(context, C0838R.layout.o_united_titlebar, this);
        this.a = (ViewGroup) findViewById(C0838R.id.fl_left_container);
        this.b = (ViewGroup) findViewById(C0838R.id.fl_right_container);
        this.f8128c = (TextView) findViewById(C0838R.id.tv_title_container);
        findViewById(C0838R.id.fl_bottom_container);
        this.f8132g = findViewById(C0838R.id.divider);
        TextView textView = this.f8128c;
        if (textView != null) {
            textView.setText(this.f8129d);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new com.obric.oui.titlebar.b(this));
        setupView();
        com.obric.oui.titlebar.c cVar = new com.obric.oui.titlebar.c(this);
        if (this.k == null) {
            this.k = new ArrayList();
        }
        List<c> list = this.k;
        l.c(list);
        if (!list.contains(cVar)) {
            List<c> list2 = this.k;
            l.c(list2);
            list2.add(cVar);
        }
        this.n = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new BaseBehavior.c(getContext(), attributeSet);
    }

    public final void setLeftAction(View view) {
        l.f(view, "view");
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.a;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
    }

    public final void setRightAction(View view) {
        l.f(view, "view");
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new BaseBehavior.c(getContext(), attributeSet);
    }
}
