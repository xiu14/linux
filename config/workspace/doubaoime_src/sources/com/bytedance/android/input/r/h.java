package com.bytedance.android.input.r;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class h implements com.bytedance.apm.core.b {
    h(j jVar) {
    }

    @Override // com.bytedance.apm.core.b
    public Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("region", "SG");
        return hashMap;
    }

    @Override // com.bytedance.apm.core.b
    public String getSessionId() {
        return com.bytedance.applog.a.f();
    }

    @Override // com.bytedance.apm.core.b
    public long getUid() {
        return 123L;
    }
}
