package com.obric.oui.status;

import kotlin.s.c.g;

/* loaded from: classes2.dex */
public enum SizeSpec {
    LARGE(0),
    MEDIUM(1),
    SMALL(2);

    public static final a Companion = new a(null);
    private final int value;

    public static final class a {
        public a(g gVar) {
        }
    }

    SizeSpec(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
