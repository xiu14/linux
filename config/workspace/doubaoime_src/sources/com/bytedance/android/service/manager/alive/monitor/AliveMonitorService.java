package com.bytedance.android.service.manager.alive.monitor;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface AliveMonitorService {
    boolean curProcessIsFirstProcess(Context context);

    JSONObject getProcessStartInfoObject(Context context);

    boolean hasHookActivityManagerSuccess(Context context);

    boolean hasHookActivityTaskManagerSuccess(Context context);

    void monitorAssociationStart(Context context);

    void monitorAssociationStart(Context context, IMonitorCallback iMonitorCallback);

    void onUserActive();

    void startDetectProcessLaunchReason(Context context);
}
