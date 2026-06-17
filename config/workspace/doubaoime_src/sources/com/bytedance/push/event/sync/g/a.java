package com.bytedance.push.event.sync.g;

import android.content.Intent;
import com.bytedance.push.C;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends com.bytedance.common.push.c {
    protected com.bytedance.push.settings.A.a.b a;
    protected String b;

    abstract String n();

    public void o(Intent intent) {
        com.bytedance.push.g0.f.c("AbsSignalReporterAdapter", "[onReceiveSignal]intent:" + intent);
    }

    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        StringBuilder M = e.a.a.a.a.M("[startSignalReport]signalName:");
        e.a.a.a.a.M0(M, n(), " triggerScene:", str, " signalReportConfig:");
        M.append(bVar);
        com.bytedance.push.g0.f.c("AbsSignalReporterAdapter", M.toString());
        this.a = bVar;
        this.b = str;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "signal_name", n());
        ((C) C.a()).k().monitorEvent("push_monitor_signal_trigger", jSONObject, null, null);
    }

    public void q() {
        com.bytedance.push.g0.f.c("AbsSignalReporterAdapter", "[onReceiveSignal]unregister");
    }
}
