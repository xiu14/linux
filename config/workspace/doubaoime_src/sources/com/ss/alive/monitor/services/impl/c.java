package com.ss.alive.monitor.services.impl;

import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.g0.f;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class c implements Runnable {
    final /* synthetic */ com.ss.alive.monitor.model.a a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f8272c;

    c(a aVar, com.ss.alive.monitor.model.a aVar2, String str) {
        this.f8272c = aVar;
        this.a = aVar2;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j;
        JSONObject z = this.a.z();
        try {
            z.put("target_process", this.b);
            long f2 = com.ss.android.message.f.a.f();
            j = this.f8272c.l;
            z.put("delay_time", f2 - j);
        } catch (Throwable th) {
            f.f("AssociationStartMonitorService", "[onDelayStartChildProcessFailed]error when add json ", th);
        }
        PushServiceManager.get().getPushExternalService().getMultiProcessEventSenderService().onEventV3("bdpush_delay_start_child_process_error", z);
    }
}
