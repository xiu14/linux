package com.bytedance.applog.monitor.v3;

import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
public enum StageEventType {
    V3_EVENT(0),
    V1_EVENT(1),
    LOG_DATA(2),
    LAUNCH(3),
    TERMINATE(4);

    private final int label;

    StageEventType(int i) {
        this.label = i;
    }

    public static StageEventType parse(String str) {
        StageEventType[] values = values();
        for (int i = 0; i < 5; i++) {
            StageEventType stageEventType = values[i];
            if (stageEventType.name().equals(str)) {
                return stageEventType;
            }
        }
        return V3_EVENT;
    }

    public int getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.label;
    }
}
