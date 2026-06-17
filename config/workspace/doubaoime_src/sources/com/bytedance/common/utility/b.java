package com.bytedance.common.utility;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public final class b {
    private static Boolean a;

    static {
        new HashMap();
    }

    public static boolean a() {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if ((invoke instanceof String) && !com.bytedance.android.input.k.b.a.Y((String) invoke)) {
                if (!"unknown".equals((String) invoke)) {
                    z = true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        a = Boolean.valueOf(z);
        return z;
    }
}
