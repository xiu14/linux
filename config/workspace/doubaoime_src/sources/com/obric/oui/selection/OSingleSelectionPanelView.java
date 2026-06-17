package com.obric.oui.selection;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public class OSingleSelectionPanelView extends OSelectionPanelView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSingleSelectionPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }

    @Override // com.obric.oui.selection.OSelectionPanelView
    public void b() {
        Context context = getContext();
        l.e(context, "context");
        Resources resources = context.getResources();
        l.e(resources, "context.resources");
        if (resources.getConfiguration().orientation == 2) {
            if (a().size() <= 2) {
                setScrollViewHeight(-2);
                return;
            }
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            setScrollViewHeight(a.a(TypedValue.applyDimension(1, 112, system.getDisplayMetrics())));
            return;
        }
        if (a().size() <= 7) {
            setScrollViewHeight(-2);
            return;
        }
        float f2 = TypedValues.CycleType.TYPE_WAVE_OFFSET;
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        setScrollViewHeight(a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics())));
    }

    @Override // com.obric.oui.selection.OSelectionPanelView
    protected boolean c() {
        return false;
    }
}
