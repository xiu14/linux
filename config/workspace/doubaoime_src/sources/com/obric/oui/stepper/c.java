package com.obric.oui.stepper;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import com.obric.oui.stepper.OSteppers;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c implements TextWatcher {
    final /* synthetic */ OSteppers a;

    c(OSteppers oSteppers) {
        this.a = oSteppers;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Integer S;
        OSteppers.a p;
        String obj = editable != null ? editable.toString() : null;
        int i = 0;
        if ((obj == null || kotlin.text.a.s(obj)) && (p = this.a.p()) != null) {
            p.b();
        }
        if (editable != null) {
            try {
                String obj2 = editable.toString();
                if (obj2 != null && (S = kotlin.text.a.S(obj2)) != null) {
                    i = S.intValue();
                }
            } catch (Exception unused) {
                l.f("OSteppers", "tag");
                l.f("input type error", "msg");
                Log.e("OSteppers", "input type error", null);
            }
        }
        this.a.s(i);
        this.a.o();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
