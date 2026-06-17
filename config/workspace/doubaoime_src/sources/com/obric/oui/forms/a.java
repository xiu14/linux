package com.obric.oui.forms;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a implements View.OnFocusChangeListener {
    final /* synthetic */ OBoxInputView a;

    a(OBoxInputView oBoxInputView) {
        this.a = oBoxInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            OBoxInputView oBoxInputView = this.a;
            int i = OBoxInputView.t;
            Object systemService = oBoxInputView.getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(oBoxInputView, 0);
            return;
        }
        OBoxInputView oBoxInputView2 = this.a;
        int i2 = OBoxInputView.t;
        Object systemService2 = oBoxInputView2.getContext().getSystemService("input_method");
        Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService2).hideSoftInputFromWindow(oBoxInputView2.getWindowToken(), 0);
    }
}
