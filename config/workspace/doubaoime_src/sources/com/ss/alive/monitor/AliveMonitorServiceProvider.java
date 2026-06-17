package com.ss.alive.monitor;

import android.content.Context;
import com.bytedance.android.service.manager.alive.monitor.AliveMonitorService;
import com.bytedance.android.service.manager.alive.monitor.IMonitorCallback;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AliveMonitorServiceProvider implements AliveMonitorService {
    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public boolean curProcessIsFirstProcess(Context context) {
        return c.c(context).d();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public JSONObject getProcessStartInfoObject(Context context) {
        return c.c(context).a().g();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public boolean hasHookActivityManagerSuccess(Context context) {
        return ((com.ss.alive.monitor.services.impl.a) com.ss.alive.monitor.l.a.c().b(context)).g();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public boolean hasHookActivityTaskManagerSuccess(Context context) {
        return ((com.ss.alive.monitor.services.impl.a) com.ss.alive.monitor.l.a.c().b(context)).h();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public void monitorAssociationStart(Context context) {
        ((com.ss.alive.monitor.services.impl.a) com.ss.alive.monitor.l.a.c().b(context)).n();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public void onUserActive() {
        com.ss.alive.monitor.l.a.c().a().onUserActive();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public void startDetectProcessLaunchReason(Context context) {
        c.c(context).b();
    }

    @Override // com.bytedance.android.service.manager.alive.monitor.AliveMonitorService
    public void monitorAssociationStart(Context context, IMonitorCallback iMonitorCallback) {
        ((com.ss.alive.monitor.services.impl.a) com.ss.alive.monitor.l.a.c().b(context)).o(iMonitorCallback);
    }
}
