package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.fragment.settings.KeyboardLayoutSelectView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class FragmentKeyMultipleInputTypeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final KeyboardLayoutSelectView b;

    private FragmentKeyMultipleInputTypeBinding(@NonNull LinearLayout linearLayout, @NonNull KeyboardLayoutSelectView keyboardLayoutSelectView, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = keyboardLayoutSelectView;
    }

    @NonNull
    public static FragmentKeyMultipleInputTypeBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_key_multiple_input_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.settings_multiple_input_type_select_view;
        KeyboardLayoutSelectView keyboardLayoutSelectView = (KeyboardLayoutSelectView) inflate.findViewById(C0838R.id.settings_multiple_input_type_select_view);
        if (keyboardLayoutSelectView != null) {
            i = C0838R.id.settings_title_bar;
            ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
            if (imeTitleBar != null) {
                return new FragmentKeyMultipleInputTypeBinding((LinearLayout) inflate, keyboardLayoutSelectView, imeTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @NonNull
    public LinearLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
