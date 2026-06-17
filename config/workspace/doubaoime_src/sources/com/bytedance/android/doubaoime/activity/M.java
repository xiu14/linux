package com.bytedance.android.doubaoime.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class M implements TextWatcher {
    final /* synthetic */ FeedbackActivity a;

    M(FeedbackActivity feedbackActivity) {
        this.a = feedbackActivity;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextView textView;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        textView = this.a.f1895e;
        kotlin.s.c.l.c(textView);
        com.obric.oui.common.util.b.i(textView, false);
    }
}
