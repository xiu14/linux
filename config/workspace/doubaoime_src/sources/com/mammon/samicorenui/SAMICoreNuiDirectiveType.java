package com.mammon.samicorenui;

import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreNuiDirectiveType {
    DIRECTIVE_START_ENGINE(0),
    DIRECTIVE_STOP_ENGINE(1),
    DIRECTIVE_SYNC_STOP_ENGINE(2),
    DIRECTIVE_PLAYING_DECISION(3),
    DIRECTIVE_TRIGGER_WAKEUP(4),
    DIRECTIVE_CANCEL_CURRENT_DIALOG(5),
    DIRECTIVE_FINISH_TALKING(6),
    DIRECTIVE_TRIGGER_WAKEUP_FOR_TTS(7),
    DIRECTIVE_PLAY_TTS(8),
    DIRECTIVE_PLAY_SSML_TTS(9),
    DIRECTIVE_USE_MODE1(10),
    DIRECTIVE_USE_MODE2(11),
    DIRECTIVE_USE_WAKEUP_MODE(12),
    DIRECTIVE_USE_KWS_MODE(13),
    DIRECTIVE_TEST_WAKEUP(14),
    DIRECTIVE_TEST_USE_LOCAL_AUDIO_FILE(15),
    DIRECTIVE_TEST_LONG_ASR_START(16),
    DIRECTIVE_TEST_LONG_ASR_STOP(17),
    DIRECTIVE_TEST_BOE_ASR(18),
    DIRECTIVE_TEST_ONLINE_ASR(19),
    DIRECTIVE_TEST_SET_WAKEUP_THRESHOLD(20),
    DIRECTIVE_TEST_SET_WAKEUP_TTS_THRESHOLD(21),
    DIRECTIVE_TEST_SET_AEC_MODEL_PATH(22),
    DIRECTIVE_TEST_SET_ENABLE_Punctuation(23),
    DIRECTIVE_TEST_SET_WAKEUP_TEST_AUDIO_FILE(24);

    public static final HashMap<Integer, SAMICoreNuiDirectiveType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreNuiDirectiveType[] values = values();
        for (int i = 0; i < 25; i++) {
            SAMICoreNuiDirectiveType sAMICoreNuiDirectiveType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreNuiDirectiveType.getValue()), sAMICoreNuiDirectiveType);
        }
    }

    SAMICoreNuiDirectiveType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreNuiDirectiveType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
