package com.obric.oui.status;

import kotlin.s.c.g;

/* loaded from: classes2.dex */
public enum StatusSpec {
    EMPTY(0),
    LOADING(1);

    public static final a Companion = new a(null);
    private final int value;

    public static final class a {
        public a(g gVar) {
        }
    }

    StatusSpec(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
