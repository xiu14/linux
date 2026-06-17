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
public final class FragmentSmartInputSettingsBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1993c;

    private FragmentSmartInputSettingsBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull ImeListItemView imeListItemView2, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeListItemView;
        this.f1993c = imeListItemView2;
    }

    @NonNull
    public static FragmentSmartInputSettingsBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_smart_input_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.cloud_use_partial_input;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.cloud_use_partial_input);
        if (imeListItemView != null) {
            i = C0838R.id.cloud_use_personal_lexicon;
            ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.cloud_use_personal_lexicon);
            if (imeListItemView2 != null) {
                i = C0838R.id.settings_title_bar;
                ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                if (imeTitleBar != null) {
                    return new FragmentSmartInputSettingsBinding((LinearLayout) inflate, imeListItemView, imeListItemView2, imeTitleBar);
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
