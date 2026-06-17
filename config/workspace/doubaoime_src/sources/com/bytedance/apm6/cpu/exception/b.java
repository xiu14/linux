package com.bytedance.apm6.cpu.exception;

import java.util.Iterator;

/* loaded from: classes.dex */
public class b {
    private static String a;

    public static String a() {
        return a;
    }

    public static void b(String str) {
        a = str;
    }

    public static boolean c() {
        a = com.bytedance.apm6.cpu.a.c().b();
        return false;
    }

    public static boolean d(com.bytedance.apm6.cpu.b.c cVar, double d2, boolean z) {
        double d3;
        double d4;
        if (z) {
            if (cVar.a().isEmpty()) {
                d4 = 0.0d;
            } else {
                Iterator<String> it2 = com.bytedance.apm6.cpu.a.c().a().iterator();
                d4 = 0.0d;
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (cVar.a().containsKey(next)) {
                        double doubleValue = cVar.a().get(next).doubleValue();
                        if (doubleValue >= 0.0d && d4 <= doubleValue) {
                            d4 = doubleValue;
                        }
                    }
                }
            }
            if (d4 <= 0.0d) {
                d4 = cVar.c();
            }
            return d2 > d4;
        }
        if (cVar.b().isEmpty()) {
            d3 = 0.0d;
        } else {
            Iterator<String> it3 = com.bytedance.apm6.cpu.a.c().a().iterator();
            d3 = 0.0d;
            while (it3.hasNext()) {
                String next2 = it3.next();
                if (cVar.b().containsKey(next2)) {
                    double doubleValue2 = cVar.b().get(next2).doubleValue();
                    if (doubleValue2 >= 0.0d && d3 <= doubleValue2) {
                        d3 = doubleValue2;
                    }
                }
            }
        }
        if (d3 <= 0.0d) {
            d3 = cVar.d();
        }
        return d2 > d3;
    }
}
