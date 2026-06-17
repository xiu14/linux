package com.bytedance.android.input.keyboard.aiwrite;

import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.obric.oui.layout.OUIFrameLayout;

/* loaded from: classes.dex */
final class N extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
    final /* synthetic */ DetailView a;
    final /* synthetic */ ConstraintLayout b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ OUIFrameLayout f2609c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ OUIFrameLayout f2610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(DetailView detailView, ConstraintLayout constraintLayout, OUIFrameLayout oUIFrameLayout, OUIFrameLayout oUIFrameLayout2) {
        super(1);
        this.a = detailView;
        this.b = constraintLayout;
        this.f2609c = oUIFrameLayout;
        this.f2610d = oUIFrameLayout2;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Integer num) {
        String str;
        Integer num2 = num;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "DetailViewModel.resultListAppendNum = " + num2);
        kotlin.s.c.l.e(num2, "number");
        if (num2.intValue() > 1) {
            this.b.getLayoutParams().width = -2;
            OUIFrameLayout oUIFrameLayout = this.f2609c;
            if (oUIFrameLayout != null) {
                oUIFrameLayout.setVisibility(0);
            }
            OUIFrameLayout oUIFrameLayout2 = this.f2610d;
            if (oUIFrameLayout2 != null) {
                oUIFrameLayout2.setVisibility(0);
            }
            final ConstraintLayout constraintLayout = this.b;
            final OUIFrameLayout oUIFrameLayout3 = this.f2609c;
            constraintLayout.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.r
                @Override // java.lang.Runnable
                public final void run() {
                    OUIFrameLayout oUIFrameLayout4 = OUIFrameLayout.this;
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    kotlin.s.c.l.f(constraintLayout2, "$this_apply");
                    ViewParent parent = oUIFrameLayout4.getParent().getParent();
                    kotlin.s.c.l.d(parent, "null cannot be cast to non-null type android.widget.HorizontalScrollView");
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) parent;
                    horizontalScrollView.scrollTo(constraintLayout2.getMeasuredWidth() - horizontalScrollView.getWidth(), 0);
                }
            });
        } else {
            this.b.getLayoutParams().width = -1;
            OUIFrameLayout oUIFrameLayout4 = this.f2609c;
            if (oUIFrameLayout4 != null) {
                oUIFrameLayout4.setVisibility(8);
            }
            OUIFrameLayout oUIFrameLayout5 = this.f2610d;
            if (oUIFrameLayout5 != null) {
                oUIFrameLayout5.setVisibility(8);
            }
        }
        return kotlin.o.a;
    }
}
