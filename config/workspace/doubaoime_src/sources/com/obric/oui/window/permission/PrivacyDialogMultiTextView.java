package com.obric.oui.window.permission;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class PrivacyDialogMultiTextView extends ConstraintLayout {
    public PrivacyDialogMultiTextView(Context context) {
        this(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacyDialogMultiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_layout_privacy_dialog_multi_text, this);
        View findViewById = findViewById(C0838R.id.tv_content);
        l.e(findViewById, "findViewById(R.id.tv_content)");
    }
}
