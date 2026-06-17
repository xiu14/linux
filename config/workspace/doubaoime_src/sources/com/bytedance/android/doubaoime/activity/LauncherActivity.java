package com.bytedance.android.doubaoime.activity;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.input.framework.activity.BaseImeActivity;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.model.InitPeriod;

/* loaded from: classes.dex */
public class LauncherActivity extends BaseImeActivity {
    private boolean h() {
        Intent intent = getIntent();
        return intent != null && ("android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() != null);
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Intent intent;
        InitPeriod initPeriod = InitPeriod.SPLASH_ONCREATE2SUPER;
        InitScheduler.onPeriodStart(initPeriod);
        InitScheduler.onPeriodEnd(initPeriod);
        super.onCreate(bundle);
        InitPeriod initPeriod2 = InitPeriod.SPLASH_SUPER2ONCREATEEND;
        InitScheduler.onPeriodStart(initPeriod2);
        InitScheduler.onPeriodEnd(initPeriod2);
        boolean g2 = com.bytedance.android.input.common.u.c.g(getApplicationContext());
        boolean h = com.bytedance.android.input.common.u.c.h(getApplicationContext());
        String str = SettingsActivityNext.SETTINGS_SOURCE_NEW;
        if (g2 && h) {
            intent = new Intent(this, (Class<?>) SettingsActivityNext.class);
            intent.addFlags(67108864);
            if (!h()) {
                str = SettingsActivityNext.SETTINGS_SOURCE_APP;
            }
            intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, str);
        } else {
            intent = new Intent(this, (Class<?>) ImeGuideActivity.class);
            if (!h()) {
                str = SettingsActivityNext.SETTINGS_SOURCE_APP;
            }
            intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, str);
        }
        startActivity(intent);
        finish();
    }
}
