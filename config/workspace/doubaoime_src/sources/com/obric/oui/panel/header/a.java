package com.obric.oui.panel.header;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ b b;

    public a(View view, b bVar) {
        this.a = view;
        this.b = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        View view2;
        ImageView imageView;
        AppCompatImageView appCompatImageView;
        l.g(view, "view");
        this.a.removeOnAttachStateChangeListener(this);
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 44);
        view2 = this.b.j;
        imageView = this.b.h;
        appCompatImageView = this.b.f7906f;
        com.obric.oui.common.util.b.d(view2, e0, e0, imageView, appCompatImageView);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        l.g(view, "view");
    }
}
