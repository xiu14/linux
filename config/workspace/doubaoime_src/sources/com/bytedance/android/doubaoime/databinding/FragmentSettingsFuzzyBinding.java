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
public final class FragmentSettingsFuzzyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1983c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1984d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1985e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1986f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1987g;

    @NonNull
    public final ImeListItemView h;

    @NonNull
    public final ImeListItemView i;

    @NonNull
    public final ImeListItemView j;

    @NonNull
    public final ImeListItemView k;

    @NonNull
    public final ImeListItemView l;

    @NonNull
    public final ImeListItemView m;

    @NonNull
    public final ImeListItemView n;

    @NonNull
    public final ImeListItemView o;

    @NonNull
    public final ImeListItemView p;

    @NonNull
    public final LinearLayout q;

    private FragmentSettingsFuzzyBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull ImeListItemView imeListItemView2, @NonNull ImeListItemView imeListItemView3, @NonNull ImeListItemView imeListItemView4, @NonNull ImeListItemView imeListItemView5, @NonNull ImeListItemView imeListItemView6, @NonNull ImeListItemView imeListItemView7, @NonNull ImeListItemView imeListItemView8, @NonNull ImeListItemView imeListItemView9, @NonNull ImeListItemView imeListItemView10, @NonNull ImeListItemView imeListItemView11, @NonNull ImeListItemView imeListItemView12, @NonNull ImeListItemView imeListItemView13, @NonNull ImeListItemView imeListItemView14, @NonNull ImeListItemView imeListItemView15, @NonNull LinearLayout linearLayout2, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeListItemView;
        this.f1983c = imeListItemView2;
        this.f1984d = imeListItemView3;
        this.f1985e = imeListItemView4;
        this.f1986f = imeListItemView5;
        this.f1987g = imeListItemView6;
        this.h = imeListItemView7;
        this.i = imeListItemView8;
        this.j = imeListItemView9;
        this.k = imeListItemView10;
        this.l = imeListItemView11;
        this.m = imeListItemView12;
        this.n = imeListItemView13;
        this.o = imeListItemView14;
        this.p = imeListItemView15;
        this.q = linearLayout2;
    }

    @NonNull
    public static FragmentSettingsFuzzyBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_settings_fuzzy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.enable_fuzzy_initial_consonant_c_list_item;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_initial_consonant_c_list_item);
        if (imeListItemView != null) {
            i = C0838R.id.enable_fuzzy_initial_consonant_h_list_item;
            ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_initial_consonant_h_list_item);
            if (imeListItemView2 != null) {
                i = C0838R.id.enable_fuzzy_initial_consonant_n_list_item;
                ImeListItemView imeListItemView3 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_initial_consonant_n_list_item);
                if (imeListItemView3 != null) {
                    i = C0838R.id.enable_fuzzy_initial_consonant_r_list_item;
                    ImeListItemView imeListItemView4 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_initial_consonant_r_list_item);
                    if (imeListItemView4 != null) {
                        i = C0838R.id.enable_fuzzy_initial_consonant_s_list_item;
                        ImeListItemView imeListItemView5 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_initial_consonant_s_list_item);
                        if (imeListItemView5 != null) {
                            i = C0838R.id.enable_fuzzy_initial_consonant_z_list_item;
                            ImeListItemView imeListItemView6 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_initial_consonant_z_list_item);
                            if (imeListItemView6 != null) {
                                i = C0838R.id.enable_fuzzy_list_item;
                                ImeListItemView imeListItemView7 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_list_item);
                                if (imeListItemView7 != null) {
                                    i = C0838R.id.enable_fuzzy_syllables_huang_list_item;
                                    ImeListItemView imeListItemView8 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_syllables_huang_list_item);
                                    if (imeListItemView8 != null) {
                                        i = C0838R.id.enable_fuzzy_syllables_hui_list_item;
                                        ImeListItemView imeListItemView9 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_syllables_hui_list_item);
                                        if (imeListItemView9 != null) {
                                            i = C0838R.id.enable_fuzzy_vowel_an_list_item;
                                            ImeListItemView imeListItemView10 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_vowel_an_list_item);
                                            if (imeListItemView10 != null) {
                                                i = C0838R.id.enable_fuzzy_vowel_en_list_item;
                                                ImeListItemView imeListItemView11 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_vowel_en_list_item);
                                                if (imeListItemView11 != null) {
                                                    i = C0838R.id.enable_fuzzy_vowel_ian_list_item;
                                                    ImeListItemView imeListItemView12 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_vowel_ian_list_item);
                                                    if (imeListItemView12 != null) {
                                                        i = C0838R.id.enable_fuzzy_vowel_in_list_item;
                                                        ImeListItemView imeListItemView13 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_vowel_in_list_item);
                                                        if (imeListItemView13 != null) {
                                                            i = C0838R.id.enable_fuzzy_vowel_uan_list_item;
                                                            ImeListItemView imeListItemView14 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_vowel_uan_list_item);
                                                            if (imeListItemView14 != null) {
                                                                i = C0838R.id.enable_fuzzy_vowel_un_list_item;
                                                                ImeListItemView imeListItemView15 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_fuzzy_vowel_un_list_item);
                                                                if (imeListItemView15 != null) {
                                                                    i = C0838R.id.fuzzy_list;
                                                                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.fuzzy_list);
                                                                    if (linearLayout != null) {
                                                                        i = C0838R.id.settings_title_bar;
                                                                        ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                                                                        if (imeTitleBar != null) {
                                                                            return new FragmentSettingsFuzzyBinding((LinearLayout) inflate, imeListItemView, imeListItemView2, imeListItemView3, imeListItemView4, imeListItemView5, imeListItemView6, imeListItemView7, imeListItemView8, imeListItemView9, imeListItemView10, imeListItemView11, imeListItemView12, imeListItemView13, imeListItemView14, imeListItemView15, linearLayout, imeTitleBar);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
