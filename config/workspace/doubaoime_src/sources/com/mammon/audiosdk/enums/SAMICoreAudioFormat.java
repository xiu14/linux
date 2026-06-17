package com.mammon.audiosdk.enums;

import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreAudioFormat {
    PCM(0),
    WAV(1),
    AAC(2),
    OPUS(3);

    public static final HashMap<Integer, SAMICoreAudioFormat> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreAudioFormat[] values = values();
        for (int i = 0; i < 4; i++) {
            SAMICoreAudioFormat sAMICoreAudioFormat = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreAudioFormat.getValue()), sAMICoreAudioFormat);
        }
    }

    SAMICoreAudioFormat(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreAudioFormat fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
