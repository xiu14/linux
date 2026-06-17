package com.ttnet.org.chromium.net.impl;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ttnet.org.chromium.net.impl.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0768h {
    private static Map<String, CronetUrlRequest> a = new ConcurrentHashMap();

    public static void a(String str, CronetUrlRequest cronetUrlRequest) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a.put(str, cronetUrlRequest);
    }

    public static CronetUrlRequest b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a.get(str);
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a.remove(str);
    }
}
