package com.obric.oui.filterpanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OFilterPanelView extends ConstraintLayout {
    private final Set<OFilterGroupView> a;

    public OFilterPanelView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void setFilterStyle$default(OFilterPanelView oFilterPanelView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        oFilterPanelView.setFilterStyle(i, z);
    }

    public final void setFilterStyle(int i, boolean z) {
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((OFilterGroupView) it2.next()).setFilterStyle(i, z);
        }
    }

    public final void setMaxSelectCount(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OFilterPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.a = new LinkedHashSet();
        ViewGroup.inflate(context, C0838R.layout.o_layout_filter_panel_view, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, a.e0("Resources.getSystem()", 1, 400)));
        View findViewById = findViewById(C0838R.id.filter_group_container);
        l.e(findViewById, "findViewById(R.id.filter_group_container)");
        View findViewById2 = findViewById(C0838R.id.btn_container);
        l.e(findViewById2, "findViewById(R.id.btn_container)");
        View findViewById3 = findViewById(C0838R.id.btn_reset);
        l.e(findViewById3, "findViewById(R.id.btn_reset)");
        View findViewById4 = findViewById(C0838R.id.btn_confirm);
        l.e(findViewById4, "findViewById(R.id.btn_confirm)");
    }
}
