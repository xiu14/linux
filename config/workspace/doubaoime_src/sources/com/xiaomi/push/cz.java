package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class cz {

    /* renamed from: a, reason: collision with other field name */
    private static final List<String> f236a = Arrays.asList("001", "002", "003", "004", "005");
    private static Boolean a = null;

    public static void a(String str, String str2) {
    }

    public static boolean a(Context context) {
        if (a == null) {
            try {
                if (!k.m655a(context)) {
                    a = Boolean.FALSE;
                }
                String m833a = com.xiaomi.push.service.v.m833a(context);
                if (TextUtils.isEmpty(m833a) || m833a.length() < 3) {
                    a = Boolean.FALSE;
                } else {
                    a = Boolean.valueOf(f236a.contains(m833a.substring(m833a.length() - 3)));
                }
                a("Sampling statistical connection quality: " + a);
            } catch (Throwable th) {
                a = Boolean.FALSE;
                e.a.a.a.a.w0("Determine sampling switch error: ", th, "Push-ConnectionQualityStatsHelper");
            }
        }
        return a.booleanValue();
    }

    static void a(String str) {
        a("Push-ConnectionQualityStatsHelper", str);
    }
}
