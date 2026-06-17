package com.bytedance.memory.shrink;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum BaseType {
    OBJECT(2, 0),
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);

    private static Map<Integer, BaseType> sTypeMap = new HashMap();
    private int mId;
    private int mSize;

    static {
        BaseType[] values = values();
        for (int i = 0; i < 9; i++) {
            BaseType baseType = values[i];
            sTypeMap.put(Integer.valueOf(baseType.mId), baseType);
        }
    }

    BaseType(int i, int i2) {
        this.mId = i;
        this.mSize = i2;
    }

    public static String getClassNameOfPrimitiveArray(BaseType baseType) {
        switch (baseType.ordinal()) {
            case 1:
                return "boolean[]";
            case 2:
                return "char[]";
            case 3:
                return "float[]";
            case 4:
                return "double[]";
            case 5:
                return "byte[]";
            case 6:
                return "short[]";
            case 7:
                return "int[]";
            case 8:
                return "long[]";
            default:
                throw new IllegalArgumentException("OBJECT type is not a primitive type");
        }
    }

    public static BaseType getType(int i) {
        return sTypeMap.get(Integer.valueOf(i));
    }

    public int getSize(int i) {
        int i2 = this.mSize;
        return i2 != 0 ? i2 : i;
    }

    public int getTypeId() {
        return this.mId;
    }
}
