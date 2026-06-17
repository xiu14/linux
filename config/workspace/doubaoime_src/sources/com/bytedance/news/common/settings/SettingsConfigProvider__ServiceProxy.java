package com.bytedance.news.common.settings;

import com.bytedance.android.input.basic.settings.impl.SettingsConfigProviderImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class SettingsConfigProvider__ServiceProxy implements IServiceProxy<SettingsConfigProvider> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.news.common.settings.SettingsConfigProvider", "com.bytedance.android.input.basic.settings.impl.SettingsConfigProviderImpl");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public SettingsConfigProvider newInstance() {
        return new SettingsConfigProviderImpl();
    }
}
