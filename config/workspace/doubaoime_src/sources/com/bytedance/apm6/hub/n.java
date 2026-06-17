package com.bytedance.apm6.hub;

import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class n implements com.bytedance.news.common.service.manager.a<IMonitorLogManager> {
    n() {
    }

    @Override // com.bytedance.news.common.service.manager.a
    public IMonitorLogManager a() {
        return new IMonitorLogManager() { // from class: com.bytedance.apm6.hub.Apm$22$1
            @Override // com.bytedance.services.apm.api.IMonitorLogManager
            public void deleteLegacyLogByIds(String str, String str2) {
            }

            @Override // com.bytedance.services.apm.api.IMonitorLogManager
            public void getLegacyLog(long j, long j2, String str, com.bytedance.services.apm.api.f fVar) {
            }

            @Override // com.bytedance.services.apm.api.IMonitorLogManager
            public List<JSONObject> getRecentUiActionRecords() {
                return com.bytedance.apm.v.e.a.b().c();
            }
        };
    }
}
