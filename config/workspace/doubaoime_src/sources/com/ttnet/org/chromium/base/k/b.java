package com.ttnet.org.chromium.base.k;

/* loaded from: classes2.dex */
public class b {
    private static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void b(String str, boolean z) {
        ((a) d.a()).b(str, z);
    }

    public static void c(String str, long j) {
        ((a) d.a()).c(str, a(j), a(1L), a(com.heytap.mcssdk.constant.a.q), 50);
    }
}
