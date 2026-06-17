package com.bytedance.android.input.keyboard.areacontrol;

import android.view.View;

/* loaded from: classes.dex */
public final class m implements View.OnLayoutChangeListener {
    final /* synthetic */ InputViewRoot a;
    final /* synthetic */ kotlin.g b;

    public m(InputViewRoot inputViewRoot, kotlin.g gVar) {
        this.a = inputViewRoot;
        this.b = gVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        kotlin.s.c.l.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.a.v(((Number) this.b.c()).intValue(), ((Number) this.b.d()).intValue());
    }
}
