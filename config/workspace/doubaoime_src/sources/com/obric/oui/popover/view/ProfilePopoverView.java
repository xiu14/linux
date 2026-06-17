package com.obric.oui.popover.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import e.a.a.a.a;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class ProfilePopoverView extends LinkPopoverView {
    public ProfilePopoverView(Context context) {
        this(context, null);
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        l.f(onClickListener, "listener");
        b().setOnClickListener(onClickListener);
    }

    @Override // com.obric.oui.popover.view.LinkPopoverView
    public void setLeftIcon(int i) {
        float f2 = 12;
        int e0 = a.e0("Resources.getSystem()", 1, f2);
        float f3 = 9;
        int e02 = a.e0("Resources.getSystem()", 1, f3);
        int e03 = a.e0("Resources.getSystem()", 1, f2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setPadding(e0, e02, e03, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics())));
        super.setLeftIcon(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePopoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ImageView b = b();
        ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float f2 = 24;
        marginLayoutParams.height = a.e0("Resources.getSystem()", 1, f2);
        marginLayoutParams.width = a.e0("Resources.getSystem()", 1, f2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        marginLayoutParams.setMarginEnd(kotlin.t.a.a(TypedValue.applyDimension(1, 4, system.getDisplayMetrics())));
        b.setLayoutParams(marginLayoutParams);
        b().setImageTintList(null);
    }

    @Override // com.obric.oui.popover.view.LinkPopoverView
    public void setLeftIcon(Drawable drawable) {
        float f2 = 12;
        int e0 = a.e0("Resources.getSystem()", 1, f2);
        float f3 = 9;
        int e02 = a.e0("Resources.getSystem()", 1, f3);
        int e03 = a.e0("Resources.getSystem()", 1, f2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setPadding(e0, e02, e03, kotlin.t.a.a(TypedValue.applyDimension(1, f3, system.getDisplayMetrics())));
        super.setLeftIcon(drawable);
    }
}
