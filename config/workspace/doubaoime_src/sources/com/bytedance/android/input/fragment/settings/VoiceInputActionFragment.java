package com.bytedance.android.input.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentVoiceInputActionBinding;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VoiceInputActionFragment extends BaseSettingsFragment {
    private final String b = "VoiceInputActionFragment";

    /* renamed from: c, reason: collision with root package name */
    private FragmentVoiceInputActionBinding f2415c;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.q<SwitchCompat, Boolean, String, kotlin.o> {
        final /* synthetic */ FragmentVoiceInputActionBinding a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FragmentVoiceInputActionBinding fragmentVoiceInputActionBinding) {
            super(3);
            this.a = fragmentVoiceInputActionBinding;
        }

        @Override // kotlin.s.b.q
        public kotlin.o d(SwitchCompat switchCompat, Boolean bool, String str) {
            boolean booleanValue = bool.booleanValue();
            kotlin.s.c.l.f(switchCompat, "view");
            kotlin.s.c.l.f(str, "from");
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WsConstants.KEY_CONNECTION_STATE, booleanValue);
            aVar.t("speech_action_switch_click", jSONObject);
            this.a.f1994c.setVisibility(booleanValue ? 0 : 8);
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.p<Integer, String, kotlin.o> {
        b() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(Integer num, String str) {
            num.intValue();
            String str2 = str;
            kotlin.s.c.l.f(str2, "selectText");
            SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            String string = VoiceInputActionFragment.this.getString(C0838R.string.voice_input_action_send_type);
            kotlin.s.c.l.e(string, "getString(R.string.voice_input_action_send_type)");
            settingsConfigNext.m(string, str2);
            return kotlin.o.a;
        }
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentVoiceInputActionBinding b2 = FragmentVoiceInputActionBinding.b(layoutInflater, viewGroup, false);
        this.f2415c = b2;
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.bytedance.android.input.r.j.i(this.b, "onResume");
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        com.bytedance.android.input.r.j.i(this.b, "initView");
        l();
        FragmentVoiceInputActionBinding fragmentVoiceInputActionBinding = this.f2415c;
        if (fragmentVoiceInputActionBinding != null) {
            ImeListItemView imeListItemView = fragmentVoiceInputActionBinding.f1995d;
            kotlin.s.c.l.e(imeListItemView, "it.enableVoiceActionListItem");
            n(imeListItemView, C0838R.string.voice_input_action_enable, new a(fragmentVoiceInputActionBinding));
            Object e2 = SettingsConfigNext.e(C0838R.string.voice_input_action_enable);
            Boolean bool = e2 instanceof Boolean ? (Boolean) e2 : null;
            fragmentVoiceInputActionBinding.f1994c.setVisibility(bool != null ? bool.booleanValue() : false ? 0 : 8);
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        FragmentVoiceInputActionBinding fragmentVoiceInputActionBinding = this.f2415c;
        if (fragmentVoiceInputActionBinding != null) {
            String string = getString(C0838R.string.voice_input_action_send_list);
            kotlin.s.c.l.e(string, "getString(R.string.voice_input_action_send_list)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.String");
            List<String> J2 = kotlin.text.a.J((String) f2, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null);
            String string2 = getString(C0838R.string.voice_input_action_send_default);
            kotlin.s.c.l.e(string2, "getString(R.string.voice…nput_action_send_default)");
            Object f3 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) f3;
            com.bytedance.android.input.r.j.i(this.b, "updateUI, " + J2);
            fragmentVoiceInputActionBinding.b.setItems(J2);
            String string3 = getString(C0838R.string.voice_input_action_send_type);
            kotlin.s.c.l.e(string3, "getString(R.string.voice_input_action_send_type)");
            Object f4 = SettingsConfigNext.f(string3);
            kotlin.s.c.l.d(f4, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) f4;
            if (J2.contains(str2)) {
                fragmentVoiceInputActionBinding.b.b(J2.indexOf(str2));
            } else {
                fragmentVoiceInputActionBinding.b.b(0);
                SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
                String string4 = getString(C0838R.string.voice_input_action_send_type);
                kotlin.s.c.l.e(string4, "getString(R.string.voice_input_action_send_type)");
                settingsConfigNext.m(string4, str);
            }
            fragmentVoiceInputActionBinding.b.setOnSelectionChangedListener(new b());
        }
    }
}
