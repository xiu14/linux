package com.bytedance.android.input.basic.settings.impl;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.basic.settings.api.c.j;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;

@ServiceImpl
/* loaded from: classes.dex */
public final class InputSettingsManager implements IInputSettings {
    private final String b = "Settings_InputSettingsImpl";

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public com.bytedance.android.input.basic.settings.api.c.e a() {
        return ((InputSettings) com.bytedance.news.common.settings.c.d(InputSettings.class)).commonConfig();
    }

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public j b() {
        return ((InputSettings) com.bytedance.news.common.settings.c.d(InputSettings.class)).recommendConfig();
    }

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public com.bytedance.android.input.basic.settings.api.c.h c() {
        return ((InputSettings) com.bytedance.news.common.settings.c.d(InputSettings.class)).keyboardDefaultLayoutAndroidConfig();
    }

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public com.bytedance.android.input.basic.settings.api.c.a d() {
        return ((InputSettings) com.bytedance.news.common.settings.c.d(InputSettings.class)).asrConfig();
    }

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public void e() {
        IAppGlobals.a.x(this.b, "updateConfig");
        com.bytedance.news.common.settings.c.i(true);
    }

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public com.bytedance.android.input.basic.settings.api.c.g f() {
        return ((InputSettings) com.bytedance.news.common.settings.c.d(InputSettings.class)).interceptPreDisplayedConfig();
    }

    @Override // com.bytedance.android.input.basic.settings.api.IInputSettings
    public com.bytedance.android.input.basic.settings.api.c.d g() {
        return ((InputSettings) com.bytedance.news.common.settings.c.d(InputSettings.class)).candidateConfig();
    }
}
