package com.bytedance.crash;

/* loaded from: classes.dex */
public enum CustomizeExceptionType {
    XASAN("xasan"),
    HEAP_TRACKER("heap_tracker"),
    FD_TRACKER("fd_tracker"),
    VM_MONITOR("vm_monitor"),
    TLS_MONITOR("tls_monitor"),
    REF_MONITOR("ref_monitor"),
    PRIO_MONITOR("priority_monitor"),
    MAX("max");

    private final String mName;

    CustomizeExceptionType(String str) {
        this.mName = str;
    }

    public static CustomizeExceptionType getType(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Throwable unused) {
            return MAX;
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
