package com.bytedance.feedbackerlib.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.bytedance.feedbackerlib.view.CustomEditText;

/* renamed from: com.bytedance.feedbackerlib.activity.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0666k implements TextWatcher {
    final /* synthetic */ FeedbackActivity a;

    C0666k(FeedbackActivity feedbackActivity) {
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
        CustomEditText customEditText;
        CustomEditText customEditText2;
        CustomEditText customEditText3;
        textView = this.a.q;
        textView.setText(charSequence.length() + "/200");
        if (charSequence.length() > 200) {
            customEditText = this.a.k;
            String obj = customEditText.getText().toString();
            customEditText2 = this.a.k;
            customEditText2.setText(obj.substring(0, 200));
            customEditText3 = this.a.k;
            customEditText3.setSelection(200);
            FeedbackActivity.I(this.a);
        }
        this.a.n0();
    }
}
