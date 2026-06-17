package com.obric.oui.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.obric.oui.dialog.alert.view.RadiusLayout;
import java.util.List;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OBanner extends RadiusLayout implements com.obric.oui.banner.h.a {
    private long h;
    private final kotlin.e i;
    private long j;
    private com.obric.oui.banner.h.b k;
    private final kotlin.e l;
    private final Runnable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private MutableLiveData<Integer> q;
    private final kotlin.e r;
    private ViewPager2.OnPageChangeCallback s;
    private int t;
    private BannerStyle u;
    private boolean v;
    private float w;

    public final class BannerOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f2, int i2) {
            throw null;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            throw null;
        }
    }

    static final class a extends m implements kotlin.s.b.a<BannerAdapter> {
        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public BannerAdapter invoke() {
            BannerAdapter bannerAdapter = new BannerAdapter(OBanner.this);
            bannerAdapter.e(new e(this));
            return bannerAdapter;
        }
    }

    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OBanner.this.f();
        }
    }

    static final class c extends m implements kotlin.s.b.a<CompositePageTransformer> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public CompositePageTransformer invoke() {
            CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
            compositePageTransformer.addTransformer(new OFadingPageTransformer(0, 1));
            return compositePageTransformer;
        }
    }

    static final class d extends m implements kotlin.s.b.a<ViewPager2> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.s.b.a
        public ViewPager2 invoke() {
            ViewPager2 viewPager2 = new ViewPager2(this.a);
            viewPager2.setOffscreenPageLimit(1);
            return viewPager2;
        }
    }

    public OBanner(Context context) {
        this(context, null, 0);
    }

    public static final void e(OBanner oBanner, com.obric.oui.banner.b bVar, int i) {
        boolean l = oBanner.l();
        int h = oBanner.h();
        int j = oBanner.j();
        if (l) {
            if (j <= 0) {
                j = 1;
            }
            h %= j;
        }
        if (oBanner.h() == 2 && i == oBanner.j() - 1) {
            oBanner.m(1, true);
            return;
        }
        if (oBanner.h() == oBanner.i() - 3 && i == 0) {
            oBanner.m(oBanner.i() - 2, true);
            return;
        }
        if (h == oBanner.j() - 1 && i == 0) {
            oBanner.m(oBanner.h() + 1, true);
            return;
        }
        if (h == 0 && i == oBanner.j() - 1) {
            oBanner.m(oBanner.h() - 1, true);
            return;
        }
        if (h > i) {
            oBanner.m(oBanner.h() - 1, true);
            return;
        }
        if (h < i) {
            oBanner.m(oBanner.h() + 1, true);
            return;
        }
        com.obric.oui.banner.h.b bVar2 = oBanner.k;
        if (bVar2 != null) {
            bVar2.a(bVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (!this.p || this.h <= 0) {
            e.i.a.b.a.a("检查换页：开关 false，不换页");
            return;
        }
        if (this.n) {
            e.i.a.b.a.a("检查换页：正在拖动，不换页");
            return;
        }
        if (!isAttachedToWindow()) {
            e.i.a.b.a.a("剥离window，不换页");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.j;
        if (uptimeMillis >= this.h) {
            if (this.o) {
                k().setCurrentItem(k().getCurrentItem() + 1, true);
                return;
            } else {
                e.i.a.b.a.a("检查换页：不是业务触发的，不换页");
                return;
            }
        }
        e.i.a.b.a.a("检查换页: 刚松手" + uptimeMillis + " ms，delay换页");
        Handler handler = getHandler();
        if (handler != null) {
            handler.postDelayed(this.m, this.h - uptimeMillis);
        }
    }

    private final BannerAdapter g() {
        return (BannerAdapter) this.l.getValue();
    }

    @Override // com.obric.oui.banner.h.a
    public LiveData<Integer> a() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.n = true;
            this.v = false;
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            this.n = false;
            this.j = SystemClock.uptimeMillis();
            f();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int h() {
        return k().getCurrentItem();
    }

    public final int i() {
        return g().getItemCount();
    }

    public final int j() {
        return g().c();
    }

    public final ViewPager2 k() {
        return (ViewPager2) this.i.getValue();
    }

    public final boolean l() {
        return g().d();
    }

    public final OBanner m(int i, boolean z) {
        if (k().getScrollState() == 0) {
            try {
                k().setCurrentItem(i, z);
            } catch (Exception e2) {
                StringBuilder M = e.a.a.a.a.M("setCurrentItem error, msg: ");
                M.append(e2.getMessage());
                Log.e("OBanner", M.toString());
            }
        } else {
            StringBuilder M2 = e.a.a.a.a.M("viewPager2 scrollState: ");
            M2.append(k().getScrollState());
            M2.append(", ban setCurrentItem");
            Log.w("OBanner", M2.toString());
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.obric.oui.dialog.alert.view.RadiusLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.w <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec((int) Math.floor(r3 / this.w), BasicMeasure.EXACTLY));
    }

    public final void setBannerItemClickListener(com.obric.oui.banner.h.b bVar) {
        l.f(bVar, "listener");
        this.k = bVar;
    }

    public final void setBannerStyle(BannerStyle bannerStyle) {
        l.f(bannerStyle, "style");
        this.u = bannerStyle;
    }

    public final void setData(List<? extends com.obric.oui.banner.b> list) {
        l.f(list, "dataSet");
        g().f(list);
        int i = 1;
        if (list.size() == 1) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.m);
            }
            this.p = false;
            setInfiniteSwitchEnabled(false);
        }
        if (l()) {
            i = j() * 100;
        } else if (this.u.ordinal() != 2) {
            i = 0;
        }
        this.t = i;
        m(i, false);
        k().requestTransform();
    }

    public final void setDelayAfterUserTouch(long j) {
        this.h = j;
    }

    public final void setInfiniteSwitchEnabled(boolean z) {
        g().g(z);
        g().notifyDataSetChanged();
    }

    public final void setOnPageChangeListener(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        l.f(onPageChangeCallback, "onPageChangeListener");
        this.s = onPageChangeCallback;
    }

    public final void setProportion(float f2) {
        if (f2 < 0) {
            this.w = 0.0f;
        } else {
            this.w = f2;
            invalidate();
        }
    }

    public OBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.h = com.heytap.mcssdk.constant.a.r;
        this.i = kotlin.a.c(new d(context));
        this.j = -1L;
        this.l = kotlin.a.c(new a());
        this.m = new b();
        this.q = new MutableLiveData<>(0);
        this.r = kotlin.a.c(c.a);
        BannerStyle bannerStyle = BannerStyle.FILL;
        this.u = bannerStyle;
        this.v = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.f9964c);
            l.e(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.OBanner)");
            int i2 = obtainStyledAttributes.getInt(5, 0);
            if (i2 != 0) {
                if (i2 == 1) {
                    bannerStyle = BannerStyle.INDENT;
                } else if (i2 == 2) {
                    bannerStyle = BannerStyle.TRIPTYCH;
                }
            }
            this.u = bannerStyle;
            obtainStyledAttributes.getBoolean(3, false);
            setProportion(obtainStyledAttributes.getFloat(4, 0.0f));
            this.p = obtainStyledAttributes.getBoolean(1, false);
            this.h = obtainStyledAttributes.getInt(0, (int) com.heytap.mcssdk.constant.a.r);
            setInfiniteSwitchEnabled(obtainStyledAttributes.getBoolean(2, true));
            obtainStyledAttributes.recycle();
        }
    }
}
