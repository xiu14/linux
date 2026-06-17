package com.google.gson;

/* loaded from: classes2.dex */
public interface ReflectionAccessFilter {

    public enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    FilterResult a(Class<?> cls);
}
