package com.obric.oui.forms;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b implements TextWatcher {
    final /* synthetic */ OBoxInputView a;

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OBoxInputView.i(b.this.a);
        }
    }

    b(OBoxInputView oBoxInputView) {
        this.a = oBoxInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        l.f(editable, "s");
        this.a.k().post(new a());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        l.f(charSequence, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        l.f(charSequence, "s");
    }
}
