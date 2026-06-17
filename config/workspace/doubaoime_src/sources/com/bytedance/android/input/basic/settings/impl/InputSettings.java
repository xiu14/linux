package com.bytedance.android.input.basic.settings.impl;

import com.bytedance.android.input.basic.settings.api.c.j;
import com.bytedance.android.input.basic.settings.api.c.l;
import com.bytedance.news.common.settings.api.annotation.ISettings;

@com.bytedance.news.common.settings.api.annotation.a(storageKey = "input_remote_settings")
/* loaded from: classes.dex */
public interface InputSettings extends ISettings {
    com.bytedance.android.input.basic.settings.api.c.a asrConfig();

    com.bytedance.android.input.basic.settings.api.c.d candidateConfig();

    com.bytedance.android.input.basic.settings.api.c.e commonConfig();

    com.bytedance.android.input.basic.settings.api.c.g interceptPreDisplayedConfig();

    com.bytedance.android.input.basic.settings.api.c.h keyboardDefaultLayoutAndroidConfig();

    j recommendConfig();

    l thirdConfig();
}
