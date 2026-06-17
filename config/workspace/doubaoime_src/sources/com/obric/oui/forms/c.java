package com.obric.oui.forms;

import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.forms.OBoxInputView;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c implements TextWatcher {
    final /* synthetic */ OBoxInputView a;
    final /* synthetic */ OBoxInputView.a b;

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OBoxInputView.i(c.this.a);
        }
    }

    c(OBoxInputView oBoxInputView, OBoxInputView.a aVar) {
        this.a = oBoxInputView;
        this.b = aVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.b.a()) {
            this.a.k().post(new a());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf;
        if (this.b.f() != null) {
            Resources resources = this.a.getResources();
            Object[] objArr = new Object[2];
            objArr[0] = charSequence != null ? String.valueOf(charSequence.length()) : null;
            objArr[1] = String.valueOf(this.b.f());
            String string = resources.getString(C0838R.string.oui_form_counter, objArr);
            l.e(string, "resources.getString(\n   …                        )");
            SpannableString spannableString = new SpannableString(string);
            int length = charSequence != null ? charSequence.length() : 0;
            Integer f2 = this.b.f();
            l.c(f2);
            if (length > f2.intValue()) {
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.a.getContext(), C0838R.color.Primary)), 0, (charSequence == null || (valueOf = String.valueOf(charSequence.length())) == null) ? 0 : valueOf.length(), 18);
            }
            this.a.l().setText(spannableString, TextView.BufferType.SPANNABLE);
        }
    }
}
