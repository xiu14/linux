package com.mammon.audiosdk.enums;

import java.util.HashMap;

/* loaded from: classes2.dex */
public enum SAMICoreAbConfigType {
    UnknownType(0),
    IntType(1),
    FloatType(2),
    StringType(3),
    BoolType(4);

    public static final HashMap<Integer, SAMICoreAbConfigType> intToEnumMap = new HashMap<>();
    private int value;

    static {
        SAMICoreAbConfigType[] values = values();
        for (int i = 0; i < 5; i++) {
            SAMICoreAbConfigType sAMICoreAbConfigType = values[i];
            intToEnumMap.put(Integer.valueOf(sAMICoreAbConfigType.getValue()), sAMICoreAbConfigType);
        }
    }

    SAMICoreAbConfigType(int i) {
        this.value = 0;
        this.value = i;
    }

    public static SAMICoreAbConfigType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public int getValue() {
        return this.value;
    }
}
