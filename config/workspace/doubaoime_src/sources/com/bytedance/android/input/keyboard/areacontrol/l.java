package com.bytedance.android.input.keyboard.areacontrol;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l implements View.OnLayoutChangeListener {
    final /* synthetic */ InputViewRoot a;

    public l(InputViewRoot inputViewRoot) {
        this.a = inputViewRoot;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        kotlin.s.c.l.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        kotlin.s.c.l.d(this.a.getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
        float width = ((ViewGroup) r2).getWidth() - view.getWidth();
        i9 = this.a.a0;
        float f2 = width - i9;
        i10 = this.a.b0;
        this.a.v(f2, i10);
    }
}
