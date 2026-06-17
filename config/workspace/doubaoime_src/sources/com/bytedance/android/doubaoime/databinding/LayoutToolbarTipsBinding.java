package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public final class LayoutToolbarTipsBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView b;

    private LayoutToolbarTipsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
    }

    @NonNull
    public static LayoutToolbarTipsBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_toolbar_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C0838R.id.toolbar_tips);
        if (appCompatTextView != null) {
            return new LayoutToolbarTipsBinding((ConstraintLayout) inflate, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0838R.id.toolbar_tips)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
