package com.obric.oui.titlebar;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
final class b implements OnApplyWindowInsetsListener {
    final /* synthetic */ OUnitedTitleBar a;

    b(OUnitedTitleBar oUnitedTitleBar) {
        this.a = oUnitedTitleBar;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.a.r(windowInsetsCompat);
        l.c(windowInsetsCompat);
        return windowInsetsCompat;
    }
}
