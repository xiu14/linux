package com.bytedance.android.input.basic.image;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a extends ViewOutlineProvider {
    final /* synthetic */ int a;

    a(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        l.f(view, "view");
        l.f(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
