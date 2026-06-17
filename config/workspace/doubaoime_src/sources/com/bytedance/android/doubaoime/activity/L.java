package com.bytedance.android.doubaoime.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class L implements TextWatcher {
    final /* synthetic */ TextView a;

    L(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        com.obric.oui.common.util.b.i(this.a, false);
    }
}
