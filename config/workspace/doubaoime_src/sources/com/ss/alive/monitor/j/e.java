package com.ss.alive.monitor.j;

/* loaded from: classes2.dex */
class e {
    static void a(boolean z, String str, Object... objArr) {
        if (z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
