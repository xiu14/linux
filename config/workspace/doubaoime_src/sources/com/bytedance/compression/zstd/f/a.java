package com.bytedance.compression.zstd.f;

/* loaded from: classes.dex */
public class a {
    private static boolean a = false;

    public static synchronized void a() {
        synchronized (a.class) {
            if (a) {
                return;
            }
            System.loadLibrary("bdzstd");
            a = true;
        }
    }
}
