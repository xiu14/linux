package com.bytedance.android.doubaoime.activity;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.common_biz.ui.widget.ImeListItemView;

/* loaded from: classes.dex */
public final class ImeGuideSettingsNewActivity extends BaseSettingActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1921c = 0;
    private ImeListItemView a;
    private ImeListItemView b;

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity
    public void h() {
        setContentView(C0838R.layout.activity_ime_guide_settings_new);
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity
    public void initView() {
        super.initView();
        this.a = (ImeListItemView) findViewById(C0838R.id.new_use_input_history_list_item);
        this.b = (ImeListItemView) findViewById(C0838R.id.new_use_personal_dict_list_item);
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseSettingActivity
    public void updateUI() {
        final String string = getString(C0838R.string.enable_cloud_use_partial_input);
        kotlin.s.c.l.e(string, "getString(R.string.enable_cloud_use_partial_input)");
        ImeListItemView imeListItemView = this.a;
        if (imeListItemView != null) {
            SwitchCompat a = imeListItemView.a();
            a.setHapticFeedbackEnabled(false);
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
            a.setChecked(((Boolean) f2).booleanValue());
            a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = string;
                    int i = ImeGuideSettingsNewActivity.f1921c;
                    kotlin.s.c.l.f(str, "$mUseInputHistorySettingString");
                    kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                    KeyboardJni.updateSettingsBooleanValue(str, ((SwitchCompat) view).isChecked());
                }
            });
        }
        final String string2 = getString(C0838R.string.enable_cloud_use_personal_lexicon);
        kotlin.s.c.l.e(string2, "getString(R.string.enabl…oud_use_personal_lexicon)");
        ImeListItemView imeListItemView2 = this.b;
        if (imeListItemView2 != null) {
            SwitchCompat a2 = imeListItemView2.a();
            a2.setHapticFeedbackEnabled(false);
            Object f3 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Boolean");
            a2.setChecked(((Boolean) f3).booleanValue());
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = string2;
                    int i = ImeGuideSettingsNewActivity.f1921c;
                    kotlin.s.c.l.f(str, "$mUsePersonalDictSettingString");
                    kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                    KeyboardJni.updateSettingsBooleanValue(str, ((SwitchCompat) view).isChecked());
                }
            });
        }
    }
}
