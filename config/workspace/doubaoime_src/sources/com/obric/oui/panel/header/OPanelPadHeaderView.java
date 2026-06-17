package com.obric.oui.panel.header;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OPanelPadHeaderView extends ConstraintLayout {
    public OPanelPadHeaderView(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPanelPadHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float dimension;
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_basic_panel_pad_header, this);
        l.f(context, "context");
        l.f(context, "context");
        TypedValue typedValue = new TypedValue();
        typedValue = context.getTheme().resolveAttribute(C0838R.attr.oui_PanelDefaultHeaderHeight, typedValue, true) ? typedValue : null;
        if (typedValue == null || typedValue.type != 5) {
            dimension = context.getResources().getDimension(C0838R.dimen.oui_panel_default_header_height);
        } else {
            Resources resources = context.getResources();
            l.e(resources, "context.resources");
            dimension = typedValue.getDimension(resources.getDisplayMetrics());
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, (int) dimension));
        setBackgroundColor(0);
        View findViewById = findViewById(C0838R.id.iv_close);
        l.e(findViewById, "findViewById(R.id.iv_close)");
        View findViewById2 = findViewById(C0838R.id.tv_title);
        l.e(findViewById2, "findViewById(R.id.tv_title)");
        View findViewById3 = findViewById(C0838R.id.iv_back);
        l.e(findViewById3, "findViewById(R.id.iv_back)");
        View findViewById4 = findViewById(C0838R.id.divider);
        l.e(findViewById4, "findViewById(R.id.divider)");
    }
}
