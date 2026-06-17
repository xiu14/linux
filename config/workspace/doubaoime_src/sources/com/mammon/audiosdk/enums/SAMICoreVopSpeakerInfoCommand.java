package com.mammon.audiosdk.enums;

/* loaded from: classes2.dex */
public enum SAMICoreVopSpeakerInfoCommand {
    SIGN_AGREEMENT(0),
    START_RECORD_TASK(1),
    START_BUILD_TASK(2),
    SET_PUBLIC(3),
    SET_PRIVATE(4),
    DELETE(5),
    BIND_VOICE(6),
    DISCARD_VOICE(7);

    private int value;

    SAMICoreVopSpeakerInfoCommand(int i) {
        this.value = 0;
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
