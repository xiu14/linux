package com.bytedance.apm.core;

import java.util.Map;

/* loaded from: classes.dex */
public interface b {
    Map<String, String> getCommonParams();

    String getSessionId();

    long getUid();
}
