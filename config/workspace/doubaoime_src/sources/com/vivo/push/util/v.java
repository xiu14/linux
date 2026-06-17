package com.vivo.push.util;

import android.os.UserHandle;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class v {
    private static int a = -1;

    public static int a() {
        int i = a;
        if (i != -1) {
            return i;
        }
        try {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            declaredMethod.setAccessible(true);
            a = ((Integer) declaredMethod.invoke(null, null)).intValue();
            t.d("MultiUserManager", "getMyUserId = " + a);
            return a;
        } catch (Exception e2) {
            e.a.a.a.a.h0(e2, new StringBuilder("getMyUserId error "), "MultiUserManager");
            return 0;
        }
    }
}
