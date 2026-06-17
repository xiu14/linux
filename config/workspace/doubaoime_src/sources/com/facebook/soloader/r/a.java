package com.facebook.soloader.r;

/* loaded from: classes2.dex */
public class a {
    private static b a;

    private a() {
    }

    public static synchronized void a(b bVar) {
        synchronized (a.class) {
            if (a != null) {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
            a = bVar;
        }
    }

    public static synchronized boolean b() {
        boolean z;
        synchronized (a.class) {
            z = a != null;
        }
        return z;
    }

    public static boolean c(String str) {
        return d(str, 0);
    }

    public static boolean d(String str, int i) {
        b bVar;
        synchronized (a.class) {
            bVar = a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i);
    }
}
