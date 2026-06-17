package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentKeyAuxiliaryInputBinding;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeListItemView;

/* loaded from: classes.dex */
public final class KeyAuxiliaryInputFragment extends BaseSettingsFragment {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2379c = 0;
    private FragmentKeyAuxiliaryInputBinding b;

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentKeyAuxiliaryInputBinding b = FragmentKeyAuxiliaryInputBinding.b(layoutInflater, viewGroup, false);
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

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        ImeListItemView imeListItemView;
        l();
        FragmentKeyAuxiliaryInputBinding fragmentKeyAuxiliaryInputBinding = this.b;
        if (fragmentKeyAuxiliaryInputBinding == null || (imeListItemView = fragmentKeyAuxiliaryInputBinding.f1966d) == null) {
            return;
        }
        final SwitchCompat a = imeListItemView.a();
        a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwitchCompat switchCompat = SwitchCompat.this;
                KeyAuxiliaryInputFragment keyAuxiliaryInputFragment = this;
                int i = KeyAuxiliaryInputFragment.f2379c;
                kotlin.s.c.l.f(switchCompat, "$switchView");
                kotlin.s.c.l.f(keyAuxiliaryInputFragment, "this$0");
                boolean isChecked = switchCompat.isChecked();
                String string = keyAuxiliaryInputFragment.getString(C0838R.string.voice_input_number_show_setting);
                kotlin.s.c.l.e(string, "getString(R.string.voice…nput_number_show_setting)");
                SettingsConfigNext.l(string, Integer.valueOf(isChecked ? 1 : 0));
            }
        });
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        FragmentKeyAuxiliaryInputBinding fragmentKeyAuxiliaryInputBinding = this.b;
        if (fragmentKeyAuxiliaryInputBinding != null) {
            SwitchCompat a = fragmentKeyAuxiliaryInputBinding.f1966d.a();
            String string = getString(C0838R.string.voice_input_number_show_setting);
            kotlin.s.c.l.e(string, "getString(R.string.voice…nput_number_show_setting)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            a.setChecked(((Integer) f2).intValue() == 1);
            ImeListItemView imeListItemView = fragmentKeyAuxiliaryInputBinding.f1965c;
            kotlin.s.c.l.e(imeListItemView, "it.enableFirstLetterCapitalizationListItem");
            BaseSettingsFragment.o(this, imeListItemView, C0838R.string.enable_first_letter_capitalization, null, 4, null);
            ImeListItemView imeListItemView2 = fragmentKeyAuxiliaryInputBinding.b;
            kotlin.s.c.l.e(imeListItemView2, "it.enableDoubleClickSpaceListItem");
            BaseSettingsFragment.o(this, imeListItemView2, C0838R.string.enable_double_click_space, null, 4, null);
        }
    }
}
