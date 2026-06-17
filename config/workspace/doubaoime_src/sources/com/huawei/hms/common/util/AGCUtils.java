package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.agconnect.core.c.d;
import com.huawei.b.c;
import com.huawei.b.e;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class AGCUtils {
    /* JADX WARN: Removed duplicated region for block: B:6:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "Get "
            java.lang.String r1 = ""
            java.lang.String r2 = "AGCUtils"
            r3 = 0
            com.huawei.b.e r4 = new com.huawei.b.e     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            r4.<init>()     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            java.lang.String r6 = "agconnect-services.json"
            java.io.InputStream r3 = r5.open(r6)     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            r4.b(r3)     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            com.huawei.b.d r7 = r4.a(r7)     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            com.huawei.b.g.e.b r7 = (com.huawei.b.g.e.b) r7     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            java.lang.String r7 = r7.a(r8)     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L2c
            goto L64
        L28:
            r7 = move-exception
            goto L88
        L2a:
            r7 = move-exception
            goto L2e
        L2c:
            r7 = move-exception
            goto L49
        L2e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
            r4.append(r0)     // Catch: java.lang.Throwable -> L28
            r4.append(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = " with AGConnectServicesConfig failed: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L28
            r4.append(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L28
            com.huawei.hms.support.log.HMSLog.e(r2, r7)     // Catch: java.lang.Throwable -> L28
            goto L63
        L49:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
            r4.append(r0)     // Catch: java.lang.Throwable -> L28
            r4.append(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = " failed: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L28
            r4.append(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L28
            com.huawei.hms.support.log.HMSLog.e(r2, r7)     // Catch: java.lang.Throwable -> L28
        L63:
            r7 = r1
        L64:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L6e
            return r7
        L6e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = " is null."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.hms.support.log.HMSLog.e(r2, r7)
            return r1
        L88:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            return valueOf.startsWith("cpid=") ? valueOf.substring(5) : valueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e2) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e2);
            return "";
        }
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) {
        if (context == null) {
            HMSLog.w("AGCUtils", "getAppId context is null");
            return "";
        }
        String str = null;
        if (c(context)) {
            str = a(context, "client/app_id");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        try {
            c c2 = d.c();
            if (c2.a() != context) {
                c2 = d.d(new e().a(context));
            }
            str = c2.b().a("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a = a(context);
        return !TextUtils.isEmpty(a) ? a : a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        if (context == null) {
            HMSLog.w("AGCUtils", "getCpId context is null");
            return "";
        }
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        String str = null;
        try {
            c c2 = d.c();
            if (c2.a() != context) {
                c2 = d.d(new e().a(context));
            }
            str = c2.b().a("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b = b(context);
        return !TextUtils.isEmpty(b) ? b : a(context, "client/cp_id");
    }

    private static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get(Constants.HUAWEI_HMS_CLIENT_APPID)) != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
            }
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e2) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e2);
            return "";
        }
    }
}
