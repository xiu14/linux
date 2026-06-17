package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class NoEndIconDelegate extends EndIconDelegate {
    NoEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
        this.textInputLayout.setEndIconOnClickListener(null);
        this.textInputLayout.setEndIconDrawable((Drawable) null);
        this.textInputLayout.setEndIconContentDescription((CharSequence) null);
    }
}
