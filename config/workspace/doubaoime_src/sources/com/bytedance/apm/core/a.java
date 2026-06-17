package com.bytedance.apm.core;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements b {
    @Override // com.bytedance.apm.core.b
    public Map<String, String> getCommonParams() {
        return Collections.emptyMap();
    }

    @Override // com.bytedance.apm.core.b
    public String getSessionId() {
        return null;
    }

    @Override // com.bytedance.apm.core.b
    public long getUid() {
        return 0L;
    }
}
