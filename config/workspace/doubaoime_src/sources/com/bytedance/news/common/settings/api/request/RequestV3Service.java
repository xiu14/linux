package com.bytedance.news.common.settings.api.request;

import androidx.annotation.Nullable;
import com.bytedance.news.common.settings.api.model.SettingsRequestModel;
import com.bytedance.news.common.settings.e.c;

/* loaded from: classes.dex */
public interface RequestV3Service {
    c requestV3(@Nullable SettingsRequestModel settingsRequestModel);
}
