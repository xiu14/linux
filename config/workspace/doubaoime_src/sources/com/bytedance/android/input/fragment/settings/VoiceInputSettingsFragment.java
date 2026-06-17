package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.doubaoime.databinding.FragmentVoiceInputSettingsBinding;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeCheckBoxList;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class VoiceInputSettingsFragment extends BaseSettingsFragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2421d = 0;
    private final String b = "VoiceInputSettingsFragment";

    /* renamed from: c, reason: collision with root package name */
    private FragmentVoiceInputSettingsBinding f2422c;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.p<Integer, String, kotlin.o> {
        a() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(Integer num, String str) {
            int intValue = num.intValue();
            kotlin.s.c.l.f(str, "text");
            e.a.a.a.a.j0("voiceInputPunctuationList setOnSelectionChangedListener = ", intValue, VoiceInputSettingsFragment.this.b);
            String string = VoiceInputSettingsFragment.this.getString(C0838R.string.voice_input_punctuation_setting);
            kotlin.s.c.l.e(string, "getString(R.string.voice…nput_punctuation_setting)");
            SettingsConfigNext.l(string, Integer.valueOf(intValue));
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.p<Integer, String, kotlin.o> {
        b() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(Integer num, String str) {
            int intValue = num.intValue();
            kotlin.s.c.l.f(str, "text");
            if (intValue == 0) {
                SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
                String string = VoiceInputSettingsFragment.this.getString(C0838R.string.voice_input_words_model_setting);
                kotlin.s.c.l.e(string, "getString(R.string.voice…nput_words_model_setting)");
                settingsConfigNext.m(string, "normal");
            } else if (intValue == 1) {
                SettingsConfigNext settingsConfigNext2 = SettingsConfigNext.a;
                String string2 = VoiceInputSettingsFragment.this.getString(C0838R.string.voice_input_words_model_setting);
                kotlin.s.c.l.e(string2, "getString(R.string.voice…nput_words_model_setting)");
                settingsConfigNext2.m(string2, "jump");
            }
            return kotlin.o.a;
        }
    }

    private final void t(ImeCheckBoxList imeCheckBoxList) {
        String string = getString(C0838R.string.voice_input_punctuation_setting);
        kotlin.s.c.l.e(string, "getString(R.string.voice…nput_punctuation_setting)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        com.bytedance.android.input.r.j.i(this.b, "updateVoiceInputPunctuationList = " + intValue);
        imeCheckBoxList.b(intValue);
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentVoiceInputSettingsBinding b2 = FragmentVoiceInputSettingsBinding.b(layoutInflater, viewGroup, false);
        this.f2422c = b2;
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
        com.bytedance.android.input.r.j.i(this.b, "onResume");
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        FragmentVoiceInputSettingsBinding fragmentVoiceInputSettingsBinding = this.f2422c;
        if (fragmentVoiceInputSettingsBinding != null) {
            fragmentVoiceInputSettingsBinding.f1997d.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceInputSettingsFragment voiceInputSettingsFragment = VoiceInputSettingsFragment.this;
                    int i = VoiceInputSettingsFragment.f2421d;
                    kotlin.s.c.l.f(voiceInputSettingsFragment, "this$0");
                    FragmentActivity activity = voiceInputSettingsFragment.getActivity();
                    kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
                    SettingsActivityNext.switchFragment$default((SettingsActivityNext) activity, SettingsActivityNext.FragmentType.OFFLINE_DOWNLOAD, null, 2, null);
                }
            });
            String string = getString(C0838R.string.voice_input_punctuation_smart);
            kotlin.s.c.l.e(string, "getString(R.string.voice_input_punctuation_smart)");
            String string2 = getString(C0838R.string.voice_input_punctuation_space);
            kotlin.s.c.l.e(string2, "getString(R.string.voice_input_punctuation_space)");
            String string3 = getString(C0838R.string.voice_input_punctuation_end);
            kotlin.s.c.l.e(string3, "getString(R.string.voice_input_punctuation_end)");
            String string4 = getString(C0838R.string.voice_input_punctuation_all);
            kotlin.s.c.l.e(string4, "getString(R.string.voice_input_punctuation_all)");
            ArrayList c2 = kotlin.collections.g.c(string, string2, string3, string4);
            ImeCheckBoxList imeCheckBoxList = fragmentVoiceInputSettingsBinding.f1998e;
            imeCheckBoxList.setItems(c2);
            imeCheckBoxList.setOnSelectionChangedListener(new a());
            kotlin.s.c.l.e(imeCheckBoxList, "initView$lambda$3$lambda$1");
            t(imeCheckBoxList);
            String string5 = getString(C0838R.string.voice_input_words_normal_model);
            kotlin.s.c.l.e(string5, "getString(R.string.voice_input_words_normal_model)");
            String string6 = getString(C0838R.string.voice_input_words_jump_model);
            kotlin.s.c.l.e(string6, "getString(R.string.voice_input_words_jump_model)");
            ArrayList c3 = kotlin.collections.g.c(string5, string6);
            ImeCheckBoxList imeCheckBoxList2 = fragmentVoiceInputSettingsBinding.f1999f;
            imeCheckBoxList2.setItems(c3);
            imeCheckBoxList2.setOnSelectionChangedListener(new b());
            kotlin.s.c.l.e(imeCheckBoxList2, "initView$lambda$3$lambda$2");
            String string7 = getString(C0838R.string.voice_input_words_model_setting);
            kotlin.s.c.l.e(string7, "getString(R.string.voice…nput_words_model_setting)");
            Object g2 = SettingsConfigNext.g(string7, "normal");
            com.bytedance.android.input.r.j.i(this.b, "updateVoiceWordsModelList = " + g2);
            if (kotlin.s.c.l.a(g2, "normal")) {
                imeCheckBoxList2.b(0);
            } else if (kotlin.s.c.l.a(g2, "jump")) {
                imeCheckBoxList2.b(1);
            }
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        FragmentVoiceInputSettingsBinding fragmentVoiceInputSettingsBinding = this.f2422c;
        if (fragmentVoiceInputSettingsBinding != null) {
            ImeListItemView imeListItemView = fragmentVoiceInputSettingsBinding.f1996c;
            kotlin.s.c.l.e(imeListItemView, "it.enableSwitchCellItem");
            BaseSettingsFragment.o(this, imeListItemView, C0838R.string.enable_switch_cell, null, 4, null);
            ImeListItemView imeListItemView2 = fragmentVoiceInputSettingsBinding.b;
            kotlin.s.c.l.e(imeListItemView2, "it.enableBluetoothInputItem");
            BaseSettingsFragment.o(this, imeListItemView2, C0838R.string.enable_bluetooth_input, null, 4, null);
            ImeCheckBoxList imeCheckBoxList = fragmentVoiceInputSettingsBinding.f1998e;
            kotlin.s.c.l.e(imeCheckBoxList, "it.voiceInputPunctuationList");
            t(imeCheckBoxList);
        }
        FragmentVoiceInputSettingsBinding fragmentVoiceInputSettingsBinding2 = this.f2422c;
        if (fragmentVoiceInputSettingsBinding2 != null) {
            Object e2 = SettingsConfigNext.e(C0838R.string.asr_offline_download_way);
            Object e3 = SettingsConfigNext.e(C0838R.string.asr_offline_model_path);
            kotlin.s.c.l.d(e3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) e3;
            if (!(str.length() > 0) || !e.a.a.a.a.R0(str)) {
                str = "";
            }
            com.bytedance.android.input.r.j.i(this.b, "updateCurrentStatus downloadWay = " + e2 + ", downloadPath = " + str);
            if (!kotlin.s.c.l.a(e2, 0)) {
                if (!(str.length() == 0)) {
                    ImeListItemView imeListItemView3 = fragmentVoiceInputSettingsBinding2.f1997d;
                    String string = getString(C0838R.string.voice_input_offline_set_trailing_open);
                    kotlin.s.c.l.e(string, "getString(R.string.voice…ffline_set_trailing_open)");
                    imeListItemView3.setTrailingText(string);
                    imeListItemView3.setTrailingTextColor(imeListItemView3.getResources().getColor(C0838R.color.ime_button_bg_style_2, null));
                    return;
                }
            }
            ImeListItemView imeListItemView4 = fragmentVoiceInputSettingsBinding2.f1997d;
            String string2 = getString(C0838R.string.voice_input_offline_set_trailing);
            kotlin.s.c.l.e(string2, "getString(R.string.voice…put_offline_set_trailing)");
            imeListItemView4.setTrailingText(string2);
            imeListItemView4.setTrailingTextColor(imeListItemView4.getResources().getColor(C0838R.color.ime_color_common_text_73_color, null));
        }
    }
}
