package com.obric.oui.selection;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSelectionPanelBtnView extends ConstraintLayout {
    private final OButton a;
    private final OButton b;

    /* renamed from: c, reason: collision with root package name */
    private final View f7990c;

    public OSelectionPanelBtnView(Context context) {
        this(context, null);
    }

    public final OButton g() {
        return this.a;
    }

    public final OButton h() {
        return this.b;
    }

    public final View i() {
        return this.f7990c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSelectionPanelBtnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_widget_selection_panel_btns, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View findViewById = findViewById(C0838R.id.btn_negative);
        l.e(findViewById, "findViewById(R.id.btn_negative)");
        this.a = (OButton) findViewById;
        View findViewById2 = findViewById(C0838R.id.btn_positive);
        l.e(findViewById2, "findViewById(R.id.btn_positive)");
        this.b = (OButton) findViewById2;
        View findViewById3 = findViewById(C0838R.id.horizontal_space);
        l.e(findViewById3, "findViewById(R.id.horizontal_space)");
        this.f7990c = findViewById3;
    }
}
