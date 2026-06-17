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
public final class LayoutToolBarHintsBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView b;

    private LayoutToolBarHintsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
    }

    @NonNull
    public static LayoutToolBarHintsBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_tool_bar_hints, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C0838R.id.tv_tool_bar_tips);
        if (appCompatTextView != null) {
            return new LayoutToolBarHintsBinding((ConstraintLayout) inflate, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0838R.id.tv_tool_bar_tips)));
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
