package com.xiaomi.push;

/* loaded from: classes2.dex */
public enum ib {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);


    /* renamed from: a, reason: collision with other field name */
    private final int f599a;

    ib(int i) {
        this.f599a = i;
    }

    public static ib a(int i) {
        if (i == 1) {
            return INT;
        }
        if (i == 2) {
            return LONG;
        }
        if (i == 3) {
            return STRING;
        }
        if (i != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
