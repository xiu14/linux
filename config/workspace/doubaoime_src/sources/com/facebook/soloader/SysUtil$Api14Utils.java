package com.facebook.soloader;

import android.annotation.TargetApi;
import dalvik.system.BaseDexClassLoader;

@e
@TargetApi(14)
/* loaded from: classes2.dex */
public class SysUtil$Api14Utils {
    public static String a() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e2) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e2);
            }
        }
        StringBuilder M = e.a.a.a.a.M("ClassLoader ");
        M.append(classLoader.getClass().getName());
        M.append(" should be of type BaseDexClassLoader");
        throw new IllegalStateException(M.toString());
    }
}
