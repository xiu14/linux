package com.mammon.audiosdk.enums;

/* loaded from: classes2.dex */
public enum SAMICoreVopRecordingType {
    PCM_S16(0),
    FILE(1),
    INTERNAL(2);

    private int value;

    SAMICoreVopRecordingType(int i) {
        this.value = 0;
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
