package com.bytedance.crash.util;

import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public class c {
    private static c a;
    private static HashMap<String, String> b = new HashMap<>();

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONArray b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.c.b(java.lang.String):org.json.JSONArray");
    }
}
