package com.obric.oui.tab;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBottomTabBar extends OTabLayoutBase {
    static {
        new e.i.b.c.a();
    }

    public OBottomTabBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.tab.OTabLayoutBase, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBottomTabBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setTabMode(1);
        setBackground(AppCompatResources.getDrawable(context, C0838R.color.oui_bg_base_2_1_low_elevation));
        setTabStripPadding((int) getResources().getDimension(C0838R.dimen.oui_p_container_2), 0, (int) getResources().getDimension(C0838R.dimen.oui_p_container_2), 0);
        setShowTopLine(Boolean.TRUE);
        setShowSelectedIndicator(Boolean.FALSE);
    }
}
