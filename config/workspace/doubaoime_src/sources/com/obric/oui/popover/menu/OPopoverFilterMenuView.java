package com.obric.oui.popover.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public final class OPopoverFilterMenuView extends OPopoverMenuView {
    private List<ViewGroup> b;

    public OPopoverFilterMenuView(Context context) {
        this(context, null, 0);
    }

    @Override // com.obric.oui.popover.menu.OPopoverMenuView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        for (ViewGroup viewGroup : this.b) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            int i5 = 0;
            int i6 = i - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
            if (marginLayoutParams2 != null) {
                i5 = marginLayoutParams2.rightMargin;
            }
            layoutParams.width = i6 - i5;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public OPopoverFilterMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPopoverFilterMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        new ArrayList();
        new LinkedHashMap();
        this.b = new ArrayList();
        Resources system = Resources.getSystem();
        kotlin.s.c.l.e(system, "Resources.getSystem()");
        a.a(TypedValue.applyDimension(1, 188, system.getDisplayMetrics()));
        context.getResources().getDimension(C0838R.dimen.oui_h_list_item_menu);
    }
}
