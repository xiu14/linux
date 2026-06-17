package com.obric.oui.stepper;

import android.view.View;
import android.widget.EditText;
import com.obric.oui.stepper.OSteppers;

/* compiled from: java-style lambda group */
/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        EditText editText;
        int i5;
        int i6;
        int i7;
        int i8;
        EditText editText2;
        int i9 = this.a;
        if (i9 == 0) {
            i = ((OSteppers) this.b).m;
            i2 = ((OSteppers) this.b).p;
            int i10 = i2 + i;
            i3 = ((OSteppers) this.b).n;
            if (i10 >= i3) {
                i4 = ((OSteppers) this.b).o;
                if (i10 > i4) {
                    return;
                }
                ((OSteppers) this.b).s(i10);
                editText = ((OSteppers) this.b).j;
                editText.clearFocus();
                e.i.b.d.a.a(((OSteppers) this.b).getContext(), 3);
                return;
            }
            return;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                OSteppers.a p = ((OSteppers) this.b).p();
                if (p != null) {
                    p.c();
                    return;
                }
                return;
            }
            if (i9 != 3) {
                throw null;
            }
            OSteppers.a p2 = ((OSteppers) this.b).p();
            if (p2 != null) {
                p2.e();
                return;
            }
            return;
        }
        i5 = ((OSteppers) this.b).m;
        i6 = ((OSteppers) this.b).p;
        int i11 = i5 - i6;
        i7 = ((OSteppers) this.b).n;
        if (i11 >= i7) {
            i8 = ((OSteppers) this.b).o;
            if (i11 > i8) {
                return;
            }
            ((OSteppers) this.b).s(i11);
            editText2 = ((OSteppers) this.b).j;
            editText2.clearFocus();
            e.i.b.d.a.a(((OSteppers) this.b).getContext(), 3);
        }
    }
}
