package com.bytedance.android.input.keyboard.toolbar.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.input.constants.ImeScreenOrientation;
import com.bytedance.android.input.keyboard.areacontrol.k;
import e.a.a.a.a;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeToolBarContainer extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeToolBarContainer(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final void a(ImeScreenOrientation imeScreenOrientation) {
        int n;
        if (imeScreenOrientation == ImeScreenOrientation.FLOATING) {
            n = (int) a.m("Resources.getSystem()", 1, 46);
        } else {
            k kVar = k.a;
            n = k.n();
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.MarginLayoutParams(-1, n));
        }
        getLayoutParams().width = -1;
        getLayoutParams().height = n;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (imeScreenOrientation == ImeScreenOrientation.LANDSCAPE) {
                float f2 = 75;
                marginLayoutParams.leftMargin = (int) a.m("Resources.getSystem()", 1, f2);
                marginLayoutParams.rightMargin = (int) a.m("Resources.getSystem()", 1, f2);
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
        }
        setLayoutParams(getLayoutParams());
    }

    public final void b(ImeScreenOrientation imeScreenOrientation) {
        l.f(imeScreenOrientation, "screenOrientation");
        a(imeScreenOrientation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeToolBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        k kVar = k.a;
        Integer valueOf = Integer.valueOf(k.m());
        a((valueOf != null && valueOf.intValue() == 0) ? ImeScreenOrientation.PORTRAIT : (valueOf != null && valueOf.intValue() == 1) ? ImeScreenOrientation.LANDSCAPE : (valueOf != null && valueOf.intValue() == 2) ? ImeScreenOrientation.FLOATING : ImeScreenOrientation.PORTRAIT);
    }
}
