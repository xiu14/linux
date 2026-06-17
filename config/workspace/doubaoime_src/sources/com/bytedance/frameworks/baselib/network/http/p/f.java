package com.bytedance.frameworks.baselib.network.http.p;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class f {
    private static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f5236c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static boolean a(String str) {
        try {
            return a.matcher(str).matches();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        try {
            return f5236c.matcher(str).matches();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        try {
            return b.matcher(str).matches();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
