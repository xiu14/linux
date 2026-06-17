package com.bytedance.services.apm.api;

import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private static IEnsure a;

    public static void a() {
        IEnsure iEnsure = a;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere();
    }

    public static void b(String str) {
        IEnsure iEnsure = a;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(str);
    }

    public static void c(String str, Map<String, String> map) {
        IEnsure iEnsure = a;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(str, map);
    }

    public static void d(Throwable th) {
        IEnsure iEnsure = a;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th);
    }

    public static void e(Throwable th, String str) {
        IEnsure iEnsure = a;
        if (iEnsure == null) {
            return;
        }
        iEnsure.ensureNotReachHere(th, str);
    }

    public static IEnsure f() {
        return a;
    }

    public static void g(IEnsure iEnsure) {
        a = iEnsure;
    }
}
