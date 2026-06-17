package com.bytedance.android.input.common_biz.performance.api;

import com.bytedance.feedbackerlib.a;
import com.bytedance.news.common.service.manager.IService;
import java.util.Map;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class PerformanceConfig implements IPerformanceConfig {
    public static final PerformanceConfig INSTANCE = new PerformanceConfig();
    private final /* synthetic */ IPerformanceConfig $$delegate_0;

    private PerformanceConfig() {
        IService S = a.S(A.b(IPerformanceConfig.class));
        l.c(S);
        this.$$delegate_0 = (IPerformanceConfig) S;
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public int getAssociationFirstRefresh() {
        return this.$$delegate_0.getAssociationFirstRefresh();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public int getFirstRefreshLevel() {
        return this.$$delegate_0.getFirstRefreshLevel();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isEnablePrintLog() {
        return this.$$delegate_0.isEnablePrintLog();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isNoFreqRender() {
        return this.$$delegate_0.isNoFreqRender();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isSpMonitorEnabled() {
        return this.$$delegate_0.isSpMonitorEnabled();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isSupportHighRefreshRate() {
        return this.$$delegate_0.isSupportHighRefreshRate();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isUploadDrawPathData() {
        return this.$$delegate_0.isUploadDrawPathData();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isUploadFpsPerData() {
        return this.$$delegate_0.isUploadFpsPerData();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isUploadRefreshRate() {
        return this.$$delegate_0.isUploadRefreshRate();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public void trace(String str, Map<String, ? extends Object> map) {
        l.f(str, "eventName");
        this.$$delegate_0.trace(str, map);
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public int uploadHighRefreshRateMaxNum() {
        return this.$$delegate_0.uploadHighRefreshRateMaxNum();
    }
}
