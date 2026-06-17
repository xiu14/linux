package com.bytedance.common.ad_test.api;

import com.bytedance.common.ad_test.impl.AbConfigImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class IAbConfig__ServiceProxy implements IServiceProxy<IAbConfig> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.common.ad_test.api.IAbConfig", "com.bytedance.common.ad_test.impl.AbConfigImpl");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IAbConfig newInstance() {
        return new AbConfigImpl();
    }
}
