package com.bytedance.crash;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    NATIVE_CUSTOMIZE("ensure_zip"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    GAME("game"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    CJAVA("cjava"),
    COREDUMP("coredump"),
    EVENT(NotificationCompat.CATEGORY_EVENT),
    ALL("all"),
    UNKNOWN("unknown");

    private final String mName;

    CrashType(String str) {
        this.mName = str;
    }

    public static CrashType getType(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Throwable unused) {
            return UNKNOWN;
        }
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}
