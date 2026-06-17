package com.bytedance.android.input.common_biz.performance.api;

import com.bytedance.news.common.service.manager.IService;
import java.util.Map;

/* loaded from: classes.dex */
public interface IPerformanceConfig extends IService {
    int getAssociationFirstRefresh();

    int getFirstRefreshLevel();

    boolean isEnablePrintLog();

    boolean isNoFreqRender();

    boolean isSpMonitorEnabled();

    boolean isSupportHighRefreshRate();

    boolean isUploadDrawPathData();

    boolean isUploadFpsPerData();

    boolean isUploadRefreshRate();

    void trace(String str, Map<String, ? extends Object> map);

    int uploadHighRefreshRateMaxNum();
}
