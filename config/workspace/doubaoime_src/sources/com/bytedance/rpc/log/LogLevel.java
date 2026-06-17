package com.bytedance.rpc.log;

/* loaded from: classes2.dex */
public enum LogLevel {
    NONE(0),
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6);

    private int mLevel;

    LogLevel(int i) {
        this.mLevel = i;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public boolean log() {
        return this != NONE;
    }
}
