package com.obric.oui.popover.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class OPopoverMenuView extends LinearLayout {
    private boolean a;

    public OPopoverMenuView(Context context) {
        this(context, null, 0);
    }

    private final void a(View view, List<PopoverMenuLinearLayout> list) {
        if (view instanceof PopoverMenuLinearLayout) {
            list.add(view);
        } else if (view instanceof ViewGroup) {
            Iterator<View> it2 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it2.hasNext()) {
                a(it2.next(), list);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        StringBuilder M = a.M("onSizeChanged() called with: w = ");
        Context context = getContext();
        l.e(context, "context");
        l.f(context, "$this$px2dp");
        Resources resources = context.getResources();
        l.e(resources, "resources");
        M.append(kotlin.t.a.a(i / resources.getDisplayMetrics().density));
        M.append("dp");
        Log.e("OPopoverMenu", M.toString());
        if (i > 0 && !this.a) {
            this.a = true;
            ArrayList<PopoverMenuLinearLayout> arrayList = new ArrayList();
            a(this, arrayList);
            for (PopoverMenuLinearLayout popoverMenuLinearLayout : arrayList) {
                ViewGroup.LayoutParams layoutParams = popoverMenuLinearLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new kotlin.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = (i - getPaddingLeft()) - getPaddingRight();
                popoverMenuLinearLayout.setLayoutParams(layoutParams);
            }
        }
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        kotlin.t.a.a(TypedValue.applyDimension(1, 188, system.getDisplayMetrics()));
    }

    public OPopoverMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPopoverMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }
}
