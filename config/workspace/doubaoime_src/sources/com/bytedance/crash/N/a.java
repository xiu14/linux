package com.bytedance.crash.N;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private final Map<String, Object> a = new HashMap();

    a() {
        Context g2 = C0652g.g();
        if (g2 == null) {
            return;
        }
        Properties properties = new Properties();
        try {
            properties.load(g2.getAssets().open("slardar.properties"));
            for (Map.Entry entry : properties.entrySet()) {
                this.a.put(String.valueOf(entry.getKey()), entry.getValue());
            }
        } catch (Exception unused) {
        }
    }

    @NonNull
    public static Map<String, Object> a() {
        if (b == null) {
            b = new a();
        }
        return b.a;
    }

    @NonNull
    public static String b() {
        if (b == null) {
            b = new a();
        }
        Object obj = b.a.get("release_build");
        if (obj == null) {
            return "invalid";
        }
        String valueOf = String.valueOf(obj);
        return valueOf.length() >= 16 ? valueOf : "invalid";
    }
}
