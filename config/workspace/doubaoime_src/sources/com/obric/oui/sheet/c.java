package com.obric.oui.sheet;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsets;
import com.obric.oui.dialog.alert.view.RadiusLayout;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class c implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ OInsetSheet a;

    c(OInsetSheet oInsetSheet) {
        this.a = oInsetSheet;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l.f(view, "v");
        l.f(windowInsets, "insets");
        int b = e.i.b.g.a.b(this.a.getContext());
        int a = e.i.b.g.a.a(this.a.b());
        if (a > 0) {
            int ordinal = this.a.c().ordinal();
            if (ordinal == 0) {
                RadiusLayout b2 = this.a.b();
                Resources system = Resources.getSystem();
                l.e(system, "Resources.getSystem()");
                e.i.a.b.a.h(b2, kotlin.t.a.a(TypedValue.applyDimension(1, 16, system.getDisplayMetrics())) + a);
            } else if (ordinal == 1) {
                view.setPadding(0, 0, 0, a);
            }
        } else {
            int ordinal2 = this.a.c().ordinal();
            if (ordinal2 == 0) {
                e.i.a.b.a.h(this.a.b(), b);
                this.a.b().setPadding(0, 0, 0, 0);
            } else if (ordinal2 == 1) {
                RadiusLayout b3 = this.a.b();
                Resources system2 = Resources.getSystem();
                l.e(system2, "Resources.getSystem()");
                e.i.a.b.a.h(b3, kotlin.t.a.a(TypedValue.applyDimension(1, 0, system2.getDisplayMetrics())));
                this.a.b().setPadding(0, 0, 0, b);
            }
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
