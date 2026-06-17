package com.bytedance.android.input.constants;

import kotlin.s.c.g;

/* loaded from: classes.dex */
public enum DoubleSpellType {
    DEFAULT("DEFAULT"),
    XH("XH"),
    ZRM("ZRM");

    public static final a Companion = new a(null);
    private final String doubleSpellName;

    public static final class a {
        public a(g gVar) {
        }
    }

    DoubleSpellType(String str) {
        this.doubleSpellName = str;
    }

    public final String getDoubleSpellName() {
        return this.doubleSpellName;
    }
}
