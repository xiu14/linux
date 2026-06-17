package com.bytedance.push.interfaze;

import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public interface t {
    ConcurrentHashMap<String, WeakReference<com.bytedance.push.event.sync.b>> getBusinessExtraInfoProviderMap();

    com.bytedance.push.event.sync.d getISignalReporter();

    com.bytedance.push.event.sync.e getIUserExitsValidityChecker();

    void onHwScreenConfigDisable();

    void onNotificationDelete(long j);

    void onReceiveSignal(Intent intent);

    void registerNotificationDeleteListener(com.bytedance.push.event.sync.c cVar);

    void triggerSignalReport(String str);
}
