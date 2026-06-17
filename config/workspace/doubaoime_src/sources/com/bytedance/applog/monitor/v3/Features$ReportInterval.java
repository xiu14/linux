package com.bytedance.applog.monitor.v3;

/* loaded from: classes.dex */
public enum Features$ReportInterval {
    DEFAULT_60(0),
    LESS_THAN_60(1),
    BIG_THAN_60(2);

    private int value;

    Features$ReportInterval(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
