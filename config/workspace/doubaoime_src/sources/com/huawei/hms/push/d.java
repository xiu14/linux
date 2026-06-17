package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class d {
    private static final Object a = new Object();
    private static int b = -1;

    private static boolean a(Context context) {
        StringBuilder M = e.a.a.a.a.M("existFrameworkPush:");
        M.append(b);
        HMSLog.d("CommFun", M.toString());
        try {
            File file = new File("/system/framework/hwpush.jar");
            if (a()) {
                HMSLog.d("CommFun", "push jarFile is exist");
            } else {
                if (!file.isFile()) {
                    return false;
                }
                HMSLog.d("CommFun", "push jarFile is exist");
            }
            return true;
        } catch (Exception e2) {
            StringBuilder M2 = e.a.a.a.a.M("get Apk version faild ,Exception e= ");
            M2.append(e2.toString());
            HMSLog.e("CommFun", M2.toString());
            return false;
        }
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean c() {
        return HwBuildEx.VERSION.EMUI_SDK_INT < 19;
    }

    public static boolean d(Context context) {
        StringBuilder M = e.a.a.a.a.M("existFrameworkPush:");
        M.append(b);
        HMSLog.d("CommFun", M.toString());
        synchronized (a) {
            int i = b;
            if (-1 != i) {
                return 1 == i;
            }
            if (a(context)) {
                b = 1;
            } else {
                b = 0;
            }
            return 1 == b;
        }
    }

    public static String c(Context context) {
        return ((com.huawei.b.g.e.c) com.huawei.b.g.a.d(context)).a("client/project_id");
    }

    public static boolean b() {
        return HwBuildEx.VERSION.EMUI_SDK_INT >= 21;
    }

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("huawei.cust.HwCfgFilePolicy");
            File file = (File) cls.getDeclaredMethod("getCfgFile", String.class, Integer.TYPE).invoke(cls, "jars/hwpush.jar", Integer.valueOf(((Integer) cls.getDeclaredField("CUST_TYPE_CONFIG").get(cls)).intValue()));
            if (file != null && file.exists()) {
                HMSLog.d("CommFun", "get push cust File path success.");
                return true;
            }
        } catch (ClassNotFoundException unused) {
            HMSLog.e("CommFun", "HwCfgFilePolicy ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HMSLog.e("CommFun", "check cust exist push IllegalAccessException.");
        } catch (IllegalArgumentException unused3) {
            HMSLog.e("CommFun", "check cust exist push IllegalArgumentException.");
        } catch (NoSuchFieldException unused4) {
            HMSLog.e("CommFun", "check cust exist push NoSuchFieldException.");
        } catch (NoSuchMethodException unused5) {
            HMSLog.e("CommFun", "check cust exist push NoSuchMethodException.");
        } catch (SecurityException unused6) {
            HMSLog.e("CommFun", "check cust exist push SecurityException.");
        } catch (InvocationTargetException unused7) {
            HMSLog.e("CommFun", "check cust exist push InvocationTargetException.");
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        return jSONObject == null || (TextUtils.isEmpty(str) && jSONObject2 == null);
    }
}
