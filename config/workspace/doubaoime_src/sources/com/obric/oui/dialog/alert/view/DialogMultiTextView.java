package com.obric.oui.dialog.alert.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.text.OTextView;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public final class DialogMultiTextView extends ConstraintLayout {
    private final OTextView a;

    public DialogMultiTextView(Context context) {
        this(context, null);
    }

    public final OTextView g() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogMultiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_layout_dialog_multi_text, this);
        View findViewById = findViewById(C0838R.id.tv_content);
        l.e(findViewById, "findViewById(R.id.tv_content)");
        OTextView oTextView = (OTextView) findViewById;
        this.a = oTextView;
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        oTextView.setLineHeight(a.a(TypedValue.applyDimension(1, 20, system.getDisplayMetrics())));
    }
}
