package com.facebook.imagepipeline.nativecode;

/* loaded from: classes2.dex */
public class c {
    private static boolean a;

    public static synchronized void a() {
        synchronized (c.class) {
            if (!a) {
                System.loadLibrary("static-webp");
                a = true;
            }
        }
    }
}
