package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
abstract class EndIconDelegate {
    Context context;

    @DrawableRes
    final int customEndIcon;
    CheckableImageButton endIconView;
    TextInputLayout textInputLayout;

    EndIconDelegate(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
        this.customEndIcon = i;
    }

    abstract void initialize();

    boolean isBoxBackgroundModeSupported(int i) {
        return true;
    }

    void onSuffixVisibilityChanged(boolean z) {
    }

    boolean shouldTintIconOnError() {
        return false;
    }
}
