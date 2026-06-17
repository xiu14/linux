package com.mammon.audiosdk.enums;

import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreTokenType {
    TOKEN_TO_B(0),
    TOKEN_TO_C_D(1),
    TOKEN_TO_B_MIXED(2);

    public static final HashMap<Integer, SAMICoreTokenType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreTokenType[] values = values();
        for (int i = 0; i < 3; i++) {
            SAMICoreTokenType sAMICoreTokenType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreTokenType.getValue()), sAMICoreTokenType);
        }
    }

    SAMICoreTokenType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreTokenType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
