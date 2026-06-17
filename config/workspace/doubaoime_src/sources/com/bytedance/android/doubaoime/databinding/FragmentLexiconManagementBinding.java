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
public final class FragmentLexiconManagementBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1982c;

    private FragmentLexiconManagementBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull LinearLayout linearLayout2, @NonNull ImeListItemView imeListItemView2, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeListItemView;
        this.f1982c = imeListItemView2;
    }

    @NonNull
    public static FragmentLexiconManagementBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_lexicon_management, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.contacts_item_del;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.contacts_item_del);
        if (imeListItemView != null) {
            i = C0838R.id.lexicon_item_container;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.lexicon_item_container);
            if (linearLayout != null) {
                i = C0838R.id.lexicon_item_del;
                ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.lexicon_item_del);
                if (imeListItemView2 != null) {
                    i = C0838R.id.settings_title_bar;
                    ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                    if (imeTitleBar != null) {
                        return new FragmentLexiconManagementBinding((LinearLayout) inflate, imeListItemView, linearLayout, imeListItemView2, imeTitleBar);
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
