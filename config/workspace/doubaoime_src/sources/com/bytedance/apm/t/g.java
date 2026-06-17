package com.bytedance.apm.t;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ConcurrentModificationException;
import java.util.HashSet;

/* loaded from: classes.dex */
public class g {
    private static HashSet<String> a = new HashSet<>();
    private static String b = "";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3533c = true;

    public static void a(String str) {
        f3533c = true;
        a.add(str);
    }

    public static String b() {
        String sb;
        if (f3533c) {
            try {
                HashSet<String> hashSet = a;
                if (hashSet == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z = true;
                    for (String str : hashSet) {
                        if (z) {
                            z = false;
                        } else {
                            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        sb2.append(str.toString());
                    }
                    sb = sb2.toString();
                }
                b = sb;
                f3533c = false;
            } catch (ConcurrentModificationException unused) {
            }
        }
        return b;
    }

    public static void c(String str) {
        f3533c = true;
        a.remove(str);
    }
}
