package com.bytedance.android.input.common_biz.performance.api;

import com.bytedance.android.input.perf.PerformanceConfigImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

/* loaded from: classes.dex */
public class IPerformanceConfig__ServiceProxy implements IServiceProxy<IPerformanceConfig> {
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig", "com.bytedance.android.input.perf.PerformanceConfigImpl");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.news.common.service.manager.IServiceProxy
    public IPerformanceConfig newInstance() {
        return new PerformanceConfigImpl();
    }
}
