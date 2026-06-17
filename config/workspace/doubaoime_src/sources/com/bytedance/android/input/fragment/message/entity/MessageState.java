package com.bytedance.android.input.fragment.message.entity;

import kotlin.s.c.g;

/* loaded from: classes.dex */
public enum MessageState {
    UNREAD(0),
    READ(1),
    DELETED(2);

    public static final a Companion = new a(null);
    private final int code;

    public static final class a {
        public a(g gVar) {
        }
    }

    MessageState(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
