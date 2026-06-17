package com.obric.oui.indicator;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.obric.oui.indicator.OBaseIndicator;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class OBaseIndicator$setViewPager2$2 extends RecyclerView.AdapterDataObserver implements OBaseIndicator.c {
    final /* synthetic */ OBaseIndicator a;
    final /* synthetic */ ViewPager2 b;

    static final class a extends m implements l<OBaseIndicator.c, o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(OBaseIndicator.c cVar) {
            OBaseIndicator.c cVar2 = cVar;
            kotlin.s.c.l.f(cVar2, "it");
            RecyclerView.Adapter adapter = OBaseIndicator$setViewPager2$2.this.b.getAdapter();
            kotlin.s.c.l.c(adapter);
            adapter.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) cVar2);
            return o.a;
        }
    }

    OBaseIndicator$setViewPager2$2(OBaseIndicator oBaseIndicator, ViewPager2 viewPager2) {
        this.a = oBaseIndicator;
        this.b = viewPager2;
    }

    @Override // com.obric.oui.indicator.OBaseIndicator.c
    public l<OBaseIndicator.c, o> a() {
        return new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        super.onChanged();
        this.a.A();
    }
}
