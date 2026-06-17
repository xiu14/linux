package com.obric.oui.titlebar;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.obric.oui.titlebar.OUnitedTitleBar;

/* loaded from: classes2.dex */
public final class c implements OUnitedTitleBar.c {
    final /* synthetic */ OUnitedTitleBar a;

    c(OUnitedTitleBar oUnitedTitleBar) {
        this.a = oUnitedTitleBar;
    }

    @Override // com.obric.oui.titlebar.OUnitedTitleBar.c
    public void a(OUnitedTitleBar oUnitedTitleBar, int i) {
        int i2;
        int i3;
        int i4;
        ViewGroup i5 = this.a.i();
        ViewGroup.LayoutParams layoutParams = i5 != null ? i5.getLayoutParams() : null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup n = this.a.n();
        ViewGroup.LayoutParams layoutParams2 = n != null ? n.getLayoutParams() : null;
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        TextView l = this.a.l();
        ViewGroup.LayoutParams layoutParams3 = l != null ? l.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
        OUnitedTitleBar.a aVar = OUnitedTitleBar.v;
        i2 = OUnitedTitleBar.r;
        float f2 = 16.0f;
        i3 = OUnitedTitleBar.s;
        i4 = OUnitedTitleBar.t;
        float q = (-i) / this.a.q();
        if (this.a.j() == 1) {
            i4 = OUnitedTitleBar.u;
            int[] iArr = new int[2];
            TextView l2 = this.a.l();
            if (l2 != null) {
                l2.getLocationOnScreen(iArr);
            }
            if (i == 0) {
                int i6 = iArr[0];
                int i7 = iArr[1];
                this.a.setTextInitPos(i6);
            }
            float o = (this.a.o() + e.a.a.a.a.e0("Resources.getSystem()", 1, 18)) * q;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.leftMargin = -((int) o);
            }
            f2 = 20.0f;
        }
        if (q == 1) {
            View h = this.a.h();
            if (h != null) {
                com.obric.oui.common.util.b.g(h);
            }
        } else {
            View h2 = this.a.h();
            if (h2 != null) {
                com.obric.oui.common.util.b.f(h2);
            }
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (-i) + i2;
        }
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = (-i) + i2;
        }
        int i8 = (int) (i3 - ((i3 - i4) * q));
        float a = e.a.a.a.a.a(f2, 40.0f, new AccelerateDecelerateInterpolator().getInterpolation(q), 40.0f);
        TextView l3 = this.a.l();
        if (l3 != null) {
            l3.setTextSize(2, a);
        }
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.bottomMargin = i8;
        }
        ViewGroup i9 = this.a.i();
        if (i9 != null) {
            i9.setLayoutParams(marginLayoutParams);
        }
        ViewGroup n2 = this.a.n();
        if (n2 != null) {
            n2.setLayoutParams(marginLayoutParams2);
        }
        TextView l4 = this.a.l();
        if (l4 != null) {
            l4.setLayoutParams(marginLayoutParams3);
        }
    }
}
