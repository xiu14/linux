package com.bytedance.android.input.common_biz.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class ImeLoadingLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    private ImeLoadingLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView) {
        this.a = constraintLayout;
    }

    @NonNull
    public static ImeLoadingLayoutBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_loading_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0838R.id.progressBar);
        if (progressBar != null) {
            i = C0838R.id.tv_tips;
            TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_tips);
            if (textView != null) {
                return new ImeLoadingLayoutBinding((ConstraintLayout) inflate, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
