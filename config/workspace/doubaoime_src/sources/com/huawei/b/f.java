package com.huawei.b;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f {
    private static final Map<String, a> a = new HashMap();

    public interface a {
        String a(d dVar);
    }

    public static Map<String, a> a() {
        return a;
    }

    public static void b(String str, a aVar) {
        a.put(str, aVar);
    }
}
