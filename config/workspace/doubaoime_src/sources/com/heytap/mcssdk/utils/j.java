package com.heytap.mcssdk.utils;

import android.os.Binder;
import android.os.UserHandle;
import com.heytap.mcssdk.PushService;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class j {
    private static final String a = PushService.class.getSimpleName();
    private static final int b = 100000;

    public static int a() {
        try {
            UserHandle callingUserHandle = Binder.getCallingUserHandle();
            Method declaredMethod = callingUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(callingUserHandle, new Object[0])).intValue();
        } catch (Exception e2) {
            e.b(a, "get userId exception," + e2);
            return 0;
        }
    }

    public static int a(int i, int i2) {
        return (i % 100000) + (i2 * 100000);
    }
}
