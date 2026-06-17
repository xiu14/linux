package com.mammon.audiosdk.enums;

/* loaded from: classes2.dex */
public enum SAMICoreVopAudioCheckerResult {
    INTERNAL_ERROR(0),
    NETWORK_ERROR(1),
    PASSED(2),
    SNR_FAILED(3),
    WER_FAILED(4);

    private int value;

    SAMICoreVopAudioCheckerResult(int i) {
        this.value = 0;
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
