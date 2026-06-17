package com.bytedance.apm.impl;

import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.apm.api.f;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MonitorLogManagerImpl implements IMonitorLogManager {
    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void deleteLegacyLogByIds(String str, String str2) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void getLegacyLog(long j, long j2, String str, f fVar) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public List<JSONObject> getRecentUiActionRecords() {
        return com.bytedance.apm.v.e.a.b().c();
    }
}
