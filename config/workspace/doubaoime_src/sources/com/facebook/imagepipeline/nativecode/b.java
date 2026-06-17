package com.facebook.imagepipeline.nativecode;

/* loaded from: classes2.dex */
public class b {
    private static boolean a;

    public static synchronized void a() {
        synchronized (b.class) {
            if (!a) {
                com.facebook.soloader.r.a.c("native-imagetranscoder");
                a = true;
            }
        }
    }
}
