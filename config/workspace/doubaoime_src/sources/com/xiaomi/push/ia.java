package com.xiaomi.push;

/* loaded from: classes2.dex */
public enum ia {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* renamed from: a, reason: collision with other field name */
    private final int f597a;

    ia(int i) {
        this.f597a = i;
    }

    public int a() {
        return this.f597a;
    }

    public static ia a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }
}
