package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentSettingsFuzzyBinding;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeListItemView;

/* loaded from: classes.dex */
public final class FuzzyFragment extends BaseSettingsFragment {
    private FragmentSettingsFuzzyBinding b;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.q<SwitchCompat, Boolean, String, kotlin.o> {
        final /* synthetic */ FragmentSettingsFuzzyBinding a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FragmentSettingsFuzzyBinding fragmentSettingsFuzzyBinding) {
            super(3);
            this.a = fragmentSettingsFuzzyBinding;
        }

        @Override // kotlin.s.b.q
        public kotlin.o d(SwitchCompat switchCompat, Boolean bool, String str) {
            boolean booleanValue = bool.booleanValue();
            kotlin.s.c.l.f(switchCompat, "view");
            kotlin.s.c.l.f(str, "from");
            LinearLayout linearLayout = this.a.q;
            kotlin.s.c.l.e(linearLayout, "it.fuzzyList");
            com.obric.oui.common.util.b.i(linearLayout, booleanValue);
            return kotlin.o.a;
        }
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentSettingsFuzzyBinding b = FragmentSettingsFuzzyBinding.b(layoutInflater, viewGroup, false);
        this.b = b;
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.s.c.l.f(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        FragmentSettingsFuzzyBinding fragmentSettingsFuzzyBinding = this.b;
        if (fragmentSettingsFuzzyBinding != null) {
            LinearLayout linearLayout = fragmentSettingsFuzzyBinding.q;
            kotlin.s.c.l.e(linearLayout, "it.fuzzyList");
            String string = getString(C0838R.string.enable_fuzzy);
            kotlin.s.c.l.e(string, "getString(R.string.enable_fuzzy)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            com.obric.oui.common.util.b.i(linearLayout, ((Boolean) f2).booleanValue());
            ImeListItemView imeListItemView = fragmentSettingsFuzzyBinding.h;
            kotlin.s.c.l.e(imeListItemView, "it.enableFuzzyListItem");
            n(imeListItemView, C0838R.string.enable_fuzzy, new a(fragmentSettingsFuzzyBinding));
            ImeListItemView imeListItemView2 = fragmentSettingsFuzzyBinding.f1987g;
            kotlin.s.c.l.e(imeListItemView2, "it.enableFuzzyInitialConsonantZListItem");
            BaseSettingsFragment.o(this, imeListItemView2, C0838R.string.enable_fuzzy_initial_consonant_z, null, 4, null);
            ImeListItemView imeListItemView3 = fragmentSettingsFuzzyBinding.b;
            kotlin.s.c.l.e(imeListItemView3, "it.enableFuzzyInitialConsonantCListItem");
            BaseSettingsFragment.o(this, imeListItemView3, C0838R.string.enable_fuzzy_initial_consonant_c, null, 4, null);
            ImeListItemView imeListItemView4 = fragmentSettingsFuzzyBinding.f1986f;
            kotlin.s.c.l.e(imeListItemView4, "it.enableFuzzyInitialConsonantSListItem");
            BaseSettingsFragment.o(this, imeListItemView4, C0838R.string.enable_fuzzy_initial_consonant_s, null, 4, null);
            ImeListItemView imeListItemView5 = fragmentSettingsFuzzyBinding.f1983c;
            kotlin.s.c.l.e(imeListItemView5, "it.enableFuzzyInitialConsonantHListItem");
            BaseSettingsFragment.o(this, imeListItemView5, C0838R.string.enable_fuzzy_initial_consonant_h, null, 4, null);
            ImeListItemView imeListItemView6 = fragmentSettingsFuzzyBinding.f1984d;
            kotlin.s.c.l.e(imeListItemView6, "it.enableFuzzyInitialConsonantNListItem");
            BaseSettingsFragment.o(this, imeListItemView6, C0838R.string.enable_fuzzy_initial_consonant_n, null, 4, null);
            ImeListItemView imeListItemView7 = fragmentSettingsFuzzyBinding.f1985e;
            kotlin.s.c.l.e(imeListItemView7, "it.enableFuzzyInitialConsonantRListItem");
            BaseSettingsFragment.o(this, imeListItemView7, C0838R.string.enable_fuzzy_initial_consonant_r, null, 4, null);
            ImeListItemView imeListItemView8 = fragmentSettingsFuzzyBinding.k;
            kotlin.s.c.l.e(imeListItemView8, "it.enableFuzzyVowelAnListItem");
            BaseSettingsFragment.o(this, imeListItemView8, C0838R.string.enable_fuzzy_vowel_an, null, 4, null);
            ImeListItemView imeListItemView9 = fragmentSettingsFuzzyBinding.l;
            kotlin.s.c.l.e(imeListItemView9, "it.enableFuzzyVowelEnListItem");
            BaseSettingsFragment.o(this, imeListItemView9, C0838R.string.enable_fuzzy_vowel_en, null, 4, null);
            ImeListItemView imeListItemView10 = fragmentSettingsFuzzyBinding.n;
            kotlin.s.c.l.e(imeListItemView10, "it.enableFuzzyVowelInListItem");
            BaseSettingsFragment.o(this, imeListItemView10, C0838R.string.enable_fuzzy_vowel_in, null, 4, null);
            ImeListItemView imeListItemView11 = fragmentSettingsFuzzyBinding.m;
            kotlin.s.c.l.e(imeListItemView11, "it.enableFuzzyVowelIanListItem");
            BaseSettingsFragment.o(this, imeListItemView11, C0838R.string.enable_fuzzy_vowel_ian, null, 4, null);
            ImeListItemView imeListItemView12 = fragmentSettingsFuzzyBinding.o;
            kotlin.s.c.l.e(imeListItemView12, "it.enableFuzzyVowelUanListItem");
            BaseSettingsFragment.o(this, imeListItemView12, C0838R.string.enable_fuzzy_vowel_uan, null, 4, null);
            ImeListItemView imeListItemView13 = fragmentSettingsFuzzyBinding.p;
            kotlin.s.c.l.e(imeListItemView13, "it.enableFuzzyVowelUnListItem");
            BaseSettingsFragment.o(this, imeListItemView13, C0838R.string.enable_fuzzy_vowel_un, null, 4, null);
            ImeListItemView imeListItemView14 = fragmentSettingsFuzzyBinding.j;
            kotlin.s.c.l.e(imeListItemView14, "it.enableFuzzySyllablesHuiListItem");
            BaseSettingsFragment.o(this, imeListItemView14, C0838R.string.enable_fuzzy_syllables_hui, null, 4, null);
            ImeListItemView imeListItemView15 = fragmentSettingsFuzzyBinding.i;
            kotlin.s.c.l.e(imeListItemView15, "it.enableFuzzySyllablesHuangListItem");
            BaseSettingsFragment.o(this, imeListItemView15, C0838R.string.enable_fuzzy_syllables_huang, null, 4, null);
        }
    }
}
