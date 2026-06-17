package com.bytedance.bdinstall;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.Closeable;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e0 {
    private static String a;
    private static volatile Boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f3977c = "0123456789ABCDEF".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3978d = 0;

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f3977c;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            if (str.charAt(i) != '0') {
                break;
            }
            i++;
        }
        return !z;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void d(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            synchronized (com.bytedance.bdinstall.k0.m.class) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException unused) {
            int i = C0640u.a;
        }
    }

    public static boolean e(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || (str != null && str.equals(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(android.content.Context r6) {
        /*
            java.lang.Boolean r0 = com.bytedance.bdinstall.e0.b
            if (r0 != 0) goto Ld9
            java.lang.String r0 = "context is null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = com.bytedance.bdinstall.e0.a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L13
            goto Lcb
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L27
            java.lang.String r0 = android.app.Application.getProcessName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L27
            com.bytedance.bdinstall.e0.a = r0
            goto Lcb
        L27:
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "currentProcessName"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L48
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L48
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L48
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L48
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
            r1 = r0
        L49:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L54
            com.bytedance.bdinstall.e0.a = r1
            r0 = r1
            goto Lcb
        L54:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L7d
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch: java.lang.Exception -> L7d
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L7d
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L7d
        L68:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L7d
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Exception -> L7d
            int r4 = r3.pid     // Catch: java.lang.Exception -> L7d
            if (r4 != r1) goto L68
            java.lang.String r1 = r3.processName     // Catch: java.lang.Exception -> L7d
            com.bytedance.bdinstall.e0.a = r1     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r1 = move-exception
            r1.printStackTrace()
        L81:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lc1
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lc1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r4.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc1
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lc1
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lc1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lc1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r2.<init>()     // Catch: java.lang.Throwable -> Lc2
        Lb1:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> Lc2
            if (r3 <= 0) goto Lbc
            char r3 = (char) r3     // Catch: java.lang.Throwable -> Lc2
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc2
            goto Lb1
        Lbc:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lc2
            goto Lc4
        Lc1:
            r1 = r0
        Lc2:
            if (r1 == 0) goto Lc7
        Lc4:
            r1.close()     // Catch: java.lang.Exception -> Lc7
        Lc7:
            com.bytedance.bdinstall.e0.a = r0
            int r1 = com.bytedance.bdinstall.C0640u.a
        Lcb:
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = android.text.TextUtils.equals(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.bytedance.bdinstall.e0.b = r6
        Ld9:
            java.lang.Boolean r6 = com.bytedance.bdinstall.e0.b
            boolean r6 = r6.booleanValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.e0.f(android.content.Context):boolean");
    }

    public static boolean g(String str) {
        int length = str != null ? str.length() : 0;
        if (length < 13 || length > 128) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }

    public static void h(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    public static void i(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z = false;
        for (String str : strArr) {
            if (sharedPreferences.contains(str)) {
                edit.remove(str);
                z = true;
            }
        }
        if (z) {
            edit.apply();
        }
    }

    static void j(boolean z) {
        b = Boolean.valueOf(z);
    }
}
