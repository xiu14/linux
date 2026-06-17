package com.bytedance.android.input.speech;

import android.content.SharedPreferences;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.popup.WindowId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D {
    public static final void a() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        boolean z = false;
        if (aVar.o().getBoolean("asr_punct_settings_guide_flag", false)) {
            com.bytedance.android.input.r.j.i("AsrPunctSettingsGuide", "checkShownCondition asr punct settings guide already show once");
        } else {
            z = true;
        }
        if (!z) {
            com.bytedance.android.input.r.j.i("AsrPunctSettingsGuide", "showAsrPunctSettingsGuide has already shown");
            return;
        }
        com.bytedance.android.input.r.j.m("AsrPunctSettingsGuide", "AsrPunctSettingsGuide begin show");
        if (KeyboardJni.showGuideTips(aVar.getContext().getString(C0838R.string.asr_punct_setting_guide_text), aVar.getContext().getString(C0838R.string.guide_popup_open_action_text), WindowId.ASR_PUNCT_SETTINGS_TIPS_UI)) {
            SharedPreferences.Editor edit = aVar.o().edit();
            kotlin.s.c.l.e(edit, "editor");
            edit.putBoolean("asr_punct_settings_guide_flag", true);
            edit.apply();
        }
    }
}
