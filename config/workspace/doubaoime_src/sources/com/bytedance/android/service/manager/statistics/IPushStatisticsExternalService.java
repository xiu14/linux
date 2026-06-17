package com.bytedance.android.service.manager.statistics;

import android.content.Context;

/* loaded from: classes.dex */
public interface IPushStatisticsExternalService {
    long getValidDeviceDozeDuration(Context context);

    long getValidDeviceKillDuration(Context context);

    boolean isEnablePushStatistics();

    void onProcessStart();

    void onPushStart();
}
