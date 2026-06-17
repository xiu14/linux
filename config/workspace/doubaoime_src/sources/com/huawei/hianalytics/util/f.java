package com.huawei.hianalytics.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class f {

    private static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    private static Object a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        String str2;
        if (clsArr == null) {
            if (objArr != null) {
                throw new a("paramsType is null, but params is not null");
            }
        } else {
            if (objArr == null) {
                throw new a("paramsType or params should be same");
            }
            if (clsArr.length != objArr.length) {
                throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
        }
        try {
        } catch (NoSuchMethodException unused) {
            com.huawei.hianalytics.g.b.c("globalStreamUtil", "invokeStaticFun(): cls.getMethod(),No Such Method !");
        }
        try {
            return cls.getMethod(str, clsArr).invoke(null, objArr);
        } catch (IllegalAccessException unused2) {
            str2 = "invokeStaticFun(): method invoke Exception!";
            com.huawei.hianalytics.g.b.c("globalStreamUtil", str2);
            return null;
        } catch (IllegalArgumentException unused3) {
            str2 = "invokeStaticFun(): Illegal Argument!";
            com.huawei.hianalytics.g.b.c("globalStreamUtil", str2);
            return null;
        } catch (InvocationTargetException unused4) {
            str2 = "invokeStaticFun(): Invocation Target Exception!";
            com.huawei.hianalytics.g.b.c("globalStreamUtil", str2);
            return null;
        }
    }

    public static String a() {
        String b = b("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        com.huawei.hianalytics.g.b.b("globalStreamUtil", "SystemPropertiesEx: get rom_ver: " + b);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String str = Build.DISPLAY;
        com.huawei.hianalytics.g.b.b("globalStreamUtil", "SystemProperties: get rom_ver: " + str);
        return str;
    }

    public static String a(InputStream inputStream, int i) {
        com.huawei.hianalytics.util.a aVar = new com.huawei.hianalytics.util.a(i);
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            aVar.a(bArr, read);
        }
        return aVar.a() == 0 ? "" : new String(aVar.b(), "UTF-8");
    }

    public static String a(String str, String str2) {
        return b(str, str2);
    }

    public static void a(int i, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                com.huawei.hianalytics.g.b.c("globalStreamUtil", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static boolean a(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (context.checkSelfPermission(str) == 0) {
            return false;
        }
        com.huawei.hianalytics.g.b.c("HianalyticsSDK", "not have read phone permission!");
        return true;
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String b = b("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(b) ? b("com.huawei.android.os.SystemPropertiesEx", str, str2) : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]
            r4 = 0
            r3[r4] = r0
            r5 = 1
            r3[r5] = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r7
            r0[r5] = r8
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: com.huawei.hianalytics.util.f.a -> L1c java.lang.ClassNotFoundException -> L1f
            java.lang.Object r6 = a(r6, r1, r3, r0)     // Catch: com.huawei.hianalytics.util.f.a -> L1c java.lang.ClassNotFoundException -> L1f
            goto L27
        L1c:
            java.lang.String r6 = "invokeStaticFun(): Static function call Exception "
            goto L21
        L1f:
            java.lang.String r6 = "invokeStaticFun() Not found class!"
        L21:
            java.lang.String r7 = "globalStreamUtil"
            com.huawei.hianalytics.g.b.c(r7, r6)
            r6 = 0
        L27:
            if (r6 == 0) goto L2c
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
        L2c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.util.f.b(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
