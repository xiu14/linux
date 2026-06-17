package com.obric.oui.indicator;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.obric.oui.indicator.OBaseIndicator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBaseIndicator$setViewPager$3 implements OBaseIndicator.b {
    private ViewPager.OnPageChangeListener a;
    final /* synthetic */ OBaseIndicator b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewPager f7837c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.b.a f7838d;

    OBaseIndicator$setViewPager$3(OBaseIndicator oBaseIndicator, ViewPager viewPager, kotlin.s.b.a aVar) {
        this.b = oBaseIndicator;
        this.f7837c = viewPager;
        this.f7838d = aVar;
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public void a(int i, boolean z) {
        this.f7837c.setCurrentItem(i, z);
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public int b() {
        return OBaseIndicator.d(this.b, this.f7837c.getCurrentItem(), getCount());
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public void c() {
        ViewPager.OnPageChangeListener onPageChangeListener = this.a;
        if (onPageChangeListener != null) {
            this.f7837c.removeOnPageChangeListener(onPageChangeListener);
        }
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public void d(final c cVar) {
        l.f(cVar, "onPageChangeListenerHelper");
        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() { // from class: com.obric.oui.indicator.OBaseIndicator$setViewPager$3$addOnPageChangeListener$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f2, int i2) {
                c cVar2 = cVar;
                OBaseIndicator$setViewPager$3 oBaseIndicator$setViewPager$3 = OBaseIndicator$setViewPager$3.this;
                cVar2.c(OBaseIndicator.d(oBaseIndicator$setViewPager$3.b, i, oBaseIndicator$setViewPager$3.getCount()), f2);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
            }
        };
        this.a = onPageChangeListener;
        ViewPager viewPager = this.f7837c;
        l.c(onPageChangeListener);
        viewPager.addOnPageChangeListener(onPageChangeListener);
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public boolean e() {
        ViewPager viewPager = this.f7837c;
        l.f(viewPager, "$this$isNotEmpty");
        PagerAdapter adapter = viewPager.getAdapter();
        return (adapter != null ? adapter.getCount() : 0) > 0;
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public int getCount() {
        return ((Number) this.f7838d.invoke()).intValue();
    }
}
