package com.ss.android.d.a;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class a {
    private static com.ss.android.d.d.a a;

    public static final com.ss.android.d.d.a a() {
        com.ss.android.d.d.a aVar = a;
        if (aVar != null) {
            return aVar;
        }
        try {
            Method declaredMethod = Class.forName("com.ss.android.anywheredoor.core.AnyDoorServiceImpl").getDeclaredMethod("inst", new Class[0]);
            declaredMethod.setAccessible(true);
            a = (com.ss.android.d.d.a) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return a;
    }
}
