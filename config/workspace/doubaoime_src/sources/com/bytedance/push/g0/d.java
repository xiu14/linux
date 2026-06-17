package com.bytedance.push.g0;

import com.google.gson.Gson;

/* loaded from: classes2.dex */
public class d {
    private static final Gson a = new Gson();

    public static <T> T a(String str, Class<T> cls) {
        try {
            return (T) a.c(str, cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Object obj) {
        try {
            return a.j(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
