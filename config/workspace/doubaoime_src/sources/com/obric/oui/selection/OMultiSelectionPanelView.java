package com.obric.oui.selection;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public class OMultiSelectionPanelView extends OSelectionPanelView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OMultiSelectionPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
    }

    @Override // com.obric.oui.selection.OSelectionPanelView
    public void b() {
        if (a().size() <= 7) {
            setScrollViewHeight(-2);
            return;
        }
        float f2 = TypedValues.CycleType.TYPE_WAVE_OFFSET;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        setScrollViewHeight(a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
    }

    @Override // com.obric.oui.selection.OSelectionPanelView
    protected boolean c() {
        return true;
    }
}
