package com.huawei.hms.hatool;

import android.util.Pair;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class k extends u0 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            d0.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                d0 d0Var = d0.SN;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                d0 d0Var2 = d0.IMEI;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                d0 d0Var3 = d0.UDID;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected static f0 a(String str, String str2, String str3, String str4) {
        f0 a2 = u0.a(str, str2, str3, str4);
        String a3 = j.a().a(a1.c(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String b = com.huawei.e.a.a.a.b.b.b(q0.f() + a3 + currentTimeMillis);
        a2.f(String.valueOf(currentTimeMillis));
        a2.g(b);
        return a2;
    }

    public static h1 a(List<b1> list, String str, String str2, String str3, String str4) {
        h1 b = u0.b(str, str2);
        if (b == null) {
            return null;
        }
        b.a(a(m1.d().a(), str, str2, str3));
        b.a(a(str, str2));
        b.a(a(str2, str, str4));
        b.a(a1.g(str, str2));
        b.a(list);
        return b;
    }

    protected static l a(String str, String str2) {
        l a2 = u0.a(str, str2);
        i c2 = j.a().c(str, str2);
        a2.g(j.a().a(a1.c(str, str2)));
        a2.f(a1.o(str, str2));
        a2.c(j.a().f(str, str2));
        int i = a.a[c2.a().ordinal()];
        if (i == 1) {
            a2.d(c2.b());
        } else if (i == 2) {
            a2.b(c2.b());
        } else if (i == 3) {
            a2.e(c2.b());
        }
        return a2;
    }

    protected static y0 a(String str, String str2, String str3) {
        y0 a2 = u0.a(str, str2, str3);
        Pair<String, String> e2 = j.a().e(str2, str);
        a2.f((String) e2.first);
        a2.g((String) e2.second);
        a2.h(o.b());
        a2.d(j.a().d(str2, str));
        return a2;
    }

    public static Map<String, String> b(String str, String str2, String str3) {
        Map<String, String> c2 = u0.c(str, str3);
        Map<String, String> i = a1.i(str, str2);
        if (i == null) {
            return c2;
        }
        c2.putAll(i);
        return c2;
    }
}
