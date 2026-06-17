package com.bytedance.applog.monitor.v3;

/* loaded from: classes.dex */
public enum Features$IntFeatureKeys {
    REPORT_INTERVAL(19, 2);

    private final int length;
    private final int position;

    Features$IntFeatureKeys(int i, int i2) {
        this.position = i;
        this.length = i2;
    }

    private int getPositiveBitsByLength() {
        int i = 1;
        for (int i2 = 0; i2 < this.length; i2++) {
            i &= 1 << i2;
        }
        return i;
    }

    public int toBits(int i, int i2) {
        if (i2 >= (1 << this.length)) {
            i2 = getPositiveBitsByLength();
        }
        return (i & (~getPositiveBitsByLength())) | (i2 << this.position);
    }
}
