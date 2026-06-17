package com.bytedance.common.utility;

import android.util.Pair;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {
    private static e a = new c();

    public static class a {
        public boolean a;
    }

    public static e b() {
        return a;
    }

    public static void e(e eVar) {
        if (eVar != a) {
            a = eVar;
        }
    }

    public abstract String a(String str, Map<String, String> map, a aVar) throws Exception;

    public abstract String c(String str, List<Pair<String, String>> list, Map<String, String> map, a aVar) throws com.bytedance.common.utility.a;

    public abstract String d(String str, byte[] bArr, Map<String, String> map, a aVar) throws com.bytedance.common.utility.a;
}
