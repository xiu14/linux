package com.obric.oui.infopanel.content;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import com.obric.oui.oswitch.OSwitch;
import e.a.a.a.a;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OInfoPanelContentSwitchView extends ConstraintLayout {
    private final OSwitch a;

    public OInfoPanelContentSwitchView(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInfoPanelContentSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_info_panel_content_switch_view, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f2 = 16;
        int e0 = a.e0("Resources.getSystem()", 1, f2);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        marginLayoutParams.setMargins(0, e0, 0, kotlin.t.a.a(TypedValue.applyDimension(1, 12, system.getDisplayMetrics())));
        setLayoutParams(marginLayoutParams);
        setBackgroundResource(C0838R.drawable.o_info_panel_content_switch_view_bg);
        Resources system2 = Resources.getSystem();
        l.e(system2, "Resources.getSystem()");
        int a = kotlin.t.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
        setPadding(a, a, a, a);
        View findViewById = findViewById(C0838R.id.tv_title);
        l.e(findViewById, "findViewById(R.id.tv_title)");
        View findViewById2 = findViewById(C0838R.id.o_switch);
        l.e(findViewById2, "findViewById(R.id.o_switch)");
        OSwitch oSwitch = (OSwitch) findViewById2;
        this.a = oSwitch;
        Resources system3 = Resources.getSystem();
        l.e(system3, "Resources.getSystem()");
        b.a(oSwitch, kotlin.t.a.a(TypedValue.applyDimension(1, 44, system3.getDisplayMetrics())));
    }
}
