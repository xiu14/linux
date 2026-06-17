package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentSmartInputSettingsBinding;
import com.bytedance.common_biz.ui.widget.ImeListItemView;

/* loaded from: classes.dex */
public final class SmartInputSettingsFragment extends BaseSettingsFragment {
    private FragmentSmartInputSettingsBinding b;

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentSmartInputSettingsBinding b = FragmentSmartInputSettingsBinding.b(layoutInflater, viewGroup, false);
        this.b = b;
        LinearLayout a = b.a();
        kotlin.s.c.l.e(a, "inflate(inflater, contai…        it.root\n        }");
        return a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        FragmentSmartInputSettingsBinding fragmentSmartInputSettingsBinding = this.b;
        if (fragmentSmartInputSettingsBinding != null) {
            ImeListItemView imeListItemView = fragmentSmartInputSettingsBinding.b;
            kotlin.s.c.l.e(imeListItemView, "it.cloudUsePartialInput");
            BaseSettingsFragment.o(this, imeListItemView, C0838R.string.enable_cloud_use_partial_input, null, 4, null);
            ImeListItemView imeListItemView2 = fragmentSmartInputSettingsBinding.f1993c;
            kotlin.s.c.l.e(imeListItemView2, "it.cloudUsePersonalLexicon");
            BaseSettingsFragment.o(this, imeListItemView2, C0838R.string.enable_cloud_use_personal_lexicon, null, 4, null);
        }
    }
}
