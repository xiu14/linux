package com.mammon.samicorenui;

import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreNuiMessageType {
    MESSAGE_TYPE_WAKEUP_RESULT(0),
    MESSAGE_TYPE_ASR_BEGIN(1),
    MESSAGE_TYPE_ASR_PARTIAL_RESULT(2),
    MESSAGE_TYPE_ASR_FINAL_RESULT(3),
    MESSAGE_TYPE_TTS_BEGIN(4),
    MESSAGE_TYPE_TTS_AUDIO_DATA(5),
    MESSAGE_TYPE_TTS_END(6),
    MESSAGE_TYPE_NLP_RESULT(7);

    public static final HashMap<Integer, SAMICoreNuiMessageType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreNuiMessageType[] values = values();
        for (int i = 0; i < 8; i++) {
            SAMICoreNuiMessageType sAMICoreNuiMessageType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreNuiMessageType.getValue()), sAMICoreNuiMessageType);
        }
    }

    SAMICoreNuiMessageType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreNuiMessageType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
