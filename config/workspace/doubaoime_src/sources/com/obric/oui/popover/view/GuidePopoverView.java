package com.obric.oui.popover.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.popover.PopoverLinearLayout;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public final class GuidePopoverView extends PopoverLinearLayout {
    private final TextView a;
    private final TextView b;

    public GuidePopoverView(Context context) {
        this(context, null);
    }

    public final void setGuideText(CharSequence charSequence) {
        l.f(charSequence, "charSequence");
        this.b.setText(charSequence);
    }

    public final void setStatusText(CharSequence charSequence) {
        l.f(charSequence, "charSequence");
        this.a.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidePopoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        LinearLayout.inflate(context, C0838R.layout.o_popover_guide_view, this);
        setOrientation(0);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int a = a.a(TypedValue.applyDimension(1, 12, system.getDisplayMetrics()));
        setPadding(a, a, a, a);
        setBackground(ContextCompat.getDrawable(context, C0838R.drawable.o_popover_view_bg));
        View findViewById = findViewById(C0838R.id.tv_status_text);
        l.e(findViewById, "findViewById(R.id.tv_status_text)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.tv_guide_text);
        l.e(findViewById2, "findViewById(R.id.tv_guide_text)");
        this.b = (TextView) findViewById2;
    }
}
