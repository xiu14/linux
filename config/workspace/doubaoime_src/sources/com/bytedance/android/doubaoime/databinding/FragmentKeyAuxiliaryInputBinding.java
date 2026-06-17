package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class FragmentKeyAuxiliaryInputBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1965c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1966d;

    private FragmentKeyAuxiliaryInputBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull ImeListItemView imeListItemView2, @NonNull ImeListItemView imeListItemView3, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeListItemView;
        this.f1965c = imeListItemView2;
        this.f1966d = imeListItemView3;
    }

    @NonNull
    public static FragmentKeyAuxiliaryInputBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_key_auxiliary_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.enable_double_click_space_list_item;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.enable_double_click_space_list_item);
        if (imeListItemView != null) {
            i = C0838R.id.enable_first_letter_capitalization_list_item;
            ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_first_letter_capitalization_list_item);
            if (imeListItemView2 != null) {
                i = C0838R.id.enable_letter_digit_space_list_item_id;
                ImeListItemView imeListItemView3 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_letter_digit_space_list_item_id);
                if (imeListItemView3 != null) {
                    i = C0838R.id.settings_title_bar;
                    ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                    if (imeTitleBar != null) {
                        return new FragmentKeyAuxiliaryInputBinding((LinearLayout) inflate, imeListItemView, imeListItemView2, imeListItemView3, imeTitleBar);
                    }
                }
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
