package com.bytedance.apm.impl;

import android.content.Context;
import androidx.annotation.Keep;
import com.bytedance.apm.config.d;
import com.bytedance.apm.g;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class ApmAgentServiceImpl implements IApmAgent {
    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        com.bytedance.apm.c.d(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.apm.c.e(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        com.bytedance.apm.c.g(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        com.bytedance.apm.c.h(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorLog(String str, JSONObject jSONObject) {
        com.bytedance.apm.c.d(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.apm.c.j(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        com.bytedance.apm.c.k(str, i, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
        g.h();
        int i = com.bytedance.apm.c.f3346e;
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(com.bytedance.services.apm.api.b bVar) {
        d.b a = d.a();
        a.k(bVar.c());
        a.l(0);
        a.h(bVar.b());
        a.j(null);
        a.i(null);
        a.g(bVar.d());
        com.bytedance.apm.c.f(new d(a));
    }
}
