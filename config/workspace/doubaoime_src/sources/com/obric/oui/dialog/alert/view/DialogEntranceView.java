package com.obric.oui.dialog.alert.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class DialogEntranceView extends ConstraintLayout {
    public DialogEntranceView(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_layout_dialog_entrance, this);
        View findViewById = findViewById(C0838R.id.tv_normal);
        l.e(findViewById, "findViewById(R.id.tv_normal)");
        View findViewById2 = findViewById(C0838R.id.icon);
        l.e(findViewById2, "findViewById(R.id.icon)");
    }
}
