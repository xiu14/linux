package com.bytedance.news.common.settings;

import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes.dex */
public interface SettingsConfigProvider extends IService {
    a getConfig();

    b getLazyConfig();
}
