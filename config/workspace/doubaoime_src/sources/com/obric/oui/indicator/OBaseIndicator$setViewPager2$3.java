package com.obric.oui.indicator;

import androidx.viewpager2.widget.ViewPager2;
import com.obric.oui.indicator.OBaseIndicator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBaseIndicator$setViewPager2$3 implements OBaseIndicator.b {
    private ViewPager2.OnPageChangeCallback a;
    final /* synthetic */ OBaseIndicator b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewPager2 f7839c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.s.b.a f7840d;

    OBaseIndicator$setViewPager2$3(OBaseIndicator oBaseIndicator, ViewPager2 viewPager2, kotlin.s.b.a aVar) {
        this.b = oBaseIndicator;
        this.f7839c = viewPager2;
        this.f7840d = aVar;
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public void a(int i, boolean z) {
        this.f7839c.setCurrentItem(i, z);
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public int b() {
        return OBaseIndicator.d(this.b, this.f7839c.getCurrentItem(), getCount());
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public void c() {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.a;
        if (onPageChangeCallback != null) {
            this.f7839c.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public void d(final c cVar) {
        l.f(cVar, "onPageChangeListenerHelper");
        ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: com.obric.oui.indicator.OBaseIndicator$setViewPager2$3$addOnPageChangeListener$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i, float f2, int i2) {
                c cVar2 = cVar;
                OBaseIndicator$setViewPager2$3 oBaseIndicator$setViewPager2$3 = OBaseIndicator$setViewPager2$3.this;
                cVar2.c(OBaseIndicator.d(oBaseIndicator$setViewPager2$3.b, i, oBaseIndicator$setViewPager2$3.getCount()), f2);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
            }
        };
        this.a = onPageChangeCallback;
        ViewPager2 viewPager2 = this.f7839c;
        l.c(onPageChangeCallback);
        viewPager2.registerOnPageChangeCallback(onPageChangeCallback);
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public boolean e() {
        return this.f7839c.getChildCount() != 0;
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.b
    public int getCount() {
        return ((Number) this.f7840d.invoke()).intValue();
    }
}
